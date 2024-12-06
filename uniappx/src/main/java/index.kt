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
import io.dcloud.uniapp.extapi.exit as uni_exit;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
val runBlock1 = run {
    __uniConfig.getAppStyles = fun(): Map<String, Map<String, Map<String, Any>>> {
        return GenApp.styles;
    }
    ;
}
var firstBackTime: Number = 0;
open class GenApp : BaseApp {
    constructor(__ins: ComponentInternalInstance) : super(__ins) {
        onLaunch(fun(_: OnLaunchOptions) {
            console.log("App Launch");
        }
        , __ins);
        onAppShow(fun(_: OnShowOptions) {
            console.log("App Show");
        }
        , __ins);
        onAppHide(fun() {
            console.log("App Hide");
        }
        , __ins);
        onLastPageBackPress(fun() {
            console.log("App LastPageBackPress");
            if (firstBackTime == 0) {
                uni_showToast(ShowToastOptions(title = "再按一次退出应用", position = "bottom"));
                firstBackTime = Date.now();
                setTimeout(fun(){
                    firstBackTime = 0;
                }, 2000);
            } else if (Date.now() - firstBackTime < 2000) {
                firstBackTime = Date.now();
                uni_exit(null);
            }
        }
        , __ins);
        onExit(fun() {
            console.log("App Exit");
        }
        , __ins);
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("uni-row" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "uni-column" to padStyleMapOf(utsMapOf("flexDirection" to "column")), "bg-white" to padStyleMapOf(utsMapOf("backgroundColor" to "#FFFFFF")), "bg-grey-1" to padStyleMapOf(utsMapOf("backgroundColor" to "#f2f3f5")), "bg-grey-2" to padStyleMapOf(utsMapOf("backgroundColor" to "#e5e6eb")), "bg-primary-5" to padStyleMapOf(utsMapOf("!backgroundColor" to "#00BC79")), "border-none" to padStyleMapOf(utsMapOf("!borderWidth" to 0)), "grey-5" to padStyleMapOf(utsMapOf("color" to "#86909c")), "flex" to padStyleMapOf(utsMapOf("display" to "flex")), "flex-1" to padStyleMapOf(utsMapOf("flex" to 1)), "px-2" to padStyleMapOf(utsMapOf("paddingLeft" to 20, "paddingRight" to 20)), "px-3" to padStyleMapOf(utsMapOf("paddingLeft" to 30, "paddingRight" to 30)), "py-1" to padStyleMapOf(utsMapOf("paddingTop" to 10, "paddingBottom" to 10)), "py-2" to padStyleMapOf(utsMapOf("paddingTop" to 20, "paddingBottom" to 20)), "py-3" to padStyleMapOf(utsMapOf("paddingTop" to 30, "paddingBottom" to 30)), "mb-1" to padStyleMapOf(utsMapOf("marginBottom" to 10)), "mb-2" to padStyleMapOf(utsMapOf("marginBottom" to 20)), "mb-3" to padStyleMapOf(utsMapOf("marginBottom" to 30)), "mt-3" to padStyleMapOf(utsMapOf("marginTop" to 30)), "mx-1" to padStyleMapOf(utsMapOf("marginLeft" to 5, "marginRight" to 5)), "flex-row" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "justify-start" to padStyleMapOf(utsMapOf("justifyContent" to "flex-start")), "justify-center" to padStyleMapOf(utsMapOf("justifyContent" to "center")), "items-center" to padStyleMapOf(utsMapOf("alignItems" to "center")), "justify-between" to padStyleMapOf(utsMapOf("justifyContent" to "space-between")), "text-xs" to padStyleMapOf(utsMapOf("fontSize" to 10)), "text-sm" to padStyleMapOf(utsMapOf("fontSize" to 12)), "text-base" to padStyleMapOf(utsMapOf("fontSize" to 14)), "text-lg" to padStyleMapOf(utsMapOf("fontSize" to 16)), "text-xl" to padStyleMapOf(utsMapOf("fontSize" to 20)), "text-2xl" to padStyleMapOf(utsMapOf("fontSize" to 24)), "rounded-base" to padStyleMapOf(utsMapOf("borderRadius" to 10)), "font-bold" to padStyleMapOf(utsMapOf("fontWeight" to "bold")));
            }
    }
}
val GenAppClass = CreateVueAppComponent(GenApp::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "app", name = "", inheritAttrs = true, inject = Map(), props = Map(), propsNeedCastKeys = utsArrayOf(), emits = Map(), components = Map(), styles = GenApp.styles);
}
, fun(instance): GenApp {
    return GenApp(instance);
}
);
val GenComponentsKuxTitleKuxTitleClass = CreateVueComponent(GenComponentsKuxTitleKuxTitle::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenComponentsKuxTitleKuxTitle.inheritAttrs, inject = GenComponentsKuxTitleKuxTitle.inject, props = GenComponentsKuxTitleKuxTitle.props, propsNeedCastKeys = GenComponentsKuxTitleKuxTitle.propsNeedCastKeys, emits = GenComponentsKuxTitleKuxTitle.emits, components = GenComponentsKuxTitleKuxTitle.components, styles = GenComponentsKuxTitleKuxTitle.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenComponentsKuxTitleKuxTitle.setup(props as GenComponentsKuxTitleKuxTitle);
    }
    );
}
, fun(instance): GenComponentsKuxTitleKuxTitle {
    return GenComponentsKuxTitleKuxTitle(instance);
}
);
open class IconsDataItem (
    @JsonNotNull
    open var font_class: String,
    @JsonNotNull
    open var unicode: String,
) : UTSObject()
val fontData = utsArrayOf<IconsDataItem>(IconsDataItem(font_class = "arrow-down", unicode = "\ue6be"), IconsDataItem(font_class = "arrow-left", unicode = "\ue6bc"), IconsDataItem(font_class = "arrow-right", unicode = "\ue6bb"), IconsDataItem(font_class = "arrow-up", unicode = "\ue6bd"), IconsDataItem(font_class = "auth", unicode = "\ue6ab"), IconsDataItem(font_class = "auth-filled", unicode = "\ue6cc"), IconsDataItem(font_class = "back", unicode = "\ue6b9"), IconsDataItem(font_class = "bars", unicode = "\ue627"), IconsDataItem(font_class = "calendar", unicode = "\ue6a0"), IconsDataItem(font_class = "calendar-filled", unicode = "\ue6c0"), IconsDataItem(font_class = "camera", unicode = "\ue65a"), IconsDataItem(font_class = "camera-filled", unicode = "\ue658"), IconsDataItem(font_class = "cart", unicode = "\ue631"), IconsDataItem(font_class = "cart-filled", unicode = "\ue6d0"), IconsDataItem(font_class = "chat", unicode = "\ue65d"), IconsDataItem(font_class = "chat-filled", unicode = "\ue659"), IconsDataItem(font_class = "chatboxes", unicode = "\ue696"), IconsDataItem(font_class = "chatboxes-filled", unicode = "\ue692"), IconsDataItem(font_class = "chatbubble", unicode = "\ue697"), IconsDataItem(font_class = "chatbubble-filled", unicode = "\ue694"), IconsDataItem(font_class = "checkbox", unicode = "\ue62b"), IconsDataItem(font_class = "checkbox-filled", unicode = "\ue62c"), IconsDataItem(font_class = "checkmarkempty", unicode = "\ue65c"), IconsDataItem(font_class = "circle", unicode = "\ue65b"), IconsDataItem(font_class = "circle-filled", unicode = "\ue65e"), IconsDataItem(font_class = "clear", unicode = "\ue66d"), IconsDataItem(font_class = "close", unicode = "\ue673"), IconsDataItem(font_class = "closeempty", unicode = "\ue66c"), IconsDataItem(font_class = "cloud-download", unicode = "\ue647"), IconsDataItem(font_class = "cloud-download-filled", unicode = "\ue646"), IconsDataItem(font_class = "cloud-upload", unicode = "\ue645"), IconsDataItem(font_class = "cloud-upload-filled", unicode = "\ue648"), IconsDataItem(font_class = "color", unicode = "\ue6cf"), IconsDataItem(font_class = "color-filled", unicode = "\ue6c9"), IconsDataItem(font_class = "compose", unicode = "\ue67f"), IconsDataItem(font_class = "contact", unicode = "\ue693"), IconsDataItem(font_class = "contact-filled", unicode = "\ue695"), IconsDataItem(font_class = "down", unicode = "\ue6b8"), IconsDataItem(font_class = "bottom", unicode = "\ue6b8"), IconsDataItem(font_class = "download", unicode = "\ue68d"), IconsDataItem(font_class = "download-filled", unicode = "\ue681"), IconsDataItem(font_class = "email", unicode = "\ue69e"), IconsDataItem(font_class = "email-filled", unicode = "\ue69a"), IconsDataItem(font_class = "eye", unicode = "\ue651"), IconsDataItem(font_class = "eye-filled", unicode = "\ue66a"), IconsDataItem(font_class = "eye-slash", unicode = "\ue6b3"), IconsDataItem(font_class = "eye-slash-filled", unicode = "\ue6b4"), IconsDataItem(font_class = "fire", unicode = "\ue6a1"), IconsDataItem(font_class = "fire-filled", unicode = "\ue6c5"), IconsDataItem(font_class = "flag", unicode = "\ue65f"), IconsDataItem(font_class = "flag-filled", unicode = "\ue660"), IconsDataItem(font_class = "folder-add", unicode = "\ue6a9"), IconsDataItem(font_class = "folder-add-filled", unicode = "\ue6c8"), IconsDataItem(font_class = "font", unicode = "\ue6a3"), IconsDataItem(font_class = "forward", unicode = "\ue6ba"), IconsDataItem(font_class = "gear", unicode = "\ue664"), IconsDataItem(font_class = "gear-filled", unicode = "\ue661"), IconsDataItem(font_class = "gift", unicode = "\ue6a4"), IconsDataItem(font_class = "gift-filled", unicode = "\ue6c4"), IconsDataItem(font_class = "hand-down", unicode = "\ue63d"), IconsDataItem(font_class = "hand-down-filled", unicode = "\ue63c"), IconsDataItem(font_class = "hand-up", unicode = "\ue63f"), IconsDataItem(font_class = "hand-up-filled", unicode = "\ue63e"), IconsDataItem(font_class = "headphones", unicode = "\ue630"), IconsDataItem(font_class = "heart", unicode = "\ue639"), IconsDataItem(font_class = "heart-filled", unicode = "\ue641"), IconsDataItem(font_class = "help", unicode = "\ue679"), IconsDataItem(font_class = "help-filled", unicode = "\ue674"), IconsDataItem(font_class = "home", unicode = "\ue662"), IconsDataItem(font_class = "home-filled", unicode = "\ue663"), IconsDataItem(font_class = "image", unicode = "\ue670"), IconsDataItem(font_class = "image-filled", unicode = "\ue678"), IconsDataItem(font_class = "images", unicode = "\ue650"), IconsDataItem(font_class = "images-filled", unicode = "\ue64b"), IconsDataItem(font_class = "info", unicode = "\ue669"), IconsDataItem(font_class = "info-filled", unicode = "\ue649"), IconsDataItem(font_class = "left", unicode = "\ue6b7"), IconsDataItem(font_class = "link", unicode = "\ue6a5"), IconsDataItem(font_class = "list", unicode = "\ue644"), IconsDataItem(font_class = "location", unicode = "\ue6ae"), IconsDataItem(font_class = "location-filled", unicode = "\ue6af"), IconsDataItem(font_class = "locked", unicode = "\ue66b"), IconsDataItem(font_class = "locked-filled", unicode = "\ue668"), IconsDataItem(font_class = "loop", unicode = "\ue633"), IconsDataItem(font_class = "mail-open", unicode = "\ue643"), IconsDataItem(font_class = "mail-open-filled", unicode = "\ue63a"), IconsDataItem(font_class = "map", unicode = "\ue667"), IconsDataItem(font_class = "map-filled", unicode = "\ue666"), IconsDataItem(font_class = "map-pin", unicode = "\ue6ad"), IconsDataItem(font_class = "map-pin-ellipse", unicode = "\ue6ac"), IconsDataItem(font_class = "medal", unicode = "\ue6a2"), IconsDataItem(font_class = "medal-filled", unicode = "\ue6c3"), IconsDataItem(font_class = "mic", unicode = "\ue671"), IconsDataItem(font_class = "mic-filled", unicode = "\ue677"), IconsDataItem(font_class = "micoff", unicode = "\ue67e"), IconsDataItem(font_class = "micoff-filled", unicode = "\ue6b0"), IconsDataItem(font_class = "minus", unicode = "\ue66f"), IconsDataItem(font_class = "minus-filled", unicode = "\ue67d"), IconsDataItem(font_class = "more", unicode = "\ue64d"), IconsDataItem(font_class = "more-filled", unicode = "\ue64e"), IconsDataItem(font_class = "navigate", unicode = "\ue66e"), IconsDataItem(font_class = "navigate-filled", unicode = "\ue67a"), IconsDataItem(font_class = "notification", unicode = "\ue6a6"), IconsDataItem(font_class = "notification-filled", unicode = "\ue6c1"), IconsDataItem(font_class = "paperclip", unicode = "\ue652"), IconsDataItem(font_class = "paperplane", unicode = "\ue672"), IconsDataItem(font_class = "paperplane-filled", unicode = "\ue675"), IconsDataItem(font_class = "person", unicode = "\ue699"), IconsDataItem(font_class = "person-filled", unicode = "\ue69d"), IconsDataItem(font_class = "personadd", unicode = "\ue69f"), IconsDataItem(font_class = "personadd-filled", unicode = "\ue698"), IconsDataItem(font_class = "personadd-filled-copy", unicode = "\ue6d1"), IconsDataItem(font_class = "phone", unicode = "\ue69c"), IconsDataItem(font_class = "phone-filled", unicode = "\ue69b"), IconsDataItem(font_class = "plus", unicode = "\ue676"), IconsDataItem(font_class = "plus-filled", unicode = "\ue6c7"), IconsDataItem(font_class = "plusempty", unicode = "\ue67b"), IconsDataItem(font_class = "pulldown", unicode = "\ue632"), IconsDataItem(font_class = "pyq", unicode = "\ue682"), IconsDataItem(font_class = "qq", unicode = "\ue680"), IconsDataItem(font_class = "redo", unicode = "\ue64a"), IconsDataItem(font_class = "redo-filled", unicode = "\ue655"), IconsDataItem(font_class = "refresh", unicode = "\ue657"), IconsDataItem(font_class = "refresh-filled", unicode = "\ue656"), IconsDataItem(font_class = "refreshempty", unicode = "\ue6bf"), IconsDataItem(font_class = "reload", unicode = "\ue6b2"), IconsDataItem(font_class = "right", unicode = "\ue6b5"), IconsDataItem(font_class = "scan", unicode = "\ue62a"), IconsDataItem(font_class = "search", unicode = "\ue654"), IconsDataItem(font_class = "settings", unicode = "\ue653"), IconsDataItem(font_class = "settings-filled", unicode = "\ue6ce"), IconsDataItem(font_class = "shop", unicode = "\ue62f"), IconsDataItem(font_class = "shop-filled", unicode = "\ue6cd"), IconsDataItem(font_class = "smallcircle", unicode = "\ue67c"), IconsDataItem(font_class = "smallcircle-filled", unicode = "\ue665"), IconsDataItem(font_class = "sound", unicode = "\ue684"), IconsDataItem(font_class = "sound-filled", unicode = "\ue686"), IconsDataItem(font_class = "spinner-cycle", unicode = "\ue68a"), IconsDataItem(font_class = "staff", unicode = "\ue6a7"), IconsDataItem(font_class = "staff-filled", unicode = "\ue6cb"), IconsDataItem(font_class = "star", unicode = "\ue688"), IconsDataItem(font_class = "star-filled", unicode = "\ue68f"), IconsDataItem(font_class = "starhalf", unicode = "\ue683"), IconsDataItem(font_class = "trash", unicode = "\ue687"), IconsDataItem(font_class = "trash-filled", unicode = "\ue685"), IconsDataItem(font_class = "tune", unicode = "\ue6aa"), IconsDataItem(font_class = "tune-filled", unicode = "\ue6ca"), IconsDataItem(font_class = "undo", unicode = "\ue64f"), IconsDataItem(font_class = "undo-filled", unicode = "\ue64c"), IconsDataItem(font_class = "up", unicode = "\ue6b6"), IconsDataItem(font_class = "top", unicode = "\ue6b6"), IconsDataItem(font_class = "upload", unicode = "\ue690"), IconsDataItem(font_class = "upload-filled", unicode = "\ue68e"), IconsDataItem(font_class = "videocam", unicode = "\ue68c"), IconsDataItem(font_class = "videocam-filled", unicode = "\ue689"), IconsDataItem(font_class = "vip", unicode = "\ue6a8"), IconsDataItem(font_class = "vip-filled", unicode = "\ue6c6"), IconsDataItem(font_class = "wallet", unicode = "\ue6b1"), IconsDataItem(font_class = "wallet-filled", unicode = "\ue6c2"), IconsDataItem(font_class = "weibo", unicode = "\ue68b"), IconsDataItem(font_class = "weixin", unicode = "\ue691"));
val GenUniModulesUniIconsComponentsUniIconsUniIconsClass = CreateVueComponent(GenUniModulesUniIconsComponentsUniIconsUniIcons::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = GenUniModulesUniIconsComponentsUniIconsUniIcons.name, inheritAttrs = GenUniModulesUniIconsComponentsUniIconsUniIcons.inheritAttrs, inject = GenUniModulesUniIconsComponentsUniIconsUniIcons.inject, props = GenUniModulesUniIconsComponentsUniIconsUniIcons.props, propsNeedCastKeys = GenUniModulesUniIconsComponentsUniIconsUniIcons.propsNeedCastKeys, emits = GenUniModulesUniIconsComponentsUniIconsUniIcons.emits, components = GenUniModulesUniIconsComponentsUniIconsUniIcons.components, styles = GenUniModulesUniIconsComponentsUniIconsUniIcons.styles);
}
, fun(instance): GenUniModulesUniIconsComponentsUniIconsUniIcons {
    return GenUniModulesUniIconsComponentsUniIconsUniIcons(instance);
}
);
val GenComponentsKuxLinkCardKuxLinkCardClass = CreateVueComponent(GenComponentsKuxLinkCardKuxLinkCard::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenComponentsKuxLinkCardKuxLinkCard.inheritAttrs, inject = GenComponentsKuxLinkCardKuxLinkCard.inject, props = GenComponentsKuxLinkCardKuxLinkCard.props, propsNeedCastKeys = GenComponentsKuxLinkCardKuxLinkCard.propsNeedCastKeys, emits = GenComponentsKuxLinkCardKuxLinkCard.emits, components = GenComponentsKuxLinkCardKuxLinkCard.components, styles = GenComponentsKuxLinkCardKuxLinkCard.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenComponentsKuxLinkCardKuxLinkCard.setup(props as GenComponentsKuxLinkCardKuxLinkCard);
    }
    );
}
, fun(instance): GenComponentsKuxLinkCardKuxLinkCard {
    return GenComponentsKuxLinkCardKuxLinkCard(instance);
}
);
val GenComponentsKuxPageKuxPageClass = CreateVueComponent(GenComponentsKuxPageKuxPage::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenComponentsKuxPageKuxPage.inheritAttrs, inject = GenComponentsKuxPageKuxPage.inject, props = GenComponentsKuxPageKuxPage.props, propsNeedCastKeys = GenComponentsKuxPageKuxPage.propsNeedCastKeys, emits = GenComponentsKuxPageKuxPage.emits, components = GenComponentsKuxPageKuxPage.components, styles = GenComponentsKuxPageKuxPage.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenComponentsKuxPageKuxPage.setup(props as GenComponentsKuxPageKuxPage);
    }
    );
}
, fun(instance): GenComponentsKuxPageKuxPage {
    return GenComponentsKuxPageKuxPage(instance);
}
);
val GenPagesIndexIndexClass = CreateVueComponent(GenPagesIndexIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesIndexIndex.inheritAttrs, inject = GenPagesIndexIndex.inject, props = GenPagesIndexIndex.props, propsNeedCastKeys = GenPagesIndexIndex.propsNeedCastKeys, emits = GenPagesIndexIndex.emits, components = GenPagesIndexIndex.components, styles = GenPagesIndexIndex.styles);
}
, fun(instance): GenPagesIndexIndex {
    return GenPagesIndexIndex(instance);
}
);
val GenPagesUseCounterUseCounterClass = CreateVueComponent(GenPagesUseCounterUseCounter::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUseCounterUseCounter.inheritAttrs, inject = GenPagesUseCounterUseCounter.inject, props = GenPagesUseCounterUseCounter.props, propsNeedCastKeys = GenPagesUseCounterUseCounter.propsNeedCastKeys, emits = GenPagesUseCounterUseCounter.emits, components = GenPagesUseCounterUseCounter.components, styles = GenPagesUseCounterUseCounter.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesUseCounterUseCounter.setup(props as GenPagesUseCounterUseCounter);
    }
    );
}
, fun(instance): GenPagesUseCounterUseCounter {
    return GenPagesUseCounterUseCounter(instance);
}
);
val GenPagesUseChunkUseChunkClass = CreateVueComponent(GenPagesUseChunkUseChunk::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUseChunkUseChunk.inheritAttrs, inject = GenPagesUseChunkUseChunk.inject, props = GenPagesUseChunkUseChunk.props, propsNeedCastKeys = GenPagesUseChunkUseChunk.propsNeedCastKeys, emits = GenPagesUseChunkUseChunk.emits, components = GenPagesUseChunkUseChunk.components, styles = GenPagesUseChunkUseChunk.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesUseChunkUseChunk.setup(props as GenPagesUseChunkUseChunk);
    }
    );
}
, fun(instance): GenPagesUseChunkUseChunk {
    return GenPagesUseChunkUseChunk(instance);
}
);
val GenPagesUseLoadingUseLoadingClass = CreateVueComponent(GenPagesUseLoadingUseLoading::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUseLoadingUseLoading.inheritAttrs, inject = GenPagesUseLoadingUseLoading.inject, props = GenPagesUseLoadingUseLoading.props, propsNeedCastKeys = GenPagesUseLoadingUseLoading.propsNeedCastKeys, emits = GenPagesUseLoadingUseLoading.emits, components = GenPagesUseLoadingUseLoading.components, styles = GenPagesUseLoadingUseLoading.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesUseLoadingUseLoading.setup(props as GenPagesUseLoadingUseLoading);
    }
    );
}
, fun(instance): GenPagesUseLoadingUseLoading {
    return GenPagesUseLoadingUseLoading(instance);
}
);
open class Template (
    @JsonNotNull
    open var fruit: String,
    @JsonNotNull
    open var drink: String,
) : UTSObject()
val GenPagesUseClonedUseClonedClass = CreateVueComponent(GenPagesUseClonedUseCloned::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUseClonedUseCloned.inheritAttrs, inject = GenPagesUseClonedUseCloned.inject, props = GenPagesUseClonedUseCloned.props, propsNeedCastKeys = GenPagesUseClonedUseCloned.propsNeedCastKeys, emits = GenPagesUseClonedUseCloned.emits, components = GenPagesUseClonedUseCloned.components, styles = GenPagesUseClonedUseCloned.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesUseClonedUseCloned.setup(props as GenPagesUseClonedUseCloned);
    }
    );
}
, fun(instance): GenPagesUseClonedUseCloned {
    return GenPagesUseClonedUseCloned(instance);
}
);
val GenPagesUseCycleListUseCycleListClass = CreateVueComponent(GenPagesUseCycleListUseCycleList::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesUseCycleListUseCycleList.inheritAttrs, inject = GenPagesUseCycleListUseCycleList.inject, props = GenPagesUseCycleListUseCycleList.props, propsNeedCastKeys = GenPagesUseCycleListUseCycleList.propsNeedCastKeys, emits = GenPagesUseCycleListUseCycleList.emits, components = GenPagesUseCycleListUseCycleList.components, styles = GenPagesUseCycleListUseCycleList.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesUseCycleListUseCycleList.setup(props as GenPagesUseCycleListUseCycleList);
    }
    );
}
, fun(instance): GenPagesUseCycleListUseCycleList {
    return GenPagesUseCycleListUseCycleList(instance);
}
);
fun createApp(): UTSJSONObject {
    val app = createSSRApp(GenAppClass);
    return UTSJSONObject(Map<String, Any?>(utsArrayOf(
        utsArrayOf(
            "app",
            app
        )
    )));
}
fun main(app: IApp) {
    definePageRoutes();
    defineAppConfig();
    (createApp()["app"] as VueApp).mount(app, GenUniApp());
}
open class UniAppConfig : io.dcloud.uniapp.appframe.AppConfig {
    override var name: String = "kux-use";
    override var appid: String = "__UNI__7854722";
    override var versionName: String = "1.0.0";
    override var versionCode: String = "100";
    override var uniCompilerVersion: String = "4.36";
    constructor() : super() {}
}
fun definePageRoutes() {
    __uniRoutes.push(UniPageRoute(path = "pages/index/index", component = GenPagesIndexIndexClass, meta = UniPageMeta(isQuit = true), style = utsMapOf()));
    __uniRoutes.push(UniPageRoute(path = "pages/useCounter/useCounter", component = GenPagesUseCounterUseCounterClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "useCounter", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/useChunk/useChunk", component = GenPagesUseChunkUseChunkClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "useChunk", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/useLoading/useLoading", component = GenPagesUseLoadingUseLoadingClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "useLoading", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/useCloned/useCloned", component = GenPagesUseClonedUseClonedClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "useCloned", "enablePullDownRefresh" to false)));
    __uniRoutes.push(UniPageRoute(path = "pages/useCycleList/useCycleList", component = GenPagesUseCycleListUseCycleListClass, meta = UniPageMeta(isQuit = false), style = utsMapOf("navigationBarTitleText" to "useCycleList")));
}
val __uniLaunchPage: Map<String, Any?> = utsMapOf("url" to "pages/index/index", "style" to utsMapOf<String, Any?>());
fun defineAppConfig() {
    __uniConfig.entryPagePath = "/pages/index/index";
    __uniConfig.globalStyle = utsMapOf("navigationBarTextStyle" to "black", "navigationBarTitleText" to "KuxUse", "navigationBarBackgroundColor" to "#F8F8F8", "backgroundColor" to "#F8F8F8");
    __uniConfig.getTabBarConfig = fun(): Map<String, Any>? {
        return null;
    }
    ;
    __uniConfig.tabBar = __uniConfig.getTabBarConfig();
    __uniConfig.conditionUrl = "";
    __uniConfig.uniIdRouter = utsMapOf();
    __uniConfig.ready = true;
}
open class GenUniApp : UniAppImpl() {
    open val vm: GenApp?
        get() {
            return getAppVm() as GenApp?;
        }
    open val `$vm`: GenApp?
        get() {
            return getAppVm() as GenApp?;
        }
}
fun getApp(): GenUniApp {
    return getUniApp() as GenUniApp;
}
