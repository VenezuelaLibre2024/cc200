package p289u3;

import android.os.Handler;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p289u3.InterfaceC4836s;
import p304v3.C5108e;
import p304v3.C5112i;

/* renamed from: u3.s */
/* loaded from: classes.dex */
public interface InterfaceC4836s {

    /* renamed from: u3.s$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Handler f18138a;

        /* renamed from: b */
        public final InterfaceC4836s f18139b;

        public a(Handler handler, InterfaceC4836s interfaceC4836s) {
            this.f18138a = interfaceC4836s != null ? (Handler) C4014a.m15199e(handler) : null;
            this.f18139b = interfaceC4836s;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A */
        public /* synthetic */ void m19122A(int i10, long j10, long j11) {
            ((InterfaceC4836s) C4041n0.m15463j(this.f18139b)).mo17853q(i10, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m19133r(Exception exc) {
            ((InterfaceC4836s) C4041n0.m15463j(this.f18139b)).mo17852n(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m19134s(Exception exc) {
            ((InterfaceC4836s) C4041n0.m15463j(this.f18139b)).mo17845a(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m19135t(String str, long j10, long j11) {
            ((InterfaceC4836s) C4041n0.m15463j(this.f18139b)).mo17848h(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m19136u(String str) {
            ((InterfaceC4836s) C4041n0.m15463j(this.f18139b)).mo17847g(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m19137v(C5108e c5108e) {
            c5108e.m20760c();
            ((InterfaceC4836s) C4041n0.m15463j(this.f18139b)).mo17849j(c5108e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m19138w(C5108e c5108e) {
            ((InterfaceC4836s) C4041n0.m15463j(this.f18139b)).mo17851m(c5108e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m19139x(C4463m1 c4463m1, C5112i c5112i) {
            ((InterfaceC4836s) C4041n0.m15463j(this.f18139b)).m19121t(c4463m1);
            ((InterfaceC4836s) C4041n0.m15463j(this.f18139b)).mo17846e(c4463m1, c5112i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public /* synthetic */ void m19140y(long j10) {
            ((InterfaceC4836s) C4041n0.m15463j(this.f18139b)).mo17850l(j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public /* synthetic */ void m19141z(boolean z10) {
            ((InterfaceC4836s) C4041n0.m15463j(this.f18139b)).onSkipSilenceEnabledChanged(z10);
        }

        /* renamed from: B */
        public void m19142B(final long j10) {
            Handler handler = this.f18138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u3.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4836s.a.this.m19140y(j10);
                    }
                });
            }
        }

        /* renamed from: C */
        public void m19143C(final boolean z10) {
            Handler handler = this.f18138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u3.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4836s.a.this.m19141z(z10);
                    }
                });
            }
        }

        /* renamed from: D */
        public void m19144D(final int i10, final long j10, final long j11) {
            Handler handler = this.f18138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u3.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4836s.a.this.m19122A(i10, j10, j11);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m19145k(final Exception exc) {
            Handler handler = this.f18138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4836s.a.this.m19133r(exc);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m19146l(final Exception exc) {
            Handler handler = this.f18138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4836s.a.this.m19134s(exc);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m19147m(final String str, final long j10, final long j11) {
            Handler handler = this.f18138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u3.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4836s.a.this.m19135t(str, j10, j11);
                    }
                });
            }
        }

        /* renamed from: n */
        public void m19148n(final String str) {
            Handler handler = this.f18138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u3.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4836s.a.this.m19136u(str);
                    }
                });
            }
        }

        /* renamed from: o */
        public void m19149o(final C5108e c5108e) {
            c5108e.m20760c();
            Handler handler = this.f18138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u3.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4836s.a.this.m19137v(c5108e);
                    }
                });
            }
        }

        /* renamed from: p */
        public void m19150p(final C5108e c5108e) {
            Handler handler = this.f18138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u3.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4836s.a.this.m19138w(c5108e);
                    }
                });
            }
        }

        /* renamed from: q */
        public void m19151q(final C4463m1 c4463m1, final C5112i c5112i) {
            Handler handler = this.f18138a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: u3.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4836s.a.this.m19139x(c4463m1, c5112i);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    default void mo17845a(Exception exc) {
    }

    /* renamed from: e */
    default void mo17846e(C4463m1 c4463m1, C5112i c5112i) {
    }

    /* renamed from: g */
    default void mo17847g(String str) {
    }

    /* renamed from: h */
    default void mo17848h(String str, long j10, long j11) {
    }

    /* renamed from: j */
    default void mo17849j(C5108e c5108e) {
    }

    /* renamed from: l */
    default void mo17850l(long j10) {
    }

    /* renamed from: m */
    default void mo17851m(C5108e c5108e) {
    }

    /* renamed from: n */
    default void mo17852n(Exception exc) {
    }

    default void onSkipSilenceEnabledChanged(boolean z10) {
    }

    /* renamed from: q */
    default void mo17853q(int i10, long j10, long j11) {
    }

    @Deprecated
    /* renamed from: t */
    default void m19121t(C4463m1 c4463m1) {
    }
}
