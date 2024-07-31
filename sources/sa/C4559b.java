package sa;

import sa.C4562e;

/* renamed from: sa.b */
/* loaded from: classes.dex */
public final class C4559b {

    /* renamed from: a */
    public final int f17168a;

    /* renamed from: b */
    public final byte[] f17169b;

    public C4559b(int i10, byte[] bArr) {
        this.f17168a = i10;
        this.f17169b = bArr;
    }

    /* renamed from: b */
    public static C4559b[] m18027b(byte[] bArr, C4562e c4562e) {
        C4562e.c m18046d = c4562e.m18046d();
        C4562e.b[] m18053a = m18046d.m18053a();
        int i10 = 0;
        for (C4562e.b bVar : m18053a) {
            i10 += bVar.m18051a();
        }
        C4559b[] c4559bArr = new C4559b[i10];
        int i11 = 0;
        for (C4562e.b bVar2 : m18053a) {
            int i12 = 0;
            while (i12 < bVar2.m18051a()) {
                int m18052b = bVar2.m18052b();
                c4559bArr[i11] = new C4559b(m18052b, new byte[m18046d.m18054b() + m18052b]);
                i12++;
                i11++;
            }
        }
        int length = c4559bArr[0].f17169b.length - m18046d.m18054b();
        int i13 = length - 1;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = 0;
            while (i16 < i11) {
                c4559bArr[i16].f17169b[i15] = bArr[i14];
                i16++;
                i14++;
            }
        }
        boolean z10 = c4562e.m18050i() == 24;
        int i17 = z10 ? 8 : i11;
        int i18 = 0;
        while (i18 < i17) {
            c4559bArr[i18].f17169b[i13] = bArr[i14];
            i18++;
            i14++;
        }
        int length2 = c4559bArr[0].f17169b.length;
        while (length < length2) {
            int i19 = 0;
            while (i19 < i11) {
                int i20 = z10 ? (i19 + 8) % i11 : i19;
                c4559bArr[i20].f17169b[(!z10 || i20 <= 7) ? length : length - 1] = bArr[i14];
                i19++;
                i14++;
            }
            length++;
        }
        if (i14 == bArr.length) {
            return c4559bArr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public byte[] m18028a() {
        return this.f17169b;
    }

    /* renamed from: c */
    public int m18029c() {
        return this.f17168a;
    }
}
