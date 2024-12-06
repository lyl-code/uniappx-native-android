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
import uts.sdk.modules.kuxUse.useCloned;
open class GenPagesUseClonedUseCloned : BasePage {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesUseClonedUseCloned) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesUseClonedUseCloned;
            val _cache = __ins.renderCache;
            val template = Template(fruit = "banana", drink = "water");
            val _useCloned = useCloned(template);
            val cloned = _useCloned.cloned;
            val sync = _useCloned.sync;
            val clonedValue = JSON.parseObject<Template>(JSON.stringify(cloned.value))!!;
            val fruit = ref(clonedValue.fruit);
            val drink = ref(clonedValue.drink);
            val handleReset = fun(){
                sync();
                fruit.value = clonedValue.fruit;
                drink.value = clonedValue.drink;
            }
            ;
            return fun(): Any? {
                val _component_kux_page = resolveEasyComponent("kux-page", GenComponentsKuxPageKuxPageClass);
                return createVNode(_component_kux_page, utsMapOf("custom-class" to "px-3 py-3"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createElementVNode("input", utsMapOf("class" to "px-3 py-1 bg-grey-2 rounded-base mb-3", "modelValue" to unref(fruit), "onInput" to fun(`$event`: InputEvent){
                            trySetRefValue(fruit, `$event`.detail.value);
                        }
                        , "type" to "text"), null, 40, utsArrayOf(
                            "modelValue"
                        )),
                        createElementVNode("input", utsMapOf("class" to "px-3 py-1 bg-grey-2 rounded-base", "modelValue" to unref(drink), "onInput" to fun(`$event`: InputEvent){
                            trySetRefValue(drink, `$event`.detail.value);
                        }
                        , "type" to "text"), null, 40, utsArrayOf(
                            "modelValue"
                        )),
                        createElementVNode("view", utsMapOf("class" to "flex flex-row justify-start"), utsArrayOf(
                            createElementVNode("button", utsMapOf("class" to "mt-3 bg-primary-5", "type" to "primary", "onClick" to handleReset), "reset")
                        ))
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
