package p179m3;

import java.util.concurrent.Executor;
import p086fd.InterfaceC1904a;
import p105h3.InterfaceC2290e;
import p122i3.InterfaceC2589b;
import p191n3.InterfaceC3728y;
import p204o3.InterfaceC3848d;
import p220p3.InterfaceC3999b;

/* renamed from: m3.d */
/* loaded from: classes.dex */
public final class C3517d implements InterfaceC2589b<C3516c> {

    /* renamed from: a */
    public final InterfaceC1904a<Executor> f12341a;

    /* renamed from: b */
    public final InterfaceC1904a<InterfaceC2290e> f12342b;

    /* renamed from: c */
    public final InterfaceC1904a<InterfaceC3728y> f12343c;

    /* renamed from: d */
    public final InterfaceC1904a<InterfaceC3848d> f12344d;

    /* renamed from: e */
    public final InterfaceC1904a<InterfaceC3999b> f12345e;

    public C3517d(InterfaceC1904a<Executor> interfaceC1904a, InterfaceC1904a<InterfaceC2290e> interfaceC1904a2, InterfaceC1904a<InterfaceC3728y> interfaceC1904a3, InterfaceC1904a<InterfaceC3848d> interfaceC1904a4, InterfaceC1904a<InterfaceC3999b> interfaceC1904a5) {
        this.f12341a = interfaceC1904a;
        this.f12342b = interfaceC1904a2;
        this.f12343c = interfaceC1904a3;
        this.f12344d = interfaceC1904a4;
        this.f12345e = interfaceC1904a5;
    }

    /* renamed from: a */
    public static C3517d m13067a(InterfaceC1904a<Executor> interfaceC1904a, InterfaceC1904a<InterfaceC2290e> interfaceC1904a2, InterfaceC1904a<InterfaceC3728y> interfaceC1904a3, InterfaceC1904a<InterfaceC3848d> interfaceC1904a4, InterfaceC1904a<InterfaceC3999b> interfaceC1904a5) {
        return new C3517d(interfaceC1904a, interfaceC1904a2, interfaceC1904a3, interfaceC1904a4, interfaceC1904a5);
    }

    /* renamed from: c */
    public static C3516c m13068c(Executor executor, InterfaceC2290e interfaceC2290e, InterfaceC3728y interfaceC3728y, InterfaceC3848d interfaceC3848d, InterfaceC3999b interfaceC3999b) {
        return new C3516c(executor, interfaceC2290e, interfaceC3728y, interfaceC3848d, interfaceC3999b);
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3516c get() {
        return m13068c(this.f12341a.get(), this.f12342b.get(), this.f12343c.get(), this.f12344d.get(), this.f12345e.get());
    }
}
