package p069eb;

import gb.C2217c;
import java.util.List;
import java.util.Map;
import p084fb.C1892e;
import p084fb.C1896i;
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

/* renamed from: eb.a */
/* loaded from: classes.dex */
public class C1764a implements InterfaceC2680l {

    /* renamed from: b */
    public static final C2684p[] f6521b = new C2684p[0];

    /* renamed from: a */
    public final C1892e f6522a = new C1892e();

    /* renamed from: c */
    public static C3965b m7063c(C3965b c3965b) {
        int[] m15040m = c3965b.m15040m();
        int[] m15036h = c3965b.m15036h();
        if (m15040m == null || m15036h == null) {
            throw C2678j.m10895a();
        }
        float m7064d = m7064d(m15040m, c3965b);
        int i10 = m15040m[1];
        int i11 = m15036h[1];
        int i12 = m15040m[0];
        int i13 = m15036h[0];
        if (i12 >= i13 || i10 >= i11) {
            throw C2678j.m10895a();
        }
        int i14 = i11 - i10;
        if (i14 != i13 - i12 && (i13 = i12 + i14) >= c3965b.m15041n()) {
            throw C2678j.m10895a();
        }
        int round = Math.round(((i13 - i12) + 1) / m7064d);
        int round2 = Math.round((i14 + 1) / m7064d);
        if (round <= 0 || round2 <= 0) {
            throw C2678j.m10895a();
        }
        if (round2 != round) {
            throw C2678j.m10895a();
        }
        int i15 = (int) (m7064d / 2.0f);
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        int i18 = (((int) ((round - 1) * m7064d)) + i17) - i13;
        if (i18 > 0) {
            if (i18 > i15) {
                throw C2678j.m10895a();
            }
            i17 -= i18;
        }
        int i19 = (((int) ((round2 - 1) * m7064d)) + i16) - i11;
        if (i19 > 0) {
            if (i19 > i15) {
                throw C2678j.m10895a();
            }
            i16 -= i19;
        }
        C3965b c3965b2 = new C3965b(round, round2);
        for (int i20 = 0; i20 < round2; i20++) {
            int i21 = ((int) (i20 * m7064d)) + i16;
            for (int i22 = 0; i22 < round; i22++) {
                if (c3965b.m15035g(((int) (i22 * m7064d)) + i17, i21)) {
                    c3965b2.m15044q(i22, i20);
                }
            }
        }
        return c3965b2;
    }

    /* renamed from: d */
    public static float m7064d(int[] iArr, C3965b c3965b) {
        int m15038k = c3965b.m15038k();
        int m15041n = c3965b.m15041n();
        int i10 = iArr[0];
        boolean z10 = true;
        int i11 = iArr[1];
        int i12 = 0;
        while (i10 < m15041n && i11 < m15038k) {
            if (z10 != c3965b.m15035g(i10, i11)) {
                i12++;
                if (i12 == 5) {
                    break;
                }
                z10 = !z10;
            }
            i10++;
            i11++;
        }
        if (i10 == m15041n || i11 == m15038k) {
            throw C2678j.m10895a();
        }
        return (i10 - iArr[0]) / 7.0f;
    }

    @Override // p129ia.InterfaceC2680l
    /* renamed from: a */
    public C2682n mo363a(C2671c c2671c) {
        return mo364b(c2671c, null);
    }

    @Override // p129ia.InterfaceC2680l
    /* renamed from: b */
    public final C2682n mo364b(C2671c c2671c, Map<EnumC2673e, ?> map) {
        C2684p[] m15071b;
        C3968e c3968e;
        if (map == null || !map.containsKey(EnumC2673e.PURE_BARCODE)) {
            C3970g m8904e = new C2217c(c2671c.m10875a()).m8904e(map);
            C3968e m7741c = this.f6522a.m7741c(m8904e.m15070a(), map);
            m15071b = m8904e.m15071b();
            c3968e = m7741c;
        } else {
            c3968e = this.f6522a.m7741c(m7063c(c2671c.m10875a()), map);
            m15071b = f6521b;
        }
        if (c3968e.m15057d() instanceof C1896i) {
            ((C1896i) c3968e.m15057d()).m7750a(m15071b);
        }
        C2682n c2682n = new C2682n(c3968e.m15062i(), c3968e.m15058e(), m15071b, EnumC2669a.QR_CODE);
        List<byte[]> m15054a = c3968e.m15054a();
        if (m15054a != null) {
            c2682n.m10904h(EnumC2683o.BYTE_SEGMENTS, m15054a);
        }
        String m15055b = c3968e.m15055b();
        if (m15055b != null) {
            c2682n.m10904h(EnumC2683o.ERROR_CORRECTION_LEVEL, m15055b);
        }
        if (c3968e.m15063j()) {
            c2682n.m10904h(EnumC2683o.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(c3968e.m15060g()));
            c2682n.m10904h(EnumC2683o.STRUCTURED_APPEND_PARITY, Integer.valueOf(c3968e.m15059f()));
        }
        c2682n.m10904h(EnumC2683o.SYMBOLOGY_IDENTIFIER, "]Q" + c3968e.m15061h());
        return c2682n;
    }

    @Override // p129ia.InterfaceC2680l
    public void reset() {
    }
}
