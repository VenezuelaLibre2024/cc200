package p222p5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p222p5.C4036l;

/* renamed from: p5.q */
/* loaded from: classes.dex */
public final class C4045q<T> {

    /* renamed from: a */
    public final InterfaceC4020d f14532a;

    /* renamed from: b */
    public final InterfaceC4040n f14533b;

    /* renamed from: c */
    public final b<T> f14534c;

    /* renamed from: d */
    public final CopyOnWriteArraySet<c<T>> f14535d;

    /* renamed from: e */
    public final ArrayDeque<Runnable> f14536e;

    /* renamed from: f */
    public final ArrayDeque<Runnable> f14537f;

    /* renamed from: g */
    public final Object f14538g;

    /* renamed from: h */
    public boolean f14539h;

    /* renamed from: i */
    public boolean f14540i;

    /* renamed from: p5.q$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        void invoke(T t10);
    }

    /* renamed from: p5.q$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        /* renamed from: a */
        void mo15517a(T t10, C4036l c4036l);
    }

    /* renamed from: p5.q$c */
    /* loaded from: classes.dex */
    public static final class c<T> {

        /* renamed from: a */
        public final T f14541a;

        /* renamed from: b */
        public C4036l.b f14542b = new C4036l.b();

        /* renamed from: c */
        public boolean f14543c;

        /* renamed from: d */
        public boolean f14544d;

        public c(T t10) {
            this.f14541a = t10;
        }

        /* renamed from: a */
        public void m15518a(int i10, a<T> aVar) {
            if (this.f14544d) {
                return;
            }
            if (i10 != -1) {
                this.f14542b.m15379a(i10);
            }
            this.f14543c = true;
            aVar.invoke(this.f14541a);
        }

        /* renamed from: b */
        public void m15519b(b<T> bVar) {
            if (this.f14544d || !this.f14543c) {
                return;
            }
            C4036l m15383e = this.f14542b.m15383e();
            this.f14542b = new C4036l.b();
            this.f14543c = false;
            bVar.mo15517a(this.f14541a, m15383e);
        }

        /* renamed from: c */
        public void m15520c(b<T> bVar) {
            this.f14544d = true;
            if (this.f14543c) {
                this.f14543c = false;
                bVar.mo15517a(this.f14541a, this.f14542b.m15383e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f14541a.equals(((c) obj).f14541a);
        }

        public int hashCode() {
            return this.f14541a.hashCode();
        }
    }

    public C4045q(Looper looper, InterfaceC4020d interfaceC4020d, b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC4020d, bVar);
    }

    public C4045q(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, InterfaceC4020d interfaceC4020d, b<T> bVar) {
        this.f14532a = interfaceC4020d;
        this.f14535d = copyOnWriteArraySet;
        this.f14534c = bVar;
        this.f14538g = new Object();
        this.f14536e = new ArrayDeque<>();
        this.f14537f = new ArrayDeque<>();
        this.f14533b = interfaceC4020d.mo15273c(looper, new Handler.Callback() { // from class: p5.o
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m15512g;
                m15512g = C4045q.this.m15512g(message);
                return m15512g;
            }
        });
        this.f14540i = true;
    }

    /* renamed from: h */
    public static /* synthetic */ void m15507h(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).m15518a(i10, aVar);
        }
    }

    /* renamed from: c */
    public void m15508c(T t10) {
        C4014a.m15199e(t10);
        synchronized (this.f14538g) {
            if (this.f14539h) {
                return;
            }
            this.f14535d.add(new c<>(t10));
        }
    }

    /* renamed from: d */
    public C4045q<T> m15509d(Looper looper, InterfaceC4020d interfaceC4020d, b<T> bVar) {
        return new C4045q<>(this.f14535d, looper, interfaceC4020d, bVar);
    }

    /* renamed from: e */
    public C4045q<T> m15510e(Looper looper, b<T> bVar) {
        return m15509d(looper, this.f14532a, bVar);
    }

    /* renamed from: f */
    public void m15511f() {
        m15516l();
        if (this.f14537f.isEmpty()) {
            return;
        }
        if (!this.f14533b.mo15321d(0)) {
            InterfaceC4040n interfaceC4040n = this.f14533b;
            interfaceC4040n.mo15322e(interfaceC4040n.mo15320c(0));
        }
        boolean z10 = !this.f14536e.isEmpty();
        this.f14536e.addAll(this.f14537f);
        this.f14537f.clear();
        if (z10) {
            return;
        }
        while (!this.f14536e.isEmpty()) {
            this.f14536e.peekFirst().run();
            this.f14536e.removeFirst();
        }
    }

    /* renamed from: g */
    public final boolean m15512g(Message message) {
        Iterator<c<T>> it = this.f14535d.iterator();
        while (it.hasNext()) {
            it.next().m15519b(this.f14534c);
            if (this.f14533b.mo15321d(0)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: i */
    public void m15513i(final int i10, final a<T> aVar) {
        m15516l();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f14535d);
        this.f14537f.add(new Runnable() { // from class: p5.p
            @Override // java.lang.Runnable
            public final void run() {
                C4045q.m15507h(copyOnWriteArraySet, i10, aVar);
            }
        });
    }

    /* renamed from: j */
    public void m15514j() {
        m15516l();
        synchronized (this.f14538g) {
            this.f14539h = true;
        }
        Iterator<c<T>> it = this.f14535d.iterator();
        while (it.hasNext()) {
            it.next().m15520c(this.f14534c);
        }
        this.f14535d.clear();
    }

    /* renamed from: k */
    public void m15515k(int i10, a<T> aVar) {
        m15513i(i10, aVar);
        m15511f();
    }

    /* renamed from: l */
    public final void m15516l() {
        if (this.f14540i) {
            C4014a.m15200f(Thread.currentThread() == this.f14533b.mo15329l().getThread());
        }
    }
}
