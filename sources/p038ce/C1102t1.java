package p038ce;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p116he.C2521d;
import p146jd.InterfaceC3284g;

/* renamed from: ce.t1 */
/* loaded from: classes2.dex */
public final class C1102t1 extends AbstractC1098s1 implements InterfaceC1125z0 {

    /* renamed from: k */
    public final Executor f4091k;

    public C1102t1(Executor executor) {
        this.f4091k = executor;
        C2521d.m10057a(m4578L0());
    }

    @Override // p038ce.InterfaceC1125z0
    /* renamed from: G0 */
    public InterfaceC1055i1 mo4501G0(long j10, Runnable runnable, InterfaceC3284g interfaceC3284g) {
        Executor m4578L0 = m4578L0();
        ScheduledExecutorService scheduledExecutorService = m4578L0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) m4578L0 : null;
        ScheduledFuture<?> m4579M0 = scheduledExecutorService != null ? m4579M0(scheduledExecutorService, runnable, interfaceC3284g, j10) : null;
        return m4579M0 != null ? new C1050h1(m4579M0) : RunnableC1109v0.f4094p.mo4501G0(j10, runnable, interfaceC3284g);
    }

    @Override // p038ce.AbstractC1064k0
    /* renamed from: H0 */
    public void mo4339H0(InterfaceC3284g interfaceC3284g, Runnable runnable) {
        try {
            Executor m4578L0 = m4578L0();
            C1023c.m4266a();
            m4578L0.execute(runnable);
        } catch (RejectedExecutionException e10) {
            C1023c.m4266a();
            m4577K0(interfaceC3284g, e10);
            C1045g1.m4327b().mo4339H0(interfaceC3284g, runnable);
        }
    }

    /* renamed from: K0 */
    public final void m4577K0(InterfaceC3284g interfaceC3284g, RejectedExecutionException rejectedExecutionException) {
        C1046g2.m4331c(interfaceC3284g, C1094r1.m4570a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: L0 */
    public Executor m4578L0() {
        return this.f4091k;
    }

    /* renamed from: M0 */
    public final ScheduledFuture<?> m4579M0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, InterfaceC3284g interfaceC3284g, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            m4577K0(interfaceC3284g, e10);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor m4578L0 = m4578L0();
        ExecutorService executorService = m4578L0 instanceof ExecutorService ? (ExecutorService) m4578L0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1102t1) && ((C1102t1) obj).m4578L0() == m4578L0();
    }

    public int hashCode() {
        return System.identityHashCode(m4578L0());
    }

    @Override // p038ce.AbstractC1064k0
    public String toString() {
        return m4578L0().toString();
    }
}
