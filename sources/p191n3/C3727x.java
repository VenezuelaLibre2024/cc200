package p191n3;

import java.util.concurrent.Executor;
import p086fd.InterfaceC1904a;
import p122i3.InterfaceC2589b;
import p204o3.InterfaceC3848d;
import p220p3.InterfaceC3999b;

/* renamed from: n3.x */
/* loaded from: classes.dex */
public final class C3727x implements InterfaceC2589b<C3726w> {

    /* renamed from: a */
    public final InterfaceC1904a<Executor> f13275a;

    /* renamed from: b */
    public final InterfaceC1904a<InterfaceC3848d> f13276b;

    /* renamed from: c */
    public final InterfaceC1904a<InterfaceC3728y> f13277c;

    /* renamed from: d */
    public final InterfaceC1904a<InterfaceC3999b> f13278d;

    public C3727x(InterfaceC1904a<Executor> interfaceC1904a, InterfaceC1904a<InterfaceC3848d> interfaceC1904a2, InterfaceC1904a<InterfaceC3728y> interfaceC1904a3, InterfaceC1904a<InterfaceC3999b> interfaceC1904a4) {
        this.f13275a = interfaceC1904a;
        this.f13276b = interfaceC1904a2;
        this.f13277c = interfaceC1904a3;
        this.f13278d = interfaceC1904a4;
    }

    /* renamed from: a */
    public static C3727x m14039a(InterfaceC1904a<Executor> interfaceC1904a, InterfaceC1904a<InterfaceC3848d> interfaceC1904a2, InterfaceC1904a<InterfaceC3728y> interfaceC1904a3, InterfaceC1904a<InterfaceC3999b> interfaceC1904a4) {
        return new C3727x(interfaceC1904a, interfaceC1904a2, interfaceC1904a3, interfaceC1904a4);
    }

    /* renamed from: c */
    public static C3726w m14040c(Executor executor, InterfaceC3848d interfaceC3848d, InterfaceC3728y interfaceC3728y, InterfaceC3999b interfaceC3999b) {
        return new C3726w(executor, interfaceC3848d, interfaceC3728y, interfaceC3999b);
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3726w get() {
        return m14040c(this.f13275a.get(), this.f13276b.get(), this.f13277c.get(), this.f13278d.get());
    }
}
