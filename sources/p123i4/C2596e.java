package p123i4;

import p222p5.C4041n0;
import p333x3.C5557a0;
import p333x3.InterfaceC5586z;

/* renamed from: i4.e */
/* loaded from: classes.dex */
public final class C2596e implements InterfaceC5586z {

    /* renamed from: a */
    public final C2594c f10190a;

    /* renamed from: b */
    public final int f10191b;

    /* renamed from: c */
    public final long f10192c;

    /* renamed from: d */
    public final long f10193d;

    /* renamed from: e */
    public final long f10194e;

    public C2596e(C2594c c2594c, int i10, long j10, long j11) {
        this.f10190a = c2594c;
        this.f10191b = i10;
        this.f10192c = j10;
        long j12 = (j11 - j10) / c2594c.f10185e;
        this.f10193d = j12;
        this.f10194e = m10380b(j12);
    }

    /* renamed from: b */
    public final long m10380b(long j10) {
        return C4041n0.m15420N0(j10 * this.f10191b, 1000000L, this.f10190a.f10183c);
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: d */
    public long mo3035d() {
        return this.f10194e;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: f */
    public boolean mo3036f() {
        return true;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: i */
    public InterfaceC5586z.a mo3037i(long j10) {
        long m15479r = C4041n0.m15479r((this.f10190a.f10183c * j10) / (this.f10191b * 1000000), 0L, this.f10193d - 1);
        long j11 = this.f10192c + (this.f10190a.f10185e * m15479r);
        long m10380b = m10380b(m15479r);
        C5557a0 c5557a0 = new C5557a0(m10380b, j11);
        if (m10380b >= j10 || m15479r == this.f10193d - 1) {
            return new InterfaceC5586z.a(c5557a0);
        }
        long j12 = m15479r + 1;
        return new InterfaceC5586z.a(c5557a0, new C5557a0(m10380b(j12), this.f10192c + (this.f10190a.f10185e * j12)));
    }
}
