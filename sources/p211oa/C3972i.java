package p211oa;

import p129ia.AbstractC2670b;
import p129ia.AbstractC2676h;
import p129ia.C2678j;

/* renamed from: oa.i */
/* loaded from: classes.dex */
public class C3972i extends AbstractC2670b {

    /* renamed from: d */
    public static final byte[] f14327d = new byte[0];

    /* renamed from: b */
    public byte[] f14328b;

    /* renamed from: c */
    public final int[] f14329c;

    public C3972i(AbstractC2676h abstractC2676h) {
        super(abstractC2676h);
        this.f14328b = f14327d;
        this.f14329c = new int[32];
    }

    /* renamed from: g */
    public static int m15081g(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (iArr[i13] > i10) {
                i10 = iArr[i13];
                i12 = i13;
            }
            if (iArr[i13] > i11) {
                i11 = iArr[i13];
            }
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            int i17 = i16 - i12;
            int i18 = iArr[i16] * i17 * i17;
            if (i18 > i15) {
                i14 = i16;
                i15 = i18;
            }
        }
        if (i12 <= i14) {
            int i19 = i12;
            i12 = i14;
            i14 = i19;
        }
        if (i12 - i14 <= length / 16) {
            throw C2678j.m10895a();
        }
        int i20 = i12 - 1;
        int i21 = -1;
        int i22 = i20;
        while (i20 > i14) {
            int i23 = i20 - i14;
            int i24 = i23 * i23 * (i12 - i20) * (i11 - iArr[i20]);
            if (i24 > i21) {
                i22 = i20;
                i21 = i24;
            }
            i20--;
        }
        return i22 << 3;
    }

    @Override // p129ia.AbstractC2670b
    /* renamed from: b */
    public C3965b mo10870b() {
        AbstractC2676h m10873e = m10873e();
        int m10891d = m10873e.m10891d();
        int m10890a = m10873e.m10890a();
        C3965b c3965b = new C3965b(m10891d, m10890a);
        m15082h(m10891d);
        int[] iArr = this.f14329c;
        for (int i10 = 1; i10 < 5; i10++) {
            byte[] mo10886c = m10873e.mo10886c((m10890a * i10) / 5, this.f14328b);
            int i11 = (m10891d * 4) / 5;
            for (int i12 = m10891d / 5; i12 < i11; i12++) {
                int i13 = (mo10886c[i12] & 255) >> 3;
                iArr[i13] = iArr[i13] + 1;
            }
        }
        int m15081g = m15081g(iArr);
        byte[] mo10885b = m10873e.mo10885b();
        for (int i14 = 0; i14 < m10890a; i14++) {
            int i15 = i14 * m10891d;
            for (int i16 = 0; i16 < m10891d; i16++) {
                if ((mo10885b[i15 + i16] & 255) < m15081g) {
                    c3965b.m15044q(i16, i14);
                }
            }
        }
        return c3965b;
    }

    @Override // p129ia.AbstractC2670b
    /* renamed from: c */
    public C3964a mo10871c(int i10, C3964a c3964a) {
        AbstractC2676h m10873e = m10873e();
        int m10891d = m10873e.m10891d();
        if (c3964a == null || c3964a.m15026i() < m10891d) {
            c3964a = new C3964a(m10891d);
        } else {
            c3964a.m15020b();
        }
        m15082h(m10891d);
        byte[] mo10886c = m10873e.mo10886c(i10, this.f14328b);
        int[] iArr = this.f14329c;
        for (int i11 = 0; i11 < m10891d; i11++) {
            int i12 = (mo10886c[i11] & 255) >> 3;
            iArr[i12] = iArr[i12] + 1;
        }
        int m15081g = m15081g(iArr);
        if (m10891d < 3) {
            for (int i13 = 0; i13 < m10891d; i13++) {
                if ((mo10886c[i13] & 255) < m15081g) {
                    c3964a.m15029n(i13);
                }
            }
        } else {
            int i14 = 1;
            int i15 = mo10886c[0] & 255;
            int i16 = mo10886c[1] & 255;
            while (i14 < m10891d - 1) {
                int i17 = i14 + 1;
                int i18 = mo10886c[i17] & 255;
                if ((((i16 * 4) - i15) - i18) / 2 < m15081g) {
                    c3964a.m15029n(i14);
                }
                i15 = i16;
                i14 = i17;
                i16 = i18;
            }
        }
        return c3964a;
    }

    /* renamed from: h */
    public final void m15082h(int i10) {
        if (this.f14328b.length < i10) {
            this.f14328b = new byte[i10];
        }
        for (int i11 = 0; i11 < 32; i11++) {
            this.f14329c[i11] = 0;
        }
    }
}
