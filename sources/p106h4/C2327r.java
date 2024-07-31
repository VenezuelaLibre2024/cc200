package p106h4;

import p106h4.InterfaceC2316i0;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4046r;
import p264s3.C4463m1;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.r */
/* loaded from: classes.dex */
public final class C2327r implements InterfaceC2322m {

    /* renamed from: b */
    public InterfaceC5559b0 f9509b;

    /* renamed from: c */
    public boolean f9510c;

    /* renamed from: e */
    public int f9512e;

    /* renamed from: f */
    public int f9513f;

    /* renamed from: a */
    public final C4015a0 f9508a = new C4015a0(10);

    /* renamed from: d */
    public long f9511d = -9223372036854775807L;

    @Override // p106h4.InterfaceC2322m
    /* renamed from: a */
    public void mo9333a(C4015a0 c4015a0) {
        C4014a.m15202h(this.f9509b);
        if (this.f9510c) {
            int m15226a = c4015a0.m15226a();
            int i10 = this.f9513f;
            if (i10 < 10) {
                int min = Math.min(m15226a, 10 - i10);
                System.arraycopy(c4015a0.m15230e(), c4015a0.m15231f(), this.f9508a.m15230e(), this.f9513f, min);
                if (this.f9513f + min == 10) {
                    this.f9508a.m15223T(0);
                    if (73 != this.f9508a.m15210G() || 68 != this.f9508a.m15210G() || 51 != this.f9508a.m15210G()) {
                        C4046r.m15529i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f9510c = false;
                        return;
                    } else {
                        this.f9508a.m15224U(3);
                        this.f9512e = this.f9508a.m15209F() + 10;
                    }
                }
            }
            int min2 = Math.min(m15226a, this.f9512e - this.f9513f);
            this.f9509b.m22408e(c4015a0, min2);
            this.f9513f += min2;
        }
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: c */
    public void mo9335c() {
        this.f9510c = false;
        this.f9511d = -9223372036854775807L;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: d */
    public void mo9336d() {
        int i10;
        C4014a.m15202h(this.f9509b);
        if (this.f9510c && (i10 = this.f9512e) != 0 && this.f9513f == i10) {
            long j10 = this.f9511d;
            if (j10 != -9223372036854775807L) {
                this.f9509b.mo4851a(j10, 1, i10, 0, null);
            }
            this.f9510c = false;
        }
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: e */
    public void mo9337e(InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        dVar.m9412a();
        InterfaceC5559b0 mo3032e = interfaceC5573m.mo3032e(dVar.m9414c(), 5);
        this.f9509b = mo3032e;
        mo3032e.mo4852b(new C4463m1.b().m17462U(dVar.m9413b()).m17474g0("application/id3").m17448G());
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: f */
    public void mo9338f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f9510c = true;
        if (j10 != -9223372036854775807L) {
            this.f9511d = j10;
        }
        this.f9512e = 0;
        this.f9513f = 0;
    }
}
