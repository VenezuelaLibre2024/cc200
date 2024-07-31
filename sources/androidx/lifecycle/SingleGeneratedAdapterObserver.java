package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344f;
import td.C4753m;

/* loaded from: classes.dex */
public final class SingleGeneratedAdapterObserver implements InterfaceC0350i {

    /* renamed from: h */
    public final InterfaceC0340d f1677h;

    public SingleGeneratedAdapterObserver(InterfaceC0340d interfaceC0340d) {
        C4753m.m18653f(interfaceC0340d, "generatedAdapter");
        this.f1677h = interfaceC0340d;
    }

    @Override // androidx.lifecycle.InterfaceC0350i
    /* renamed from: a */
    public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
        C4753m.m18653f(interfaceC0354k, "source");
        C4753m.m18653f(aVar, "event");
        this.f1677h.m1789a(interfaceC0354k, aVar, false, null);
        this.f1677h.m1789a(interfaceC0354k, aVar, true, null);
    }
}
