package p290u4;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import p206o5.InterfaceC3917m0;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.AbstractC4505u3;
import p290u4.InterfaceC4845a0;
import p290u4.InterfaceC4882t;
import p317w3.InterfaceC5255u;

/* renamed from: u4.f */
/* loaded from: classes.dex */
public abstract class AbstractC4854f<T> extends AbstractC4844a {

    /* renamed from: o */
    public final HashMap<T, b<T>> f18236o = new HashMap<>();

    /* renamed from: p */
    public Handler f18237p;

    /* renamed from: q */
    public InterfaceC3917m0 f18238q;

    /* renamed from: u4.f$a */
    /* loaded from: classes.dex */
    public final class a implements InterfaceC4845a0, InterfaceC5255u {

        /* renamed from: a */
        public final T f18239a;

        /* renamed from: b */
        public InterfaceC4845a0.a f18240b;

        /* renamed from: c */
        public InterfaceC5255u.a f18241c;

        public a(T t10) {
            this.f18240b = AbstractC4854f.this.m19203w(null);
            this.f18241c = AbstractC4854f.this.m19201u(null);
            this.f18239a = t10;
        }

        @Override // p317w3.InterfaceC5255u
        /* renamed from: A */
        public void mo17578A(int i10, InterfaceC4882t.b bVar) {
            if (m19263v(i10, bVar)) {
                this.f18241c.m21285i();
            }
        }

        @Override // p317w3.InterfaceC5255u
        /* renamed from: E */
        public void mo17579E(int i10, InterfaceC4882t.b bVar) {
            if (m19263v(i10, bVar)) {
                this.f18241c.m21286j();
            }
        }

        @Override // p317w3.InterfaceC5255u
        /* renamed from: F */
        public void mo17580F(int i10, InterfaceC4882t.b bVar, Exception exc) {
            if (m19263v(i10, bVar)) {
                this.f18241c.m21288l(exc);
            }
        }

        @Override // p317w3.InterfaceC5255u
        /* renamed from: G */
        public void mo17581G(int i10, InterfaceC4882t.b bVar, int i11) {
            if (m19263v(i10, bVar)) {
                this.f18241c.m21287k(i11);
            }
        }

        @Override // p290u4.InterfaceC4845a0
        /* renamed from: H */
        public void mo17582H(int i10, InterfaceC4882t.b bVar, C4876q c4876q) {
            if (m19263v(i10, bVar)) {
                this.f18240b.m19228j(m19262K(c4876q));
            }
        }

        @Override // p290u4.InterfaceC4845a0
        /* renamed from: I */
        public void mo17583I(int i10, InterfaceC4882t.b bVar, C4870n c4870n, C4876q c4876q, IOException iOException, boolean z10) {
            if (m19263v(i10, bVar)) {
                this.f18240b.m19237y(c4870n, m19262K(c4876q), iOException, z10);
            }
        }

        @Override // p290u4.InterfaceC4845a0
        /* renamed from: J */
        public void mo17584J(int i10, InterfaceC4882t.b bVar, C4870n c4870n, C4876q c4876q) {
            if (m19263v(i10, bVar)) {
                this.f18240b.m19231s(c4870n, m19262K(c4876q));
            }
        }

        /* renamed from: K */
        public final C4876q m19262K(C4876q c4876q) {
            long mo19258H = AbstractC4854f.this.mo19258H(this.f18239a, c4876q.f18451f);
            long mo19258H2 = AbstractC4854f.this.mo19258H(this.f18239a, c4876q.f18452g);
            return (mo19258H == c4876q.f18451f && mo19258H2 == c4876q.f18452g) ? c4876q : new C4876q(c4876q.f18446a, c4876q.f18447b, c4876q.f18448c, c4876q.f18449d, c4876q.f18450e, mo19258H, mo19258H2);
        }

        @Override // p317w3.InterfaceC5255u
        /* renamed from: s */
        public void mo17586s(int i10, InterfaceC4882t.b bVar) {
            if (m19263v(i10, bVar)) {
                this.f18241c.m21284h();
            }
        }

        @Override // p317w3.InterfaceC5255u
        /* renamed from: t */
        public void mo17587t(int i10, InterfaceC4882t.b bVar) {
            if (m19263v(i10, bVar)) {
                this.f18241c.m21289m();
            }
        }

        @Override // p290u4.InterfaceC4845a0
        /* renamed from: u */
        public void mo17588u(int i10, InterfaceC4882t.b bVar, C4870n c4870n, C4876q c4876q) {
            if (m19263v(i10, bVar)) {
                this.f18240b.m19234v(c4870n, m19262K(c4876q));
            }
        }

        /* renamed from: v */
        public final boolean m19263v(int i10, InterfaceC4882t.b bVar) {
            InterfaceC4882t.b bVar2;
            if (bVar != null) {
                bVar2 = AbstractC4854f.this.mo19257G(this.f18239a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int mo19259I = AbstractC4854f.this.mo19259I(this.f18239a, i10);
            InterfaceC4845a0.a aVar = this.f18240b;
            if (aVar.f18213a != mo19259I || !C4041n0.m15449c(aVar.f18214b, bVar2)) {
                this.f18240b = AbstractC4854f.this.m19202v(mo19259I, bVar2, 0L);
            }
            InterfaceC5255u.a aVar2 = this.f18241c;
            if (aVar2.f19929a == mo19259I && C4041n0.m15449c(aVar2.f19930b, bVar2)) {
                return true;
            }
            this.f18241c = AbstractC4854f.this.m19200t(mo19259I, bVar2);
            return true;
        }

        @Override // p290u4.InterfaceC4845a0
        /* renamed from: y */
        public void mo17589y(int i10, InterfaceC4882t.b bVar, C4870n c4870n, C4876q c4876q) {
            if (m19263v(i10, bVar)) {
                this.f18240b.m19220B(c4870n, m19262K(c4876q));
            }
        }

        @Override // p290u4.InterfaceC4845a0
        /* renamed from: z */
        public void mo17590z(int i10, InterfaceC4882t.b bVar, C4876q c4876q) {
            if (m19263v(i10, bVar)) {
                this.f18240b.m19223E(m19262K(c4876q));
            }
        }
    }

    /* renamed from: u4.f$b */
    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: a */
        public final InterfaceC4882t f18243a;

        /* renamed from: b */
        public final InterfaceC4882t.c f18244b;

        /* renamed from: c */
        public final AbstractC4854f<T>.a f18245c;

        public b(InterfaceC4882t interfaceC4882t, InterfaceC4882t.c cVar, AbstractC4854f<T>.a aVar) {
            this.f18243a = interfaceC4882t;
            this.f18244b = cVar;
            this.f18245c = aVar;
        }
    }

    @Override // p290u4.AbstractC4844a
    /* renamed from: C */
    public void mo4714C(InterfaceC3917m0 interfaceC3917m0) {
        this.f18238q = interfaceC3917m0;
        this.f18237p = C4041n0.m15489w();
    }

    @Override // p290u4.AbstractC4844a
    /* renamed from: E */
    public void mo4715E() {
        for (b<T> bVar : this.f18236o.values()) {
            bVar.f18243a.mo19198q(bVar.f18244b);
            bVar.f18243a.mo19196m(bVar.f18245c);
            bVar.f18243a.mo19197n(bVar.f18245c);
        }
        this.f18236o.clear();
    }

    /* renamed from: G */
    public abstract InterfaceC4882t.b mo19257G(T t10, InterfaceC4882t.b bVar);

    /* renamed from: H */
    public abstract long mo19258H(T t10, long j10);

    /* renamed from: I */
    public abstract int mo19259I(T t10, int i10);

    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public abstract void m19256J(T t10, InterfaceC4882t interfaceC4882t, AbstractC4505u3 abstractC4505u3);

    /* renamed from: L */
    public final void m19261L(final T t10, InterfaceC4882t interfaceC4882t) {
        C4014a.m15195a(!this.f18236o.containsKey(t10));
        InterfaceC4882t.c cVar = new InterfaceC4882t.c() { // from class: u4.e
            @Override // p290u4.InterfaceC4882t.c
            /* renamed from: a */
            public final void mo17221a(InterfaceC4882t interfaceC4882t2, AbstractC4505u3 abstractC4505u3) {
                AbstractC4854f.this.m19256J(t10, interfaceC4882t2, abstractC4505u3);
            }
        };
        a aVar = new a(t10);
        this.f18236o.put(t10, new b<>(interfaceC4882t, cVar, aVar));
        interfaceC4882t.mo19195i((Handler) C4014a.m15199e(this.f18237p), aVar);
        interfaceC4882t.mo19192c((Handler) C4014a.m15199e(this.f18237p), aVar);
        interfaceC4882t.mo19193d(cVar, this.f18238q, m19189A());
        if (m19190B()) {
            return;
        }
        interfaceC4882t.mo19199s(cVar);
    }

    @Override // p290u4.AbstractC4844a
    /* renamed from: y */
    public void mo19205y() {
        for (b<T> bVar : this.f18236o.values()) {
            bVar.f18243a.mo19199s(bVar.f18244b);
        }
    }

    @Override // p290u4.AbstractC4844a
    /* renamed from: z */
    public void mo19206z() {
        for (b<T> bVar : this.f18236o.values()) {
            bVar.f18243a.mo19194e(bVar.f18244b);
        }
    }
}
