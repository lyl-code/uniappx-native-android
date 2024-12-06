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
import uts.sdk.modules.kuxUse.UseCounterOptions;
import uts.sdk.modules.kuxUse.useCounter;
open class GenPagesUseCounterUseCounter : BasePage {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesUseCounterUseCounter) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesUseCounterUseCounter;
            val _cache = __ins.renderCache;
            val _useCounter = useCounter(0, UseCounterOptions(min = 0, max = 100));
            val count = _useCounter.count;
            val inc = _useCounter.inc;
            val dec = _useCounter.dec;
            val set = _useCounter.set;
            val reset = _useCounter.reset;
            return fun(): Any? {
                val _component_kux_page = resolveEasyComponent("kux-page", GenComponentsKuxPageKuxPageClass);
                return createVNode(_component_kux_page, utsMapOf("custom-class" to "px-3 py-3"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "flex"), utsArrayOf(
                            createElementVNode("view", utsMapOf("class" to "flex flex-row justify-center mb-3"), utsArrayOf(
                                createElementVNode("text", utsMapOf("class" to "text-2xl"), toDisplayString(unref(count)), 1)
                            )),
                            createElementVNode("button", utsMapOf("type" to "primary", "class" to "mb-2", "onClick" to fun(){
                                unref(inc)(1);
                            }
                            ), "增加", 8, utsArrayOf(
                                "onClick"
                            )),
                            createElementVNode("button", utsMapOf("type" to "primary", "class" to "mb-2", "onClick" to fun(){
                                unref(dec)(1);
                            }
                            ), "减少", 8, utsArrayOf(
                                "onClick"
                            )),
                            createElementVNode("button", utsMapOf("type" to "primary", "class" to "mb-2", "onClick" to fun(){
                                unref(inc)(5);
                            }
                            ), "增加（+5)", 8, utsArrayOf(
                                "onClick"
                            )),
                            createElementVNode("button", utsMapOf("type" to "primary", "class" to "mb-2", "onClick" to fun(){
                                unref(dec)(5);
                            }
                            ), "减少（-5)", 8, utsArrayOf(
                                "onClick"
                            )),
                            createElementVNode("button", utsMapOf("type" to "primary", "class" to "mb-2", "onClick" to fun(){
                                unref(set)(100);
                            }
                            ), "设置值（100)", 8, utsArrayOf(
                                "onClick"
                            )),
                            createElementVNode("button", utsMapOf("type" to "primary", "class" to "mb-2", "onClick" to fun(){
                                unref(reset)(0);
                            }
                            ), "重置值", 8, utsArrayOf(
                                "onClick"
                            ))
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
