package p170l7;

import com.journeyapps.barcodescanner.C1393b;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p038ce.C1080o;
import p109h7.C2432o;
import p130ib.C2693h;
import p183m7.AbstractC3548a;
import p183m7.C3549b;
import sun.misc.Unsafe;

/* renamed from: l7.a */
/* loaded from: classes.dex */
public abstract class AbstractC3440a<V> extends AbstractC3548a implements InterfaceFutureC3445f<V> {

    /* renamed from: k */
    public static final boolean f12083k;

    /* renamed from: l */
    public static final Logger f12084l;

    /* renamed from: m */
    public static final b f12085m;

    /* renamed from: n */
    public static final Object f12086n;

    /* renamed from: h */
    public volatile Object f12087h;

    /* renamed from: i */
    public volatile e f12088i;

    /* renamed from: j */
    public volatile l f12089j;

    /* renamed from: l7.a$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public b() {
        }

        /* renamed from: a */
        public abstract boolean mo12817a(AbstractC3440a<?> abstractC3440a, e eVar, e eVar2);

        /* renamed from: b */
        public abstract boolean mo12818b(AbstractC3440a<?> abstractC3440a, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo12819c(AbstractC3440a<?> abstractC3440a, l lVar, l lVar2);

        /* renamed from: d */
        public abstract e mo12820d(AbstractC3440a<?> abstractC3440a, e eVar);

        /* renamed from: e */
        public abstract l mo12821e(AbstractC3440a<?> abstractC3440a, l lVar);

        /* renamed from: f */
        public abstract void mo12822f(l lVar, l lVar2);

        /* renamed from: g */
        public abstract void mo12823g(l lVar, Thread thread);
    }

    /* renamed from: l7.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c */
        public static final c f12090c;

        /* renamed from: d */
        public static final c f12091d;

        /* renamed from: a */
        public final boolean f12092a;

        /* renamed from: b */
        public final Throwable f12093b;

        static {
            if (AbstractC3440a.f12083k) {
                f12091d = null;
                f12090c = null;
            } else {
                f12091d = new c(false, null);
                f12090c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th) {
            this.f12092a = z10;
            this.f12093b = th;
        }
    }

    /* renamed from: l7.a$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b */
        public static final d f12094b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f12095a;

        /* renamed from: l7.a$d$a */
        /* loaded from: classes.dex */
        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f12095a = (Throwable) C2432o.m9704j(th);
        }
    }

    /* renamed from: l7.a$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d */
        public static final e f12096d = new e();

        /* renamed from: a */
        public final Runnable f12097a;

        /* renamed from: b */
        public final Executor f12098b;

        /* renamed from: c */
        public e f12099c;

        public e() {
            this.f12097a = null;
            this.f12098b = null;
        }

        public e(Runnable runnable, Executor executor) {
            this.f12097a = runnable;
            this.f12098b = executor;
        }
    }

    /* renamed from: l7.a$f */
    /* loaded from: classes.dex */
    public static final class f extends b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<l, Thread> f12100a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<l, l> f12101b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC3440a, l> f12102c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC3440a, e> f12103d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC3440a, Object> f12104e;

        public f(AtomicReferenceFieldUpdater<l, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<l, l> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC3440a, l> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC3440a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC3440a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f12100a = atomicReferenceFieldUpdater;
            this.f12101b = atomicReferenceFieldUpdater2;
            this.f12102c = atomicReferenceFieldUpdater3;
            this.f12103d = atomicReferenceFieldUpdater4;
            this.f12104e = atomicReferenceFieldUpdater5;
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: a */
        public boolean mo12817a(AbstractC3440a<?> abstractC3440a, e eVar, e eVar2) {
            return C1080o.m4523a(this.f12103d, abstractC3440a, eVar, eVar2);
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: b */
        public boolean mo12818b(AbstractC3440a<?> abstractC3440a, Object obj, Object obj2) {
            return C1080o.m4523a(this.f12104e, abstractC3440a, obj, obj2);
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: c */
        public boolean mo12819c(AbstractC3440a<?> abstractC3440a, l lVar, l lVar2) {
            return C1080o.m4523a(this.f12102c, abstractC3440a, lVar, lVar2);
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: d */
        public e mo12820d(AbstractC3440a<?> abstractC3440a, e eVar) {
            return this.f12103d.getAndSet(abstractC3440a, eVar);
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: e */
        public l mo12821e(AbstractC3440a<?> abstractC3440a, l lVar) {
            return this.f12102c.getAndSet(abstractC3440a, lVar);
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: f */
        public void mo12822f(l lVar, l lVar2) {
            this.f12101b.lazySet(lVar, lVar2);
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: g */
        public void mo12823g(l lVar, Thread thread) {
            this.f12100a.lazySet(lVar, thread);
        }
    }

    /* renamed from: l7.a$g */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: h */
        public final AbstractC3440a<V> f12105h;

        /* renamed from: i */
        public final InterfaceFutureC3445f<? extends V> f12106i;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12105h.f12087h != this) {
                return;
            }
            if (AbstractC3440a.f12085m.mo12818b(this.f12105h, this, AbstractC3440a.m12802v(this.f12106i))) {
                AbstractC3440a.m12799s(this.f12105h, false);
            }
        }
    }

    /* renamed from: l7.a$h */
    /* loaded from: classes.dex */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: a */
        public boolean mo12817a(AbstractC3440a<?> abstractC3440a, e eVar, e eVar2) {
            synchronized (abstractC3440a) {
                if (abstractC3440a.f12088i != eVar) {
                    return false;
                }
                abstractC3440a.f12088i = eVar2;
                return true;
            }
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: b */
        public boolean mo12818b(AbstractC3440a<?> abstractC3440a, Object obj, Object obj2) {
            synchronized (abstractC3440a) {
                if (abstractC3440a.f12087h != obj) {
                    return false;
                }
                abstractC3440a.f12087h = obj2;
                return true;
            }
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: c */
        public boolean mo12819c(AbstractC3440a<?> abstractC3440a, l lVar, l lVar2) {
            synchronized (abstractC3440a) {
                if (abstractC3440a.f12089j != lVar) {
                    return false;
                }
                abstractC3440a.f12089j = lVar2;
                return true;
            }
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: d */
        public e mo12820d(AbstractC3440a<?> abstractC3440a, e eVar) {
            e eVar2;
            synchronized (abstractC3440a) {
                eVar2 = abstractC3440a.f12088i;
                if (eVar2 != eVar) {
                    abstractC3440a.f12088i = eVar;
                }
            }
            return eVar2;
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: e */
        public l mo12821e(AbstractC3440a<?> abstractC3440a, l lVar) {
            l lVar2;
            synchronized (abstractC3440a) {
                lVar2 = abstractC3440a.f12089j;
                if (lVar2 != lVar) {
                    abstractC3440a.f12089j = lVar;
                }
            }
            return lVar2;
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: f */
        public void mo12822f(l lVar, l lVar2) {
            lVar.f12115b = lVar2;
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: g */
        public void mo12823g(l lVar, Thread thread) {
            lVar.f12114a = thread;
        }
    }

    /* renamed from: l7.a$i */
    /* loaded from: classes.dex */
    public interface i<V> extends InterfaceFutureC3445f<V> {
    }

    /* renamed from: l7.a$j */
    /* loaded from: classes.dex */
    public static abstract class j<V> extends AbstractC3440a<V> implements i<V> {
        @Override // p170l7.AbstractC3440a, p170l7.InterfaceFutureC3445f
        /* renamed from: b */
        public final void mo12809b(Runnable runnable, Executor executor) {
            super.mo12809b(runnable, executor);
        }

        @Override // p170l7.AbstractC3440a, java.util.concurrent.Future
        public final boolean cancel(boolean z10) {
            return super.cancel(z10);
        }

        @Override // p170l7.AbstractC3440a, java.util.concurrent.Future
        public final V get() {
            return (V) super.get();
        }

        @Override // p170l7.AbstractC3440a, java.util.concurrent.Future
        public final V get(long j10, TimeUnit timeUnit) {
            return (V) super.get(j10, timeUnit);
        }

        @Override // p170l7.AbstractC3440a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // p170l7.AbstractC3440a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    /* renamed from: l7.a$k */
    /* loaded from: classes.dex */
    public static final class k extends b {

        /* renamed from: a */
        public static final Unsafe f12107a;

        /* renamed from: b */
        public static final long f12108b;

        /* renamed from: c */
        public static final long f12109c;

        /* renamed from: d */
        public static final long f12110d;

        /* renamed from: e */
        public static final long f12111e;

        /* renamed from: f */
        public static final long f12112f;

        /* renamed from: l7.a$k$a */
        /* loaded from: classes.dex */
        public class a implements PrivilegedExceptionAction<Unsafe> {
            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new a());
                }
                try {
                    f12109c = unsafe.objectFieldOffset(AbstractC3440a.class.getDeclaredField("j"));
                    f12108b = unsafe.objectFieldOffset(AbstractC3440a.class.getDeclaredField("i"));
                    f12110d = unsafe.objectFieldOffset(AbstractC3440a.class.getDeclaredField(C2693h.f10528n));
                    f12111e = unsafe.objectFieldOffset(l.class.getDeclaredField("a"));
                    f12112f = unsafe.objectFieldOffset(l.class.getDeclaredField(C1393b.f5292o));
                    f12107a = unsafe;
                } catch (NoSuchFieldException e10) {
                    throw new RuntimeException(e10);
                } catch (RuntimeException e11) {
                    throw e11;
                }
            } catch (PrivilegedActionException e12) {
                throw new RuntimeException("Could not initialize intrinsics", e12.getCause());
            }
        }

        public k() {
            super();
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: a */
        public boolean mo12817a(AbstractC3440a<?> abstractC3440a, e eVar, e eVar2) {
            return C3441b.m12827a(f12107a, abstractC3440a, f12108b, eVar, eVar2);
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: b */
        public boolean mo12818b(AbstractC3440a<?> abstractC3440a, Object obj, Object obj2) {
            return C3441b.m12827a(f12107a, abstractC3440a, f12110d, obj, obj2);
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: c */
        public boolean mo12819c(AbstractC3440a<?> abstractC3440a, l lVar, l lVar2) {
            return C3441b.m12827a(f12107a, abstractC3440a, f12109c, lVar, lVar2);
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: d */
        public e mo12820d(AbstractC3440a<?> abstractC3440a, e eVar) {
            e eVar2;
            do {
                eVar2 = abstractC3440a.f12088i;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!mo12817a(abstractC3440a, eVar2, eVar));
            return eVar2;
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: e */
        public l mo12821e(AbstractC3440a<?> abstractC3440a, l lVar) {
            l lVar2;
            do {
                lVar2 = abstractC3440a.f12089j;
                if (lVar == lVar2) {
                    return lVar2;
                }
            } while (!mo12819c(abstractC3440a, lVar2, lVar));
            return lVar2;
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: f */
        public void mo12822f(l lVar, l lVar2) {
            f12107a.putObject(lVar, f12112f, lVar2);
        }

        @Override // p170l7.AbstractC3440a.b
        /* renamed from: g */
        public void mo12823g(l lVar, Thread thread) {
            f12107a.putObject(lVar, f12111e, thread);
        }
    }

    /* renamed from: l7.a$l */
    /* loaded from: classes.dex */
    public static final class l {

        /* renamed from: c */
        public static final l f12113c = new l(false);

        /* renamed from: a */
        public volatile Thread f12114a;

        /* renamed from: b */
        public volatile l f12115b;

        public l() {
            AbstractC3440a.f12085m.mo12823g(this, Thread.currentThread());
        }

        public l(boolean z10) {
        }

        /* renamed from: a */
        public void m12825a(l lVar) {
            AbstractC3440a.f12085m.mo12822f(this, lVar);
        }

        /* renamed from: b */
        public void m12826b() {
            Thread thread = this.f12114a;
            if (thread != null) {
                this.f12114a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Error] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5, types: [l7.a$a] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [l7.a$k] */
    /* JADX WARN: Type inference failed for: r9v0, types: [l7.a$f] */
    static {
        boolean z10;
        h hVar;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f12083k = z10;
        f12084l = Logger.getLogger(AbstractC3440a.class.getName());
        ?? r12 = 0;
        r12 = 0;
        try {
            hVar = new k();
            e = null;
        } catch (Error | RuntimeException e10) {
            e = e10;
            try {
                hVar = new f(AtomicReferenceFieldUpdater.newUpdater(l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l.class, l.class, C1393b.f5292o), AtomicReferenceFieldUpdater.newUpdater(AbstractC3440a.class, l.class, "j"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3440a.class, e.class, "i"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3440a.class, Object.class, C2693h.f10528n));
            } catch (Error | RuntimeException e11) {
                hVar = new h();
                r12 = e11;
            }
        }
        f12085m = hVar;
        if (r12 != 0) {
            ?? r02 = f12084l;
            Level level = Level.SEVERE;
            r02.log(level, "UnsafeAtomicHelper is broken!", e);
            r02.log(level, "SafeAtomicHelper is broken!", r12);
        }
        f12086n = new Object();
    }

    /* renamed from: l */
    private void m12797l(StringBuilder sb2) {
        String str = "]";
        try {
            Object m12803w = m12803w(this);
            sb2.append("SUCCESS, result=[");
            m12812o(sb2, m12803w);
            sb2.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb2.append(str);
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            str = " thrown from get()]";
            sb2.append(str);
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append(str);
        }
    }

    /* renamed from: q */
    public static CancellationException m12798q(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: s */
    public static void m12799s(AbstractC3440a<?> abstractC3440a, boolean z10) {
        e eVar = null;
        while (true) {
            abstractC3440a.m12804z();
            if (z10) {
                abstractC3440a.m12815x();
                z10 = false;
            }
            abstractC3440a.m12811n();
            e m12814r = abstractC3440a.m12814r(eVar);
            while (m12814r != null) {
                eVar = m12814r.f12099c;
                Runnable runnable = m12814r.f12097a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof g) {
                    g gVar = (g) runnable2;
                    abstractC3440a = gVar.f12105h;
                    if (abstractC3440a.f12087h == gVar) {
                        if (f12085m.mo12818b(abstractC3440a, gVar, m12802v(gVar.f12106i))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = m12814r.f12098b;
                    Objects.requireNonNull(executor);
                    m12800t(runnable2, executor);
                }
                m12814r = eVar;
            }
            return;
        }
    }

    /* renamed from: t */
    public static void m12800t(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f12084l.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    private V m12801u(Object obj) {
        if (obj instanceof c) {
            throw m12798q("Task was cancelled.", ((c) obj).f12093b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f12095a);
        }
        return obj == f12086n ? (V) C3446g.m12830a() : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public static Object m12802v(InterfaceFutureC3445f<?> interfaceFutureC3445f) {
        Throwable m13196a;
        if (interfaceFutureC3445f instanceof i) {
            Object obj = ((AbstractC3440a) interfaceFutureC3445f).f12087h;
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f12092a) {
                    obj = cVar.f12093b != null ? new c(false, cVar.f12093b) : c.f12091d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((interfaceFutureC3445f instanceof AbstractC3548a) && (m13196a = C3549b.m13196a((AbstractC3548a) interfaceFutureC3445f)) != null) {
            return new d(m13196a);
        }
        boolean isCancelled = interfaceFutureC3445f.isCancelled();
        if ((!f12083k) && isCancelled) {
            c cVar2 = c.f12091d;
            Objects.requireNonNull(cVar2);
            return cVar2;
        }
        try {
            Object m12803w = m12803w(interfaceFutureC3445f);
            if (!isCancelled) {
                return m12803w == null ? f12086n : m12803w;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC3445f));
        } catch (Error e10) {
            e = e10;
            return new d(e);
        } catch (CancellationException e11) {
            if (isCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC3445f, e11));
        } catch (RuntimeException e12) {
            e = e12;
            return new d(e);
        } catch (ExecutionException e13) {
            if (!isCancelled) {
                return new d(e13.getCause());
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC3445f, e13));
        }
    }

    /* renamed from: w */
    public static <V> V m12803w(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    /* renamed from: z */
    private void m12804z() {
        for (l mo12821e = f12085m.mo12821e(this, l.f12113c); mo12821e != null; mo12821e = mo12821e.f12115b) {
            mo12821e.m12826b();
        }
    }

    /* renamed from: A */
    public final void m12805A(l lVar) {
        lVar.f12114a = null;
        while (true) {
            l lVar2 = this.f12089j;
            if (lVar2 == l.f12113c) {
                return;
            }
            l lVar3 = null;
            while (lVar2 != null) {
                l lVar4 = lVar2.f12115b;
                if (lVar2.f12114a != null) {
                    lVar3 = lVar2;
                } else if (lVar3 != null) {
                    lVar3.f12115b = lVar4;
                    if (lVar3.f12114a == null) {
                        break;
                    }
                } else if (!f12085m.mo12819c(this, lVar2, lVar4)) {
                    break;
                }
                lVar2 = lVar4;
            }
            return;
        }
    }

    /* renamed from: B */
    public boolean mo12806B(V v10) {
        if (v10 == null) {
            v10 = (V) f12086n;
        }
        if (!f12085m.mo12818b(this, null, v10)) {
            return false;
        }
        m12799s(this, false);
        return true;
    }

    /* renamed from: C */
    public boolean mo12807C(Throwable th) {
        if (!f12085m.mo12818b(this, null, new d((Throwable) C2432o.m9704j(th)))) {
            return false;
        }
        m12799s(this, false);
        return true;
    }

    @Override // p183m7.AbstractC3548a
    /* renamed from: a */
    public final Throwable mo12808a() {
        if (!(this instanceof i)) {
            return null;
        }
        Object obj = this.f12087h;
        if (obj instanceof d) {
            return ((d) obj).f12095a;
        }
        return null;
    }

    @Override // p170l7.InterfaceFutureC3445f
    /* renamed from: b */
    public void mo12809b(Runnable runnable, Executor executor) {
        e eVar;
        C2432o.m9705k(runnable, "Runnable was null.");
        C2432o.m9705k(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f12088i) != e.f12096d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f12099c = eVar;
                if (f12085m.mo12817a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f12088i;
                }
            } while (eVar != e.f12096d);
        }
        m12800t(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        c cVar;
        Object obj = this.f12087h;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f12083k) {
            cVar = new c(z10, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z10 ? c.f12090c : c.f12091d;
            Objects.requireNonNull(cVar);
        }
        AbstractC3440a<V> abstractC3440a = this;
        boolean z11 = false;
        while (true) {
            if (f12085m.mo12818b(abstractC3440a, obj, cVar)) {
                m12799s(abstractC3440a, z10);
                if (!(obj instanceof g)) {
                    return true;
                }
                InterfaceFutureC3445f<? extends V> interfaceFutureC3445f = ((g) obj).f12106i;
                if (!(interfaceFutureC3445f instanceof i)) {
                    interfaceFutureC3445f.cancel(z10);
                    return true;
                }
                abstractC3440a = (AbstractC3440a) interfaceFutureC3445f;
                obj = abstractC3440a.f12087h;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractC3440a.f12087h;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f12087h;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return m12801u(obj2);
        }
        l lVar = this.f12089j;
        if (lVar != l.f12113c) {
            l lVar2 = new l();
            do {
                lVar2.m12825a(lVar);
                if (f12085m.mo12819c(this, lVar, lVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m12805A(lVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f12087h;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return m12801u(obj);
                }
                lVar = this.f12089j;
            } while (lVar != l.f12113c);
        }
        Object obj3 = this.f12087h;
        Objects.requireNonNull(obj3);
        return m12801u(obj3);
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f12087h;
        if ((obj != null) && (!(obj instanceof g))) {
            return m12801u(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l lVar = this.f12089j;
            if (lVar != l.f12113c) {
                l lVar2 = new l();
                do {
                    lVar2.m12825a(lVar);
                    if (f12085m.mo12819c(this, lVar, lVar2)) {
                        do {
                            C3447h.m12831a(this, nanos);
                            if (Thread.interrupted()) {
                                m12805A(lVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f12087h;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m12801u(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m12805A(lVar2);
                    } else {
                        lVar = this.f12089j;
                    }
                } while (lVar != l.f12113c);
            }
            Object obj3 = this.f12087h;
            Objects.requireNonNull(obj3);
            return m12801u(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f12087h;
            if ((obj4 != null) && (!(obj4 instanceof g))) {
                return m12801u(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC3440a = toString();
        String timeUnit2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = timeUnit2.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            boolean z10 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z10) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z10) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + abstractC3440a);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f12087h instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r0 instanceof g)) & (this.f12087h != null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12810m(java.lang.StringBuilder r6) {
        /*
            r5 = this;
            int r0 = r6.length()
            java.lang.String r1 = "PENDING"
            r6.append(r1)
            java.lang.Object r1 = r5.f12087h
            boolean r2 = r1 instanceof p170l7.AbstractC3440a.g
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r6.append(r2)
            l7.a$g r1 = (p170l7.AbstractC3440a.g) r1
            l7.f<? extends V> r1 = r1.f12106i
            r5.m12813p(r6, r1)
        L1d:
            r6.append(r3)
            goto L4d
        L21:
            java.lang.String r1 = r5.m12816y()     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            java.lang.String r1 = p109h7.C2437t.m9728a(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            goto L42
        L2a:
            r1 = move-exception
            goto L2d
        L2c:
            r1 = move-exception
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Exception thrown from implementation: "
            r2.append(r4)
            java.lang.Class r1 = r1.getClass()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L42:
            if (r1 == 0) goto L4d
            java.lang.String r2 = ", info=["
            r6.append(r2)
            r6.append(r1)
            goto L1d
        L4d:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L5d
            int r1 = r6.length()
            r6.delete(r0, r1)
            r5.m12797l(r6)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p170l7.AbstractC3440a.m12810m(java.lang.StringBuilder):void");
    }

    /* renamed from: n */
    public void m12811n() {
    }

    /* renamed from: o */
    public final void m12812o(StringBuilder sb2, Object obj) {
        String hexString;
        if (obj == null) {
            hexString = "null";
        } else if (obj == this) {
            hexString = "this future";
        } else {
            sb2.append(obj.getClass().getName());
            sb2.append("@");
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb2.append(hexString);
    }

    /* renamed from: p */
    public final void m12813p(StringBuilder sb2, Object obj) {
        try {
            if (obj == this) {
                sb2.append("this future");
            } else {
                sb2.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e10) {
            sb2.append("Exception thrown from implementation: ");
            sb2.append(e10.getClass());
        }
    }

    /* renamed from: r */
    public final e m12814r(e eVar) {
        e eVar2 = eVar;
        e mo12820d = f12085m.mo12820d(this, e.f12096d);
        while (mo12820d != null) {
            e eVar3 = mo12820d.f12099c;
            mo12820d.f12099c = eVar2;
            eVar2 = mo12820d;
            mo12820d = eVar3;
        }
        return eVar2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[status=");
        if (isCancelled()) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m12797l(sb2);
        } else {
            m12810m(sb2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: x */
    public void m12815x() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public String m12816y() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }
}
