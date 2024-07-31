package p174le;

import gd.C2245s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ke.InterfaceC3387b;
import p038ce.C1080o;
import p038ce.C1084p;
import p038ce.C1092r;
import p038ce.C1101t0;
import p038ce.C1105u0;
import p038ce.InterfaceC1062j3;
import p038ce.InterfaceC1076n;
import p116he.AbstractC2532i0;
import p116he.C2538l0;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p161kd.C3384b;
import p161kd.C3385c;
import p173ld.C3474h;
import sd.InterfaceC4580l;
import sd.InterfaceC4585q;
import td.AbstractC4754n;

/* renamed from: le.b */
/* loaded from: classes2.dex */
public class C3480b extends C3482d implements InterfaceC3479a {

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater f12186i = AtomicReferenceFieldUpdater.newUpdater(C3480b.class, Object.class, "owner");

    /* renamed from: h */
    public final InterfaceC4585q<InterfaceC3387b<?>, Object, Object, InterfaceC4580l<Throwable, C2245s>> f12187h;
    private volatile Object owner;

    /* renamed from: le.b$a */
    /* loaded from: classes2.dex */
    public final class a implements InterfaceC1076n<C2245s>, InterfaceC1062j3 {

        /* renamed from: h */
        public final C1084p<C2245s> f12188h;

        /* renamed from: i */
        public final Object f12189i;

        /* renamed from: le.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C6193a extends AbstractC4754n implements InterfaceC4580l<Throwable, C2245s> {

            /* renamed from: h */
            public final /* synthetic */ C3480b f12191h;

            /* renamed from: i */
            public final /* synthetic */ a f12192i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6193a(C3480b c3480b, a aVar) {
                super(1);
                this.f12191h = c3480b;
                this.f12192i = aVar;
            }

            /* renamed from: a */
            public final void m12942a(Throwable th) {
                this.f12191h.mo12932c(this.f12192i.f12189i);
            }

            @Override // sd.InterfaceC4580l
            public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
                m12942a(th);
                return C2245s.f8873a;
            }
        }

        /* renamed from: le.b$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC4754n implements InterfaceC4580l<Throwable, C2245s> {

            /* renamed from: h */
            public final /* synthetic */ C3480b f12193h;

            /* renamed from: i */
            public final /* synthetic */ a f12194i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3480b c3480b, a aVar) {
                super(1);
                this.f12193h = c3480b;
                this.f12194i = aVar;
            }

            /* renamed from: a */
            public final void m12943a(Throwable th) {
                C2538l0 c2538l0;
                C3480b c3480b = this.f12193h;
                a aVar = this.f12194i;
                if (C1101t0.m4573a()) {
                    Object obj = C3480b.f12186i.get(c3480b);
                    c2538l0 = C3481c.f12198a;
                    if (!(obj == c2538l0 || obj == aVar.f12189i)) {
                        throw new AssertionError();
                    }
                }
                C3480b.f12186i.set(this.f12193h, this.f12194i.f12189i);
                this.f12193h.mo12932c(this.f12194i.f12189i);
            }

            @Override // sd.InterfaceC4580l
            public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
                m12943a(th);
                return C2245s.f8873a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(C1084p<? super C2245s> c1084p, Object obj) {
            this.f12188h = c1084p;
            this.f12189i = obj;
        }

        @Override // p038ce.InterfaceC1076n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo4489g(C2245s c2245s, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
            C2538l0 c2538l0;
            C3480b c3480b = C3480b.this;
            if (C1101t0.m4573a()) {
                Object obj = C3480b.f12186i.get(c3480b);
                c2538l0 = C3481c.f12198a;
                if (!(obj == c2538l0)) {
                    throw new AssertionError();
                }
            }
            C3480b.f12186i.set(C3480b.this, this.f12189i);
            this.f12188h.mo4489g(c2245s, new C6193a(C3480b.this, this));
        }

        @Override // p038ce.InterfaceC1076n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object mo4487e(C2245s c2245s, Object obj, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
            C2538l0 c2538l0;
            C2538l0 c2538l02;
            C3480b c3480b = C3480b.this;
            if (C1101t0.m4573a()) {
                Object obj2 = C3480b.f12186i.get(c3480b);
                c2538l02 = C3481c.f12198a;
                if (!(obj2 == c2538l02)) {
                    throw new AssertionError();
                }
            }
            Object mo4487e = this.f12188h.mo4487e(c2245s, obj, new b(C3480b.this, this));
            if (mo4487e != null) {
                C3480b c3480b2 = C3480b.this;
                if (C1101t0.m4573a()) {
                    Object obj3 = C3480b.f12186i.get(c3480b2);
                    c2538l0 = C3481c.f12198a;
                    if (!(obj3 == c2538l0)) {
                        throw new AssertionError();
                    }
                }
                C3480b.f12186i.set(C3480b.this, this.f12189i);
            }
            return mo4487e;
        }

        @Override // p038ce.InterfaceC1076n
        /* renamed from: c */
        public void mo4486c(InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l) {
            this.f12188h.mo4486c(interfaceC4580l);
        }

        @Override // p038ce.InterfaceC1076n
        /* renamed from: f */
        public Object mo4488f(Throwable th) {
            return this.f12188h.mo4488f(th);
        }

        @Override // p146jd.InterfaceC3281d
        public InterfaceC3284g getContext() {
            return this.f12188h.getContext();
        }

        @Override // p038ce.InterfaceC1076n
        /* renamed from: h */
        public boolean mo4490h(Throwable th) {
            return this.f12188h.mo4490h(th);
        }

        @Override // p038ce.InterfaceC1062j3
        /* renamed from: j */
        public void mo4453j(AbstractC2532i0<?> abstractC2532i0, int i10) {
            this.f12188h.mo4453j(abstractC2532i0, i10);
        }

        @Override // p038ce.InterfaceC1076n
        /* renamed from: k */
        public boolean mo4491k() {
            return this.f12188h.mo4491k();
        }

        @Override // p038ce.InterfaceC1076n
        /* renamed from: m */
        public void mo4492m(Object obj) {
            this.f12188h.mo4492m(obj);
        }

        @Override // p146jd.InterfaceC3281d
        public void resumeWith(Object obj) {
            this.f12188h.resumeWith(obj);
        }
    }

    /* renamed from: le.b$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC4754n implements InterfaceC4585q<InterfaceC3387b<?>, Object, Object, InterfaceC4580l<? super Throwable, ? extends C2245s>> {

        /* renamed from: le.b$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC4754n implements InterfaceC4580l<Throwable, C2245s> {

            /* renamed from: h */
            public final /* synthetic */ C3480b f12196h;

            /* renamed from: i */
            public final /* synthetic */ Object f12197i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3480b c3480b, Object obj) {
                super(1);
                this.f12196h = c3480b;
                this.f12197i = obj;
            }

            /* renamed from: a */
            public final void m12945a(Throwable th) {
                this.f12196h.mo12932c(this.f12197i);
            }

            @Override // sd.InterfaceC4580l
            public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
                m12945a(th);
                return C2245s.f8873a;
            }
        }

        public b() {
            super(3);
        }

        @Override // sd.InterfaceC4585q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4580l<Throwable, C2245s> mo7159b(InterfaceC3387b<?> interfaceC3387b, Object obj, Object obj2) {
            return new a(C3480b.this, obj);
        }
    }

    public C3480b(boolean z10) {
        super(1, z10 ? 1 : 0);
        this.owner = z10 ? null : C3481c.f12198a;
        this.f12187h = new b();
    }

    /* renamed from: o */
    public static /* synthetic */ Object m12935o(C3480b c3480b, Object obj, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        Object m12937p;
        return (!c3480b.m12938q(obj) && (m12937p = c3480b.m12937p(obj, interfaceC3281d)) == C3385c.m12581c()) ? m12937p : C2245s.f8873a;
    }

    @Override // p174le.InterfaceC3479a
    /* renamed from: a */
    public boolean mo12930a() {
        return m12953h() == 0;
    }

    @Override // p174le.InterfaceC3479a
    /* renamed from: b */
    public Object mo12931b(Object obj, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        return m12935o(this, obj, interfaceC3281d);
    }

    @Override // p174le.InterfaceC3479a
    /* renamed from: c */
    public void mo12932c(Object obj) {
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        while (mo12930a()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12186i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            c2538l0 = C3481c.f12198a;
            if (obj2 != c2538l0) {
                if (!(obj2 == obj || obj == null)) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                c2538l02 = C3481c.f12198a;
                if (C1080o.m4523a(atomicReferenceFieldUpdater, this, obj2, c2538l02)) {
                    m12954i();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    /* renamed from: n */
    public final int m12936n(Object obj) {
        C2538l0 c2538l0;
        while (mo12930a()) {
            Object obj2 = f12186i.get(this);
            c2538l0 = C3481c.f12198a;
            if (obj2 != c2538l0) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    /* renamed from: p */
    public final Object m12937p(Object obj, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        C1084p m4566b = C1092r.m4566b(C3384b.m12580b(interfaceC3281d));
        try {
            m12949d(new a(m4566b, obj));
            Object m4553y = m4566b.m4553y();
            if (m4553y == C3385c.m12581c()) {
                C3474h.m12927c(interfaceC3281d);
            }
            return m4553y == C3385c.m12581c() ? m4553y : C2245s.f8873a;
        } catch (Throwable th) {
            m4566b.m4537J();
            throw th;
        }
    }

    /* renamed from: q */
    public boolean m12938q(Object obj) {
        int m12939r = m12939r(obj);
        if (m12939r == 0) {
            return true;
        }
        if (m12939r == 1) {
            return false;
        }
        if (m12939r != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    /* renamed from: r */
    public final int m12939r(Object obj) {
        C2538l0 c2538l0;
        int m12936n;
        do {
            if (m12955j()) {
                if (C1101t0.m4573a()) {
                    Object obj2 = f12186i.get(this);
                    c2538l0 = C3481c.f12198a;
                    if (!(obj2 == c2538l0)) {
                        throw new AssertionError();
                    }
                }
                f12186i.set(this, obj);
                return 0;
            }
            if (obj == null) {
                return 1;
            }
            m12936n = m12936n(obj);
            if (m12936n == 1) {
                return 2;
            }
        } while (m12936n != 2);
        return 1;
    }

    public String toString() {
        return "Mutex@" + C1105u0.m4581b(this) + "[isLocked=" + mo12930a() + ",owner=" + f12186i.get(this) + ']';
    }
}
