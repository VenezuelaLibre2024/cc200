package p340xa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;
import p129ia.EnumC2683o;
import p129ia.InterfaceC2685q;
import p211oa.C3964a;
import p324wa.AbstractC5461k;
import pa.C4104a;

/* renamed from: xa.e */
/* loaded from: classes.dex */
public final class C5745e extends AbstractC5741a {

    /* renamed from: i */
    public static final int[] f21297i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    public static final int[] f21298j = {4, 20, 48, 81};

    /* renamed from: k */
    public static final int[] f21299k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    public static final int[] f21300l = {0, 336, 1036, 1516};

    /* renamed from: m */
    public static final int[] f21301m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    public static final int[] f21302n = {2, 4, 6, 8};

    /* renamed from: o */
    public static final int[][] f21303o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    public final List<C5744d> f21304g = new ArrayList();

    /* renamed from: h */
    public final List<C5744d> f21305h = new ArrayList();

    /* renamed from: r */
    public static void m22859r(Collection<C5744d> collection, C5744d c5744d) {
        if (c5744d == null) {
            return;
        }
        boolean z10 = false;
        Iterator<C5744d> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C5744d next = it.next();
            if (next.m22852b() == c5744d.m22852b()) {
                next.m22858e();
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        collection.add(c5744d);
    }

    /* renamed from: t */
    public static boolean m22860t(C5744d c5744d, C5744d c5744d2) {
        int m22851a = (c5744d.m22851a() + (c5744d2.m22851a() * 16)) % 79;
        int m22855c = (c5744d.m22857d().m22855c() * 9) + c5744d2.m22857d().m22855c();
        if (m22855c > 72) {
            m22855c--;
        }
        if (m22855c > 8) {
            m22855c--;
        }
        return m22851a == m22855c;
    }

    /* renamed from: u */
    public static C2682n m22861u(C5744d c5744d, C5744d c5744d2) {
        String valueOf = String.valueOf((c5744d.m22852b() * 4537077) + c5744d2.m22852b());
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        int i10 = 0;
        for (int i11 = 0; i11 < 13; i11++) {
            int charAt = sb2.charAt(i11) - '0';
            if ((i11 & 1) == 0) {
                charAt *= 3;
            }
            i10 += charAt;
        }
        int i12 = 10 - (i10 % 10);
        if (i12 == 10) {
            i12 = 0;
        }
        sb2.append(i12);
        C2684p[] m22853a = c5744d.m22857d().m22853a();
        C2684p[] m22853a2 = c5744d2.m22857d().m22853a();
        C2682n c2682n = new C2682n(sb2.toString(), null, new C2684p[]{m22853a[0], m22853a[1], m22853a2[0], m22853a2[1]}, EnumC2669a.RSS_14);
        c2682n.m10904h(EnumC2683o.SYMBOLOGY_IDENTIFIER, "]e0");
        return c2682n;
    }

    @Override // p324wa.AbstractC5461k
    /* renamed from: c */
    public C2682n mo21616c(int i10, C3964a c3964a, Map<EnumC2673e, ?> map) {
        m22859r(this.f21304g, m22864w(c3964a, false, i10, map));
        c3964a.m15028m();
        m22859r(this.f21305h, m22864w(c3964a, true, i10, map));
        c3964a.m15028m();
        for (C5744d c5744d : this.f21304g) {
            if (c5744d.m22856c() > 1) {
                for (C5744d c5744d2 : this.f21305h) {
                    if (c5744d2.m22856c() > 1 && m22860t(c5744d, c5744d2)) {
                        return m22861u(c5744d, c5744d2);
                    }
                }
            }
        }
        throw C2678j.m10895a();
    }

    @Override // p324wa.AbstractC5461k, p129ia.InterfaceC2680l
    public void reset() {
        this.f21304g.clear();
        this.f21305h.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0041, code lost:
    
        r5 = false;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x003f, code lost:
    
        if (r1 < 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r1 < 4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        r2 = false;
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22862s(boolean r10, int r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p340xa.C5745e.m22862s(boolean, int):void");
    }

    /* renamed from: v */
    public final C5742b m22863v(C3964a c3964a, C5743c c5743c, boolean z10) {
        int[] m22845i = m22845i();
        Arrays.fill(m22845i, 0);
        int[] m22854b = c5743c.m22854b();
        if (z10) {
            AbstractC5461k.m21649g(c3964a, m22854b[0], m22845i);
        } else {
            AbstractC5461k.m21648f(c3964a, m22854b[1], m22845i);
            int i10 = 0;
            for (int length = m22845i.length - 1; i10 < length; length--) {
                int i11 = m22845i[i10];
                m22845i[i10] = m22845i[length];
                m22845i[length] = i11;
                i10++;
            }
        }
        int i12 = z10 ? 16 : 15;
        float m15856d = C4104a.m15856d(m22845i) / i12;
        int[] m22849m = m22849m();
        int[] m22847k = m22847k();
        float[] m22850n = m22850n();
        float[] m22848l = m22848l();
        for (int i13 = 0; i13 < m22845i.length; i13++) {
            float f10 = m22845i[i13] / m15856d;
            int i14 = (int) (0.5f + f10);
            if (i14 < 1) {
                i14 = 1;
            } else if (i14 > 8) {
                i14 = 8;
            }
            int i15 = i13 / 2;
            if ((i13 & 1) == 0) {
                m22849m[i15] = i14;
                m22850n[i15] = f10 - i14;
            } else {
                m22847k[i15] = i14;
                m22848l[i15] = f10 - i14;
            }
        }
        m22862s(z10, i12);
        int i16 = 0;
        int i17 = 0;
        for (int length2 = m22849m.length - 1; length2 >= 0; length2--) {
            i16 = (i16 * 9) + m22849m[length2];
            i17 += m22849m[length2];
        }
        int i18 = 0;
        int i19 = 0;
        for (int length3 = m22847k.length - 1; length3 >= 0; length3--) {
            i18 = (i18 * 9) + m22847k[length3];
            i19 += m22847k[length3];
        }
        int i20 = i16 + (i18 * 3);
        if (!z10) {
            if ((i19 & 1) != 0 || i19 > 10 || i19 < 4) {
                throw C2678j.m10895a();
            }
            int i21 = (10 - i19) / 2;
            int i22 = f21302n[i21];
            return new C5742b((C5746f.m22868b(m22847k, 9 - i22, false) * f21298j[i21]) + C5746f.m22868b(m22849m, i22, true) + f21300l[i21], i20);
        }
        if ((i17 & 1) != 0 || i17 > 12 || i17 < 4) {
            throw C2678j.m10895a();
        }
        int i23 = (12 - i17) / 2;
        int i24 = f21301m[i23];
        return new C5742b((C5746f.m22868b(m22849m, i24, false) * f21297i[i23]) + C5746f.m22868b(m22847k, 9 - i24, true) + f21299k[i23], i20);
    }

    /* renamed from: w */
    public final C5744d m22864w(C3964a c3964a, boolean z10, int i10, Map<EnumC2673e, ?> map) {
        try {
            C5743c m22866y = m22866y(c3964a, i10, z10, m22865x(c3964a, z10));
            InterfaceC2685q interfaceC2685q = map == null ? null : (InterfaceC2685q) map.get(EnumC2673e.NEED_RESULT_POINT_CALLBACK);
            if (interfaceC2685q != null) {
                int[] m22854b = m22866y.m22854b();
                float f10 = ((m22854b[0] + m22854b[1]) - 1) / 2.0f;
                if (z10) {
                    f10 = (c3964a.m15026i() - 1) - f10;
                }
                interfaceC2685q.mo9828a(new C2684p(f10, i10));
            }
            C5742b m22863v = m22863v(c3964a, m22866y, true);
            C5742b m22863v2 = m22863v(c3964a, m22866y, false);
            return new C5744d((m22863v.m22852b() * 1597) + m22863v2.m22852b(), m22863v.m22851a() + (m22863v2.m22851a() * 4), m22866y);
        } catch (C2678j unused) {
            return null;
        }
    }

    /* renamed from: x */
    public final int[] m22865x(C3964a c3964a, boolean z10) {
        int[] m22846j = m22846j();
        m22846j[0] = 0;
        m22846j[1] = 0;
        m22846j[2] = 0;
        m22846j[3] = 0;
        int m15026i = c3964a.m15026i();
        int i10 = 0;
        boolean z11 = false;
        while (i10 < m15026i) {
            z11 = !c3964a.m15022e(i10);
            if (z10 == z11) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        int i12 = i10;
        while (i10 < m15026i) {
            if (c3964a.m15022e(i10) != z11) {
                m22846j[i11] = m22846j[i11] + 1;
            } else {
                if (i11 != 3) {
                    i11++;
                } else {
                    if (AbstractC5741a.m22843p(m22846j)) {
                        return new int[]{i12, i10};
                    }
                    i12 += m22846j[0] + m22846j[1];
                    m22846j[0] = m22846j[2];
                    m22846j[1] = m22846j[3];
                    m22846j[2] = 0;
                    m22846j[3] = 0;
                    i11--;
                }
                m22846j[i11] = 1;
                z11 = !z11;
            }
            i10++;
        }
        throw C2678j.m10895a();
    }

    /* renamed from: y */
    public final C5743c m22866y(C3964a c3964a, int i10, boolean z10, int[] iArr) {
        int i11;
        int i12;
        boolean m15022e = c3964a.m15022e(iArr[0]);
        int i13 = iArr[0] - 1;
        while (i13 >= 0 && m15022e != c3964a.m15022e(i13)) {
            i13--;
        }
        int i14 = i13 + 1;
        int i15 = iArr[0] - i14;
        int[] m22846j = m22846j();
        System.arraycopy(m22846j, 0, m22846j, 1, m22846j.length - 1);
        m22846j[0] = i15;
        int m22844q = AbstractC5741a.m22844q(m22846j, f21303o);
        int i16 = iArr[1];
        if (z10) {
            int m15026i = (c3964a.m15026i() - 1) - i14;
            i11 = (c3964a.m15026i() - 1) - i16;
            i12 = m15026i;
        } else {
            i11 = i16;
            i12 = i14;
        }
        return new C5743c(m22844q, new int[]{i14, iArr[1]}, i12, i11, i10);
    }
}
