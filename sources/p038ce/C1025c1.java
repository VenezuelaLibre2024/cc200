package p038ce;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p116he.C2530h0;
import p116he.C2539m;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p161kd.C3384b;
import p161kd.C3385c;

/* renamed from: ce.c1 */
/* loaded from: classes2.dex */
public final class C1025c1<T> extends C2530h0<T> {

    /* renamed from: l */
    public static final AtomicIntegerFieldUpdater f3978l = AtomicIntegerFieldUpdater.newUpdater(C1025c1.class, "_decision");
    private volatile int _decision;

    public C1025c1(InterfaceC3284g interfaceC3284g, InterfaceC3281d<? super T> interfaceC3281d) {
        super(interfaceC3284g, interfaceC3281d);
    }

    @Override // p116he.C2530h0, p038ce.AbstractC1013a
    /* renamed from: O0 */
    public void mo4250O0(Object obj) {
        if (m4270T0()) {
            return;
        }
        C2539m.m10111c(C3384b.m12580b(this.f9969k), C1044g0.m4322a(obj, this.f9969k), null, 2, null);
    }

    /* renamed from: S0 */
    public final Object m4269S0() {
        if (m4271U0()) {
            return C3385c.m12581c();
        }
        Object m4470h = C1066k2.m4470h(m4412T());
        if (m4470h instanceof C1024c0) {
            throw ((C1024c0) m4470h).f3977a;
        }
        return m4470h;
    }

    /* renamed from: T0 */
    public final boolean m4270T0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3978l;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f3978l.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: U0 */
    public final boolean m4271U0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3978l;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f3978l.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p116he.C2530h0, p038ce.C1061j2
    /* renamed from: r */
    public void mo4272r(Object obj) {
        mo4250O0(obj);
    }
}
