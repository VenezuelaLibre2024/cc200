package p146jd;

import io.flutter.plugins.firebase.crashlytics.Constants;
import p146jd.InterfaceC3284g;
import sd.InterfaceC4584p;
import td.C4753m;

/* renamed from: jd.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3278a implements InterfaceC3284g.b {

    /* renamed from: h */
    public final InterfaceC3284g.c<?> f11443h;

    public AbstractC3278a(InterfaceC3284g.c<?> cVar) {
        C4753m.m18653f(cVar, Constants.KEY);
        this.f11443h = cVar;
    }

    @Override // p146jd.InterfaceC3284g
    /* renamed from: b0 */
    public InterfaceC3284g mo4367b0(InterfaceC3284g.c<?> cVar) {
        return InterfaceC3284g.b.a.m11894c(this, cVar);
    }

    @Override // p146jd.InterfaceC3284g.b, p146jd.InterfaceC3284g
    /* renamed from: d */
    public <E extends InterfaceC3284g.b> E mo4368d(InterfaceC3284g.c<E> cVar) {
        return (E) InterfaceC3284g.b.a.m11893b(this, cVar);
    }

    @Override // p146jd.InterfaceC3284g
    /* renamed from: e0 */
    public InterfaceC3284g mo4369e0(InterfaceC3284g interfaceC3284g) {
        return InterfaceC3284g.b.a.m11895d(this, interfaceC3284g);
    }

    @Override // p146jd.InterfaceC3284g.b
    public InterfaceC3284g.c<?> getKey() {
        return this.f11443h;
    }

    @Override // p146jd.InterfaceC3284g
    /* renamed from: z0 */
    public <R> R mo4370z0(R r10, InterfaceC4584p<? super R, ? super InterfaceC3284g.b, ? extends R> interfaceC4584p) {
        return (R) InterfaceC3284g.b.a.m11892a(this, r10, interfaceC4584p);
    }
}
