package bf;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: bf.a */
/* loaded from: classes2.dex */
public class C0555a extends C0575u {

    /* renamed from: h */
    public static final long f2494h;

    /* renamed from: i */
    public static final long f2495i;

    /* renamed from: j */
    public static C0555a f2496j;

    /* renamed from: e */
    public boolean f2497e;

    /* renamed from: f */
    public C0555a f2498f;

    /* renamed from: g */
    public long f2499g;

    /* renamed from: bf.a$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC0573s {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC0573s f2500h;

        public a(InterfaceC0573s interfaceC0573s) {
            this.f2500h = interfaceC0573s;
        }

        @Override // bf.InterfaceC0573s
        /* renamed from: C0 */
        public void mo2798C0(C0557c c0557c, long j10) {
            C0576v.m2921b(c0557c.f2508i, 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                C0570p c0570p = c0557c.f2507h;
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += c0570p.f2542c - c0570p.f2541b;
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    c0570p = c0570p.f2545f;
                }
                C0555a.this.m2789k();
                try {
                    try {
                        this.f2500h.mo2798C0(c0557c, j11);
                        j10 -= j11;
                        C0555a.this.m2791m(true);
                    } catch (IOException e10) {
                        throw C0555a.this.m2790l(e10);
                    }
                } catch (Throwable th) {
                    C0555a.this.m2791m(false);
                    throw th;
                }
            }
        }

        @Override // bf.InterfaceC0573s
        /* renamed from: c */
        public C0575u mo2799c() {
            return C0555a.this;
        }

        @Override // bf.InterfaceC0573s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C0555a.this.m2789k();
            try {
                try {
                    this.f2500h.close();
                    C0555a.this.m2791m(true);
                } catch (IOException e10) {
                    throw C0555a.this.m2790l(e10);
                }
            } catch (Throwable th) {
                C0555a.this.m2791m(false);
                throw th;
            }
        }

        @Override // bf.InterfaceC0573s, java.io.Flushable
        public void flush() {
            C0555a.this.m2789k();
            try {
                try {
                    this.f2500h.flush();
                    C0555a.this.m2791m(true);
                } catch (IOException e10) {
                    throw C0555a.this.m2790l(e10);
                }
            } catch (Throwable th) {
                C0555a.this.m2791m(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f2500h + ")";
        }
    }

    /* renamed from: bf.a$b */
    /* loaded from: classes2.dex */
    public class b implements InterfaceC0574t {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC0574t f2502h;

        public b(InterfaceC0574t interfaceC0574t) {
            this.f2502h = interfaceC0574t;
        }

        @Override // bf.InterfaceC0574t
        /* renamed from: T */
        public long mo2800T(C0557c c0557c, long j10) {
            C0555a.this.m2789k();
            try {
                try {
                    long mo2800T = this.f2502h.mo2800T(c0557c, j10);
                    C0555a.this.m2791m(true);
                    return mo2800T;
                } catch (IOException e10) {
                    throw C0555a.this.m2790l(e10);
                }
            } catch (Throwable th) {
                C0555a.this.m2791m(false);
                throw th;
            }
        }

        @Override // bf.InterfaceC0574t
        /* renamed from: c */
        public C0575u mo2801c() {
            return C0555a.this;
        }

        @Override // bf.InterfaceC0574t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C0555a.this.m2789k();
            try {
                try {
                    this.f2502h.close();
                    C0555a.this.m2791m(true);
                } catch (IOException e10) {
                    throw C0555a.this.m2790l(e10);
                }
            } catch (Throwable th) {
                C0555a.this.m2791m(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f2502h + ")";
        }
    }

    /* renamed from: bf.a$c */
    /* loaded from: classes2.dex */
    public static final class c extends Thread {
        public c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0015, code lost:
        
            r1.mo2797t();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<bf.a> r0 = bf.C0555a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                bf.a r1 = bf.C0555a.m2786i()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                bf.a r2 = bf.C0555a.f2496j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                bf.C0555a.f2496j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.mo2797t()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: bf.C0555a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f2494h = millis;
        f2495i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: i */
    public static C0555a m2786i() {
        C0555a c0555a = f2496j.f2498f;
        long nanoTime = System.nanoTime();
        if (c0555a == null) {
            C0555a.class.wait(f2494h);
            if (f2496j.f2498f != null || System.nanoTime() - nanoTime < f2495i) {
                return null;
            }
            return f2496j;
        }
        long m2794p = c0555a.m2794p(nanoTime);
        if (m2794p > 0) {
            long j10 = m2794p / 1000000;
            C0555a.class.wait(j10, (int) (m2794p - (1000000 * j10)));
            return null;
        }
        f2496j.f2498f = c0555a.f2498f;
        c0555a.f2498f = null;
        return c0555a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000b, code lost:
    
        r1.f2498f = r3.f2498f;
        r3.f2498f = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        r3 = false;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean m2787j(bf.C0555a r3) {
        /*
            java.lang.Class<bf.a> r0 = bf.C0555a.class
            monitor-enter(r0)
            bf.a r1 = bf.C0555a.f2496j     // Catch: java.lang.Throwable -> L19
        L5:
            if (r1 == 0) goto L17
            bf.a r2 = r1.f2498f     // Catch: java.lang.Throwable -> L19
            if (r2 != r3) goto L15
            bf.a r2 = r3.f2498f     // Catch: java.lang.Throwable -> L19
            r1.f2498f = r2     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r3.f2498f = r1     // Catch: java.lang.Throwable -> L19
            r3 = 0
        L13:
            monitor-exit(r0)
            return r3
        L15:
            r1 = r2
            goto L5
        L17:
            r3 = 1
            goto L13
        L19:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.C0555a.m2787j(bf.a):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0016, B:10:0x0022, B:11:0x002b, B:12:0x003a, B:13:0x0040, B:15:0x0044, B:17:0x004d, B:20:0x0050, B:22:0x005a, B:30:0x0034, B:31:0x005f, B:32:0x0064), top: B:3:0x0003 }] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void m2788q(bf.C0555a r5, long r6, boolean r8) {
        /*
            java.lang.Class<bf.a> r0 = bf.C0555a.class
            monitor-enter(r0)
            bf.a r1 = bf.C0555a.f2496j     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L16
            bf.a r1 = new bf.a     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            bf.C0555a.f2496j = r1     // Catch: java.lang.Throwable -> L65
            bf.a$c r1 = new bf.a$c     // Catch: java.lang.Throwable -> L65
            r1.<init>()     // Catch: java.lang.Throwable -> L65
            r1.start()     // Catch: java.lang.Throwable -> L65
        L16:
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L65
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L2f
            if (r8 == 0) goto L2f
            long r3 = r5.mo2880c()     // Catch: java.lang.Throwable -> L65
            long r3 = r3 - r1
            long r6 = java.lang.Math.min(r6, r3)     // Catch: java.lang.Throwable -> L65
        L2b:
            long r6 = r6 + r1
            r5.f2499g = r6     // Catch: java.lang.Throwable -> L65
            goto L3a
        L2f:
            if (r3 == 0) goto L32
            goto L2b
        L32:
            if (r8 == 0) goto L5f
            long r6 = r5.mo2880c()     // Catch: java.lang.Throwable -> L65
            r5.f2499g = r6     // Catch: java.lang.Throwable -> L65
        L3a:
            long r6 = r5.m2794p(r1)     // Catch: java.lang.Throwable -> L65
            bf.a r8 = bf.C0555a.f2496j     // Catch: java.lang.Throwable -> L65
        L40:
            bf.a r3 = r8.f2498f     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L50
            long r3 = r3.m2794p(r1)     // Catch: java.lang.Throwable -> L65
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 >= 0) goto L4d
            goto L50
        L4d:
            bf.a r8 = r8.f2498f     // Catch: java.lang.Throwable -> L65
            goto L40
        L50:
            bf.a r6 = r8.f2498f     // Catch: java.lang.Throwable -> L65
            r5.f2498f = r6     // Catch: java.lang.Throwable -> L65
            r8.f2498f = r5     // Catch: java.lang.Throwable -> L65
            bf.a r5 = bf.C0555a.f2496j     // Catch: java.lang.Throwable -> L65
            if (r8 != r5) goto L5d
            r0.notify()     // Catch: java.lang.Throwable -> L65
        L5d:
            monitor-exit(r0)
            return
        L5f:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L65
            r5.<init>()     // Catch: java.lang.Throwable -> L65
            throw r5     // Catch: java.lang.Throwable -> L65
        L65:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.C0555a.m2788q(bf.a, long, boolean):void");
    }

    /* renamed from: k */
    public final void m2789k() {
        if (this.f2497e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long m2919h = m2919h();
        boolean mo2882e = mo2882e();
        if (m2919h != 0 || mo2882e) {
            this.f2497e = true;
            m2788q(this, m2919h, mo2882e);
        }
    }

    /* renamed from: l */
    public final IOException m2790l(IOException iOException) {
        return !m2792n() ? iOException : mo2793o(iOException);
    }

    /* renamed from: m */
    public final void m2791m(boolean z10) {
        if (m2792n() && z10) {
            throw mo2793o(null);
        }
    }

    /* renamed from: n */
    public final boolean m2792n() {
        if (!this.f2497e) {
            return false;
        }
        this.f2497e = false;
        return m2787j(this);
    }

    /* renamed from: o */
    public IOException mo2793o(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: p */
    public final long m2794p(long j10) {
        return this.f2499g - j10;
    }

    /* renamed from: r */
    public final InterfaceC0573s m2795r(InterfaceC0573s interfaceC0573s) {
        return new a(interfaceC0573s);
    }

    /* renamed from: s */
    public final InterfaceC0574t m2796s(InterfaceC0574t interfaceC0574t) {
        return new b(interfaceC0574t);
    }

    /* renamed from: t */
    public void mo2797t() {
    }
}
