package p084fb;

import p084fb.C1897j;

/* renamed from: fb.b */
/* loaded from: classes.dex */
public final class C1889b {

    /* renamed from: a */
    public final int f7133a;

    /* renamed from: b */
    public final byte[] f7134b;

    public C1889b(int i10, byte[] bArr) {
        this.f7133a = i10;
        this.f7134b = bArr;
    }

    /* renamed from: b */
    public static C1889b[] m7726b(byte[] bArr, C1897j c1897j, EnumC1893f enumC1893f) {
        if (bArr.length != c1897j.m7759h()) {
            throw new IllegalArgumentException();
        }
        C1897j.b m7758f = c1897j.m7758f(enumC1893f);
        C1897j.a[] m7763a = m7758f.m7763a();
        int i10 = 0;
        for (C1897j.a aVar : m7763a) {
            i10 += aVar.m7761a();
        }
        C1889b[] c1889bArr = new C1889b[i10];
        int i11 = 0;
        for (C1897j.a aVar2 : m7763a) {
            int i12 = 0;
            while (i12 < aVar2.m7761a()) {
                int m7762b = aVar2.m7762b();
                c1889bArr[i11] = new C1889b(m7762b, new byte[m7758f.m7764b() + m7762b]);
                i12++;
                i11++;
            }
        }
        int length = c1889bArr[0].f7134b.length;
        int i13 = i10 - 1;
        while (i13 >= 0 && c1889bArr[i13].f7134b.length != length) {
            i13--;
        }
        int i14 = i13 + 1;
        int m7764b = length - m7758f.m7764b();
        int i15 = 0;
        for (int i16 = 0; i16 < m7764b; i16++) {
            int i17 = 0;
            while (i17 < i11) {
                c1889bArr[i17].f7134b[i16] = bArr[i15];
                i17++;
                i15++;
            }
        }
        int i18 = i14;
        while (i18 < i11) {
            c1889bArr[i18].f7134b[m7764b] = bArr[i15];
            i18++;
            i15++;
        }
        int length2 = c1889bArr[0].f7134b.length;
        while (m7764b < length2) {
            int i19 = 0;
            while (i19 < i11) {
                c1889bArr[i19].f7134b[i19 < i14 ? m7764b : m7764b + 1] = bArr[i15];
                i19++;
                i15++;
            }
            m7764b++;
        }
        return c1889bArr;
    }

    /* renamed from: a */
    public byte[] m7727a() {
        return this.f7134b;
    }

    /* renamed from: c */
    public int m7728c() {
        return this.f7133a;
    }
}
