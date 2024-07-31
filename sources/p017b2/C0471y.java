package p017b2;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import p004a2.AbstractC0041k;

/* renamed from: b2.y */
/* loaded from: classes.dex */
public class C0471y extends WebViewRenderProcessClient {

    /* renamed from: a */
    public AbstractC0041k f2231a;

    public C0471y(AbstractC0041k abstractC0041k) {
        this.f2231a = abstractC0041k;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f2231a.onRenderProcessResponsive(webView, C0472z.m2380b(webViewRenderProcess));
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f2231a.onRenderProcessUnresponsive(webView, C0472z.m2380b(webViewRenderProcess));
    }
}
