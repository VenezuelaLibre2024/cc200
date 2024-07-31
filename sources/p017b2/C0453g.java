package p017b2;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;
import p004a2.AbstractC0041k;

/* renamed from: b2.g */
/* loaded from: classes.dex */
public class C0453g {
    @Deprecated
    /* renamed from: a */
    public static int m2346a(WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    /* renamed from: b */
    public static WebViewRenderProcess m2347b(WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    /* renamed from: c */
    public static WebViewRenderProcessClient m2348c(WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @Deprecated
    /* renamed from: d */
    public static void m2349d(WebSettings webSettings, int i10) {
        webSettings.setForceDark(i10);
    }

    /* renamed from: e */
    public static void m2350e(WebView webView, AbstractC0041k abstractC0041k) {
        webView.setWebViewRenderProcessClient(abstractC0041k != null ? new C0471y(abstractC0041k) : null);
    }

    /* renamed from: f */
    public static void m2351f(WebView webView, Executor executor, AbstractC0041k abstractC0041k) {
        webView.setWebViewRenderProcessClient(executor, abstractC0041k != null ? new C0471y(abstractC0041k) : null);
    }

    /* renamed from: g */
    public static boolean m2352g(WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }
}
