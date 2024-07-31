package p204o3;

import android.content.Context;
import p086fd.InterfaceC1904a;
import p122i3.InterfaceC2589b;

/* renamed from: o3.u0 */
/* loaded from: classes.dex */
public final class C3883u0 implements InterfaceC2589b<C3881t0> {

    /* renamed from: a */
    public final InterfaceC1904a<Context> f13946a;

    /* renamed from: b */
    public final InterfaceC1904a<String> f13947b;

    /* renamed from: c */
    public final InterfaceC1904a<Integer> f13948c;

    public C3883u0(InterfaceC1904a<Context> interfaceC1904a, InterfaceC1904a<String> interfaceC1904a2, InterfaceC1904a<Integer> interfaceC1904a3) {
        this.f13946a = interfaceC1904a;
        this.f13947b = interfaceC1904a2;
        this.f13948c = interfaceC1904a3;
    }

    /* renamed from: a */
    public static C3883u0 m14752a(InterfaceC1904a<Context> interfaceC1904a, InterfaceC1904a<String> interfaceC1904a2, InterfaceC1904a<Integer> interfaceC1904a3) {
        return new C3883u0(interfaceC1904a, interfaceC1904a2, interfaceC1904a3);
    }

    /* renamed from: c */
    public static C3881t0 m14753c(Context context, String str, int i10) {
        return new C3881t0(context, str, i10);
    }

    @Override // p086fd.InterfaceC1904a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3881t0 get() {
        return m14753c(this.f13946a.get(), this.f13947b.get(), this.f13948c.get().intValue());
    }
}
