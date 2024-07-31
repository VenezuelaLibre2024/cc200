package p116he;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p038ce.InterfaceC1091q2;
import p116he.AbstractC2532i0;
import p146jd.InterfaceC3284g;

/* renamed from: he.i0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2532i0<S extends AbstractC2532i0<S>> extends AbstractC2525f<S> implements InterfaceC1091q2 {

    /* renamed from: k */
    public static final AtomicIntegerFieldUpdater f9970k = AtomicIntegerFieldUpdater.newUpdater(AbstractC2532i0.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: j */
    public final long f9971j;

    public AbstractC2532i0(long j10, S s10, int i10) {
        super(s10);
        this.f9971j = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    @Override // p116he.AbstractC2525f
    /* renamed from: h */
    public boolean mo10073h() {
        return f9970k.get(this) == mo7210n() && !m10074i();
    }

    /* renamed from: m */
    public final boolean m10084m() {
        return f9970k.addAndGet(this, -65536) == mo7210n() && !m10074i();
    }

    /* renamed from: n */
    public abstract int mo7210n();

    /* renamed from: o */
    public abstract void mo7211o(int i10, Throwable th, InterfaceC3284g interfaceC3284g);

    /* renamed from: p */
    public final void m10085p() {
        if (f9970k.incrementAndGet(this) == mo7210n()) {
            m10076k();
        }
    }

    /* renamed from: q */
    public final boolean m10086q() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9970k;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (!(i10 != mo7210n() || m10074i())) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
