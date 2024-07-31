package p034c7;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import p108h6.C2394s;

/* renamed from: c7.h6 */
/* loaded from: classes.dex */
public final class C0725h6 extends Thread {

    /* renamed from: h */
    public final Object f3019h;

    /* renamed from: i */
    public final BlockingQueue<C0739i6<?>> f3020i;

    /* renamed from: j */
    public boolean f3021j = false;

    /* renamed from: k */
    public final /* synthetic */ C0669d6 f3022k;

    public C0725h6(C0669d6 c0669d6, String str, BlockingQueue<C0739i6<?>> blockingQueue) {
        this.f3022k = c0669d6;
        C2394s.m9619l(str);
        C2394s.m9619l(blockingQueue);
        this.f3019h = new Object();
        this.f3020i = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void m3293a() {
        synchronized (this.f3019h) {
            this.f3019h.notifyAll();
        }
    }

    /* renamed from: b */
    public final void m3294b(InterruptedException interruptedException) {
        this.f3022k.zzj().m3919G().m3996b(getName() + " was interrupted", interruptedException);
    }

    /* renamed from: c */
    public final void m3295c() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        C0725h6 c0725h6;
        C0725h6 c0725h62;
        obj = this.f3022k.f2867i;
        synchronized (obj) {
            if (!this.f3021j) {
                semaphore = this.f3022k.f2868j;
                semaphore.release();
                obj2 = this.f3022k.f2867i;
                obj2.notifyAll();
                c0725h6 = this.f3022k.f2861c;
                if (this == c0725h6) {
                    this.f3022k.f2861c = null;
                } else {
                    c0725h62 = this.f3022k.f2862d;
                    if (this == c0725h62) {
                        this.f3022k.f2862d = null;
                    } else {
                        this.f3022k.zzj().m3914B().m3995a("Current scheduler thread is neither worker nor network");
                    }
                }
                this.f3021j = true;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z10;
        boolean z11 = false;
        while (!z11) {
            try {
                semaphore = this.f3022k.f2868j;
                semaphore.acquire();
                z11 = true;
            } catch (InterruptedException e10) {
                m3294b(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C0739i6<?> poll = this.f3020i.poll();
                if (poll != null) {
                    Process.setThreadPriority(poll.f3174i ? threadPriority : 10);
                    poll.run();
                } else {
                    synchronized (this.f3019h) {
                        if (this.f3020i.peek() == null) {
                            z10 = this.f3022k.f2869k;
                            if (!z10) {
                                try {
                                    this.f3019h.wait(30000L);
                                } catch (InterruptedException e11) {
                                    m3294b(e11);
                                }
                            }
                        }
                    }
                    obj = this.f3022k.f2867i;
                    synchronized (obj) {
                        if (this.f3020i.peek() == null) {
                            m3295c();
                            return;
                        }
                    }
                }
            }
        } finally {
            m3295c();
        }
    }
}
