package p146jd;

import io.flutter.plugins.firebase.crashlytics.Constants;
import p146jd.InterfaceC3284g;
import p146jd.InterfaceC3284g.b;
import sd.InterfaceC4580l;
import td.C4753m;

/* renamed from: jd.b */
/* loaded from: classes2.dex */
public abstract class AbstractC3279b<B extends InterfaceC3284g.b, E extends B> implements InterfaceC3284g.c<E> {

    /* renamed from: h */
    public final InterfaceC4580l<InterfaceC3284g.b, E> f11444h;

    /* renamed from: i */
    public final InterfaceC3284g.c<?> f11445i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [jd.g$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [sd.l<? super jd.g$b, ? extends E extends B>, sd.l<jd.g$b, E extends B>, java.lang.Object] */
    public AbstractC3279b(InterfaceC3284g.c<B> cVar, InterfaceC4580l<? super InterfaceC3284g.b, ? extends E> interfaceC4580l) {
        C4753m.m18653f(cVar, "baseKey");
        C4753m.m18653f(interfaceC4580l, "safeCast");
        this.f11444h = interfaceC4580l;
        this.f11445i = cVar instanceof AbstractC3279b ? (InterfaceC3284g.c<B>) ((AbstractC3279b) cVar).f11445i : cVar;
    }

    /* renamed from: a */
    public final boolean m11881a(InterfaceC3284g.c<?> cVar) {
        C4753m.m18653f(cVar, Constants.KEY);
        return cVar == this || this.f11445i == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljd/g$b;)TE; */
    /* renamed from: b */
    public final InterfaceC3284g.b m11882b(InterfaceC3284g.b bVar) {
        C4753m.m18653f(bVar, "element");
        return (InterfaceC3284g.b) this.f11444h.invoke(bVar);
    }
}
