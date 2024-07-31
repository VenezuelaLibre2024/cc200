package p094g4;

import java.util.Arrays;
import java.util.List;
import p094g4.AbstractC1994i;
import p126i7.AbstractC2651u;
import p152k4.C3348a;
import p222p5.C4014a;
import p222p5.C4015a0;
import p264s3.C4463m1;
import p289u3.C4818g0;
import p333x3.C5565e0;

/* renamed from: g4.h */
/* loaded from: classes.dex */
public final class C1993h extends AbstractC1994i {

    /* renamed from: o */
    public static final byte[] f7941o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    public static final byte[] f7942p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n */
    public boolean f7943n;

    /* renamed from: n */
    public static boolean m8047n(C4015a0 c4015a0, byte[] bArr) {
        if (c4015a0.m15226a() < bArr.length) {
            return false;
        }
        int m15231f = c4015a0.m15231f();
        byte[] bArr2 = new byte[bArr.length];
        c4015a0.m15237l(bArr2, 0, bArr.length);
        c4015a0.m15223T(m15231f);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: o */
    public static boolean m8048o(C4015a0 c4015a0) {
        return m8047n(c4015a0, f7941o);
    }

    @Override // p094g4.AbstractC1994i
    /* renamed from: f */
    public long mo8028f(C4015a0 c4015a0) {
        return m8051c(C4818g0.m19073e(c4015a0.m15230e()));
    }

    @Override // p094g4.AbstractC1994i
    /* renamed from: h */
    public boolean mo8029h(C4015a0 c4015a0, long j10, AbstractC1994i.b bVar) {
        C4463m1.b m17467Z;
        if (m8047n(c4015a0, f7941o)) {
            byte[] copyOf = Arrays.copyOf(c4015a0.m15230e(), c4015a0.m15232g());
            int m19071c = C4818g0.m19071c(copyOf);
            List<byte[]> m19069a = C4818g0.m19069a(copyOf);
            if (bVar.f7957a != null) {
                return true;
            }
            m17467Z = new C4463m1.b().m17474g0("audio/opus").m17451J(m19071c).m17475h0(48000).m17463V(m19069a);
        } else {
            byte[] bArr = f7942p;
            if (!m8047n(c4015a0, bArr)) {
                C4014a.m15202h(bVar.f7957a);
                return false;
            }
            C4014a.m15202h(bVar.f7957a);
            if (this.f7943n) {
                return true;
            }
            this.f7943n = true;
            c4015a0.m15224U(bArr.length);
            C3348a m22440c = C5565e0.m22440c(AbstractC2651u.m10769q(C5565e0.m22447j(c4015a0, false, false).f20894b));
            if (m22440c == null) {
                return true;
            }
            m17467Z = bVar.f7957a.m17411b().m17467Z(m22440c.m12411b(bVar.f7957a.f16504q));
        }
        bVar.f7957a = m17467Z.m17448G();
        return true;
    }

    @Override // p094g4.AbstractC1994i
    /* renamed from: l */
    public void mo8030l(boolean z10) {
        super.mo8030l(z10);
        if (z10) {
            this.f7943n = false;
        }
    }
}
