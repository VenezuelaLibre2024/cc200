package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344f;
import td.C4753m;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC0350i {

    /* renamed from: h */
    public final C0370z f1673h;

    public SavedStateHandleAttacher(C0370z c0370z) {
        C4753m.m18653f(c0370z, "provider");
        this.f1673h = c0370z;
    }

    @Override // androidx.lifecycle.InterfaceC0350i
    /* renamed from: a */
    public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
        C4753m.m18653f(interfaceC0354k, "source");
        C4753m.m18653f(aVar, "event");
        if (aVar == AbstractC0344f.a.ON_CREATE) {
            interfaceC0354k.getLifecycle().mo1802c(this);
            this.f1673h.m1891d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
