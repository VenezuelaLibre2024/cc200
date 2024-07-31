package p116he;

import p038ce.InterfaceC1119x2;
import p146jd.InterfaceC3284g;
import td.C4753m;

/* renamed from: he.t0 */
/* loaded from: classes2.dex */
public final class C2554t0 {

    /* renamed from: a */
    public final InterfaceC3284g f10012a;

    /* renamed from: b */
    public final Object[] f10013b;

    /* renamed from: c */
    public final InterfaceC1119x2<Object>[] f10014c;

    /* renamed from: d */
    public int f10015d;

    public C2554t0(InterfaceC3284g interfaceC3284g, int i10) {
        this.f10012a = interfaceC3284g;
        this.f10013b = new Object[i10];
        this.f10014c = new InterfaceC1119x2[i10];
    }

    /* renamed from: a */
    public final void m10176a(InterfaceC1119x2<?> interfaceC1119x2, Object obj) {
        Object[] objArr = this.f10013b;
        int i10 = this.f10015d;
        objArr[i10] = obj;
        InterfaceC1119x2<Object>[] interfaceC1119x2Arr = this.f10014c;
        this.f10015d = i10 + 1;
        C4753m.m18651d(interfaceC1119x2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        interfaceC1119x2Arr[i10] = interfaceC1119x2;
    }

    /* renamed from: b */
    public final void m10177b(InterfaceC3284g interfaceC3284g) {
        int length = this.f10014c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            InterfaceC1119x2<Object> interfaceC1119x2 = this.f10014c[length];
            C4753m.m18650c(interfaceC1119x2);
            interfaceC1119x2.mo4494E(interfaceC3284g, this.f10013b[length]);
            if (i10 < 0) {
                return;
            } else {
                length = i10;
            }
        }
    }
}
