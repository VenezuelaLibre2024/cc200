package p077f4;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p077f4.AbstractC1820a;
import p109h7.InterfaceC2424g;
import p126i7.AbstractC2651u;
import p152k4.C3348a;
import p155k7.C3368e;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4050v;
import p235q4.C4163a;
import p235q4.C4167e;
import p236q5.C4168a;
import p236q5.C4170c;
import p236q5.C4171d;
import p236q5.C4173f;
import p264s3.C4463m1;
import p264s3.C4499t2;
import p317w3.C5247m;
import p333x3.C5574n;
import p333x3.C5582v;

/* renamed from: f4.b */
/* loaded from: classes.dex */
public final class C1821b {

    /* renamed from: a */
    public static final byte[] f6790a = C4041n0.m15468l0("OpusHead");

    /* renamed from: f4.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f6791a;

        /* renamed from: b */
        public int f6792b;

        /* renamed from: c */
        public int f6793c;

        /* renamed from: d */
        public long f6794d;

        /* renamed from: e */
        public final boolean f6795e;

        /* renamed from: f */
        public final C4015a0 f6796f;

        /* renamed from: g */
        public final C4015a0 f6797g;

        /* renamed from: h */
        public int f6798h;

        /* renamed from: i */
        public int f6799i;

        public a(C4015a0 c4015a0, C4015a0 c4015a02, boolean z10) {
            this.f6797g = c4015a0;
            this.f6796f = c4015a02;
            this.f6795e = z10;
            c4015a02.m15223T(12);
            this.f6791a = c4015a02.m15214K();
            c4015a0.m15223T(12);
            this.f6799i = c4015a0.m15214K();
            C5574n.m22460a(c4015a0.m15241p() == 1, "first_chunk must be 1");
            this.f6792b = -1;
        }

        /* renamed from: a */
        public boolean m7426a() {
            int i10 = this.f6792b + 1;
            this.f6792b = i10;
            if (i10 == this.f6791a) {
                return false;
            }
            this.f6794d = this.f6795e ? this.f6796f.m15215L() : this.f6796f.m15212I();
            if (this.f6792b == this.f6798h) {
                this.f6793c = this.f6797g.m15214K();
                this.f6797g.m15224U(4);
                int i11 = this.f6799i - 1;
                this.f6799i = i11;
                this.f6798h = i11 > 0 ? this.f6797g.m15214K() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: f4.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f6800a;

        /* renamed from: b */
        public final byte[] f6801b;

        /* renamed from: c */
        public final long f6802c;

        /* renamed from: d */
        public final long f6803d;

        public b(String str, byte[] bArr, long j10, long j11) {
            this.f6800a = str;
            this.f6801b = bArr;
            this.f6802c = j10;
            this.f6803d = j11;
        }
    }

    /* renamed from: f4.b$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        int mo7431a();

        /* renamed from: b */
        int mo7432b();

        /* renamed from: c */
        int mo7433c();
    }

    /* renamed from: f4.b$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final C1835p[] f6804a;

        /* renamed from: b */
        public C4463m1 f6805b;

        /* renamed from: c */
        public int f6806c;

        /* renamed from: d */
        public int f6807d = 0;

        public d(int i10) {
            this.f6804a = new C1835p[i10];
        }
    }

    /* renamed from: f4.b$e */
    /* loaded from: classes.dex */
    public static final class e implements c {

        /* renamed from: a */
        public final int f6808a;

        /* renamed from: b */
        public final int f6809b;

        /* renamed from: c */
        public final C4015a0 f6810c;

        public e(AbstractC1820a.b bVar, C4463m1 c4463m1) {
            C4015a0 c4015a0 = bVar.f6789b;
            this.f6810c = c4015a0;
            c4015a0.m15223T(12);
            int m15214K = c4015a0.m15214K();
            if ("audio/raw".equals(c4463m1.f16506s)) {
                int m15452d0 = C4041n0.m15452d0(c4463m1.f16487H, c4463m1.f16485F);
                if (m15214K == 0 || m15214K % m15452d0 != 0) {
                    C4046r.m15529i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + m15452d0 + ", stsz sample size: " + m15214K);
                    m15214K = m15452d0;
                }
            }
            this.f6808a = m15214K == 0 ? -1 : m15214K;
            this.f6809b = c4015a0.m15214K();
        }

        @Override // p077f4.C1821b.c
        /* renamed from: a */
        public int mo7431a() {
            return this.f6808a;
        }

        @Override // p077f4.C1821b.c
        /* renamed from: b */
        public int mo7432b() {
            return this.f6809b;
        }

        @Override // p077f4.C1821b.c
        /* renamed from: c */
        public int mo7433c() {
            int i10 = this.f6808a;
            return i10 == -1 ? this.f6810c.m15214K() : i10;
        }
    }

    /* renamed from: f4.b$f */
    /* loaded from: classes.dex */
    public static final class f implements c {

        /* renamed from: a */
        public final C4015a0 f6811a;

        /* renamed from: b */
        public final int f6812b;

        /* renamed from: c */
        public final int f6813c;

        /* renamed from: d */
        public int f6814d;

        /* renamed from: e */
        public int f6815e;

        public f(AbstractC1820a.b bVar) {
            C4015a0 c4015a0 = bVar.f6789b;
            this.f6811a = c4015a0;
            c4015a0.m15223T(12);
            this.f6813c = c4015a0.m15214K() & 255;
            this.f6812b = c4015a0.m15214K();
        }

        @Override // p077f4.C1821b.c
        /* renamed from: a */
        public int mo7431a() {
            return -1;
        }

        @Override // p077f4.C1821b.c
        /* renamed from: b */
        public int mo7432b() {
            return this.f6812b;
        }

        @Override // p077f4.C1821b.c
        /* renamed from: c */
        public int mo7433c() {
            int i10 = this.f6813c;
            if (i10 == 8) {
                return this.f6811a.m15210G();
            }
            if (i10 == 16) {
                return this.f6811a.m15216M();
            }
            int i11 = this.f6814d;
            this.f6814d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f6815e & 15;
            }
            int m15210G = this.f6811a.m15210G();
            this.f6815e = m15210G;
            return (m15210G & 240) >> 4;
        }
    }

    /* renamed from: f4.b$g */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        public final int f6816a;

        /* renamed from: b */
        public final long f6817b;

        /* renamed from: c */
        public final int f6818c;

        public g(int i10, long j10, int i11) {
            this.f6816a = i10;
            this.f6817b = j10;
            this.f6818c = i11;
        }
    }

    /* renamed from: A */
    public static List<C1837r> m7396A(AbstractC1820a.a aVar, C5582v c5582v, long j10, C5247m c5247m, boolean z10, boolean z11, InterfaceC2424g<C1834o, C1834o> interfaceC2424g) {
        C1834o apply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVar.f6788d.size(); i10++) {
            AbstractC1820a.a aVar2 = aVar.f6788d.get(i10);
            if (aVar2.f6785a == 1953653099 && (apply = interfaceC2424g.apply(m7425z(aVar2, (AbstractC1820a.b) C4014a.m15199e(aVar.m7395g(1836476516)), j10, c5247m, z10, z11))) != null) {
                arrayList.add(m7421v(apply, (AbstractC1820a.a) C4014a.m15199e(((AbstractC1820a.a) C4014a.m15199e(((AbstractC1820a.a) C4014a.m15199e(aVar2.m7394f(1835297121))).m7394f(1835626086))).m7394f(1937007212)), c5582v));
            }
        }
        return arrayList;
    }

    /* renamed from: B */
    public static Pair<C3348a, C3348a> m7397B(AbstractC1820a.b bVar) {
        C4015a0 c4015a0 = bVar.f6789b;
        c4015a0.m15223T(8);
        C3348a c3348a = null;
        C3348a c3348a2 = null;
        while (c4015a0.m15226a() >= 8) {
            int m15231f = c4015a0.m15231f();
            int m15241p = c4015a0.m15241p();
            int m15241p2 = c4015a0.m15241p();
            if (m15241p2 == 1835365473) {
                c4015a0.m15223T(m15231f);
                c3348a = m7398C(c4015a0, m15231f + m15241p);
            } else if (m15241p2 == 1936553057) {
                c4015a0.m15223T(m15231f);
                c3348a2 = m7420u(c4015a0, m15231f + m15241p);
            }
            c4015a0.m15223T(m15231f + m15241p);
        }
        return Pair.create(c3348a, c3348a2);
    }

    /* renamed from: C */
    public static C3348a m7398C(C4015a0 c4015a0, int i10) {
        c4015a0.m15224U(8);
        m7404e(c4015a0);
        while (c4015a0.m15231f() < i10) {
            int m15231f = c4015a0.m15231f();
            int m15241p = c4015a0.m15241p();
            if (c4015a0.m15241p() == 1768715124) {
                c4015a0.m15223T(m15231f);
                return m7411l(c4015a0, m15231f + m15241p);
            }
            c4015a0.m15223T(m15231f + m15241p);
        }
        return null;
    }

    /* renamed from: D */
    public static void m7399D(C4015a0 c4015a0, int i10, int i11, int i12, int i13, int i14, C5247m c5247m, d dVar, int i15) {
        C5247m c5247m2;
        int i16;
        int i17;
        int i18;
        float f10;
        List<byte[]> list;
        int i19;
        int i20;
        String str;
        int i21 = i11;
        int i22 = i12;
        C5247m c5247m3 = c5247m;
        d dVar2 = dVar;
        c4015a0.m15223T(i21 + 8 + 8);
        c4015a0.m15224U(16);
        int m15216M = c4015a0.m15216M();
        int m15216M2 = c4015a0.m15216M();
        c4015a0.m15224U(50);
        int m15231f = c4015a0.m15231f();
        int i23 = i10;
        if (i23 == 1701733238) {
            Pair<Integer, C1835p> m7418s = m7418s(c4015a0, i21, i22);
            if (m7418s != null) {
                i23 = ((Integer) m7418s.first).intValue();
                c5247m3 = c5247m3 == null ? null : c5247m3.m21258d(((C1835p) m7418s.second).f6940b);
                dVar2.f6804a[i15] = (C1835p) m7418s.second;
            }
            c4015a0.m15223T(m15231f);
        }
        String str2 = "video/3gpp";
        String str3 = i23 == 1831958048 ? "video/mpeg" : i23 == 1211250227 ? "video/3gpp" : null;
        float f11 = 1.0f;
        int i24 = -1;
        String str4 = null;
        List<byte[]> list2 = null;
        byte[] bArr = null;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        ByteBuffer byteBuffer = null;
        b bVar = null;
        boolean z10 = false;
        while (true) {
            if (m15231f - i21 >= i22) {
                c5247m2 = c5247m3;
                break;
            }
            c4015a0.m15223T(m15231f);
            int m15231f2 = c4015a0.m15231f();
            String str5 = str2;
            int m15241p = c4015a0.m15241p();
            if (m15241p == 0) {
                c5247m2 = c5247m3;
                if (c4015a0.m15231f() - i21 == i22) {
                    break;
                }
            } else {
                c5247m2 = c5247m3;
            }
            C5574n.m22460a(m15241p > 0, "childAtomSize must be positive");
            int m15241p2 = c4015a0.m15241p();
            if (m15241p2 == 1635148611) {
                C5574n.m22460a(str3 == null, null);
                c4015a0.m15223T(m15231f2 + 8);
                C4168a m16027b = C4168a.m16027b(c4015a0);
                list2 = m16027b.f14977a;
                dVar2.f6806c = m16027b.f14978b;
                if (!z10) {
                    f11 = m16027b.f14981e;
                }
                str4 = m16027b.f14982f;
                str = "video/avc";
            } else if (m15241p2 == 1752589123) {
                C5574n.m22460a(str3 == null, null);
                c4015a0.m15223T(m15231f2 + 8);
                C4173f m16047a = C4173f.m16047a(c4015a0);
                list2 = m16047a.f15012a;
                dVar2.f6806c = m16047a.f15013b;
                if (!z10) {
                    f11 = m16047a.f15016e;
                }
                str4 = m16047a.f15020i;
                i24 = m16047a.f15017f;
                int i28 = m16047a.f15018g;
                i27 = m16047a.f15019h;
                i26 = i28;
                i16 = m15216M;
                i17 = m15216M2;
                str3 = "video/hevc";
                i18 = i23;
                m15231f += m15241p;
                i21 = i11;
                i22 = i12;
                dVar2 = dVar;
                str2 = str5;
                c5247m3 = c5247m2;
                i23 = i18;
                m15216M2 = i17;
                m15216M = i16;
            } else {
                if (m15241p2 == 1685480259 || m15241p2 == 1685485123) {
                    i16 = m15216M;
                    i17 = m15216M2;
                    i18 = i23;
                    f10 = f11;
                    list = list2;
                    i19 = i26;
                    i20 = i27;
                    C4171d m16032a = C4171d.m16032a(c4015a0);
                    if (m16032a != null) {
                        str4 = m16032a.f14997c;
                        str3 = "video/dolby-vision";
                    }
                } else if (m15241p2 == 1987076931) {
                    C5574n.m22460a(str3 == null, null);
                    str = i23 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                    c4015a0.m15223T(m15231f2 + 12);
                    c4015a0.m15224U(2);
                    boolean z11 = (c4015a0.m15210G() & 1) != 0;
                    int m15210G = c4015a0.m15210G();
                    int m15210G2 = c4015a0.m15210G();
                    i24 = C4170c.m16029b(m15210G);
                    i26 = z11 ? 1 : 2;
                    i27 = C4170c.m16030c(m15210G2);
                } else if (m15241p2 == 1635135811) {
                    C5574n.m22460a(str3 == null, null);
                    str = "video/av01";
                } else if (m15241p2 == 1668050025) {
                    ByteBuffer m7400a = byteBuffer == null ? m7400a() : byteBuffer;
                    m7400a.position(21);
                    m7400a.putShort(c4015a0.m15206C());
                    m7400a.putShort(c4015a0.m15206C());
                    byteBuffer = m7400a;
                    i16 = m15216M;
                    i17 = m15216M2;
                    i18 = i23;
                    m15231f += m15241p;
                    i21 = i11;
                    i22 = i12;
                    dVar2 = dVar;
                    str2 = str5;
                    c5247m3 = c5247m2;
                    i23 = i18;
                    m15216M2 = i17;
                    m15216M = i16;
                } else if (m15241p2 == 1835295606) {
                    ByteBuffer m7400a2 = byteBuffer == null ? m7400a() : byteBuffer;
                    short m15206C = c4015a0.m15206C();
                    short m15206C2 = c4015a0.m15206C();
                    short m15206C3 = c4015a0.m15206C();
                    i18 = i23;
                    short m15206C4 = c4015a0.m15206C();
                    short m15206C5 = c4015a0.m15206C();
                    List<byte[]> list3 = list2;
                    short m15206C6 = c4015a0.m15206C();
                    float f12 = f11;
                    short m15206C7 = c4015a0.m15206C();
                    i17 = m15216M2;
                    short m15206C8 = c4015a0.m15206C();
                    long m15212I = c4015a0.m15212I();
                    long m15212I2 = c4015a0.m15212I();
                    i16 = m15216M;
                    m7400a2.position(1);
                    m7400a2.putShort(m15206C5);
                    m7400a2.putShort(m15206C6);
                    m7400a2.putShort(m15206C);
                    m7400a2.putShort(m15206C2);
                    m7400a2.putShort(m15206C3);
                    m7400a2.putShort(m15206C4);
                    m7400a2.putShort(m15206C7);
                    m7400a2.putShort(m15206C8);
                    m7400a2.putShort((short) (m15212I / 10000));
                    m7400a2.putShort((short) (m15212I2 / 10000));
                    byteBuffer = m7400a2;
                    list2 = list3;
                    f11 = f12;
                    m15231f += m15241p;
                    i21 = i11;
                    i22 = i12;
                    dVar2 = dVar;
                    str2 = str5;
                    c5247m3 = c5247m2;
                    i23 = i18;
                    m15216M2 = i17;
                    m15216M = i16;
                } else {
                    i16 = m15216M;
                    i17 = m15216M2;
                    i18 = i23;
                    f10 = f11;
                    list = list2;
                    if (m15241p2 == 1681012275) {
                        C5574n.m22460a(str3 == null, null);
                        str3 = str5;
                    } else if (m15241p2 == 1702061171) {
                        C5574n.m22460a(str3 == null, null);
                        bVar = m7408i(c4015a0, m15231f2);
                        String str6 = bVar.f6800a;
                        byte[] bArr2 = bVar.f6801b;
                        list2 = bArr2 != null ? AbstractC2651u.m10771v(bArr2) : list;
                        str3 = str6;
                        f11 = f10;
                        m15231f += m15241p;
                        i21 = i11;
                        i22 = i12;
                        dVar2 = dVar;
                        str2 = str5;
                        c5247m3 = c5247m2;
                        i23 = i18;
                        m15216M2 = i17;
                        m15216M = i16;
                    } else if (m15241p2 == 1885434736) {
                        f11 = m7416q(c4015a0, m15231f2);
                        list2 = list;
                        z10 = true;
                        m15231f += m15241p;
                        i21 = i11;
                        i22 = i12;
                        dVar2 = dVar;
                        str2 = str5;
                        c5247m3 = c5247m2;
                        i23 = i18;
                        m15216M2 = i17;
                        m15216M = i16;
                    } else if (m15241p2 == 1937126244) {
                        bArr = m7417r(c4015a0, m15231f2, m15241p);
                    } else if (m15241p2 == 1936995172) {
                        int m15210G3 = c4015a0.m15210G();
                        c4015a0.m15224U(3);
                        if (m15210G3 == 0) {
                            int m15210G4 = c4015a0.m15210G();
                            if (m15210G4 == 0) {
                                i25 = 0;
                            } else if (m15210G4 == 1) {
                                i25 = 1;
                            } else if (m15210G4 == 2) {
                                i25 = 2;
                            } else if (m15210G4 == 3) {
                                i25 = 3;
                            }
                        }
                    } else if (m15241p2 == 1668246642 && i24 == -1) {
                        i19 = i26;
                        i20 = i27;
                        if (i19 == -1 && i20 == -1) {
                            int m15241p3 = c4015a0.m15241p();
                            if (m15241p3 == 1852009592 || m15241p3 == 1852009571) {
                                int m15216M3 = c4015a0.m15216M();
                                int m15216M4 = c4015a0.m15216M();
                                c4015a0.m15224U(2);
                                boolean z12 = m15241p == 19 && (c4015a0.m15210G() & 128) != 0;
                                i24 = C4170c.m16029b(m15216M3);
                                i26 = z12 ? 1 : 2;
                                i27 = C4170c.m16030c(m15216M4);
                            } else {
                                C4046r.m15529i("AtomParsers", "Unsupported color type: " + AbstractC1820a.m7389a(m15241p3));
                            }
                        }
                    } else {
                        i19 = i26;
                        i20 = i27;
                    }
                    list2 = list;
                    f11 = f10;
                    m15231f += m15241p;
                    i21 = i11;
                    i22 = i12;
                    dVar2 = dVar;
                    str2 = str5;
                    c5247m3 = c5247m2;
                    i23 = i18;
                    m15216M2 = i17;
                    m15216M = i16;
                }
                i26 = i19;
                i27 = i20;
                list2 = list;
                f11 = f10;
                m15231f += m15241p;
                i21 = i11;
                i22 = i12;
                dVar2 = dVar;
                str2 = str5;
                c5247m3 = c5247m2;
                i23 = i18;
                m15216M2 = i17;
                m15216M = i16;
            }
            str3 = str;
            i16 = m15216M;
            i17 = m15216M2;
            i18 = i23;
            m15231f += m15241p;
            i21 = i11;
            i22 = i12;
            dVar2 = dVar;
            str2 = str5;
            c5247m3 = c5247m2;
            i23 = i18;
            m15216M2 = i17;
            m15216M = i16;
        }
        int i29 = m15216M;
        int i30 = m15216M2;
        float f13 = f11;
        List<byte[]> list4 = list2;
        int i31 = i26;
        int i32 = i27;
        if (str3 == null) {
            return;
        }
        C4463m1.b m17456O = new C4463m1.b().m17461T(i13).m17474g0(str3).m17452K(str4).m17481n0(i29).m17460S(i30).m17470c0(f13).m17473f0(i14).m17471d0(bArr).m17477j0(i25).m17463V(list4).m17456O(c5247m2);
        if (i24 != -1 || i31 != -1 || i32 != -1 || byteBuffer != null) {
            m17456O.m17453L(new C4170c(i24, i31, i32, byteBuffer != null ? byteBuffer.array() : null));
        }
        if (bVar != null) {
            m17456O.m17450I(C3368e.m12532k(bVar.f6802c)).m17469b0(C3368e.m12532k(bVar.f6803d));
        }
        dVar.f6805b = m17456O.m17448G();
    }

    /* renamed from: a */
    public static ByteBuffer m7400a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: b */
    public static boolean m7401b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[C4041n0.m15477q(4, 0, length)] && jArr[C4041n0.m15477q(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    /* renamed from: c */
    public static int m7402c(C4015a0 c4015a0, int i10, int i11, int i12) {
        int m15231f = c4015a0.m15231f();
        C5574n.m22460a(m15231f >= i11, null);
        while (m15231f - i11 < i12) {
            c4015a0.m15223T(m15231f);
            int m15241p = c4015a0.m15241p();
            C5574n.m22460a(m15241p > 0, "childAtomSize must be positive");
            if (c4015a0.m15241p() == i10) {
                return m15231f;
            }
            m15231f += m15241p;
        }
        return -1;
    }

    /* renamed from: d */
    public static int m7403d(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    /* renamed from: e */
    public static void m7404e(C4015a0 c4015a0) {
        int m15231f = c4015a0.m15231f();
        c4015a0.m15224U(4);
        if (c4015a0.m15241p() != 1751411826) {
            m15231f += 4;
        }
        c4015a0.m15223T(m15231f);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0165  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m7405f(p222p5.C4015a0 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, p317w3.C5247m r29, p077f4.C1821b.d r30, int r31) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p077f4.C1821b.m7405f(p5.a0, int, int, int, int, java.lang.String, boolean, w3.m, f4.b$d, int):void");
    }

    /* renamed from: g */
    public static Pair<Integer, C1835p> m7406g(C4015a0 c4015a0, int i10, int i11) {
        int i12 = i10 + 8;
        int i13 = -1;
        String str = null;
        Integer num = null;
        int i14 = 0;
        while (i12 - i10 < i11) {
            c4015a0.m15223T(i12);
            int m15241p = c4015a0.m15241p();
            int m15241p2 = c4015a0.m15241p();
            if (m15241p2 == 1718775137) {
                num = Integer.valueOf(c4015a0.m15241p());
            } else if (m15241p2 == 1935894637) {
                c4015a0.m15224U(4);
                str = c4015a0.m15207D(4);
            } else if (m15241p2 == 1935894633) {
                i13 = i12;
                i14 = m15241p;
            }
            i12 += m15241p;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        C5574n.m22460a(num != null, "frma atom is mandatory");
        C5574n.m22460a(i13 != -1, "schi atom is mandatory");
        C1835p m7419t = m7419t(c4015a0, i13, i14, str);
        C5574n.m22460a(m7419t != null, "tenc atom is mandatory");
        return Pair.create(num, (C1835p) C4041n0.m15463j(m7419t));
    }

    /* renamed from: h */
    public static Pair<long[], long[]> m7407h(AbstractC1820a.a aVar) {
        AbstractC1820a.b m7395g = aVar.m7395g(1701606260);
        if (m7395g == null) {
            return null;
        }
        C4015a0 c4015a0 = m7395g.f6789b;
        c4015a0.m15223T(8);
        int m7391c = AbstractC1820a.m7391c(c4015a0.m15241p());
        int m15214K = c4015a0.m15214K();
        long[] jArr = new long[m15214K];
        long[] jArr2 = new long[m15214K];
        for (int i10 = 0; i10 < m15214K; i10++) {
            jArr[i10] = m7391c == 1 ? c4015a0.m15215L() : c4015a0.m15212I();
            jArr2[i10] = m7391c == 1 ? c4015a0.m15251z() : c4015a0.m15241p();
            if (c4015a0.m15206C() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            c4015a0.m15224U(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: i */
    public static b m7408i(C4015a0 c4015a0, int i10) {
        c4015a0.m15223T(i10 + 8 + 4);
        c4015a0.m15224U(1);
        m7409j(c4015a0);
        c4015a0.m15224U(2);
        int m15210G = c4015a0.m15210G();
        if ((m15210G & 128) != 0) {
            c4015a0.m15224U(2);
        }
        if ((m15210G & 64) != 0) {
            c4015a0.m15224U(c4015a0.m15210G());
        }
        if ((m15210G & 32) != 0) {
            c4015a0.m15224U(2);
        }
        c4015a0.m15224U(1);
        m7409j(c4015a0);
        String m15551h = C4050v.m15551h(c4015a0.m15210G());
        if ("audio/mpeg".equals(m15551h) || "audio/vnd.dts".equals(m15551h) || "audio/vnd.dts.hd".equals(m15551h)) {
            return new b(m15551h, null, -1L, -1L);
        }
        c4015a0.m15224U(4);
        long m15212I = c4015a0.m15212I();
        long m15212I2 = c4015a0.m15212I();
        c4015a0.m15224U(1);
        int m7409j = m7409j(c4015a0);
        byte[] bArr = new byte[m7409j];
        c4015a0.m15237l(bArr, 0, m7409j);
        return new b(m15551h, bArr, m15212I2 > 0 ? m15212I2 : -1L, m15212I > 0 ? m15212I : -1L);
    }

    /* renamed from: j */
    public static int m7409j(C4015a0 c4015a0) {
        int m15210G = c4015a0.m15210G();
        int i10 = m15210G & 127;
        while ((m15210G & 128) == 128) {
            m15210G = c4015a0.m15210G();
            i10 = (i10 << 7) | (m15210G & 127);
        }
        return i10;
    }

    /* renamed from: k */
    public static int m7410k(C4015a0 c4015a0) {
        c4015a0.m15223T(16);
        return c4015a0.m15241p();
    }

    /* renamed from: l */
    public static C3348a m7411l(C4015a0 c4015a0, int i10) {
        c4015a0.m15224U(8);
        ArrayList arrayList = new ArrayList();
        while (c4015a0.m15231f() < i10) {
            C3348a.b m7492c = C1827h.m7492c(c4015a0);
            if (m7492c != null) {
                arrayList.add(m7492c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C3348a(arrayList);
    }

    /* renamed from: m */
    public static Pair<Long, String> m7412m(C4015a0 c4015a0) {
        c4015a0.m15223T(8);
        int m7391c = AbstractC1820a.m7391c(c4015a0.m15241p());
        c4015a0.m15224U(m7391c == 0 ? 8 : 16);
        long m15212I = c4015a0.m15212I();
        c4015a0.m15224U(m7391c == 0 ? 4 : 8);
        int m15216M = c4015a0.m15216M();
        return Pair.create(Long.valueOf(m15212I), "" + ((char) (((m15216M >> 10) & 31) + 96)) + ((char) (((m15216M >> 5) & 31) + 96)) + ((char) ((m15216M & 31) + 96)));
    }

    /* renamed from: n */
    public static C3348a m7413n(AbstractC1820a.a aVar) {
        AbstractC1820a.b m7395g = aVar.m7395g(1751411826);
        AbstractC1820a.b m7395g2 = aVar.m7395g(1801812339);
        AbstractC1820a.b m7395g3 = aVar.m7395g(1768715124);
        if (m7395g == null || m7395g2 == null || m7395g3 == null || m7410k(m7395g.f6789b) != 1835299937) {
            return null;
        }
        C4015a0 c4015a0 = m7395g2.f6789b;
        c4015a0.m15223T(12);
        int m15241p = c4015a0.m15241p();
        String[] strArr = new String[m15241p];
        for (int i10 = 0; i10 < m15241p; i10++) {
            int m15241p2 = c4015a0.m15241p();
            c4015a0.m15224U(4);
            strArr[i10] = c4015a0.m15207D(m15241p2 - 8);
        }
        C4015a0 c4015a02 = m7395g3.f6789b;
        c4015a02.m15223T(8);
        ArrayList arrayList = new ArrayList();
        while (c4015a02.m15226a() > 8) {
            int m15231f = c4015a02.m15231f();
            int m15241p3 = c4015a02.m15241p();
            int m15241p4 = c4015a02.m15241p() - 1;
            if (m15241p4 < 0 || m15241p4 >= m15241p) {
                C4046r.m15529i("AtomParsers", "Skipped metadata with unknown key index: " + m15241p4);
            } else {
                C4163a m7495f = C1827h.m7495f(c4015a02, m15231f + m15241p3, strArr[m15241p4]);
                if (m7495f != null) {
                    arrayList.add(m7495f);
                }
            }
            c4015a02.m15223T(m15231f + m15241p3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C3348a(arrayList);
    }

    /* renamed from: o */
    public static void m7414o(C4015a0 c4015a0, int i10, int i11, int i12, d dVar) {
        c4015a0.m15223T(i11 + 8 + 8);
        if (i10 == 1835365492) {
            c4015a0.m15204A();
            String m15204A = c4015a0.m15204A();
            if (m15204A != null) {
                dVar.f6805b = new C4463m1.b().m17461T(i12).m17474g0(m15204A).m17448G();
            }
        }
    }

    /* renamed from: p */
    public static long m7415p(C4015a0 c4015a0) {
        c4015a0.m15223T(8);
        c4015a0.m15224U(AbstractC1820a.m7391c(c4015a0.m15241p()) != 0 ? 16 : 8);
        return c4015a0.m15212I();
    }

    /* renamed from: q */
    public static float m7416q(C4015a0 c4015a0, int i10) {
        c4015a0.m15223T(i10 + 8);
        return c4015a0.m15214K() / c4015a0.m15214K();
    }

    /* renamed from: r */
    public static byte[] m7417r(C4015a0 c4015a0, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            c4015a0.m15223T(i12);
            int m15241p = c4015a0.m15241p();
            if (c4015a0.m15241p() == 1886547818) {
                return Arrays.copyOfRange(c4015a0.m15230e(), i12, m15241p + i12);
            }
            i12 += m15241p;
        }
        return null;
    }

    /* renamed from: s */
    public static Pair<Integer, C1835p> m7418s(C4015a0 c4015a0, int i10, int i11) {
        Pair<Integer, C1835p> m7406g;
        int m15231f = c4015a0.m15231f();
        while (m15231f - i10 < i11) {
            c4015a0.m15223T(m15231f);
            int m15241p = c4015a0.m15241p();
            C5574n.m22460a(m15241p > 0, "childAtomSize must be positive");
            if (c4015a0.m15241p() == 1936289382 && (m7406g = m7406g(c4015a0, m15231f, m15241p)) != null) {
                return m7406g;
            }
            m15231f += m15241p;
        }
        return null;
    }

    /* renamed from: t */
    public static C1835p m7419t(C4015a0 c4015a0, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            c4015a0.m15223T(i14);
            int m15241p = c4015a0.m15241p();
            if (c4015a0.m15241p() == 1952804451) {
                int m7391c = AbstractC1820a.m7391c(c4015a0.m15241p());
                c4015a0.m15224U(1);
                if (m7391c == 0) {
                    c4015a0.m15224U(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int m15210G = c4015a0.m15210G();
                    i12 = m15210G & 15;
                    i13 = (m15210G & 240) >> 4;
                }
                boolean z10 = c4015a0.m15210G() == 1;
                int m15210G2 = c4015a0.m15210G();
                byte[] bArr2 = new byte[16];
                c4015a0.m15237l(bArr2, 0, 16);
                if (z10 && m15210G2 == 0) {
                    int m15210G3 = c4015a0.m15210G();
                    bArr = new byte[m15210G3];
                    c4015a0.m15237l(bArr, 0, m15210G3);
                }
                return new C1835p(z10, str, m15210G2, bArr2, i13, i12, bArr);
            }
            i14 += m15241p;
        }
    }

    /* renamed from: u */
    public static C3348a m7420u(C4015a0 c4015a0, int i10) {
        c4015a0.m15224U(12);
        while (c4015a0.m15231f() < i10) {
            int m15231f = c4015a0.m15231f();
            int m15241p = c4015a0.m15241p();
            if (c4015a0.m15241p() == 1935766900) {
                if (m15241p < 14) {
                    return null;
                }
                c4015a0.m15224U(5);
                int m15210G = c4015a0.m15210G();
                if (m15210G != 12 && m15210G != 13) {
                    return null;
                }
                float f10 = m15210G == 12 ? 240.0f : 120.0f;
                c4015a0.m15224U(1);
                return new C3348a(new C4167e(f10, c4015a0.m15210G()));
            }
            c4015a0.m15223T(m15231f + m15241p);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0433 A[EDGE_INSN: B:97:0x0433->B:98:0x0433 BREAK  A[LOOP:2: B:76:0x03c9->B:92:0x042c], SYNTHETIC] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p077f4.C1837r m7421v(p077f4.C1834o r38, p077f4.AbstractC1820a.a r39, p333x3.C5582v r40) {
        /*
            Method dump skipped, instructions count: 1321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p077f4.C1821b.m7421v(f4.o, f4.a$a, x3.v):f4.r");
    }

    /* renamed from: w */
    public static d m7422w(C4015a0 c4015a0, int i10, int i11, String str, C5247m c5247m, boolean z10) {
        int i12;
        c4015a0.m15223T(12);
        int m15241p = c4015a0.m15241p();
        d dVar = new d(m15241p);
        for (int i13 = 0; i13 < m15241p; i13++) {
            int m15231f = c4015a0.m15231f();
            int m15241p2 = c4015a0.m15241p();
            C5574n.m22460a(m15241p2 > 0, "childAtomSize must be positive");
            int m15241p3 = c4015a0.m15241p();
            if (m15241p3 == 1635148593 || m15241p3 == 1635148595 || m15241p3 == 1701733238 || m15241p3 == 1831958048 || m15241p3 == 1836070006 || m15241p3 == 1752589105 || m15241p3 == 1751479857 || m15241p3 == 1932670515 || m15241p3 == 1211250227 || m15241p3 == 1987063864 || m15241p3 == 1987063865 || m15241p3 == 1635135537 || m15241p3 == 1685479798 || m15241p3 == 1685479729 || m15241p3 == 1685481573 || m15241p3 == 1685481521) {
                i12 = m15231f;
                m7399D(c4015a0, m15241p3, i12, m15241p2, i10, i11, c5247m, dVar, i13);
            } else if (m15241p3 == 1836069985 || m15241p3 == 1701733217 || m15241p3 == 1633889587 || m15241p3 == 1700998451 || m15241p3 == 1633889588 || m15241p3 == 1835823201 || m15241p3 == 1685353315 || m15241p3 == 1685353317 || m15241p3 == 1685353320 || m15241p3 == 1685353324 || m15241p3 == 1685353336 || m15241p3 == 1935764850 || m15241p3 == 1935767394 || m15241p3 == 1819304813 || m15241p3 == 1936684916 || m15241p3 == 1953984371 || m15241p3 == 778924082 || m15241p3 == 778924083 || m15241p3 == 1835557169 || m15241p3 == 1835560241 || m15241p3 == 1634492771 || m15241p3 == 1634492791 || m15241p3 == 1970037111 || m15241p3 == 1332770163 || m15241p3 == 1716281667) {
                i12 = m15231f;
                m7405f(c4015a0, m15241p3, m15231f, m15241p2, i10, str, z10, c5247m, dVar, i13);
            } else {
                if (m15241p3 == 1414810956 || m15241p3 == 1954034535 || m15241p3 == 2004251764 || m15241p3 == 1937010800 || m15241p3 == 1664495672) {
                    m7423x(c4015a0, m15241p3, m15231f, m15241p2, i10, str, dVar);
                } else if (m15241p3 == 1835365492) {
                    m7414o(c4015a0, m15241p3, m15231f, i10, dVar);
                } else if (m15241p3 == 1667329389) {
                    dVar.f6805b = new C4463m1.b().m17461T(i10).m17474g0("application/x-camera-motion").m17448G();
                }
                i12 = m15231f;
            }
            c4015a0.m15223T(i12 + m15241p2);
        }
        return dVar;
    }

    /* renamed from: x */
    public static void m7423x(C4015a0 c4015a0, int i10, int i11, int i12, int i13, String str, d dVar) {
        c4015a0.m15223T(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        AbstractC2651u abstractC2651u = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                c4015a0.m15237l(bArr, 0, i14);
                abstractC2651u = AbstractC2651u.m10771v(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                dVar.f6807d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        dVar.f6805b = new C4463m1.b().m17461T(i13).m17474g0(str2).m17465X(str).m17478k0(j10).m17463V(abstractC2651u).m17448G();
    }

    /* renamed from: y */
    public static g m7424y(C4015a0 c4015a0) {
        boolean z10;
        c4015a0.m15223T(8);
        int m7391c = AbstractC1820a.m7391c(c4015a0.m15241p());
        c4015a0.m15224U(m7391c == 0 ? 8 : 16);
        int m15241p = c4015a0.m15241p();
        c4015a0.m15224U(4);
        int m15231f = c4015a0.m15231f();
        int i10 = m7391c == 0 ? 4 : 8;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                z10 = true;
                break;
            }
            if (c4015a0.m15230e()[m15231f + i12] != -1) {
                z10 = false;
                break;
            }
            i12++;
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            c4015a0.m15224U(i10);
        } else {
            long m15212I = m7391c == 0 ? c4015a0.m15212I() : c4015a0.m15215L();
            if (m15212I != 0) {
                j10 = m15212I;
            }
        }
        c4015a0.m15224U(16);
        int m15241p2 = c4015a0.m15241p();
        int m15241p3 = c4015a0.m15241p();
        c4015a0.m15224U(4);
        int m15241p4 = c4015a0.m15241p();
        int m15241p5 = c4015a0.m15241p();
        if (m15241p2 == 0 && m15241p3 == 65536 && m15241p4 == -65536 && m15241p5 == 0) {
            i11 = 90;
        } else if (m15241p2 == 0 && m15241p3 == -65536 && m15241p4 == 65536 && m15241p5 == 0) {
            i11 = 270;
        } else if (m15241p2 == -65536 && m15241p3 == 0 && m15241p4 == 0 && m15241p5 == -65536) {
            i11 = 180;
        }
        return new g(m15241p, j10, i11);
    }

    /* renamed from: z */
    public static C1834o m7425z(AbstractC1820a.a aVar, AbstractC1820a.b bVar, long j10, C5247m c5247m, boolean z10, boolean z11) {
        AbstractC1820a.b bVar2;
        long j11;
        long[] jArr;
        long[] jArr2;
        AbstractC1820a.a m7394f;
        Pair<long[], long[]> m7407h;
        AbstractC1820a.a aVar2 = (AbstractC1820a.a) C4014a.m15199e(aVar.m7394f(1835297121));
        int m7403d = m7403d(m7410k(((AbstractC1820a.b) C4014a.m15199e(aVar2.m7395g(1751411826))).f6789b));
        if (m7403d == -1) {
            return null;
        }
        g m7424y = m7424y(((AbstractC1820a.b) C4014a.m15199e(aVar.m7395g(1953196132))).f6789b);
        if (j10 == -9223372036854775807L) {
            bVar2 = bVar;
            j11 = m7424y.f6817b;
        } else {
            bVar2 = bVar;
            j11 = j10;
        }
        long m7415p = m7415p(bVar2.f6789b);
        long m15420N0 = j11 != -9223372036854775807L ? C4041n0.m15420N0(j11, 1000000L, m7415p) : -9223372036854775807L;
        AbstractC1820a.a aVar3 = (AbstractC1820a.a) C4014a.m15199e(((AbstractC1820a.a) C4014a.m15199e(aVar2.m7394f(1835626086))).m7394f(1937007212));
        Pair<Long, String> m7412m = m7412m(((AbstractC1820a.b) C4014a.m15199e(aVar2.m7395g(1835296868))).f6789b);
        AbstractC1820a.b m7395g = aVar3.m7395g(1937011556);
        if (m7395g == null) {
            throw C4499t2.m17594a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        d m7422w = m7422w(m7395g.f6789b, m7424y.f6816a, m7424y.f6818c, (String) m7412m.second, c5247m, z11);
        if (z10 || (m7394f = aVar.m7394f(1701082227)) == null || (m7407h = m7407h(m7394f)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) m7407h.first;
            jArr2 = (long[]) m7407h.second;
            jArr = jArr3;
        }
        if (m7422w.f6805b == null) {
            return null;
        }
        return new C1834o(m7424y.f6816a, m7403d, ((Long) m7412m.first).longValue(), m7415p, m15420N0, m7422w.f6805b, m7422w.f6807d, m7422w.f6804a, m7422w.f6806c, jArr, jArr2);
    }
}
