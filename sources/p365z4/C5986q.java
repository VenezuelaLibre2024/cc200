package p365z4;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p126i7.AbstractC2651u;
import p126i7.C2610b0;
import p152k4.C3348a;
import p180m4.C3523a;
import p180m4.C3524b;
import p193n5.C3732a0;
import p206o5.C3893a0;
import p206o5.C3901e0;
import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3899d0;
import p206o5.InterfaceC3906h;
import p221p4.C4011l;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4050v;
import p264s3.C4463m1;
import p264s3.C4465m3;
import p264s3.C4468n1;
import p264s3.C4499t2;
import p290u4.C4867l0;
import p290u4.C4870n;
import p290u4.C4876q;
import p290u4.C4881s0;
import p290u4.C4885u0;
import p290u4.InterfaceC4845a0;
import p290u4.InterfaceC4869m0;
import p290u4.InterfaceC4871n0;
import p304v3.C5110g;
import p317w3.C5247m;
import p317w3.InterfaceC5255u;
import p317w3.InterfaceC5256v;
import p318w4.AbstractC5266f;
import p333x3.C5570j;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5586z;
import p365z4.C5975f;
import p365z4.C5986q;

/* renamed from: z4.q */
/* loaded from: classes.dex */
public final class C5986q implements C3901e0.b<AbstractC5266f>, C3901e0.f, InterfaceC4871n0, InterfaceC5573m, C4867l0.d {

    /* renamed from: f0 */
    public static final Set<Integer> f22284f0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A */
    public final Map<String, C5247m> f22285A;

    /* renamed from: B */
    public AbstractC5266f f22286B;

    /* renamed from: C */
    public d[] f22287C;

    /* renamed from: E */
    public Set<Integer> f22289E;

    /* renamed from: F */
    public SparseIntArray f22290F;

    /* renamed from: G */
    public InterfaceC5559b0 f22291G;

    /* renamed from: H */
    public int f22292H;

    /* renamed from: I */
    public int f22293I;

    /* renamed from: J */
    public boolean f22294J;

    /* renamed from: K */
    public boolean f22295K;

    /* renamed from: L */
    public int f22296L;

    /* renamed from: M */
    public C4463m1 f22297M;

    /* renamed from: N */
    public C4463m1 f22298N;

    /* renamed from: O */
    public boolean f22299O;

    /* renamed from: P */
    public C4885u0 f22300P;

    /* renamed from: Q */
    public Set<C4881s0> f22301Q;

    /* renamed from: R */
    public int[] f22302R;

    /* renamed from: S */
    public int f22303S;

    /* renamed from: T */
    public boolean f22304T;

    /* renamed from: U */
    public boolean[] f22305U;

    /* renamed from: V */
    public boolean[] f22306V;

    /* renamed from: W */
    public long f22307W;

    /* renamed from: X */
    public long f22308X;

    /* renamed from: Y */
    public boolean f22309Y;

    /* renamed from: Z */
    public boolean f22310Z;

    /* renamed from: a0 */
    public boolean f22311a0;

    /* renamed from: b0 */
    public boolean f22312b0;

    /* renamed from: c0 */
    public long f22313c0;

    /* renamed from: d0 */
    public C5247m f22314d0;

    /* renamed from: e0 */
    public C5979j f22315e0;

    /* renamed from: h */
    public final String f22316h;

    /* renamed from: i */
    public final int f22317i;

    /* renamed from: j */
    public final b f22318j;

    /* renamed from: k */
    public final C5975f f22319k;

    /* renamed from: l */
    public final InterfaceC3894b f22320l;

    /* renamed from: m */
    public final C4463m1 f22321m;

    /* renamed from: n */
    public final InterfaceC5256v f22322n;

    /* renamed from: o */
    public final InterfaceC5255u.a f22323o;

    /* renamed from: p */
    public final InterfaceC3899d0 f22324p;

    /* renamed from: r */
    public final InterfaceC4845a0.a f22326r;

    /* renamed from: s */
    public final int f22327s;

    /* renamed from: u */
    public final ArrayList<C5979j> f22329u;

    /* renamed from: v */
    public final List<C5979j> f22330v;

    /* renamed from: w */
    public final Runnable f22331w;

    /* renamed from: x */
    public final Runnable f22332x;

    /* renamed from: y */
    public final Handler f22333y;

    /* renamed from: z */
    public final ArrayList<C5982m> f22334z;

    /* renamed from: q */
    public final C3901e0 f22325q = new C3901e0("Loader:HlsSampleStreamWrapper");

    /* renamed from: t */
    public final C5975f.b f22328t = new C5975f.b();

    /* renamed from: D */
    public int[] f22288D = new int[0];

    /* renamed from: z4.q$b */
    /* loaded from: classes.dex */
    public interface b extends InterfaceC4871n0.a<C5986q> {
        /* renamed from: a */
        void mo23994a();

        /* renamed from: j */
        void mo23996j(Uri uri);
    }

    /* renamed from: z4.q$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC5559b0 {

        /* renamed from: g */
        public static final C4463m1 f22335g = new C4463m1.b().m17474g0("application/id3").m17448G();

        /* renamed from: h */
        public static final C4463m1 f22336h = new C4463m1.b().m17474g0("application/x-emsg").m17448G();

        /* renamed from: a */
        public final C3524b f22337a = new C3524b();

        /* renamed from: b */
        public final InterfaceC5559b0 f22338b;

        /* renamed from: c */
        public final C4463m1 f22339c;

        /* renamed from: d */
        public C4463m1 f22340d;

        /* renamed from: e */
        public byte[] f22341e;

        /* renamed from: f */
        public int f22342f;

        public c(InterfaceC5559b0 interfaceC5559b0, int i10) {
            C4463m1 c4463m1;
            this.f22338b = interfaceC5559b0;
            if (i10 == 1) {
                c4463m1 = f22335g;
            } else {
                if (i10 != 3) {
                    throw new IllegalArgumentException("Unknown metadataType: " + i10);
                }
                c4463m1 = f22336h;
            }
            this.f22339c = c4463m1;
            this.f22341e = new byte[0];
            this.f22342f = 0;
        }

        @Override // p333x3.InterfaceC5559b0
        /* renamed from: a */
        public void mo4851a(long j10, int i10, int i11, int i12, InterfaceC5559b0.a aVar) {
            C4014a.m15199e(this.f22340d);
            C4015a0 m24054i = m24054i(i11, i12);
            if (!C4041n0.m15449c(this.f22340d.f16506s, this.f22339c.f16506s)) {
                if (!"application/x-emsg".equals(this.f22340d.f16506s)) {
                    C4046r.m15529i("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f22340d.f16506s);
                    return;
                }
                C3523a m13080c = this.f22337a.m13080c(m24054i);
                if (!m24052g(m13080c)) {
                    C4046r.m15529i("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f22339c.f16506s, m13080c.mo12418n()));
                    return;
                }
                m24054i = new C4015a0((byte[]) C4014a.m15199e(m13080c.mo12417G()));
            }
            int m15226a = m24054i.m15226a();
            this.f22338b.m22408e(m24054i, m15226a);
            this.f22338b.mo4851a(j10, i10, m15226a, i12, aVar);
        }

        @Override // p333x3.InterfaceC5559b0
        /* renamed from: b */
        public void mo4852b(C4463m1 c4463m1) {
            this.f22340d = c4463m1;
            this.f22338b.mo4852b(this.f22339c);
        }

        @Override // p333x3.InterfaceC5559b0
        /* renamed from: d */
        public void mo4853d(C4015a0 c4015a0, int i10, int i11) {
            m24053h(this.f22342f + i10);
            c4015a0.m15237l(this.f22341e, this.f22342f, i10);
            this.f22342f += i10;
        }

        @Override // p333x3.InterfaceC5559b0
        /* renamed from: f */
        public int mo4854f(InterfaceC3906h interfaceC3906h, int i10, boolean z10, int i11) {
            m24053h(this.f22342f + i10);
            int mo14769c = interfaceC3906h.mo14769c(this.f22341e, this.f22342f, i10);
            if (mo14769c != -1) {
                this.f22342f += mo14769c;
                return mo14769c;
            }
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }

        /* renamed from: g */
        public final boolean m24052g(C3523a c3523a) {
            C4463m1 mo12418n = c3523a.mo12418n();
            return mo12418n != null && C4041n0.m15449c(this.f22339c.f16506s, mo12418n.f16506s);
        }

        /* renamed from: h */
        public final void m24053h(int i10) {
            byte[] bArr = this.f22341e;
            if (bArr.length < i10) {
                this.f22341e = Arrays.copyOf(bArr, i10 + (i10 / 2));
            }
        }

        /* renamed from: i */
        public final C4015a0 m24054i(int i10, int i11) {
            int i12 = this.f22342f - i11;
            C4015a0 c4015a0 = new C4015a0(Arrays.copyOfRange(this.f22341e, i12 - i10, i12));
            byte[] bArr = this.f22341e;
            System.arraycopy(bArr, i12, bArr, 0, i11);
            this.f22342f = i11;
            return c4015a0;
        }
    }

    /* renamed from: z4.q$d */
    /* loaded from: classes.dex */
    public static final class d extends C4867l0 {

        /* renamed from: H */
        public final Map<String, C5247m> f22343H;

        /* renamed from: I */
        public C5247m f22344I;

        public d(InterfaceC3894b interfaceC3894b, InterfaceC5256v interfaceC5256v, InterfaceC5255u.a aVar, Map<String, C5247m> map) {
            super(interfaceC3894b, interfaceC5256v, aVar);
            this.f22343H = map;
        }

        @Override // p290u4.C4867l0, p333x3.InterfaceC5559b0
        /* renamed from: a */
        public void mo4851a(long j10, int i10, int i11, int i12, InterfaceC5559b0.a aVar) {
            super.mo4851a(j10, i10, i11, i12, aVar);
        }

        /* renamed from: h0 */
        public final C3348a m24055h0(C3348a c3348a) {
            if (c3348a == null) {
                return null;
            }
            int m12414f = c3348a.m12414f();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= m12414f) {
                    i11 = -1;
                    break;
                }
                C3348a.b m12413e = c3348a.m12413e(i11);
                if ((m12413e instanceof C4011l) && "com.apple.streaming.transportStreamTimestamp".equals(((C4011l) m12413e).f14437i)) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return c3348a;
            }
            if (m12414f == 1) {
                return null;
            }
            C3348a.b[] bVarArr = new C3348a.b[m12414f - 1];
            while (i10 < m12414f) {
                if (i10 != i11) {
                    bVarArr[i10 < i11 ? i10 : i10 - 1] = c3348a.m12413e(i10);
                }
                i10++;
            }
            return new C3348a(bVarArr);
        }

        /* renamed from: i0 */
        public void m24056i0(C5247m c5247m) {
            this.f22344I = c5247m;
            m19356I();
        }

        /* renamed from: j0 */
        public void m24057j0(C5979j c5979j) {
            m19378f0(c5979j.f22236k);
        }

        @Override // p290u4.C4867l0
        /* renamed from: w */
        public C4463m1 mo19393w(C4463m1 c4463m1) {
            C5247m c5247m;
            C5247m c5247m2 = this.f22344I;
            if (c5247m2 == null) {
                c5247m2 = c4463m1.f16509v;
            }
            if (c5247m2 != null && (c5247m = this.f22343H.get(c5247m2.f19907j)) != null) {
                c5247m2 = c5247m;
            }
            C3348a m24055h0 = m24055h0(c4463m1.f16504q);
            if (c5247m2 != c4463m1.f16509v || m24055h0 != c4463m1.f16504q) {
                c4463m1 = c4463m1.m17411b().m17456O(c5247m2).m17467Z(m24055h0).m17448G();
            }
            return super.mo19393w(c4463m1);
        }
    }

    public C5986q(String str, int i10, b bVar, C5975f c5975f, Map<String, C5247m> map, InterfaceC3894b interfaceC3894b, long j10, C4463m1 c4463m1, InterfaceC5256v interfaceC5256v, InterfaceC5255u.a aVar, InterfaceC3899d0 interfaceC3899d0, InterfaceC4845a0.a aVar2, int i11) {
        this.f22316h = str;
        this.f22317i = i10;
        this.f22318j = bVar;
        this.f22319k = c5975f;
        this.f22285A = map;
        this.f22320l = interfaceC3894b;
        this.f22321m = c4463m1;
        this.f22322n = interfaceC5256v;
        this.f22323o = aVar;
        this.f22324p = interfaceC3899d0;
        this.f22326r = aVar2;
        this.f22327s = i11;
        Set<Integer> set = f22284f0;
        this.f22289E = new HashSet(set.size());
        this.f22290F = new SparseIntArray(set.size());
        this.f22287C = new d[0];
        this.f22306V = new boolean[0];
        this.f22305U = new boolean[0];
        ArrayList<C5979j> arrayList = new ArrayList<>();
        this.f22329u = arrayList;
        this.f22330v = Collections.unmodifiableList(arrayList);
        this.f22334z = new ArrayList<>();
        this.f22331w = new Runnable() { // from class: z4.p
            @Override // java.lang.Runnable
            public final void run() {
                C5986q.this.m24020S();
            }
        };
        this.f22332x = new Runnable() { // from class: z4.o
            @Override // java.lang.Runnable
            public final void run() {
                C5986q.this.m24029b0();
            }
        };
        this.f22333y = C4041n0.m15489w();
        this.f22307W = j10;
        this.f22308X = j10;
    }

    /* renamed from: B */
    public static C5570j m24000B(int i10, int i11) {
        C4046r.m15529i("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new C5570j();
    }

    /* renamed from: E */
    public static C4463m1 m24001E(C4463m1 c4463m1, C4463m1 c4463m12, boolean z10) {
        String m15547d;
        String str;
        if (c4463m1 == null) {
            return c4463m12;
        }
        int m15554k = C4050v.m15554k(c4463m12.f16506s);
        if (C4041n0.m15413K(c4463m1.f16503p, m15554k) == 1) {
            m15547d = C4041n0.m15415L(c4463m1.f16503p, m15554k);
            str = C4050v.m15550g(m15547d);
        } else {
            m15547d = C4050v.m15547d(c4463m1.f16503p, c4463m12.f16506s);
            str = c4463m12.f16506s;
        }
        C4463m1.b m17452K = c4463m12.m17411b().m17462U(c4463m1.f16495h).m17464W(c4463m1.f16496i).m17465X(c4463m1.f16497j).m17476i0(c4463m1.f16498k).m17472e0(c4463m1.f16499l).m17450I(z10 ? c4463m1.f16500m : -1).m17469b0(z10 ? c4463m1.f16501n : -1).m17452K(m15547d);
        if (m15554k == 2) {
            m17452K.m17481n0(c4463m1.f16511x).m17460S(c4463m1.f16512y).m17459R(c4463m1.f16513z);
        }
        if (str != null) {
            m17452K.m17474g0(str);
        }
        int i10 = c4463m1.f16485F;
        if (i10 != -1 && m15554k == 1) {
            m17452K.m17451J(i10);
        }
        C3348a c3348a = c4463m1.f16504q;
        if (c3348a != null) {
            C3348a c3348a2 = c4463m12.f16504q;
            if (c3348a2 != null) {
                c3348a = c3348a2.m12411b(c3348a);
            }
            m17452K.m17467Z(c3348a);
        }
        return m17452K.m17448G();
    }

    /* renamed from: I */
    public static boolean m24002I(C4463m1 c4463m1, C4463m1 c4463m12) {
        String str = c4463m1.f16506s;
        String str2 = c4463m12.f16506s;
        int m15554k = C4050v.m15554k(str);
        if (m15554k != 3) {
            return m15554k == C4050v.m15554k(str2);
        }
        if (C4041n0.m15449c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || c4463m1.f16490K == c4463m12.f16490K;
        }
        return false;
    }

    /* renamed from: L */
    public static int m24003L(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: N */
    public static boolean m24004N(AbstractC5266f abstractC5266f) {
        return abstractC5266f instanceof C5979j;
    }

    /* renamed from: A */
    public void m24007A() {
        if (this.f22295K) {
            return;
        }
        mo4786c(this.f22307W);
    }

    /* renamed from: C */
    public final C4867l0 m24008C(int i10, int i11) {
        int length = this.f22287C.length;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        d dVar = new d(this.f22320l, this.f22322n, this.f22323o, this.f22285A);
        dVar.m19374b0(this.f22307W);
        if (z10) {
            dVar.m24056i0(this.f22314d0);
        }
        dVar.m19373a0(this.f22313c0);
        C5979j c5979j = this.f22315e0;
        if (c5979j != null) {
            dVar.m24057j0(c5979j);
        }
        dVar.m19376d0(this);
        int i12 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f22288D, i12);
        this.f22288D = copyOf;
        copyOf[length] = i10;
        this.f22287C = (d[]) C4041n0.m15402E0(this.f22287C, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.f22306V, i12);
        this.f22306V = copyOf2;
        copyOf2[length] = z10;
        this.f22304T = copyOf2[length] | this.f22304T;
        this.f22289E.add(Integer.valueOf(i11));
        this.f22290F.append(i11, length);
        if (m24003L(i11) > m24003L(this.f22292H)) {
            this.f22293I = length;
            this.f22292H = i11;
        }
        this.f22305U = Arrays.copyOf(this.f22305U, i12);
        return dVar;
    }

    /* renamed from: D */
    public final C4885u0 m24009D(C4881s0[] c4881s0Arr) {
        for (int i10 = 0; i10 < c4881s0Arr.length; i10++) {
            C4881s0 c4881s0 = c4881s0Arr[i10];
            C4463m1[] c4463m1Arr = new C4463m1[c4881s0.f18465h];
            for (int i11 = 0; i11 < c4881s0.f18465h; i11++) {
                C4463m1 m19444b = c4881s0.m19444b(i11);
                c4463m1Arr[i11] = m19444b.m17412c(this.f22322n.mo21232e(m19444b));
            }
            c4881s0Arr[i10] = new C4881s0(c4881s0.f18466i, c4463m1Arr);
        }
        return new C4885u0(c4881s0Arr);
    }

    /* renamed from: F */
    public final void m24010F(int i10) {
        C4014a.m15200f(!this.f22325q.m14803j());
        while (true) {
            if (i10 >= this.f22329u.size()) {
                i10 = -1;
                break;
            } else if (m24051z(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = m24013J().f19973h;
        C5979j m24011G = m24011G(i10);
        if (this.f22329u.isEmpty()) {
            this.f22308X = this.f22307W;
        } else {
            ((C5979j) C2610b0.m10505d(this.f22329u)).m23974o();
        }
        this.f22311a0 = false;
        this.f22326r.m19222D(this.f22292H, m24011G.f19972g, j10);
    }

    /* renamed from: G */
    public final C5979j m24011G(int i10) {
        C5979j c5979j = this.f22329u.get(i10);
        ArrayList<C5979j> arrayList = this.f22329u;
        C4041n0.m15418M0(arrayList, i10, arrayList.size());
        for (int i11 = 0; i11 < this.f22287C.length; i11++) {
            this.f22287C[i11].m19391u(c5979j.m23972m(i11));
        }
        return c5979j;
    }

    /* renamed from: H */
    public final boolean m24012H(C5979j c5979j) {
        int i10 = c5979j.f22236k;
        int length = this.f22287C.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f22305U[i11] && this.f22287C[i11].m19363Q() == i10) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J */
    public final C5979j m24013J() {
        return this.f22329u.get(r0.size() - 1);
    }

    /* renamed from: K */
    public final InterfaceC5559b0 m24014K(int i10, int i11) {
        C4014a.m15195a(f22284f0.contains(Integer.valueOf(i11)));
        int i12 = this.f22290F.get(i11, -1);
        if (i12 == -1) {
            return null;
        }
        if (this.f22289E.add(Integer.valueOf(i11))) {
            this.f22288D[i12] = i10;
        }
        return this.f22288D[i12] == i10 ? this.f22287C[i12] : m24000B(i10, i11);
    }

    /* renamed from: M */
    public final void m24015M(C5979j c5979j) {
        this.f22315e0 = c5979j;
        this.f22297M = c5979j.f19969d;
        this.f22308X = -9223372036854775807L;
        this.f22329u.add(c5979j);
        AbstractC2651u.a m10766n = AbstractC2651u.m10766n();
        for (d dVar : this.f22287C) {
            m10766n.mo10749a(Integer.valueOf(dVar.m19354G()));
        }
        c5979j.m23973n(this, m10766n.m10784k());
        for (d dVar2 : this.f22287C) {
            dVar2.m24057j0(c5979j);
            if (c5979j.f22239n) {
                dVar2.m19379g0();
            }
        }
    }

    /* renamed from: O */
    public final boolean m24016O() {
        return this.f22308X != -9223372036854775807L;
    }

    /* renamed from: P */
    public boolean m24017P(int i10) {
        return !m24016O() && this.f22287C[i10].m19358K(this.f22311a0);
    }

    /* renamed from: Q */
    public boolean m24018Q() {
        return this.f22292H == 2;
    }

    /* renamed from: R */
    public final void m24019R() {
        int i10 = this.f22300P.f18478h;
        int[] iArr = new int[i10];
        this.f22302R = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (true) {
                d[] dVarArr = this.f22287C;
                if (i12 >= dVarArr.length) {
                    break;
                }
                if (m24002I((C4463m1) C4014a.m15202h(dVarArr[i12].m19353F()), this.f22300P.m19452b(i11).m19444b(0))) {
                    this.f22302R[i11] = i12;
                    break;
                }
                i12++;
            }
        }
        Iterator<C5982m> it = this.f22334z.iterator();
        while (it.hasNext()) {
            it.next().m23997b();
        }
    }

    /* renamed from: S */
    public final void m24020S() {
        if (!this.f22299O && this.f22302R == null && this.f22294J) {
            for (d dVar : this.f22287C) {
                if (dVar.m19353F() == null) {
                    return;
                }
            }
            if (this.f22300P != null) {
                m24019R();
                return;
            }
            m24050y();
            m24039k0();
            this.f22318j.mo23994a();
        }
    }

    /* renamed from: T */
    public void m24021T() {
        this.f22325q.mo4756a();
        this.f22319k.m23954n();
    }

    /* renamed from: U */
    public void m24022U(int i10) {
        m24021T();
        this.f22287C[i10].m19360N();
    }

    @Override // p206o5.C3901e0.b
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void mo223r(AbstractC5266f abstractC5266f, long j10, long j11, boolean z10) {
        this.f22286B = null;
        C4870n c4870n = new C4870n(abstractC5266f.f19966a, abstractC5266f.f19967b, abstractC5266f.m21321f(), abstractC5266f.m21320e(), j10, j11, abstractC5266f.m21318a());
        this.f22324p.m14776b(abstractC5266f.f19966a);
        this.f22326r.m19230r(c4870n, abstractC5266f.f19968c, this.f22317i, abstractC5266f.f19969d, abstractC5266f.f19970e, abstractC5266f.f19971f, abstractC5266f.f19972g, abstractC5266f.f19973h);
        if (z10) {
            return;
        }
        if (m24016O() || this.f22296L == 0) {
            m24034f0();
        }
        if (this.f22296L > 0) {
            this.f22318j.mo4788e(this);
        }
    }

    @Override // p206o5.C3901e0.b
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo222o(AbstractC5266f abstractC5266f, long j10, long j11) {
        this.f22286B = null;
        this.f22319k.m23956p(abstractC5266f);
        C4870n c4870n = new C4870n(abstractC5266f.f19966a, abstractC5266f.f19967b, abstractC5266f.m21321f(), abstractC5266f.m21320e(), j10, j11, abstractC5266f.m21318a());
        this.f22324p.m14776b(abstractC5266f.f19966a);
        this.f22326r.m19233u(c4870n, abstractC5266f.f19968c, this.f22317i, abstractC5266f.f19969d, abstractC5266f.f19970e, abstractC5266f.f19971f, abstractC5266f.f19972g, abstractC5266f.f19973h);
        if (this.f22295K) {
            this.f22318j.mo4788e(this);
        } else {
            mo4786c(this.f22307W);
        }
    }

    @Override // p206o5.C3901e0.b
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public C3901e0.c mo219k(AbstractC5266f abstractC5266f, long j10, long j11, IOException iOException, int i10) {
        C3901e0.c m14799h;
        int i11;
        boolean m24004N = m24004N(abstractC5266f);
        if (m24004N && !((C5979j) abstractC5266f).m23975q() && (iOException instanceof C3893a0) && ((i11 = ((C3893a0) iOException).f13968k) == 410 || i11 == 404)) {
            return C3901e0.f13999d;
        }
        long m21318a = abstractC5266f.m21318a();
        C4870n c4870n = new C4870n(abstractC5266f.f19966a, abstractC5266f.f19967b, abstractC5266f.m21321f(), abstractC5266f.m21320e(), j10, j11, m21318a);
        InterfaceC3899d0.c cVar = new InterfaceC3899d0.c(c4870n, new C4876q(abstractC5266f.f19968c, this.f22317i, abstractC5266f.f19969d, abstractC5266f.f19970e, abstractC5266f.f19971f, C4041n0.m15442Y0(abstractC5266f.f19972g), C4041n0.m15442Y0(abstractC5266f.f19973h)), iOException, i10);
        InterfaceC3899d0.b mo14777c = this.f22324p.mo14777c(C3732a0.m14073c(this.f22319k.m23951k()), cVar);
        boolean m23953m = (mo14777c == null || mo14777c.f13989a != 2) ? false : this.f22319k.m23953m(abstractC5266f, mo14777c.f13990b);
        if (m23953m) {
            if (m24004N && m21318a == 0) {
                ArrayList<C5979j> arrayList = this.f22329u;
                C4014a.m15200f(arrayList.remove(arrayList.size() - 1) == abstractC5266f);
                if (this.f22329u.isEmpty()) {
                    this.f22308X = this.f22307W;
                } else {
                    ((C5979j) C2610b0.m10505d(this.f22329u)).m23974o();
                }
            }
            m14799h = C3901e0.f14001f;
        } else {
            long mo14775a = this.f22324p.mo14775a(cVar);
            m14799h = mo14775a != -9223372036854775807L ? C3901e0.m14799h(false, mo14775a) : C3901e0.f14002g;
        }
        C3901e0.c cVar2 = m14799h;
        boolean z10 = !cVar2.m14810c();
        this.f22326r.m19235w(c4870n, abstractC5266f.f19968c, this.f22317i, abstractC5266f.f19969d, abstractC5266f.f19970e, abstractC5266f.f19971f, abstractC5266f.f19972g, abstractC5266f.f19973h, iOException, z10);
        if (z10) {
            this.f22286B = null;
            this.f22324p.m14776b(abstractC5266f.f19966a);
        }
        if (m23953m) {
            if (this.f22295K) {
                this.f22318j.mo4788e(this);
            } else {
                mo4786c(this.f22307W);
            }
        }
        return cVar2;
    }

    /* renamed from: Y */
    public void m24026Y() {
        this.f22289E.clear();
    }

    /* renamed from: Z */
    public boolean m24027Z(Uri uri, InterfaceC3899d0.c cVar, boolean z10) {
        InterfaceC3899d0.b mo14777c;
        if (!this.f22319k.m23955o(uri)) {
            return true;
        }
        long j10 = (z10 || (mo14777c = this.f22324p.mo14777c(C3732a0.m14073c(this.f22319k.m23951k()), cVar)) == null || mo14777c.f13989a != 2) ? -9223372036854775807L : mo14777c.f13990b;
        return this.f22319k.m23957q(uri, j10) && j10 != -9223372036854775807L;
    }

    @Override // p290u4.C4867l0.d
    /* renamed from: a */
    public void mo19296a(C4463m1 c4463m1) {
        this.f22333y.post(this.f22331w);
    }

    /* renamed from: a0 */
    public void m24028a0() {
        if (this.f22329u.isEmpty()) {
            return;
        }
        C5979j c5979j = (C5979j) C2610b0.m10505d(this.f22329u);
        int m23946c = this.f22319k.m23946c(c5979j);
        if (m23946c == 1) {
            c5979j.m23980v();
        } else if (m23946c == 2 && !this.f22311a0 && this.f22325q.m14803j()) {
            this.f22325q.m14800f();
        }
    }

    @Override // p290u4.InterfaceC4871n0
    /* renamed from: b */
    public long mo4785b() {
        if (m24016O()) {
            return this.f22308X;
        }
        if (this.f22311a0) {
            return Long.MIN_VALUE;
        }
        return m24013J().f19973h;
    }

    /* renamed from: b0 */
    public final void m24029b0() {
        this.f22294J = true;
        m24020S();
    }

    @Override // p290u4.InterfaceC4871n0
    /* renamed from: c */
    public boolean mo4786c(long j10) {
        List<C5979j> list;
        long max;
        if (this.f22311a0 || this.f22325q.m14803j() || this.f22325q.m14802i()) {
            return false;
        }
        if (m24016O()) {
            list = Collections.emptyList();
            max = this.f22308X;
            for (d dVar : this.f22287C) {
                dVar.m19374b0(this.f22308X);
            }
        } else {
            list = this.f22330v;
            C5979j m24013J = m24013J();
            max = m24013J.mo21353h() ? m24013J.f19973h : Math.max(this.f22307W, m24013J.f19972g);
        }
        List<C5979j> list2 = list;
        long j11 = max;
        this.f22328t.m23965a();
        this.f22319k.m23947e(j10, j11, list2, this.f22295K || !list2.isEmpty(), this.f22328t);
        C5975f.b bVar = this.f22328t;
        boolean z10 = bVar.f22209b;
        AbstractC5266f abstractC5266f = bVar.f22208a;
        Uri uri = bVar.f22210c;
        if (z10) {
            this.f22308X = -9223372036854775807L;
            this.f22311a0 = true;
            return true;
        }
        if (abstractC5266f == null) {
            if (uri != null) {
                this.f22318j.mo23996j(uri);
            }
            return false;
        }
        if (m24004N(abstractC5266f)) {
            m24015M((C5979j) abstractC5266f);
        }
        this.f22286B = abstractC5266f;
        this.f22326r.m19219A(new C4870n(abstractC5266f.f19966a, abstractC5266f.f19967b, this.f22325q.m14807n(abstractC5266f, this, this.f22324p.mo14778d(abstractC5266f.f19968c))), abstractC5266f.f19968c, this.f22317i, abstractC5266f.f19969d, abstractC5266f.f19970e, abstractC5266f.f19971f, abstractC5266f.f19972g, abstractC5266f.f19973h);
        return true;
    }

    /* renamed from: c0 */
    public void m24030c0(C4881s0[] c4881s0Arr, int i10, int... iArr) {
        this.f22300P = m24009D(c4881s0Arr);
        this.f22301Q = new HashSet();
        for (int i11 : iArr) {
            this.f22301Q.add(this.f22300P.m19452b(i11));
        }
        this.f22303S = i10;
        Handler handler = this.f22333y;
        final b bVar = this.f22318j;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: z4.n
            @Override // java.lang.Runnable
            public final void run() {
                C5986q.b.this.mo23994a();
            }
        });
        m24039k0();
    }

    /* renamed from: d */
    public long m24031d(long j10, C4465m3 c4465m3) {
        return this.f22319k.m23945b(j10, c4465m3);
    }

    /* renamed from: d0 */
    public int m24032d0(int i10, C4468n1 c4468n1, C5110g c5110g, int i11) {
        if (m24016O()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f22329u.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f22329u.size() - 1 && m24012H(this.f22329u.get(i13))) {
                i13++;
            }
            C4041n0.m15418M0(this.f22329u, 0, i13);
            C5979j c5979j = this.f22329u.get(0);
            C4463m1 c4463m1 = c5979j.f19969d;
            if (!c4463m1.equals(this.f22298N)) {
                this.f22326r.m19227i(this.f22317i, c4463m1, c5979j.f19970e, c5979j.f19971f, c5979j.f19972g);
            }
            this.f22298N = c4463m1;
        }
        if (!this.f22329u.isEmpty() && !this.f22329u.get(0).m23975q()) {
            return -3;
        }
        int m19365S = this.f22287C[i10].m19365S(c4468n1, c5110g, i11, this.f22311a0);
        if (m19365S == -5) {
            C4463m1 c4463m12 = (C4463m1) C4014a.m15199e(c4468n1.f16559b);
            if (i10 == this.f22293I) {
                int m19363Q = this.f22287C[i10].m19363Q();
                while (i12 < this.f22329u.size() && this.f22329u.get(i12).f22236k != m19363Q) {
                    i12++;
                }
                c4463m12 = c4463m12.m17415j(i12 < this.f22329u.size() ? this.f22329u.get(i12).f19969d : (C4463m1) C4014a.m15199e(this.f22297M));
            }
            c4468n1.f16559b = c4463m12;
        }
        return m19365S;
    }

    @Override // p333x3.InterfaceC5573m
    /* renamed from: e */
    public InterfaceC5559b0 mo3032e(int i10, int i11) {
        InterfaceC5559b0 interfaceC5559b0;
        if (!f22284f0.contains(Integer.valueOf(i11))) {
            int i12 = 0;
            while (true) {
                InterfaceC5559b0[] interfaceC5559b0Arr = this.f22287C;
                if (i12 >= interfaceC5559b0Arr.length) {
                    interfaceC5559b0 = null;
                    break;
                }
                if (this.f22288D[i12] == i10) {
                    interfaceC5559b0 = interfaceC5559b0Arr[i12];
                    break;
                }
                i12++;
            }
        } else {
            interfaceC5559b0 = m24014K(i10, i11);
        }
        if (interfaceC5559b0 == null) {
            if (this.f22312b0) {
                return m24000B(i10, i11);
            }
            interfaceC5559b0 = m24008C(i10, i11);
        }
        if (i11 != 5) {
            return interfaceC5559b0;
        }
        if (this.f22291G == null) {
            this.f22291G = new c(interfaceC5559b0, this.f22327s);
        }
        return this.f22291G;
    }

    /* renamed from: e0 */
    public void m24033e0() {
        if (this.f22295K) {
            for (d dVar : this.f22287C) {
                dVar.m19364R();
            }
        }
        this.f22325q.m14806m(this);
        this.f22333y.removeCallbacksAndMessages(null);
        this.f22299O = true;
        this.f22334z.clear();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:492)
        */
    @Override // p290u4.InterfaceC4871n0
    /* renamed from: f */
    public long mo4789f() {
        /*
            r7 = this;
            boolean r0 = r7.f22311a0
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.m24016O()
            if (r0 == 0) goto L10
            long r0 = r7.f22308X
            return r0
        L10:
            long r0 = r7.f22307W
            z4.j r2 = r7.m24013J()
            boolean r3 = r2.mo21353h()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.ArrayList<z4.j> r2 = r7.f22329u
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L35
            java.util.ArrayList<z4.j> r2 = r7.f22329u
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            z4.j r2 = (p365z4.C5979j) r2
            goto L36
        L35:
            r2 = 0
        L36:
            if (r2 == 0) goto L3e
            long r2 = r2.f19973h
            long r0 = java.lang.Math.max(r0, r2)
        L3e:
            boolean r2 = r7.f22294J
            if (r2 == 0) goto L55
            z4.q$d[] r2 = r7.f22287C
            int r3 = r2.length
            r4 = 0
        L46:
            if (r4 >= r3) goto L55
            r5 = r2[r4]
            long r5 = r5.m19396z()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L46
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p365z4.C5986q.mo4789f():long");
    }

    /* renamed from: f0 */
    public final void m24034f0() {
        for (d dVar : this.f22287C) {
            dVar.m19369W(this.f22309Y);
        }
        this.f22309Y = false;
    }

    @Override // p290u4.InterfaceC4871n0
    /* renamed from: g */
    public void mo4790g(long j10) {
        if (this.f22325q.m14802i() || m24016O()) {
            return;
        }
        if (this.f22325q.m14803j()) {
            C4014a.m15199e(this.f22286B);
            if (this.f22319k.m23962v(j10, this.f22286B, this.f22330v)) {
                this.f22325q.m14800f();
                return;
            }
            return;
        }
        int size = this.f22330v.size();
        while (size > 0 && this.f22319k.m23946c(this.f22330v.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f22330v.size()) {
            m24010F(size);
        }
        int m23949h = this.f22319k.m23949h(j10, this.f22330v);
        if (m23949h < this.f22329u.size()) {
            m24010F(m23949h);
        }
    }

    /* renamed from: g0 */
    public final boolean m24035g0(long j10) {
        int length = this.f22287C.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f22287C[i10].m19372Z(j10, false) && (this.f22306V[i10] || !this.f22304T)) {
                return false;
            }
        }
        return true;
    }

    @Override // p206o5.C3901e0.f
    /* renamed from: h */
    public void mo14819h() {
        for (d dVar : this.f22287C) {
            dVar.m19366T();
        }
    }

    /* renamed from: h0 */
    public boolean m24036h0(long j10, boolean z10) {
        this.f22307W = j10;
        if (m24016O()) {
            this.f22308X = j10;
            return true;
        }
        if (this.f22294J && !z10 && m24035g0(j10)) {
            return false;
        }
        this.f22308X = j10;
        this.f22311a0 = false;
        this.f22329u.clear();
        if (this.f22325q.m14803j()) {
            if (this.f22294J) {
                for (d dVar : this.f22287C) {
                    dVar.m19388r();
                }
            }
            this.f22325q.m14800f();
        } else {
            this.f22325q.m14801g();
            m24034f0();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0131  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m24037i0(p193n5.InterfaceC3752s[] r20, boolean[] r21, p290u4.InterfaceC4869m0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p365z4.C5986q.m24037i0(n5.s[], boolean[], u4.m0[], boolean[], long, boolean):boolean");
    }

    @Override // p290u4.InterfaceC4871n0
    public boolean isLoading() {
        return this.f22325q.m14803j();
    }

    @Override // p333x3.InterfaceC5573m
    /* renamed from: j */
    public void mo3033j(InterfaceC5586z interfaceC5586z) {
    }

    /* renamed from: j0 */
    public void m24038j0(C5247m c5247m) {
        if (C4041n0.m15449c(this.f22314d0, c5247m)) {
            return;
        }
        this.f22314d0 = c5247m;
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f22287C;
            if (i10 >= dVarArr.length) {
                return;
            }
            if (this.f22306V[i10]) {
                dVarArr[i10].m24056i0(c5247m);
            }
            i10++;
        }
    }

    /* renamed from: k0 */
    public final void m24039k0() {
        this.f22295K = true;
    }

    /* renamed from: l */
    public void m24040l() {
        m24021T();
        if (this.f22311a0 && !this.f22295K) {
            throw C4499t2.m17594a("Loading finished before preparation is complete.", null);
        }
    }

    /* renamed from: l0 */
    public void m24041l0(boolean z10) {
        this.f22319k.m23960t(z10);
    }

    /* renamed from: m0 */
    public void m24042m0(long j10) {
        if (this.f22313c0 != j10) {
            this.f22313c0 = j10;
            for (d dVar : this.f22287C) {
                dVar.m19373a0(j10);
            }
        }
    }

    @Override // p333x3.InterfaceC5573m
    /* renamed from: n */
    public void mo3034n() {
        this.f22312b0 = true;
        this.f22333y.post(this.f22332x);
    }

    /* renamed from: n0 */
    public int m24043n0(int i10, long j10) {
        if (m24016O()) {
            return 0;
        }
        d dVar = this.f22287C[i10];
        int m19352E = dVar.m19352E(j10, this.f22311a0);
        C5979j c5979j = (C5979j) C2610b0.m10506e(this.f22329u, null);
        if (c5979j != null && !c5979j.m23975q()) {
            m19352E = Math.min(m19352E, c5979j.m23972m(i10) - dVar.m19350C());
        }
        dVar.m19377e0(m19352E);
        return m19352E;
    }

    /* renamed from: o0 */
    public void m24044o0(int i10) {
        m24048w();
        C4014a.m15199e(this.f22302R);
        int i11 = this.f22302R[i10];
        C4014a.m15200f(this.f22305U[i11]);
        this.f22305U[i11] = false;
    }

    /* renamed from: p0 */
    public final void m24045p0(InterfaceC4869m0[] interfaceC4869m0Arr) {
        this.f22334z.clear();
        for (InterfaceC4869m0 interfaceC4869m0 : interfaceC4869m0Arr) {
            if (interfaceC4869m0 != null) {
                this.f22334z.add((C5982m) interfaceC4869m0);
            }
        }
    }

    /* renamed from: s */
    public C4885u0 m24046s() {
        m24048w();
        return this.f22300P;
    }

    /* renamed from: t */
    public void m24047t(long j10, boolean z10) {
        if (!this.f22294J || m24016O()) {
            return;
        }
        int length = this.f22287C.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f22287C[i10].m19387q(j10, z10, this.f22305U[i10]);
        }
    }

    /* renamed from: w */
    public final void m24048w() {
        C4014a.m15200f(this.f22295K);
        C4014a.m15199e(this.f22300P);
        C4014a.m15199e(this.f22301Q);
    }

    /* renamed from: x */
    public int m24049x(int i10) {
        m24048w();
        C4014a.m15199e(this.f22302R);
        int i11 = this.f22302R[i10];
        if (i11 == -1) {
            return this.f22301Q.contains(this.f22300P.m19452b(i10)) ? -3 : -2;
        }
        boolean[] zArr = this.f22305U;
        if (zArr[i11]) {
            return -2;
        }
        zArr[i11] = true;
        return i11;
    }

    /* renamed from: y */
    public final void m24050y() {
        C4463m1 c4463m1;
        int length = this.f22287C.length;
        int i10 = -2;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                break;
            }
            String str = ((C4463m1) C4014a.m15202h(this.f22287C[i12].m19353F())).f16506s;
            int i13 = C4050v.m15562s(str) ? 2 : C4050v.m15558o(str) ? 1 : C4050v.m15561r(str) ? 3 : -2;
            if (m24003L(i13) > m24003L(i10)) {
                i11 = i12;
                i10 = i13;
            } else if (i13 == i10 && i11 != -1) {
                i11 = -1;
            }
            i12++;
        }
        C4881s0 m23950j = this.f22319k.m23950j();
        int i14 = m23950j.f18465h;
        this.f22303S = -1;
        this.f22302R = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            this.f22302R[i15] = i15;
        }
        C4881s0[] c4881s0Arr = new C4881s0[length];
        int i16 = 0;
        while (i16 < length) {
            C4463m1 c4463m12 = (C4463m1) C4014a.m15202h(this.f22287C[i16].m19353F());
            if (i16 == i11) {
                C4463m1[] c4463m1Arr = new C4463m1[i14];
                for (int i17 = 0; i17 < i14; i17++) {
                    C4463m1 m19444b = m23950j.m19444b(i17);
                    if (i10 == 1 && (c4463m1 = this.f22321m) != null) {
                        m19444b = m19444b.m17415j(c4463m1);
                    }
                    c4463m1Arr[i17] = i14 == 1 ? c4463m12.m17415j(m19444b) : m24001E(m19444b, c4463m12, true);
                }
                c4881s0Arr[i16] = new C4881s0(this.f22316h, c4463m1Arr);
                this.f22303S = i16;
            } else {
                C4463m1 c4463m13 = (i10 == 2 && C4050v.m15558o(c4463m12.f16506s)) ? this.f22321m : null;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f22316h);
                sb2.append(":muxed:");
                sb2.append(i16 < i11 ? i16 : i16 - 1);
                c4881s0Arr[i16] = new C4881s0(sb2.toString(), m24001E(c4463m13, c4463m12, false));
            }
            i16++;
        }
        this.f22300P = m24009D(c4881s0Arr);
        C4014a.m15200f(this.f22301Q == null);
        this.f22301Q = Collections.emptySet();
    }

    /* renamed from: z */
    public final boolean m24051z(int i10) {
        for (int i11 = i10; i11 < this.f22329u.size(); i11++) {
            if (this.f22329u.get(i11).f22239n) {
                return false;
            }
        }
        C5979j c5979j = this.f22329u.get(i10);
        for (int i12 = 0; i12 < this.f22287C.length; i12++) {
            if (this.f22287C[i12].m19350C() > c5979j.m23972m(i12)) {
                return false;
            }
        }
        return true;
    }
}
