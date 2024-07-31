package p356ya;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;
import p129ia.EnumC2683o;
import p211oa.C3964a;
import p324wa.AbstractC5461k;
import p340xa.AbstractC5741a;
import p340xa.C5742b;
import p340xa.C5743c;
import p340xa.C5746f;
import pa.C4104a;
import za.AbstractC6106j;

/* renamed from: ya.d */
/* loaded from: classes.dex */
public final class C5904d extends AbstractC5741a {

    /* renamed from: k */
    public static final int[] f21977k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    public static final int[] f21978l = {4, 20, 52, C1417R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 204};

    /* renamed from: m */
    public static final int[] f21979m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    public static final int[][] f21980n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    public static final int[][] f21981o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle}, new int[]{C1417R.styleable.AppCompatTheme_toolbarStyle, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, C1417R.styleable.AppCompatTheme_textColorSearchUrl, 122, 155}, new int[]{43, 129, 176, C1417R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, C1417R.styleable.AppCompatTheme_textColorAlertDialogListItem, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{C1417R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 116, 137, 200, 178, C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, C1417R.styleable.AppCompatTheme_tooltipFrameBackground}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{C1417R.styleable.AppCompatTheme_textAppearanceListItem, 98, 83, 38, C1417R.styleable.AppCompatTheme_tooltipForegroundColor, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    public static final int[][] f21982p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    public final List<C5902b> f21983g = new ArrayList(11);

    /* renamed from: h */
    public final List<C5903c> f21984h = new ArrayList();

    /* renamed from: i */
    public final int[] f21985i = new int[2];

    /* renamed from: j */
    public boolean f21986j;

    /* renamed from: A */
    public static boolean m23614A(C5743c c5743c, boolean z10, boolean z11) {
        return (c5743c.m22855c() == 0 && z10 && z11) ? false : true;
    }

    /* renamed from: B */
    public static boolean m23615B(Iterable<C5902b> iterable, Iterable<C5903c> iterable2) {
        boolean z10;
        boolean z11;
        Iterator<C5903c> it = iterable2.iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            C5903c next = it.next();
            Iterator<C5902b> it2 = iterable.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z10 = true;
                    break;
                }
                C5902b next2 = it2.next();
                Iterator<C5902b> it3 = next.m23611a().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z11 = false;
                        break;
                    }
                    if (next2.equals(it3.next())) {
                        z11 = true;
                        break;
                    }
                }
                if (!z11) {
                    break;
                }
            }
        } while (!z10);
        return true;
    }

    /* renamed from: C */
    public static boolean m23616C(List<C5902b> list) {
        boolean z10;
        for (int[] iArr : f21982p) {
            if (list.size() <= iArr.length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        z10 = true;
                        break;
                    }
                    if (list.get(i10).m23607a().m22855c() != iArr[i10]) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    public static void m23617E(Collection<C5902b> collection, Collection<C5903c> collection2) {
        Iterator<C5903c> it = collection2.iterator();
        while (it.hasNext()) {
            C5903c next = it.next();
            if (next.m23611a().size() != collection.size()) {
                boolean z10 = true;
                Iterator<C5902b> it2 = next.m23611a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!collection.contains(it2.next())) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: G */
    public static void m23618G(int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length / 2; i10++) {
            int i11 = iArr[i10];
            int i12 = (length - i10) - 1;
            iArr[i10] = iArr[i12];
            iArr[i12] = i11;
        }
    }

    /* renamed from: v */
    public static C2682n m23619v(List<C5902b> list) {
        String mo24350d = AbstractC6106j.m24356a(C5901a.m23606a(list)).mo24350d();
        C2684p[] m22853a = list.get(0).m23607a().m22853a();
        C2684p[] m22853a2 = list.get(list.size() - 1).m23607a().m22853a();
        C2682n c2682n = new C2682n(mo24350d, null, new C2684p[]{m22853a[0], m22853a[1], m22853a2[0], m22853a2[1]}, EnumC2669a.RSS_EXPANDED);
        c2682n.m10904h(EnumC2683o.SYMBOLOGY_IDENTIFIER, "]e0");
        return c2682n;
    }

    /* renamed from: z */
    public static int m23620z(C3964a c3964a, int i10) {
        return c3964a.m15022e(i10) ? c3964a.m15024g(c3964a.m15025h(i10)) : c3964a.m15025h(c3964a.m15024g(i10));
    }

    /* renamed from: D */
    public final C5743c m23621D(C3964a c3964a, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        if (z10) {
            int i14 = this.f21985i[0] - 1;
            while (i14 >= 0 && !c3964a.m15022e(i14)) {
                i14--;
            }
            int i15 = i14 + 1;
            int[] iArr = this.f21985i;
            i13 = iArr[0] - i15;
            i11 = iArr[1];
            i12 = i15;
        } else {
            int[] iArr2 = this.f21985i;
            int i16 = iArr2[0];
            int m15025h = c3964a.m15025h(iArr2[1] + 1);
            i11 = m15025h;
            i12 = i16;
            i13 = m15025h - this.f21985i[1];
        }
        int[] m22846j = m22846j();
        System.arraycopy(m22846j, 0, m22846j, 1, m22846j.length - 1);
        m22846j[0] = i13;
        try {
            return new C5743c(AbstractC5741a.m22844q(m22846j, f21980n), new int[]{i12, i11}, i12, i11, i10);
        } catch (C2678j unused) {
            return null;
        }
    }

    /* renamed from: F */
    public C5902b m23622F(C3964a c3964a, List<C5902b> list, int i10) {
        C5743c m23621D;
        C5742b c5742b;
        boolean z10 = list.size() % 2 == 0;
        if (this.f21986j) {
            z10 = !z10;
        }
        int i11 = -1;
        boolean z11 = true;
        do {
            m23630y(c3964a, list, i11);
            m23621D = m23621D(c3964a, i10, z10);
            if (m23621D == null) {
                i11 = m23620z(c3964a, this.f21985i[0]);
            } else {
                z11 = false;
            }
        } while (z11);
        C5742b m23628w = m23628w(c3964a, m23621D, z10, true);
        if (!list.isEmpty() && list.get(list.size() - 1).m23610d()) {
            throw C2678j.m10895a();
        }
        try {
            c5742b = m23628w(c3964a, m23621D, z10, false);
        } catch (C2678j unused) {
            c5742b = null;
        }
        return new C5902b(m23628w, c5742b, m23621D);
    }

    /* renamed from: H */
    public final void m23623H(int i10) {
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            if (i11 >= this.f21984h.size()) {
                break;
            }
            C5903c c5903c = this.f21984h.get(i11);
            if (c5903c.m23612b() > i10) {
                z10 = c5903c.m23613c(this.f21983g);
                break;
            } else {
                z11 = c5903c.m23613c(this.f21983g);
                i11++;
            }
        }
        if (z10 || z11 || m23615B(this.f21983g, this.f21984h)) {
            return;
        }
        this.f21984h.add(i11, new C5903c(this.f21983g, i10));
        m23617E(this.f21983g, this.f21984h);
    }

    @Override // p324wa.AbstractC5461k
    /* renamed from: c */
    public C2682n mo21616c(int i10, C3964a c3964a, Map<EnumC2673e, ?> map) {
        this.f21983g.clear();
        this.f21986j = false;
        try {
            return m23619v(m23629x(i10, c3964a));
        } catch (C2678j unused) {
            this.f21983g.clear();
            this.f21986j = true;
            return m23619v(m23629x(i10, c3964a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m23624r(int r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p356ya.C5904d.m23624r(int):void");
    }

    @Override // p324wa.AbstractC5461k, p129ia.InterfaceC2680l
    public void reset() {
        this.f21983g.clear();
        this.f21984h.clear();
    }

    /* renamed from: s */
    public final boolean m23625s() {
        C5902b c5902b = this.f21983g.get(0);
        C5742b m23608b = c5902b.m23608b();
        C5742b m23609c = c5902b.m23609c();
        if (m23609c == null) {
            return false;
        }
        int m22851a = m23609c.m22851a();
        int i10 = 2;
        for (int i11 = 1; i11 < this.f21983g.size(); i11++) {
            C5902b c5902b2 = this.f21983g.get(i11);
            m22851a += c5902b2.m23608b().m22851a();
            i10++;
            C5742b m23609c2 = c5902b2.m23609c();
            if (m23609c2 != null) {
                m22851a += m23609c2.m22851a();
                i10++;
            }
        }
        return ((i10 + (-4)) * 211) + (m22851a % 211) == m23608b.m22852b();
    }

    /* renamed from: t */
    public final List<C5902b> m23626t(List<C5903c> list, int i10) {
        while (i10 < this.f21984h.size()) {
            C5903c c5903c = this.f21984h.get(i10);
            this.f21983g.clear();
            Iterator<C5903c> it = list.iterator();
            while (it.hasNext()) {
                this.f21983g.addAll(it.next().m23611a());
            }
            this.f21983g.addAll(c5903c.m23611a());
            if (m23616C(this.f21983g)) {
                if (m23625s()) {
                    return this.f21983g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(c5903c);
                try {
                    return m23626t(arrayList, i10 + 1);
                } catch (C2678j unused) {
                    continue;
                }
            }
            i10++;
        }
        throw C2678j.m10895a();
    }

    /* renamed from: u */
    public final List<C5902b> m23627u(boolean z10) {
        List<C5902b> list = null;
        if (this.f21984h.size() > 25) {
            this.f21984h.clear();
            return null;
        }
        this.f21983g.clear();
        if (z10) {
            Collections.reverse(this.f21984h);
        }
        try {
            list = m23626t(new ArrayList(), 0);
        } catch (C2678j unused) {
        }
        if (z10) {
            Collections.reverse(this.f21984h);
        }
        return list;
    }

    /* renamed from: w */
    public C5742b m23628w(C3964a c3964a, C5743c c5743c, boolean z10, boolean z11) {
        int[] m22845i = m22845i();
        Arrays.fill(m22845i, 0);
        int[] m22854b = c5743c.m22854b();
        if (z11) {
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
        float m15856d = C4104a.m15856d(m22845i) / 17;
        float f10 = (c5743c.m22854b()[1] - c5743c.m22854b()[0]) / 15.0f;
        if (Math.abs(m15856d - f10) / f10 > 0.3f) {
            throw C2678j.m10895a();
        }
        int[] m22849m = m22849m();
        int[] m22847k = m22847k();
        float[] m22850n = m22850n();
        float[] m22848l = m22848l();
        for (int i12 = 0; i12 < m22845i.length; i12++) {
            float f11 = (m22845i[i12] * 1.0f) / m15856d;
            int i13 = (int) (0.5f + f11);
            if (i13 < 1) {
                if (f11 < 0.3f) {
                    throw C2678j.m10895a();
                }
                i13 = 1;
            } else if (i13 > 8) {
                if (f11 > 8.7f) {
                    throw C2678j.m10895a();
                }
                i13 = 8;
            }
            int i14 = i12 / 2;
            if ((i12 & 1) == 0) {
                m22849m[i14] = i13;
                m22850n[i14] = f11 - i13;
            } else {
                m22847k[i14] = i13;
                m22848l[i14] = f11 - i13;
            }
        }
        m23624r(17);
        int m22855c = (((c5743c.m22855c() * 4) + (z10 ? 0 : 2)) + (!z11 ? 1 : 0)) - 1;
        int i15 = 0;
        int i16 = 0;
        for (int length2 = m22849m.length - 1; length2 >= 0; length2--) {
            if (m23614A(c5743c, z10, z11)) {
                i15 += m22849m[length2] * f21981o[m22855c][length2 * 2];
            }
            i16 += m22849m[length2];
        }
        int i17 = 0;
        for (int length3 = m22847k.length - 1; length3 >= 0; length3--) {
            if (m23614A(c5743c, z10, z11)) {
                i17 += m22847k[length3] * f21981o[m22855c][(length3 * 2) + 1];
            }
        }
        int i18 = i15 + i17;
        if ((i16 & 1) != 0 || i16 > 13 || i16 < 4) {
            throw C2678j.m10895a();
        }
        int i19 = (13 - i16) / 2;
        int i20 = f21977k[i19];
        return new C5742b((C5746f.m22868b(m22849m, i20, true) * f21978l[i19]) + C5746f.m22868b(m22847k, 9 - i20, false) + f21979m[i19], i18);
    }

    /* renamed from: x */
    public List<C5902b> m23629x(int i10, C3964a c3964a) {
        boolean z10 = false;
        while (!z10) {
            try {
                List<C5902b> list = this.f21983g;
                list.add(m23622F(c3964a, list, i10));
            } catch (C2678j e10) {
                if (this.f21983g.isEmpty()) {
                    throw e10;
                }
                z10 = true;
            }
        }
        if (m23625s()) {
            return this.f21983g;
        }
        boolean z11 = !this.f21984h.isEmpty();
        m23623H(i10);
        if (z11) {
            List<C5902b> m23627u = m23627u(false);
            if (m23627u != null) {
                return m23627u;
            }
            List<C5902b> m23627u2 = m23627u(true);
            if (m23627u2 != null) {
                return m23627u2;
            }
        }
        throw C2678j.m10895a();
    }

    /* renamed from: y */
    public final void m23630y(C3964a c3964a, List<C5902b> list, int i10) {
        int[] m22846j = m22846j();
        m22846j[0] = 0;
        m22846j[1] = 0;
        m22846j[2] = 0;
        m22846j[3] = 0;
        int m15026i = c3964a.m15026i();
        if (i10 < 0) {
            i10 = list.isEmpty() ? 0 : list.get(list.size() - 1).m23607a().m22854b()[1];
        }
        boolean z10 = list.size() % 2 != 0;
        if (this.f21986j) {
            z10 = !z10;
        }
        boolean z11 = false;
        while (i10 < m15026i) {
            z11 = !c3964a.m15022e(i10);
            if (!z11) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = 0;
        boolean z12 = z11;
        int i12 = i10;
        while (i10 < m15026i) {
            if (c3964a.m15022e(i10) != z12) {
                m22846j[i11] = m22846j[i11] + 1;
            } else {
                if (i11 == 3) {
                    if (z10) {
                        m23618G(m22846j);
                    }
                    if (AbstractC5741a.m22843p(m22846j)) {
                        int[] iArr = this.f21985i;
                        iArr[0] = i12;
                        iArr[1] = i10;
                        return;
                    }
                    if (z10) {
                        m23618G(m22846j);
                    }
                    i12 += m22846j[0] + m22846j[1];
                    m22846j[0] = m22846j[2];
                    m22846j[1] = m22846j[3];
                    m22846j[2] = 0;
                    m22846j[3] = 0;
                    i11--;
                } else {
                    i11++;
                }
                m22846j[i11] = 1;
                z12 = !z12;
            }
            i10++;
        }
        throw C2678j.m10895a();
    }
}
