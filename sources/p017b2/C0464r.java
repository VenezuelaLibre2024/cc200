package p017b2;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import cf.C1128a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import p004a2.AbstractC0037g;
import p004a2.C0036f;
import p017b2.AbstractC0446a;

/* renamed from: b2.r */
/* loaded from: classes.dex */
public class C0464r extends AbstractC0037g {

    /* renamed from: a */
    public WebMessagePort f2164a;

    /* renamed from: b */
    public WebMessagePortBoundaryInterface f2165b;

    public C0464r(WebMessagePort webMessagePort) {
        this.f2164a = webMessagePort;
    }

    public C0464r(InvocationHandler invocationHandler) {
        this.f2165b = (WebMessagePortBoundaryInterface) C1128a.m4610a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    /* renamed from: f */
    public static WebMessage m2361f(C0036f c0036f) {
        return C0448b.m2300b(c0036f);
    }

    /* renamed from: g */
    public static WebMessagePort[] m2362g(AbstractC0037g[] abstractC0037gArr) {
        if (abstractC0037gArr == null) {
            return null;
        }
        int length = abstractC0037gArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i10 = 0; i10 < length; i10++) {
            webMessagePortArr[i10] = abstractC0037gArr[i10].mo136b();
        }
        return webMessagePortArr;
    }

    /* renamed from: h */
    public static C0036f m2363h(WebMessage webMessage) {
        return C0448b.m2302d(webMessage);
    }

    /* renamed from: k */
    public static AbstractC0037g[] m2364k(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        AbstractC0037g[] abstractC0037gArr = new AbstractC0037g[webMessagePortArr.length];
        for (int i10 = 0; i10 < webMessagePortArr.length; i10++) {
            abstractC0037gArr[i10] = new C0464r(webMessagePortArr[i10]);
        }
        return abstractC0037gArr;
    }

    @Override // p004a2.AbstractC0037g
    /* renamed from: a */
    public void mo135a() {
        AbstractC0446a.b bVar = C0465s.f2167B;
        if (bVar.mo2293c()) {
            C0448b.m2299a(m2366j());
        } else {
            if (!bVar.m2294d()) {
                throw C0465s.m2367a();
            }
            m2365i().close();
        }
    }

    @Override // p004a2.AbstractC0037g
    /* renamed from: b */
    public WebMessagePort mo136b() {
        return m2366j();
    }

    @Override // p004a2.AbstractC0037g
    /* renamed from: c */
    public InvocationHandler mo137c() {
        return Proxy.getInvocationHandler(m2365i());
    }

    @Override // p004a2.AbstractC0037g
    /* renamed from: d */
    public void mo138d(C0036f c0036f) {
        AbstractC0446a.b bVar = C0465s.f2166A;
        if (bVar.mo2293c()) {
            C0448b.m2306h(m2366j(), m2361f(c0036f));
        } else {
            if (!bVar.m2294d()) {
                throw C0465s.m2367a();
            }
            m2365i().postMessage(C1128a.m4612c(new C0461o(c0036f)));
        }
    }

    @Override // p004a2.AbstractC0037g
    /* renamed from: e */
    public void mo139e(AbstractC0037g.a aVar) {
        AbstractC0446a.b bVar = C0465s.f2168C;
        if (bVar.mo2293c()) {
            C0448b.m2310l(m2366j(), aVar);
        } else {
            if (!bVar.m2294d()) {
                throw C0465s.m2367a();
            }
            m2365i().setWebMessageCallback(C1128a.m4612c(new C0462p(aVar)));
        }
    }

    /* renamed from: i */
    public final WebMessagePortBoundaryInterface m2365i() {
        if (this.f2165b == null) {
            this.f2165b = (WebMessagePortBoundaryInterface) C1128a.m4610a(WebMessagePortBoundaryInterface.class, C0466t.m2372c().m2298d(this.f2164a));
        }
        return this.f2165b;
    }

    /* renamed from: j */
    public final WebMessagePort m2366j() {
        if (this.f2164a == null) {
            this.f2164a = C0466t.m2372c().m2297c(Proxy.getInvocationHandler(this.f2165b));
        }
        return this.f2164a;
    }
}
