package p038ce;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p038ce.AbstractC1078n1;
import p146jd.InterfaceC3284g;
import p343xd.C5767k;
import td.C4753m;

/* renamed from: ce.v0 */
/* loaded from: classes2.dex */
public final class RunnableC1109v0 extends AbstractC1078n1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: p */
    public static final RunnableC1109v0 f4094p;

    /* renamed from: q */
    public static final long f4095q;

    static {
        Long l10;
        RunnableC1109v0 runnableC1109v0 = new RunnableC1109v0();
        f4094p = runnableC1109v0;
        AbstractC1074m1.m4475Q0(runnableC1109v0, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f4095q = timeUnit.toNanos(l10.longValue());
    }

    @Override // p038ce.AbstractC1078n1, p038ce.InterfaceC1125z0
    /* renamed from: G0 */
    public InterfaceC1055i1 mo4501G0(long j10, Runnable runnable, InterfaceC3284g interfaceC3284g) {
        return m4511k1(j10, runnable);
    }

    @Override // p038ce.AbstractC1082o1
    /* renamed from: W0 */
    public Thread mo4341W0() {
        Thread thread = _thread;
        return thread == null ? m4586o1() : thread;
    }

    @Override // p038ce.AbstractC1082o1
    /* renamed from: X0 */
    public void mo4525X0(long j10, AbstractC1078n1.b bVar) {
        m4590s1();
    }

    @Override // p038ce.AbstractC1078n1
    /* renamed from: c1 */
    public void mo4504c1(Runnable runnable) {
        if (m4587p1()) {
            m4590s1();
        }
        super.mo4504c1(runnable);
    }

    /* renamed from: n1 */
    public final synchronized void m4585n1() {
        if (m4588q1()) {
            debugStatus = 3;
            m4508h1();
            C4753m.m18651d(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: o1 */
    public final synchronized Thread m4586o1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: p1 */
    public final boolean m4587p1() {
        return debugStatus == 4;
    }

    /* renamed from: q1 */
    public final boolean m4588q1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    /* renamed from: r1 */
    public final synchronized boolean m4589r1() {
        if (m4588q1()) {
            return false;
        }
        debugStatus = 1;
        C4753m.m18651d(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m4506f1;
        C1123y2.f4101a.m4603d(this);
        C1023c.m4266a();
        try {
            if (!m4589r1()) {
                if (m4506f1) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long mo4483T0 = mo4483T0();
                if (mo4483T0 == Long.MAX_VALUE) {
                    C1023c.m4266a();
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f4095q + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        m4585n1();
                        C1023c.m4266a();
                        if (m4506f1()) {
                            return;
                        }
                        mo4341W0();
                        return;
                    }
                    mo4483T0 = C5767k.m22907d(mo4483T0, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (mo4483T0 > 0) {
                    if (m4588q1()) {
                        _thread = null;
                        m4585n1();
                        C1023c.m4266a();
                        if (m4506f1()) {
                            return;
                        }
                        mo4341W0();
                        return;
                    }
                    C1023c.m4266a();
                    LockSupport.parkNanos(this, mo4483T0);
                }
            }
        } finally {
            _thread = null;
            m4585n1();
            C1023c.m4266a();
            if (!m4506f1()) {
                mo4341W0();
            }
        }
    }

    /* renamed from: s1 */
    public final void m4590s1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p038ce.AbstractC1078n1, p038ce.AbstractC1074m1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
