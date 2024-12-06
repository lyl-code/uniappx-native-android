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
import io.dcloud.uniapp.extapi.navigateTo as uni_navigateTo;
open class GenComponentsKuxLinkCardKuxLinkCard : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    open var url: String by `$props`;
    open var text: String by `$props`;
    open var arrow: Boolean by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenComponentsKuxLinkCardKuxLinkCard) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenComponentsKuxLinkCardKuxLinkCard;
            val _cache = __ins.renderCache;
            val props = __props;
            val to = fun(){
                if (props.url == "") {
                    return;
                }
                uni_navigateTo(NavigateToOptions(url = props.url, fail = fun(err){
                    console.warn(err.errMsg);
                }
                ));
            }
            ;
            return fun(): Any? {
                val _component_uni_icons = resolveEasyComponent("uni-icons", GenUniModulesUniIconsComponentsUniIconsUniIconsClass);
                return createElementVNode("view", utsMapOf("class" to "bg-white px-2 py-2 rounded-base justify-between items-center flex-row flex mb-1", "onClick" to to), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "text-xl font-bold"), toDisplayString(_ctx.text), 1),
                    if (isTrue(_ctx.arrow)) {
                        createVNode(_component_uni_icons, utsMapOf("key" to 0, "type" to "right", "size" to "24px", "color" to "rgba(0, 0, 0, 0.7)"));
                    } else {
                        createCommentVNode("v-if", true);
                    }
                ));
            }
            ;
        }
        ;
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf());
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf("url" to utsMapOf("type" to "String", "default" to fun(): String {
            return "";
        }
        ), "text" to utsMapOf("type" to "String", "default" to fun(): String {
            return "";
        }
        ), "arrow" to utsMapOf("type" to "Boolean", "default" to fun(): Boolean {
            return true;
        }
        )));
        var propsNeedCastKeys = utsArrayOf(
            "url",
            "text",
            "arrow"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
