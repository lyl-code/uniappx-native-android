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
open class GenPagesIndexIndex : BasePage {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _cache = this.`$`.renderCache;
        val _component_kux_title = resolveEasyComponent("kux-title", GenComponentsKuxTitleKuxTitleClass);
        val _component_kux_link_card = resolveEasyComponent("kux-link-card", GenComponentsKuxLinkCardKuxLinkCardClass);
        val _component_kux_page = resolveEasyComponent("kux-page", GenComponentsKuxPageKuxPageClass);
        return createVNode(_component_kux_page, utsMapOf("custom-class" to "px-3 py-3"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
            return utsArrayOf(
                createVNode(_component_kux_title, utsMapOf("title" to "工具类.")),
                createVNode(_component_kux_link_card, utsMapOf("text" to "useCounter", "url" to "/pages/useCounter/useCounter")),
                createVNode(_component_kux_link_card, utsMapOf("text" to "useChunk", "url" to "/pages/useChunk/useChunk")),
                createVNode(_component_kux_link_card, utsMapOf("text" to "useLoading", "url" to "/pages/useLoading/useLoading")),
                createVNode(_component_kux_link_card, utsMapOf("text" to "useCloned", "url" to "/pages/useCloned/useCloned")),
                createVNode(_component_kux_link_card, utsMapOf("text" to "useCycleList", "url" to "/pages/useCycleList/useCycleList"))
            );
        }
        ), "_" to 1));
    }
    companion object {
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
