package p317w3;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p222p5.C4014a;
import p222p5.C4041n0;
import p290u4.InterfaceC4882t;
import p317w3.InterfaceC5255u;

/* renamed from: w3.u */
/* loaded from: classes.dex */
public interface InterfaceC5255u {

    /* renamed from: w3.u$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f19929a;

        /* renamed from: b */
        public final InterfaceC4882t.b f19930b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<C6212a> f19931c;

        /* renamed from: w3.u$a$a */
        /* loaded from: classes.dex */
        public static final class C6212a {

            /* renamed from: a */
            public Handler f19932a;

            /* renamed from: b */
            public InterfaceC5255u f19933b;

            public C6212a(Handler handler, InterfaceC5255u interfaceC5255u) {
                this.f19932a = handler;
                this.f19933b = interfaceC5255u;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a(CopyOnWriteArrayList<C6212a> copyOnWriteArrayList, int i10, InterfaceC4882t.b bVar) {
            this.f19931c = copyOnWriteArrayList;
            this.f19929a = i10;
            this.f19930b = bVar;
        }

        /* renamed from: n */
        public /* synthetic */ void m21277n(InterfaceC5255u interfaceC5255u) {
            interfaceC5255u.mo17586s(this.f19929a, this.f19930b);
        }

        /* renamed from: o */
        public /* synthetic */ void m21278o(InterfaceC5255u interfaceC5255u) {
            interfaceC5255u.mo17578A(this.f19929a, this.f19930b);
        }

        /* renamed from: p */
        public /* synthetic */ void m21279p(InterfaceC5255u interfaceC5255u) {
            interfaceC5255u.mo17579E(this.f19929a, this.f19930b);
        }

        /* renamed from: q */
        public /* synthetic */ void m21280q(InterfaceC5255u interfaceC5255u, int i10) {
            interfaceC5255u.m21270x(this.f19929a, this.f19930b);
            interfaceC5255u.mo17581G(this.f19929a, this.f19930b, i10);
        }

        /* renamed from: r */
        public /* synthetic */ void m21281r(InterfaceC5255u interfaceC5255u, Exception exc) {
            interfaceC5255u.mo17580F(this.f19929a, this.f19930b, exc);
        }

        /* renamed from: s */
        public /* synthetic */ void m21282s(InterfaceC5255u interfaceC5255u) {
            interfaceC5255u.mo17587t(this.f19929a, this.f19930b);
        }

        /* renamed from: g */
        public void m21283g(Handler handler, InterfaceC5255u interfaceC5255u) {
            C4014a.m15199e(handler);
            C4014a.m15199e(interfaceC5255u);
            this.f19931c.add(new C6212a(handler, interfaceC5255u));
        }

        /* renamed from: h */
        public void m21284h() {
            Iterator<C6212a> it = this.f19931c.iterator();
            while (it.hasNext()) {
                C6212a next = it.next();
                C4041n0.m15414K0(next.f19932a, new Runnable() { // from class: w3.q

                    /* renamed from: i */
                    public final /* synthetic */ InterfaceC5255u f19920i;

                    public /* synthetic */ RunnableC5251q(InterfaceC5255u interfaceC5255u) {
                        r2 = interfaceC5255u;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5255u.a.this.m21277n(r2);
                    }
                });
            }
        }

        /* renamed from: i */
        public void m21285i() {
            Iterator<C6212a> it = this.f19931c.iterator();
            while (it.hasNext()) {
                C6212a next = it.next();
                C4041n0.m15414K0(next.f19932a, new Runnable() { // from class: w3.p

                    /* renamed from: i */
                    public final /* synthetic */ InterfaceC5255u f19918i;

                    public /* synthetic */ RunnableC5250p(InterfaceC5255u interfaceC5255u) {
                        r2 = interfaceC5255u;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5255u.a.this.m21278o(r2);
                    }
                });
            }
        }

        /* renamed from: j */
        public void m21286j() {
            Iterator<C6212a> it = this.f19931c.iterator();
            while (it.hasNext()) {
                C6212a next = it.next();
                C4041n0.m15414K0(next.f19932a, new Runnable() { // from class: w3.r

                    /* renamed from: i */
                    public final /* synthetic */ InterfaceC5255u f19922i;

                    public /* synthetic */ RunnableC5252r(InterfaceC5255u interfaceC5255u) {
                        r2 = interfaceC5255u;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5255u.a.this.m21279p(r2);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m21287k(int i10) {
            Iterator<C6212a> it = this.f19931c.iterator();
            while (it.hasNext()) {
                C6212a next = it.next();
                C4041n0.m15414K0(next.f19932a, new Runnable() { // from class: w3.s

                    /* renamed from: i */
                    public final /* synthetic */ InterfaceC5255u f19924i;

                    /* renamed from: j */
                    public final /* synthetic */ int f19925j;

                    public /* synthetic */ RunnableC5253s(InterfaceC5255u interfaceC5255u, int i102) {
                        r2 = interfaceC5255u;
                        r3 = i102;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5255u.a.this.m21280q(r2, r3);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m21288l(Exception exc) {
            Iterator<C6212a> it = this.f19931c.iterator();
            while (it.hasNext()) {
                C6212a next = it.next();
                C4041n0.m15414K0(next.f19932a, new Runnable() { // from class: w3.t

                    /* renamed from: i */
                    public final /* synthetic */ InterfaceC5255u f19927i;

                    /* renamed from: j */
                    public final /* synthetic */ Exception f19928j;

                    public /* synthetic */ RunnableC5254t(InterfaceC5255u interfaceC5255u, Exception exc2) {
                        r2 = interfaceC5255u;
                        r3 = exc2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5255u.a.this.m21281r(r2, r3);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m21289m() {
            Iterator<C6212a> it = this.f19931c.iterator();
            while (it.hasNext()) {
                C6212a next = it.next();
                C4041n0.m15414K0(next.f19932a, new Runnable() { // from class: w3.o

                    /* renamed from: i */
                    public final /* synthetic */ InterfaceC5255u f19916i;

                    public /* synthetic */ RunnableC5249o(InterfaceC5255u interfaceC5255u) {
                        r2 = interfaceC5255u;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC5255u.a.this.m21282s(r2);
                    }
                });
            }
        }

        /* renamed from: t */
        public void m21290t(InterfaceC5255u interfaceC5255u) {
            Iterator<C6212a> it = this.f19931c.iterator();
            while (it.hasNext()) {
                C6212a next = it.next();
                if (next.f19933b == interfaceC5255u) {
                    this.f19931c.remove(next);
                }
            }
        }

        /* renamed from: u */
        public a m21291u(int i10, InterfaceC4882t.b bVar) {
            return new a(this.f19931c, i10, bVar);
        }
    }

    /* renamed from: A */
    default void mo17578A(int i10, InterfaceC4882t.b bVar) {
    }

    /* renamed from: E */
    default void mo17579E(int i10, InterfaceC4882t.b bVar) {
    }

    /* renamed from: F */
    default void mo17580F(int i10, InterfaceC4882t.b bVar, Exception exc) {
    }

    /* renamed from: G */
    default void mo17581G(int i10, InterfaceC4882t.b bVar, int i11) {
    }

    /* renamed from: s */
    default void mo17586s(int i10, InterfaceC4882t.b bVar) {
    }

    /* renamed from: t */
    default void mo17587t(int i10, InterfaceC4882t.b bVar) {
    }

    @Deprecated
    /* renamed from: x */
    default void m21270x(int i10, InterfaceC4882t.b bVar) {
    }
}
