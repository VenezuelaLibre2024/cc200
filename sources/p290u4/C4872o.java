package p290u4;

import java.io.IOException;
import p193n5.InterfaceC3752s;
import p206o5.InterfaceC3894b;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4465m3;
import p290u4.InterfaceC4878r;
import p290u4.InterfaceC4882t;

/* renamed from: u4.o */
/* loaded from: classes.dex */
public final class C4872o implements InterfaceC4878r, InterfaceC4878r.a {

    /* renamed from: h */
    public final InterfaceC4882t.b f18407h;

    /* renamed from: i */
    public final long f18408i;

    /* renamed from: j */
    public final InterfaceC3894b f18409j;

    /* renamed from: k */
    public InterfaceC4882t f18410k;

    /* renamed from: l */
    public InterfaceC4878r f18411l;

    /* renamed from: m */
    public InterfaceC4878r.a f18412m;

    /* renamed from: n */
    public a f18413n;

    /* renamed from: o */
    public boolean f18414o;

    /* renamed from: p */
    public long f18415p = -9223372036854775807L;

    /* renamed from: u4.o$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void m19407a(InterfaceC4882t.b bVar, IOException iOException);

        /* renamed from: b */
        void m19408b(InterfaceC4882t.b bVar);
    }

    public C4872o(InterfaceC4882t.b bVar, InterfaceC3894b interfaceC3894b, long j10) {
        this.f18407h = bVar;
        this.f18409j = interfaceC3894b;
        this.f18408i = j10;
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: b */
    public long mo4785b() {
        return ((InterfaceC4878r) C4041n0.m15463j(this.f18411l)).mo4785b();
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: c */
    public boolean mo4786c(long j10) {
        InterfaceC4878r interfaceC4878r = this.f18411l;
        return interfaceC4878r != null && interfaceC4878r.mo4786c(j10);
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: d */
    public long mo4787d(long j10, C4465m3 c4465m3) {
        return ((InterfaceC4878r) C4041n0.m15463j(this.f18411l)).mo4787d(j10, c4465m3);
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: f */
    public long mo4789f() {
        return ((InterfaceC4878r) C4041n0.m15463j(this.f18411l)).mo4789f();
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: g */
    public void mo4790g(long j10) {
        ((InterfaceC4878r) C4041n0.m15463j(this.f18411l)).mo4790g(j10);
    }

    /* renamed from: h */
    public void m19399h(InterfaceC4882t.b bVar) {
        long m19402r = m19402r(this.f18408i);
        InterfaceC4878r mo4727b = ((InterfaceC4882t) C4014a.m15199e(this.f18410k)).mo4727b(bVar, this.f18409j, m19402r);
        this.f18411l = mo4727b;
        if (this.f18412m != null) {
            mo4727b.mo4792i(this, m19402r);
        }
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: i */
    public void mo4792i(InterfaceC4878r.a aVar, long j10) {
        this.f18412m = aVar;
        InterfaceC4878r interfaceC4878r = this.f18411l;
        if (interfaceC4878r != null) {
            interfaceC4878r.mo4792i(this, m19402r(this.f18408i));
        }
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    public boolean isLoading() {
        InterfaceC4878r interfaceC4878r = this.f18411l;
        return interfaceC4878r != null && interfaceC4878r.isLoading();
    }

    @Override // p290u4.InterfaceC4878r.a
    /* renamed from: k */
    public void mo17309k(InterfaceC4878r interfaceC4878r) {
        ((InterfaceC4878r.a) C4041n0.m15463j(this.f18412m)).mo17309k(this);
        a aVar = this.f18413n;
        if (aVar != null) {
            aVar.m19408b(this.f18407h);
        }
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: l */
    public void mo4793l() {
        try {
            InterfaceC4878r interfaceC4878r = this.f18411l;
            if (interfaceC4878r != null) {
                interfaceC4878r.mo4793l();
            } else {
                InterfaceC4882t interfaceC4882t = this.f18410k;
                if (interfaceC4882t != null) {
                    interfaceC4882t.mo4735h();
                }
            }
        } catch (IOException e10) {
            a aVar = this.f18413n;
            if (aVar == null) {
                throw e10;
            }
            if (this.f18414o) {
                return;
            }
            this.f18414o = true;
            aVar.m19407a(this.f18407h, e10);
        }
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: m */
    public long mo4794m(long j10) {
        return ((InterfaceC4878r) C4041n0.m15463j(this.f18411l)).mo4794m(j10);
    }

    /* renamed from: n */
    public long m19400n() {
        return this.f18415p;
    }

    /* renamed from: o */
    public long m19401o() {
        return this.f18408i;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: p */
    public long mo4795p() {
        return ((InterfaceC4878r) C4041n0.m15463j(this.f18411l)).mo4795p();
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: q */
    public long mo4796q(InterfaceC3752s[] interfaceC3752sArr, boolean[] zArr, InterfaceC4869m0[] interfaceC4869m0Arr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f18415p;
        if (j12 == -9223372036854775807L || j10 != this.f18408i) {
            j11 = j10;
        } else {
            this.f18415p = -9223372036854775807L;
            j11 = j12;
        }
        return ((InterfaceC4878r) C4041n0.m15463j(this.f18411l)).mo4796q(interfaceC3752sArr, zArr, interfaceC4869m0Arr, zArr2, j11);
    }

    /* renamed from: r */
    public final long m19402r(long j10) {
        long j11 = this.f18415p;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: s */
    public C4885u0 mo4798s() {
        return ((InterfaceC4878r) C4041n0.m15463j(this.f18411l)).mo4798s();
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: t */
    public void mo4799t(long j10, boolean z10) {
        ((InterfaceC4878r) C4041n0.m15463j(this.f18411l)).mo4799t(j10, z10);
    }

    @Override // p290u4.InterfaceC4871n0.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo4788e(InterfaceC4878r interfaceC4878r) {
        ((InterfaceC4878r.a) C4041n0.m15463j(this.f18412m)).mo4788e(this);
    }

    /* renamed from: v */
    public void m19404v(long j10) {
        this.f18415p = j10;
    }

    /* renamed from: w */
    public void m19405w() {
        if (this.f18411l != null) {
            ((InterfaceC4882t) C4014a.m15199e(this.f18410k)).mo4725a(this.f18411l);
        }
    }

    /* renamed from: x */
    public void m19406x(InterfaceC4882t interfaceC4882t) {
        C4014a.m15200f(this.f18410k == null);
        this.f18410k = interfaceC4882t;
    }
}
