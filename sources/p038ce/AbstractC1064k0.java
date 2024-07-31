package p038ce;

import p116he.C2537l;
import p116he.C2551s;
import p116he.C2553t;
import p146jd.AbstractC3278a;
import p146jd.AbstractC3279b;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3282e;
import p146jd.InterfaceC3284g;
import sd.InterfaceC4580l;
import td.AbstractC4754n;
import td.C4747g;
import td.C4753m;

/* renamed from: ce.k0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1064k0 extends AbstractC3278a implements InterfaceC3282e {

    /* renamed from: i */
    public static final a f4036i = new a(null);

    /* renamed from: ce.k0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC3279b<InterfaceC3282e, AbstractC1064k0> {

        /* renamed from: ce.k0$a$a */
        /* loaded from: classes2.dex */
        public static final class C6147a extends AbstractC4754n implements InterfaceC4580l<InterfaceC3284g.b, AbstractC1064k0> {

            /* renamed from: h */
            public static final C6147a f4037h = new C6147a();

            public C6147a() {
                super(1);
            }

            @Override // sd.InterfaceC4580l
            /* renamed from: a */
            public final AbstractC1064k0 invoke(InterfaceC3284g.b bVar) {
                if (bVar instanceof AbstractC1064k0) {
                    return (AbstractC1064k0) bVar;
                }
                return null;
            }
        }

        public a() {
            super(InterfaceC3282e.f11449e, C6147a.f4037h);
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    public AbstractC1064k0() {
        super(InterfaceC3282e.f11449e);
    }

    /* renamed from: H0 */
    public abstract void mo4339H0(InterfaceC3284g interfaceC3284g, Runnable runnable);

    /* renamed from: I0 */
    public boolean mo4340I0(InterfaceC3284g interfaceC3284g) {
        return true;
    }

    /* renamed from: J0 */
    public AbstractC1064k0 mo4459J0(int i10) {
        C2553t.m10175a(i10);
        return new C2551s(this, i10);
    }

    @Override // p146jd.AbstractC3278a, p146jd.InterfaceC3284g
    /* renamed from: b0 */
    public InterfaceC3284g mo4367b0(InterfaceC3284g.c<?> cVar) {
        return InterfaceC3282e.a.m11888b(this, cVar);
    }

    @Override // p146jd.InterfaceC3282e
    /* renamed from: c0 */
    public final void mo4460c0(InterfaceC3281d<?> interfaceC3281d) {
        C4753m.m18651d(interfaceC3281d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C2537l) interfaceC3281d).m10107t();
    }

    @Override // p146jd.AbstractC3278a, p146jd.InterfaceC3284g.b, p146jd.InterfaceC3284g
    /* renamed from: d */
    public <E extends InterfaceC3284g.b> E mo4368d(InterfaceC3284g.c<E> cVar) {
        return (E) InterfaceC3282e.a.m11887a(this, cVar);
    }

    @Override // p146jd.InterfaceC3282e
    /* renamed from: s0 */
    public final <T> InterfaceC3281d<T> mo4461s0(InterfaceC3281d<? super T> interfaceC3281d) {
        return new C2537l(this, interfaceC3281d);
    }

    public String toString() {
        return C1105u0.m4580a(this) + '@' + C1105u0.m4581b(this);
    }
}
