package p093g3;

import p086fd.InterfaceC1904a;
import p122i3.InterfaceC2589b;
import p179m3.InterfaceC3518e;
import p191n3.C3722s;
import p191n3.C3726w;
import p234q3.InterfaceC4157a;

/* renamed from: g3.w */
/* loaded from: classes.dex */
public final class C1985w implements InterfaceC2589b<C1983u> {

    /* renamed from: a */
    public final InterfaceC1904a<InterfaceC4157a> f7896a;

    /* renamed from: b */
    public final InterfaceC1904a<InterfaceC4157a> f7897b;

    /* renamed from: c */
    public final InterfaceC1904a<InterfaceC3518e> f7898c;

    /* renamed from: d */
    public final InterfaceC1904a<C3722s> f7899d;

    /* renamed from: e */
    public final InterfaceC1904a<C3726w> f7900e;

    public C1985w(InterfaceC1904a<InterfaceC4157a> interfaceC1904a, InterfaceC1904a<InterfaceC4157a> interfaceC1904a2, InterfaceC1904a<InterfaceC3518e> interfaceC1904a3, InterfaceC1904a<C3722s> interfaceC1904a4, InterfaceC1904a<C3726w> interfaceC1904a5) {
        this.f7896a = interfaceC1904a;
        this.f7897b = interfaceC1904a2;
        this.f7898c = interfaceC1904a3;
        this.f7899d = interfaceC1904a4;
        this.f7900e = interfaceC1904a5;
    }

    /* renamed from: a */
    public static C1985w m8012a(InterfaceC1904a<InterfaceC4157a> interfaceC1904a, InterfaceC1904a<InterfaceC4157a> interfaceC1904a2, InterfaceC1904a<InterfaceC3518e> interfaceC1904a3, InterfaceC1904a<C3722s> interfaceC1904a4, InterfaceC1904a<C3726w> interfaceC1904a5) {
        return new C1985w(interfaceC1904a, interfaceC1904a2, interfaceC1904a3, interfaceC1904a4, interfaceC1904a5);
    }

    /* renamed from: c */
    public static C1983u m8013c(InterfaceC4157a interfaceC4157a, InterfaceC4157a interfaceC4157a2, InterfaceC3518e interfaceC3518e, C3722s c3722s, C3726w c3726w) {
        return new C1983u(interfaceC4157a, interfaceC4157a2, interfaceC3518e, c3722s, c3726w);
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1983u get() {
        return m8013c(this.f7896a.get(), this.f7897b.get(), this.f7898c.get(), this.f7899d.get(), this.f7900e.get());
    }
}
