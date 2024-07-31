package p017b2;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: b2.d */
/* loaded from: classes.dex */
public class C0450d {
    /* renamed from: a */
    public static PackageInfo m2329a() {
        return WebView.getCurrentWebViewPackage();
    }

    /* renamed from: b */
    public static boolean m2330b(WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    /* renamed from: c */
    public static WebChromeClient m2331c(WebView webView) {
        return webView.getWebChromeClient();
    }

    /* renamed from: d */
    public static WebViewClient m2332d(WebView webView) {
        return webView.getWebViewClient();
    }

    /* renamed from: e */
    public static void m2333e(WebSettings webSettings, boolean z10) {
        webSettings.setSafeBrowsingEnabled(z10);
    }
}
