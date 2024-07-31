package p204o3;

import p086fd.InterfaceC1904a;
import p122i3.InterfaceC2589b;
import p234q3.InterfaceC4157a;

/* renamed from: o3.n0 */
/* loaded from: classes.dex */
public final class C3869n0 implements InterfaceC2589b<C3867m0> {

    /* renamed from: a */
    public final InterfaceC1904a<InterfaceC4157a> f13910a;

    /* renamed from: b */
    public final InterfaceC1904a<InterfaceC4157a> f13911b;

    /* renamed from: c */
    public final InterfaceC1904a<AbstractC3850e> f13912c;

    /* renamed from: d */
    public final InterfaceC1904a<C3881t0> f13913d;

    /* renamed from: e */
    public final InterfaceC1904a<String> f13914e;

    public C3869n0(InterfaceC1904a<InterfaceC4157a> interfaceC1904a, InterfaceC1904a<InterfaceC4157a> interfaceC1904a2, InterfaceC1904a<AbstractC3850e> interfaceC1904a3, InterfaceC1904a<C3881t0> interfaceC1904a4, InterfaceC1904a<String> interfaceC1904a5) {
        this.f13910a = interfaceC1904a;
        this.f13911b = interfaceC1904a2;
        this.f13912c = interfaceC1904a3;
        this.f13913d = interfaceC1904a4;
        this.f13914e = interfaceC1904a5;
    }

    /* renamed from: a */
    public static C3869n0 m14735a(InterfaceC1904a<InterfaceC4157a> interfaceC1904a, InterfaceC1904a<InterfaceC4157a> interfaceC1904a2, InterfaceC1904a<AbstractC3850e> interfaceC1904a3, InterfaceC1904a<C3881t0> interfaceC1904a4, InterfaceC1904a<String> interfaceC1904a5) {
        return new C3869n0(interfaceC1904a, interfaceC1904a2, interfaceC1904a3, interfaceC1904a4, interfaceC1904a5);
    }

    /* renamed from: c */
    public static C3867m0 m14736c(InterfaceC4157a interfaceC4157a, InterfaceC4157a interfaceC4157a2, Object obj, Object obj2, InterfaceC1904a<String> interfaceC1904a) {
        return new C3867m0(interfaceC4157a, interfaceC4157a2, (AbstractC3850e) obj, (C3881t0) obj2, interfaceC1904a);
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3867m0 get() {
        return m14736c(this.f13910a.get(), this.f13911b.get(), this.f13912c.get(), this.f13913d.get(), this.f13914e);
    }
}
