package p369z8;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p011a9.InterfaceC0079a;
import p024b9.AbstractC0523d;
import p024b9.C0521b;
import p024b9.C0522c;
import p036c9.AbstractC0993d;
import p036c9.AbstractC0995f;
import p036c9.C0992c;
import p108h6.C2394s;
import p195n7.C3767g;
import p309v8.InterfaceC5149i;
import p353y7.C5891w;
import p354y8.InterfaceC5896b;
import p369z8.C6085i;

/* renamed from: z8.g */
/* loaded from: classes.dex */
public class C6083g implements InterfaceC6084h {

    /* renamed from: m */
    public static final Object f22587m = new Object();

    /* renamed from: n */
    public static final ThreadFactory f22588n = new a();

    /* renamed from: a */
    public final C3767g f22589a;

    /* renamed from: b */
    public final C0992c f22590b;

    /* renamed from: c */
    public final C0522c f22591c;

    /* renamed from: d */
    public final C6092p f22592d;

    /* renamed from: e */
    public final C5891w<C0521b> f22593e;

    /* renamed from: f */
    public final C6090n f22594f;

    /* renamed from: g */
    public final Object f22595g;

    /* renamed from: h */
    public final ExecutorService f22596h;

    /* renamed from: i */
    public final Executor f22597i;

    /* renamed from: j */
    public String f22598j;

    /* renamed from: k */
    public Set<InterfaceC0079a> f22599k;

    /* renamed from: l */
    public final List<InterfaceC6091o> f22600l;

    /* renamed from: z8.g$a */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f22601a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f22601a.getAndIncrement())));
        }
    }

    /* renamed from: z8.g$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22602a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f22603b;

        static {
            int[] iArr = new int[AbstractC0995f.b.values().length];
            f22603b = iArr;
            try {
                iArr[AbstractC0995f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22603b[AbstractC0995f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22603b[AbstractC0995f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AbstractC0993d.b.values().length];
            f22602a = iArr2;
            try {
                iArr2[AbstractC0993d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22602a[AbstractC0993d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public C6083g(ExecutorService executorService, Executor executor, C3767g c3767g, C0992c c0992c, C0522c c0522c, C6092p c6092p, C5891w<C0521b> c5891w, C6090n c6090n) {
        this.f22595g = new Object();
        this.f22599k = new HashSet();
        this.f22600l = new ArrayList();
        this.f22589a = c3767g;
        this.f22590b = c0992c;
        this.f22591c = c0522c;
        this.f22592d = c6092p;
        this.f22593e = c5891w;
        this.f22594f = c6090n;
        this.f22596h = executorService;
        this.f22597i = executor;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public C6083g(C3767g c3767g, InterfaceC5896b<InterfaceC5149i> interfaceC5896b, ExecutorService executorService, Executor executor) {
        this(executorService, executor, c3767g, new C0992c(c3767g.m14349m(), interfaceC5896b), new C0522c(c3767g), C6092p.m24340c(), new C5891w(new InterfaceC5896b() { // from class: z8.f
            public /* synthetic */ C6082f() {
            }

            @Override // p354y8.InterfaceC5896b
            public final Object get() {
                C0521b m24311y;
                m24311y = C6083g.m24311y(C3767g.this);
                return m24311y;
            }
        }), new C6090n());
    }

    /* renamed from: p */
    public static C6083g m24306p() {
        return m24307q(C3767g.m14334o());
    }

    /* renamed from: q */
    public static C6083g m24307q(C3767g c3767g) {
        C2394s.m9609b(c3767g != null, "Null is not a valid value of FirebaseApp.");
        return (C6083g) c3767g.m14348k(InterfaceC6084h.class);
    }

    /* renamed from: w */
    public /* synthetic */ void m24309w() {
        m24310x(false);
    }

    /* renamed from: y */
    public static /* synthetic */ C0521b m24311y(C3767g c3767g) {
        return new C0521b(c3767g);
    }

    /* renamed from: A */
    public final String m24312A(AbstractC0523d abstractC0523d) {
        if ((!this.f22589a.m14350q().equals("CHIME_ANDROID_SDK") && !this.f22589a.m14355y()) || !abstractC0523d.m2537m()) {
            return this.f22594f.m24339a();
        }
        String m2524f = m24328o().m2524f();
        return TextUtils.isEmpty(m2524f) ? this.f22594f.m24339a() : m2524f;
    }

    /* renamed from: B */
    public final AbstractC0523d m24313B(AbstractC0523d abstractC0523d) {
        AbstractC0993d m4172d = this.f22590b.m4172d(m24325l(), abstractC0523d.mo2505d(), m24331t(), m24326m(), (abstractC0523d.mo2505d() == null || abstractC0523d.mo2505d().length() != 11) ? null : m24328o().m2527i());
        int i10 = b.f22602a[m4172d.mo4147e().ordinal()];
        if (i10 == 1) {
            return abstractC0523d.m2542s(m4172d.mo4145c(), m4172d.mo4146d(), this.f22592d.m24345b(), m4172d.mo4144b().mo4156c(), m4172d.mo4144b().mo4157d());
        }
        if (i10 == 2) {
            return abstractC0523d.m2540q("BAD CONFIG");
        }
        throw new C6085i("Firebase Installations Service is unavailable. Please try again later.", C6085i.a.UNAVAILABLE);
    }

    /* renamed from: C */
    public final void m24314C(Exception exc) {
        synchronized (this.f22595g) {
            Iterator<InterfaceC6091o> it = this.f22600l.iterator();
            while (it.hasNext()) {
                if (it.next().mo24335b(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: D */
    public final void m24315D(AbstractC0523d abstractC0523d) {
        synchronized (this.f22595g) {
            Iterator<InterfaceC6091o> it = this.f22600l.iterator();
            while (it.hasNext()) {
                if (it.next().mo24334a(abstractC0523d)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: E */
    public final synchronized void m24316E(String str) {
        this.f22598j = str;
    }

    /* renamed from: F */
    public final synchronized void m24317F(AbstractC0523d abstractC0523d, AbstractC0523d abstractC0523d2) {
        if (this.f22599k.size() != 0 && !TextUtils.equals(abstractC0523d.mo2505d(), abstractC0523d2.mo2505d())) {
            Iterator<InterfaceC0079a> it = this.f22599k.iterator();
            while (it.hasNext()) {
                it.next().m335a(abstractC0523d2.mo2505d());
            }
        }
    }

    @Override // p369z8.InterfaceC6084h
    /* renamed from: a */
    public Task<AbstractC6089m> mo24318a(boolean z10) {
        m24333z();
        Task<AbstractC6089m> m24319f = m24319f();
        this.f22596h.execute(new Runnable() { // from class: z8.e

            /* renamed from: i */
            public final /* synthetic */ boolean f22585i;

            public /* synthetic */ RunnableC6081e(boolean z102) {
                r2 = z102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C6083g.this.m24310x(r2);
            }
        });
        return m24319f;
    }

    /* renamed from: f */
    public final Task<AbstractC6089m> m24319f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m24321h(new C6087k(this.f22592d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: g */
    public final Task<String> m24320g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m24321h(new C6088l(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // p369z8.InterfaceC6084h
    public Task<String> getId() {
        m24333z();
        String m24327n = m24327n();
        if (m24327n != null) {
            return Tasks.forResult(m24327n);
        }
        Task<String> m24320g = m24320g();
        this.f22596h.execute(new Runnable() { // from class: z8.c
            public /* synthetic */ RunnableC6079c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C6083g.this.m24309w();
            }
        });
        return m24320g;
    }

    /* renamed from: h */
    public final void m24321h(InterfaceC6091o interfaceC6091o) {
        synchronized (this.f22595g) {
            this.f22600l.add(interfaceC6091o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m24308v(boolean r3) {
        /*
            r2 = this;
            b9.d r0 = r2.m24329r()
            boolean r1 = r0.m2533i()     // Catch: p369z8.C6085i -> L5c
            if (r1 != 0) goto L22
            boolean r1 = r0.m2536l()     // Catch: p369z8.C6085i -> L5c
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            z8.p r3 = r2.f22592d     // Catch: p369z8.C6085i -> L5c
            boolean r3 = r3.m24347f(r0)     // Catch: p369z8.C6085i -> L5c
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            b9.d r3 = r2.m24324k(r0)     // Catch: p369z8.C6085i -> L5c
            goto L26
        L22:
            b9.d r3 = r2.m24313B(r0)     // Catch: p369z8.C6085i -> L5c
        L26:
            r2.m24332u(r3)
            r2.m24317F(r0, r3)
            boolean r0 = r3.m2535k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.mo2505d()
            r2.m24316E(r0)
        L39:
            boolean r0 = r3.m2533i()
            if (r0 == 0) goto L4a
            z8.i r3 = new z8.i
            z8.i$a r0 = p369z8.C6085i.a.BAD_CONFIG
            r3.<init>(r0)
        L46:
            r2.m24314C(r3)
            goto L5b
        L4a:
            boolean r0 = r3.m2534j()
            if (r0 == 0) goto L58
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            goto L46
        L58:
            r2.m24315D(r3)
        L5b:
            return
        L5c:
            r3 = move-exception
            r2.m24314C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p369z8.C6083g.m24308v(boolean):void");
    }

    /* renamed from: j */
    public final void m24310x(boolean z10) {
        AbstractC0523d m24330s = m24330s();
        if (z10) {
            m24330s = m24330s.m2539p();
        }
        m24315D(m24330s);
        this.f22597i.execute(new Runnable() { // from class: z8.d

            /* renamed from: i */
            public final /* synthetic */ boolean f22583i;

            public /* synthetic */ RunnableC6080d(boolean z102) {
                r2 = z102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C6083g.this.m24308v(r2);
            }
        });
    }

    /* renamed from: k */
    public final AbstractC0523d m24324k(AbstractC0523d abstractC0523d) {
        AbstractC0995f m4173e = this.f22590b.m4173e(m24325l(), abstractC0523d.mo2505d(), m24331t(), abstractC0523d.mo2507f());
        int i10 = b.f22603b[m4173e.mo4155b().ordinal()];
        if (i10 == 1) {
            return abstractC0523d.m2538o(m4173e.mo4156c(), m4173e.mo4157d(), this.f22592d.m24345b());
        }
        if (i10 == 2) {
            return abstractC0523d.m2540q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new C6085i("Firebase Installations Service is unavailable. Please try again later.", C6085i.a.UNAVAILABLE);
        }
        m24316E(null);
        return abstractC0523d.m2541r();
    }

    /* renamed from: l */
    public String m24325l() {
        return this.f22589a.m14351r().m14363b();
    }

    /* renamed from: m */
    public String m24326m() {
        return this.f22589a.m14351r().m14364c();
    }

    /* renamed from: n */
    public final synchronized String m24327n() {
        return this.f22598j;
    }

    /* renamed from: o */
    public final C0521b m24328o() {
        return this.f22593e.get();
    }

    /* renamed from: r */
    public final AbstractC0523d m24329r() {
        AbstractC0523d m2531d;
        synchronized (f22587m) {
            C6078b m24300a = C6078b.m24300a(this.f22589a.m14349m(), "generatefid.lock");
            try {
                m2531d = this.f22591c.m2531d();
            } finally {
                if (m24300a != null) {
                    m24300a.m24301b();
                }
            }
        }
        return m2531d;
    }

    /* renamed from: s */
    public final AbstractC0523d m24330s() {
        AbstractC0523d m2531d;
        synchronized (f22587m) {
            C6078b m24300a = C6078b.m24300a(this.f22589a.m14349m(), "generatefid.lock");
            try {
                m2531d = this.f22591c.m2531d();
                if (m2531d.m2534j()) {
                    m2531d = this.f22591c.m2529b(m2531d.m2543t(m24312A(m2531d)));
                }
            } finally {
                if (m24300a != null) {
                    m24300a.m24301b();
                }
            }
        }
        return m2531d;
    }

    /* renamed from: t */
    public String m24331t() {
        return this.f22589a.m14351r().m14368g();
    }

    /* renamed from: u */
    public final void m24332u(AbstractC0523d abstractC0523d) {
        synchronized (f22587m) {
            C6078b m24300a = C6078b.m24300a(this.f22589a.m14349m(), "generatefid.lock");
            try {
                this.f22591c.m2529b(abstractC0523d);
            } finally {
                if (m24300a != null) {
                    m24300a.m24301b();
                }
            }
        }
    }

    /* renamed from: z */
    public final void m24333z() {
        C2394s.m9614g(m24326m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2394s.m9614g(m24331t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2394s.m9614g(m24325l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2394s.m9609b(C6092p.m24343h(m24326m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        C2394s.m9609b(C6092p.m24342g(m24325l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }
}
