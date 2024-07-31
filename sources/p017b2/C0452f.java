package p017b2;

import android.os.Looper;
import android.webkit.TracingConfig;
import android.webkit.TracingController;
import android.webkit.WebView;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import p004a2.C0035e;

/* renamed from: b2.f */
/* loaded from: classes.dex */
public class C0452f {
    /* renamed from: a */
    public static TracingController m2340a() {
        return TracingController.getInstance();
    }

    /* renamed from: b */
    public static ClassLoader m2341b() {
        return WebView.getWebViewClassLoader();
    }

    /* renamed from: c */
    public static Looper m2342c(WebView webView) {
        return webView.getWebViewLooper();
    }

    /* renamed from: d */
    public static boolean m2343d(TracingController tracingController) {
        return tracingController.isTracing();
    }

    /* renamed from: e */
    public static void m2344e(TracingController tracingController, C0035e c0035e) {
        new TracingConfig.Builder();
        throw null;
    }

    /* renamed from: f */
    public static boolean m2345f(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
