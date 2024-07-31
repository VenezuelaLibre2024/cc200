package p324wa;

import java.util.EnumMap;
import java.util.Map;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p129ia.EnumC2683o;
import p211oa.C3964a;

/* renamed from: wa.n */
/* loaded from: classes.dex */
public final class C5464n {

    /* renamed from: c */
    public static final int[] f20340c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    public final int[] f20341a = new int[4];

    /* renamed from: b */
    public final StringBuilder f20342b = new StringBuilder();

    /* renamed from: c */
    public static int m21656c(int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f20340c[i11]) {
                return i11;
            }
        }
        throw C2678j.m10895a();
    }

    /* renamed from: d */
    public static int m21657d(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 2; i11 >= 0; i11 -= 2) {
            i10 += charSequence.charAt(i11) - '0';
        }
        int i12 = i10 * 3;
        for (int i13 = length - 1; i13 >= 0; i13 -= 2) {
            i12 += charSequence.charAt(i13) - '0';
        }
        return (i12 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r5.equals("90000") == false) goto L11;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m21658e(java.lang.String r5) {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            java.lang.String r3 = ""
            r4 = 1
            if (r1 == r2) goto L4d
            r2 = 53
            if (r1 == r2) goto L4a
            r2 = 57
            if (r1 == r2) goto L15
            goto L4f
        L15:
            r1 = -1
            int r2 = r5.hashCode()
            switch(r2) {
                case 54118329: goto L35;
                case 54395376: goto L2a;
                case 54395377: goto L1f;
                default: goto L1d;
            }
        L1d:
            r0 = r1
            goto L3e
        L1f:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L28
            goto L1d
        L28:
            r0 = 2
            goto L3e
        L2a:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L33
            goto L1d
        L33:
            r0 = r4
            goto L3e
        L35:
            java.lang.String r2 = "90000"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L3e
            goto L1d
        L3e:
            switch(r0) {
                case 0: goto L48;
                case 1: goto L45;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L4f
        L42:
            java.lang.String r5 = "0.00"
            return r5
        L45:
            java.lang.String r5 = "Used"
            return r5
        L48:
            r5 = 0
            return r5
        L4a:
            java.lang.String r3 = "$"
            goto L4f
        L4d:
            java.lang.String r3 = "£"
        L4f:
            java.lang.String r5 = r5.substring(r4)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "0"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            goto L79
        L75:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L79:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p324wa.C5464n.m21658e(java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    public static Map<EnumC2683o, Object> m21659f(String str) {
        String m21658e;
        if (str.length() != 5 || (m21658e = m21658e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC2683o.class);
        enumMap.put((EnumMap) EnumC2683o.SUGGESTED_PRICE, (EnumC2683o) m21658e);
        return enumMap;
    }

    /* renamed from: a */
    public final int m21660a(C3964a c3964a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f20341a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m15026i = c3964a.m15026i();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 5 && i10 < m15026i; i12++) {
            int m21664j = AbstractC5466p.m21664j(c3964a, iArr2, i10, AbstractC5466p.f20350h);
            sb2.append((char) ((m21664j % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (m21664j >= 10) {
                i11 |= 1 << (4 - i12);
            }
            if (i12 != 4) {
                i10 = c3964a.m15025h(c3964a.m15024g(i10));
            }
        }
        if (sb2.length() != 5) {
            throw C2678j.m10895a();
        }
        if (m21657d(sb2.toString()) == m21656c(i11)) {
            return i10;
        }
        throw C2678j.m10895a();
    }

    /* renamed from: b */
    public C2682n m21661b(int i10, C3964a c3964a, int[] iArr) {
        StringBuilder sb2 = this.f20342b;
        sb2.setLength(0);
        int m21660a = m21660a(c3964a, iArr, sb2);
        String sb3 = sb2.toString();
        Map<EnumC2683o, Object> m21659f = m21659f(sb3);
        float f10 = i10;
        C2682n c2682n = new C2682n(sb3, null, new C2684p[]{new C2684p((iArr[0] + iArr[1]) / 2.0f, f10), new C2684p(m21660a, f10)}, EnumC2669a.UPC_EAN_EXTENSION);
        if (m21659f != null) {
            c2682n.m10903g(m21659f);
        }
        return c2682n;
    }
}
