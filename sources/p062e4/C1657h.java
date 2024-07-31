package p062e4;

import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p289u3.C4816f0;
import p333x3.C5557a0;
import p333x3.InterfaceC5586z;

/* renamed from: e4.h */
/* loaded from: classes.dex */
public final class C1657h implements InterfaceC1656g {

    /* renamed from: a */
    public final long[] f6116a;

    /* renamed from: b */
    public final long[] f6117b;

    /* renamed from: c */
    public final long f6118c;

    /* renamed from: d */
    public final long f6119d;

    public C1657h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f6116a = jArr;
        this.f6117b = jArr2;
        this.f6118c = j10;
        this.f6119d = j11;
    }

    /* renamed from: b */
    public static C1657h m6576b(long j10, long j11, C4816f0.a aVar, C4015a0 c4015a0) {
        int m15210G;
        c4015a0.m15224U(10);
        int m15241p = c4015a0.m15241p();
        if (m15241p <= 0) {
            return null;
        }
        int i10 = aVar.f18047d;
        long m15420N0 = C4041n0.m15420N0(m15241p, 1000000 * (i10 >= 32000 ? 1152 : 576), i10);
        int m15216M = c4015a0.m15216M();
        int m15216M2 = c4015a0.m15216M();
        int m15216M3 = c4015a0.m15216M();
        c4015a0.m15224U(2);
        long j12 = j11 + aVar.f18046c;
        long[] jArr = new long[m15216M];
        long[] jArr2 = new long[m15216M];
        int i11 = 0;
        long j13 = j11;
        while (i11 < m15216M) {
            int i12 = m15216M2;
            long j14 = j12;
            jArr[i11] = (i11 * m15420N0) / m15216M;
            jArr2[i11] = Math.max(j13, j14);
            if (m15216M3 == 1) {
                m15210G = c4015a0.m15210G();
            } else if (m15216M3 == 2) {
                m15210G = c4015a0.m15216M();
            } else if (m15216M3 == 3) {
                m15210G = c4015a0.m15213J();
            } else {
                if (m15216M3 != 4) {
                    return null;
                }
                m15210G = c4015a0.m15214K();
            }
            j13 += m15210G * i12;
            i11++;
            jArr = jArr;
            m15216M2 = i12;
            j12 = j14;
        }
        long[] jArr3 = jArr;
        if (j10 != -1 && j10 != j13) {
            C4046r.m15529i("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new C1657h(jArr3, jArr2, m15420N0, j13);
    }

    @Override // p062e4.InterfaceC1656g
    /* renamed from: a */
    public long mo6550a(long j10) {
        return this.f6116a[C4041n0.m15461i(this.f6117b, j10, true, true)];
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: d */
    public long mo3035d() {
        return this.f6118c;
    }

    @Override // p062e4.InterfaceC1656g
    /* renamed from: e */
    public long mo6551e() {
        return this.f6119d;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: f */
    public boolean mo3036f() {
        return true;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: i */
    public InterfaceC5586z.a mo3037i(long j10) {
        int m15461i = C4041n0.m15461i(this.f6116a, j10, true, true);
        C5557a0 c5557a0 = new C5557a0(this.f6116a[m15461i], this.f6117b[m15461i]);
        if (c5557a0.f20851a >= j10 || m15461i == this.f6116a.length - 1) {
            return new InterfaceC5586z.a(c5557a0);
        }
        int i10 = m15461i + 1;
        return new InterfaceC5586z.a(c5557a0, new C5557a0(this.f6116a[i10], this.f6117b[i10]));
    }
}
