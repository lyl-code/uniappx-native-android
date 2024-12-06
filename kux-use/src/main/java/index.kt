@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uts.sdk.modules.kuxUse;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
open class UseChunkReturn<T> (
    @JsonNotNull
    open var currentChunk: Ref<UTSArray<T>>,
    @JsonNotNull
    open var isLoading: Ref<Boolean>,
    @JsonNotNull
    open var isDone: Ref<Boolean>,
    open var loadMore: () -> Unit,
) : UTSObject()
open class UseCounterOptions (
    open var min: Number? = null,
    open var max: Number? = null,
) : UTSObject()
open class UseCounterReturn (
    @JsonNotNull
    open var count: Ref<Number>,
    open var inc: (delta: Number?) -> Unit,
    open var dec: (delta: Number?) -> Unit,
    @JsonNotNull
    open var get: ComputedRefImpl<Number>,
    open var set: (value: Number) -> Unit,
    open var reset: (delta: Number?) -> Unit,
) : UTSObject()
open class UseLoadingReturn (
    @JsonNotNull
    open var loading: Ref<Boolean>,
    open var setLoading: (loading: Boolean) -> Unit,
    open var toggle: () -> Unit,
) : UTSObject()
open class UseClonedOptions<T> (
    open var clone: ((source: T) -> T)? = null,
    open var manual: Boolean? = false,
    open var deep: Boolean? = true,
    open var immediate: Boolean? = true,
) : UTSObject()
open class UseClonedReturn<T> (
    @JsonNotNull
    open var cloned: Ref<T?>,
    open var sync: () -> Unit,
) : UTSObject()
fun <T> useChunk(data: Ref<UTSArray<T>>, chunkSize: Number): UseChunkReturn<T> {
    val currentPage = ref(1);
    val isLoading = ref(false);
    val isDone = ref(false);
    val items = data;
    val paginatedItems = ref(utsArrayOf<T>());
    val initialize = fun(){
        paginatedItems.value = items.value.slice(0, chunkSize);
    }
    ;
    initialize();
    val loadMore = fun(){
        if (isLoading.value) {
            return;
        }
        val start = paginatedItems.value.length;
        val end = start + chunkSize;
        paginatedItems.value = paginatedItems.value.concat(items.value.slice(start, end));
        if (end >= items.value.length) {
            isDone.value = true;
            return;
        }
        isLoading.value = true;
        currentPage.value++;
        isLoading.value = false;
    }
    ;
    val update = fun(newItems: Ref<UTSArray<T>>){
        items.value = newItems.value;
        currentPage.value = 1;
        initialize();
    }
    ;
    val stopItemsWatch = watch(data, fun(newItems: Any){
        val arr = ref(newItems as UTSArray<T>);
        update(arr);
    }
    , WatchOptions(deep = true));
    onBeforeUnmount(fun(){
        stopItemsWatch();
    }
    );
    return UseChunkReturn(currentChunk = paginatedItems, isLoading = isLoading, loadMore = loadMore, isDone = isDone);
}
val MAX_SAFE_INTEGER: Number = 9007199254740991;
val MIN_SAFE_INTEGER: Number = -9007199254740991;
fun useCounter(initialValue: Number?, options: UseCounterOptions?): UseCounterReturn {
    val count = ref(initialValue ?: 0);
    val min = options?.min ?: MIN_SAFE_INTEGER;
    val max = options?.max ?: MAX_SAFE_INTEGER;
    val inc = fun(delta: Number?){
        count.value = Math.min(count.value + (delta ?: 1), max);
    }
    ;
    val dec = fun(delta: Number?){
        count.value = Math.max(count.value - (delta ?: 1), min);
    }
    ;
    val set = fun(value: Number){
        count.value = Math.min(Math.max(value, min), max);
    }
    ;
    val get = computed<Number>(fun(): Number {
        return count.value;
    }
    );
    val reset = fun(value: Number?){
        set(value ?: count.value);
    }
    ;
    return UseCounterReturn(count = count, inc = inc, dec = dec, set = set, get = get, reset = reset);
}
fun useLoading(loading: Boolean): UseLoadingReturn {
    val currentLoading = ref(loading);
    val setLoading = fun(loading: Boolean){
        currentLoading.value = loading;
    }
    ;
    val toggle = fun(){
        currentLoading.value = !currentLoading.value;
    }
    ;
    return UseLoadingReturn(loading = currentLoading, setLoading = setLoading, toggle = toggle);
}
fun <T> toValue(r: T): T {
    return if (UTSAndroid.`typeof`( r) === "function") {
        (r as () -> T)();
    } else {
        unref(r);
    }
    ;
}
fun <T> cloneFnJSON(source: T): T {
    return JSON.parse(JSON.stringify(source))!! as T;
}
fun <T> useCloned(source: T, options: UseClonedOptions<T> = UseClonedOptions()): UseClonedReturn<Any> {
    val cloned = ref<Any?>(null);
    val sync = fun(){
        if (options.clone != null && UTSAndroid.`typeof`( options.clone) === "function") {
            cloned.value = (options.clone as (source: T) -> T)(toValue(source));
        } else {
            cloned.value = JSON.parse<Any>(JSON.stringify(toValue(source)));
        }
    }
    ;
    if (options.manual != null && options.manual === false && (isRef(source) || UTSAndroid.`typeof`( source) === "function")) {
        watch(source as Any, fun(_: Any){
            sync();
        }, WatchOptions(deep = options.deep ?: false, immediate = options.immediate ?: false));
    } else {
        sync();
    }
    return UseClonedReturn(cloned = cloned, sync = sync);
}
