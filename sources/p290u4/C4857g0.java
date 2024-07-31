package p290u4;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p152k4.C3348a;
import p193n5.InterfaceC3752s;
import p205o4.C3890b;
import p206o5.C3901e0;
import p206o5.C3915l0;
import p206o5.C3916m;
import p206o5.C3918n;
import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3899d0;
import p206o5.InterfaceC3906h;
import p206o5.InterfaceC3910j;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4026g;
import p222p5.C4041n0;
import p222p5.C4050v;
import p264s3.C4463m1;
import p264s3.C4465m3;
import p264s3.C4468n1;
import p264s3.C4499t2;
import p290u4.C4867l0;
import p290u4.C4868m;
import p290u4.InterfaceC4845a0;
import p290u4.InterfaceC4878r;
import p304v3.C5110g;
import p317w3.InterfaceC5255u;
import p317w3.InterfaceC5256v;
import p333x3.C5585y;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5586z;

/* renamed from: u4.g0 */
/* loaded from: classes.dex */
public final class C4857g0 implements InterfaceC4878r, InterfaceC5573m, C3901e0.b<a>, C3901e0.f, C4867l0.d {

    /* renamed from: T */
    public static final Map<String, String> f18249T = m19272K();

    /* renamed from: U */
    public static final C4463m1 f18250U = new C4463m1.b().m17462U("icy").m17474g0("application/x-icy").m17448G();

    /* renamed from: B */
    public boolean f18252B;

    /* renamed from: C */
    public boolean f18253C;

    /* renamed from: D */
    public boolean f18254D;

    /* renamed from: E */
    public e f18255E;

    /* renamed from: F */
    public InterfaceC5586z f18256F;

    /* renamed from: H */
    public boolean f18258H;

    /* renamed from: J */
    public boolean f18260J;

    /* renamed from: K */
    public boolean f18261K;

    /* renamed from: L */
    public int f18262L;

    /* renamed from: M */
    public boolean f18263M;

    /* renamed from: N */
    public long f18264N;

    /* renamed from: P */
    public boolean f18266P;

    /* renamed from: Q */
    public int f18267Q;

    /* renamed from: R */
    public boolean f18268R;

    /* renamed from: S */
    public boolean f18269S;

    /* renamed from: h */
    public final Uri f18270h;

    /* renamed from: i */
    public final InterfaceC3910j f18271i;

    /* renamed from: j */
    public final InterfaceC5256v f18272j;

    /* renamed from: k */
    public final InterfaceC3899d0 f18273k;

    /* renamed from: l */
    public final InterfaceC4845a0.a f18274l;

    /* renamed from: m */
    public final InterfaceC5255u.a f18275m;

    /* renamed from: n */
    public final b f18276n;

    /* renamed from: o */
    public final InterfaceC3894b f18277o;

    /* renamed from: p */
    public final String f18278p;

    /* renamed from: q */
    public final long f18279q;

    /* renamed from: s */
    public final InterfaceC4847b0 f18281s;

    /* renamed from: x */
    public InterfaceC4878r.a f18286x;

    /* renamed from: y */
    public C3890b f18287y;

    /* renamed from: r */
    public final C3901e0 f18280r = new C3901e0("ProgressiveMediaPeriod");

    /* renamed from: t */
    public final C4026g f18282t = new C4026g();

    /* renamed from: u */
    public final Runnable f18283u = new Runnable() { // from class: u4.c0
        @Override // java.lang.Runnable
        public final void run() {
            C4857g0.this.m19289T();
        }
    };

    /* renamed from: v */
    public final Runnable f18284v = new Runnable() { // from class: u4.e0
        @Override // java.lang.Runnable
        public final void run() {
            C4857g0.this.m19273Q();
        }
    };

    /* renamed from: w */
    public final Handler f18285w = C4041n0.m15489w();

    /* renamed from: A */
    public d[] f18251A = new d[0];

    /* renamed from: z */
    public C4867l0[] f18288z = new C4867l0[0];

    /* renamed from: O */
    public long f18265O = -9223372036854775807L;

    /* renamed from: G */
    public long f18257G = -9223372036854775807L;

    /* renamed from: I */
    public int f18259I = 1;

    /* renamed from: u4.g0$a */
    /* loaded from: classes.dex */
    public final class a implements C3901e0.e, C4868m.a {

        /* renamed from: b */
        public final Uri f18290b;

        /* renamed from: c */
        public final C3915l0 f18291c;

        /* renamed from: d */
        public final InterfaceC4847b0 f18292d;

        /* renamed from: e */
        public final InterfaceC5573m f18293e;

        /* renamed from: f */
        public final C4026g f18294f;

        /* renamed from: h */
        public volatile boolean f18296h;

        /* renamed from: j */
        public long f18298j;

        /* renamed from: l */
        public InterfaceC5559b0 f18300l;

        /* renamed from: m */
        public boolean f18301m;

        /* renamed from: g */
        public final C5585y f18295g = new C5585y();

        /* renamed from: i */
        public boolean f18297i = true;

        /* renamed from: a */
        public final long f18289a = C4870n.m19398a();

        /* renamed from: k */
        public C3918n f18299k = m19313i(0);

        public a(Uri uri, InterfaceC3910j interfaceC3910j, InterfaceC4847b0 interfaceC4847b0, InterfaceC5573m interfaceC5573m, C4026g c4026g) {
            this.f18290b = uri;
            this.f18291c = new C3915l0(interfaceC3910j);
            this.f18292d = interfaceC4847b0;
            this.f18293e = interfaceC5573m;
            this.f18294f = c4026g;
        }

        @Override // p290u4.C4868m.a
        /* renamed from: a */
        public void mo19312a(C4015a0 c4015a0) {
            long max = !this.f18301m ? this.f18298j : Math.max(C4857g0.this.m19285M(true), this.f18298j);
            int m15226a = c4015a0.m15226a();
            InterfaceC5559b0 interfaceC5559b0 = (InterfaceC5559b0) C4014a.m15199e(this.f18300l);
            interfaceC5559b0.m22408e(c4015a0, m15226a);
            interfaceC5559b0.mo4851a(max, 1, m15226a, 0, null);
            this.f18301m = true;
        }

        @Override // p206o5.C3901e0.e
        /* renamed from: b */
        public void mo14817b() {
            int i10 = 0;
            while (i10 == 0 && !this.f18296h) {
                try {
                    long j10 = this.f18295g.f20962a;
                    C3918n m19313i = m19313i(j10);
                    this.f18299k = m19313i;
                    long mo14770k = this.f18291c.mo14770k(m19313i);
                    if (mo14770k != -1) {
                        mo14770k += j10;
                        C4857g0.this.m19294Y();
                    }
                    long j11 = mo14770k;
                    C4857g0.this.f18287y = C3890b.m14756a(this.f18291c.mo14829j());
                    InterfaceC3906h interfaceC3906h = this.f18291c;
                    if (C4857g0.this.f18287y != null && C4857g0.this.f18287y.f13962m != -1) {
                        interfaceC3906h = new C4868m(this.f18291c, C4857g0.this.f18287y.f13962m, this);
                        InterfaceC5559b0 m19286N = C4857g0.this.m19286N();
                        this.f18300l = m19286N;
                        m19286N.mo4852b(C4857g0.f18250U);
                    }
                    long j12 = j10;
                    this.f18292d.mo19241e(interfaceC3906h, this.f18290b, this.f18291c.mo14829j(), j10, j11, this.f18293e);
                    if (C4857g0.this.f18287y != null) {
                        this.f18292d.mo19243g();
                    }
                    if (this.f18297i) {
                        this.f18292d.mo19239c(j12, this.f18298j);
                        this.f18297i = false;
                    }
                    while (true) {
                        long j13 = j12;
                        while (i10 == 0 && !this.f18296h) {
                            try {
                                this.f18294f.m15310a();
                                i10 = this.f18292d.mo19240d(this.f18295g);
                                j12 = this.f18292d.mo19242f();
                                if (j12 > C4857g0.this.f18279q + j13) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f18294f.m15312c();
                        C4857g0.this.f18285w.post(C4857g0.this.f18284v);
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f18292d.mo19242f() != -1) {
                        this.f18295g.f20962a = this.f18292d.mo19242f();
                    }
                    C3916m.m14847a(this.f18291c);
                } catch (Throwable th) {
                    if (i10 != 1 && this.f18292d.mo19242f() != -1) {
                        this.f18295g.f20962a = this.f18292d.mo19242f();
                    }
                    C3916m.m14847a(this.f18291c);
                    throw th;
                }
            }
        }

        @Override // p206o5.C3901e0.e
        /* renamed from: c */
        public void mo14818c() {
            this.f18296h = true;
        }

        /* renamed from: i */
        public final C3918n m19313i(long j10) {
            return new C3918n.b().m14866i(this.f18290b).m14865h(j10).m14863f(C4857g0.this.f18278p).m14859b(6).m14862e(C4857g0.f18249T).m14858a();
        }

        /* renamed from: j */
        public final void m19314j(long j10, long j11) {
            this.f18295g.f20962a = j10;
            this.f18298j = j11;
            this.f18297i = true;
            this.f18301m = false;
        }
    }

    /* renamed from: u4.g0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: f */
        void mo19315f(long j10, boolean z10, boolean z11);
    }

    /* renamed from: u4.g0$c */
    /* loaded from: classes.dex */
    public final class c implements InterfaceC4869m0 {

        /* renamed from: h */
        public final int f18303h;

        public c(int i10) {
            this.f18303h = i10;
        }

        @Override // p290u4.InterfaceC4869m0
        /* renamed from: a */
        public void mo19250a() {
            C4857g0.this.m19293X(this.f18303h);
        }

        @Override // p290u4.InterfaceC4869m0
        /* renamed from: e */
        public boolean mo19252e() {
            return C4857g0.this.m19288P(this.f18303h);
        }

        @Override // p290u4.InterfaceC4869m0
        /* renamed from: j */
        public int mo19253j(C4468n1 c4468n1, C5110g c5110g, int i10) {
            return C4857g0.this.m19300d0(this.f18303h, c4468n1, c5110g, i10);
        }

        @Override // p290u4.InterfaceC4869m0
        /* renamed from: n */
        public int mo19254n(long j10) {
            return C4857g0.this.m19304h0(this.f18303h, j10);
        }
    }

    /* renamed from: u4.g0$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final int f18305a;

        /* renamed from: b */
        public final boolean f18306b;

        public d(int i10, boolean z10) {
            this.f18305a = i10;
            this.f18306b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f18305a == dVar.f18305a && this.f18306b == dVar.f18306b;
        }

        public int hashCode() {
            return (this.f18305a * 31) + (this.f18306b ? 1 : 0);
        }
    }

    /* renamed from: u4.g0$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a */
        public final C4885u0 f18307a;

        /* renamed from: b */
        public final boolean[] f18308b;

        /* renamed from: c */
        public final boolean[] f18309c;

        /* renamed from: d */
        public final boolean[] f18310d;

        public e(C4885u0 c4885u0, boolean[] zArr) {
            this.f18307a = c4885u0;
            this.f18308b = zArr;
            int i10 = c4885u0.f18478h;
            this.f18309c = new boolean[i10];
            this.f18310d = new boolean[i10];
        }
    }

    public C4857g0(Uri uri, InterfaceC3910j interfaceC3910j, InterfaceC4847b0 interfaceC4847b0, InterfaceC5256v interfaceC5256v, InterfaceC5255u.a aVar, InterfaceC3899d0 interfaceC3899d0, InterfaceC4845a0.a aVar2, b bVar, InterfaceC3894b interfaceC3894b, String str, int i10) {
        this.f18270h = uri;
        this.f18271i = interfaceC3910j;
        this.f18272j = interfaceC5256v;
        this.f18275m = aVar;
        this.f18273k = interfaceC3899d0;
        this.f18274l = aVar2;
        this.f18276n = bVar;
        this.f18277o = interfaceC3894b;
        this.f18278p = str;
        this.f18279q = i10;
        this.f18281s = interfaceC4847b0;
    }

    /* renamed from: K */
    public static Map<String, String> m19272K() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m19273Q() {
        if (this.f18269S) {
            return;
        }
        ((InterfaceC4878r.a) C4014a.m15199e(this.f18286x)).mo4788e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m19274R() {
        this.f18263M = true;
    }

    /* renamed from: I */
    public final void m19282I() {
        C4014a.m15200f(this.f18253C);
        C4014a.m15199e(this.f18255E);
        C4014a.m15199e(this.f18256F);
    }

    /* renamed from: J */
    public final boolean m19283J(a aVar, int i10) {
        InterfaceC5586z interfaceC5586z;
        if (this.f18263M || !((interfaceC5586z = this.f18256F) == null || interfaceC5586z.mo3035d() == -9223372036854775807L)) {
            this.f18267Q = i10;
            return true;
        }
        if (this.f18253C && !m19306j0()) {
            this.f18266P = true;
            return false;
        }
        this.f18261K = this.f18253C;
        this.f18264N = 0L;
        this.f18267Q = 0;
        for (C4867l0 c4867l0 : this.f18288z) {
            c4867l0.m19368V();
        }
        aVar.m19314j(0L, 0L);
        return true;
    }

    /* renamed from: L */
    public final int m19284L() {
        int i10 = 0;
        for (C4867l0 c4867l0 : this.f18288z) {
            i10 += c4867l0.m19354G();
        }
        return i10;
    }

    /* renamed from: M */
    public final long m19285M(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f18288z.length; i10++) {
            if (z10 || ((e) C4014a.m15199e(this.f18255E)).f18309c[i10]) {
                j10 = Math.max(j10, this.f18288z[i10].m19396z());
            }
        }
        return j10;
    }

    /* renamed from: N */
    public InterfaceC5559b0 m19286N() {
        return m19299c0(new d(0, true));
    }

    /* renamed from: O */
    public final boolean m19287O() {
        return this.f18265O != -9223372036854775807L;
    }

    /* renamed from: P */
    public boolean m19288P(int i10) {
        return !m19306j0() && this.f18288z[i10].m19358K(this.f18268R);
    }

    /* renamed from: T */
    public final void m19289T() {
        if (this.f18269S || this.f18253C || !this.f18252B || this.f18256F == null) {
            return;
        }
        for (C4867l0 c4867l0 : this.f18288z) {
            if (c4867l0.m19353F() == null) {
                return;
            }
        }
        this.f18282t.m15312c();
        int length = this.f18288z.length;
        C4881s0[] c4881s0Arr = new C4881s0[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            C4463m1 c4463m1 = (C4463m1) C4014a.m15199e(this.f18288z[i10].m19353F());
            String str = c4463m1.f16506s;
            boolean m15558o = C4050v.m15558o(str);
            boolean z10 = m15558o || C4050v.m15562s(str);
            zArr[i10] = z10;
            this.f18254D = z10 | this.f18254D;
            C3890b c3890b = this.f18287y;
            if (c3890b != null) {
                if (m15558o || this.f18251A[i10].f18306b) {
                    C3348a c3348a = c4463m1.f16504q;
                    c4463m1 = c4463m1.m17411b().m17467Z(c3348a == null ? new C3348a(c3890b) : c3348a.m12410a(c3890b)).m17448G();
                }
                if (m15558o && c4463m1.f16500m == -1 && c4463m1.f16501n == -1 && c3890b.f13957h != -1) {
                    c4463m1 = c4463m1.m17411b().m17450I(c3890b.f13957h).m17448G();
                }
            }
            c4881s0Arr[i10] = new C4881s0(Integer.toString(i10), c4463m1.m17412c(this.f18272j.mo21232e(c4463m1)));
        }
        this.f18255E = new e(new C4885u0(c4881s0Arr), zArr);
        this.f18253C = true;
        ((InterfaceC4878r.a) C4014a.m15199e(this.f18286x)).mo17309k(this);
    }

    /* renamed from: U */
    public final void m19290U(int i10) {
        m19282I();
        e eVar = this.f18255E;
        boolean[] zArr = eVar.f18310d;
        if (zArr[i10]) {
            return;
        }
        C4463m1 m19444b = eVar.f18307a.m19452b(i10).m19444b(0);
        this.f18274l.m19227i(C4050v.m15554k(m19444b.f16506s), m19444b, 0, null, this.f18264N);
        zArr[i10] = true;
    }

    /* renamed from: V */
    public final void m19291V(int i10) {
        m19282I();
        boolean[] zArr = this.f18255E.f18308b;
        if (this.f18266P && zArr[i10]) {
            if (this.f18288z[i10].m19358K(false)) {
                return;
            }
            this.f18265O = 0L;
            this.f18266P = false;
            this.f18261K = true;
            this.f18264N = 0L;
            this.f18267Q = 0;
            for (C4867l0 c4867l0 : this.f18288z) {
                c4867l0.m19368V();
            }
            ((InterfaceC4878r.a) C4014a.m15199e(this.f18286x)).mo4788e(this);
        }
    }

    /* renamed from: W */
    public void m19292W() {
        this.f18280r.m14804k(this.f18273k.mo14778d(this.f18259I));
    }

    /* renamed from: X */
    public void m19293X(int i10) {
        this.f18288z[i10].m19360N();
        m19292W();
    }

    /* renamed from: Y */
    public final void m19294Y() {
        this.f18285w.post(new Runnable() { // from class: u4.d0
            @Override // java.lang.Runnable
            public final void run() {
                C4857g0.this.m19274R();
            }
        });
    }

    @Override // p206o5.C3901e0.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void mo223r(a aVar, long j10, long j11, boolean z10) {
        C3915l0 c3915l0 = aVar.f18291c;
        C4870n c4870n = new C4870n(aVar.f18289a, aVar.f18299k, c3915l0.m14844r(), c3915l0.m14845s(), j10, j11, c3915l0.m14843q());
        this.f18273k.m14776b(aVar.f18289a);
        this.f18274l.m19230r(c4870n, 1, -1, null, 0, null, aVar.f18298j, this.f18257G);
        if (z10) {
            return;
        }
        for (C4867l0 c4867l0 : this.f18288z) {
            c4867l0.m19368V();
        }
        if (this.f18262L > 0) {
            ((InterfaceC4878r.a) C4014a.m15199e(this.f18286x)).mo4788e(this);
        }
    }

    @Override // p290u4.C4867l0.d
    /* renamed from: a */
    public void mo19296a(C4463m1 c4463m1) {
        this.f18285w.post(this.f18283u);
    }

    @Override // p206o5.C3901e0.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void mo222o(a aVar, long j10, long j11) {
        InterfaceC5586z interfaceC5586z;
        if (this.f18257G == -9223372036854775807L && (interfaceC5586z = this.f18256F) != null) {
            boolean mo3036f = interfaceC5586z.mo3036f();
            long m19285M = m19285M(true);
            long j12 = m19285M == Long.MIN_VALUE ? 0L : m19285M + 10000;
            this.f18257G = j12;
            this.f18276n.mo19315f(j12, mo3036f, this.f18258H);
        }
        C3915l0 c3915l0 = aVar.f18291c;
        C4870n c4870n = new C4870n(aVar.f18289a, aVar.f18299k, c3915l0.m14844r(), c3915l0.m14845s(), j10, j11, c3915l0.m14843q());
        this.f18273k.m14776b(aVar.f18289a);
        this.f18274l.m19233u(c4870n, 1, -1, null, 0, null, aVar.f18298j, this.f18257G);
        this.f18268R = true;
        ((InterfaceC4878r.a) C4014a.m15199e(this.f18286x)).mo4788e(this);
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: b */
    public long mo4785b() {
        return mo4789f();
    }

    @Override // p206o5.C3901e0.b
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public C3901e0.c mo219k(a aVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        a aVar2;
        C3901e0.c m14799h;
        C3915l0 c3915l0 = aVar.f18291c;
        C4870n c4870n = new C4870n(aVar.f18289a, aVar.f18299k, c3915l0.m14844r(), c3915l0.m14845s(), j10, j11, c3915l0.m14843q());
        long mo14775a = this.f18273k.mo14775a(new InterfaceC3899d0.c(c4870n, new C4876q(1, -1, null, 0, null, C4041n0.m15442Y0(aVar.f18298j), C4041n0.m15442Y0(this.f18257G)), iOException, i10));
        if (mo14775a == -9223372036854775807L) {
            m14799h = C3901e0.f14002g;
        } else {
            int m19284L = m19284L();
            if (m19284L > this.f18267Q) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            m14799h = m19283J(aVar2, m19284L) ? C3901e0.m14799h(z10, mo14775a) : C3901e0.f14001f;
        }
        boolean z11 = !m14799h.m14810c();
        this.f18274l.m19235w(c4870n, 1, -1, null, 0, null, aVar.f18298j, this.f18257G, iOException, z11);
        if (z11) {
            this.f18273k.m14776b(aVar.f18289a);
        }
        return m14799h;
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: c */
    public boolean mo4786c(long j10) {
        if (this.f18268R || this.f18280r.m14802i() || this.f18266P) {
            return false;
        }
        if (this.f18253C && this.f18262L == 0) {
            return false;
        }
        boolean m15314e = this.f18282t.m15314e();
        if (this.f18280r.m14803j()) {
            return m15314e;
        }
        m19305i0();
        return true;
    }

    /* renamed from: c0 */
    public final InterfaceC5559b0 m19299c0(d dVar) {
        int length = this.f18288z.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f18251A[i10])) {
                return this.f18288z[i10];
            }
        }
        C4867l0 m19346k = C4867l0.m19346k(this.f18277o, this.f18272j, this.f18275m);
        m19346k.m19376d0(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f18251A, i11);
        dVarArr[length] = dVar;
        this.f18251A = (d[]) C4041n0.m15465k(dVarArr);
        C4867l0[] c4867l0Arr = (C4867l0[]) Arrays.copyOf(this.f18288z, i11);
        c4867l0Arr[length] = m19346k;
        this.f18288z = (C4867l0[]) C4041n0.m15465k(c4867l0Arr);
        return m19346k;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: d */
    public long mo4787d(long j10, C4465m3 c4465m3) {
        m19282I();
        if (!this.f18256F.mo3036f()) {
            return 0L;
        }
        InterfaceC5586z.a mo3037i = this.f18256F.mo3037i(j10);
        return c4465m3.m17482a(j10, mo3037i.f20963a.f20851a, mo3037i.f20964b.f20851a);
    }

    /* renamed from: d0 */
    public int m19300d0(int i10, C4468n1 c4468n1, C5110g c5110g, int i11) {
        if (m19306j0()) {
            return -3;
        }
        m19290U(i10);
        int m19365S = this.f18288z[i10].m19365S(c4468n1, c5110g, i11, this.f18268R);
        if (m19365S == -3) {
            m19291V(i10);
        }
        return m19365S;
    }

    @Override // p333x3.InterfaceC5573m
    /* renamed from: e */
    public InterfaceC5559b0 mo3032e(int i10, int i11) {
        return m19299c0(new d(i10, false));
    }

    /* renamed from: e0 */
    public void m19301e0() {
        if (this.f18253C) {
            for (C4867l0 c4867l0 : this.f18288z) {
                c4867l0.m19364R();
            }
        }
        this.f18280r.m14806m(this);
        this.f18285w.removeCallbacksAndMessages(null);
        this.f18286x = null;
        this.f18269S = true;
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: f */
    public long mo4789f() {
        long j10;
        m19282I();
        if (this.f18268R || this.f18262L == 0) {
            return Long.MIN_VALUE;
        }
        if (m19287O()) {
            return this.f18265O;
        }
        if (this.f18254D) {
            int length = this.f18288z.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = this.f18255E;
                if (eVar.f18308b[i10] && eVar.f18309c[i10] && !this.f18288z[i10].m19357J()) {
                    j10 = Math.min(j10, this.f18288z[i10].m19396z());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = m19285M(false);
        }
        return j10 == Long.MIN_VALUE ? this.f18264N : j10;
    }

    /* renamed from: f0 */
    public final boolean m19302f0(boolean[] zArr, long j10) {
        int length = this.f18288z.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f18288z[i10].m19372Z(j10, false) && (zArr[i10] || !this.f18254D)) {
                return false;
            }
        }
        return true;
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    /* renamed from: g */
    public void mo4790g(long j10) {
    }

    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void m19275S(InterfaceC5586z interfaceC5586z) {
        this.f18256F = this.f18287y == null ? interfaceC5586z : new InterfaceC5586z.b(-9223372036854775807L);
        this.f18257G = interfaceC5586z.mo3035d();
        boolean z10 = !this.f18263M && interfaceC5586z.mo3035d() == -9223372036854775807L;
        this.f18258H = z10;
        this.f18259I = z10 ? 7 : 1;
        this.f18276n.mo19315f(this.f18257G, interfaceC5586z.mo3036f(), this.f18258H);
        if (this.f18253C) {
            return;
        }
        m19289T();
    }

    @Override // p206o5.C3901e0.f
    /* renamed from: h */
    public void mo14819h() {
        for (C4867l0 c4867l0 : this.f18288z) {
            c4867l0.m19366T();
        }
        this.f18281s.release();
    }

    /* renamed from: h0 */
    public int m19304h0(int i10, long j10) {
        if (m19306j0()) {
            return 0;
        }
        m19290U(i10);
        C4867l0 c4867l0 = this.f18288z[i10];
        int m19352E = c4867l0.m19352E(j10, this.f18268R);
        c4867l0.m19377e0(m19352E);
        if (m19352E == 0) {
            m19291V(i10);
        }
        return m19352E;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: i */
    public void mo4792i(InterfaceC4878r.a aVar, long j10) {
        this.f18286x = aVar;
        this.f18282t.m15314e();
        m19305i0();
    }

    /* renamed from: i0 */
    public final void m19305i0() {
        a aVar = new a(this.f18270h, this.f18271i, this.f18281s, this, this.f18282t);
        if (this.f18253C) {
            C4014a.m15200f(m19287O());
            long j10 = this.f18257G;
            if (j10 != -9223372036854775807L && this.f18265O > j10) {
                this.f18268R = true;
                this.f18265O = -9223372036854775807L;
                return;
            }
            aVar.m19314j(((InterfaceC5586z) C4014a.m15199e(this.f18256F)).mo3037i(this.f18265O).f20963a.f20852b, this.f18265O);
            for (C4867l0 c4867l0 : this.f18288z) {
                c4867l0.m19374b0(this.f18265O);
            }
            this.f18265O = -9223372036854775807L;
        }
        this.f18267Q = m19284L();
        this.f18274l.m19219A(new C4870n(aVar.f18289a, aVar.f18299k, this.f18280r.m14807n(aVar, this, this.f18273k.mo14778d(this.f18259I))), 1, -1, null, 0, null, aVar.f18298j, this.f18257G);
    }

    @Override // p290u4.InterfaceC4878r, p290u4.InterfaceC4871n0
    public boolean isLoading() {
        return this.f18280r.m14803j() && this.f18282t.m15313d();
    }

    @Override // p333x3.InterfaceC5573m
    /* renamed from: j */
    public void mo3033j(final InterfaceC5586z interfaceC5586z) {
        this.f18285w.post(new Runnable() { // from class: u4.f0
            @Override // java.lang.Runnable
            public final void run() {
                C4857g0.this.m19275S(interfaceC5586z);
            }
        });
    }

    /* renamed from: j0 */
    public final boolean m19306j0() {
        return this.f18261K || m19287O();
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: l */
    public void mo4793l() {
        m19292W();
        if (this.f18268R && !this.f18253C) {
            throw C4499t2.m17594a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: m */
    public long mo4794m(long j10) {
        m19282I();
        boolean[] zArr = this.f18255E.f18308b;
        if (!this.f18256F.mo3036f()) {
            j10 = 0;
        }
        int i10 = 0;
        this.f18261K = false;
        this.f18264N = j10;
        if (m19287O()) {
            this.f18265O = j10;
            return j10;
        }
        if (this.f18259I != 7 && m19302f0(zArr, j10)) {
            return j10;
        }
        this.f18266P = false;
        this.f18265O = j10;
        this.f18268R = false;
        if (this.f18280r.m14803j()) {
            C4867l0[] c4867l0Arr = this.f18288z;
            int length = c4867l0Arr.length;
            while (i10 < length) {
                c4867l0Arr[i10].m19388r();
                i10++;
            }
            this.f18280r.m14800f();
        } else {
            this.f18280r.m14801g();
            C4867l0[] c4867l0Arr2 = this.f18288z;
            int length2 = c4867l0Arr2.length;
            while (i10 < length2) {
                c4867l0Arr2[i10].m19368V();
                i10++;
            }
        }
        return j10;
    }

    @Override // p333x3.InterfaceC5573m
    /* renamed from: n */
    public void mo3034n() {
        this.f18252B = true;
        this.f18285w.post(this.f18283u);
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: p */
    public long mo4795p() {
        if (!this.f18261K) {
            return -9223372036854775807L;
        }
        if (!this.f18268R && m19284L() <= this.f18267Q) {
            return -9223372036854775807L;
        }
        this.f18261K = false;
        return this.f18264N;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: q */
    public long mo4796q(InterfaceC3752s[] interfaceC3752sArr, boolean[] zArr, InterfaceC4869m0[] interfaceC4869m0Arr, boolean[] zArr2, long j10) {
        m19282I();
        e eVar = this.f18255E;
        C4885u0 c4885u0 = eVar.f18307a;
        boolean[] zArr3 = eVar.f18309c;
        int i10 = this.f18262L;
        int i11 = 0;
        for (int i12 = 0; i12 < interfaceC3752sArr.length; i12++) {
            if (interfaceC4869m0Arr[i12] != null && (interfaceC3752sArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) interfaceC4869m0Arr[i12]).f18303h;
                C4014a.m15200f(zArr3[i13]);
                this.f18262L--;
                zArr3[i13] = false;
                interfaceC4869m0Arr[i12] = null;
            }
        }
        boolean z10 = !this.f18260J ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < interfaceC3752sArr.length; i14++) {
            if (interfaceC4869m0Arr[i14] == null && interfaceC3752sArr[i14] != null) {
                InterfaceC3752s interfaceC3752s = interfaceC3752sArr[i14];
                C4014a.m15200f(interfaceC3752s.length() == 1);
                C4014a.m15200f(interfaceC3752s.mo14088d(0) == 0);
                int m19453c = c4885u0.m19453c(interfaceC3752s.mo14086b());
                C4014a.m15200f(!zArr3[m19453c]);
                this.f18262L++;
                zArr3[m19453c] = true;
                interfaceC4869m0Arr[i14] = new c(m19453c);
                zArr2[i14] = true;
                if (!z10) {
                    C4867l0 c4867l0 = this.f18288z[m19453c];
                    z10 = (c4867l0.m19372Z(j10, true) || c4867l0.m19350C() == 0) ? false : true;
                }
            }
        }
        if (this.f18262L == 0) {
            this.f18266P = false;
            this.f18261K = false;
            if (this.f18280r.m14803j()) {
                C4867l0[] c4867l0Arr = this.f18288z;
                int length = c4867l0Arr.length;
                while (i11 < length) {
                    c4867l0Arr[i11].m19388r();
                    i11++;
                }
                this.f18280r.m14800f();
            } else {
                C4867l0[] c4867l0Arr2 = this.f18288z;
                int length2 = c4867l0Arr2.length;
                while (i11 < length2) {
                    c4867l0Arr2[i11].m19368V();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = mo4794m(j10);
            while (i11 < interfaceC4869m0Arr.length) {
                if (interfaceC4869m0Arr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f18260J = true;
        return j10;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: s */
    public C4885u0 mo4798s() {
        m19282I();
        return this.f18255E.f18307a;
    }

    @Override // p290u4.InterfaceC4878r
    /* renamed from: t */
    public void mo4799t(long j10, boolean z10) {
        m19282I();
        if (m19287O()) {
            return;
        }
        boolean[] zArr = this.f18255E.f18309c;
        int length = this.f18288z.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f18288z[i10].m19387q(j10, z10, zArr[i10]);
        }
    }
}
