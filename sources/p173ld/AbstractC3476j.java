package p173ld;

import p146jd.C3285h;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;

/* renamed from: ld.j */
/* loaded from: classes2.dex */
public abstract class AbstractC3476j extends AbstractC3467a {
    public AbstractC3476j(InterfaceC3281d<Object> interfaceC3281d) {
        super(interfaceC3281d);
        if (interfaceC3281d != null) {
            if (!(interfaceC3281d.getContext() == C3285h.f11452h)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // p146jd.InterfaceC3281d
    public InterfaceC3284g getContext() {
        return C3285h.f11452h;
    }
}
