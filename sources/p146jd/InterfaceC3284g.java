package p146jd;

import io.flutter.plugins.firebase.crashlytics.Constants;
import p146jd.InterfaceC3282e;
import sd.InterfaceC4584p;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: jd.g */
/* loaded from: classes2.dex */
public interface InterfaceC3284g {

    /* renamed from: jd.g$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: jd.g$a$a */
        /* loaded from: classes2.dex */
        public static final class C6191a extends AbstractC4754n implements InterfaceC4584p<InterfaceC3284g, b, InterfaceC3284g> {

            /* renamed from: h */
            public static final C6191a f11451h = new C6191a();

            public C6191a() {
                super(2);
            }

            @Override // sd.InterfaceC4584p
            /* renamed from: a */
            public final InterfaceC3284g invoke(InterfaceC3284g interfaceC3284g, b bVar) {
                C3280c c3280c;
                C4753m.m18653f(interfaceC3284g, "acc");
                C4753m.m18653f(bVar, "element");
                InterfaceC3284g mo4367b0 = interfaceC3284g.mo4367b0(bVar.getKey());
                C3285h c3285h = C3285h.f11452h;
                if (mo4367b0 == c3285h) {
                    return bVar;
                }
                InterfaceC3282e.b bVar2 = InterfaceC3282e.f11449e;
                InterfaceC3282e interfaceC3282e = (InterfaceC3282e) mo4367b0.mo4368d(bVar2);
                if (interfaceC3282e == null) {
                    c3280c = new C3280c(mo4367b0, bVar);
                } else {
                    InterfaceC3284g mo4367b02 = mo4367b0.mo4367b0(bVar2);
                    if (mo4367b02 == c3285h) {
                        return new C3280c(bVar, interfaceC3282e);
                    }
                    c3280c = new C3280c(new C3280c(mo4367b02, bVar), interfaceC3282e);
                }
                return c3280c;
            }
        }

        /* renamed from: a */
        public static InterfaceC3284g m11890a(InterfaceC3284g interfaceC3284g, InterfaceC3284g interfaceC3284g2) {
            C4753m.m18653f(interfaceC3284g2, "context");
            return interfaceC3284g2 == C3285h.f11452h ? interfaceC3284g : (InterfaceC3284g) interfaceC3284g2.mo4370z0(interfaceC3284g, C6191a.f11451h);
        }
    }

    /* renamed from: jd.g$b */
    /* loaded from: classes2.dex */
    public interface b extends InterfaceC3284g {

        /* renamed from: jd.g$b$a */
        /* loaded from: classes2.dex */
        public static final class a {
            /* renamed from: a */
            public static <R> R m11892a(b bVar, R r10, InterfaceC4584p<? super R, ? super b, ? extends R> interfaceC4584p) {
                C4753m.m18653f(interfaceC4584p, "operation");
                return interfaceC4584p.invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: b */
            public static <E extends b> E m11893b(b bVar, c<E> cVar) {
                C4753m.m18653f(cVar, Constants.KEY);
                if (!C4753m.m18648a(bVar.getKey(), cVar)) {
                    return null;
                }
                C4753m.m18651d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            /* renamed from: c */
            public static InterfaceC3284g m11894c(b bVar, c<?> cVar) {
                C4753m.m18653f(cVar, Constants.KEY);
                return C4753m.m18648a(bVar.getKey(), cVar) ? C3285h.f11452h : bVar;
            }

            /* renamed from: d */
            public static InterfaceC3284g m11895d(b bVar, InterfaceC3284g interfaceC3284g) {
                C4753m.m18653f(interfaceC3284g, "context");
                return a.m11890a(bVar, interfaceC3284g);
            }
        }

        @Override // p146jd.InterfaceC3284g
        /* renamed from: d */
        <E extends b> E mo4368d(c<E> cVar);

        c<?> getKey();
    }

    /* renamed from: jd.g$c */
    /* loaded from: classes2.dex */
    public interface c<E extends b> {
    }

    /* renamed from: b0 */
    InterfaceC3284g mo4367b0(c<?> cVar);

    /* renamed from: d */
    <E extends b> E mo4368d(c<E> cVar);

    /* renamed from: e0 */
    InterfaceC3284g mo4369e0(InterfaceC3284g interfaceC3284g);

    /* renamed from: z0 */
    <R> R mo4370z0(R r10, InterfaceC4584p<? super R, ? super b, ? extends R> interfaceC4584p);
}
