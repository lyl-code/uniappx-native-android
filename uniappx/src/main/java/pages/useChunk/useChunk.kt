@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME", "UNUSED_ANONYMOUS_PARAMETER")
package uni.UNI7854722;
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
import io.dcloud.uniapp.extapi.hideLoading as uni_hideLoading;
import io.dcloud.uniapp.extapi.showLoading as uni_showLoading;
import uts.sdk.modules.kuxUse.useChunk;
open class GenPagesUseChunkUseChunk : BasePage {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesUseChunkUseChunk) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesUseChunkUseChunk;
            val _cache = __ins.renderCache;
            val list = ref(utsArrayOf<String>());
            val pageSize: Number = 10;
            val loading = ref(true);
            val _useChunk = useChunk(list, pageSize);
            val currentChunk = _useChunk.currentChunk;
            val isLoading = _useChunk.isLoading;
            val loadMore = _useChunk.loadMore;
            val isDone = _useChunk.isDone;
            val showLoading = fun(){
                uni_showLoading(ShowLoadingOptions(title = "加载中"));
            }
            ;
            if (loading.value) {
                showLoading();
            }
            val onTapLoadMore = fun(){
                if (isDone.value) {
                    return;
                }
                showLoading();
                setTimeout(fun(){
                    loadMore();
                    uni_hideLoading();
                }
                , 800);
            }
            ;
            setTimeout(fun(){
                val data = utsArrayOf(
                    "测试1",
                    "测试2",
                    "测试3",
                    "测试4",
                    "测试5",
                    "测试6",
                    "测试7",
                    "测试8",
                    "测试9",
                    "测试10",
                    "测试11",
                    "测试12",
                    "测试13",
                    "测试14",
                    "测试15",
                    "测试16",
                    "测试17",
                    "测试18",
                    "测试19",
                    "测试20",
                    "测试21",
                    "测试22",
                    "测试23",
                    "测试24",
                    "测试25",
                    "测试26",
                    "测试27",
                    "测试28",
                    "测试29",
                    "测试30"
                );
                data.forEach(fun(item){
                    list.value.push(item);
                }
                );
                uni_hideLoading();
            }
            , 1000);
            val stopIsLoadingWatch = watch(isLoading, fun(newValue: Boolean){
                if (newValue) {
                    uni_showLoading(ShowLoadingOptions(title = "新数据加载中"));
                } else {
                    uni_hideLoading();
                }
            }
            );
            onBeforeUnmount(fun(){
                stopIsLoadingWatch();
            }
            );
            return fun(): Any? {
                val _component_kux_link_card = resolveEasyComponent("kux-link-card", GenComponentsKuxLinkCardKuxLinkCardClass);
                val _component_kux_page = resolveEasyComponent("kux-page", GenComponentsKuxPageKuxPageClass);
                return createVNode(_component_kux_page, utsMapOf("custom-class" to "px-3 py-3"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createElementVNode("scroll-view", utsMapOf("direction" to "vertical", "class" to "py-1", "style" to normalizeStyle(utsMapOf("height" to "500px")), "onScrolltolower" to onTapLoadMore), utsArrayOf(
                            createElementVNode(Fragment, null, RenderHelpers.renderList(unref(currentChunk), fun(item, __key, __index, _cached): Any {
                                return createVNode(_component_kux_link_card, utsMapOf("text" to item, "arrow" to false), null, 8, utsArrayOf(
                                    "text"
                                ));
                            }
                            ), 256)
                        ), 36)
                    );
                }
                ), "_" to 1));
            }
            ;
        }
        ;
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(), utsArrayOf(
                    GenApp.styles
                ));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
