package va;

import java.util.Map;
import p129ia.C2672d;
import p129ia.C2674f;
import p129ia.EnumC2673e;
import p211oa.C3965b;
import p211oa.C3968e;
import qa.C4219a;
import qa.C4221c;
import qa.C4222d;

/* renamed from: va.c */
/* loaded from: classes.dex */
public final class C5156c {

    /* renamed from: a */
    public final C4221c f19422a = new C4221c(C4219a.f15201o);

    /* renamed from: a */
    public final void m20861a(byte[] bArr, int i10, int i11, int i12, int i13) {
        int i14 = i11 + i12;
        int i15 = i13 == 0 ? 1 : 2;
        int[] iArr = new int[i14 / i15];
        for (int i16 = 0; i16 < i14; i16++) {
            if (i13 == 0 || i16 % 2 == i13 - 1) {
                iArr[i16 / i15] = bArr[i16 + i10] & 255;
            }
        }
        try {
            this.f19422a.m16261a(iArr, i12 / i15);
            for (int i17 = 0; i17 < i11; i17++) {
                if (i13 == 0 || i17 % 2 == i13 - 1) {
                    bArr[i17 + i10] = (byte) iArr[i17 / i15];
                }
            }
        } catch (C4222d unused) {
            throw C2672d.m10881a();
        }
    }

    /* renamed from: b */
    public C3968e m20862b(C3965b c3965b, Map<EnumC2673e, ?> map) {
        int i10;
        byte[] m20851a = new C5154a(c3965b).m20851a();
        m20861a(m20851a, 0, 10, 10, 0);
        int i11 = m20851a[0] & 15;
        if (i11 == 2 || i11 == 3 || i11 == 4) {
            m20861a(m20851a, 20, 84, 40, 1);
            m20861a(m20851a, 20, 84, 40, 2);
            i10 = 94;
        } else {
            if (i11 != 5) {
                throw C2674f.m10883a();
            }
            m20861a(m20851a, 20, 68, 56, 1);
            m20861a(m20851a, 20, 68, 56, 2);
            i10 = 78;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(m20851a, 0, bArr, 0, 10);
        System.arraycopy(m20851a, 20, bArr, 10, bArr.length - 10);
        return C5155b.m20852a(bArr, i11);
    }
}
