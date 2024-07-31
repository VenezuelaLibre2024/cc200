package p046d4;

import p333x3.InterfaceC5572l;

/* renamed from: d4.g */
/* loaded from: classes.dex */
public final class C1545g {

    /* renamed from: d */
    public static final long[] f5757d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f5758a = new byte[8];

    /* renamed from: b */
    public int f5759b;

    /* renamed from: c */
    public int f5760c;

    /* renamed from: a */
    public static long m6309a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~f5757d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    /* renamed from: c */
    public static int m6310c(int i10) {
        long j10;
        int i11 = 0;
        do {
            long[] jArr = f5757d;
            if (i11 >= jArr.length) {
                return -1;
            }
            j10 = jArr[i11] & i10;
            i11++;
        } while (j10 == 0);
        return i11;
    }

    /* renamed from: b */
    public int m6311b() {
        return this.f5760c;
    }

    /* renamed from: d */
    public long m6312d(InterfaceC5572l interfaceC5572l, boolean z10, boolean z11, int i10) {
        if (this.f5759b == 0) {
            if (!interfaceC5572l.mo22423d(this.f5758a, 0, 1, z10)) {
                return -1L;
            }
            int m6310c = m6310c(this.f5758a[0] & 255);
            this.f5760c = m6310c;
            if (m6310c == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f5759b = 1;
        }
        int i11 = this.f5760c;
        if (i11 > i10) {
            this.f5759b = 0;
            return -2L;
        }
        if (i11 != 1) {
            interfaceC5572l.readFully(this.f5758a, 1, i11 - 1);
        }
        this.f5759b = 0;
        return m6309a(this.f5758a, this.f5760c, z11);
    }

    /* renamed from: e */
    public void m6313e() {
        this.f5759b = 0;
        this.f5760c = 0;
    }
}
