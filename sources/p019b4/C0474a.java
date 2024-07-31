package p019b4;

import java.util.Collections;
import p019b4.AbstractC0478e;
import p222p5.C4015a0;
import p264s3.C4463m1;
import p289u3.C4805a;
import p333x3.InterfaceC5559b0;

/* renamed from: b4.a */
/* loaded from: classes.dex */
public final class C0474a extends AbstractC0478e {

    /* renamed from: e */
    public static final int[] f2240e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f2241b;

    /* renamed from: c */
    public boolean f2242c;

    /* renamed from: d */
    public int f2243d;

    public C0474a(InterfaceC5559b0 interfaceC5559b0) {
        super(interfaceC5559b0);
    }

    @Override // p019b4.AbstractC0478e
    /* renamed from: b */
    public boolean mo2388b(C4015a0 c4015a0) {
        C4463m1.b m17475h0;
        if (this.f2241b) {
            c4015a0.m15224U(1);
        } else {
            int m15210G = c4015a0.m15210G();
            int i10 = (m15210G >> 4) & 15;
            this.f2243d = i10;
            if (i10 == 2) {
                m17475h0 = new C4463m1.b().m17474g0("audio/mpeg").m17451J(1).m17475h0(f2240e[(m15210G >> 2) & 3]);
            } else if (i10 == 7 || i10 == 8) {
                m17475h0 = new C4463m1.b().m17474g0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").m17451J(1).m17475h0(8000);
            } else {
                if (i10 != 10) {
                    throw new AbstractC0478e.a("Audio format not supported: " + this.f2243d);
                }
                this.f2241b = true;
            }
            this.f2265a.mo4852b(m17475h0.m17448G());
            this.f2242c = true;
            this.f2241b = true;
        }
        return true;
    }

    @Override // p019b4.AbstractC0478e
    /* renamed from: c */
    public boolean mo2389c(C4015a0 c4015a0, long j10) {
        if (this.f2243d == 2) {
            int m15226a = c4015a0.m15226a();
            this.f2265a.m22408e(c4015a0, m15226a);
            this.f2265a.mo4851a(j10, 1, m15226a, 0, null);
            return true;
        }
        int m15210G = c4015a0.m15210G();
        if (m15210G != 0 || this.f2242c) {
            if (this.f2243d == 10 && m15210G != 1) {
                return false;
            }
            int m15226a2 = c4015a0.m15226a();
            this.f2265a.m22408e(c4015a0, m15226a2);
            this.f2265a.mo4851a(j10, 1, m15226a2, 0, null);
            return true;
        }
        int m15226a3 = c4015a0.m15226a();
        byte[] bArr = new byte[m15226a3];
        c4015a0.m15237l(bArr, 0, m15226a3);
        C4805a.b m18861f = C4805a.m18861f(bArr);
        this.f2265a.mo4852b(new C4463m1.b().m17474g0("audio/mp4a-latm").m17452K(m18861f.f17867c).m17451J(m18861f.f17866b).m17475h0(m18861f.f17865a).m17463V(Collections.singletonList(bArr)).m17448G());
        this.f2242c = true;
        return false;
    }
}
