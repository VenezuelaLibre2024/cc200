package p038ce;

import java.util.concurrent.locks.LockSupport;
import p038ce.AbstractC1078n1;

/* renamed from: ce.o1 */
/* loaded from: classes2.dex */
public abstract class AbstractC1082o1 extends AbstractC1074m1 {
    /* renamed from: W0 */
    public abstract Thread mo4341W0();

    /* renamed from: X0 */
    public void mo4525X0(long j10, AbstractC1078n1.b bVar) {
        RunnableC1109v0.f4094p.m4509i1(j10, bVar);
    }

    /* renamed from: Y0 */
    public final void m4526Y0() {
        Thread mo4341W0 = mo4341W0();
        if (Thread.currentThread() != mo4341W0) {
            C1023c.m4266a();
            LockSupport.unpark(mo4341W0);
        }
    }
}
