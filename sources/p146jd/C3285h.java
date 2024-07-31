package p146jd;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import p146jd.InterfaceC3284g;
import sd.InterfaceC4584p;
import td.C4753m;

/* renamed from: jd.h */
/* loaded from: classes2.dex */
public final class C3285h implements InterfaceC3284g, Serializable {

    /* renamed from: h */
    public static final C3285h f11452h = new C3285h();

    @Override // p146jd.InterfaceC3284g
    /* renamed from: b0 */
    public InterfaceC3284g mo4367b0(InterfaceC3284g.c<?> cVar) {
        C4753m.m18653f(cVar, Constants.KEY);
        return this;
    }

    @Override // p146jd.InterfaceC3284g
    /* renamed from: d */
    public <E extends InterfaceC3284g.b> E mo4368d(InterfaceC3284g.c<E> cVar) {
        C4753m.m18653f(cVar, Constants.KEY);
        return null;
    }

    @Override // p146jd.InterfaceC3284g
    /* renamed from: e0 */
    public InterfaceC3284g mo4369e0(InterfaceC3284g interfaceC3284g) {
        C4753m.m18653f(interfaceC3284g, "context");
        return interfaceC3284g;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p146jd.InterfaceC3284g
    /* renamed from: z0 */
    public <R> R mo4370z0(R r10, InterfaceC4584p<? super R, ? super InterfaceC3284g.b, ? extends R> interfaceC4584p) {
        C4753m.m18653f(interfaceC4584p, "operation");
        return r10;
    }
}
