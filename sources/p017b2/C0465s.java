package p017b2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import p017b2.AbstractC0446a;

/* renamed from: b2.s */
/* loaded from: classes.dex */
public class C0465s {

    /* renamed from: a */
    public static final AbstractC0446a.b f2190a = new AbstractC0446a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* renamed from: b */
    public static final AbstractC0446a.b f2191b = new AbstractC0446a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* renamed from: c */
    public static final AbstractC0446a.e f2192c = new AbstractC0446a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* renamed from: d */
    public static final AbstractC0446a.c f2193d = new AbstractC0446a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* renamed from: e */
    public static final AbstractC0446a.f f2194e = new AbstractC0446a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* renamed from: f */
    @Deprecated
    public static final AbstractC0446a.f f2195f = new AbstractC0446a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: g */
    @Deprecated
    public static final AbstractC0446a.f f2196g = new AbstractC0446a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: h */
    public static final AbstractC0446a.f f2197h = new AbstractC0446a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* renamed from: i */
    public static final AbstractC0446a.f f2198i = new AbstractC0446a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* renamed from: j */
    public static final AbstractC0446a.f f2199j = new AbstractC0446a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* renamed from: k */
    public static final AbstractC0446a.c f2200k = new AbstractC0446a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* renamed from: l */
    public static final AbstractC0446a.c f2201l = new AbstractC0446a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* renamed from: m */
    public static final AbstractC0446a.c f2202m = new AbstractC0446a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* renamed from: n */
    public static final AbstractC0446a.c f2203n = new AbstractC0446a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* renamed from: o */
    public static final AbstractC0446a.c f2204o = new AbstractC0446a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* renamed from: p */
    public static final AbstractC0446a.c f2205p = new AbstractC0446a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* renamed from: q */
    public static final AbstractC0446a.b f2206q = new AbstractC0446a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* renamed from: r */
    public static final AbstractC0446a.b f2207r = new AbstractC0446a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* renamed from: s */
    public static final AbstractC0446a.c f2208s = new AbstractC0446a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* renamed from: t */
    public static final AbstractC0446a.f f2209t = new AbstractC0446a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* renamed from: u */
    public static final AbstractC0446a.c f2210u = new AbstractC0446a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* renamed from: v */
    public static final AbstractC0446a.b f2211v = new AbstractC0446a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* renamed from: w */
    public static final AbstractC0446a.b f2212w = new AbstractC0446a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* renamed from: x */
    public static final AbstractC0446a.f f2213x = new AbstractC0446a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* renamed from: y */
    public static final AbstractC0446a.f f2214y = new AbstractC0446a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* renamed from: z */
    public static final AbstractC0446a.f f2215z = new AbstractC0446a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");

    /* renamed from: A */
    public static final AbstractC0446a.b f2166A = new AbstractC0446a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");

    /* renamed from: B */
    public static final AbstractC0446a.b f2167B = new AbstractC0446a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");

    /* renamed from: C */
    public static final AbstractC0446a.b f2168C = new AbstractC0446a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");

    /* renamed from: D */
    public static final AbstractC0446a.b f2169D = new AbstractC0446a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");

    /* renamed from: E */
    public static final AbstractC0446a.b f2170E = new AbstractC0446a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");

    /* renamed from: F */
    public static final AbstractC0446a.b f2171F = new AbstractC0446a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");

    /* renamed from: G */
    public static final AbstractC0446a.e f2172G = new AbstractC0446a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");

    /* renamed from: H */
    public static final AbstractC0446a.e f2173H = new AbstractC0446a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");

    /* renamed from: I */
    public static final AbstractC0446a.h f2174I = new AbstractC0446a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");

    /* renamed from: J */
    public static final AbstractC0446a.h f2175J = new AbstractC0446a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");

    /* renamed from: K */
    public static final AbstractC0446a.g f2176K = new AbstractC0446a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");

    /* renamed from: L */
    public static final AbstractC0446a.h f2177L = new AbstractC0446a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");

    /* renamed from: M */
    public static final AbstractC0446a.d f2178M = new AbstractC0446a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");

    /* renamed from: N */
    public static final AbstractC0446a.d f2179N = new AbstractC0446a.d("SUPPRESS_ERROR_PAGE", "SUPPRESS_ERROR_PAGE");

    /* renamed from: O */
    public static final AbstractC0446a.d f2180O = new AbstractC0446a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");

    /* renamed from: P */
    public static final AbstractC0446a.d f2181P = new AbstractC0446a.d("FORCE_DARK", "FORCE_DARK");

    /* renamed from: Q */
    public static final AbstractC0446a.d f2182Q = new AbstractC0446a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");

    /* renamed from: R */
    public static final AbstractC0446a.d f2183R = new AbstractC0446a.d("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");

    /* renamed from: S */
    public static final AbstractC0446a.d f2184S = new AbstractC0446a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");

    /* renamed from: T */
    public static final AbstractC0446a.d f2185T = new AbstractC0446a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");

    /* renamed from: U */
    public static final AbstractC0446a.d f2186U = new AbstractC0446a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");

    /* renamed from: V */
    public static final AbstractC0446a.d f2187V = new AbstractC0446a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");

    /* renamed from: W */
    public static final AbstractC0446a.d f2188W = new AbstractC0446a.d("REQUESTED_WITH_HEADER_CONTROL", "REQUESTED_WITH_HEADER_CONTROL");

    /* renamed from: X */
    public static final AbstractC0446a.d f2189X = new AbstractC0446a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* renamed from: a */
    public static UnsupportedOperationException m2367a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    /* renamed from: b */
    public static boolean m2368b(String str) {
        return m2369c(str, AbstractC0446a.m2290e());
    }

    /* renamed from: c */
    public static <T extends InterfaceC0454h> boolean m2369c(String str, Collection<T> collection) {
        HashSet hashSet = new HashSet();
        for (T t10 : collection) {
            if (t10.mo2291a().equals(str)) {
                hashSet.add(t10);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((InterfaceC0454h) it.next()).mo2292b()) {
                return true;
            }
        }
        return false;
    }
}
