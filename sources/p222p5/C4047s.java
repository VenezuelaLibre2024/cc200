package p222p5;

import java.util.Arrays;

/* renamed from: p5.s */
/* loaded from: classes.dex */
public final class C4047s {

    /* renamed from: a */
    public int f14550a;

    /* renamed from: b */
    public long[] f14551b;

    public C4047s() {
        this(32);
    }

    public C4047s(int i10) {
        this.f14551b = new long[i10];
    }

    /* renamed from: a */
    public void m15535a(long j10) {
        int i10 = this.f14550a;
        long[] jArr = this.f14551b;
        if (i10 == jArr.length) {
            this.f14551b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f14551b;
        int i11 = this.f14550a;
        this.f14550a = i11 + 1;
        jArr2[i11] = j10;
    }

    /* renamed from: b */
    public long m15536b(int i10) {
        if (i10 >= 0 && i10 < this.f14550a) {
            return this.f14551b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f14550a);
    }

    /* renamed from: c */
    public int m15537c() {
        return this.f14550a;
    }

    /* renamed from: d */
    public long[] m15538d() {
        return Arrays.copyOf(this.f14551b, this.f14550a);
    }
}
