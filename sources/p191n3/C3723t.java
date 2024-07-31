package p191n3;

import android.content.Context;
import java.util.concurrent.Executor;
import p086fd.InterfaceC1904a;
import p105h3.InterfaceC2290e;
import p122i3.InterfaceC2589b;
import p204o3.InterfaceC3846c;
import p204o3.InterfaceC3848d;
import p220p3.InterfaceC3999b;
import p234q3.InterfaceC4157a;

/* renamed from: n3.t */
/* loaded from: classes.dex */
public final class C3723t implements InterfaceC2589b<C3722s> {

    /* renamed from: a */
    public final InterfaceC1904a<Context> f13260a;

    /* renamed from: b */
    public final InterfaceC1904a<InterfaceC2290e> f13261b;

    /* renamed from: c */
    public final InterfaceC1904a<InterfaceC3848d> f13262c;

    /* renamed from: d */
    public final InterfaceC1904a<InterfaceC3728y> f13263d;

    /* renamed from: e */
    public final InterfaceC1904a<Executor> f13264e;

    /* renamed from: f */
    public final InterfaceC1904a<InterfaceC3999b> f13265f;

    /* renamed from: g */
    public final InterfaceC1904a<InterfaceC4157a> f13266g;

    /* renamed from: h */
    public final InterfaceC1904a<InterfaceC4157a> f13267h;

    /* renamed from: i */
    public final InterfaceC1904a<InterfaceC3846c> f13268i;

    public C3723t(InterfaceC1904a<Context> interfaceC1904a, InterfaceC1904a<InterfaceC2290e> interfaceC1904a2, InterfaceC1904a<InterfaceC3848d> interfaceC1904a3, InterfaceC1904a<InterfaceC3728y> interfaceC1904a4, InterfaceC1904a<Executor> interfaceC1904a5, InterfaceC1904a<InterfaceC3999b> interfaceC1904a6, InterfaceC1904a<InterfaceC4157a> interfaceC1904a7, InterfaceC1904a<InterfaceC4157a> interfaceC1904a8, InterfaceC1904a<InterfaceC3846c> interfaceC1904a9) {
        this.f13260a = interfaceC1904a;
        this.f13261b = interfaceC1904a2;
        this.f13262c = interfaceC1904a3;
        this.f13263d = interfaceC1904a4;
        this.f13264e = interfaceC1904a5;
        this.f13265f = interfaceC1904a6;
        this.f13266g = interfaceC1904a7;
        this.f13267h = interfaceC1904a8;
        this.f13268i = interfaceC1904a9;
    }

    /* renamed from: a */
    public static C3723t m14031a(InterfaceC1904a<Context> interfaceC1904a, InterfaceC1904a<InterfaceC2290e> interfaceC1904a2, InterfaceC1904a<InterfaceC3848d> interfaceC1904a3, InterfaceC1904a<InterfaceC3728y> interfaceC1904a4, InterfaceC1904a<Executor> interfaceC1904a5, InterfaceC1904a<InterfaceC3999b> interfaceC1904a6, InterfaceC1904a<InterfaceC4157a> interfaceC1904a7, InterfaceC1904a<InterfaceC4157a> interfaceC1904a8, InterfaceC1904a<InterfaceC3846c> interfaceC1904a9) {
        return new C3723t(interfaceC1904a, interfaceC1904a2, interfaceC1904a3, interfaceC1904a4, interfaceC1904a5, interfaceC1904a6, interfaceC1904a7, interfaceC1904a8, interfaceC1904a9);
    }

    /* renamed from: c */
    public static C3722s m14032c(Context context, InterfaceC2290e interfaceC2290e, InterfaceC3848d interfaceC3848d, InterfaceC3728y interfaceC3728y, Executor executor, InterfaceC3999b interfaceC3999b, InterfaceC4157a interfaceC4157a, InterfaceC4157a interfaceC4157a2, InterfaceC3846c interfaceC3846c) {
        return new C3722s(context, interfaceC2290e, interfaceC3848d, interfaceC3728y, executor, interfaceC3999b, interfaceC4157a, interfaceC4157a2, interfaceC3846c);
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3722s get() {
        return m14032c(this.f13260a.get(), this.f13261b.get(), this.f13262c.get(), this.f13263d.get(), this.f13264e.get(), this.f13265f.get(), this.f13266g.get(), this.f13267h.get(), this.f13268i.get());
    }
}
