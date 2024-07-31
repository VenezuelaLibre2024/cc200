package p017b2;

import android.webkit.ServiceWorkerWebSettings;
import cf.C1128a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import p004a2.AbstractC0034d;
import p017b2.AbstractC0446a;

/* renamed from: b2.n */
/* loaded from: classes.dex */
public class C0460n extends AbstractC0034d {

    /* renamed from: a */
    public ServiceWorkerWebSettings f2159a;

    /* renamed from: b */
    public ServiceWorkerWebSettingsBoundaryInterface f2160b;

    public C0460n(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.f2159a = serviceWorkerWebSettings;
    }

    public C0460n(InvocationHandler invocationHandler) {
        this.f2160b = (ServiceWorkerWebSettingsBoundaryInterface) C1128a.m4610a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }

    @Override // p004a2.AbstractC0034d
    /* renamed from: a */
    public boolean mo125a() {
        AbstractC0446a.c cVar = C0465s.f2202m;
        if (cVar.mo2293c()) {
            return C0449c.m2312a(m2358j());
        }
        if (cVar.m2294d()) {
            return m2357i().getAllowContentAccess();
        }
        throw C0465s.m2367a();
    }

    @Override // p004a2.AbstractC0034d
    /* renamed from: b */
    public boolean mo126b() {
        AbstractC0446a.c cVar = C0465s.f2203n;
        if (cVar.mo2293c()) {
            return C0449c.m2313b(m2358j());
        }
        if (cVar.m2294d()) {
            return m2357i().getAllowFileAccess();
        }
        throw C0465s.m2367a();
    }

    @Override // p004a2.AbstractC0034d
    /* renamed from: c */
    public boolean mo127c() {
        AbstractC0446a.c cVar = C0465s.f2204o;
        if (cVar.mo2293c()) {
            return C0449c.m2314c(m2358j());
        }
        if (cVar.m2294d()) {
            return m2357i().getBlockNetworkLoads();
        }
        throw C0465s.m2367a();
    }

    @Override // p004a2.AbstractC0034d
    /* renamed from: d */
    public int mo128d() {
        AbstractC0446a.c cVar = C0465s.f2201l;
        if (cVar.mo2293c()) {
            return C0449c.m2315d(m2358j());
        }
        if (cVar.m2294d()) {
            return m2357i().getCacheMode();
        }
        throw C0465s.m2367a();
    }

    @Override // p004a2.AbstractC0034d
    /* renamed from: e */
    public void mo129e(boolean z10) {
        AbstractC0446a.c cVar = C0465s.f2202m;
        if (cVar.mo2293c()) {
            C0449c.m2322k(m2358j(), z10);
        } else {
            if (!cVar.m2294d()) {
                throw C0465s.m2367a();
            }
            m2357i().setAllowContentAccess(z10);
        }
    }

    @Override // p004a2.AbstractC0034d
    /* renamed from: f */
    public void mo130f(boolean z10) {
        AbstractC0446a.c cVar = C0465s.f2203n;
        if (cVar.mo2293c()) {
            C0449c.m2323l(m2358j(), z10);
        } else {
            if (!cVar.m2294d()) {
                throw C0465s.m2367a();
            }
            m2357i().setAllowFileAccess(z10);
        }
    }

    @Override // p004a2.AbstractC0034d
    /* renamed from: g */
    public void mo131g(boolean z10) {
        AbstractC0446a.c cVar = C0465s.f2204o;
        if (cVar.mo2293c()) {
            C0449c.m2324m(m2358j(), z10);
        } else {
            if (!cVar.m2294d()) {
                throw C0465s.m2367a();
            }
            m2357i().setBlockNetworkLoads(z10);
        }
    }

    @Override // p004a2.AbstractC0034d
    /* renamed from: h */
    public void mo132h(int i10) {
        AbstractC0446a.c cVar = C0465s.f2201l;
        if (cVar.mo2293c()) {
            C0449c.m2325n(m2358j(), i10);
        } else {
            if (!cVar.m2294d()) {
                throw C0465s.m2367a();
            }
            m2357i().setCacheMode(i10);
        }
    }

    /* renamed from: i */
    public final ServiceWorkerWebSettingsBoundaryInterface m2357i() {
        if (this.f2160b == null) {
            this.f2160b = (ServiceWorkerWebSettingsBoundaryInterface) C1128a.m4610a(ServiceWorkerWebSettingsBoundaryInterface.class, C0466t.m2372c().m2296b(this.f2159a));
        }
        return this.f2160b;
    }

    /* renamed from: j */
    public final ServiceWorkerWebSettings m2358j() {
        if (this.f2159a == null) {
            this.f2159a = C0466t.m2372c().m2295a(Proxy.getInvocationHandler(this.f2160b));
        }
        return this.f2159a;
    }
}
