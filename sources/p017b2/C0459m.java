package p017b2;

import android.webkit.ServiceWorkerController;
import cf.C1128a;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import p004a2.AbstractC0032b;
import p004a2.AbstractC0033c;
import p004a2.AbstractC0034d;
import p017b2.AbstractC0446a;

/* renamed from: b2.m */
/* loaded from: classes.dex */
public class C0459m extends AbstractC0033c {

    /* renamed from: a */
    public ServiceWorkerController f2156a;

    /* renamed from: b */
    public ServiceWorkerControllerBoundaryInterface f2157b;

    /* renamed from: c */
    public final AbstractC0034d f2158c;

    public C0459m() {
        AbstractC0446a.c cVar = C0465s.f2200k;
        if (cVar.mo2293c()) {
            this.f2156a = C0449c.m2318g();
            this.f2157b = null;
            this.f2158c = C0449c.m2320i(m2356e());
        } else {
            if (!cVar.m2294d()) {
                throw C0465s.m2367a();
            }
            this.f2156a = null;
            ServiceWorkerControllerBoundaryInterface serviceWorkerController = C0466t.m2373d().getServiceWorkerController();
            this.f2157b = serviceWorkerController;
            this.f2158c = new C0460n(serviceWorkerController.getServiceWorkerWebSettings());
        }
    }

    @Override // p004a2.AbstractC0033c
    /* renamed from: b */
    public AbstractC0034d mo123b() {
        return this.f2158c;
    }

    @Override // p004a2.AbstractC0033c
    /* renamed from: c */
    public void mo124c(AbstractC0032b abstractC0032b) {
        AbstractC0446a.c cVar = C0465s.f2200k;
        if (cVar.mo2293c()) {
            if (abstractC0032b == null) {
                C0449c.m2327p(m2356e(), null);
                return;
            } else {
                C0449c.m2328q(m2356e(), abstractC0032b);
                return;
            }
        }
        if (!cVar.m2294d()) {
            throw C0465s.m2367a();
        }
        if (abstractC0032b == null) {
            m2355d().setServiceWorkerClient(null);
        } else {
            m2355d().setServiceWorkerClient(C1128a.m4612c(new C0458l(abstractC0032b)));
        }
    }

    /* renamed from: d */
    public final ServiceWorkerControllerBoundaryInterface m2355d() {
        if (this.f2157b == null) {
            this.f2157b = C0466t.m2373d().getServiceWorkerController();
        }
        return this.f2157b;
    }

    /* renamed from: e */
    public final ServiceWorkerController m2356e() {
        if (this.f2156a == null) {
            this.f2156a = C0449c.m2318g();
        }
        return this.f2156a;
    }
}
