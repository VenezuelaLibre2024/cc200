package p264s3;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3917m0;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.InterfaceC4040n;
import p264s3.C4494s2;
import p275t3.C4674s1;
import p275t3.InterfaceC4618a;
import p290u4.C4870n;
import p290u4.C4872o;
import p290u4.C4874p;
import p290u4.C4876q;
import p290u4.InterfaceC4845a0;
import p290u4.InterfaceC4873o0;
import p290u4.InterfaceC4878r;
import p290u4.InterfaceC4882t;
import p317w3.InterfaceC5255u;

/* renamed from: s3.s2 */
/* loaded from: classes.dex */
public final class C4494s2 {

    /* renamed from: a */
    public final C4674s1 f16669a;

    /* renamed from: e */
    public final d f16673e;

    /* renamed from: h */
    public final InterfaceC4618a f16676h;

    /* renamed from: i */
    public final InterfaceC4040n f16677i;

    /* renamed from: k */
    public boolean f16679k;

    /* renamed from: l */
    public InterfaceC3917m0 f16680l;

    /* renamed from: j */
    public InterfaceC4873o0 f16678j = new InterfaceC4873o0.a(0);

    /* renamed from: c */
    public final IdentityHashMap<InterfaceC4878r, c> f16671c = new IdentityHashMap<>();

    /* renamed from: d */
    public final Map<Object, c> f16672d = new HashMap();

    /* renamed from: b */
    public final List<c> f16670b = new ArrayList();

    /* renamed from: f */
    public final HashMap<c, b> f16674f = new HashMap<>();

    /* renamed from: g */
    public final Set<c> f16675g = new HashSet();

    /* renamed from: s3.s2$a */
    /* loaded from: classes.dex */
    public final class a implements InterfaceC4845a0, InterfaceC5255u {

        /* renamed from: a */
        public final c f16681a;

        public a(c cVar) {
            this.f16681a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public /* synthetic */ void m17565W(Pair pair, C4876q c4876q) {
            C4494s2.this.f16676h.mo17582H(((Integer) pair.first).intValue(), (InterfaceC4882t.b) pair.second, c4876q);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: X */
        public /* synthetic */ void m17566X(Pair pair) {
            C4494s2.this.f16676h.mo17586s(((Integer) pair.first).intValue(), (InterfaceC4882t.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Y */
        public /* synthetic */ void m17567Y(Pair pair) {
            C4494s2.this.f16676h.mo17578A(((Integer) pair.first).intValue(), (InterfaceC4882t.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: Z */
        public /* synthetic */ void m17568Z(Pair pair) {
            C4494s2.this.f16676h.mo17579E(((Integer) pair.first).intValue(), (InterfaceC4882t.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a0 */
        public /* synthetic */ void m17569a0(Pair pair, int i10) {
            C4494s2.this.f16676h.mo17581G(((Integer) pair.first).intValue(), (InterfaceC4882t.b) pair.second, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b0 */
        public /* synthetic */ void m17570b0(Pair pair, Exception exc) {
            C4494s2.this.f16676h.mo17580F(((Integer) pair.first).intValue(), (InterfaceC4882t.b) pair.second, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c0 */
        public /* synthetic */ void m17571c0(Pair pair) {
            C4494s2.this.f16676h.mo17587t(((Integer) pair.first).intValue(), (InterfaceC4882t.b) pair.second);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d0 */
        public /* synthetic */ void m17572d0(Pair pair, C4870n c4870n, C4876q c4876q) {
            C4494s2.this.f16676h.mo17584J(((Integer) pair.first).intValue(), (InterfaceC4882t.b) pair.second, c4870n, c4876q);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e0 */
        public /* synthetic */ void m17573e0(Pair pair, C4870n c4870n, C4876q c4876q) {
            C4494s2.this.f16676h.mo17588u(((Integer) pair.first).intValue(), (InterfaceC4882t.b) pair.second, c4870n, c4876q);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f0 */
        public /* synthetic */ void m17574f0(Pair pair, C4870n c4870n, C4876q c4876q, IOException iOException, boolean z10) {
            C4494s2.this.f16676h.mo17583I(((Integer) pair.first).intValue(), (InterfaceC4882t.b) pair.second, c4870n, c4876q, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g0 */
        public /* synthetic */ void m17575g0(Pair pair, C4870n c4870n, C4876q c4876q) {
            C4494s2.this.f16676h.mo17589y(((Integer) pair.first).intValue(), (InterfaceC4882t.b) pair.second, c4870n, c4876q);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h0 */
        public /* synthetic */ void m17576h0(Pair pair, C4876q c4876q) {
            C4494s2.this.f16676h.mo17590z(((Integer) pair.first).intValue(), (InterfaceC4882t.b) C4014a.m15199e((InterfaceC4882t.b) pair.second), c4876q);
        }

        @Override // p317w3.InterfaceC5255u
        /* renamed from: A */
        public void mo17578A(int i10, InterfaceC4882t.b bVar) {
            final Pair<Integer, InterfaceC4882t.b> m17585V = m17585V(i10, bVar);
            if (m17585V != null) {
                C4494s2.this.f16677i.mo15319b(new Runnable() { // from class: s3.k2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4494s2.a.this.m17567Y(m17585V);
                    }
                });
            }
        }

        @Override // p317w3.InterfaceC5255u
        /* renamed from: E */
        public void mo17579E(int i10, InterfaceC4882t.b bVar) {
            final Pair<Integer, InterfaceC4882t.b> m17585V = m17585V(i10, bVar);
            if (m17585V != null) {
                C4494s2.this.f16677i.mo15319b(new Runnable() { // from class: s3.l2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4494s2.a.this.m17568Z(m17585V);
                    }
                });
            }
        }

        @Override // p317w3.InterfaceC5255u
        /* renamed from: F */
        public void mo17580F(int i10, InterfaceC4882t.b bVar, final Exception exc) {
            final Pair<Integer, InterfaceC4882t.b> m17585V = m17585V(i10, bVar);
            if (m17585V != null) {
                C4494s2.this.f16677i.mo15319b(new Runnable() { // from class: s3.n2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4494s2.a.this.m17570b0(m17585V, exc);
                    }
                });
            }
        }

        @Override // p317w3.InterfaceC5255u
        /* renamed from: G */
        public void mo17581G(int i10, InterfaceC4882t.b bVar, final int i11) {
            final Pair<Integer, InterfaceC4882t.b> m17585V = m17585V(i10, bVar);
            if (m17585V != null) {
                C4494s2.this.f16677i.mo15319b(new Runnable() { // from class: s3.m2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4494s2.a.this.m17569a0(m17585V, i11);
                    }
                });
            }
        }

        @Override // p290u4.InterfaceC4845a0
        /* renamed from: H */
        public void mo17582H(int i10, InterfaceC4882t.b bVar, final C4876q c4876q) {
            final Pair<Integer, InterfaceC4882t.b> m17585V = m17585V(i10, bVar);
            if (m17585V != null) {
                C4494s2.this.f16677i.mo15319b(new Runnable() { // from class: s3.h2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4494s2.a.this.m17565W(m17585V, c4876q);
                    }
                });
            }
        }

        @Override // p290u4.InterfaceC4845a0
        /* renamed from: I */
        public void mo17583I(int i10, InterfaceC4882t.b bVar, final C4870n c4870n, final C4876q c4876q, final IOException iOException, final boolean z10) {
            final Pair<Integer, InterfaceC4882t.b> m17585V = m17585V(i10, bVar);
            if (m17585V != null) {
                C4494s2.this.f16677i.mo15319b(new Runnable() { // from class: s3.r2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4494s2.a.this.m17574f0(m17585V, c4870n, c4876q, iOException, z10);
                    }
                });
            }
        }

        @Override // p290u4.InterfaceC4845a0
        /* renamed from: J */
        public void mo17584J(int i10, InterfaceC4882t.b bVar, final C4870n c4870n, final C4876q c4876q) {
            final Pair<Integer, InterfaceC4882t.b> m17585V = m17585V(i10, bVar);
            if (m17585V != null) {
                C4494s2.this.f16677i.mo15319b(new Runnable() { // from class: s3.q2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4494s2.a.this.m17572d0(m17585V, c4870n, c4876q);
                    }
                });
            }
        }

        /* renamed from: V */
        public final Pair<Integer, InterfaceC4882t.b> m17585V(int i10, InterfaceC4882t.b bVar) {
            InterfaceC4882t.b bVar2 = null;
            if (bVar != null) {
                InterfaceC4882t.b m17530n = C4494s2.m17530n(this.f16681a, bVar);
                if (m17530n == null) {
                    return null;
                }
                bVar2 = m17530n;
            }
            return Pair.create(Integer.valueOf(C4494s2.m17533r(this.f16681a, i10)), bVar2);
        }

        @Override // p317w3.InterfaceC5255u
        /* renamed from: s */
        public void mo17586s(int i10, InterfaceC4882t.b bVar) {
            final Pair<Integer, InterfaceC4882t.b> m17585V = m17585V(i10, bVar);
            if (m17585V != null) {
                C4494s2.this.f16677i.mo15319b(new Runnable() { // from class: s3.j2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4494s2.a.this.m17566X(m17585V);
                    }
                });
            }
        }

        @Override // p317w3.InterfaceC5255u
        /* renamed from: t */
        public void mo17587t(int i10, InterfaceC4882t.b bVar) {
            final Pair<Integer, InterfaceC4882t.b> m17585V = m17585V(i10, bVar);
            if (m17585V != null) {
                C4494s2.this.f16677i.mo15319b(new Runnable() { // from class: s3.g2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4494s2.a.this.m17571c0(m17585V);
                    }
                });
            }
        }

        @Override // p290u4.InterfaceC4845a0
        /* renamed from: u */
        public void mo17588u(int i10, InterfaceC4882t.b bVar, final C4870n c4870n, final C4876q c4876q) {
            final Pair<Integer, InterfaceC4882t.b> m17585V = m17585V(i10, bVar);
            if (m17585V != null) {
                C4494s2.this.f16677i.mo15319b(new Runnable() { // from class: s3.p2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4494s2.a.this.m17573e0(m17585V, c4870n, c4876q);
                    }
                });
            }
        }

        @Override // p290u4.InterfaceC4845a0
        /* renamed from: y */
        public void mo17589y(int i10, InterfaceC4882t.b bVar, final C4870n c4870n, final C4876q c4876q) {
            final Pair<Integer, InterfaceC4882t.b> m17585V = m17585V(i10, bVar);
            if (m17585V != null) {
                C4494s2.this.f16677i.mo15319b(new Runnable() { // from class: s3.o2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4494s2.a.this.m17575g0(m17585V, c4870n, c4876q);
                    }
                });
            }
        }

        @Override // p290u4.InterfaceC4845a0
        /* renamed from: z */
        public void mo17590z(int i10, InterfaceC4882t.b bVar, final C4876q c4876q) {
            final Pair<Integer, InterfaceC4882t.b> m17585V = m17585V(i10, bVar);
            if (m17585V != null) {
                C4494s2.this.f16677i.mo15319b(new Runnable() { // from class: s3.i2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4494s2.a.this.m17576h0(m17585V, c4876q);
                    }
                });
            }
        }
    }

    /* renamed from: s3.s2$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC4882t f16683a;

        /* renamed from: b */
        public final InterfaceC4882t.c f16684b;

        /* renamed from: c */
        public final a f16685c;

        public b(InterfaceC4882t interfaceC4882t, InterfaceC4882t.c cVar, a aVar) {
            this.f16683a = interfaceC4882t;
            this.f16684b = cVar;
            this.f16685c = aVar;
        }
    }

    /* renamed from: s3.s2$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC4424e2 {

        /* renamed from: a */
        public final C4874p f16686a;

        /* renamed from: d */
        public int f16689d;

        /* renamed from: e */
        public boolean f16690e;

        /* renamed from: c */
        public final List<InterfaceC4882t.b> f16688c = new ArrayList();

        /* renamed from: b */
        public final Object f16687b = new Object();

        public c(InterfaceC4882t interfaceC4882t, boolean z10) {
            this.f16686a = new C4874p(interfaceC4882t, z10);
        }

        /* renamed from: a */
        public void m17591a(int i10) {
            this.f16689d = i10;
            this.f16690e = false;
            this.f16688c.clear();
        }

        @Override // p264s3.InterfaceC4424e2
        /* renamed from: b */
        public Object mo17179b() {
            return this.f16687b;
        }

        @Override // p264s3.InterfaceC4424e2
        /* renamed from: c */
        public AbstractC4505u3 mo17180c() {
            return this.f16686a.m19424Z();
        }
    }

    /* renamed from: s3.s2$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: d */
        void mo17294d();
    }

    public C4494s2(d dVar, InterfaceC4618a interfaceC4618a, InterfaceC4040n interfaceC4040n, C4674s1 c4674s1) {
        this.f16669a = c4674s1;
        this.f16673e = dVar;
        this.f16676h = interfaceC4618a;
        this.f16677i = interfaceC4040n;
    }

    /* renamed from: m */
    public static Object m17529m(Object obj) {
        return AbstractC4399a.m17018z(obj);
    }

    /* renamed from: n */
    public static InterfaceC4882t.b m17530n(c cVar, InterfaceC4882t.b bVar) {
        for (int i10 = 0; i10 < cVar.f16688c.size(); i10++) {
            if (cVar.f16688c.get(i10).f18460d == bVar.f18460d) {
                return bVar.m19449c(m17532p(cVar, bVar.f18457a));
            }
        }
        return null;
    }

    /* renamed from: o */
    public static Object m17531o(Object obj) {
        return AbstractC4399a.m17016A(obj);
    }

    /* renamed from: p */
    public static Object m17532p(c cVar, Object obj) {
        return AbstractC4399a.m17017C(cVar.f16687b, obj);
    }

    /* renamed from: r */
    public static int m17533r(c cVar, int i10) {
        return i10 + cVar.f16689d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m17534t(InterfaceC4882t interfaceC4882t, AbstractC4505u3 abstractC4505u3) {
        this.f16673e.mo17294d();
    }

    /* renamed from: A */
    public AbstractC4505u3 m17535A(int i10, int i11, InterfaceC4873o0 interfaceC4873o0) {
        C4014a.m15195a(i10 >= 0 && i10 <= i11 && i11 <= m17546q());
        this.f16678j = interfaceC4873o0;
        m17536B(i10, i11);
        return m17542i();
    }

    /* renamed from: B */
    public final void m17536B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c remove = this.f16670b.remove(i12);
            this.f16672d.remove(remove.f16687b);
            m17540g(i12, -remove.f16686a.m19424Z().mo4748t());
            remove.f16690e = true;
            if (this.f16679k) {
                m17548u(remove);
            }
        }
    }

    /* renamed from: C */
    public AbstractC4505u3 m17537C(List<c> list, InterfaceC4873o0 interfaceC4873o0) {
        m17536B(0, this.f16670b.size());
        return m17539f(this.f16670b.size(), list, interfaceC4873o0);
    }

    /* renamed from: D */
    public AbstractC4505u3 m17538D(InterfaceC4873o0 interfaceC4873o0) {
        int m17546q = m17546q();
        if (interfaceC4873o0.mo19409b() != m17546q) {
            interfaceC4873o0 = interfaceC4873o0.mo19416i().mo19414g(0, m17546q);
        }
        this.f16678j = interfaceC4873o0;
        return m17542i();
    }

    /* renamed from: f */
    public AbstractC4505u3 m17539f(int i10, List<c> list, InterfaceC4873o0 interfaceC4873o0) {
        int i11;
        if (!list.isEmpty()) {
            this.f16678j = interfaceC4873o0;
            for (int i12 = i10; i12 < list.size() + i10; i12++) {
                c cVar = list.get(i12 - i10);
                if (i12 > 0) {
                    c cVar2 = this.f16670b.get(i12 - 1);
                    i11 = cVar2.f16689d + cVar2.f16686a.m19424Z().mo4748t();
                } else {
                    i11 = 0;
                }
                cVar.m17591a(i11);
                m17540g(i12, cVar.f16686a.m19424Z().mo4748t());
                this.f16670b.add(i12, cVar);
                this.f16672d.put(cVar.f16687b, cVar);
                if (this.f16679k) {
                    m17551x(cVar);
                    if (this.f16671c.isEmpty()) {
                        this.f16675g.add(cVar);
                    } else {
                        m17543j(cVar);
                    }
                }
            }
        }
        return m17542i();
    }

    /* renamed from: g */
    public final void m17540g(int i10, int i11) {
        while (i10 < this.f16670b.size()) {
            this.f16670b.get(i10).f16689d += i11;
            i10++;
        }
    }

    /* renamed from: h */
    public InterfaceC4878r m17541h(InterfaceC4882t.b bVar, InterfaceC3894b interfaceC3894b, long j10) {
        Object m17531o = m17531o(bVar.f18457a);
        InterfaceC4882t.b m19449c = bVar.m19449c(m17529m(bVar.f18457a));
        c cVar = (c) C4014a.m15199e(this.f16672d.get(m17531o));
        m17545l(cVar);
        cVar.f16688c.add(m19449c);
        C4872o mo4727b = cVar.f16686a.mo4727b(m19449c, interfaceC3894b, j10);
        this.f16671c.put(mo4727b, cVar);
        m17544k();
        return mo4727b;
    }

    /* renamed from: i */
    public AbstractC4505u3 m17542i() {
        if (this.f16670b.isEmpty()) {
            return AbstractC4505u3.f16821h;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f16670b.size(); i11++) {
            c cVar = this.f16670b.get(i11);
            cVar.f16689d = i10;
            i10 += cVar.f16686a.m19424Z().mo4748t();
        }
        return new C4430f3(this.f16670b, this.f16678j);
    }

    /* renamed from: j */
    public final void m17543j(c cVar) {
        b bVar = this.f16674f.get(cVar);
        if (bVar != null) {
            bVar.f16683a.mo19199s(bVar.f16684b);
        }
    }

    /* renamed from: k */
    public final void m17544k() {
        Iterator<c> it = this.f16675g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f16688c.isEmpty()) {
                m17543j(next);
                it.remove();
            }
        }
    }

    /* renamed from: l */
    public final void m17545l(c cVar) {
        this.f16675g.add(cVar);
        b bVar = this.f16674f.get(cVar);
        if (bVar != null) {
            bVar.f16683a.mo19194e(bVar.f16684b);
        }
    }

    /* renamed from: q */
    public int m17546q() {
        return this.f16670b.size();
    }

    /* renamed from: s */
    public boolean m17547s() {
        return this.f16679k;
    }

    /* renamed from: u */
    public final void m17548u(c cVar) {
        if (cVar.f16690e && cVar.f16688c.isEmpty()) {
            b bVar = (b) C4014a.m15199e(this.f16674f.remove(cVar));
            bVar.f16683a.mo19198q(bVar.f16684b);
            bVar.f16683a.mo19196m(bVar.f16685c);
            bVar.f16683a.mo19197n(bVar.f16685c);
            this.f16675g.remove(cVar);
        }
    }

    /* renamed from: v */
    public AbstractC4505u3 m17549v(int i10, int i11, int i12, InterfaceC4873o0 interfaceC4873o0) {
        C4014a.m15195a(i10 >= 0 && i10 <= i11 && i11 <= m17546q() && i12 >= 0);
        this.f16678j = interfaceC4873o0;
        if (i10 == i11 || i10 == i12) {
            return m17542i();
        }
        int min = Math.min(i10, i12);
        int max = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int i13 = this.f16670b.get(min).f16689d;
        C4041n0.m15394A0(this.f16670b, i10, i11, i12);
        while (min <= max) {
            c cVar = this.f16670b.get(min);
            cVar.f16689d = i13;
            i13 += cVar.f16686a.m19424Z().mo4748t();
            min++;
        }
        return m17542i();
    }

    /* renamed from: w */
    public void m17550w(InterfaceC3917m0 interfaceC3917m0) {
        C4014a.m15200f(!this.f16679k);
        this.f16680l = interfaceC3917m0;
        for (int i10 = 0; i10 < this.f16670b.size(); i10++) {
            c cVar = this.f16670b.get(i10);
            m17551x(cVar);
            this.f16675g.add(cVar);
        }
        this.f16679k = true;
    }

    /* renamed from: x */
    public final void m17551x(c cVar) {
        C4874p c4874p = cVar.f16686a;
        InterfaceC4882t.c cVar2 = new InterfaceC4882t.c() { // from class: s3.f2
            @Override // p290u4.InterfaceC4882t.c
            /* renamed from: a */
            public final void mo17221a(InterfaceC4882t interfaceC4882t, AbstractC4505u3 abstractC4505u3) {
                C4494s2.this.m17534t(interfaceC4882t, abstractC4505u3);
            }
        };
        a aVar = new a(cVar);
        this.f16674f.put(cVar, new b(c4874p, cVar2, aVar));
        c4874p.mo19195i(C4041n0.m15493y(), aVar);
        c4874p.mo19192c(C4041n0.m15493y(), aVar);
        c4874p.mo19193d(cVar2, this.f16680l, this.f16669a);
    }

    /* renamed from: y */
    public void m17552y() {
        for (b bVar : this.f16674f.values()) {
            try {
                bVar.f16683a.mo19198q(bVar.f16684b);
            } catch (RuntimeException e10) {
                C4046r.m15524d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f16683a.mo19196m(bVar.f16685c);
            bVar.f16683a.mo19197n(bVar.f16685c);
        }
        this.f16674f.clear();
        this.f16675g.clear();
        this.f16679k = false;
    }

    /* renamed from: z */
    public void m17553z(InterfaceC4878r interfaceC4878r) {
        c cVar = (c) C4014a.m15199e(this.f16671c.remove(interfaceC4878r));
        cVar.f16686a.mo4725a(interfaceC4878r);
        cVar.f16688c.remove(((C4872o) interfaceC4878r).f18407h);
        if (!this.f16671c.isEmpty()) {
            m17544k();
        }
        m17548u(cVar);
    }
}
