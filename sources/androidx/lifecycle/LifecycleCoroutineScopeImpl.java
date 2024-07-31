package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344f;
import p038ce.C1051h2;
import p146jd.InterfaceC3284g;
import td.C4753m;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC0346g implements InterfaceC0350i {

    /* renamed from: h */
    public final AbstractC0344f f1661h;

    /* renamed from: i */
    public final InterfaceC3284g f1662i;

    @Override // androidx.lifecycle.InterfaceC0350i
    /* renamed from: a */
    public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
        C4753m.m18653f(interfaceC0354k, "source");
        C4753m.m18653f(aVar, "event");
        if (m1764c().mo1801b().compareTo(AbstractC0344f.b.DESTROYED) <= 0) {
            m1764c().mo1802c(this);
            C1051h2.m4347d(mo1763b(), null, 1, null);
        }
    }

    @Override // p038ce.InterfaceC1085p0
    /* renamed from: b */
    public InterfaceC3284g mo1763b() {
        return this.f1662i;
    }

    /* renamed from: c */
    public AbstractC0344f m1764c() {
        return this.f1661h;
    }
}
