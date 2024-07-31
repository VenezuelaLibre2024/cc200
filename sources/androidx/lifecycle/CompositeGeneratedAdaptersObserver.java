package androidx.lifecycle;

import androidx.lifecycle.AbstractC0344f;
import td.C4753m;

/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements InterfaceC0350i {

    /* renamed from: h */
    public final InterfaceC0340d[] f1654h;

    public CompositeGeneratedAdaptersObserver(InterfaceC0340d[] interfaceC0340dArr) {
        C4753m.m18653f(interfaceC0340dArr, "generatedAdapters");
        this.f1654h = interfaceC0340dArr;
    }

    @Override // androidx.lifecycle.InterfaceC0350i
    /* renamed from: a */
    public void mo571a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
        C4753m.m18653f(interfaceC0354k, "source");
        C4753m.m18653f(aVar, "event");
        C0360p c0360p = new C0360p();
        for (InterfaceC0340d interfaceC0340d : this.f1654h) {
            interfaceC0340d.m1789a(interfaceC0354k, aVar, false, c0360p);
        }
        for (InterfaceC0340d interfaceC0340d2 : this.f1654h) {
            interfaceC0340d2.m1789a(interfaceC0354k, aVar, true, c0360p);
        }
    }
}
