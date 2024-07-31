package p017b2;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;
import p004a2.AbstractC0040j;
import p004a2.AbstractC0041k;

/* renamed from: b2.x */
/* loaded from: classes.dex */
public class C0470x implements WebViewRendererClientBoundaryInterface {

    /* renamed from: c */
    public static final String[] f2220c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* renamed from: a */
    public final Executor f2221a;

    /* renamed from: b */
    public final AbstractC0041k f2222b;

    /* renamed from: b2.x$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ AbstractC0041k f2223h;

        /* renamed from: i */
        public final /* synthetic */ WebView f2224i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC0040j f2225j;

        public a(AbstractC0041k abstractC0041k, WebView webView, AbstractC0040j abstractC0040j) {
            this.f2223h = abstractC0041k;
            this.f2224i = webView;
            this.f2225j = abstractC0040j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2223h.onRenderProcessUnresponsive(this.f2224i, this.f2225j);
        }
    }

    /* renamed from: b2.x$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ AbstractC0041k f2227h;

        /* renamed from: i */
        public final /* synthetic */ WebView f2228i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC0040j f2229j;

        public b(AbstractC0041k abstractC0041k, WebView webView, AbstractC0040j abstractC0040j) {
            this.f2227h = abstractC0041k;
            this.f2228i = webView;
            this.f2229j = abstractC0040j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2227h.onRenderProcessResponsive(this.f2228i, this.f2229j);
        }
    }

    @SuppressLint({"LambdaLast"})
    public C0470x(Executor executor, AbstractC0041k abstractC0041k) {
        this.f2221a = executor;
        this.f2222b = abstractC0041k;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f2220c;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        C0472z m2381c = C0472z.m2381c(invocationHandler);
        AbstractC0041k abstractC0041k = this.f2222b;
        Executor executor = this.f2221a;
        if (executor == null) {
            abstractC0041k.onRenderProcessResponsive(webView, m2381c);
        } else {
            executor.execute(new b(abstractC0041k, webView, m2381c));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        C0472z m2381c = C0472z.m2381c(invocationHandler);
        AbstractC0041k abstractC0041k = this.f2222b;
        Executor executor = this.f2221a;
        if (executor == null) {
            abstractC0041k.onRenderProcessUnresponsive(webView, m2381c);
        } else {
            executor.execute(new a(abstractC0041k, webView, m2381c));
        }
    }
}
