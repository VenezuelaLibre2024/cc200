package p146jd;

import io.flutter.plugins.firebase.crashlytics.Constants;
import p146jd.InterfaceC3284g;
import td.C4753m;

/* renamed from: jd.e */
/* loaded from: classes2.dex */
public interface InterfaceC3282e extends InterfaceC3284g.b {

    /* renamed from: e */
    public static final b f11449e = b.f11450h;

    /* renamed from: jd.e$a */
    /* loaded from: classes2.dex */
    public static final class a {
        /* renamed from: a */
        public static <E extends InterfaceC3284g.b> E m11887a(InterfaceC3282e interfaceC3282e, InterfaceC3284g.c<E> cVar) {
            C4753m.m18653f(cVar, Constants.KEY);
            if (!(cVar instanceof AbstractC3279b)) {
                if (InterfaceC3282e.f11449e != cVar) {
                    return null;
                }
                C4753m.m18651d(interfaceC3282e, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC3282e;
            }
            AbstractC3279b abstractC3279b = (AbstractC3279b) cVar;
            if (!abstractC3279b.m11881a(interfaceC3282e.getKey())) {
                return null;
            }
            E e10 = (E) abstractC3279b.m11882b(interfaceC3282e);
            if (e10 instanceof InterfaceC3284g.b) {
                return e10;
            }
            return null;
        }

        /* renamed from: b */
        public static InterfaceC3284g m11888b(InterfaceC3282e interfaceC3282e, InterfaceC3284g.c<?> cVar) {
            C4753m.m18653f(cVar, Constants.KEY);
            if (!(cVar instanceof AbstractC3279b)) {
                return InterfaceC3282e.f11449e == cVar ? C3285h.f11452h : interfaceC3282e;
            }
            AbstractC3279b abstractC3279b = (AbstractC3279b) cVar;
            return (!abstractC3279b.m11881a(interfaceC3282e.getKey()) || abstractC3279b.m11882b(interfaceC3282e) == null) ? interfaceC3282e : C3285h.f11452h;
        }
    }

    /* renamed from: jd.e$b */
    /* loaded from: classes2.dex */
    public static final class b implements InterfaceC3284g.c<InterfaceC3282e> {

        /* renamed from: h */
        public static final /* synthetic */ b f11450h = new b();
    }

    /* renamed from: c0 */
    void mo4460c0(InterfaceC3281d<?> interfaceC3281d);

    /* renamed from: s0 */
    <T> InterfaceC3281d<T> mo4461s0(InterfaceC3281d<? super T> interfaceC3281d);
}
