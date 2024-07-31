package p300v;

import com.journeyapps.barcodescanner.C1393b;
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
import p130ib.C2693h;
import p170l7.InterfaceFutureC3445f;

/* renamed from: v.a */
/* loaded from: classes.dex */
public abstract class AbstractC5024a<V> implements InterfaceFutureC3445f<V> {

    /* renamed from: k */
    public static final boolean f18828k = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: l */
    public static final Logger f18829l = Logger.getLogger(AbstractC5024a.class.getName());

    /* renamed from: m */
    public static final b f18830m;

    /* renamed from: n */
    public static final Object f18831n;

    /* renamed from: h */
    public volatile Object f18832h;

    /* renamed from: i */
    public volatile e f18833i;

    /* renamed from: j */
    public volatile i f18834j;

    /* renamed from: v.a$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: a */
        public abstract boolean mo19758a(AbstractC5024a<?> abstractC5024a, e eVar, e eVar2);

        /* renamed from: b */
        public abstract boolean mo19759b(AbstractC5024a<?> abstractC5024a, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo19760c(AbstractC5024a<?> abstractC5024a, i iVar, i iVar2);

        /* renamed from: d */
        public abstract void mo19761d(i iVar, i iVar2);

        /* renamed from: e */
        public abstract void mo19762e(i iVar, Thread thread);
    }

    /* renamed from: v.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c */
        public static final c f18835c;

        /* renamed from: d */
        public static final c f18836d;

        /* renamed from: a */
        public final boolean f18837a;

        /* renamed from: b */
        public final Throwable f18838b;

        static {
            if (AbstractC5024a.f18828k) {
                f18836d = null;
                f18835c = null;
            } else {
                f18836d = new c(false, null);
                f18835c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th) {
            this.f18837a = z10;
            this.f18838b = th;
        }
    }

    /* renamed from: v.a$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b */
        public static final d f18839b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f18840a;

        /* renamed from: v.a$d$a */
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
            this.f18840a = (Throwable) AbstractC5024a.m19741i(th);
        }
    }

    /* renamed from: v.a$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d */
        public static final e f18841d = new e(null, null);

        /* renamed from: a */
        public final Runnable f18842a;

        /* renamed from: b */
        public final Executor f18843b;

        /* renamed from: c */
        public e f18844c;

        public e(Runnable runnable, Executor executor) {
            this.f18842a = runnable;
            this.f18843b = executor;
        }
    }

    /* renamed from: v.a$f */
    /* loaded from: classes.dex */
    public static final class f extends b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<i, Thread> f18845a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<i, i> f18846b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC5024a, i> f18847c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC5024a, e> f18848d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC5024a, Object> f18849e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC5024a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC5024a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC5024a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f18845a = atomicReferenceFieldUpdater;
            this.f18846b = atomicReferenceFieldUpdater2;
            this.f18847c = atomicReferenceFieldUpdater3;
            this.f18848d = atomicReferenceFieldUpdater4;
            this.f18849e = atomicReferenceFieldUpdater5;
        }

        @Override // p300v.AbstractC5024a.b
        /* renamed from: a */
        public boolean mo19758a(AbstractC5024a<?> abstractC5024a, e eVar, e eVar2) {
            return C1080o.m4523a(this.f18848d, abstractC5024a, eVar, eVar2);
        }

        @Override // p300v.AbstractC5024a.b
        /* renamed from: b */
        public boolean mo19759b(AbstractC5024a<?> abstractC5024a, Object obj, Object obj2) {
            return C1080o.m4523a(this.f18849e, abstractC5024a, obj, obj2);
        }

        @Override // p300v.AbstractC5024a.b
        /* renamed from: c */
        public boolean mo19760c(AbstractC5024a<?> abstractC5024a, i iVar, i iVar2) {
            return C1080o.m4523a(this.f18847c, abstractC5024a, iVar, iVar2);
        }

        @Override // p300v.AbstractC5024a.b
        /* renamed from: d */
        public void mo19761d(i iVar, i iVar2) {
            this.f18846b.lazySet(iVar, iVar2);
        }

        @Override // p300v.AbstractC5024a.b
        /* renamed from: e */
        public void mo19762e(i iVar, Thread thread) {
            this.f18845a.lazySet(iVar, thread);
        }
    }

    /* renamed from: v.a$g */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: h */
        public final AbstractC5024a<V> f18850h;

        /* renamed from: i */
        public final InterfaceFutureC3445f<? extends V> f18851i;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f18850h.f18832h != this) {
                return;
            }
            if (AbstractC5024a.f18830m.mo19759b(this.f18850h, this, AbstractC5024a.m19744p(this.f18851i))) {
                AbstractC5024a.m19742m(this.f18850h);
            }
        }
    }

    /* renamed from: v.a$h */
    /* loaded from: classes.dex */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // p300v.AbstractC5024a.b
        /* renamed from: a */
        public boolean mo19758a(AbstractC5024a<?> abstractC5024a, e eVar, e eVar2) {
            synchronized (abstractC5024a) {
                if (abstractC5024a.f18833i != eVar) {
                    return false;
                }
                abstractC5024a.f18833i = eVar2;
                return true;
            }
        }

        @Override // p300v.AbstractC5024a.b
        /* renamed from: b */
        public boolean mo19759b(AbstractC5024a<?> abstractC5024a, Object obj, Object obj2) {
            synchronized (abstractC5024a) {
                if (abstractC5024a.f18832h != obj) {
                    return false;
                }
                abstractC5024a.f18832h = obj2;
                return true;
            }
        }

        @Override // p300v.AbstractC5024a.b
        /* renamed from: c */
        public boolean mo19760c(AbstractC5024a<?> abstractC5024a, i iVar, i iVar2) {
            synchronized (abstractC5024a) {
                if (abstractC5024a.f18834j != iVar) {
                    return false;
                }
                abstractC5024a.f18834j = iVar2;
                return true;
            }
        }

        @Override // p300v.AbstractC5024a.b
        /* renamed from: d */
        public void mo19761d(i iVar, i iVar2) {
            iVar.f18854b = iVar2;
        }

        @Override // p300v.AbstractC5024a.b
        /* renamed from: e */
        public void mo19762e(i iVar, Thread thread) {
            iVar.f18853a = thread;
        }
    }

    /* renamed from: v.a$i */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c */
        public static final i f18852c = new i(false);

        /* renamed from: a */
        public volatile Thread f18853a;

        /* renamed from: b */
        public volatile i f18854b;

        public i() {
            AbstractC5024a.f18830m.mo19762e(this, Thread.currentThread());
        }

        public i(boolean z10) {
        }

        /* renamed from: a */
        public void m19763a(i iVar) {
            AbstractC5024a.f18830m.mo19761d(this, iVar);
        }

        /* renamed from: b */
        public void m19764b() {
            Thread thread = this.f18853a;
            if (thread != null) {
                this.f18853a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, C1393b.f5292o), AtomicReferenceFieldUpdater.newUpdater(AbstractC5024a.class, i.class, "j"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5024a.class, e.class, "i"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5024a.class, Object.class, C2693h.f10528n));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f18830m = hVar;
        if (th != null) {
            f18829l.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f18831n = new Object();
    }

    /* renamed from: h */
    public static CancellationException m19740h(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: i */
    static <T> T m19741i(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: m */
    public static void m19742m(AbstractC5024a<?> abstractC5024a) {
        e eVar = null;
        while (true) {
            abstractC5024a.m19752t();
            abstractC5024a.mo19747f();
            e m19748l = abstractC5024a.m19748l(eVar);
            while (m19748l != null) {
                eVar = m19748l.f18844c;
                Runnable runnable = m19748l.f18842a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC5024a = gVar.f18850h;
                    if (abstractC5024a.f18832h == gVar) {
                        if (f18830m.mo19759b(abstractC5024a, gVar, m19744p(gVar.f18851i))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m19743n(runnable, m19748l.f18843b);
                }
                m19748l = eVar;
            }
            return;
        }
    }

    /* renamed from: n */
    public static void m19743n(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f18829l.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* renamed from: p */
    static Object m19744p(InterfaceFutureC3445f<?> interfaceFutureC3445f) {
        if (interfaceFutureC3445f instanceof AbstractC5024a) {
            Object obj = ((AbstractC5024a) interfaceFutureC3445f).f18832h;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f18837a ? cVar.f18838b != null ? new c(false, cVar.f18838b) : c.f18836d : obj;
        }
        boolean isCancelled = interfaceFutureC3445f.isCancelled();
        if ((!f18828k) && isCancelled) {
            return c.f18836d;
        }
        try {
            Object m19745q = m19745q(interfaceFutureC3445f);
            return m19745q == null ? f18831n : m19745q;
        } catch (CancellationException e10) {
            if (isCancelled) {
                return new c(false, e10);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC3445f, e10));
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    /* renamed from: q */
    static <V> V m19745q(Future<V> future) {
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

    @Override // p170l7.InterfaceFutureC3445f
    /* renamed from: b */
    public final void mo12809b(Runnable runnable, Executor executor) {
        m19741i(runnable);
        m19741i(executor);
        e eVar = this.f18833i;
        if (eVar != e.f18841d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f18844c = eVar;
                if (f18830m.mo19758a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f18833i;
                }
            } while (eVar != e.f18841d);
        }
        m19743n(runnable, executor);
    }

    /* renamed from: c */
    public final void m19746c(StringBuilder sb2) {
        String str = "]";
        try {
            Object m19745q = m19745q(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m19756x(m19745q));
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

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f18832h;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f18828k ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f18835c : c.f18836d;
        AbstractC5024a<V> abstractC5024a = this;
        boolean z11 = false;
        while (true) {
            if (f18830m.mo19759b(abstractC5024a, obj, cVar)) {
                if (z10) {
                    abstractC5024a.m19750r();
                }
                m19742m(abstractC5024a);
                if (!(obj instanceof g)) {
                    return true;
                }
                InterfaceFutureC3445f<? extends V> interfaceFutureC3445f = ((g) obj).f18851i;
                if (!(interfaceFutureC3445f instanceof AbstractC5024a)) {
                    interfaceFutureC3445f.cancel(z10);
                    return true;
                }
                abstractC5024a = (AbstractC5024a) interfaceFutureC3445f;
                obj = abstractC5024a.f18832h;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractC5024a.f18832h;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    /* renamed from: f */
    public void mo19747f() {
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f18832h;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return m19749o(obj2);
        }
        i iVar = this.f18834j;
        if (iVar != i.f18852c) {
            i iVar2 = new i();
            do {
                iVar2.m19763a(iVar);
                if (f18830m.mo19760c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m19753u(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f18832h;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return m19749o(obj);
                }
                iVar = this.f18834j;
            } while (iVar != i.f18852c);
        }
        return m19749o(this.f18832h);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f18832h;
        if ((obj != null) && (!(obj instanceof g))) {
            return m19749o(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f18834j;
            if (iVar != i.f18852c) {
                i iVar2 = new i();
                do {
                    iVar2.m19763a(iVar);
                    if (f18830m.mo19760c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m19753u(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f18832h;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m19749o(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m19753u(iVar2);
                    } else {
                        iVar = this.f18834j;
                    }
                } while (iVar != i.f18852c);
            }
            return m19749o(this.f18832h);
        }
        while (nanos > 0) {
            Object obj3 = this.f18832h;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m19749o(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC5024a = toString();
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
        throw new TimeoutException(str + " for " + abstractC5024a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f18832h instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f18832h != null);
    }

    /* renamed from: l */
    public final e m19748l(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f18833i;
        } while (!f18830m.mo19758a(this, eVar2, e.f18841d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f18844c;
            eVar4.f18844c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public final V m19749o(Object obj) {
        if (obj instanceof c) {
            throw m19740h("Task was cancelled.", ((c) obj).f18838b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f18840a);
        }
        if (obj == f18831n) {
            return null;
        }
        return obj;
    }

    /* renamed from: r */
    public void m19750r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public String mo19751s() {
        Object obj = this.f18832h;
        if (obj instanceof g) {
            return "setFuture=[" + m19756x(((g) obj).f18851i) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: t */
    public final void m19752t() {
        i iVar;
        do {
            iVar = this.f18834j;
        } while (!f18830m.mo19760c(this, iVar, i.f18852c));
        while (iVar != null) {
            iVar.m19764b();
            iVar = iVar.f18854b;
        }
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (!isCancelled()) {
            if (!isDone()) {
                try {
                    str = mo19751s();
                } catch (RuntimeException e10) {
                    str = "Exception thrown from implementation: " + e10.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb2.append("PENDING, info=[");
                    sb2.append(str);
                    sb2.append("]");
                    sb2.append("]");
                    return sb2.toString();
                }
                str2 = isDone() ? "CANCELLED" : "PENDING";
            }
            m19746c(sb2);
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append(str2);
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: u */
    public final void m19753u(i iVar) {
        iVar.f18853a = null;
        while (true) {
            i iVar2 = this.f18834j;
            if (iVar2 == i.f18852c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f18854b;
                if (iVar2.f18853a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f18854b = iVar4;
                    if (iVar3.f18853a == null) {
                        break;
                    }
                } else if (!f18830m.mo19760c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* renamed from: v */
    public boolean mo19754v(V v10) {
        if (v10 == null) {
            v10 = (V) f18831n;
        }
        if (!f18830m.mo19759b(this, null, v10)) {
            return false;
        }
        m19742m(this);
        return true;
    }

    /* renamed from: w */
    public boolean mo19755w(Throwable th) {
        if (!f18830m.mo19759b(this, null, new d((Throwable) m19741i(th)))) {
            return false;
        }
        m19742m(this);
        return true;
    }

    /* renamed from: x */
    public final String m19756x(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* renamed from: y */
    public final boolean m19757y() {
        Object obj = this.f18832h;
        return (obj instanceof c) && ((c) obj).f18837a;
    }
}
