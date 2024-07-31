package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.C0345f0;
import androidx.savedstate.C0395a;
import p059e1.AbstractC1637a;
import p059e1.C1639c;
import p247r1.InterfaceC4275d;
import sd.InterfaceC4580l;
import td.AbstractC4754n;
import td.C4753m;
import td.C4764x;

/* renamed from: androidx.lifecycle.y */
/* loaded from: classes.dex */
public final class C0369y {

    /* renamed from: a */
    public static final AbstractC1637a.b<InterfaceC4275d> f1767a = new b();

    /* renamed from: b */
    public static final AbstractC1637a.b<InterfaceC0351i0> f1768b = new c();

    /* renamed from: c */
    public static final AbstractC1637a.b<Bundle> f1769c = new a();

    /* renamed from: androidx.lifecycle.y$a */
    /* loaded from: classes.dex */
    public static final class a implements AbstractC1637a.b<Bundle> {
    }

    /* renamed from: androidx.lifecycle.y$b */
    /* loaded from: classes.dex */
    public static final class b implements AbstractC1637a.b<InterfaceC4275d> {
    }

    /* renamed from: androidx.lifecycle.y$c */
    /* loaded from: classes.dex */
    public static final class c implements AbstractC1637a.b<InterfaceC0351i0> {
    }

    /* renamed from: androidx.lifecycle.y$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC4754n implements InterfaceC4580l<AbstractC1637a, C0335a0> {

        /* renamed from: h */
        public static final d f1770h = new d();

        public d() {
            super(1);
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a */
        public final C0335a0 invoke(AbstractC1637a abstractC1637a) {
            C4753m.m18653f(abstractC1637a, "$this$initializer");
            return new C0335a0();
        }
    }

    /* renamed from: a */
    public static final C0368x m1883a(AbstractC1637a abstractC1637a) {
        C4753m.m18653f(abstractC1637a, "<this>");
        InterfaceC4275d interfaceC4275d = (InterfaceC4275d) abstractC1637a.mo6514a(f1767a);
        if (interfaceC4275d == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC0351i0 interfaceC0351i0 = (InterfaceC0351i0) abstractC1637a.mo6514a(f1768b);
        if (interfaceC0351i0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC1637a.mo6514a(f1769c);
        String str = (String) abstractC1637a.mo6514a(C0345f0.c.f1723d);
        if (str != null) {
            return m1884b(interfaceC4275d, interfaceC0351i0, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    /* renamed from: b */
    public static final C0368x m1884b(InterfaceC4275d interfaceC4275d, InterfaceC0351i0 interfaceC0351i0, String str, Bundle bundle) {
        C0370z m1886d = m1886d(interfaceC4275d);
        C0335a0 m1887e = m1887e(interfaceC0351i0);
        C0368x c0368x = m1887e.m1773f().get(str);
        if (c0368x != null) {
            return c0368x;
        }
        C0368x m1881a = C0368x.f1760f.m1881a(m1886d.m1889b(str), bundle);
        m1887e.m1773f().put(str, m1881a);
        return m1881a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <T extends InterfaceC4275d & InterfaceC0351i0> void m1885c(T t10) {
        C4753m.m18653f(t10, "<this>");
        AbstractC0344f.b mo1801b = t10.getLifecycle().mo1801b();
        if (!(mo1801b == AbstractC0344f.b.INITIALIZED || mo1801b == AbstractC0344f.b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t10.getSavedStateRegistry().m1993c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            C0370z c0370z = new C0370z(t10.getSavedStateRegistry(), t10);
            t10.getSavedStateRegistry().m1997h("androidx.lifecycle.internal.SavedStateHandlesProvider", c0370z);
            t10.getLifecycle().mo1800a(new SavedStateHandleAttacher(c0370z));
        }
    }

    /* renamed from: d */
    public static final C0370z m1886d(InterfaceC4275d interfaceC4275d) {
        C4753m.m18653f(interfaceC4275d, "<this>");
        C0395a.c m1993c = interfaceC4275d.getSavedStateRegistry().m1993c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C0370z c0370z = m1993c instanceof C0370z ? (C0370z) m1993c : null;
        if (c0370z != null) {
            return c0370z;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    /* renamed from: e */
    public static final C0335a0 m1887e(InterfaceC0351i0 interfaceC0351i0) {
        C4753m.m18653f(interfaceC0351i0, "<this>");
        C1639c c1639c = new C1639c();
        c1639c.m6516a(C4764x.m18672b(C0335a0.class), d.f1770h);
        return (C0335a0) new C0345f0(interfaceC0351i0, c1639c.m6517b()).m1813b("androidx.lifecycle.internal.SavedStateHandlesVM", C0335a0.class);
    }
}
