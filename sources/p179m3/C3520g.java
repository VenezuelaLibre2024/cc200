package p179m3;

import p086fd.InterfaceC1904a;
import p122i3.C2591d;
import p122i3.InterfaceC2589b;
import p191n3.AbstractC3710g;
import p234q3.InterfaceC4157a;

/* renamed from: m3.g */
/* loaded from: classes.dex */
public final class C3520g implements InterfaceC2589b<AbstractC3710g> {

    /* renamed from: a */
    public final InterfaceC1904a<InterfaceC4157a> f12346a;

    public C3520g(InterfaceC1904a<InterfaceC4157a> interfaceC1904a) {
        this.f12346a = interfaceC1904a;
    }

    /* renamed from: a */
    public static AbstractC3710g m13071a(InterfaceC4157a interfaceC4157a) {
        return (AbstractC3710g) C2591d.m10356c(AbstractC3519f.m13070a(interfaceC4157a), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C3520g m13072b(InterfaceC1904a<InterfaceC4157a> interfaceC1904a) {
        return new C3520g(interfaceC1904a);
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC3710g get() {
        return m13071a(this.f12346a.get());
    }
}
