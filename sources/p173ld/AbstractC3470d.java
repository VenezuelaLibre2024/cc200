package p173ld;

import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3282e;
import p146jd.InterfaceC3284g;
import td.C4753m;

/* renamed from: ld.d */
/* loaded from: classes2.dex */
public abstract class AbstractC3470d extends AbstractC3467a {
    private final InterfaceC3284g _context;
    private transient InterfaceC3281d<Object> intercepted;

    public AbstractC3470d(InterfaceC3281d<Object> interfaceC3281d) {
        this(interfaceC3281d, interfaceC3281d != null ? interfaceC3281d.getContext() : null);
    }

    public AbstractC3470d(InterfaceC3281d<Object> interfaceC3281d, InterfaceC3284g interfaceC3284g) {
        super(interfaceC3281d);
        this._context = interfaceC3284g;
    }

    @Override // p146jd.InterfaceC3281d
    public InterfaceC3284g getContext() {
        InterfaceC3284g interfaceC3284g = this._context;
        C4753m.m18650c(interfaceC3284g);
        return interfaceC3284g;
    }

    public final InterfaceC3281d<Object> intercepted() {
        InterfaceC3281d<Object> interfaceC3281d = this.intercepted;
        if (interfaceC3281d == null) {
            InterfaceC3282e interfaceC3282e = (InterfaceC3282e) getContext().mo4368d(InterfaceC3282e.f11449e);
            if (interfaceC3282e == null || (interfaceC3281d = interfaceC3282e.mo4461s0(this)) == null) {
                interfaceC3281d = this;
            }
            this.intercepted = interfaceC3281d;
        }
        return interfaceC3281d;
    }

    @Override // p173ld.AbstractC3467a
    public void releaseIntercepted() {
        InterfaceC3281d<?> interfaceC3281d = this.intercepted;
        if (interfaceC3281d != null && interfaceC3281d != this) {
            InterfaceC3284g.b mo4368d = getContext().mo4368d(InterfaceC3282e.f11449e);
            C4753m.m18650c(mo4368d);
            ((InterfaceC3282e) mo4368d).mo4460c0(interfaceC3281d);
        }
        this.intercepted = C3469c.f12178h;
    }
}
