package p324wa;

import java.util.Arrays;
import java.util.Map;
import p129ia.C2671c;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.EnumC2673e;
import p129ia.EnumC2683o;
import p129ia.InterfaceC2680l;
import p211oa.C3964a;

/* renamed from: wa.k */
/* loaded from: classes.dex */
public abstract class AbstractC5461k implements InterfaceC2680l {
    /* renamed from: e */
    public static float m21647e(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            float f15 = iArr2[i13] * f12;
            float f16 = iArr[i13];
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    /* renamed from: f */
    public static void m21648f(C3964a c3964a, int i10, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int m15026i = c3964a.m15026i();
        if (i10 >= m15026i) {
            throw C2678j.m10895a();
        }
        boolean z10 = !c3964a.m15022e(i10);
        while (i10 < m15026i) {
            if (c3964a.m15022e(i10) != z10) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                i11++;
                if (i11 == length) {
                    break;
                }
                iArr[i11] = 1;
                z10 = !z10;
            }
            i10++;
        }
        if (i11 != length) {
            if (i11 != length - 1 || i10 != m15026i) {
                throw C2678j.m10895a();
            }
        }
    }

    /* renamed from: g */
    public static void m21649g(C3964a c3964a, int i10, int[] iArr) {
        int length = iArr.length;
        boolean m15022e = c3964a.m15022e(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (c3964a.m15022e(i10) != m15022e) {
                length--;
                m15022e = !m15022e;
            }
        }
        if (length >= 0) {
            throw C2678j.m10895a();
        }
        m21648f(c3964a, i10 + 1, iArr);
    }

    @Override // p129ia.InterfaceC2680l
    /* renamed from: a */
    public C2682n mo363a(C2671c c2671c) {
        return mo364b(c2671c, null);
    }

    @Override // p129ia.InterfaceC2680l
    /* renamed from: b */
    public C2682n mo364b(C2671c c2671c, Map<EnumC2673e, ?> map) {
        try {
            return m21650d(c2671c, map);
        } catch (C2678j e10) {
            if (!(map != null && map.containsKey(EnumC2673e.TRY_HARDER)) || !c2671c.m10879e()) {
                throw e10;
            }
            C2671c m10880f = c2671c.m10880f();
            C2682n m21650d = m21650d(m10880f, map);
            Map<EnumC2683o, Object> m10900d = m21650d.m10900d();
            int i10 = 270;
            if (m10900d != null) {
                EnumC2683o enumC2683o = EnumC2683o.ORIENTATION;
                if (m10900d.containsKey(enumC2683o)) {
                    i10 = (((Integer) m10900d.get(enumC2683o)).intValue() + 270) % 360;
                }
            }
            m21650d.m10904h(EnumC2683o.ORIENTATION, Integer.valueOf(i10));
            C2684p[] m10901e = m21650d.m10901e();
            if (m10901e != null) {
                int m10877c = m10880f.m10877c();
                for (int i11 = 0; i11 < m10901e.length; i11++) {
                    m10901e[i11] = new C2684p((m10877c - m10901e[i11].m10909d()) - 1.0f, m10901e[i11].m10908c());
                }
            }
            return m21650d;
        }
    }

    /* renamed from: c */
    public abstract C2682n mo21616c(int i10, C3964a c3964a, Map<EnumC2673e, ?> map);

    /* JADX WARN: Removed duplicated region for block: B:36:0x007c A[Catch: m -> 0x00cc, TRY_LEAVE, TryCatch #1 {m -> 0x00cc, blocks: (B:34:0x0076, B:36:0x007c), top: B:33:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p129ia.C2682n m21650d(p129ia.C2671c r22, java.util.Map<p129ia.EnumC2673e, ?> r23) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p324wa.AbstractC5461k.m21650d(ia.c, java.util.Map):ia.n");
    }

    @Override // p129ia.InterfaceC2680l
    public void reset() {
    }
}
