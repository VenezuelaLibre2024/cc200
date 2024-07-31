package p236q5;

import android.os.Handler;
import android.os.SystemClock;
import p222p5.C4014a;
import p222p5.C4041n0;
import p236q5.InterfaceC4190w;
import p264s3.C4463m1;
import p304v3.C5108e;
import p304v3.C5112i;

/* renamed from: q5.w */
/* loaded from: classes.dex */
public interface InterfaceC4190w {

    /* renamed from: q5.w$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final Handler f15130a;

        /* renamed from: b */
        public final InterfaceC4190w f15131b;

        public a(Handler handler, InterfaceC4190w interfaceC4190w) {
            this.f15130a = interfaceC4190w != null ? (Handler) C4014a.m15199e(handler) : null;
            this.f15131b = interfaceC4190w;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m16153q(String str, long j10, long j11) {
            ((InterfaceC4190w) C4041n0.m15463j(this.f15131b)).mo16136d(str, j10, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m16154r(String str) {
            ((InterfaceC4190w) C4041n0.m15463j(this.f15131b)).mo16134b(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public /* synthetic */ void m16155s(C5108e c5108e) {
            c5108e.m20760c();
            ((InterfaceC4190w) C4041n0.m15463j(this.f15131b)).mo16141p(c5108e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m16156t(int i10, long j10) {
            ((InterfaceC4190w) C4041n0.m15463j(this.f15131b)).mo16138i(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u */
        public /* synthetic */ void m16157u(C5108e c5108e) {
            ((InterfaceC4190w) C4041n0.m15463j(this.f15131b)).mo16137f(c5108e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m16158v(C4463m1 c4463m1, C5112i c5112i) {
            ((InterfaceC4190w) C4041n0.m15463j(this.f15131b)).m16133A(c4463m1);
            ((InterfaceC4190w) C4041n0.m15463j(this.f15131b)).mo16135c(c4463m1, c5112i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public /* synthetic */ void m16159w(Object obj, long j10) {
            ((InterfaceC4190w) C4041n0.m15463j(this.f15131b)).mo16139k(obj, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m16160x(long j10, int i10) {
            ((InterfaceC4190w) C4041n0.m15463j(this.f15131b)).mo16142r(j10, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y */
        public /* synthetic */ void m16161y(Exception exc) {
            ((InterfaceC4190w) C4041n0.m15463j(this.f15131b)).mo16140o(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: z */
        public /* synthetic */ void m16162z(C4192y c4192y) {
            ((InterfaceC4190w) C4041n0.m15463j(this.f15131b)).onVideoSizeChanged(c4192y);
        }

        /* renamed from: A */
        public void m16163A(final Object obj) {
            if (this.f15130a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f15130a.post(new Runnable() { // from class: q5.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4190w.a.this.m16159w(obj, elapsedRealtime);
                    }
                });
            }
        }

        /* renamed from: B */
        public void m16164B(final long j10, final int i10) {
            Handler handler = this.f15130a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q5.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4190w.a.this.m16160x(j10, i10);
                    }
                });
            }
        }

        /* renamed from: C */
        public void m16165C(final Exception exc) {
            Handler handler = this.f15130a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q5.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4190w.a.this.m16161y(exc);
                    }
                });
            }
        }

        /* renamed from: D */
        public void m16166D(final C4192y c4192y) {
            Handler handler = this.f15130a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q5.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4190w.a.this.m16162z(c4192y);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m16167k(final String str, final long j10, final long j11) {
            Handler handler = this.f15130a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q5.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4190w.a.this.m16153q(str, j10, j11);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m16168l(final String str) {
            Handler handler = this.f15130a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q5.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4190w.a.this.m16154r(str);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m16169m(final C5108e c5108e) {
            c5108e.m20760c();
            Handler handler = this.f15130a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q5.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4190w.a.this.m16155s(c5108e);
                    }
                });
            }
        }

        /* renamed from: n */
        public void m16170n(final int i10, final long j10) {
            Handler handler = this.f15130a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q5.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4190w.a.this.m16156t(i10, j10);
                    }
                });
            }
        }

        /* renamed from: o */
        public void m16171o(final C5108e c5108e) {
            Handler handler = this.f15130a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q5.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4190w.a.this.m16157u(c5108e);
                    }
                });
            }
        }

        /* renamed from: p */
        public void m16172p(final C4463m1 c4463m1, final C5112i c5112i) {
            Handler handler = this.f15130a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: q5.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4190w.a.this.m16158v(c4463m1, c5112i);
                    }
                });
            }
        }
    }

    @Deprecated
    /* renamed from: A */
    default void m16133A(C4463m1 c4463m1) {
    }

    /* renamed from: b */
    default void mo16134b(String str) {
    }

    /* renamed from: c */
    default void mo16135c(C4463m1 c4463m1, C5112i c5112i) {
    }

    /* renamed from: d */
    default void mo16136d(String str, long j10, long j11) {
    }

    /* renamed from: f */
    default void mo16137f(C5108e c5108e) {
    }

    /* renamed from: i */
    default void mo16138i(int i10, long j10) {
    }

    /* renamed from: k */
    default void mo16139k(Object obj, long j10) {
    }

    /* renamed from: o */
    default void mo16140o(Exception exc) {
    }

    default void onVideoSizeChanged(C4192y c4192y) {
    }

    /* renamed from: p */
    default void mo16141p(C5108e c5108e) {
    }

    /* renamed from: r */
    default void mo16142r(long j10, int i10) {
    }
}
