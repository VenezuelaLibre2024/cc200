package p334x4;

import p180m4.C3525c;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p264s3.C4468n1;
import p290u4.InterfaceC4869m0;
import p304v3.C5110g;
import p350y4.C5805f;

/* renamed from: x4.i */
/* loaded from: classes.dex */
public final class C5595i implements InterfaceC4869m0 {

    /* renamed from: h */
    public final C4463m1 f20976h;

    /* renamed from: j */
    public long[] f20978j;

    /* renamed from: k */
    public boolean f20979k;

    /* renamed from: l */
    public C5805f f20980l;

    /* renamed from: m */
    public boolean f20981m;

    /* renamed from: n */
    public int f20982n;

    /* renamed from: i */
    public final C3525c f20977i = new C3525c();

    /* renamed from: o */
    public long f20983o = -9223372036854775807L;

    public C5595i(C5805f c5805f, C4463m1 c4463m1, boolean z10) {
        this.f20976h = c4463m1;
        this.f20980l = c5805f;
        this.f20978j = c5805f.f21790b;
        m22528d(c5805f, z10);
    }

    @Override // p290u4.InterfaceC4869m0
    /* renamed from: a */
    public void mo19250a() {
    }

    /* renamed from: b */
    public String m22526b() {
        return this.f20980l.m23357a();
    }

    /* renamed from: c */
    public void m22527c(long j10) {
        int m15453e = C4041n0.m15453e(this.f20978j, j10, true, false);
        this.f20982n = m15453e;
        if (!(this.f20979k && m15453e == this.f20978j.length)) {
            j10 = -9223372036854775807L;
        }
        this.f20983o = j10;
    }

    /* renamed from: d */
    public void m22528d(C5805f c5805f, boolean z10) {
        int i10 = this.f20982n;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f20978j[i10 - 1];
        this.f20979k = z10;
        this.f20980l = c5805f;
        long[] jArr = c5805f.f21790b;
        this.f20978j = jArr;
        long j11 = this.f20983o;
        if (j11 != -9223372036854775807L) {
            m22527c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f20982n = C4041n0.m15453e(jArr, j10, false, false);
        }
    }

    @Override // p290u4.InterfaceC4869m0
    /* renamed from: e */
    public boolean mo19252e() {
        return true;
    }

    @Override // p290u4.InterfaceC4869m0
    /* renamed from: j */
    public int mo19253j(C4468n1 c4468n1, C5110g c5110g, int i10) {
        int i11 = this.f20982n;
        boolean z10 = i11 == this.f20978j.length;
        if (z10 && !this.f20979k) {
            c5110g.m20752u(4);
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f20981m) {
            c4468n1.f16559b = this.f20976h;
            this.f20981m = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f20982n = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] m13082a = this.f20977i.m13082a(this.f20980l.f21789a[i11]);
            c5110g.m20764w(m13082a.length);
            c5110g.f19284j.put(m13082a);
        }
        c5110g.f19286l = this.f20978j[i11];
        c5110g.m20752u(1);
        return -4;
    }

    @Override // p290u4.InterfaceC4869m0
    /* renamed from: n */
    public int mo19254n(long j10) {
        int max = Math.max(this.f20982n, C4041n0.m15453e(this.f20978j, j10, true, false));
        int i10 = max - this.f20982n;
        this.f20982n = max;
        return i10;
    }
}
