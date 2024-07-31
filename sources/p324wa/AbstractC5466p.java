package p324wa;

import java.util.Arrays;
import java.util.Map;
import p129ia.AbstractC2681m;
import p129ia.C2672d;
import p129ia.C2674f;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;
import p129ia.EnumC2683o;
import p129ia.InterfaceC2685q;
import p211oa.C3964a;

/* renamed from: wa.p */
/* loaded from: classes.dex */
public abstract class AbstractC5466p extends AbstractC5461k {

    /* renamed from: d */
    public static final int[] f20346d = {1, 1, 1};

    /* renamed from: e */
    public static final int[] f20347e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    public static final int[] f20348f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g */
    public static final int[][] f20349g;

    /* renamed from: h */
    public static final int[][] f20350h;

    /* renamed from: a */
    public final StringBuilder f20351a = new StringBuilder(20);

    /* renamed from: b */
    public final C5465o f20352b = new C5465o();

    /* renamed from: c */
    public final C5457g f20353c = new C5457g();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f20349g = iArr;
        int[][] iArr2 = new int[20];
        f20350h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f20349g[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f20350h[i10] = iArr4;
        }
    }

    /* renamed from: i */
    public static boolean m21663i(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return m21668r(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    /* renamed from: j */
    public static int m21664j(C3964a c3964a, int[] iArr, int i10, int[][] iArr2) {
        AbstractC5461k.m21648f(c3964a, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.48f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float m21647e = AbstractC5461k.m21647e(iArr, iArr2[i12], 0.7f);
            if (m21647e < f10) {
                i11 = i12;
                f10 = m21647e;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw C2678j.m10895a();
    }

    /* renamed from: n */
    public static int[] m21665n(C3964a c3964a, int i10, boolean z10, int[] iArr) {
        return m21666o(c3964a, i10, z10, iArr, new int[iArr.length]);
    }

    /* renamed from: o */
    public static int[] m21666o(C3964a c3964a, int i10, boolean z10, int[] iArr, int[] iArr2) {
        int m15026i = c3964a.m15026i();
        int m15025h = z10 ? c3964a.m15025h(i10) : c3964a.m15024g(i10);
        int length = iArr.length;
        boolean z11 = z10;
        int i11 = 0;
        int i12 = m15025h;
        while (m15025h < m15026i) {
            if (c3964a.m15022e(m15025h) != z11) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (AbstractC5461k.m21647e(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i12, m15025h};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z11 = !z11;
            }
            m15025h++;
        }
        throw C2678j.m10895a();
    }

    /* renamed from: p */
    public static int[] m21667p(C3964a c3964a) {
        int[] iArr = new int[f20346d.length];
        int[] iArr2 = null;
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            int[] iArr3 = f20346d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m21666o(c3964a, i10, false, iArr3, iArr);
            int i11 = iArr2[0];
            int i12 = iArr2[1];
            int i13 = i11 - (i12 - i11);
            if (i13 >= 0) {
                z10 = c3964a.m15027k(i13, i11, false);
            }
            i10 = i12;
        }
        return iArr2;
    }

    /* renamed from: r */
    public static int m21668r(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int charAt = charSequence.charAt(i11) - '0';
            if (charAt < 0 || charAt > 9) {
                throw C2674f.m10883a();
            }
            i10 += charAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int charAt2 = charSequence.charAt(i13) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw C2674f.m10883a();
            }
            i12 += charAt2;
        }
        return (1000 - i12) % 10;
    }

    @Override // p324wa.AbstractC5461k
    /* renamed from: c */
    public C2682n mo21616c(int i10, C3964a c3964a, Map<EnumC2673e, ?> map) {
        return mo21652m(i10, c3964a, m21667p(c3964a), map);
    }

    /* renamed from: h */
    public boolean mo21669h(String str) {
        return m21663i(str);
    }

    /* renamed from: k */
    public int[] mo21670k(C3964a c3964a, int i10) {
        return m21665n(c3964a, i10, false, f20346d);
    }

    /* renamed from: l */
    public abstract int mo21635l(C3964a c3964a, int[] iArr, StringBuilder sb2);

    /* renamed from: m */
    public C2682n mo21652m(int i10, C3964a c3964a, int[] iArr, Map<EnumC2673e, ?> map) {
        int i11;
        String m21639c;
        InterfaceC2685q interfaceC2685q = map == null ? null : (InterfaceC2685q) map.get(EnumC2673e.NEED_RESULT_POINT_CALLBACK);
        boolean z10 = true;
        if (interfaceC2685q != null) {
            interfaceC2685q.mo9828a(new C2684p((iArr[0] + iArr[1]) / 2.0f, i10));
        }
        StringBuilder sb2 = this.f20351a;
        sb2.setLength(0);
        int mo21635l = mo21635l(c3964a, iArr, sb2);
        if (interfaceC2685q != null) {
            interfaceC2685q.mo9828a(new C2684p(mo21635l, i10));
        }
        int[] mo21670k = mo21670k(c3964a, mo21635l);
        if (interfaceC2685q != null) {
            interfaceC2685q.mo9828a(new C2684p((mo21670k[0] + mo21670k[1]) / 2.0f, i10));
        }
        int i12 = mo21670k[1];
        int i13 = (i12 - mo21670k[0]) + i12;
        if (i13 >= c3964a.m15026i() || !c3964a.m15027k(i12, i13, false)) {
            throw C2678j.m10895a();
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 8) {
            throw C2674f.m10883a();
        }
        if (!mo21669h(sb3)) {
            throw C2672d.m10881a();
        }
        EnumC2669a mo21636q = mo21636q();
        float f10 = i10;
        C2682n c2682n = new C2682n(sb3, null, new C2684p[]{new C2684p((iArr[1] + iArr[0]) / 2.0f, f10), new C2684p((mo21670k[1] + mo21670k[0]) / 2.0f, f10)}, mo21636q);
        try {
            C2682n m21662a = this.f20352b.m21662a(i10, c3964a, mo21670k[1]);
            c2682n.m10904h(EnumC2683o.UPC_EAN_EXTENSION, m21662a.m10902f());
            c2682n.m10903g(m21662a.m10900d());
            c2682n.m10897a(m21662a.m10901e());
            i11 = m21662a.m10902f().length();
        } catch (AbstractC2681m unused) {
            i11 = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(EnumC2673e.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            int length = iArr2.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    z10 = false;
                    break;
                }
                if (i11 == iArr2[i14]) {
                    break;
                }
                i14++;
            }
            if (!z10) {
                throw C2678j.m10895a();
            }
        }
        if ((mo21636q == EnumC2669a.EAN_13 || mo21636q == EnumC2669a.UPC_A) && (m21639c = this.f20353c.m21639c(sb3)) != null) {
            c2682n.m10904h(EnumC2683o.POSSIBLE_COUNTRY, m21639c);
        }
        int i15 = mo21636q == EnumC2669a.EAN_8 ? 4 : 0;
        c2682n.m10904h(EnumC2683o.SYMBOLOGY_IDENTIFIER, "]E" + i15);
        return c2682n;
    }

    /* renamed from: q */
    public abstract EnumC2669a mo21636q();
}
