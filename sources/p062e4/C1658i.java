package p062e4;

import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p289u3.C4816f0;
import p333x3.C5557a0;
import p333x3.InterfaceC5586z;

/* renamed from: e4.i */
/* loaded from: classes.dex */
public final class C1658i implements InterfaceC1656g {

    /* renamed from: a */
    public final long f6120a;

    /* renamed from: b */
    public final int f6121b;

    /* renamed from: c */
    public final long f6122c;

    /* renamed from: d */
    public final long f6123d;

    /* renamed from: e */
    public final long f6124e;

    /* renamed from: f */
    public final long[] f6125f;

    public C1658i(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    public C1658i(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f6120a = j10;
        this.f6121b = i10;
        this.f6122c = j11;
        this.f6125f = jArr;
        this.f6123d = j12;
        this.f6124e = j12 != -1 ? j10 + j12 : -1L;
    }

    /* renamed from: b */
    public static C1658i m6577b(long j10, long j11, C4816f0.a aVar, C4015a0 c4015a0) {
        int m15214K;
        int i10 = aVar.f18050g;
        int i11 = aVar.f18047d;
        int m15241p = c4015a0.m15241p();
        if ((m15241p & 1) != 1 || (m15214K = c4015a0.m15214K()) == 0) {
            return null;
        }
        long m15420N0 = C4041n0.m15420N0(m15214K, i10 * 1000000, i11);
        if ((m15241p & 6) != 6) {
            return new C1658i(j11, aVar.f18046c, m15420N0);
        }
        long m15212I = c4015a0.m15212I();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = c4015a0.m15210G();
        }
        if (j10 != -1) {
            long j12 = j11 + m15212I;
            if (j10 != j12) {
                C4046r.m15529i("XingSeeker", "XING data size mismatch: " + j10 + ", " + j12);
            }
        }
        return new C1658i(j11, aVar.f18046c, m15420N0, m15212I, jArr);
    }

    @Override // p062e4.InterfaceC1656g
    /* renamed from: a */
    public long mo6550a(long j10) {
        long j11 = j10 - this.f6120a;
        if (!mo3036f() || j11 <= this.f6121b) {
            return 0L;
        }
        long[] jArr = (long[]) C4014a.m15202h(this.f6125f);
        double d10 = (j11 * 256.0d) / this.f6123d;
        int m15461i = C4041n0.m15461i(jArr, (long) d10, true, true);
        long m6578c = m6578c(m15461i);
        long j12 = jArr[m15461i];
        int i10 = m15461i + 1;
        long m6578c2 = m6578c(i10);
        return m6578c + Math.round((j12 == (m15461i == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (m6578c2 - m6578c));
    }

    /* renamed from: c */
    public final long m6578c(int i10) {
        return (this.f6122c * i10) / 100;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: d */
    public long mo3035d() {
        return this.f6122c;
    }

    @Override // p062e4.InterfaceC1656g
    /* renamed from: e */
    public long mo6551e() {
        return this.f6124e;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: f */
    public boolean mo3036f() {
        return this.f6125f != null;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: i */
    public InterfaceC5586z.a mo3037i(long j10) {
        if (!mo3036f()) {
            return new InterfaceC5586z.a(new C5557a0(0L, this.f6120a + this.f6121b));
        }
        long m15479r = C4041n0.m15479r(j10, 0L, this.f6122c);
        double d10 = (m15479r * 100.0d) / this.f6122c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) C4014a.m15202h(this.f6125f))[i10];
                d11 = d12 + ((d10 - i10) * ((i10 == 99 ? 256.0d : r3[i10 + 1]) - d12));
            }
        }
        return new InterfaceC5586z.a(new C5557a0(m15479r, this.f6120a + C4041n0.m15479r(Math.round((d11 / 256.0d) * this.f6123d), this.f6121b, this.f6123d - 1)));
    }
}
