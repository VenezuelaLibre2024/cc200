package p333x3;

import p222p5.C4014a;
import p222p5.C4041n0;
import p333x3.C5580t;
import p333x3.InterfaceC5586z;

/* renamed from: x3.s */
/* loaded from: classes.dex */
public final class C5579s implements InterfaceC5586z {

    /* renamed from: a */
    public final C5580t f20937a;

    /* renamed from: b */
    public final long f20938b;

    public C5579s(C5580t c5580t, long j10) {
        this.f20937a = c5580t;
        this.f20938b = j10;
    }

    /* renamed from: b */
    public final C5557a0 m22487b(long j10, long j11) {
        return new C5557a0((j10 * 1000000) / this.f20937a.f20943e, this.f20938b + j11);
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: d */
    public long mo3035d() {
        return this.f20937a.m22494f();
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: f */
    public boolean mo3036f() {
        return true;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: i */
    public InterfaceC5586z.a mo3037i(long j10) {
        C4014a.m15202h(this.f20937a.f20949k);
        C5580t c5580t = this.f20937a;
        C5580t.a aVar = c5580t.f20949k;
        long[] jArr = aVar.f20951a;
        long[] jArr2 = aVar.f20952b;
        int m15461i = C4041n0.m15461i(jArr, c5580t.m22497i(j10), true, false);
        C5557a0 m22487b = m22487b(m15461i == -1 ? 0L : jArr[m15461i], m15461i != -1 ? jArr2[m15461i] : 0L);
        if (m22487b.f20851a == j10 || m15461i == jArr.length - 1) {
            return new InterfaceC5586z.a(m22487b);
        }
        int i10 = m15461i + 1;
        return new InterfaceC5586z.a(m22487b, m22487b(jArr[i10], jArr2[i10]));
    }
}
