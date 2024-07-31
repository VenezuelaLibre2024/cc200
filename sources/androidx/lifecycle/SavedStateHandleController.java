package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344f;
import androidx.savedstate.C0395a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import td.C4753m;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0350i {

    /* renamed from: h */
    public final String f1674h;

    /* renamed from: i */
    public final C0368x f1675i;

    /* renamed from: j */
    public boolean f1676j;

    public SavedStateHandleController(String str, C0368x c0368x) {
        C4753m.m18653f(str, Constants.KEY);
        C4753m.m18653f(c0368x, "handle");
        this.f1674h = str;
        this.f1675i = c0368x;
    }

    @Override // androidx.lifecycle.InterfaceC0350i
    /* renamed from: a */
    public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
        C4753m.m18653f(interfaceC0354k, "source");
        C4753m.m18653f(aVar, "event");
        if (aVar == AbstractC0344f.a.ON_DESTROY) {
            this.f1676j = false;
            interfaceC0354k.getLifecycle().mo1802c(this);
        }
    }

    /* renamed from: b */
    public final void m1770b(C0395a c0395a, AbstractC0344f abstractC0344f) {
        C4753m.m18653f(c0395a, "registry");
        C4753m.m18653f(abstractC0344f, "lifecycle");
        if (!(!this.f1676j)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f1676j = true;
        abstractC0344f.mo1800a(this);
        c0395a.m1997h(this.f1674h, this.f1675i.m1879c());
    }

    /* renamed from: c */
    public final C0368x m1771c() {
        return this.f1675i;
    }

    /* renamed from: d */
    public final boolean m1772d() {
        return this.f1676j;
    }
}
