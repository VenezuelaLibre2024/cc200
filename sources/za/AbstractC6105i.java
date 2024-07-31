package za;

import p211oa.C3964a;

/* renamed from: za.i */
/* loaded from: classes.dex */
public abstract class AbstractC6105i extends AbstractC6104h {
    public AbstractC6105i(C3964a c3964a) {
        super(c3964a);
    }

    /* renamed from: h */
    public abstract void mo24348h(StringBuilder sb2, int i10);

    /* renamed from: i */
    public abstract int mo24349i(int i10);

    /* renamed from: j */
    public final void m24355j(StringBuilder sb2, int i10, int i11) {
        int m24390f = m24357b().m24390f(i10, i11);
        mo24348h(sb2, m24390f);
        int mo24349i = mo24349i(m24390f);
        int i12 = 100000;
        for (int i13 = 0; i13 < 5; i13++) {
            if (mo24349i / i12 == 0) {
                sb2.append('0');
            }
            i12 /= 10;
        }
        sb2.append(mo24349i);
    }
}
