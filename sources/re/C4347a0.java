package re;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import p299ue.C5023k;
import se.AbstractRunnableC4593b;
import ye.C5926f;

/* renamed from: re.a0 */
/* loaded from: classes2.dex */
public final class C4347a0 implements InterfaceC4354e {

    /* renamed from: h */
    public final C4377y f15705h;

    /* renamed from: i */
    public C5023k f15706i;

    /* renamed from: j */
    public final C4349b0 f15707j;

    /* renamed from: k */
    public final boolean f15708k;

    /* renamed from: l */
    public boolean f15709l;

    /* renamed from: re.a0$a */
    /* loaded from: classes2.dex */
    public final class a extends AbstractRunnableC4593b {

        /* renamed from: i */
        public final InterfaceC4356f f15710i;

        /* renamed from: j */
        public volatile AtomicInteger f15711j;

        /* renamed from: k */
        public final /* synthetic */ C4347a0 f15712k;

        @Override // se.AbstractRunnableC4593b
        /* renamed from: k */
        public void mo16654k() {
            boolean z10;
            Throwable th;
            IOException e10;
            this.f15712k.f15706i.m19738p();
            try {
                try {
                    z10 = true;
                } catch (IOException e11) {
                    z10 = false;
                    e10 = e11;
                } catch (Throwable th2) {
                    z10 = false;
                    th = th2;
                }
                try {
                    this.f15710i.m16735a(this.f15712k, this.f15712k.m16650f());
                } catch (IOException e12) {
                    e10 = e12;
                    if (z10) {
                        C5926f.m23671l().mo23653s(4, "Callback failure for " + this.f15712k.m16653k(), e10);
                    } else {
                        this.f15710i.m16736b(this.f15712k, e10);
                    }
                    this.f15712k.f15705h.m16908k().m16787e(this);
                } catch (Throwable th3) {
                    th = th3;
                    this.f15712k.m16647c();
                    if (!z10) {
                        IOException iOException = new IOException("canceled due to " + th);
                        iOException.addSuppressed(th);
                        this.f15710i.m16736b(this.f15712k, iOException);
                    }
                    throw th;
                }
                this.f15712k.f15705h.m16908k().m16787e(this);
            } catch (Throwable th4) {
                this.f15712k.f15705h.m16908k().m16787e(this);
                throw th4;
            }
        }

        /* renamed from: l */
        public AtomicInteger m16655l() {
            return this.f15711j;
        }

        /* renamed from: m */
        public void m16656m(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    this.f15712k.f15706i.m19734l(interruptedIOException);
                    this.f15710i.m16736b(this.f15712k, interruptedIOException);
                    this.f15712k.f15705h.m16908k().m16787e(this);
                }
            } catch (Throwable th) {
                this.f15712k.f15705h.m16908k().m16787e(this);
                throw th;
            }
        }

        /* renamed from: n */
        public C4347a0 m16657n() {
            return this.f15712k;
        }
    }

    public C4347a0(C4377y c4377y, C4349b0 c4349b0, boolean z10) {
        this.f15705h = c4377y;
        this.f15707j = c4349b0;
        this.f15708k = z10;
    }

    /* renamed from: h */
    public static C4347a0 m16646h(C4377y c4377y, C4349b0 c4349b0, boolean z10) {
        C4347a0 c4347a0 = new C4347a0(c4377y, c4349b0, z10);
        c4347a0.f15706i = new C5023k(c4377y, c4347a0);
        return c4347a0;
    }

    /* renamed from: c */
    public void m16647c() {
        this.f15706i.m19726d();
    }

    @Override // re.InterfaceC4354e
    /* renamed from: d */
    public C4353d0 mo16648d() {
        synchronized (this) {
            if (this.f15709l) {
                throw new IllegalStateException("Already Executed");
            }
            this.f15709l = true;
        }
        this.f15706i.m19738p();
        this.f15706i.m19724b();
        try {
            this.f15705h.m16908k().m16784b(this);
            return m16650f();
        } finally {
            this.f15705h.m16908k().m16788f(this);
        }
    }

    /* renamed from: e */
    public C4347a0 clone() {
        return m16646h(this.f15705h, this.f15707j, this.f15708k);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public re.C4353d0 m16650f() {
        /*
            r12 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            re.y r0 = r12.f15705h
            java.util.List r0 = r0.m16914q()
            r1.addAll(r0)
            ve.j r0 = new ve.j
            re.y r2 = r12.f15705h
            r0.<init>(r2)
            r1.add(r0)
            ve.a r0 = new ve.a
            re.y r2 = r12.f15705h
            re.n r2 = r2.m16907i()
            r0.<init>(r2)
            r1.add(r0)
            te.a r0 = new te.a
            re.y r2 = r12.f15705h
            te.d r2 = r2.m16915r()
            r0.<init>(r2)
            r1.add(r0)
            ue.a r0 = new ue.a
            re.y r2 = r12.f15705h
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r12.f15708k
            if (r0 != 0) goto L4b
            re.y r0 = r12.f15705h
            java.util.List r0 = r0.m16916s()
            r1.addAll(r0)
        L4b:
            ve.b r0 = new ve.b
            boolean r2 = r12.f15708k
            r0.<init>(r2)
            r1.add(r0)
            ve.g r10 = new ve.g
            ue.k r2 = r12.f15706i
            r3 = 0
            r4 = 0
            re.b0 r5 = r12.f15707j
            re.y r0 = r12.f15705h
            int r7 = r0.m16904f()
            re.y r0 = r12.f15705h
            int r8 = r0.m16896A()
            re.y r0 = r12.f15705h
            int r9 = r0.m16900F()
            r0 = r10
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            re.b0 r2 = r12.f15707j     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            re.d0 r2 = r10.mo16892c(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            ue.k r3 = r12.f15706i     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            boolean r3 = r3.m19731i()     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            if (r3 != 0) goto L8a
            ue.k r0 = r12.f15706i
            r0.m19734l(r1)
            return r2
        L8a:
            se.C4596e.m18098f(r2)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
            throw r2     // Catch: java.lang.Throwable -> L95 java.io.IOException -> L97
        L95:
            r2 = move-exception
            goto La4
        L97:
            r0 = move-exception
            r2 = 1
            ue.k r3 = r12.f15706i     // Catch: java.lang.Throwable -> La0
            java.io.IOException r0 = r3.m19734l(r0)     // Catch: java.lang.Throwable -> La0
            throw r0     // Catch: java.lang.Throwable -> La0
        La0:
            r0 = move-exception
            r11 = r2
            r2 = r0
            r0 = r11
        La4:
            if (r0 != 0) goto Lab
            ue.k r0 = r12.f15706i
            r0.m19734l(r1)
        Lab:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: re.C4347a0.m16650f():re.d0");
    }

    /* renamed from: g */
    public boolean m16651g() {
        return this.f15706i.m19731i();
    }

    /* renamed from: i */
    public String m16652i() {
        return this.f15707j.m16666h().m16868z();
    }

    /* renamed from: k */
    public String m16653k() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m16651g() ? "canceled " : "");
        sb2.append(this.f15708k ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(m16652i());
        return sb2.toString();
    }
}
