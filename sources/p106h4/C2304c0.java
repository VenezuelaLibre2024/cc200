package p106h4;

import p106h4.InterfaceC2316i0;
import p222p5.C4015a0;
import p222p5.C4033j0;
import p222p5.C4041n0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.c0 */
/* loaded from: classes.dex */
public final class C2304c0 implements InterfaceC2316i0 {

    /* renamed from: a */
    public final InterfaceC2302b0 f9248a;

    /* renamed from: b */
    public final C4015a0 f9249b = new C4015a0(32);

    /* renamed from: c */
    public int f9250c;

    /* renamed from: d */
    public int f9251d;

    /* renamed from: e */
    public boolean f9252e;

    /* renamed from: f */
    public boolean f9253f;

    public C2304c0(InterfaceC2302b0 interfaceC2302b0) {
        this.f9248a = interfaceC2302b0;
    }

    @Override // p106h4.InterfaceC2316i0
    /* renamed from: a */
    public void mo9341a(C4015a0 c4015a0, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int m15231f = z10 ? c4015a0.m15231f() + c4015a0.m15210G() : -1;
        if (this.f9253f) {
            if (!z10) {
                return;
            }
            this.f9253f = false;
            c4015a0.m15223T(m15231f);
            this.f9251d = 0;
        }
        while (c4015a0.m15226a() > 0) {
            int i11 = this.f9251d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int m15210G = c4015a0.m15210G();
                    c4015a0.m15223T(c4015a0.m15231f() - 1);
                    if (m15210G == 255) {
                        this.f9253f = true;
                        return;
                    }
                }
                int min = Math.min(c4015a0.m15226a(), 3 - this.f9251d);
                c4015a0.m15237l(this.f9249b.m15230e(), this.f9251d, min);
                int i12 = this.f9251d + min;
                this.f9251d = i12;
                if (i12 == 3) {
                    this.f9249b.m15223T(0);
                    this.f9249b.m15222S(3);
                    this.f9249b.m15224U(1);
                    int m15210G2 = this.f9249b.m15210G();
                    int m15210G3 = this.f9249b.m15210G();
                    this.f9252e = (m15210G2 & 128) != 0;
                    this.f9250c = (((m15210G2 & 15) << 8) | m15210G3) + 3;
                    int m15227b = this.f9249b.m15227b();
                    int i13 = this.f9250c;
                    if (m15227b < i13) {
                        this.f9249b.m15228c(Math.min(4098, Math.max(i13, this.f9249b.m15227b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(c4015a0.m15226a(), this.f9250c - this.f9251d);
                c4015a0.m15237l(this.f9249b.m15230e(), this.f9251d, min2);
                int i14 = this.f9251d + min2;
                this.f9251d = i14;
                int i15 = this.f9250c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f9252e) {
                        this.f9249b.m15222S(i15);
                    } else {
                        if (C4041n0.m15483t(this.f9249b.m15230e(), 0, this.f9250c, -1) != 0) {
                            this.f9253f = true;
                            return;
                        }
                        this.f9249b.m15222S(this.f9250c - 4);
                    }
                    this.f9249b.m15223T(0);
                    this.f9248a.mo9331a(this.f9249b);
                    this.f9251d = 0;
                }
            }
        }
    }

    @Override // p106h4.InterfaceC2316i0
    /* renamed from: b */
    public void mo9342b(C4033j0 c4033j0, InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        this.f9248a.mo9332b(c4033j0, interfaceC5573m, dVar);
        this.f9253f = true;
    }

    @Override // p106h4.InterfaceC2316i0
    /* renamed from: c */
    public void mo9343c() {
        this.f9253f = true;
    }
}
