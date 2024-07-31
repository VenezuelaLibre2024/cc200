package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.C0345f0;
import androidx.lifecycle.C0349h0;
import androidx.lifecycle.C0356l;
import androidx.lifecycle.C0369y;
import androidx.lifecycle.InterfaceC0342e;
import androidx.lifecycle.InterfaceC0351i0;
import androidx.savedstate.C0395a;
import p059e1.AbstractC1637a;
import p059e1.C1640d;
import p247r1.C4274c;
import p247r1.InterfaceC4275d;

/* renamed from: androidx.fragment.app.k0 */
/* loaded from: classes.dex */
public class C0309k0 implements InterfaceC0342e, InterfaceC4275d, InterfaceC0351i0 {

    /* renamed from: h */
    public final Fragment f1526h;

    /* renamed from: i */
    public final C0349h0 f1527i;

    /* renamed from: j */
    public C0356l f1528j = null;

    /* renamed from: k */
    public C4274c f1529k = null;

    public C0309k0(Fragment fragment, C0349h0 c0349h0) {
        this.f1526h = fragment;
        this.f1527i = c0349h0;
    }

    /* renamed from: a */
    public void m1535a(AbstractC0344f.a aVar) {
        this.f1528j.m1833h(aVar);
    }

    /* renamed from: b */
    public void m1536b() {
        if (this.f1528j == null) {
            this.f1528j = new C0356l(this);
            C4274c m16401a = C4274c.m16401a(this);
            this.f1529k = m16401a;
            m16401a.m16403c();
        }
    }

    /* renamed from: c */
    public boolean m1537c() {
        return this.f1528j != null;
    }

    /* renamed from: d */
    public void m1538d(Bundle bundle) {
        this.f1529k.m16404d(bundle);
    }

    /* renamed from: e */
    public void m1539e(Bundle bundle) {
        this.f1529k.m16405e(bundle);
    }

    /* renamed from: f */
    public void m1540f(AbstractC0344f.b bVar) {
        this.f1528j.m1839n(bVar);
    }

    @Override // androidx.lifecycle.InterfaceC0342e
    public AbstractC1637a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f1526h.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C1640d c1640d = new C1640d();
        if (application != null) {
            c1640d.m6518c(C0345f0.a.f1716h, application);
        }
        c1640d.m6518c(C0369y.f1767a, this.f1526h);
        c1640d.m6518c(C0369y.f1768b, this);
        if (this.f1526h.getArguments() != null) {
            c1640d.m6518c(C0369y.f1769c, this.f1526h.getArguments());
        }
        return c1640d;
    }

    @Override // androidx.lifecycle.InterfaceC0354k
    public AbstractC0344f getLifecycle() {
        m1536b();
        return this.f1528j;
    }

    @Override // p247r1.InterfaceC4275d
    public C0395a getSavedStateRegistry() {
        m1536b();
        return this.f1529k.m16402b();
    }

    @Override // androidx.lifecycle.InterfaceC0351i0
    public C0349h0 getViewModelStore() {
        m1536b();
        return this.f1527i;
    }
}
