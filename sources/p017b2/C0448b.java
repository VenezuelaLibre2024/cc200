package p017b2;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import p004a2.AbstractC0037g;
import p004a2.C0036f;
import p004a2.C0038h;

/* renamed from: b2.b */
/* loaded from: classes.dex */
public class C0448b {

    /* renamed from: b2.b$a */
    /* loaded from: classes.dex */
    public class a extends WebMessagePort.WebMessageCallback {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0037g.a f2148a;

        public a(AbstractC0037g.a aVar) {
            this.f2148a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f2148a.onMessage(new C0464r(webMessagePort), C0464r.m2363h(webMessage));
        }
    }

    /* renamed from: b2.b$b */
    /* loaded from: classes.dex */
    public class b extends WebMessagePort.WebMessageCallback {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0037g.a f2149a;

        public b(AbstractC0037g.a aVar) {
            this.f2149a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f2149a.onMessage(new C0464r(webMessagePort), C0464r.m2363h(webMessage));
        }
    }

    /* renamed from: b2.b$c */
    /* loaded from: classes.dex */
    public class c extends WebView.VisualStateCallback {

        /* renamed from: a */
        public final /* synthetic */ C0038h.a f2150a;

        public c(C0038h.a aVar) {
            this.f2150a = aVar;
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public void onComplete(long j10) {
            this.f2150a.onComplete(j10);
        }
    }

    /* renamed from: a */
    public static void m2299a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    /* renamed from: b */
    public static WebMessage m2300b(C0036f c0036f) {
        return new WebMessage(c0036f.m133a(), C0464r.m2362g(c0036f.m134b()));
    }

    /* renamed from: c */
    public static WebMessagePort[] m2301c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    /* renamed from: d */
    public static C0036f m2302d(WebMessage webMessage) {
        return new C0036f(webMessage.getData(), C0464r.m2364k(webMessage.getPorts()));
    }

    /* renamed from: e */
    public static CharSequence m2303e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    /* renamed from: f */
    public static int m2304f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    /* renamed from: g */
    public static boolean m2305g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    /* renamed from: h */
    public static void m2306h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    /* renamed from: i */
    public static void m2307i(WebView webView, long j10, C0038h.a aVar) {
        webView.postVisualStateCallback(j10, new c(aVar));
    }

    /* renamed from: j */
    public static void m2308j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    /* renamed from: k */
    public static void m2309k(WebSettings webSettings, boolean z10) {
        webSettings.setOffscreenPreRaster(z10);
    }

    /* renamed from: l */
    public static void m2310l(WebMessagePort webMessagePort, AbstractC0037g.a aVar) {
        webMessagePort.setWebMessageCallback(new a(aVar));
    }

    /* renamed from: m */
    public static void m2311m(WebMessagePort webMessagePort, AbstractC0037g.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new b(aVar), handler);
    }
}
