package p236q5;

import java.util.Collections;
import java.util.List;
import p222p5.C4015a0;
import p222p5.C4022e;
import p222p5.C4051w;
import p264s3.C4499t2;

/* renamed from: q5.f */
/* loaded from: classes.dex */
public final class C4173f {

    /* renamed from: a */
    public final List<byte[]> f15012a;

    /* renamed from: b */
    public final int f15013b;

    /* renamed from: c */
    public final int f15014c;

    /* renamed from: d */
    public final int f15015d;

    /* renamed from: e */
    public final float f15016e;

    /* renamed from: f */
    public final int f15017f;

    /* renamed from: g */
    public final int f15018g;

    /* renamed from: h */
    public final int f15019h;

    /* renamed from: i */
    public final String f15020i;

    public C4173f(List<byte[]> list, int i10, int i11, int i12, float f10, String str, int i13, int i14, int i15) {
        this.f15012a = list;
        this.f15013b = i10;
        this.f15014c = i11;
        this.f15015d = i12;
        this.f15016e = f10;
        this.f15020i = str;
        this.f15017f = i13;
        this.f15018g = i14;
        this.f15019h = i15;
    }

    /* renamed from: a */
    public static C4173f m16047a(C4015a0 c4015a0) {
        int i10;
        int i11;
        try {
            c4015a0.m15224U(21);
            int m15210G = c4015a0.m15210G() & 3;
            int m15210G2 = c4015a0.m15210G();
            int m15231f = c4015a0.m15231f();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < m15210G2; i14++) {
                c4015a0.m15224U(1);
                int m15216M = c4015a0.m15216M();
                for (int i15 = 0; i15 < m15216M; i15++) {
                    int m15216M2 = c4015a0.m15216M();
                    i13 += m15216M2 + 4;
                    c4015a0.m15224U(m15216M2);
                }
            }
            c4015a0.m15223T(m15231f);
            byte[] bArr = new byte[i13];
            float f10 = 1.0f;
            String str = null;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = 0;
            int i22 = 0;
            while (i21 < m15210G2) {
                int m15210G3 = c4015a0.m15210G() & 63;
                int m15216M3 = c4015a0.m15216M();
                int i23 = i12;
                while (i23 < m15216M3) {
                    int m15216M4 = c4015a0.m15216M();
                    byte[] bArr2 = C4051w.f14559a;
                    int i24 = m15210G2;
                    System.arraycopy(bArr2, i12, bArr, i22, bArr2.length);
                    int length = i22 + bArr2.length;
                    System.arraycopy(c4015a0.m15230e(), c4015a0.m15231f(), bArr, length, m15216M4);
                    if (m15210G3 == 33 && i23 == 0) {
                        C4051w.a m15572h = C4051w.m15572h(bArr, length, length + m15216M4);
                        int i25 = m15572h.f14570h;
                        i17 = m15572h.f14571i;
                        int i26 = m15572h.f14573k;
                        int i27 = m15572h.f14574l;
                        int i28 = m15572h.f14575m;
                        float f11 = m15572h.f14572j;
                        i10 = m15210G3;
                        i11 = m15216M3;
                        i16 = i25;
                        i20 = i28;
                        str = C4022e.m15279c(m15572h.f14563a, m15572h.f14564b, m15572h.f14565c, m15572h.f14566d, m15572h.f14567e, m15572h.f14568f);
                        i19 = i27;
                        f10 = f11;
                        i18 = i26;
                    } else {
                        i10 = m15210G3;
                        i11 = m15216M3;
                    }
                    i22 = length + m15216M4;
                    c4015a0.m15224U(m15216M4);
                    i23++;
                    m15210G2 = i24;
                    m15210G3 = i10;
                    m15216M3 = i11;
                    i12 = 0;
                }
                i21++;
                i12 = 0;
            }
            return new C4173f(i13 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), m15210G + 1, i16, i17, f10, str, i18, i19, i20);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C4499t2.m17594a("Error parsing HEVC config", e10);
        }
    }
}
