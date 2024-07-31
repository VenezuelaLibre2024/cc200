package p256ra;

import java.util.List;
import java.util.Map;
import p129ia.C2671c;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;
import p129ia.EnumC2683o;
import p129ia.InterfaceC2680l;
import p211oa.C3965b;
import p211oa.C3968e;
import p211oa.C3970g;
import p282ta.C4736a;
import sa.C4561d;

/* renamed from: ra.a */
/* loaded from: classes.dex */
public final class C4335a implements InterfaceC2680l {

    /* renamed from: b */
    public static final C2684p[] f15668b = new C2684p[0];

    /* renamed from: a */
    public final C4561d f15669a = new C4561d();

    /* renamed from: c */
    public static C3965b m16610c(C3965b c3965b) {
        int[] m15040m = c3965b.m15040m();
        int[] m15036h = c3965b.m15036h();
        if (m15040m == null || m15036h == null) {
            throw C2678j.m10895a();
        }
        int m16611d = m16611d(m15040m, c3965b);
        int i10 = m15040m[1];
        int i11 = m15036h[1];
        int i12 = m15040m[0];
        int i13 = ((m15036h[0] - i12) + 1) / m16611d;
        int i14 = ((i11 - i10) + 1) / m16611d;
        if (i13 <= 0 || i14 <= 0) {
            throw C2678j.m10895a();
        }
        int i15 = m16611d / 2;
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        C3965b c3965b2 = new C3965b(i13, i14);
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = (i18 * m16611d) + i16;
            for (int i20 = 0; i20 < i13; i20++) {
                if (c3965b.m15035g((i20 * m16611d) + i17, i19)) {
                    c3965b2.m15044q(i20, i18);
                }
            }
        }
        return c3965b2;
    }

    /* renamed from: d */
    public static int m16611d(int[] iArr, C3965b c3965b) {
        int m15041n = c3965b.m15041n();
        int i10 = iArr[0];
        int i11 = iArr[1];
        while (i10 < m15041n && c3965b.m15035g(i10, i11)) {
            i10++;
        }
        if (i10 == m15041n) {
            throw C2678j.m10895a();
        }
        int i12 = i10 - iArr[0];
        if (i12 != 0) {
            return i12;
        }
        throw C2678j.m10895a();
    }

    @Override // p129ia.InterfaceC2680l
    /* renamed from: a */
    public C2682n mo363a(C2671c c2671c) {
        return mo364b(c2671c, null);
    }

    @Override // p129ia.InterfaceC2680l
    /* renamed from: b */
    public C2682n mo364b(C2671c c2671c, Map<EnumC2673e, ?> map) {
        C2684p[] m15071b;
        C3968e c3968e;
        if (map == null || !map.containsKey(EnumC2673e.PURE_BARCODE)) {
            C3970g m18610b = new C4736a(c2671c.m10875a()).m18610b();
            C3968e m18041b = this.f15669a.m18041b(m18610b.m15070a());
            m15071b = m18610b.m15071b();
            c3968e = m18041b;
        } else {
            c3968e = this.f15669a.m18041b(m16610c(c2671c.m10875a()));
            m15071b = f15668b;
        }
        C2682n c2682n = new C2682n(c3968e.m15062i(), c3968e.m15058e(), m15071b, EnumC2669a.DATA_MATRIX);
        List<byte[]> m15054a = c3968e.m15054a();
        if (m15054a != null) {
            c2682n.m10904h(EnumC2683o.BYTE_SEGMENTS, m15054a);
        }
        String m15055b = c3968e.m15055b();
        if (m15055b != null) {
            c2682n.m10904h(EnumC2683o.ERROR_CORRECTION_LEVEL, m15055b);
        }
        c2682n.m10904h(EnumC2683o.SYMBOLOGY_IDENTIFIER, "]d" + c3968e.m15061h());
        return c2682n;
    }

    @Override // p129ia.InterfaceC2680l
    public void reset() {
    }
}
