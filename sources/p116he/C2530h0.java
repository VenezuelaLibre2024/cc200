package p116he;

import p038ce.AbstractC1013a;
import p038ce.C1044g0;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p161kd.C3384b;
import p173ld.InterfaceC3471e;

/* renamed from: he.h0 */
/* loaded from: classes2.dex */
public class C2530h0<T> extends AbstractC1013a<T> implements InterfaceC3471e {

    /* renamed from: k */
    public final InterfaceC3281d<T> f9969k;

    /* JADX WARN: Multi-variable type inference failed */
    public C2530h0(InterfaceC3284g interfaceC3284g, InterfaceC3281d<? super T> interfaceC3281d) {
        super(interfaceC3284g, true, true);
        this.f9969k = interfaceC3281d;
    }

    @Override // p038ce.AbstractC1013a
    /* renamed from: O0 */
    public void mo4250O0(Object obj) {
        InterfaceC3281d<T> interfaceC3281d = this.f9969k;
        interfaceC3281d.resumeWith(C1044g0.m4322a(obj, interfaceC3281d));
    }

    @Override // p038ce.C1061j2
    /* renamed from: Y */
    public final boolean mo4321Y() {
        return true;
    }

    @Override // p173ld.InterfaceC3471e
    public final InterfaceC3471e getCallerFrame() {
        InterfaceC3281d<T> interfaceC3281d = this.f9969k;
        if (interfaceC3281d instanceof InterfaceC3471e) {
            return (InterfaceC3471e) interfaceC3281d;
        }
        return null;
    }

    @Override // p173ld.InterfaceC3471e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p038ce.C1061j2
    /* renamed from: r */
    public void mo4272r(Object obj) {
        C2539m.m10111c(C3384b.m12580b(this.f9969k), C1044g0.m4322a(obj, this.f9969k), null, 2, null);
    }
}
