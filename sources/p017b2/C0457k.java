package p017b2;

import cf.C1128a;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import p004a2.AbstractC0031a;

/* renamed from: b2.k */
/* loaded from: classes.dex */
public class C0457k extends AbstractC0031a {

    /* renamed from: a */
    public JsReplyProxyBoundaryInterface f2153a;

    /* renamed from: b2.k$a */
    /* loaded from: classes.dex */
    public class a implements Callable<Object> {

        /* renamed from: a */
        public final /* synthetic */ JsReplyProxyBoundaryInterface f2154a;

        public a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f2154a = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new C0457k(this.f2154a);
        }
    }

    public C0457k(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f2153a = jsReplyProxyBoundaryInterface;
    }

    /* renamed from: b */
    public static C0457k m2354b(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) C1128a.m4610a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (C0457k) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }

    @Override // p004a2.AbstractC0031a
    /* renamed from: a */
    public void mo121a(String str) {
        if (!C0465s.f2184S.m2294d()) {
            throw C0465s.m2367a();
        }
        this.f2153a.postMessage(str);
    }
}
