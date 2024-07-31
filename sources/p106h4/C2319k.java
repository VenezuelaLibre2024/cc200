package p106h4;

import p106h4.InterfaceC2316i0;
import p222p5.C4014a;
import p222p5.C4015a0;
import p264s3.C4463m1;
import p289u3.C4810c0;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.k */
/* loaded from: classes.dex */
public final class C2319k implements InterfaceC2322m {

    /* renamed from: b */
    public final String f9366b;

    /* renamed from: c */
    public String f9367c;

    /* renamed from: d */
    public InterfaceC5559b0 f9368d;

    /* renamed from: f */
    public int f9370f;

    /* renamed from: g */
    public int f9371g;

    /* renamed from: h */
    public long f9372h;

    /* renamed from: i */
    public C4463m1 f9373i;

    /* renamed from: j */
    public int f9374j;

    /* renamed from: a */
    public final C4015a0 f9365a = new C4015a0(new byte[18]);

    /* renamed from: e */
    public int f9369e = 0;

    /* renamed from: k */
    public long f9375k = -9223372036854775807L;

    public C2319k(String str) {
        this.f9366b = str;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: a */
    public void mo9333a(C4015a0 c4015a0) {
        C4014a.m15202h(this.f9368d);
        while (c4015a0.m15226a() > 0) {
            int i10 = this.f9369e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(c4015a0.m15226a(), this.f9374j - this.f9370f);
                    this.f9368d.m22408e(c4015a0, min);
                    int i11 = this.f9370f + min;
                    this.f9370f = i11;
                    int i12 = this.f9374j;
                    if (i11 == i12) {
                        long j10 = this.f9375k;
                        if (j10 != -9223372036854775807L) {
                            this.f9368d.mo4851a(j10, 1, i12, 0, null);
                            this.f9375k += this.f9372h;
                        }
                        this.f9369e = 0;
                    }
                } else if (m9424b(c4015a0, this.f9365a.m15230e(), 18)) {
                    m9425g();
                    this.f9365a.m15223T(0);
                    this.f9368d.m22408e(this.f9365a, 18);
                    this.f9369e = 2;
                }
            } else if (m9426h(c4015a0)) {
                this.f9369e = 1;
            }
        }
    }

    /* renamed from: b */
    public final boolean m9424b(C4015a0 c4015a0, byte[] bArr, int i10) {
        int min = Math.min(c4015a0.m15226a(), i10 - this.f9370f);
        c4015a0.m15237l(bArr, this.f9370f, min);
        int i11 = this.f9370f + min;
        this.f9370f = i11;
        return i11 == i10;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: c */
    public void mo9335c() {
        this.f9369e = 0;
        this.f9370f = 0;
        this.f9371g = 0;
        this.f9375k = -9223372036854775807L;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: d */
    public void mo9336d() {
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: e */
    public void mo9337e(InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        dVar.m9412a();
        this.f9367c = dVar.m9413b();
        this.f9368d = interfaceC5573m.mo3032e(dVar.m9414c(), 1);
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: f */
    public void mo9338f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9375k = j10;
        }
    }

    /* renamed from: g */
    public final void m9425g() {
        byte[] m15230e = this.f9365a.m15230e();
        if (this.f9373i == null) {
            C4463m1 m19007g = C4810c0.m19007g(m15230e, this.f9367c, this.f9366b, null);
            this.f9373i = m19007g;
            this.f9368d.mo4852b(m19007g);
        }
        this.f9374j = C4810c0.m19001a(m15230e);
        this.f9372h = (int) ((C4810c0.m19006f(m15230e) * 1000000) / this.f9373i.f16486G);
    }

    /* renamed from: h */
    public final boolean m9426h(C4015a0 c4015a0) {
        while (c4015a0.m15226a() > 0) {
            int i10 = this.f9371g << 8;
            this.f9371g = i10;
            int m15210G = i10 | c4015a0.m15210G();
            this.f9371g = m15210G;
            if (C4810c0.m19004d(m15210G)) {
                byte[] m15230e = this.f9365a.m15230e();
                int i11 = this.f9371g;
                m15230e[0] = (byte) ((i11 >> 24) & 255);
                m15230e[1] = (byte) ((i11 >> 16) & 255);
                m15230e[2] = (byte) ((i11 >> 8) & 255);
                m15230e[3] = (byte) (i11 & 255);
                this.f9370f = 4;
                this.f9371g = 0;
                return true;
            }
        }
        return false;
    }
}
