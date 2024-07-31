package p017b2;

import android.webkit.WebViewRenderProcess;
import cf.C1128a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import p004a2.AbstractC0040j;
import p017b2.AbstractC0446a;

/* renamed from: b2.z */
/* loaded from: classes.dex */
public class C0472z extends AbstractC0040j {

    /* renamed from: c */
    public static final WeakHashMap<WebViewRenderProcess, C0472z> f2232c = new WeakHashMap<>();

    /* renamed from: a */
    public WebViewRendererBoundaryInterface f2233a;

    /* renamed from: b */
    public WeakReference<WebViewRenderProcess> f2234b;

    /* renamed from: b2.z$a */
    /* loaded from: classes.dex */
    public class a implements Callable<Object> {

        /* renamed from: a */
        public final /* synthetic */ WebViewRendererBoundaryInterface f2235a;

        public a(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
            this.f2235a = webViewRendererBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new C0472z(this.f2235a);
        }
    }

    public C0472z(WebViewRenderProcess webViewRenderProcess) {
        this.f2234b = new WeakReference<>(webViewRenderProcess);
    }

    public C0472z(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f2233a = webViewRendererBoundaryInterface;
    }

    /* renamed from: b */
    public static C0472z m2380b(WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap<WebViewRenderProcess, C0472z> weakHashMap = f2232c;
        C0472z c0472z = weakHashMap.get(webViewRenderProcess);
        if (c0472z != null) {
            return c0472z;
        }
        C0472z c0472z2 = new C0472z(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, c0472z2);
        return c0472z2;
    }

    /* renamed from: c */
    public static C0472z m2381c(InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) C1128a.m4610a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (C0472z) webViewRendererBoundaryInterface.getOrCreatePeer(new a(webViewRendererBoundaryInterface));
    }

    @Override // p004a2.AbstractC0040j
    /* renamed from: a */
    public boolean mo155a() {
        AbstractC0446a.h hVar = C0465s.f2175J;
        if (hVar.mo2293c()) {
            WebViewRenderProcess webViewRenderProcess = this.f2234b.get();
            return webViewRenderProcess != null && C0453g.m2352g(webViewRenderProcess);
        }
        if (hVar.m2294d()) {
            return this.f2233a.terminate();
        }
        throw C0465s.m2367a();
    }
}
