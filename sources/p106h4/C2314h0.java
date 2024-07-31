package p106h4;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p106h4.InterfaceC2316i0;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4033j0;
import p222p5.C4041n0;
import p222p5.C4054z;
import p264s3.C4499t2;
import p333x3.C5585y;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5576p;
import p333x3.InterfaceC5586z;

/* renamed from: h4.h0 */
/* loaded from: classes.dex */
public final class C2314h0 implements InterfaceC5571k {

    /* renamed from: t */
    public static final InterfaceC5576p f9302t = C2312g0.f9288b;

    /* renamed from: a */
    public final int f9303a;

    /* renamed from: b */
    public final int f9304b;

    /* renamed from: c */
    public final List<C4033j0> f9305c;

    /* renamed from: d */
    public final C4015a0 f9306d;

    /* renamed from: e */
    public final SparseIntArray f9307e;

    /* renamed from: f */
    public final InterfaceC2316i0.c f9308f;

    /* renamed from: g */
    public final SparseArray<InterfaceC2316i0> f9309g;

    /* renamed from: h */
    public final SparseBooleanArray f9310h;

    /* renamed from: i */
    public final SparseBooleanArray f9311i;

    /* renamed from: j */
    public final C2310f0 f9312j;

    /* renamed from: k */
    public C2308e0 f9313k;

    /* renamed from: l */
    public InterfaceC5573m f9314l;

    /* renamed from: m */
    public int f9315m;

    /* renamed from: n */
    public boolean f9316n;

    /* renamed from: o */
    public boolean f9317o;

    /* renamed from: p */
    public boolean f9318p;

    /* renamed from: q */
    public InterfaceC2316i0 f9319q;

    /* renamed from: r */
    public int f9320r;

    /* renamed from: s */
    public int f9321s;

    /* renamed from: h4.h0$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC2302b0 {

        /* renamed from: a */
        public final C4054z f9322a = new C4054z(new byte[4]);

        public a() {
        }

        @Override // p106h4.InterfaceC2302b0
        /* renamed from: a */
        public void mo9331a(C4015a0 c4015a0) {
            if (c4015a0.m15210G() == 0 && (c4015a0.m15210G() & 128) != 0) {
                c4015a0.m15224U(6);
                int m15226a = c4015a0.m15226a() / 4;
                for (int i10 = 0; i10 < m15226a; i10++) {
                    c4015a0.m15236k(this.f9322a, 4);
                    int m15601h = this.f9322a.m15601h(16);
                    this.f9322a.m15611r(3);
                    if (m15601h == 0) {
                        this.f9322a.m15611r(13);
                    } else {
                        int m15601h2 = this.f9322a.m15601h(13);
                        if (C2314h0.this.f9309g.get(m15601h2) == null) {
                            C2314h0.this.f9309g.put(m15601h2, new C2304c0(new b(m15601h2)));
                            C2314h0.m9375k(C2314h0.this);
                        }
                    }
                }
                if (C2314h0.this.f9303a != 2) {
                    C2314h0.this.f9309g.remove(0);
                }
            }
        }

        @Override // p106h4.InterfaceC2302b0
        /* renamed from: b */
        public void mo9332b(C4033j0 c4033j0, InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        }
    }

    /* renamed from: h4.h0$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC2302b0 {

        /* renamed from: a */
        public final C4054z f9324a = new C4054z(new byte[5]);

        /* renamed from: b */
        public final SparseArray<InterfaceC2316i0> f9325b = new SparseArray<>();

        /* renamed from: c */
        public final SparseIntArray f9326c = new SparseIntArray();

        /* renamed from: d */
        public final int f9327d;

        public b(int i10) {
            this.f9327d = i10;
        }

        @Override // p106h4.InterfaceC2302b0
        /* renamed from: a */
        public void mo9331a(C4015a0 c4015a0) {
            C4033j0 c4033j0;
            if (c4015a0.m15210G() != 2) {
                return;
            }
            if (C2314h0.this.f9303a == 1 || C2314h0.this.f9303a == 2 || C2314h0.this.f9315m == 1) {
                c4033j0 = (C4033j0) C2314h0.this.f9305c.get(0);
            } else {
                c4033j0 = new C4033j0(((C4033j0) C2314h0.this.f9305c.get(0)).m15364c());
                C2314h0.this.f9305c.add(c4033j0);
            }
            if ((c4015a0.m15210G() & 128) == 0) {
                return;
            }
            c4015a0.m15224U(1);
            int m15216M = c4015a0.m15216M();
            int i10 = 3;
            c4015a0.m15224U(3);
            c4015a0.m15236k(this.f9324a, 2);
            this.f9324a.m15611r(3);
            int i11 = 13;
            C2314h0.this.f9321s = this.f9324a.m15601h(13);
            c4015a0.m15236k(this.f9324a, 2);
            int i12 = 4;
            this.f9324a.m15611r(4);
            c4015a0.m15224U(this.f9324a.m15601h(12));
            if (C2314h0.this.f9303a == 2 && C2314h0.this.f9319q == null) {
                InterfaceC2316i0.b bVar = new InterfaceC2316i0.b(21, null, null, C4041n0.f14518f);
                C2314h0 c2314h0 = C2314h0.this;
                c2314h0.f9319q = c2314h0.f9308f.mo9411b(21, bVar);
                if (C2314h0.this.f9319q != null) {
                    C2314h0.this.f9319q.mo9342b(c4033j0, C2314h0.this.f9314l, new InterfaceC2316i0.d(m15216M, 21, 8192));
                }
            }
            this.f9325b.clear();
            this.f9326c.clear();
            int m15226a = c4015a0.m15226a();
            while (m15226a > 0) {
                c4015a0.m15236k(this.f9324a, 5);
                int m15601h = this.f9324a.m15601h(8);
                this.f9324a.m15611r(i10);
                int m15601h2 = this.f9324a.m15601h(i11);
                this.f9324a.m15611r(i12);
                int m15601h3 = this.f9324a.m15601h(12);
                InterfaceC2316i0.b m9391c = m9391c(c4015a0, m15601h3);
                if (m15601h == 6 || m15601h == 5) {
                    m15601h = m9391c.f9354a;
                }
                m15226a -= m15601h3 + 5;
                int i13 = C2314h0.this.f9303a == 2 ? m15601h : m15601h2;
                if (!C2314h0.this.f9310h.get(i13)) {
                    InterfaceC2316i0 mo9411b = (C2314h0.this.f9303a == 2 && m15601h == 21) ? C2314h0.this.f9319q : C2314h0.this.f9308f.mo9411b(m15601h, m9391c);
                    if (C2314h0.this.f9303a != 2 || m15601h2 < this.f9326c.get(i13, 8192)) {
                        this.f9326c.put(i13, m15601h2);
                        this.f9325b.put(i13, mo9411b);
                    }
                }
                i10 = 3;
                i12 = 4;
                i11 = 13;
            }
            int size = this.f9326c.size();
            for (int i14 = 0; i14 < size; i14++) {
                int keyAt = this.f9326c.keyAt(i14);
                int valueAt = this.f9326c.valueAt(i14);
                C2314h0.this.f9310h.put(keyAt, true);
                C2314h0.this.f9311i.put(valueAt, true);
                InterfaceC2316i0 valueAt2 = this.f9325b.valueAt(i14);
                if (valueAt2 != null) {
                    if (valueAt2 != C2314h0.this.f9319q) {
                        valueAt2.mo9342b(c4033j0, C2314h0.this.f9314l, new InterfaceC2316i0.d(m15216M, keyAt, 8192));
                    }
                    C2314h0.this.f9309g.put(valueAt, valueAt2);
                }
            }
            if (C2314h0.this.f9303a != 2) {
                C2314h0.this.f9309g.remove(this.f9327d);
                C2314h0 c2314h02 = C2314h0.this;
                c2314h02.f9315m = c2314h02.f9303a == 1 ? 0 : C2314h0.this.f9315m - 1;
                if (C2314h0.this.f9315m != 0) {
                    return;
                } else {
                    C2314h0.this.f9314l.mo3034n();
                }
            } else {
                if (C2314h0.this.f9316n) {
                    return;
                }
                C2314h0.this.f9314l.mo3034n();
                C2314h0.this.f9315m = 0;
            }
            C2314h0.this.f9316n = true;
        }

        @Override // p106h4.InterfaceC2302b0
        /* renamed from: b */
        public void mo9332b(C4033j0 c4033j0, InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        }

        /* renamed from: c */
        public final InterfaceC2316i0.b m9391c(C4015a0 c4015a0, int i10) {
            int m15231f = c4015a0.m15231f();
            int i11 = i10 + m15231f;
            String str = null;
            int i12 = -1;
            ArrayList arrayList = null;
            while (c4015a0.m15231f() < i11) {
                int m15210G = c4015a0.m15210G();
                int m15231f2 = c4015a0.m15231f() + c4015a0.m15210G();
                if (m15231f2 > i11) {
                    break;
                }
                if (m15210G == 5) {
                    long m15212I = c4015a0.m15212I();
                    if (m15212I != 1094921523) {
                        if (m15212I != 1161904947) {
                            if (m15212I != 1094921524) {
                                if (m15212I == 1212503619) {
                                    i12 = 36;
                                }
                            }
                            i12 = 172;
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                } else {
                    if (m15210G != 106) {
                        if (m15210G != 122) {
                            if (m15210G == 127) {
                                if (c4015a0.m15210G() != 21) {
                                }
                                i12 = 172;
                            } else if (m15210G == 123) {
                                i12 = 138;
                            } else if (m15210G == 10) {
                                str = c4015a0.m15207D(3).trim();
                            } else if (m15210G == 89) {
                                arrayList = new ArrayList();
                                while (c4015a0.m15231f() < m15231f2) {
                                    String trim = c4015a0.m15207D(3).trim();
                                    int m15210G2 = c4015a0.m15210G();
                                    byte[] bArr = new byte[4];
                                    c4015a0.m15237l(bArr, 0, 4);
                                    arrayList.add(new InterfaceC2316i0.a(trim, m15210G2, bArr));
                                }
                                i12 = 89;
                            } else if (m15210G == 111) {
                                i12 = 257;
                            }
                        }
                        i12 = 135;
                    }
                    i12 = 129;
                }
                c4015a0.m15224U(m15231f2 - c4015a0.m15231f());
            }
            c4015a0.m15223T(i11);
            return new InterfaceC2316i0.b(i12, str, arrayList, Arrays.copyOfRange(c4015a0.m15230e(), m15231f, i11));
        }
    }

    public C2314h0() {
        this(0);
    }

    public C2314h0(int i10) {
        this(1, i10, 112800);
    }

    public C2314h0(int i10, int i11, int i12) {
        this(i10, new C4033j0(0L), new C2317j(i11), i12);
    }

    public C2314h0(int i10, C4033j0 c4033j0, InterfaceC2316i0.c cVar) {
        this(i10, c4033j0, cVar, 112800);
    }

    public C2314h0(int i10, C4033j0 c4033j0, InterfaceC2316i0.c cVar, int i11) {
        this.f9308f = (InterfaceC2316i0.c) C4014a.m15199e(cVar);
        this.f9304b = i11;
        this.f9303a = i10;
        if (i10 == 1 || i10 == 2) {
            this.f9305c = Collections.singletonList(c4033j0);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f9305c = arrayList;
            arrayList.add(c4033j0);
        }
        this.f9306d = new C4015a0(new byte[9400], 0);
        this.f9310h = new SparseBooleanArray();
        this.f9311i = new SparseBooleanArray();
        this.f9309g = new SparseArray<>();
        this.f9307e = new SparseIntArray();
        this.f9312j = new C2310f0(i11);
        this.f9314l = InterfaceC5573m.f20932g;
        this.f9321s = -1;
        m9389y();
    }

    /* renamed from: k */
    public static /* synthetic */ int m9375k(C2314h0 c2314h0) {
        int i10 = c2314h0.f9315m;
        c2314h0.f9315m = i10 + 1;
        return i10;
    }

    /* renamed from: w */
    public static /* synthetic */ InterfaceC5571k[] m9385w() {
        return new InterfaceC5571k[]{new C2314h0()};
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f9314l = interfaceC5573m;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        C2308e0 c2308e0;
        C4014a.m15200f(this.f9303a != 2);
        int size = this.f9305c.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4033j0 c4033j0 = this.f9305c.get(i10);
            boolean z10 = c4033j0.m15366e() == -9223372036854775807L;
            if (!z10) {
                long m15364c = c4033j0.m15364c();
                z10 = (m15364c == -9223372036854775807L || m15364c == 0 || m15364c == j11) ? false : true;
            }
            if (z10) {
                c4033j0.m15367g(j11);
            }
        }
        if (j11 != 0 && (c2308e0 = this.f9313k) != null) {
            c2308e0.m22374h(j11);
        }
        this.f9306d.m15219P(0);
        this.f9307e.clear();
        for (int i11 = 0; i11 < this.f9309g.size(); i11++) {
            this.f9309g.valueAt(i11).mo9343c();
        }
        this.f9320r = 0;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        long mo3029b = interfaceC5572l.mo3029b();
        if (this.f9316n) {
            if (((mo3029b == -1 || this.f9303a == 2) ? false : true) && !this.f9312j.m9356d()) {
                return this.f9312j.m9357e(interfaceC5572l, c5585y, this.f9321s);
            }
            m9388x(mo3029b);
            if (this.f9318p) {
                this.f9318p = false;
                mo165c(0L, 0L);
                if (interfaceC5572l.getPosition() != 0) {
                    c5585y.f20962a = 0L;
                    return 1;
                }
            }
            C2308e0 c2308e0 = this.f9313k;
            if (c2308e0 != null && c2308e0.m22370d()) {
                return this.f9313k.m22369c(interfaceC5572l, c5585y);
            }
        }
        if (!m9386u(interfaceC5572l)) {
            return -1;
        }
        int m9387v = m9387v();
        int m15232g = this.f9306d.m15232g();
        if (m9387v > m15232g) {
            return 0;
        }
        int m15241p = this.f9306d.m15241p();
        if ((8388608 & m15241p) == 0) {
            int i10 = ((4194304 & m15241p) != 0 ? 1 : 0) | 0;
            int i11 = (2096896 & m15241p) >> 8;
            boolean z10 = (m15241p & 32) != 0;
            InterfaceC2316i0 interfaceC2316i0 = (m15241p & 16) != 0 ? this.f9309g.get(i11) : null;
            if (interfaceC2316i0 != null) {
                if (this.f9303a != 2) {
                    int i12 = m15241p & 15;
                    int i13 = this.f9307e.get(i11, i12 - 1);
                    this.f9307e.put(i11, i12);
                    if (i13 != i12) {
                        if (i12 != ((i13 + 1) & 15)) {
                            interfaceC2316i0.mo9343c();
                        }
                    }
                }
                if (z10) {
                    int m15210G = this.f9306d.m15210G();
                    i10 |= (this.f9306d.m15210G() & 64) != 0 ? 2 : 0;
                    this.f9306d.m15224U(m15210G - 1);
                }
                boolean z11 = this.f9316n;
                if (m9390z(i11)) {
                    this.f9306d.m15222S(m9387v);
                    interfaceC2316i0.mo9341a(this.f9306d, i10);
                    this.f9306d.m15222S(m15232g);
                }
                if (this.f9303a != 2 && !z11 && this.f9316n && mo3029b != -1) {
                    this.f9318p = true;
                }
            }
        }
        this.f9306d.m15223T(m9387v);
        return 0;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        boolean z10;
        byte[] m15230e = this.f9306d.m15230e();
        interfaceC5572l.mo22430p(m15230e, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= 5) {
                    z10 = true;
                    break;
                }
                if (m15230e[(i11 * 188) + i10] != 71) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                interfaceC5572l.mo22428m(i10);
                return true;
            }
        }
        return false;
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
    }

    /* renamed from: u */
    public final boolean m9386u(InterfaceC5572l interfaceC5572l) {
        byte[] m15230e = this.f9306d.m15230e();
        if (9400 - this.f9306d.m15231f() < 188) {
            int m15226a = this.f9306d.m15226a();
            if (m15226a > 0) {
                System.arraycopy(m15230e, this.f9306d.m15231f(), m15230e, 0, m15226a);
            }
            this.f9306d.m15221R(m15230e, m15226a);
        }
        while (this.f9306d.m15226a() < 188) {
            int m15232g = this.f9306d.m15232g();
            int mo14769c = interfaceC5572l.mo14769c(m15230e, m15232g, 9400 - m15232g);
            if (mo14769c == -1) {
                return false;
            }
            this.f9306d.m15222S(m15232g + mo14769c);
        }
        return true;
    }

    /* renamed from: v */
    public final int m9387v() {
        int m15231f = this.f9306d.m15231f();
        int m15232g = this.f9306d.m15232g();
        int m9420a = C2318j0.m9420a(this.f9306d.m15230e(), m15231f, m15232g);
        this.f9306d.m15223T(m9420a);
        int i10 = m9420a + 188;
        if (i10 > m15232g) {
            int i11 = this.f9320r + (m9420a - m15231f);
            this.f9320r = i11;
            if (this.f9303a == 2 && i11 > 376) {
                throw C4499t2.m17594a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f9320r = 0;
        }
        return i10;
    }

    /* renamed from: x */
    public final void m9388x(long j10) {
        InterfaceC5573m interfaceC5573m;
        InterfaceC5586z bVar;
        if (this.f9317o) {
            return;
        }
        this.f9317o = true;
        if (this.f9312j.m9354b() != -9223372036854775807L) {
            C2308e0 c2308e0 = new C2308e0(this.f9312j.m9355c(), this.f9312j.m9354b(), j10, this.f9321s, this.f9304b);
            this.f9313k = c2308e0;
            interfaceC5573m = this.f9314l;
            bVar = c2308e0.m22368b();
        } else {
            interfaceC5573m = this.f9314l;
            bVar = new InterfaceC5586z.b(this.f9312j.m9354b());
        }
        interfaceC5573m.mo3033j(bVar);
    }

    /* renamed from: y */
    public final void m9389y() {
        this.f9310h.clear();
        this.f9309g.clear();
        SparseArray<InterfaceC2316i0> mo9410a = this.f9308f.mo9410a();
        int size = mo9410a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f9309g.put(mo9410a.keyAt(i10), mo9410a.valueAt(i10));
        }
        this.f9309g.put(0, new C2304c0(new a()));
        this.f9319q = null;
    }

    /* renamed from: z */
    public final boolean m9390z(int i10) {
        return this.f9303a == 2 || this.f9316n || !this.f9311i.get(i10, false);
    }
}
