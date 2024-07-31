package p077f4;

import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p077f4.AbstractC1820a;
import p079f6.C1841a;
import p109h7.InterfaceC2424g;
import p180m4.C3523a;
import p180m4.C3525c;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4033j0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4051w;
import p264s3.C4463m1;
import p264s3.C4499t2;
import p289u3.C4809c;
import p317w3.C5247m;
import p333x3.C5558b;
import p333x3.C5560c;
import p333x3.C5582v;
import p333x3.C5585y;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5576p;
import p333x3.InterfaceC5586z;

/* renamed from: f4.g */
/* loaded from: classes.dex */
public class C1826g implements InterfaceC5571k {

    /* renamed from: I */
    public static final InterfaceC5576p f6831I = C1825f.f6830b;

    /* renamed from: J */
    public static final byte[] f6832J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: K */
    public static final C4463m1 f6833K = new C4463m1.b().m17474g0("application/x-emsg").m17448G();

    /* renamed from: A */
    public int f6834A;

    /* renamed from: B */
    public int f6835B;

    /* renamed from: C */
    public int f6836C;

    /* renamed from: D */
    public boolean f6837D;

    /* renamed from: E */
    public InterfaceC5573m f6838E;

    /* renamed from: F */
    public InterfaceC5559b0[] f6839F;

    /* renamed from: G */
    public InterfaceC5559b0[] f6840G;

    /* renamed from: H */
    public boolean f6841H;

    /* renamed from: a */
    public final int f6842a;

    /* renamed from: b */
    public final C1834o f6843b;

    /* renamed from: c */
    public final List<C4463m1> f6844c;

    /* renamed from: d */
    public final SparseArray<b> f6845d;

    /* renamed from: e */
    public final C4015a0 f6846e;

    /* renamed from: f */
    public final C4015a0 f6847f;

    /* renamed from: g */
    public final C4015a0 f6848g;

    /* renamed from: h */
    public final byte[] f6849h;

    /* renamed from: i */
    public final C4015a0 f6850i;

    /* renamed from: j */
    public final C4033j0 f6851j;

    /* renamed from: k */
    public final C3525c f6852k;

    /* renamed from: l */
    public final C4015a0 f6853l;

    /* renamed from: m */
    public final ArrayDeque<AbstractC1820a.a> f6854m;

    /* renamed from: n */
    public final ArrayDeque<a> f6855n;

    /* renamed from: o */
    public final InterfaceC5559b0 f6856o;

    /* renamed from: p */
    public int f6857p;

    /* renamed from: q */
    public int f6858q;

    /* renamed from: r */
    public long f6859r;

    /* renamed from: s */
    public int f6860s;

    /* renamed from: t */
    public C4015a0 f6861t;

    /* renamed from: u */
    public long f6862u;

    /* renamed from: v */
    public int f6863v;

    /* renamed from: w */
    public long f6864w;

    /* renamed from: x */
    public long f6865x;

    /* renamed from: y */
    public long f6866y;

    /* renamed from: z */
    public b f6867z;

    /* renamed from: f4.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long f6868a;

        /* renamed from: b */
        public final boolean f6869b;

        /* renamed from: c */
        public final int f6870c;

        public a(long j10, boolean z10, int i10) {
            this.f6868a = j10;
            this.f6869b = z10;
            this.f6870c = i10;
        }
    }

    /* renamed from: f4.g$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC5559b0 f6871a;

        /* renamed from: d */
        public C1837r f6874d;

        /* renamed from: e */
        public C1822c f6875e;

        /* renamed from: f */
        public int f6876f;

        /* renamed from: g */
        public int f6877g;

        /* renamed from: h */
        public int f6878h;

        /* renamed from: i */
        public int f6879i;

        /* renamed from: l */
        public boolean f6882l;

        /* renamed from: b */
        public final C1836q f6872b = new C1836q();

        /* renamed from: c */
        public final C4015a0 f6873c = new C4015a0();

        /* renamed from: j */
        public final C4015a0 f6880j = new C4015a0(1);

        /* renamed from: k */
        public final C4015a0 f6881k = new C4015a0();

        public b(InterfaceC5559b0 interfaceC5559b0, C1837r c1837r, C1822c c1822c) {
            this.f6871a = interfaceC5559b0;
            this.f6874d = c1837r;
            this.f6875e = c1822c;
            m7485j(c1837r, c1822c);
        }

        /* renamed from: c */
        public int m7478c() {
            int i10 = !this.f6882l ? this.f6874d.f6968g[this.f6876f] : this.f6872b.f6954k[this.f6876f] ? 1 : 0;
            return m7482g() != null ? i10 | 1073741824 : i10;
        }

        /* renamed from: d */
        public long m7479d() {
            return !this.f6882l ? this.f6874d.f6964c[this.f6876f] : this.f6872b.f6950g[this.f6878h];
        }

        /* renamed from: e */
        public long m7480e() {
            return !this.f6882l ? this.f6874d.f6967f[this.f6876f] : this.f6872b.m7551c(this.f6876f);
        }

        /* renamed from: f */
        public int m7481f() {
            return !this.f6882l ? this.f6874d.f6965d[this.f6876f] : this.f6872b.f6952i[this.f6876f];
        }

        /* renamed from: g */
        public C1835p m7482g() {
            if (!this.f6882l) {
                return null;
            }
            int i10 = ((C1822c) C4041n0.m15463j(this.f6872b.f6944a)).f6819a;
            C1835p c1835p = this.f6872b.f6957n;
            if (c1835p == null) {
                c1835p = this.f6874d.f6962a.m7547a(i10);
            }
            if (c1835p == null || !c1835p.f6939a) {
                return null;
            }
            return c1835p;
        }

        /* renamed from: h */
        public boolean m7483h() {
            this.f6876f++;
            if (!this.f6882l) {
                return false;
            }
            int i10 = this.f6877g + 1;
            this.f6877g = i10;
            int[] iArr = this.f6872b.f6951h;
            int i11 = this.f6878h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f6878h = i11 + 1;
            this.f6877g = 0;
            return false;
        }

        /* renamed from: i */
        public int m7484i(int i10, int i11) {
            C4015a0 c4015a0;
            C1835p m7482g = m7482g();
            if (m7482g == null) {
                return 0;
            }
            int i12 = m7482g.f6942d;
            if (i12 != 0) {
                c4015a0 = this.f6872b.f6958o;
            } else {
                byte[] bArr = (byte[]) C4041n0.m15463j(m7482g.f6943e);
                this.f6881k.m15221R(bArr, bArr.length);
                C4015a0 c4015a02 = this.f6881k;
                i12 = bArr.length;
                c4015a0 = c4015a02;
            }
            boolean m7555g = this.f6872b.m7555g(this.f6876f);
            boolean z10 = m7555g || i11 != 0;
            this.f6880j.m15230e()[0] = (byte) ((z10 ? 128 : 0) | i12);
            this.f6880j.m15223T(0);
            this.f6871a.mo4853d(this.f6880j, 1, 1);
            this.f6871a.mo4853d(c4015a0, i12, 1);
            if (!z10) {
                return i12 + 1;
            }
            if (!m7555g) {
                this.f6873c.m15219P(8);
                byte[] m15230e = this.f6873c.m15230e();
                m15230e[0] = 0;
                m15230e[1] = 1;
                m15230e[2] = (byte) ((i11 >> 8) & 255);
                m15230e[3] = (byte) (i11 & 255);
                m15230e[4] = (byte) ((i10 >> 24) & 255);
                m15230e[5] = (byte) ((i10 >> 16) & 255);
                m15230e[6] = (byte) ((i10 >> 8) & 255);
                m15230e[7] = (byte) (i10 & 255);
                this.f6871a.mo4853d(this.f6873c, 8, 1);
                return i12 + 1 + 8;
            }
            C4015a0 c4015a03 = this.f6872b.f6958o;
            int m15216M = c4015a03.m15216M();
            c4015a03.m15224U(-2);
            int i13 = (m15216M * 6) + 2;
            if (i11 != 0) {
                this.f6873c.m15219P(i13);
                byte[] m15230e2 = this.f6873c.m15230e();
                c4015a03.m15237l(m15230e2, 0, i13);
                int i14 = (((m15230e2[2] & 255) << 8) | (m15230e2[3] & 255)) + i11;
                m15230e2[2] = (byte) ((i14 >> 8) & 255);
                m15230e2[3] = (byte) (i14 & 255);
                c4015a03 = this.f6873c;
            }
            this.f6871a.mo4853d(c4015a03, i13, 1);
            return i12 + 1 + i13;
        }

        /* renamed from: j */
        public void m7485j(C1837r c1837r, C1822c c1822c) {
            this.f6874d = c1837r;
            this.f6875e = c1822c;
            this.f6871a.mo4852b(c1837r.f6962a.f6933f);
            m7486k();
        }

        /* renamed from: k */
        public void m7486k() {
            this.f6872b.m7554f();
            this.f6876f = 0;
            this.f6878h = 0;
            this.f6877g = 0;
            this.f6879i = 0;
            this.f6882l = false;
        }

        /* renamed from: l */
        public void m7487l(long j10) {
            int i10 = this.f6876f;
            while (true) {
                C1836q c1836q = this.f6872b;
                if (i10 >= c1836q.f6949f || c1836q.m7551c(i10) > j10) {
                    return;
                }
                if (this.f6872b.f6954k[i10]) {
                    this.f6879i = i10;
                }
                i10++;
            }
        }

        /* renamed from: m */
        public void m7488m() {
            C1835p m7482g = m7482g();
            if (m7482g == null) {
                return;
            }
            C4015a0 c4015a0 = this.f6872b.f6958o;
            int i10 = m7482g.f6942d;
            if (i10 != 0) {
                c4015a0.m15224U(i10);
            }
            if (this.f6872b.m7555g(this.f6876f)) {
                c4015a0.m15224U(c4015a0.m15216M() * 6);
            }
        }

        /* renamed from: n */
        public void m7489n(C5247m c5247m) {
            C1835p m7547a = this.f6874d.f6962a.m7547a(((C1822c) C4041n0.m15463j(this.f6872b.f6944a)).f6819a);
            this.f6871a.mo4852b(this.f6874d.f6962a.f6933f.m17411b().m17456O(c5247m.m21258d(m7547a != null ? m7547a.f6940b : null)).m17448G());
        }
    }

    public C1826g() {
        this(0);
    }

    public C1826g(int i10) {
        this(i10, null);
    }

    public C1826g(int i10, C4033j0 c4033j0) {
        this(i10, c4033j0, null, Collections.emptyList());
    }

    public C1826g(int i10, C4033j0 c4033j0, C1834o c1834o) {
        this(i10, c4033j0, c1834o, Collections.emptyList());
    }

    public C1826g(int i10, C4033j0 c4033j0, C1834o c1834o, List<C4463m1> list) {
        this(i10, c4033j0, c1834o, list, null);
    }

    public C1826g(int i10, C4033j0 c4033j0, C1834o c1834o, List<C4463m1> list, InterfaceC5559b0 interfaceC5559b0) {
        this.f6842a = i10;
        this.f6851j = c4033j0;
        this.f6843b = c1834o;
        this.f6844c = Collections.unmodifiableList(list);
        this.f6856o = interfaceC5559b0;
        this.f6852k = new C3525c();
        this.f6853l = new C4015a0(16);
        this.f6846e = new C4015a0(C4051w.f14559a);
        this.f6847f = new C4015a0(5);
        this.f6848g = new C4015a0();
        byte[] bArr = new byte[16];
        this.f6849h = bArr;
        this.f6850i = new C4015a0(bArr);
        this.f6854m = new ArrayDeque<>();
        this.f6855n = new ArrayDeque<>();
        this.f6845d = new SparseArray<>();
        this.f6865x = -9223372036854775807L;
        this.f6864w = -9223372036854775807L;
        this.f6866y = -9223372036854775807L;
        this.f6838E = InterfaceC5573m.f20932g;
        this.f6839F = new InterfaceC5559b0[0];
        this.f6840G = new InterfaceC5559b0[0];
    }

    /* renamed from: A */
    public static void m7438A(C4015a0 c4015a0, C1836q c1836q) {
        m7460z(c4015a0, 0, c1836q);
    }

    /* renamed from: B */
    public static Pair<Long, C5560c> m7439B(C4015a0 c4015a0, long j10) {
        long m15215L;
        long m15215L2;
        c4015a0.m15223T(8);
        int m7391c = AbstractC1820a.m7391c(c4015a0.m15241p());
        c4015a0.m15224U(4);
        long m15212I = c4015a0.m15212I();
        if (m7391c == 0) {
            m15215L = c4015a0.m15212I();
            m15215L2 = c4015a0.m15212I();
        } else {
            m15215L = c4015a0.m15215L();
            m15215L2 = c4015a0.m15215L();
        }
        long j11 = m15215L;
        long j12 = j10 + m15215L2;
        long m15420N0 = C4041n0.m15420N0(j11, 1000000L, m15212I);
        c4015a0.m15224U(2);
        int m15216M = c4015a0.m15216M();
        int[] iArr = new int[m15216M];
        long[] jArr = new long[m15216M];
        long[] jArr2 = new long[m15216M];
        long[] jArr3 = new long[m15216M];
        long j13 = m15420N0;
        int i10 = 0;
        long j14 = j11;
        while (i10 < m15216M) {
            int m15241p = c4015a0.m15241p();
            if ((m15241p & Integer.MIN_VALUE) != 0) {
                throw C4499t2.m17594a("Unhandled indirect reference", null);
            }
            long m15212I2 = c4015a0.m15212I();
            iArr[i10] = m15241p & C1841a.e.API_PRIORITY_OTHER;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            long j15 = j14 + m15212I2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i11 = m15216M;
            long m15420N02 = C4041n0.m15420N0(j15, 1000000L, m15212I);
            jArr4[i10] = m15420N02 - jArr5[i10];
            c4015a0.m15224U(4);
            j12 += r1[i10];
            i10++;
            iArr = iArr;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            m15216M = i11;
            j14 = j15;
            j13 = m15420N02;
        }
        return Pair.create(Long.valueOf(m15420N0), new C5560c(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: C */
    public static long m7440C(C4015a0 c4015a0) {
        c4015a0.m15223T(8);
        return AbstractC1820a.m7391c(c4015a0.m15241p()) == 1 ? c4015a0.m15215L() : c4015a0.m15212I();
    }

    /* renamed from: D */
    public static b m7441D(C4015a0 c4015a0, SparseArray<b> sparseArray, boolean z10) {
        c4015a0.m15223T(8);
        int m7390b = AbstractC1820a.m7390b(c4015a0.m15241p());
        b valueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(c4015a0.m15241p());
        if (valueAt == null) {
            return null;
        }
        if ((m7390b & 1) != 0) {
            long m15215L = c4015a0.m15215L();
            C1836q c1836q = valueAt.f6872b;
            c1836q.f6946c = m15215L;
            c1836q.f6947d = m15215L;
        }
        C1822c c1822c = valueAt.f6875e;
        valueAt.f6872b.f6944a = new C1822c((m7390b & 2) != 0 ? c4015a0.m15241p() - 1 : c1822c.f6819a, (m7390b & 8) != 0 ? c4015a0.m15241p() : c1822c.f6820b, (m7390b & 16) != 0 ? c4015a0.m15241p() : c1822c.f6821c, (m7390b & 32) != 0 ? c4015a0.m15241p() : c1822c.f6822d);
        return valueAt;
    }

    /* renamed from: E */
    public static void m7442E(AbstractC1820a.a aVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        b m7441D = m7441D(((AbstractC1820a.b) C4014a.m15199e(aVar.m7395g(1952868452))).f6789b, sparseArray, z10);
        if (m7441D == null) {
            return;
        }
        C1836q c1836q = m7441D.f6872b;
        long j10 = c1836q.f6960q;
        boolean z11 = c1836q.f6961r;
        m7441D.m7486k();
        m7441D.f6882l = true;
        AbstractC1820a.b m7395g = aVar.m7395g(1952867444);
        if (m7395g == null || (i10 & 2) != 0) {
            c1836q.f6960q = j10;
            c1836q.f6961r = z11;
        } else {
            c1836q.f6960q = m7440C(m7395g.f6789b);
            c1836q.f6961r = true;
        }
        m7445H(aVar, m7441D, i10);
        C1835p m7547a = m7441D.f6874d.f6962a.m7547a(((C1822c) C4014a.m15199e(c1836q.f6944a)).f6819a);
        AbstractC1820a.b m7395g2 = aVar.m7395g(1935763834);
        if (m7395g2 != null) {
            m7458x((C1835p) C4014a.m15199e(m7547a), m7395g2.f6789b, c1836q);
        }
        AbstractC1820a.b m7395g3 = aVar.m7395g(1935763823);
        if (m7395g3 != null) {
            m7457w(m7395g3.f6789b, c1836q);
        }
        AbstractC1820a.b m7395g4 = aVar.m7395g(1936027235);
        if (m7395g4 != null) {
            m7438A(m7395g4.f6789b, c1836q);
        }
        m7459y(aVar, m7547a != null ? m7547a.f6940b : null, c1836q);
        int size = aVar.f6787c.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC1820a.b bVar = aVar.f6787c.get(i11);
            if (bVar.f6785a == 1970628964) {
                m7446I(bVar.f6789b, c1836q, bArr);
            }
        }
    }

    /* renamed from: F */
    public static Pair<Integer, C1822c> m7443F(C4015a0 c4015a0) {
        c4015a0.m15223T(12);
        return Pair.create(Integer.valueOf(c4015a0.m15241p()), new C1822c(c4015a0.m15241p() - 1, c4015a0.m15241p(), c4015a0.m15241p(), c4015a0.m15241p()));
    }

    /* renamed from: G */
    public static int m7444G(b bVar, int i10, int i11, C4015a0 c4015a0, int i12) {
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        b bVar2 = bVar;
        c4015a0.m15223T(8);
        int m7390b = AbstractC1820a.m7390b(c4015a0.m15241p());
        C1834o c1834o = bVar2.f6874d.f6962a;
        C1836q c1836q = bVar2.f6872b;
        C1822c c1822c = (C1822c) C4041n0.m15463j(c1836q.f6944a);
        c1836q.f6951h[i10] = c4015a0.m15214K();
        long[] jArr = c1836q.f6950g;
        jArr[i10] = c1836q.f6946c;
        if ((m7390b & 1) != 0) {
            jArr[i10] = jArr[i10] + c4015a0.m15241p();
        }
        boolean z15 = (m7390b & 4) != 0;
        int i16 = c1822c.f6822d;
        if (z15) {
            i16 = c4015a0.m15241p();
        }
        boolean z16 = (m7390b & 256) != 0;
        boolean z17 = (m7390b & 512) != 0;
        boolean z18 = (m7390b & 1024) != 0;
        boolean z19 = (m7390b & 2048) != 0;
        long j10 = m7453l(c1834o) ? ((long[]) C4041n0.m15463j(c1834o.f6936i))[0] : 0L;
        int[] iArr = c1836q.f6952i;
        long[] jArr2 = c1836q.f6953j;
        boolean[] zArr = c1836q.f6954k;
        int i17 = i16;
        boolean z20 = c1834o.f6929b == 2 && (i11 & 1) != 0;
        int i18 = i12 + c1836q.f6951h[i10];
        boolean z21 = z20;
        long j11 = c1834o.f6930c;
        long j12 = c1836q.f6960q;
        int i19 = i12;
        while (i19 < i18) {
            int m7450d = m7450d(z16 ? c4015a0.m15241p() : c1822c.f6820b);
            if (z17) {
                i13 = c4015a0.m15241p();
                z10 = z16;
            } else {
                z10 = z16;
                i13 = c1822c.f6821c;
            }
            int m7450d2 = m7450d(i13);
            if (z18) {
                z11 = z15;
                i14 = c4015a0.m15241p();
            } else if (i19 == 0 && z15) {
                z11 = z15;
                i14 = i17;
            } else {
                z11 = z15;
                i14 = c1822c.f6822d;
            }
            if (z19) {
                z12 = z19;
                z13 = z17;
                z14 = z18;
                i15 = c4015a0.m15241p();
            } else {
                z12 = z19;
                z13 = z17;
                z14 = z18;
                i15 = 0;
            }
            jArr2[i19] = C4041n0.m15420N0((i15 + j12) - j10, 1000000L, j11);
            if (!c1836q.f6961r) {
                jArr2[i19] = jArr2[i19] + bVar2.f6874d.f6969h;
            }
            iArr[i19] = m7450d2;
            zArr[i19] = ((i14 >> 16) & 1) == 0 && (!z21 || i19 == 0);
            j12 += m7450d;
            i19++;
            bVar2 = bVar;
            z16 = z10;
            z15 = z11;
            z19 = z12;
            z17 = z13;
            z18 = z14;
        }
        c1836q.f6960q = j12;
        return i18;
    }

    /* renamed from: H */
    public static void m7445H(AbstractC1820a.a aVar, b bVar, int i10) {
        List<AbstractC1820a.b> list = aVar.f6787c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC1820a.b bVar2 = list.get(i13);
            if (bVar2.f6785a == 1953658222) {
                C4015a0 c4015a0 = bVar2.f6789b;
                c4015a0.m15223T(12);
                int m15214K = c4015a0.m15214K();
                if (m15214K > 0) {
                    i12 += m15214K;
                    i11++;
                }
            }
        }
        bVar.f6878h = 0;
        bVar.f6877g = 0;
        bVar.f6876f = 0;
        bVar.f6872b.m7553e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            AbstractC1820a.b bVar3 = list.get(i16);
            if (bVar3.f6785a == 1953658222) {
                i15 = m7444G(bVar, i14, i10, bVar3.f6789b, i15);
                i14++;
            }
        }
    }

    /* renamed from: I */
    public static void m7446I(C4015a0 c4015a0, C1836q c1836q, byte[] bArr) {
        c4015a0.m15223T(8);
        c4015a0.m15237l(bArr, 0, 16);
        if (Arrays.equals(bArr, f6832J)) {
            m7460z(c4015a0, 16, c1836q);
        }
    }

    /* renamed from: O */
    public static boolean m7447O(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    /* renamed from: P */
    public static boolean m7448P(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    /* renamed from: d */
    public static int m7450d(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw C4499t2.m17594a("Unexpected negative value: " + i10, null);
    }

    /* renamed from: i */
    public static C5247m m7451i(List<AbstractC1820a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC1820a.b bVar = list.get(i10);
            if (bVar.f6785a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] m15230e = bVar.f6789b.m15230e();
                UUID m7531f = C1831l.m7531f(m15230e);
                if (m7531f == null) {
                    C4046r.m15529i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C5247m.b(m7531f, "video/mp4", m15230e));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C5247m(arrayList);
    }

    /* renamed from: j */
    public static b m7452j(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b valueAt = sparseArray.valueAt(i10);
            if ((valueAt.f6882l || valueAt.f6876f != valueAt.f6874d.f6963b) && (!valueAt.f6882l || valueAt.f6878h != valueAt.f6872b.f6948e)) {
                long m7479d = valueAt.m7479d();
                if (m7479d < j10) {
                    bVar = valueAt;
                    j10 = m7479d;
                }
            }
        }
        return bVar;
    }

    /* renamed from: l */
    public static boolean m7453l(C1834o c1834o) {
        long[] jArr;
        long[] jArr2 = c1834o.f6935h;
        if (jArr2 == null || jArr2.length != 1 || (jArr = c1834o.f6936i) == null) {
            return false;
        }
        return jArr2[0] == 0 || C4041n0.m15420N0(jArr2[0] + jArr[0], 1000000L, c1834o.f6931d) >= c1834o.f6932e;
    }

    /* renamed from: m */
    public static /* synthetic */ InterfaceC5571k[] m7454m() {
        return new InterfaceC5571k[]{new C1826g()};
    }

    /* renamed from: u */
    public static long m7455u(C4015a0 c4015a0) {
        c4015a0.m15223T(8);
        return AbstractC1820a.m7391c(c4015a0.m15241p()) == 0 ? c4015a0.m15212I() : c4015a0.m15215L();
    }

    /* renamed from: v */
    public static void m7456v(AbstractC1820a.a aVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        int size = aVar.f6788d.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC1820a.a aVar2 = aVar.f6788d.get(i11);
            if (aVar2.f6785a == 1953653094) {
                m7442E(aVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    /* renamed from: w */
    public static void m7457w(C4015a0 c4015a0, C1836q c1836q) {
        c4015a0.m15223T(8);
        int m15241p = c4015a0.m15241p();
        if ((AbstractC1820a.m7390b(m15241p) & 1) == 1) {
            c4015a0.m15224U(8);
        }
        int m15214K = c4015a0.m15214K();
        if (m15214K == 1) {
            c1836q.f6947d += AbstractC1820a.m7391c(m15241p) == 0 ? c4015a0.m15212I() : c4015a0.m15215L();
        } else {
            throw C4499t2.m17594a("Unexpected saio entry count: " + m15214K, null);
        }
    }

    /* renamed from: x */
    public static void m7458x(C1835p c1835p, C4015a0 c4015a0, C1836q c1836q) {
        int i10;
        int i11 = c1835p.f6942d;
        c4015a0.m15223T(8);
        if ((AbstractC1820a.m7390b(c4015a0.m15241p()) & 1) == 1) {
            c4015a0.m15224U(8);
        }
        int m15210G = c4015a0.m15210G();
        int m15214K = c4015a0.m15214K();
        if (m15214K > c1836q.f6949f) {
            throw C4499t2.m17594a("Saiz sample count " + m15214K + " is greater than fragment sample count" + c1836q.f6949f, null);
        }
        if (m15210G == 0) {
            boolean[] zArr = c1836q.f6956m;
            i10 = 0;
            for (int i12 = 0; i12 < m15214K; i12++) {
                int m15210G2 = c4015a0.m15210G();
                i10 += m15210G2;
                zArr[i12] = m15210G2 > i11;
            }
        } else {
            i10 = (m15210G * m15214K) + 0;
            Arrays.fill(c1836q.f6956m, 0, m15214K, m15210G > i11);
        }
        Arrays.fill(c1836q.f6956m, m15214K, c1836q.f6949f, false);
        if (i10 > 0) {
            c1836q.m7552d(i10);
        }
    }

    /* renamed from: y */
    public static void m7459y(AbstractC1820a.a aVar, String str, C1836q c1836q) {
        byte[] bArr = null;
        C4015a0 c4015a0 = null;
        C4015a0 c4015a02 = null;
        for (int i10 = 0; i10 < aVar.f6787c.size(); i10++) {
            AbstractC1820a.b bVar = aVar.f6787c.get(i10);
            C4015a0 c4015a03 = bVar.f6789b;
            int i11 = bVar.f6785a;
            if (i11 == 1935828848) {
                c4015a03.m15223T(12);
                if (c4015a03.m15241p() == 1936025959) {
                    c4015a0 = c4015a03;
                }
            } else if (i11 == 1936158820) {
                c4015a03.m15223T(12);
                if (c4015a03.m15241p() == 1936025959) {
                    c4015a02 = c4015a03;
                }
            }
        }
        if (c4015a0 == null || c4015a02 == null) {
            return;
        }
        c4015a0.m15223T(8);
        int m7391c = AbstractC1820a.m7391c(c4015a0.m15241p());
        c4015a0.m15224U(4);
        if (m7391c == 1) {
            c4015a0.m15224U(4);
        }
        if (c4015a0.m15241p() != 1) {
            throw C4499t2.m17597d("Entry count in sbgp != 1 (unsupported).");
        }
        c4015a02.m15223T(8);
        int m7391c2 = AbstractC1820a.m7391c(c4015a02.m15241p());
        c4015a02.m15224U(4);
        if (m7391c2 == 1) {
            if (c4015a02.m15212I() == 0) {
                throw C4499t2.m17597d("Variable length description in sgpd found (unsupported)");
            }
        } else if (m7391c2 >= 2) {
            c4015a02.m15224U(4);
        }
        if (c4015a02.m15212I() != 1) {
            throw C4499t2.m17597d("Entry count in sgpd != 1 (unsupported).");
        }
        c4015a02.m15224U(1);
        int m15210G = c4015a02.m15210G();
        int i12 = (m15210G & 240) >> 4;
        int i13 = m15210G & 15;
        boolean z10 = c4015a02.m15210G() == 1;
        if (z10) {
            int m15210G2 = c4015a02.m15210G();
            byte[] bArr2 = new byte[16];
            c4015a02.m15237l(bArr2, 0, 16);
            if (m15210G2 == 0) {
                int m15210G3 = c4015a02.m15210G();
                bArr = new byte[m15210G3];
                c4015a02.m15237l(bArr, 0, m15210G3);
            }
            c1836q.f6955l = true;
            c1836q.f6957n = new C1835p(z10, str, m15210G2, bArr2, i12, i13, bArr);
        }
    }

    /* renamed from: z */
    public static void m7460z(C4015a0 c4015a0, int i10, C1836q c1836q) {
        c4015a0.m15223T(i10 + 8);
        int m7390b = AbstractC1820a.m7390b(c4015a0.m15241p());
        if ((m7390b & 1) != 0) {
            throw C4499t2.m17597d("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (m7390b & 2) != 0;
        int m15214K = c4015a0.m15214K();
        if (m15214K == 0) {
            Arrays.fill(c1836q.f6956m, 0, c1836q.f6949f, false);
            return;
        }
        if (m15214K == c1836q.f6949f) {
            Arrays.fill(c1836q.f6956m, 0, m15214K, z10);
            c1836q.m7552d(c4015a0.m15226a());
            c1836q.m7549a(c4015a0);
        } else {
            throw C4499t2.m17594a("Senc sample count " + m15214K + " is different from fragment sample count" + c1836q.f6949f, null);
        }
    }

    /* renamed from: J */
    public final void m7461J(long j10) {
        while (!this.f6854m.isEmpty() && this.f6854m.peek().f6786b == j10) {
            m7470o(this.f6854m.pop());
        }
        m7466e();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m7462K(p333x3.InterfaceC5572l r12) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p077f4.C1826g.m7462K(x3.l):boolean");
    }

    /* renamed from: L */
    public final void m7463L(InterfaceC5572l interfaceC5572l) {
        int i10 = ((int) this.f6859r) - this.f6860s;
        C4015a0 c4015a0 = this.f6861t;
        if (c4015a0 != null) {
            interfaceC5572l.readFully(c4015a0.m15230e(), 8, i10);
            m7472q(new AbstractC1820a.b(this.f6858q, c4015a0), interfaceC5572l.getPosition());
        } else {
            interfaceC5572l.mo22428m(i10);
        }
        m7461J(interfaceC5572l.getPosition());
    }

    /* renamed from: M */
    public final void m7464M(InterfaceC5572l interfaceC5572l) {
        int size = this.f6845d.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            C1836q c1836q = this.f6845d.valueAt(i10).f6872b;
            if (c1836q.f6959p) {
                long j11 = c1836q.f6947d;
                if (j11 < j10) {
                    bVar = this.f6845d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f6857p = 3;
            return;
        }
        int position = (int) (j10 - interfaceC5572l.getPosition());
        if (position < 0) {
            throw C4499t2.m17594a("Offset to encryption data was negative.", null);
        }
        interfaceC5572l.mo22428m(position);
        bVar.f6872b.m7550b(interfaceC5572l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    public final boolean m7465N(InterfaceC5572l interfaceC5572l) {
        int m22407c;
        int m7484i;
        b bVar = this.f6867z;
        Throwable th = null;
        if (bVar == null) {
            bVar = m7452j(this.f6845d);
            if (bVar == null) {
                int position = (int) (this.f6862u - interfaceC5572l.getPosition());
                if (position < 0) {
                    throw C4499t2.m17594a("Offset to end of mdat was negative.", null);
                }
                interfaceC5572l.mo22428m(position);
                m7466e();
                return false;
            }
            int m7479d = (int) (bVar.m7479d() - interfaceC5572l.getPosition());
            if (m7479d < 0) {
                C4046r.m15529i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                m7479d = 0;
            }
            interfaceC5572l.mo22428m(m7479d);
            this.f6867z = bVar;
        }
        int i10 = 4;
        int i11 = 1;
        if (this.f6857p == 3) {
            int m7481f = bVar.m7481f();
            this.f6834A = m7481f;
            if (bVar.f6876f < bVar.f6879i) {
                interfaceC5572l.mo22428m(m7481f);
                bVar.m7488m();
                if (!bVar.m7483h()) {
                    this.f6867z = null;
                }
                this.f6857p = 3;
                return true;
            }
            if (bVar.f6874d.f6962a.f6934g == 1) {
                this.f6834A = m7481f - 8;
                interfaceC5572l.mo22428m(8);
            }
            if ("audio/ac4".equals(bVar.f6874d.f6962a.f6933f.f16506s)) {
                this.f6835B = bVar.m7484i(this.f6834A, 7);
                C4809c.m18995a(this.f6834A, this.f6850i);
                bVar.f6871a.m22408e(this.f6850i, 7);
                m7484i = this.f6835B + 7;
            } else {
                m7484i = bVar.m7484i(this.f6834A, 0);
            }
            this.f6835B = m7484i;
            this.f6834A += this.f6835B;
            this.f6857p = 4;
            this.f6836C = 0;
        }
        C1834o c1834o = bVar.f6874d.f6962a;
        InterfaceC5559b0 interfaceC5559b0 = bVar.f6871a;
        long m7480e = bVar.m7480e();
        C4033j0 c4033j0 = this.f6851j;
        if (c4033j0 != null) {
            m7480e = c4033j0.m15362a(m7480e);
        }
        long j10 = m7480e;
        if (c1834o.f6937j == 0) {
            while (true) {
                int i12 = this.f6835B;
                int i13 = this.f6834A;
                if (i12 >= i13) {
                    break;
                }
                this.f6835B += interfaceC5559b0.m22407c(interfaceC5572l, i13 - i12, false);
            }
        } else {
            byte[] m15230e = this.f6847f.m15230e();
            m15230e[0] = 0;
            m15230e[1] = 0;
            m15230e[2] = 0;
            int i14 = c1834o.f6937j;
            int i15 = i14 + 1;
            int i16 = 4 - i14;
            while (this.f6835B < this.f6834A) {
                int i17 = this.f6836C;
                if (i17 == 0) {
                    interfaceC5572l.readFully(m15230e, i16, i15);
                    this.f6847f.m15223T(0);
                    int m15241p = this.f6847f.m15241p();
                    if (m15241p < i11) {
                        throw C4499t2.m17594a("Invalid NAL length", th);
                    }
                    this.f6836C = m15241p - 1;
                    this.f6846e.m15223T(0);
                    interfaceC5559b0.m22408e(this.f6846e, i10);
                    interfaceC5559b0.m22408e(this.f6847f, i11);
                    this.f6837D = (this.f6840G.length <= 0 || !C4051w.m15571g(c1834o.f6933f.f16506s, m15230e[i10])) ? 0 : i11;
                    this.f6835B += 5;
                    this.f6834A += i16;
                } else {
                    if (this.f6837D) {
                        this.f6848g.m15219P(i17);
                        interfaceC5572l.readFully(this.f6848g.m15230e(), 0, this.f6836C);
                        interfaceC5559b0.m22408e(this.f6848g, this.f6836C);
                        m22407c = this.f6836C;
                        int m15581q = C4051w.m15581q(this.f6848g.m15230e(), this.f6848g.m15232g());
                        this.f6848g.m15223T("video/hevc".equals(c1834o.f6933f.f16506s) ? 1 : 0);
                        this.f6848g.m15222S(m15581q);
                        C5558b.m22404a(j10, this.f6848g, this.f6840G);
                    } else {
                        m22407c = interfaceC5559b0.m22407c(interfaceC5572l, i17, false);
                    }
                    this.f6835B += m22407c;
                    this.f6836C -= m22407c;
                    th = null;
                    i10 = 4;
                    i11 = 1;
                }
            }
        }
        int m7478c = bVar.m7478c();
        C1835p m7482g = bVar.m7482g();
        interfaceC5559b0.mo4851a(j10, m7478c, this.f6834A, 0, m7482g != null ? m7482g.f6941c : null);
        m7475t(j10);
        if (!bVar.m7483h()) {
            this.f6867z = null;
        }
        this.f6857p = 3;
        return true;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f6838E = interfaceC5573m;
        m7466e();
        m7468k();
        C1834o c1834o = this.f6843b;
        if (c1834o != null) {
            this.f6845d.put(0, new b(interfaceC5573m.mo3032e(0, c1834o.f6929b), new C1837r(this.f6843b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C1822c(0, 0, 0, 0)));
            this.f6838E.mo3034n();
        }
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        int size = this.f6845d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6845d.valueAt(i10).m7486k();
        }
        this.f6855n.clear();
        this.f6863v = 0;
        this.f6864w = j11;
        this.f6854m.clear();
        m7466e();
    }

    /* renamed from: e */
    public final void m7466e() {
        this.f6857p = 0;
        this.f6860s = 0;
    }

    /* renamed from: f */
    public final C1822c m7467f(SparseArray<C1822c> sparseArray, int i10) {
        return (C1822c) (sparseArray.size() == 1 ? sparseArray.valueAt(0) : C4014a.m15199e(sparseArray.get(i10)));
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        while (true) {
            int i10 = this.f6857p;
            if (i10 != 0) {
                if (i10 == 1) {
                    m7463L(interfaceC5572l);
                } else if (i10 == 2) {
                    m7464M(interfaceC5572l);
                } else if (m7465N(interfaceC5572l)) {
                    return 0;
                }
            } else if (!m7462K(interfaceC5572l)) {
                return -1;
            }
        }
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        return C1833n.m7544b(interfaceC5572l);
    }

    /* renamed from: k */
    public final void m7468k() {
        int i10;
        InterfaceC5559b0[] interfaceC5559b0Arr = new InterfaceC5559b0[2];
        this.f6839F = interfaceC5559b0Arr;
        InterfaceC5559b0 interfaceC5559b0 = this.f6856o;
        int i11 = 0;
        if (interfaceC5559b0 != null) {
            interfaceC5559b0Arr[0] = interfaceC5559b0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f6842a & 4) != 0) {
            interfaceC5559b0Arr[i10] = this.f6838E.mo3032e(100, 5);
            i10++;
            i12 = 101;
        }
        InterfaceC5559b0[] interfaceC5559b0Arr2 = (InterfaceC5559b0[]) C4041n0.m15406G0(this.f6839F, i10);
        this.f6839F = interfaceC5559b0Arr2;
        for (InterfaceC5559b0 interfaceC5559b02 : interfaceC5559b0Arr2) {
            interfaceC5559b02.mo4852b(f6833K);
        }
        this.f6840G = new InterfaceC5559b0[this.f6844c.size()];
        while (i11 < this.f6840G.length) {
            InterfaceC5559b0 mo3032e = this.f6838E.mo3032e(i12, 3);
            mo3032e.mo4852b(this.f6844c.get(i11));
            this.f6840G[i11] = mo3032e;
            i11++;
            i12++;
        }
    }

    /* renamed from: n */
    public C1834o m7469n(C1834o c1834o) {
        return c1834o;
    }

    /* renamed from: o */
    public final void m7470o(AbstractC1820a.a aVar) {
        int i10 = aVar.f6785a;
        if (i10 == 1836019574) {
            m7474s(aVar);
        } else if (i10 == 1836019558) {
            m7473r(aVar);
        } else {
            if (this.f6854m.isEmpty()) {
                return;
            }
            this.f6854m.peek().m7392d(aVar);
        }
    }

    /* renamed from: p */
    public final void m7471p(C4015a0 c4015a0) {
        long m15420N0;
        String str;
        long m15420N02;
        String str2;
        long m15212I;
        long j10;
        if (this.f6839F.length == 0) {
            return;
        }
        c4015a0.m15223T(8);
        int m7391c = AbstractC1820a.m7391c(c4015a0.m15241p());
        if (m7391c == 0) {
            String str3 = (String) C4014a.m15199e(c4015a0.m15204A());
            String str4 = (String) C4014a.m15199e(c4015a0.m15204A());
            long m15212I2 = c4015a0.m15212I();
            m15420N0 = C4041n0.m15420N0(c4015a0.m15212I(), 1000000L, m15212I2);
            long j11 = this.f6866y;
            long j12 = j11 != -9223372036854775807L ? j11 + m15420N0 : -9223372036854775807L;
            str = str3;
            m15420N02 = C4041n0.m15420N0(c4015a0.m15212I(), 1000L, m15212I2);
            str2 = str4;
            m15212I = c4015a0.m15212I();
            j10 = j12;
        } else {
            if (m7391c != 1) {
                C4046r.m15529i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + m7391c);
                return;
            }
            long m15212I3 = c4015a0.m15212I();
            j10 = C4041n0.m15420N0(c4015a0.m15215L(), 1000000L, m15212I3);
            long m15420N03 = C4041n0.m15420N0(c4015a0.m15212I(), 1000L, m15212I3);
            long m15212I4 = c4015a0.m15212I();
            str = (String) C4014a.m15199e(c4015a0.m15204A());
            m15420N02 = m15420N03;
            m15212I = m15212I4;
            str2 = (String) C4014a.m15199e(c4015a0.m15204A());
            m15420N0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[c4015a0.m15226a()];
        c4015a0.m15237l(bArr, 0, c4015a0.m15226a());
        C4015a0 c4015a02 = new C4015a0(this.f6852k.m13082a(new C3523a(str, str2, m15420N02, m15212I, bArr)));
        int m15226a = c4015a02.m15226a();
        for (InterfaceC5559b0 interfaceC5559b0 : this.f6839F) {
            c4015a02.m15223T(0);
            interfaceC5559b0.m22408e(c4015a02, m15226a);
        }
        if (j10 == -9223372036854775807L) {
            this.f6855n.addLast(new a(m15420N0, true, m15226a));
        } else {
            if (this.f6855n.isEmpty()) {
                C4033j0 c4033j0 = this.f6851j;
                if (c4033j0 != null) {
                    j10 = c4033j0.m15362a(j10);
                }
                for (InterfaceC5559b0 interfaceC5559b02 : this.f6839F) {
                    interfaceC5559b02.mo4851a(j10, 1, m15226a, 0, null);
                }
                return;
            }
            this.f6855n.addLast(new a(j10, false, m15226a));
        }
        this.f6863v += m15226a;
    }

    /* renamed from: q */
    public final void m7472q(AbstractC1820a.b bVar, long j10) {
        if (!this.f6854m.isEmpty()) {
            this.f6854m.peek().m7393e(bVar);
            return;
        }
        int i10 = bVar.f6785a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                m7471p(bVar.f6789b);
            }
        } else {
            Pair<Long, C5560c> m7439B = m7439B(bVar.f6789b, j10);
            this.f6866y = ((Long) m7439B.first).longValue();
            this.f6838E.mo3033j((InterfaceC5586z) m7439B.second);
            this.f6841H = true;
        }
    }

    /* renamed from: r */
    public final void m7473r(AbstractC1820a.a aVar) {
        m7456v(aVar, this.f6845d, this.f6843b != null, this.f6842a, this.f6849h);
        C5247m m7451i = m7451i(aVar.f6787c);
        if (m7451i != null) {
            int size = this.f6845d.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f6845d.valueAt(i10).m7489n(m7451i);
            }
        }
        if (this.f6864w != -9223372036854775807L) {
            int size2 = this.f6845d.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f6845d.valueAt(i11).m7487l(this.f6864w);
            }
            this.f6864w = -9223372036854775807L;
        }
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
    }

    /* renamed from: s */
    public final void m7474s(AbstractC1820a.a aVar) {
        int i10 = 0;
        C4014a.m15201g(this.f6843b == null, "Unexpected moov box.");
        C5247m m7451i = m7451i(aVar.f6787c);
        AbstractC1820a.a aVar2 = (AbstractC1820a.a) C4014a.m15199e(aVar.m7394f(1836475768));
        SparseArray<C1822c> sparseArray = new SparseArray<>();
        int size = aVar2.f6787c.size();
        long j10 = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC1820a.b bVar = aVar2.f6787c.get(i11);
            int i12 = bVar.f6785a;
            if (i12 == 1953654136) {
                Pair<Integer, C1822c> m7443F = m7443F(bVar.f6789b);
                sparseArray.put(((Integer) m7443F.first).intValue(), (C1822c) m7443F.second);
            } else if (i12 == 1835362404) {
                j10 = m7455u(bVar.f6789b);
            }
        }
        List<C1837r> m7396A = C1821b.m7396A(aVar, new C5582v(), j10, m7451i, (this.f6842a & 16) != 0, false, new InterfaceC2424g() { // from class: f4.e
            public /* synthetic */ C1824e() {
            }

            @Override // p109h7.InterfaceC2424g
            public final Object apply(Object obj) {
                return C1826g.this.m7469n((C1834o) obj);
            }
        });
        int size2 = m7396A.size();
        if (this.f6845d.size() != 0) {
            C4014a.m15200f(this.f6845d.size() == size2);
            while (i10 < size2) {
                C1837r c1837r = m7396A.get(i10);
                C1834o c1834o = c1837r.f6962a;
                this.f6845d.get(c1834o.f6928a).m7485j(c1837r, m7467f(sparseArray, c1834o.f6928a));
                i10++;
            }
            return;
        }
        while (i10 < size2) {
            C1837r c1837r2 = m7396A.get(i10);
            C1834o c1834o2 = c1837r2.f6962a;
            this.f6845d.put(c1834o2.f6928a, new b(this.f6838E.mo3032e(i10, c1834o2.f6929b), c1837r2, m7467f(sparseArray, c1834o2.f6928a)));
            this.f6865x = Math.max(this.f6865x, c1834o2.f6932e);
            i10++;
        }
        this.f6838E.mo3034n();
    }

    /* renamed from: t */
    public final void m7475t(long j10) {
        while (!this.f6855n.isEmpty()) {
            a removeFirst = this.f6855n.removeFirst();
            this.f6863v -= removeFirst.f6870c;
            long j11 = removeFirst.f6868a;
            if (removeFirst.f6869b) {
                j11 += j10;
            }
            C4033j0 c4033j0 = this.f6851j;
            if (c4033j0 != null) {
                j11 = c4033j0.m15362a(j11);
            }
            for (InterfaceC5559b0 interfaceC5559b0 : this.f6839F) {
                interfaceC5559b0.mo4851a(j11, 1, removeFirst.f6870c, this.f6863v, null);
            }
        }
    }
}
