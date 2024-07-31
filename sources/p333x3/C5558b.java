package p333x3;

import p222p5.C4015a0;
import p222p5.C4046r;

/* renamed from: x3.b */
/* loaded from: classes.dex */
public final class C5558b {
    /* renamed from: a */
    public static void m22404a(long j10, C4015a0 c4015a0, InterfaceC5559b0[] interfaceC5559b0Arr) {
        while (true) {
            if (c4015a0.m15226a() <= 1) {
                return;
            }
            int m22406c = m22406c(c4015a0);
            int m22406c2 = m22406c(c4015a0);
            int m15231f = c4015a0.m15231f() + m22406c2;
            if (m22406c2 == -1 || m22406c2 > c4015a0.m15226a()) {
                C4046r.m15529i("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                m15231f = c4015a0.m15232g();
            } else if (m22406c == 4 && m22406c2 >= 8) {
                int m15210G = c4015a0.m15210G();
                int m15216M = c4015a0.m15216M();
                int m15241p = m15216M == 49 ? c4015a0.m15241p() : 0;
                int m15210G2 = c4015a0.m15210G();
                if (m15216M == 47) {
                    c4015a0.m15224U(1);
                }
                boolean z10 = m15210G == 181 && (m15216M == 49 || m15216M == 47) && m15210G2 == 3;
                if (m15216M == 49) {
                    z10 &= m15241p == 1195456820;
                }
                if (z10) {
                    m22405b(j10, c4015a0, interfaceC5559b0Arr);
                }
            }
            c4015a0.m15223T(m15231f);
        }
    }

    /* renamed from: b */
    public static void m22405b(long j10, C4015a0 c4015a0, InterfaceC5559b0[] interfaceC5559b0Arr) {
        int m15210G = c4015a0.m15210G();
        if ((m15210G & 64) != 0) {
            c4015a0.m15224U(1);
            int i10 = (m15210G & 31) * 3;
            int m15231f = c4015a0.m15231f();
            for (InterfaceC5559b0 interfaceC5559b0 : interfaceC5559b0Arr) {
                c4015a0.m15223T(m15231f);
                interfaceC5559b0.m22408e(c4015a0, i10);
                if (j10 != -9223372036854775807L) {
                    interfaceC5559b0.mo4851a(j10, 1, i10, 0, null);
                }
            }
        }
    }

    /* renamed from: c */
    public static int m22406c(C4015a0 c4015a0) {
        int i10 = 0;
        while (c4015a0.m15226a() != 0) {
            int m15210G = c4015a0.m15210G();
            i10 += m15210G;
            if (m15210G != 255) {
                return i10;
            }
        }
        return -1;
    }
}
