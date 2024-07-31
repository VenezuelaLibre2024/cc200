package p038ce;

import gd.C2245s;
import java.util.concurrent.CancellationException;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p373zd.InterfaceC6124b;
import sd.InterfaceC4580l;
import sd.InterfaceC4584p;

/* renamed from: ce.c2 */
/* loaded from: classes2.dex */
public interface InterfaceC1026c2 extends InterfaceC3284g.b {

    /* renamed from: c */
    public static final b f3979c = b.f3980h;

    /* renamed from: ce.c2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m4280a(InterfaceC1026c2 interfaceC1026c2, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC1026c2.mo4279y0(cancellationException);
        }

        /* renamed from: b */
        public static <R> R m4281b(InterfaceC1026c2 interfaceC1026c2, R r10, InterfaceC4584p<? super R, ? super InterfaceC3284g.b, ? extends R> interfaceC4584p) {
            return (R) InterfaceC3284g.b.a.m11892a(interfaceC1026c2, r10, interfaceC4584p);
        }

        /* renamed from: c */
        public static <E extends InterfaceC3284g.b> E m4282c(InterfaceC1026c2 interfaceC1026c2, InterfaceC3284g.c<E> cVar) {
            return (E) InterfaceC3284g.b.a.m11893b(interfaceC1026c2, cVar);
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC1055i1 m4283d(InterfaceC1026c2 interfaceC1026c2, boolean z10, boolean z11, InterfaceC4580l interfaceC4580l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return interfaceC1026c2.mo4276l(z10, z11, interfaceC4580l);
        }

        /* renamed from: e */
        public static InterfaceC3284g m4284e(InterfaceC1026c2 interfaceC1026c2, InterfaceC3284g.c<?> cVar) {
            return InterfaceC3284g.b.a.m11894c(interfaceC1026c2, cVar);
        }

        /* renamed from: f */
        public static InterfaceC3284g m4285f(InterfaceC1026c2 interfaceC1026c2, InterfaceC3284g interfaceC3284g) {
            return InterfaceC3284g.b.a.m11895d(interfaceC1026c2, interfaceC3284g);
        }
    }

    /* renamed from: ce.c2$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC3284g.c<InterfaceC1026c2> {

        /* renamed from: h */
        public static final /* synthetic */ b f3980h = new b();
    }

    /* renamed from: K */
    CancellationException mo4273K();

    /* renamed from: P */
    Object mo4274P(InterfaceC3281d<? super C2245s> interfaceC3281d);

    /* renamed from: a */
    boolean mo4255a();

    InterfaceC1026c2 getParent();

    /* renamed from: h0 */
    InterfaceC1104u mo4275h0(InterfaceC1112w interfaceC1112w);

    boolean isCancelled();

    /* renamed from: l */
    InterfaceC1055i1 mo4276l(boolean z10, boolean z11, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l);

    boolean start();

    /* renamed from: w */
    InterfaceC6124b<InterfaceC1026c2> mo4277w();

    /* renamed from: x0 */
    InterfaceC1055i1 mo4278x0(InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l);

    /* renamed from: y0 */
    void mo4279y0(CancellationException cancellationException);
}
