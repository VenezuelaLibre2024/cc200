package p038ce;

import gd.C2236j;
import gd.C2240n;
import gd.C2245s;
import p116he.C2530h0;
import p116he.C2546p0;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;

/* renamed from: ce.h3 */
/* loaded from: classes2.dex */
public final class C1052h3<T> extends C2530h0<T> {

    /* renamed from: l */
    public final ThreadLocal<C2236j<InterfaceC3284g, Object>> f4010l;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1052h3(p146jd.InterfaceC3284g r3, p146jd.InterfaceC3281d<? super T> r4) {
        /*
            r2 = this;
            ce.i3 r0 = p038ce.C1057i3.f4012h
            jd.g$b r1 = r3.mo4368d(r0)
            if (r1 != 0) goto Ld
            jd.g r0 = r3.mo4369e0(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f4010l = r0
            jd.g r4 = r4.getContext()
            jd.e$b r0 = p146jd.InterfaceC3282e.f11449e
            jd.g$b r4 = r4.mo4368d(r0)
            boolean r4 = r4 instanceof p038ce.AbstractC1064k0
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = p116he.C2546p0.m10149c(r3, r4)
            p116he.C2546p0.m10147a(r3, r4)
            r2.m4355T0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p038ce.C1052h3.<init>(jd.g, jd.d):void");
    }

    @Override // p116he.C2530h0, p038ce.AbstractC1013a
    /* renamed from: O0 */
    public void mo4250O0(Object obj) {
        if (this.threadLocalIsSet) {
            C2236j<InterfaceC3284g, Object> c2236j = this.f4010l.get();
            if (c2236j != null) {
                C2546p0.m10147a(c2236j.m8961a(), c2236j.m8962b());
            }
            this.f4010l.remove();
        }
        Object m4322a = C1044g0.m4322a(obj, this.f9969k);
        InterfaceC3281d<T> interfaceC3281d = this.f9969k;
        InterfaceC3284g context = interfaceC3281d.getContext();
        Object m10149c = C2546p0.m10149c(context, null);
        C1052h3<?> m4379g = m10149c != C2546p0.f9994a ? C1059j0.m4379g(interfaceC3281d, context, m10149c) : null;
        try {
            this.f9969k.resumeWith(m4322a);
            C2245s c2245s = C2245s.f8873a;
        } finally {
            if (m4379g == null || m4379g.m4354S0()) {
                C2546p0.m10147a(context, m10149c);
            }
        }
    }

    /* renamed from: S0 */
    public final boolean m4354S0() {
        boolean z10 = this.threadLocalIsSet && this.f4010l.get() == null;
        this.f4010l.remove();
        return !z10;
    }

    /* renamed from: T0 */
    public final void m4355T0(InterfaceC3284g interfaceC3284g, Object obj) {
        this.threadLocalIsSet = true;
        this.f4010l.set(C2240n.m8977a(interfaceC3284g, obj));
    }
}
