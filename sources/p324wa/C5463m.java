package p324wa;

import java.util.EnumMap;
import java.util.Map;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p129ia.EnumC2683o;
import p211oa.C3964a;

/* renamed from: wa.m */
/* loaded from: classes.dex */
public final class C5463m {

    /* renamed from: a */
    public final int[] f20338a = new int[4];

    /* renamed from: b */
    public final StringBuilder f20339b = new StringBuilder();

    /* renamed from: c */
    public static Map<EnumC2683o, Object> m21653c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC2683o.class);
        enumMap.put((EnumMap) EnumC2683o.ISSUE_NUMBER, (EnumC2683o) Integer.valueOf(str));
        return enumMap;
    }

    /* renamed from: a */
    public final int m21654a(C3964a c3964a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f20338a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m15026i = c3964a.m15026i();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 2 && i10 < m15026i; i12++) {
            int m21664j = AbstractC5466p.m21664j(c3964a, iArr2, i10, AbstractC5466p.f20350h);
            sb2.append((char) ((m21664j % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (m21664j >= 10) {
                i11 |= 1 << (1 - i12);
            }
            if (i12 != 1) {
                i10 = c3964a.m15025h(c3964a.m15024g(i10));
            }
        }
        if (sb2.length() != 2) {
            throw C2678j.m10895a();
        }
        if (Integer.parseInt(sb2.toString()) % 4 == i11) {
            return i10;
        }
        throw C2678j.m10895a();
    }

    /* renamed from: b */
    public C2682n m21655b(int i10, C3964a c3964a, int[] iArr) {
        StringBuilder sb2 = this.f20339b;
        sb2.setLength(0);
        int m21654a = m21654a(c3964a, iArr, sb2);
        String sb3 = sb2.toString();
        Map<EnumC2683o, Object> m21653c = m21653c(sb3);
        float f10 = i10;
        C2682n c2682n = new C2682n(sb3, null, new C2684p[]{new C2684p((iArr[0] + iArr[1]) / 2.0f, f10), new C2684p(m21654a, f10)}, EnumC2669a.UPC_EAN_EXTENSION);
        if (m21653c != null) {
            c2682n.m10903g(m21653c);
        }
        return c2682n;
    }
}
