package p106h4;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import p106h4.InterfaceC2316i0;
import p126i7.AbstractC2651u;
import p222p5.C4015a0;
import p222p5.C4022e;
import p264s3.C4463m1;

/* renamed from: h4.j */
/* loaded from: classes.dex */
public final class C2317j implements InterfaceC2316i0.c {

    /* renamed from: a */
    public final int f9363a;

    /* renamed from: b */
    public final List<C4463m1> f9364b;

    public C2317j(int i10) {
        this(i10, AbstractC2651u.m10770u());
    }

    public C2317j(int i10, List<C4463m1> list) {
        this.f9363a = i10;
        this.f9364b = list;
    }

    @Override // p106h4.InterfaceC2316i0.c
    /* renamed from: a */
    public SparseArray<InterfaceC2316i0> mo9410a() {
        return new SparseArray<>();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x002e. Please report as an issue. */
    @Override // p106h4.InterfaceC2316i0.c
    /* renamed from: b */
    public InterfaceC2316i0 mo9411b(int i10, InterfaceC2316i0.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new C2332w(new C2329t(bVar.f9355b));
            }
            if (i10 == 21) {
                return new C2332w(new C2327r());
            }
            if (i10 == 27) {
                if (m9419f(4)) {
                    return null;
                }
                return new C2332w(new C2325p(m9416c(bVar), m9419f(1), m9419f(8)));
            }
            if (i10 == 36) {
                return new C2332w(new C2326q(m9416c(bVar)));
            }
            if (i10 == 89) {
                return new C2332w(new C2321l(bVar.f9356c));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new C2332w(new C2309f(bVar.f9355b));
                }
                if (i10 == 257) {
                    return new C2304c0(new C2331v("application/vnd.dvb.ait"));
                }
                if (i10 == 134) {
                    if (m9419f(16)) {
                        return null;
                    }
                    return new C2304c0(new C2331v("application/x-scte35"));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (m9419f(2)) {
                                return null;
                            }
                            return new C2332w(new C2315i(false, bVar.f9355b));
                        case 16:
                            return new C2332w(new C2324o(m9417d(bVar)));
                        case 17:
                            if (m9419f(2)) {
                                return null;
                            }
                            return new C2332w(new C2328s(bVar.f9355b));
                        default:
                            switch (i10) {
                                case 128:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!m9419f(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                    }
                }
                return new C2332w(new C2303c(bVar.f9355b));
            }
            return new C2332w(new C2319k(bVar.f9355b));
        }
        return new C2332w(new C2323n(m9417d(bVar)));
    }

    /* renamed from: c */
    public final C2306d0 m9416c(InterfaceC2316i0.b bVar) {
        return new C2306d0(m9418e(bVar));
    }

    /* renamed from: d */
    public final C2320k0 m9417d(InterfaceC2316i0.b bVar) {
        return new C2320k0(m9418e(bVar));
    }

    /* renamed from: e */
    public final List<C4463m1> m9418e(InterfaceC2316i0.b bVar) {
        String str;
        int i10;
        if (m9419f(32)) {
            return this.f9364b;
        }
        C4015a0 c4015a0 = new C4015a0(bVar.f9357d);
        List<C4463m1> list = this.f9364b;
        while (c4015a0.m15226a() > 0) {
            int m15210G = c4015a0.m15210G();
            int m15231f = c4015a0.m15231f() + c4015a0.m15210G();
            if (m15210G == 134) {
                list = new ArrayList<>();
                int m15210G2 = c4015a0.m15210G() & 31;
                for (int i11 = 0; i11 < m15210G2; i11++) {
                    String m15207D = c4015a0.m15207D(3);
                    int m15210G3 = c4015a0.m15210G();
                    boolean z10 = (m15210G3 & 128) != 0;
                    if (z10) {
                        i10 = m15210G3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte m15210G4 = (byte) c4015a0.m15210G();
                    c4015a0.m15224U(1);
                    List<byte[]> list2 = null;
                    if (z10) {
                        list2 = C4022e.m15278b((m15210G4 & 64) != 0);
                    }
                    list.add(new C4463m1.b().m17474g0(str).m17465X(m15207D).m17449H(i10).m17463V(list2).m17448G());
                }
            }
            c4015a0.m15223T(m15231f);
        }
        return list;
    }

    /* renamed from: f */
    public final boolean m9419f(int i10) {
        return (i10 & this.f9363a) != 0;
    }
}
