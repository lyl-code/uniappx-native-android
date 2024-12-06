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
import uts.sdk.modules.kuxUse.useLoading;
open class GenPagesUseLoadingUseLoading : BasePage {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesUseLoadingUseLoading) -> Any? = fun(__props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesUseLoadingUseLoading;
            val _cache = __ins.renderCache;
            val _useLoading = useLoading(true);
            val loading = _useLoading.loading;
            val toggle = _useLoading.toggle;
            val showLoading = fun(){
                if (loading.value) {
                    uni_showLoading(ShowLoadingOptions(title = "加载中"));
                } else {
                    uni_hideLoading();
                }
            }
            ;
            val onChange = fun(_event: UniRadioGroupChangeEvent){
                toggle();
                showLoading();
            }
            ;
            onLoad(fun(_){
                showLoading();
            }
            );
            return fun(): Any? {
                val _component_radio = resolveComponent("radio");
                val _component_radio_group = resolveComponent("radio-group");
                val _component_kux_page = resolveEasyComponent("kux-page", GenComponentsKuxPageKuxPageClass);
                return createVNode(_component_kux_page, utsMapOf("custom-class" to "px-3 py-3"), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                    return utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "flex-row justify-between"), utsArrayOf(
                            createElementVNode("view", null, "loading状态"),
                            createVNode(_component_radio_group, utsMapOf("class" to "flex flex-row", "onChange" to onChange), utsMapOf("default" to withSlotCtx(fun(): UTSArray<Any> {
                                return utsArrayOf(
                                    createElementVNode("view", utsMapOf("class" to "flex-row items-center"), utsArrayOf(
                                        createVNode(_component_radio, utsMapOf("value" to "1", "checked" to unref(loading)), null, 8, utsArrayOf(
                                            "checked"
                                        )),
                                        createElementVNode("text", null, "打开")
                                    )),
                                    createElementVNode("view", utsMapOf("class" to "flex-row items-center"), utsArrayOf(
                                        createVNode(_component_radio, utsMapOf("value" to "0", "checked" to !unref(loading)), null, 8, utsArrayOf(
                                            "checked"
                                        )),
                                        createElementVNode("text", null, "关闭")
                                    ))
                                );
                            }
                            ), "_" to 1))
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
