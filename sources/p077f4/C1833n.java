package p077f4;

import p222p5.C4015a0;
import p333x3.InterfaceC5572l;

/* renamed from: f4.n */
/* loaded from: classes.dex */
public final class C1833n {

    /* renamed from: a */
    public static final int[] f6927a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static boolean m7543a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f6927a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m7544b(InterfaceC5572l interfaceC5572l) {
        return m7545c(interfaceC5572l, true, false);
    }

    /* renamed from: c */
    public static boolean m7545c(InterfaceC5572l interfaceC5572l, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        long mo3029b = interfaceC5572l.mo3029b();
        long j10 = -1;
        long j11 = 4096;
        if (mo3029b != -1 && mo3029b <= 4096) {
            j11 = mo3029b;
        }
        int i10 = (int) j11;
        C4015a0 c4015a0 = new C4015a0(64);
        boolean z17 = false;
        int i11 = 0;
        boolean z18 = false;
        while (i11 < i10) {
            c4015a0.m15219P(8);
            if (!interfaceC5572l.mo22424e(c4015a0.m15230e(), z17 ? 1 : 0, 8, true)) {
                break;
            }
            long m15212I = c4015a0.m15212I();
            int m15241p = c4015a0.m15241p();
            int i12 = 16;
            if (m15212I == 1) {
                interfaceC5572l.mo22430p(c4015a0.m15230e(), 8, 8);
                c4015a0.m15222S(16);
                m15212I = c4015a0.m15251z();
            } else {
                if (m15212I == 0) {
                    long mo3029b2 = interfaceC5572l.mo3029b();
                    if (mo3029b2 != j10) {
                        m15212I = (mo3029b2 - interfaceC5572l.mo3030f()) + 8;
                    }
                }
                i12 = 8;
            }
            long j12 = i12;
            if (m15212I < j12) {
                return z17;
            }
            i11 += i12;
            if (m15241p == 1836019574) {
                i10 += (int) m15212I;
                if (mo3029b != -1 && i10 > mo3029b) {
                    i10 = (int) mo3029b;
                }
            } else {
                if (m15241p == 1836019558 || m15241p == 1836475768) {
                    z12 = z17 ? 1 : 0;
                    z13 = true;
                    z14 = true;
                    break;
                }
                long j13 = mo3029b;
                if ((i11 + m15212I) - j12 >= i10) {
                    z12 = false;
                    z13 = true;
                    break;
                }
                int i13 = (int) (m15212I - j12);
                i11 += i13;
                if (m15241p != 1718909296) {
                    z15 = false;
                    z18 = z18;
                    if (i13 != 0) {
                        interfaceC5572l.mo22425h(i13);
                        z18 = z18;
                    }
                } else {
                    if (i13 < 8) {
                        return false;
                    }
                    c4015a0.m15219P(i13);
                    interfaceC5572l.mo22430p(c4015a0.m15230e(), 0, i13);
                    int i14 = i13 / 4;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= i14) {
                            z16 = z18;
                            break;
                        }
                        if (i15 == 1) {
                            c4015a0.m15224U(4);
                        } else if (m7543a(c4015a0.m15241p(), z11)) {
                            z16 = true;
                            break;
                        }
                        i15++;
                    }
                    z15 = false;
                    z18 = z16;
                    if (!z16) {
                        return false;
                    }
                }
                z17 = z15;
                mo3029b = j13;
            }
            j10 = -1;
            z18 = z18;
        }
        z12 = z17 ? 1 : 0;
        z13 = true;
        z14 = z12;
        return (z18 && z10 == z14) ? z13 : z12;
    }

    /* renamed from: d */
    public static boolean m7546d(InterfaceC5572l interfaceC5572l, boolean z10) {
        return m7545c(interfaceC5572l, false, z10);
    }
}
