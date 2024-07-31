package p084fb;

import java.util.Map;
import p129ia.C2672d;
import p129ia.C2674f;
import p129ia.EnumC2673e;
import p211oa.C3965b;
import p211oa.C3968e;
import qa.C4219a;
import qa.C4221c;
import qa.C4222d;

/* renamed from: fb.e */
/* loaded from: classes.dex */
public final class C1892e {

    /* renamed from: a */
    public final C4221c f7146a = new C4221c(C4219a.f15198l);

    /* renamed from: a */
    public final void m7739a(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f7146a.m16261a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (C4222d unused) {
            throw C2672d.m10881a();
        }
    }

    /* renamed from: b */
    public final C3968e m7740b(C1888a c1888a, Map<EnumC2673e, ?> map) {
        C1897j m7723e = c1888a.m7723e();
        EnumC1893f m7747d = c1888a.m7722d().m7747d();
        C1889b[] m7726b = C1889b.m7726b(c1888a.m7721c(), m7723e, m7747d);
        int i10 = 0;
        for (C1889b c1889b : m7726b) {
            i10 += c1889b.m7728c();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (C1889b c1889b2 : m7726b) {
            byte[] m7727a = c1889b2.m7727a();
            int m7728c = c1889b2.m7728c();
            m7739a(m7727a, m7728c);
            int i12 = 0;
            while (i12 < m7728c) {
                bArr[i11] = m7727a[i12];
                i12++;
                i11++;
            }
        }
        return C1891d.m7731a(bArr, m7723e, m7747d, map);
    }

    /* renamed from: c */
    public C3968e m7741c(C3965b c3965b, Map<EnumC2673e, ?> map) {
        C2672d e10;
        C1888a c1888a = new C1888a(c3965b);
        C2674f c2674f = null;
        try {
            return m7740b(c1888a, map);
        } catch (C2672d e11) {
            e10 = e11;
            try {
                c1888a.m7724f();
                c1888a.m7725g(true);
                c1888a.m7723e();
                c1888a.m7722d();
                c1888a.m7720b();
                C3968e m7740b = m7740b(c1888a, map);
                m7740b.m15067n(new C1896i(true));
                return m7740b;
            } catch (C2672d | C2674f unused) {
                if (c2674f != null) {
                    throw c2674f;
                }
                throw e10;
            }
        } catch (C2674f e12) {
            e10 = null;
            c2674f = e12;
            c1888a.m7724f();
            c1888a.m7725g(true);
            c1888a.m7723e();
            c1888a.m7722d();
            c1888a.m7720b();
            C3968e m7740b2 = m7740b(c1888a, map);
            m7740b2.m15067n(new C1896i(true));
            return m7740b2;
        }
    }
}
