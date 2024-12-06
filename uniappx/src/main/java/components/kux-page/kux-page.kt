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
open class GenComponentsKuxPageKuxPage : VueComponent {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    open var customStyle: UTSJSONObject by `$props`;
    open var customClass: Any by `$props`;
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenComponentsKuxPageKuxPage) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenComponentsKuxPageKuxPage;
            val _cache = __ins.renderCache;
            return fun(): Any? {
                return createElementVNode("scroll-view", utsMapOf("style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to normalizeClass(utsArrayOf(
                        "flex-1",
                        utsArrayOf(
                            _ctx.customClass
                        )
                    )), "style" to normalizeStyle(_ctx.customStyle)), utsArrayOf(
                        renderSlot(_ctx.`$slots`, "default")
                    ), 6)
                ), 4);
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
        var props = normalizePropsOptions(utsMapOf("customStyle" to utsMapOf("type" to "Object", "default" to fun(): UTSJSONObject {
            return (object : UTSJSONObject() {
                var backgroundColor = "#F5F5F5"
            });
        }
        ), "customClass" to utsMapOf("type" to utsArrayOf(
            "String",
            "Array"
        ), "default" to fun(): String {
            return "";
        }
        )));
        var propsNeedCastKeys = utsArrayOf(
            "customStyle",
            "customClass"
        );
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
