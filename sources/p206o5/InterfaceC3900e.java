package p206o5;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p206o5.InterfaceC3900e;
import p222p5.C4014a;

/* renamed from: o5.e */
/* loaded from: classes.dex */
public interface InterfaceC3900e {

    /* renamed from: o5.e$a */
    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: o5.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C6198a {

            /* renamed from: a */
            public final CopyOnWriteArrayList<C6199a> f13995a = new CopyOnWriteArrayList<>();

            /* renamed from: o5.e$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C6199a {

                /* renamed from: a */
                public final Handler f13996a;

                /* renamed from: b */
                public final a f13997b;

                /* renamed from: c */
                public boolean f13998c;

                public C6199a(Handler handler, a aVar) {
                    this.f13996a = handler;
                    this.f13997b = aVar;
                }

                /* renamed from: d */
                public void m14794d() {
                    this.f13998c = true;
                }
            }

            /* renamed from: d */
            public static /* synthetic */ void m14787d(C6199a c6199a, int i10, long j10, long j11) {
                c6199a.f13997b.mo14785v(i10, j10, j11);
            }

            /* renamed from: b */
            public void m14788b(Handler handler, a aVar) {
                C4014a.m15199e(handler);
                C4014a.m15199e(aVar);
                m14790e(aVar);
                this.f13995a.add(new C6199a(handler, aVar));
            }

            /* renamed from: c */
            public void m14789c(final int i10, final long j10, final long j11) {
                Iterator<C6199a> it = this.f13995a.iterator();
                while (it.hasNext()) {
                    final C6199a next = it.next();
                    if (!next.f13998c) {
                        next.f13996a.post(new Runnable() { // from class: o5.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC3900e.a.C6198a.m14787d(InterfaceC3900e.a.C6198a.C6199a.this, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            /* renamed from: e */
            public void m14790e(a aVar) {
                Iterator<C6199a> it = this.f13995a.iterator();
                while (it.hasNext()) {
                    C6199a next = it.next();
                    if (next.f13997b == aVar) {
                        next.m14794d();
                        this.f13995a.remove(next);
                    }
                }
            }
        }

        /* renamed from: v */
        void mo14785v(int i10, long j10, long j11);
    }

    /* renamed from: b */
    default long m14780b() {
        return -9223372036854775807L;
    }

    /* renamed from: e */
    InterfaceC3917m0 mo14781e();

    /* renamed from: f */
    void mo14782f(a aVar);

    /* renamed from: g */
    long mo14783g();

    /* renamed from: h */
    void mo14784h(Handler handler, a aVar);
}
