package p038ce;

import java.util.concurrent.locks.LockSupport;
import p146jd.InterfaceC3284g;
import td.C4753m;

/* renamed from: ce.g */
/* loaded from: classes2.dex */
public final class C1043g<T> extends AbstractC1013a<T> {

    /* renamed from: k */
    public final Thread f4001k;

    /* renamed from: l */
    public final AbstractC1074m1 f4002l;

    public C1043g(InterfaceC3284g interfaceC3284g, Thread thread, AbstractC1074m1 abstractC1074m1) {
        super(interfaceC3284g, true, true);
        this.f4001k = thread;
        this.f4002l = abstractC1074m1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: S0 */
    public final T m4320S0() {
        C1023c.m4266a();
        try {
            AbstractC1074m1 abstractC1074m1 = this.f4002l;
            if (abstractC1074m1 != null) {
                AbstractC1074m1.m4475Q0(abstractC1074m1, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC1074m1 abstractC1074m12 = this.f4002l;
                    long mo4483T0 = abstractC1074m12 != null ? abstractC1074m12.mo4483T0() : Long.MAX_VALUE;
                    if (m4420k()) {
                        C1023c.m4266a();
                        T t10 = (T) C1066k2.m4470h(m4412T());
                        r3 = t10 instanceof C1024c0 ? (C1024c0) t10 : null;
                        if (r3 == null) {
                            return t10;
                        }
                        throw r3.f3977a;
                    }
                    C1023c.m4266a();
                    LockSupport.parkNanos(this, mo4483T0);
                } finally {
                    AbstractC1074m1 abstractC1074m13 = this.f4002l;
                    if (abstractC1074m13 != null) {
                        AbstractC1074m1.m4474L0(abstractC1074m13, false, 1, null);
                    }
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m4430u(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            C1023c.m4266a();
            throw th;
        }
    }

    @Override // p038ce.C1061j2
    /* renamed from: Y */
    public boolean mo4321Y() {
        return true;
    }

    @Override // p038ce.C1061j2
    /* renamed from: r */
    public void mo4272r(Object obj) {
        if (C4753m.m18648a(Thread.currentThread(), this.f4001k)) {
            return;
        }
        Thread thread = this.f4001k;
        C1023c.m4266a();
        LockSupport.unpark(thread);
    }
}
