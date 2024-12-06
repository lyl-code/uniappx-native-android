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
import uts.sdk.modules.kuxUse.useCycleList;
open class GenPagesUseCycleListUseCycleList : BasePage {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesUseCycleListUseCycleList) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesUseCycleListUseCycleList;
            val _cache = __ins.renderCache;
            val list = ref(utsArrayOf<String>("Dog", "Cat", "Lizard", "Shark", "Whale", "Dolphin", "Octopus", "Seal"));
            val _useCycleList = useCycleList<UTSArray<String>>(list.value);
            val state = _useCycleList.state;
            val next = _useCycleList.next;
            val prev = _useCycleList.prev;
            return fun(): Any? {
                val _component_kux_page = resolveEasyComponent("kux-page", GenComponentsKuxPageKuxPageClass);
                return createVNode(_component_kux_page, utsMapOf("custom-class" to "px-3 py-3"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "flex items-center"), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "text-primary-5 text-2xl font-bold"), toDisplayString(unref(state)), 1),
                            createElementVNode("view", utsMapOf("class" to "mt-3 flex flex-row"), utsArrayOf(
                                createElementVNode("button", utsMapOf("size" to "mini", "type" to "primary", "class" to "bg-primary-5 font-bold", "onClick" to fun(){
                                    unref(prev)();
                                }
                                ), "Prev", 8, utsArrayOf(
                                    "onClick"
                                )),
                                createElementVNode("view", utsMapOf("class" to "mx-1")),
                                createElementVNode("button", utsMapOf("size" to "mini", "type" to "primary", "class" to "bg-primary-5 font-bold", "onClick" to fun(){
                                    unref(next)();
                                }
                                ), "Next", 8, utsArrayOf(
                                    "onClick"
                                ))
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
