package p324wa;

import java.util.Map;
import p129ia.C2674f;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;
import p129ia.EnumC2683o;
import p211oa.C3964a;

/* renamed from: wa.h */
/* loaded from: classes.dex */
public final class C5458h extends AbstractC5461k {

    /* renamed from: b */
    public static final int[] f20328b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    public static final int[] f20329c = {1, 1, 1, 1};

    /* renamed from: d */
    public static final int[][] f20330d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e */
    public static final int[][] f20331e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    public int f20332a = -1;

    /* renamed from: h */
    public static int m21640h(int[] iArr) {
        int length = f20331e.length;
        float f10 = 0.38f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float m21647e = AbstractC5461k.m21647e(iArr, f20331e[i11], 0.5f);
            if (m21647e < f10) {
                i10 = i11;
                f10 = m21647e;
            } else if (m21647e == f10) {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            return i10 % 10;
        }
        throw C2678j.m10895a();
    }

    /* renamed from: j */
    public static void m21641j(C3964a c3964a, int i10, int i11, StringBuilder sb2) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i10 < i11) {
            AbstractC5461k.m21648f(c3964a, i10, iArr);
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = i12 * 2;
                iArr2[i12] = iArr[i13];
                iArr3[i12] = iArr[i13 + 1];
            }
            sb2.append((char) (m21640h(iArr2) + 48));
            sb2.append((char) (m21640h(iArr3) + 48));
            for (int i14 = 0; i14 < 10; i14++) {
                i10 += iArr[i14];
            }
        }
    }

    /* renamed from: l */
    public static int[] m21642l(C3964a c3964a, int i10, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int m15026i = c3964a.m15026i();
        int i11 = i10;
        boolean z10 = false;
        int i12 = 0;
        while (i10 < m15026i) {
            if (c3964a.m15022e(i10) != z10) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else {
                    if (AbstractC5461k.m21647e(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i11, i10};
                    }
                    i11 += iArr2[0] + iArr2[1];
                    int i13 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z10 = !z10;
            }
            i10++;
        }
        throw C2678j.m10895a();
    }

    /* renamed from: m */
    public static int m21643m(C3964a c3964a) {
        int m15026i = c3964a.m15026i();
        int m15024g = c3964a.m15024g(0);
        if (m15024g != m15026i) {
            return m15024g;
        }
        throw C2678j.m10895a();
    }

    @Override // p324wa.AbstractC5461k
    /* renamed from: c */
    public C2682n mo21616c(int i10, C3964a c3964a, Map<EnumC2673e, ?> map) {
        boolean z10;
        int[] m21645k = m21645k(c3964a);
        int[] m21644i = m21644i(c3964a);
        StringBuilder sb2 = new StringBuilder(20);
        m21641j(c3964a, m21645k[1], m21644i[0], sb2);
        String sb3 = sb2.toString();
        int[] iArr = map != null ? (int[]) map.get(EnumC2673e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f20328b;
        }
        int length = sb3.length();
        int length2 = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= length2) {
                z10 = false;
                break;
            }
            int i13 = iArr[i11];
            if (length == i13) {
                z10 = true;
                break;
            }
            if (i13 > i12) {
                i12 = i13;
            }
            i11++;
        }
        if (!z10 && length > i12) {
            z10 = true;
        }
        if (!z10) {
            throw C2674f.m10883a();
        }
        float f10 = i10;
        C2682n c2682n = new C2682n(sb3, null, new C2684p[]{new C2684p(m21645k[1], f10), new C2684p(m21644i[0], f10)}, EnumC2669a.ITF);
        c2682n.m10904h(EnumC2683o.SYMBOLOGY_IDENTIFIER, "]I0");
        return c2682n;
    }

    /* renamed from: i */
    public final int[] m21644i(C3964a c3964a) {
        int[] m21642l;
        c3964a.m15028m();
        try {
            int m21643m = m21643m(c3964a);
            try {
                m21642l = m21642l(c3964a, m21643m, f20330d[0]);
            } catch (C2678j unused) {
                m21642l = m21642l(c3964a, m21643m, f20330d[1]);
            }
            m21646n(c3964a, m21642l[0]);
            int i10 = m21642l[0];
            m21642l[0] = c3964a.m15026i() - m21642l[1];
            m21642l[1] = c3964a.m15026i() - i10;
            return m21642l;
        } finally {
            c3964a.m15028m();
        }
    }

    /* renamed from: k */
    public final int[] m21645k(C3964a c3964a) {
        int[] m21642l = m21642l(c3964a, m21643m(c3964a), f20329c);
        this.f20332a = (m21642l[1] - m21642l[0]) / 4;
        m21646n(c3964a, m21642l[0]);
        return m21642l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m21646n(p211oa.C3964a r3, int r4) {
        /*
            r2 = this;
            int r0 = r2.f20332a
            int r0 = r0 * 10
            int r0 = java.lang.Math.min(r0, r4)
            int r4 = r4 + (-1)
        La:
            if (r0 <= 0) goto L1a
            if (r4 < 0) goto L1a
            boolean r1 = r3.m15022e(r4)
            if (r1 == 0) goto L15
            goto L1a
        L15:
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto La
        L1a:
            if (r0 != 0) goto L1d
            return
        L1d:
            ia.j r3 = p129ia.C2678j.m10895a()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p324wa.C5458h.m21646n(oa.a, int):void");
    }
}
