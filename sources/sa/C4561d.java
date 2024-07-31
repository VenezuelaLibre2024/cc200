package sa;

import p129ia.C2672d;
import p211oa.C3965b;
import p211oa.C3968e;
import qa.C4219a;
import qa.C4221c;
import qa.C4222d;

/* renamed from: sa.d */
/* loaded from: classes.dex */
public final class C4561d {

    /* renamed from: a */
    public final C4221c f17185a = new C4221c(C4219a.f15199m);

    /* renamed from: a */
    public final void m18040a(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f17185a.m16261a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (C4222d unused) {
            throw C2672d.m10881a();
        }
    }

    /* renamed from: b */
    public C3968e m18041b(C3965b c3965b) {
        C4558a c4558a = new C4558a(c3965b);
        C4559b[] m18027b = C4559b.m18027b(c4558a.m18020c(), c4558a.m18019b());
        int i10 = 0;
        for (C4559b c4559b : m18027b) {
            i10 += c4559b.m18029c();
        }
        byte[] bArr = new byte[i10];
        int length = m18027b.length;
        for (int i11 = 0; i11 < length; i11++) {
            C4559b c4559b2 = m18027b[i11];
            byte[] m18028a = c4559b2.m18028a();
            int m18029c = c4559b2.m18029c();
            m18040a(m18028a, m18029c);
            for (int i12 = 0; i12 < m18029c; i12++) {
                bArr[(i12 * length) + i11] = m18028a[i12];
            }
        }
        return C4560c.m18030a(bArr);
    }
}
