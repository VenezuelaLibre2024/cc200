package p318w4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p206o5.C3901e0;
import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3899d0;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p264s3.C4465m3;
import p264s3.C4468n1;
import p290u4.C4867l0;
import p290u4.C4870n;
import p290u4.InterfaceC4845a0;
import p290u4.InterfaceC4869m0;
import p290u4.InterfaceC4871n0;
import p304v3.C5110g;
import p317w3.InterfaceC5255u;
import p317w3.InterfaceC5256v;
import p318w4.InterfaceC5270j;

/* renamed from: w4.i */
/* loaded from: classes.dex */
public class C5269i<T extends InterfaceC5270j> implements InterfaceC4869m0, InterfaceC4871n0, C3901e0.b<AbstractC5266f>, C3901e0.f {

    /* renamed from: A */
    public long f19977A;

    /* renamed from: B */
    public int f19978B;

    /* renamed from: C */
    public AbstractC5261a f19979C;

    /* renamed from: D */
    public boolean f19980D;

    /* renamed from: h */
    public final int f19981h;

    /* renamed from: i */
    public final int[] f19982i;

    /* renamed from: j */
    public final C4463m1[] f19983j;

    /* renamed from: k */
    public final boolean[] f19984k;

    /* renamed from: l */
    public final T f19985l;

    /* renamed from: m */
    public final InterfaceC4871n0.a<C5269i<T>> f19986m;

    /* renamed from: n */
    public final InterfaceC4845a0.a f19987n;

    /* renamed from: o */
    public final InterfaceC3899d0 f19988o;

    /* renamed from: p */
    public final C3901e0 f19989p;

    /* renamed from: q */
    public final C5268h f19990q;

    /* renamed from: r */
    public final ArrayList<AbstractC5261a> f19991r;

    /* renamed from: s */
    public final List<AbstractC5261a> f19992s;

    /* renamed from: t */
    public final C4867l0 f19993t;

    /* renamed from: u */
    public final C4867l0[] f19994u;

    /* renamed from: v */
    public final C5263c f19995v;

    /* renamed from: w */
    public AbstractC5266f f19996w;

    /* renamed from: x */
    public C4463m1 f19997x;

    /* renamed from: y */
    public b<T> f19998y;

    /* renamed from: z */
    public long f19999z;

    /* renamed from: w4.i$a */
    /* loaded from: classes.dex */
    public final class a implements InterfaceC4869m0 {

        /* renamed from: h */
        public final C5269i<T> f20000h;

        /* renamed from: i */
        public final C4867l0 f20001i;

        /* renamed from: j */
        public final int f20002j;

        /* renamed from: k */
        public boolean f20003k;

        public a(C5269i<T> c5269i, C4867l0 c4867l0, int i10) {
            this.f20000h = c5269i;
            this.f20001i = c4867l0;
            this.f20002j = i10;
        }

        @Override // p290u4.InterfaceC4869m0
        /* renamed from: a */
        public void mo19250a() {
        }

        /* renamed from: b */
        public final void m21350b() {
            if (this.f20003k) {
                return;
            }
            C5269i.this.f19987n.m19227i(C5269i.this.f19982i[this.f20002j], C5269i.this.f19983j[this.f20002j], 0, null, C5269i.this.f19977A);
            this.f20003k = true;
        }

        /* renamed from: c */
        public void m21351c() {
            C4014a.m15200f(C5269i.this.f19984k[this.f20002j]);
            C5269i.this.f19984k[this.f20002j] = false;
        }

        @Override // p290u4.InterfaceC4869m0
        /* renamed from: e */
        public boolean mo19252e() {
            return !C5269i.this.m21336H() && this.f20001i.m19358K(C5269i.this.f19980D);
        }

        @Override // p290u4.InterfaceC4869m0
        /* renamed from: j */
        public int mo19253j(C4468n1 c4468n1, C5110g c5110g, int i10) {
            if (C5269i.this.m21336H()) {
                return -3;
            }
            if (C5269i.this.f19979C != null && C5269i.this.f19979C.m21300i(this.f20002j + 1) <= this.f20001i.m19350C()) {
                return -3;
            }
            m21350b();
            return this.f20001i.m19365S(c4468n1, c5110g, i10, C5269i.this.f19980D);
        }

        @Override // p290u4.InterfaceC4869m0
        /* renamed from: n */
        public int mo19254n(long j10) {
            if (C5269i.this.m21336H()) {
                return 0;
            }
            int m19352E = this.f20001i.m19352E(j10, C5269i.this.f19980D);
            if (C5269i.this.f19979C != null) {
                m19352E = Math.min(m19352E, C5269i.this.f19979C.m21300i(this.f20002j + 1) - this.f20001i.m19350C());
            }
            this.f20001i.m19377e0(m19352E);
            if (m19352E > 0) {
                m21350b();
            }
            return m19352E;
        }
    }

    /* renamed from: w4.i$b */
    /* loaded from: classes.dex */
    public interface b<T extends InterfaceC5270j> {
        /* renamed from: h */
        void mo4791h(C5269i<T> c5269i);
    }

    public C5269i(int i10, int[] iArr, C4463m1[] c4463m1Arr, T t10, InterfaceC4871n0.a<C5269i<T>> aVar, InterfaceC3894b interfaceC3894b, long j10, InterfaceC5256v interfaceC5256v, InterfaceC5255u.a aVar2, InterfaceC3899d0 interfaceC3899d0, InterfaceC4845a0.a aVar3) {
        this.f19981h = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f19982i = iArr;
        this.f19983j = c4463m1Arr == null ? new C4463m1[0] : c4463m1Arr;
        this.f19985l = t10;
        this.f19986m = aVar;
        this.f19987n = aVar3;
        this.f19988o = interfaceC3899d0;
        this.f19989p = new C3901e0("ChunkSampleStream");
        this.f19990q = new C5268h();
        ArrayList<AbstractC5261a> arrayList = new ArrayList<>();
        this.f19991r = arrayList;
        this.f19992s = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f19994u = new C4867l0[length];
        this.f19984k = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        C4867l0[] c4867l0Arr = new C4867l0[i12];
        C4867l0 m19346k = C4867l0.m19346k(interfaceC3894b, interfaceC5256v, aVar2);
        this.f19993t = m19346k;
        iArr2[0] = i10;
        c4867l0Arr[0] = m19346k;
        while (i11 < length) {
            C4867l0 m19347l = C4867l0.m19347l(interfaceC3894b);
            this.f19994u[i11] = m19347l;
            int i13 = i11 + 1;
            c4867l0Arr[i13] = m19347l;
            iArr2[i13] = this.f19982i[i11];
            i11 = i13;
        }
        this.f19995v = new C5263c(iArr2, c4867l0Arr);
        this.f19999z = j10;
        this.f19977A = j10;
    }

    /* renamed from: A */
    public final void m21329A(int i10) {
        int min = Math.min(m21342N(i10, 0), this.f19978B);
        if (min > 0) {
            C4041n0.m15418M0(this.f19991r, 0, min);
            this.f19978B -= min;
        }
    }

    /* renamed from: B */
    public final void m21330B(int i10) {
        C4014a.m15200f(!this.f19989p.m14803j());
        int size = this.f19991r.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!m21334F(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = m21333E().f19973h;
        AbstractC5261a m21331C = m21331C(i10);
        if (this.f19991r.isEmpty()) {
            this.f19999z = this.f19977A;
        }
        this.f19980D = false;
        this.f19987n.m19222D(this.f19981h, m21331C.f19972g, j10);
    }

    /* renamed from: C */
    public final AbstractC5261a m21331C(int i10) {
        AbstractC5261a abstractC5261a = this.f19991r.get(i10);
        ArrayList<AbstractC5261a> arrayList = this.f19991r;
        C4041n0.m15418M0(arrayList, i10, arrayList.size());
        this.f19978B = Math.max(this.f19978B, this.f19991r.size());
        C4867l0 c4867l0 = this.f19993t;
        int i11 = 0;
        while (true) {
            c4867l0.m19391u(abstractC5261a.m21300i(i11));
            C4867l0[] c4867l0Arr = this.f19994u;
            if (i11 >= c4867l0Arr.length) {
                return abstractC5261a;
            }
            c4867l0 = c4867l0Arr[i11];
            i11++;
        }
    }

    /* renamed from: D */
    public T m21332D() {
        return this.f19985l;
    }

    /* renamed from: E */
    public final AbstractC5261a m21333E() {
        return this.f19991r.get(r0.size() - 1);
    }

    /* renamed from: F */
    public final boolean m21334F(int i10) {
        int m19350C;
        AbstractC5261a abstractC5261a = this.f19991r.get(i10);
        if (this.f19993t.m19350C() > abstractC5261a.m21300i(0)) {
            return true;
        }
        int i11 = 0;
        do {
            C4867l0[] c4867l0Arr = this.f19994u;
            if (i11 >= c4867l0Arr.length) {
                return false;
            }
            m19350C = c4867l0Arr[i11].m19350C();
            i11++;
        } while (m19350C <= abstractC5261a.m21300i(i11));
        return true;
    }

    /* renamed from: G */
    public final boolean m21335G(AbstractC5266f abstractC5266f) {
        return abstractC5266f instanceof AbstractC5261a;
    }

    /* renamed from: H */
    public boolean m21336H() {
        return this.f19999z != -9223372036854775807L;
    }

    /* renamed from: I */
    public final void m21337I() {
        int m21342N = m21342N(this.f19993t.m19350C(), this.f19978B - 1);
        while (true) {
            int i10 = this.f19978B;
            if (i10 > m21342N) {
                return;
            }
            this.f19978B = i10 + 1;
            m21338J(i10);
        }
    }

    /* renamed from: J */
    public final void m21338J(int i10) {
        AbstractC5261a abstractC5261a = this.f19991r.get(i10);
        C4463m1 c4463m1 = abstractC5261a.f19969d;
        if (!c4463m1.equals(this.f19997x)) {
            this.f19987n.m19227i(this.f19981h, c4463m1, abstractC5261a.f19970e, abstractC5261a.f19971f, abstractC5261a.f19972g);
        }
        this.f19997x = c4463m1;
    }

    @Override // p206o5.C3901e0.b
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo223r(AbstractC5266f abstractC5266f, long j10, long j11, boolean z10) {
        this.f19996w = null;
        this.f19979C = null;
        C4870n c4870n = new C4870n(abstractC5266f.f19966a, abstractC5266f.f19967b, abstractC5266f.m21321f(), abstractC5266f.m21320e(), j10, j11, abstractC5266f.m21318a());
        this.f19988o.m14776b(abstractC5266f.f19966a);
        this.f19987n.m19230r(c4870n, abstractC5266f.f19968c, this.f19981h, abstractC5266f.f19969d, abstractC5266f.f19970e, abstractC5266f.f19971f, abstractC5266f.f19972g, abstractC5266f.f19973h);
        if (z10) {
            return;
        }
        if (m21336H()) {
            m21345Q();
        } else if (m21335G(abstractC5266f)) {
            m21331C(this.f19991r.size() - 1);
            if (this.f19991r.isEmpty()) {
                this.f19999z = this.f19977A;
            }
        }
        this.f19986m.mo4788e(this);
    }

    @Override // p206o5.C3901e0.b
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo222o(AbstractC5266f abstractC5266f, long j10, long j11) {
        this.f19996w = null;
        this.f19985l.mo4809i(abstractC5266f);
        C4870n c4870n = new C4870n(abstractC5266f.f19966a, abstractC5266f.f19967b, abstractC5266f.m21321f(), abstractC5266f.m21320e(), j10, j11, abstractC5266f.m21318a());
        this.f19988o.m14776b(abstractC5266f.f19966a);
        this.f19987n.m19233u(c4870n, abstractC5266f.f19968c, this.f19981h, abstractC5266f.f19969d, abstractC5266f.f19970e, abstractC5266f.f19971f, abstractC5266f.f19972g, abstractC5266f.f19973h);
        this.f19986m.mo4788e(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    @Override // p206o5.C3901e0.b
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p206o5.C3901e0.c mo219k(p318w4.AbstractC5266f r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p318w4.C5269i.mo219k(w4.f, long, long, java.io.IOException, int):o5.e0$c");
    }

    /* renamed from: N */
    public final int m21342N(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f19991r.size()) {
                return this.f19991r.size() - 1;
            }
        } while (this.f19991r.get(i11).m21300i(0) <= i10);
        return i11 - 1;
    }

    /* renamed from: O */
    public void m21343O() {
        m21344P(null);
    }

    /* renamed from: P */
    public void m21344P(b<T> bVar) {
        this.f19998y = bVar;
        this.f19993t.m19364R();
        for (C4867l0 c4867l0 : this.f19994u) {
            c4867l0.m19364R();
        }
        this.f19989p.m14806m(this);
    }

    /* renamed from: Q */
    public final void m21345Q() {
        this.f19993t.m19368V();
        for (C4867l0 c4867l0 : this.f19994u) {
            c4867l0.m19368V();
        }
    }

    /* renamed from: R */
    public void m21346R(long j10) {
        boolean m19372Z;
        this.f19977A = j10;
        if (m21336H()) {
            this.f19999z = j10;
            return;
        }
        AbstractC5261a abstractC5261a = null;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f19991r.size()) {
                break;
            }
            AbstractC5261a abstractC5261a2 = this.f19991r.get(i11);
            long j11 = abstractC5261a2.f19972g;
            if (j11 == j10 && abstractC5261a2.f19938k == -9223372036854775807L) {
                abstractC5261a = abstractC5261a2;
                break;
            } else if (j11 > j10) {
                break;
            } else {
                i11++;
            }
        }
        if (abstractC5261a != null) {
            m19372Z = this.f19993t.m19371Y(abstractC5261a.m21300i(0));
        } else {
            m19372Z = this.f19993t.m19372Z(j10, j10 < mo4785b());
        }
        if (m19372Z) {
            this.f19978B = m21342N(this.f19993t.m19350C(), 0);
            C4867l0[] c4867l0Arr = this.f19994u;
            int length = c4867l0Arr.length;
            while (i10 < length) {
                c4867l0Arr[i10].m19372Z(j10, true);
                i10++;
            }
            return;
        }
        this.f19999z = j10;
        this.f19980D = false;
        this.f19991r.clear();
        this.f19978B = 0;
        if (!this.f19989p.m14803j()) {
            this.f19989p.m14801g();
            m21345Q();
            return;
        }
        this.f19993t.m19388r();
        C4867l0[] c4867l0Arr2 = this.f19994u;
        int length2 = c4867l0Arr2.length;
        while (i10 < length2) {
            c4867l0Arr2[i10].m19388r();
            i10++;
        }
        this.f19989p.m14800f();
    }

    /* renamed from: S */
    public C5269i<T>.a m21347S(long j10, int i10) {
        for (int i11 = 0; i11 < this.f19994u.length; i11++) {
            if (this.f19982i[i11] == i10) {
                C4014a.m15200f(!this.f19984k[i11]);
                this.f19984k[i11] = true;
                this.f19994u[i11].m19372Z(j10, true);
                return new a(this, this.f19994u[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // p290u4.InterfaceC4869m0
    /* renamed from: a */
    public void mo19250a() {
        this.f19989p.mo4756a();
        this.f19993t.m19360N();
        if (this.f19989p.m14803j()) {
            return;
        }
        this.f19985l.mo4804a();
    }

    @Override // p290u4.InterfaceC4871n0
    /* renamed from: b */
    public long mo4785b() {
        if (m21336H()) {
            return this.f19999z;
        }
        if (this.f19980D) {
            return Long.MIN_VALUE;
        }
        return m21333E().f19973h;
    }

    @Override // p290u4.InterfaceC4871n0
    /* renamed from: c */
    public boolean mo4786c(long j10) {
        List<AbstractC5261a> list;
        long j11;
        if (this.f19980D || this.f19989p.m14803j() || this.f19989p.m14802i()) {
            return false;
        }
        boolean m21336H = m21336H();
        if (m21336H) {
            list = Collections.emptyList();
            j11 = this.f19999z;
        } else {
            list = this.f19992s;
            j11 = m21333E().f19973h;
        }
        this.f19985l.mo4807g(j10, j11, list, this.f19990q);
        C5268h c5268h = this.f19990q;
        boolean z10 = c5268h.f19976b;
        AbstractC5266f abstractC5266f = c5268h.f19975a;
        c5268h.m21322a();
        if (z10) {
            this.f19999z = -9223372036854775807L;
            this.f19980D = true;
            return true;
        }
        if (abstractC5266f == null) {
            return false;
        }
        this.f19996w = abstractC5266f;
        if (m21335G(abstractC5266f)) {
            AbstractC5261a abstractC5261a = (AbstractC5261a) abstractC5266f;
            if (m21336H) {
                long j12 = abstractC5261a.f19972g;
                long j13 = this.f19999z;
                if (j12 != j13) {
                    this.f19993t.m19374b0(j13);
                    for (C4867l0 c4867l0 : this.f19994u) {
                        c4867l0.m19374b0(this.f19999z);
                    }
                }
                this.f19999z = -9223372036854775807L;
            }
            abstractC5261a.m21302k(this.f19995v);
            this.f19991r.add(abstractC5261a);
        } else if (abstractC5266f instanceof C5273m) {
            ((C5273m) abstractC5266f).m21358g(this.f19995v);
        }
        this.f19987n.m19219A(new C4870n(abstractC5266f.f19966a, abstractC5266f.f19967b, this.f19989p.m14807n(abstractC5266f, this, this.f19988o.mo14778d(abstractC5266f.f19968c))), abstractC5266f.f19968c, this.f19981h, abstractC5266f.f19969d, abstractC5266f.f19970e, abstractC5266f.f19971f, abstractC5266f.f19972g, abstractC5266f.f19973h);
        return true;
    }

    /* renamed from: d */
    public long m21348d(long j10, C4465m3 c4465m3) {
        return this.f19985l.mo4805d(j10, c4465m3);
    }

    @Override // p290u4.InterfaceC4869m0
    /* renamed from: e */
    public boolean mo19252e() {
        return !m21336H() && this.f19993t.m19358K(this.f19980D);
    }

    @Override // p290u4.InterfaceC4871n0
    /* renamed from: f */
    public long mo4789f() {
        if (this.f19980D) {
            return Long.MIN_VALUE;
        }
        if (m21336H()) {
            return this.f19999z;
        }
        long j10 = this.f19977A;
        AbstractC5261a m21333E = m21333E();
        if (!m21333E.mo21353h()) {
            if (this.f19991r.size() > 1) {
                m21333E = this.f19991r.get(r2.size() - 2);
            } else {
                m21333E = null;
            }
        }
        if (m21333E != null) {
            j10 = Math.max(j10, m21333E.f19973h);
        }
        return Math.max(j10, this.f19993t.m19396z());
    }

    @Override // p290u4.InterfaceC4871n0
    /* renamed from: g */
    public void mo4790g(long j10) {
        if (this.f19989p.m14802i() || m21336H()) {
            return;
        }
        if (!this.f19989p.m14803j()) {
            int mo4810j = this.f19985l.mo4810j(j10, this.f19992s);
            if (mo4810j < this.f19991r.size()) {
                m21330B(mo4810j);
                return;
            }
            return;
        }
        AbstractC5266f abstractC5266f = (AbstractC5266f) C4014a.m15199e(this.f19996w);
        if (!(m21335G(abstractC5266f) && m21334F(this.f19991r.size() - 1)) && this.f19985l.mo4806f(j10, abstractC5266f, this.f19992s)) {
            this.f19989p.m14800f();
            if (m21335G(abstractC5266f)) {
                this.f19979C = (AbstractC5261a) abstractC5266f;
            }
        }
    }

    @Override // p206o5.C3901e0.f
    /* renamed from: h */
    public void mo14819h() {
        this.f19993t.m19366T();
        for (C4867l0 c4867l0 : this.f19994u) {
            c4867l0.m19366T();
        }
        this.f19985l.release();
        b<T> bVar = this.f19998y;
        if (bVar != null) {
            bVar.mo4791h(this);
        }
    }

    @Override // p290u4.InterfaceC4871n0
    public boolean isLoading() {
        return this.f19989p.m14803j();
    }

    @Override // p290u4.InterfaceC4869m0
    /* renamed from: j */
    public int mo19253j(C4468n1 c4468n1, C5110g c5110g, int i10) {
        if (m21336H()) {
            return -3;
        }
        AbstractC5261a abstractC5261a = this.f19979C;
        if (abstractC5261a != null && abstractC5261a.m21300i(0) <= this.f19993t.m19350C()) {
            return -3;
        }
        m21337I();
        return this.f19993t.m19365S(c4468n1, c5110g, i10, this.f19980D);
    }

    @Override // p290u4.InterfaceC4869m0
    /* renamed from: n */
    public int mo19254n(long j10) {
        if (m21336H()) {
            return 0;
        }
        int m19352E = this.f19993t.m19352E(j10, this.f19980D);
        AbstractC5261a abstractC5261a = this.f19979C;
        if (abstractC5261a != null) {
            m19352E = Math.min(m19352E, abstractC5261a.m21300i(0) - this.f19993t.m19350C());
        }
        this.f19993t.m19377e0(m19352E);
        m21337I();
        return m19352E;
    }

    /* renamed from: t */
    public void m21349t(long j10, boolean z10) {
        if (m21336H()) {
            return;
        }
        int m19394x = this.f19993t.m19394x();
        this.f19993t.m19387q(j10, z10, true);
        int m19394x2 = this.f19993t.m19394x();
        if (m19394x2 > m19394x) {
            long m19395y = this.f19993t.m19395y();
            int i10 = 0;
            while (true) {
                C4867l0[] c4867l0Arr = this.f19994u;
                if (i10 >= c4867l0Arr.length) {
                    break;
                }
                c4867l0Arr[i10].m19387q(m19395y, z10, this.f19984k[i10]);
                i10++;
            }
        }
        m21329A(m19394x2);
    }
}
