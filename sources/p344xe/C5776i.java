package p344xe;

import bf.C0555a;
import bf.C0557c;
import bf.C0575u;
import bf.InterfaceC0559e;
import bf.InterfaceC0573s;
import bf.InterfaceC0574t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import re.C4373u;
import se.C4596e;

/* renamed from: xe.i */
/* loaded from: classes2.dex */
public final class C5776i {

    /* renamed from: a */
    public long f21488a = 0;

    /* renamed from: b */
    public long f21489b;

    /* renamed from: c */
    public final int f21490c;

    /* renamed from: d */
    public final C5773f f21491d;

    /* renamed from: e */
    public final Deque<C4373u> f21492e;

    /* renamed from: f */
    public boolean f21493f;

    /* renamed from: g */
    public final b f21494g;

    /* renamed from: h */
    public final a f21495h;

    /* renamed from: i */
    public final c f21496i;

    /* renamed from: j */
    public final c f21497j;

    /* renamed from: k */
    public EnumC5769b f21498k;

    /* renamed from: l */
    public IOException f21499l;

    /* renamed from: xe.i$a */
    /* loaded from: classes2.dex */
    public final class a implements InterfaceC0573s {

        /* renamed from: h */
        public final C0557c f21500h = new C0557c();

        /* renamed from: i */
        public C4373u f21501i;

        /* renamed from: j */
        public boolean f21502j;

        /* renamed from: k */
        public boolean f21503k;

        public a() {
        }

        @Override // bf.InterfaceC0573s
        /* renamed from: C0 */
        public void mo2798C0(C0557c c0557c, long j10) {
            this.f21500h.mo2798C0(c0557c, j10);
            while (this.f21500h.m2831g0() >= 16384) {
                m23031a(false);
            }
        }

        /* renamed from: a */
        public final void m23031a(boolean z10) {
            C5776i c5776i;
            long min;
            C5776i c5776i2;
            boolean z11;
            synchronized (C5776i.this) {
                C5776i.this.f21497j.m2789k();
                while (true) {
                    try {
                        c5776i = C5776i.this;
                        if (c5776i.f21489b > 0 || this.f21503k || this.f21502j || c5776i.f21498k != null) {
                            break;
                        } else {
                            c5776i.m23029q();
                        }
                    } finally {
                        C5776i.this.f21497j.m23035u();
                    }
                }
                c5776i.f21497j.m23035u();
                C5776i.this.m23015c();
                min = Math.min(C5776i.this.f21489b, this.f21500h.m2831g0());
                c5776i2 = C5776i.this;
                c5776i2.f21489b -= min;
            }
            c5776i2.f21497j.m2789k();
            if (z10) {
                try {
                    if (min == this.f21500h.m2831g0()) {
                        z11 = true;
                        boolean z12 = z11;
                        C5776i c5776i3 = C5776i.this;
                        c5776i3.f21491d.m22956H0(c5776i3.f21490c, z12, this.f21500h, min);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z11 = false;
            boolean z122 = z11;
            C5776i c5776i32 = C5776i.this;
            c5776i32.f21491d.m22956H0(c5776i32.f21490c, z122, this.f21500h, min);
        }

        @Override // bf.InterfaceC0573s
        /* renamed from: c */
        public C0575u mo2799c() {
            return C5776i.this.f21497j;
        }

        @Override // bf.InterfaceC0573s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (C5776i.this) {
                if (this.f21502j) {
                    return;
                }
                if (!C5776i.this.f21495h.f21503k) {
                    boolean z10 = this.f21500h.m2831g0() > 0;
                    if (this.f21501i != null) {
                        while (this.f21500h.m2831g0() > 0) {
                            m23031a(false);
                        }
                        C5776i c5776i = C5776i.this;
                        c5776i.f21491d.m22957I0(c5776i.f21490c, true, C4596e.m18089I(this.f21501i));
                    } else if (z10) {
                        while (this.f21500h.m2831g0() > 0) {
                            m23031a(true);
                        }
                    } else {
                        C5776i c5776i2 = C5776i.this;
                        c5776i2.f21491d.m22956H0(c5776i2.f21490c, true, null, 0L);
                    }
                }
                synchronized (C5776i.this) {
                    this.f21502j = true;
                }
                C5776i.this.f21491d.flush();
                C5776i.this.m23014b();
            }
        }

        @Override // bf.InterfaceC0573s, java.io.Flushable
        public void flush() {
            synchronized (C5776i.this) {
                C5776i.this.m23015c();
            }
            while (this.f21500h.m2831g0() > 0) {
                m23031a(false);
                C5776i.this.f21491d.flush();
            }
        }
    }

    /* renamed from: xe.i$b */
    /* loaded from: classes2.dex */
    public final class b implements InterfaceC0574t {

        /* renamed from: h */
        public final C0557c f21505h = new C0557c();

        /* renamed from: i */
        public final C0557c f21506i = new C0557c();

        /* renamed from: j */
        public final long f21507j;

        /* renamed from: k */
        public C4373u f21508k;

        /* renamed from: l */
        public boolean f21509l;

        /* renamed from: m */
        public boolean f21510m;

        public b(long j10) {
            this.f21507j = j10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
        
            r12 = -1;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
        @Override // bf.InterfaceC0574t
        /* renamed from: T */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long mo2800T(bf.C0557c r12, long r13) {
            /*
                r11 = this;
                r0 = 0
                int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r2 < 0) goto La8
            L6:
                r2 = 0
                xe.i r3 = p344xe.C5776i.this
                monitor-enter(r3)
                xe.i r4 = p344xe.C5776i.this     // Catch: java.lang.Throwable -> La5
                xe.i$c r4 = r4.f21496i     // Catch: java.lang.Throwable -> La5
                r4.m2789k()     // Catch: java.lang.Throwable -> La5
                xe.i r4 = p344xe.C5776i.this     // Catch: java.lang.Throwable -> L9c
                xe.b r5 = r4.f21498k     // Catch: java.lang.Throwable -> L9c
                if (r5 == 0) goto L25
                java.io.IOException r2 = r4.f21499l     // Catch: java.lang.Throwable -> L9c
                if (r2 == 0) goto L1c
                goto L25
            L1c:
                xe.n r2 = new xe.n     // Catch: java.lang.Throwable -> L9c
                xe.i r4 = p344xe.C5776i.this     // Catch: java.lang.Throwable -> L9c
                xe.b r4 = r4.f21498k     // Catch: java.lang.Throwable -> L9c
                r2.<init>(r4)     // Catch: java.lang.Throwable -> L9c
            L25:
                boolean r4 = r11.f21509l     // Catch: java.lang.Throwable -> L9c
                if (r4 != 0) goto L94
                bf.c r4 = r11.f21506i     // Catch: java.lang.Throwable -> L9c
                long r4 = r4.m2831g0()     // Catch: java.lang.Throwable -> L9c
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                r5 = -1
                if (r4 <= 0) goto L6b
                bf.c r4 = r11.f21506i     // Catch: java.lang.Throwable -> L9c
                long r7 = r4.m2831g0()     // Catch: java.lang.Throwable -> L9c
                long r13 = java.lang.Math.min(r13, r7)     // Catch: java.lang.Throwable -> L9c
                long r12 = r4.mo2800T(r12, r13)     // Catch: java.lang.Throwable -> L9c
                xe.i r14 = p344xe.C5776i.this     // Catch: java.lang.Throwable -> L9c
                long r7 = r14.f21488a     // Catch: java.lang.Throwable -> L9c
                long r7 = r7 + r12
                r14.f21488a = r7     // Catch: java.lang.Throwable -> L9c
                if (r2 != 0) goto L80
                xe.f r14 = r14.f21491d     // Catch: java.lang.Throwable -> L9c
                xe.m r14 = r14.f21400A     // Catch: java.lang.Throwable -> L9c
                int r14 = r14.m23064d()     // Catch: java.lang.Throwable -> L9c
                int r14 = r14 / 2
                long r9 = (long) r14     // Catch: java.lang.Throwable -> L9c
                int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r14 < 0) goto L80
                xe.i r14 = p344xe.C5776i.this     // Catch: java.lang.Throwable -> L9c
                xe.f r4 = r14.f21491d     // Catch: java.lang.Throwable -> L9c
                int r7 = r14.f21490c     // Catch: java.lang.Throwable -> L9c
                long r8 = r14.f21488a     // Catch: java.lang.Throwable -> L9c
                r4.m22961M0(r7, r8)     // Catch: java.lang.Throwable -> L9c
                xe.i r14 = p344xe.C5776i.this     // Catch: java.lang.Throwable -> L9c
                r14.f21488a = r0     // Catch: java.lang.Throwable -> L9c
                goto L80
            L6b:
                boolean r4 = r11.f21510m     // Catch: java.lang.Throwable -> L9c
                if (r4 != 0) goto L7f
                if (r2 != 0) goto L7f
                xe.i r2 = p344xe.C5776i.this     // Catch: java.lang.Throwable -> L9c
                r2.m23029q()     // Catch: java.lang.Throwable -> L9c
                xe.i r2 = p344xe.C5776i.this     // Catch: java.lang.Throwable -> La5
                xe.i$c r2 = r2.f21496i     // Catch: java.lang.Throwable -> La5
                r2.m23035u()     // Catch: java.lang.Throwable -> La5
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La5
                goto L6
            L7f:
                r12 = r5
            L80:
                xe.i r14 = p344xe.C5776i.this     // Catch: java.lang.Throwable -> La5
                xe.i$c r14 = r14.f21496i     // Catch: java.lang.Throwable -> La5
                r14.m23035u()     // Catch: java.lang.Throwable -> La5
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La5
                int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r14 == 0) goto L90
                r11.m23034f(r12)
                return r12
            L90:
                if (r2 != 0) goto L93
                return r5
            L93:
                throw r2
            L94:
                java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L9c
                java.lang.String r13 = "stream closed"
                r12.<init>(r13)     // Catch: java.lang.Throwable -> L9c
                throw r12     // Catch: java.lang.Throwable -> L9c
            L9c:
                r12 = move-exception
                xe.i r13 = p344xe.C5776i.this     // Catch: java.lang.Throwable -> La5
                xe.i$c r13 = r13.f21496i     // Catch: java.lang.Throwable -> La5
                r13.m23035u()     // Catch: java.lang.Throwable -> La5
                throw r12     // Catch: java.lang.Throwable -> La5
            La5:
                r12 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> La5
                throw r12
            La8:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "byteCount < 0: "
                r0.append(r1)
                r0.append(r13)
                java.lang.String r13 = r0.toString()
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p344xe.C5776i.b.mo2800T(bf.c, long):long");
        }

        @Override // bf.InterfaceC0574t
        /* renamed from: c */
        public C0575u mo2801c() {
            return C5776i.this.f21496i;
        }

        @Override // bf.InterfaceC0574t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long m2831g0;
            synchronized (C5776i.this) {
                this.f21509l = true;
                m2831g0 = this.f21506i.m2831g0();
                this.f21506i.m2829f();
                C5776i.this.notifyAll();
            }
            if (m2831g0 > 0) {
                m23034f(m2831g0);
            }
            C5776i.this.m23014b();
        }

        /* renamed from: d */
        public void m23033d(InterfaceC0559e interfaceC0559e, long j10) {
            boolean z10;
            boolean z11;
            boolean z12;
            long j11;
            while (j10 > 0) {
                synchronized (C5776i.this) {
                    z10 = this.f21510m;
                    z11 = true;
                    z12 = this.f21506i.m2831g0() + j10 > this.f21507j;
                }
                if (z12) {
                    interfaceC0559e.mo2827e(j10);
                    C5776i.this.m23018f(EnumC5769b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    interfaceC0559e.mo2827e(j10);
                    return;
                }
                long mo2800T = interfaceC0559e.mo2800T(this.f21505h, j10);
                if (mo2800T == -1) {
                    throw new EOFException();
                }
                j10 -= mo2800T;
                synchronized (C5776i.this) {
                    if (this.f21509l) {
                        j11 = this.f21505h.m2831g0();
                        this.f21505h.m2829f();
                    } else {
                        if (this.f21506i.m2831g0() != 0) {
                            z11 = false;
                        }
                        this.f21506i.m2847u0(this.f21505h);
                        if (z11) {
                            C5776i.this.notifyAll();
                        }
                        j11 = 0;
                    }
                }
                if (j11 > 0) {
                    m23034f(j11);
                }
            }
        }

        /* renamed from: f */
        public final void m23034f(long j10) {
            C5776i.this.f21491d.m22955G0(j10);
        }
    }

    /* renamed from: xe.i$c */
    /* loaded from: classes2.dex */
    public class c extends C0555a {
        public c() {
        }

        @Override // bf.C0555a
        /* renamed from: o */
        public IOException mo2793o(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // bf.C0555a
        /* renamed from: t */
        public void mo2797t() {
            C5776i.this.m23018f(EnumC5769b.CANCEL);
            C5776i.this.f21491d.m22976v0();
        }

        /* renamed from: u */
        public void m23035u() {
            if (m2792n()) {
                throw mo2793o(null);
            }
        }
    }

    public C5776i(int i10, C5773f c5773f, boolean z10, boolean z11, C4373u c4373u) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f21492e = arrayDeque;
        this.f21496i = new c();
        this.f21497j = new c();
        Objects.requireNonNull(c5773f, "connection == null");
        this.f21490c = i10;
        this.f21491d = c5773f;
        this.f21489b = c5773f.f21401B.m23064d();
        b bVar = new b(c5773f.f21400A.m23064d());
        this.f21494g = bVar;
        a aVar = new a();
        this.f21495h = aVar;
        bVar.f21510m = z11;
        aVar.f21503k = z10;
        if (c4373u != null) {
            arrayDeque.add(c4373u);
        }
        if (m23022j() && c4373u != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!m23022j() && c4373u == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* renamed from: a */
    public void m23013a(long j10) {
        this.f21489b += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public void m23014b() {
        boolean z10;
        boolean m23023k;
        synchronized (this) {
            b bVar = this.f21494g;
            if (!bVar.f21510m && bVar.f21509l) {
                a aVar = this.f21495h;
                if (aVar.f21503k || aVar.f21502j) {
                    z10 = true;
                    m23023k = m23023k();
                }
            }
            z10 = false;
            m23023k = m23023k();
        }
        if (z10) {
            m23016d(EnumC5769b.CANCEL, null);
        } else {
            if (m23023k) {
                return;
            }
            this.f21491d.m22975u0(this.f21490c);
        }
    }

    /* renamed from: c */
    public void m23015c() {
        a aVar = this.f21495h;
        if (aVar.f21502j) {
            throw new IOException("stream closed");
        }
        if (aVar.f21503k) {
            throw new IOException("stream finished");
        }
        if (this.f21498k != null) {
            IOException iOException = this.f21499l;
            if (iOException == null) {
                throw new C5781n(this.f21498k);
            }
        }
    }

    /* renamed from: d */
    public void m23016d(EnumC5769b enumC5769b, IOException iOException) {
        if (m23017e(enumC5769b, iOException)) {
            this.f21491d.m22959K0(this.f21490c, enumC5769b);
        }
    }

    /* renamed from: e */
    public final boolean m23017e(EnumC5769b enumC5769b, IOException iOException) {
        synchronized (this) {
            if (this.f21498k != null) {
                return false;
            }
            if (this.f21494g.f21510m && this.f21495h.f21503k) {
                return false;
            }
            this.f21498k = enumC5769b;
            this.f21499l = iOException;
            notifyAll();
            this.f21491d.m22975u0(this.f21490c);
            return true;
        }
    }

    /* renamed from: f */
    public void m23018f(EnumC5769b enumC5769b) {
        if (m23017e(enumC5769b, null)) {
            this.f21491d.m22960L0(this.f21490c, enumC5769b);
        }
    }

    /* renamed from: g */
    public int m23019g() {
        return this.f21490c;
    }

    /* renamed from: h */
    public InterfaceC0573s m23020h() {
        synchronized (this) {
            if (!this.f21493f && !m23022j()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f21495h;
    }

    /* renamed from: i */
    public InterfaceC0574t m23021i() {
        return this.f21494g;
    }

    /* renamed from: j */
    public boolean m23022j() {
        return this.f21491d.f21406h == ((this.f21490c & 1) == 1);
    }

    /* renamed from: k */
    public synchronized boolean m23023k() {
        if (this.f21498k != null) {
            return false;
        }
        b bVar = this.f21494g;
        if (bVar.f21510m || bVar.f21509l) {
            a aVar = this.f21495h;
            if (aVar.f21503k || aVar.f21502j) {
                if (this.f21493f) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: l */
    public C0575u m23024l() {
        return this.f21496i;
    }

    /* renamed from: m */
    public void m23025m(InterfaceC0559e interfaceC0559e, int i10) {
        this.f21494g.m23033d(interfaceC0559e, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0009, B:9:0x0018, B:10:0x001c, B:11:0x0023, B:18:0x000f), top: B:2:0x0001 }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m23026n(re.C4373u r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f21493f     // Catch: java.lang.Throwable -> L2e
            r1 = 1
            if (r0 == 0) goto Lf
            if (r4 != 0) goto L9
            goto Lf
        L9:
            xe.i$b r0 = r2.f21494g     // Catch: java.lang.Throwable -> L2e
            p344xe.C5776i.b.m23032a(r0, r3)     // Catch: java.lang.Throwable -> L2e
            goto L16
        Lf:
            r2.f21493f = r1     // Catch: java.lang.Throwable -> L2e
            java.util.Deque<re.u> r0 = r2.f21492e     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
        L16:
            if (r4 == 0) goto L1c
            xe.i$b r3 = r2.f21494g     // Catch: java.lang.Throwable -> L2e
            r3.f21510m = r1     // Catch: java.lang.Throwable -> L2e
        L1c:
            boolean r3 = r2.m23023k()     // Catch: java.lang.Throwable -> L2e
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L2d
            xe.f r3 = r2.f21491d
            int r4 = r2.f21490c
            r3.m22975u0(r4)
        L2d:
            return
        L2e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p344xe.C5776i.m23026n(re.u, boolean):void");
    }

    /* renamed from: o */
    public synchronized void m23027o(EnumC5769b enumC5769b) {
        if (this.f21498k == null) {
            this.f21498k = enumC5769b;
            notifyAll();
        }
    }

    /* renamed from: p */
    public synchronized C4373u m23028p() {
        this.f21496i.m2789k();
        while (this.f21492e.isEmpty() && this.f21498k == null) {
            try {
                m23029q();
            } catch (Throwable th) {
                this.f21496i.m23035u();
                throw th;
            }
        }
        this.f21496i.m23035u();
        if (this.f21492e.isEmpty()) {
            IOException iOException = this.f21499l;
            if (iOException != null) {
                throw iOException;
            }
            throw new C5781n(this.f21498k);
        }
        return this.f21492e.removeFirst();
    }

    /* renamed from: q */
    public void m23029q() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: r */
    public C0575u m23030r() {
        return this.f21497j;
    }
}
