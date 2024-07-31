package p324wa;

import java.util.Arrays;
import java.util.Map;
import p079f6.C1841a;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;
import p129ia.EnumC2683o;
import p211oa.C3964a;

/* renamed from: wa.a */
/* loaded from: classes.dex */
public final class C5451a extends AbstractC5461k {

    /* renamed from: d */
    public static final char[] f20306d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    public static final int[] f20307e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    public static final char[] f20308f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    public final StringBuilder f20309a = new StringBuilder(20);

    /* renamed from: b */
    public int[] f20310b = new int[80];

    /* renamed from: c */
    public int f20311c = 0;

    /* renamed from: h */
    public static boolean m21615h(char[] cArr, char c10) {
        if (cArr != null) {
            for (char c11 : cArr) {
                if (c11 == c10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p324wa.AbstractC5461k
    /* renamed from: c */
    public C2682n mo21616c(int i10, C3964a c3964a, Map<EnumC2673e, ?> map) {
        Arrays.fill(this.f20310b, 0);
        m21619k(c3964a);
        int m21618j = m21618j();
        this.f20309a.setLength(0);
        int i11 = m21618j;
        do {
            int m21620l = m21620l(i11);
            if (m21620l == -1) {
                throw C2678j.m10895a();
            }
            this.f20309a.append((char) m21620l);
            i11 += 8;
            if (this.f20309a.length() > 1 && m21615h(f20308f, f20306d[m21620l])) {
                break;
            }
        } while (i11 < this.f20311c);
        int i12 = i11 - 1;
        int i13 = this.f20310b[i12];
        int i14 = 0;
        for (int i15 = -8; i15 < -1; i15++) {
            i14 += this.f20310b[i11 + i15];
        }
        if (i11 < this.f20311c && i13 < i14 / 2) {
            throw C2678j.m10895a();
        }
        m21621m(m21618j);
        for (int i16 = 0; i16 < this.f20309a.length(); i16++) {
            StringBuilder sb2 = this.f20309a;
            sb2.setCharAt(i16, f20306d[sb2.charAt(i16)]);
        }
        char charAt = this.f20309a.charAt(0);
        char[] cArr = f20308f;
        if (!m21615h(cArr, charAt)) {
            throw C2678j.m10895a();
        }
        StringBuilder sb3 = this.f20309a;
        if (!m21615h(cArr, sb3.charAt(sb3.length() - 1))) {
            throw C2678j.m10895a();
        }
        if (this.f20309a.length() <= 3) {
            throw C2678j.m10895a();
        }
        if (map == null || !map.containsKey(EnumC2673e.RETURN_CODABAR_START_END)) {
            StringBuilder sb4 = this.f20309a;
            sb4.deleteCharAt(sb4.length() - 1);
            this.f20309a.deleteCharAt(0);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < m21618j; i18++) {
            i17 += this.f20310b[i18];
        }
        float f10 = i17;
        while (m21618j < i12) {
            i17 += this.f20310b[m21618j];
            m21618j++;
        }
        float f11 = i10;
        C2682n c2682n = new C2682n(this.f20309a.toString(), null, new C2684p[]{new C2684p(f10, f11), new C2684p(i17, f11)}, EnumC2669a.CODABAR);
        c2682n.m10904h(EnumC2683o.SYMBOLOGY_IDENTIFIER, "]F0");
        return c2682n;
    }

    /* renamed from: i */
    public final void m21617i(int i10) {
        int[] iArr = this.f20310b;
        int i11 = this.f20311c;
        iArr[i11] = i10;
        int i12 = i11 + 1;
        this.f20311c = i12;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[i12 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i12);
            this.f20310b = iArr2;
        }
    }

    /* renamed from: j */
    public final int m21618j() {
        for (int i10 = 1; i10 < this.f20311c; i10 += 2) {
            int m21620l = m21620l(i10);
            if (m21620l != -1 && m21615h(f20308f, f20306d[m21620l])) {
                int i11 = 0;
                for (int i12 = i10; i12 < i10 + 7; i12++) {
                    i11 += this.f20310b[i12];
                }
                if (i10 == 1 || this.f20310b[i10 - 1] >= i11 / 2) {
                    return i10;
                }
            }
        }
        throw C2678j.m10895a();
    }

    /* renamed from: k */
    public final void m21619k(C3964a c3964a) {
        int i10 = 0;
        this.f20311c = 0;
        int m15025h = c3964a.m15025h(0);
        int m15026i = c3964a.m15026i();
        if (m15025h >= m15026i) {
            throw C2678j.m10895a();
        }
        boolean z10 = true;
        while (m15025h < m15026i) {
            if (c3964a.m15022e(m15025h) != z10) {
                i10++;
            } else {
                m21617i(i10);
                z10 = !z10;
                i10 = 1;
            }
            m15025h++;
        }
        m21617i(i10);
    }

    /* renamed from: l */
    public final int m21620l(int i10) {
        int i11 = i10 + 7;
        if (i11 >= this.f20311c) {
            return -1;
        }
        int[] iArr = this.f20310b;
        int i12 = C1841a.e.API_PRIORITY_OTHER;
        int i13 = 0;
        int i14 = Integer.MAX_VALUE;
        int i15 = 0;
        for (int i16 = i10; i16 < i11; i16 += 2) {
            int i17 = iArr[i16];
            if (i17 < i14) {
                i14 = i17;
            }
            if (i17 > i15) {
                i15 = i17;
            }
        }
        int i18 = (i14 + i15) / 2;
        int i19 = 0;
        for (int i20 = i10 + 1; i20 < i11; i20 += 2) {
            int i21 = iArr[i20];
            if (i21 < i12) {
                i12 = i21;
            }
            if (i21 > i19) {
                i19 = i21;
            }
        }
        int i22 = (i12 + i19) / 2;
        int i23 = 128;
        int i24 = 0;
        for (int i25 = 0; i25 < 7; i25++) {
            i23 >>= 1;
            if (iArr[i10 + i25] > ((i25 & 1) == 0 ? i18 : i22)) {
                i24 |= i23;
            }
        }
        while (true) {
            int[] iArr2 = f20307e;
            if (i13 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i13] == i24) {
                return i13;
            }
            i13++;
        }
    }

    /* renamed from: m */
    public final void m21621m(int i10) {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f20309a.length() - 1;
        int i11 = i10;
        int i12 = 0;
        while (true) {
            if (i12 > length) {
                break;
            }
            int i13 = f20307e[this.f20309a.charAt(i12)];
            for (int i14 = 6; i14 >= 0; i14--) {
                int i15 = (i14 & 1) + ((i13 & 1) * 2);
                iArr[i15] = iArr[i15] + this.f20310b[i11 + i14];
                iArr2[i15] = iArr2[i15] + 1;
                i13 >>= 1;
            }
            i11 += 8;
            i12++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i16 = 0; i16 < 2; i16++) {
            fArr2[i16] = 0.0f;
            int i17 = i16 + 2;
            fArr2[i17] = ((iArr[i16] / iArr2[i16]) + (iArr[i17] / iArr2[i17])) / 2.0f;
            fArr[i16] = fArr2[i17];
            fArr[i17] = ((iArr[i17] * 2.0f) + 1.5f) / iArr2[i17];
        }
        for (int i18 = 0; i18 <= length; i18++) {
            int i19 = f20307e[this.f20309a.charAt(i18)];
            for (int i20 = 6; i20 >= 0; i20--) {
                int i21 = (i20 & 1) + ((i19 & 1) * 2);
                float f10 = this.f20310b[i10 + i20];
                if (f10 < fArr2[i21] || f10 > fArr[i21]) {
                    throw C2678j.m10895a();
                }
                i19 >>= 1;
            }
            i10 += 8;
        }
    }
}
