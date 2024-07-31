package p190n2;

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

/* renamed from: n2.a */
/* loaded from: classes.dex */
public abstract class AbstractC3701a<V> implements InterfaceFutureC3445f<V> {

    /* renamed from: k */
    public static final boolean f13172k = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: l */
    public static final Logger f13173l = Logger.getLogger(AbstractC3701a.class.getName());

    /* renamed from: m */
    public static final b f13174m;

    /* renamed from: n */
    public static final Object f13175n;

    /* renamed from: h */
    public volatile Object f13176h;

    /* renamed from: i */
    public volatile e f13177i;

    /* renamed from: j */
    public volatile i f13178j;

    /* renamed from: n2.a$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public b() {
        }

        /* renamed from: a */
        public abstract boolean mo13975a(AbstractC3701a<?> abstractC3701a, e eVar, e eVar2);

        /* renamed from: b */
        public abstract boolean mo13976b(AbstractC3701a<?> abstractC3701a, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo13977c(AbstractC3701a<?> abstractC3701a, i iVar, i iVar2);

        /* renamed from: d */
        public abstract void mo13978d(i iVar, i iVar2);

        /* renamed from: e */
        public abstract void mo13979e(i iVar, Thread thread);
    }

    /* renamed from: n2.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: c */
        public static final c f13179c;

        /* renamed from: d */
        public static final c f13180d;

        /* renamed from: a */
        public final boolean f13181a;

        /* renamed from: b */
        public final Throwable f13182b;

        static {
            if (AbstractC3701a.f13172k) {
                f13180d = null;
                f13179c = null;
            } else {
                f13180d = new c(false, null);
                f13179c = new c(true, null);
            }
        }

        public c(boolean z10, Throwable th) {
            this.f13181a = z10;
            this.f13182b = th;
        }
    }

    /* renamed from: n2.a$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: b */
        public static final d f13183b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f13184a;

        /* renamed from: n2.a$d$a */
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
            this.f13184a = (Throwable) AbstractC3701a.m13958e(th);
        }
    }

    /* renamed from: n2.a$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d */
        public static final e f13185d = new e(null, null);

        /* renamed from: a */
        public final Runnable f13186a;

        /* renamed from: b */
        public final Executor f13187b;

        /* renamed from: c */
        public e f13188c;

        public e(Runnable runnable, Executor executor) {
            this.f13186a = runnable;
            this.f13187b = executor;
        }
    }

    /* renamed from: n2.a$f */
    /* loaded from: classes.dex */
    public static final class f extends b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<i, Thread> f13189a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<i, i> f13190b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractC3701a, i> f13191c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractC3701a, e> f13192d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractC3701a, Object> f13193e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC3701a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC3701a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC3701a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f13189a = atomicReferenceFieldUpdater;
            this.f13190b = atomicReferenceFieldUpdater2;
            this.f13191c = atomicReferenceFieldUpdater3;
            this.f13192d = atomicReferenceFieldUpdater4;
            this.f13193e = atomicReferenceFieldUpdater5;
        }

        @Override // p190n2.AbstractC3701a.b
        /* renamed from: a */
        public boolean mo13975a(AbstractC3701a<?> abstractC3701a, e eVar, e eVar2) {
            return C1080o.m4523a(this.f13192d, abstractC3701a, eVar, eVar2);
        }

        @Override // p190n2.AbstractC3701a.b
        /* renamed from: b */
        public boolean mo13976b(AbstractC3701a<?> abstractC3701a, Object obj, Object obj2) {
            return C1080o.m4523a(this.f13193e, abstractC3701a, obj, obj2);
        }

        @Override // p190n2.AbstractC3701a.b
        /* renamed from: c */
        public boolean mo13977c(AbstractC3701a<?> abstractC3701a, i iVar, i iVar2) {
            return C1080o.m4523a(this.f13191c, abstractC3701a, iVar, iVar2);
        }

        @Override // p190n2.AbstractC3701a.b
        /* renamed from: d */
        public void mo13978d(i iVar, i iVar2) {
            this.f13190b.lazySet(iVar, iVar2);
        }

        @Override // p190n2.AbstractC3701a.b
        /* renamed from: e */
        public void mo13979e(i iVar, Thread thread) {
            this.f13189a.lazySet(iVar, thread);
        }
    }

    /* renamed from: n2.a$g */
    /* loaded from: classes.dex */
    public static final class g<V> implements Runnable {

        /* renamed from: h */
        public final AbstractC3701a<V> f13194h;

        /* renamed from: i */
        public final InterfaceFutureC3445f<? extends V> f13195i;

        public g(AbstractC3701a<V> abstractC3701a, InterfaceFutureC3445f<? extends V> interfaceFutureC3445f) {
            this.f13194h = abstractC3701a;
            this.f13195i = interfaceFutureC3445f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f13194h.f13176h != this) {
                return;
            }
            if (AbstractC3701a.f13174m.mo13976b(this.f13194h, this, AbstractC3701a.m13961j(this.f13195i))) {
                AbstractC3701a.m13959g(this.f13194h);
            }
        }
    }

    /* renamed from: n2.a$h */
    /* loaded from: classes.dex */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // p190n2.AbstractC3701a.b
        /* renamed from: a */
        public boolean mo13975a(AbstractC3701a<?> abstractC3701a, e eVar, e eVar2) {
            synchronized (abstractC3701a) {
                if (abstractC3701a.f13177i != eVar) {
                    return false;
                }
                abstractC3701a.f13177i = eVar2;
                return true;
            }
        }

        @Override // p190n2.AbstractC3701a.b
        /* renamed from: b */
        public boolean mo13976b(AbstractC3701a<?> abstractC3701a, Object obj, Object obj2) {
            synchronized (abstractC3701a) {
                if (abstractC3701a.f13176h != obj) {
                    return false;
                }
                abstractC3701a.f13176h = obj2;
                return true;
            }
        }

        @Override // p190n2.AbstractC3701a.b
        /* renamed from: c */
        public boolean mo13977c(AbstractC3701a<?> abstractC3701a, i iVar, i iVar2) {
            synchronized (abstractC3701a) {
                if (abstractC3701a.f13178j != iVar) {
                    return false;
                }
                abstractC3701a.f13178j = iVar2;
                return true;
            }
        }

        @Override // p190n2.AbstractC3701a.b
        /* renamed from: d */
        public void mo13978d(i iVar, i iVar2) {
            iVar.f13198b = iVar2;
        }

        @Override // p190n2.AbstractC3701a.b
        /* renamed from: e */
        public void mo13979e(i iVar, Thread thread) {
            iVar.f13197a = thread;
        }
    }

    /* renamed from: n2.a$i */
    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: c */
        public static final i f13196c = new i(false);

        /* renamed from: a */
        public volatile Thread f13197a;

        /* renamed from: b */
        public volatile i f13198b;

        public i() {
            AbstractC3701a.f13174m.mo13979e(this, Thread.currentThread());
        }

        public i(boolean z10) {
        }

        /* renamed from: a */
        public void m13980a(i iVar) {
            AbstractC3701a.f13174m.mo13978d(this, iVar);
        }

        /* renamed from: b */
        public void m13981b() {
            Thread thread = this.f13197a;
            if (thread != null) {
                this.f13197a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, C1393b.f5292o), AtomicReferenceFieldUpdater.newUpdater(AbstractC3701a.class, i.class, "j"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3701a.class, e.class, "i"), AtomicReferenceFieldUpdater.newUpdater(AbstractC3701a.class, Object.class, C2693h.f10528n));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f13174m = hVar;
        if (th != null) {
            f13173l.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f13175n = new Object();
    }

    /* renamed from: d */
    public static CancellationException m13957d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: e */
    public static <T> T m13958e(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: g */
    public static void m13959g(AbstractC3701a<?> abstractC3701a) {
        e eVar = null;
        while (true) {
            abstractC3701a.m13969n();
            abstractC3701a.m13964c();
            e m13965f = abstractC3701a.m13965f(eVar);
            while (m13965f != null) {
                eVar = m13965f.f13188c;
                Runnable runnable = m13965f.f13186a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC3701a = gVar.f13194h;
                    if (abstractC3701a.f13176h == gVar) {
                        if (f13174m.mo13976b(abstractC3701a, gVar, m13961j(gVar.f13195i))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m13960h(runnable, m13965f.f13187b);
                }
                m13965f = eVar;
            }
            return;
        }
    }

    /* renamed from: h */
    public static void m13960h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f13173l.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    /* renamed from: j */
    public static Object m13961j(InterfaceFutureC3445f<?> interfaceFutureC3445f) {
        if (interfaceFutureC3445f instanceof AbstractC3701a) {
            Object obj = ((AbstractC3701a) interfaceFutureC3445f).f13176h;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f13181a ? cVar.f13182b != null ? new c(false, cVar.f13182b) : c.f13180d : obj;
        }
        boolean isCancelled = interfaceFutureC3445f.isCancelled();
        if ((!f13172k) && isCancelled) {
            return c.f13180d;
        }
        try {
            Object m13962k = m13962k(interfaceFutureC3445f);
            return m13962k == null ? f13175n : m13962k;
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

    /* renamed from: k */
    public static <V> V m13962k(Future<V> future) {
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

    /* renamed from: a */
    public final void m13963a(StringBuilder sb2) {
        String str = "]";
        try {
            Object m13962k = m13962k(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(m13974s(m13962k));
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

    @Override // p170l7.InterfaceFutureC3445f
    /* renamed from: b */
    public final void mo12809b(Runnable runnable, Executor executor) {
        m13958e(runnable);
        m13958e(executor);
        e eVar = this.f13177i;
        if (eVar != e.f13185d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f13188c = eVar;
                if (f13174m.mo13975a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f13177i;
                }
            } while (eVar != e.f13185d);
        }
        m13960h(runnable, executor);
    }

    /* renamed from: c */
    public void m13964c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f13176h;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f13172k ? new c(z10, new CancellationException("Future.cancel() was called.")) : z10 ? c.f13179c : c.f13180d;
        AbstractC3701a<V> abstractC3701a = this;
        boolean z11 = false;
        while (true) {
            if (f13174m.mo13976b(abstractC3701a, obj, cVar)) {
                if (z10) {
                    abstractC3701a.m13967l();
                }
                m13959g(abstractC3701a);
                if (!(obj instanceof g)) {
                    return true;
                }
                InterfaceFutureC3445f<? extends V> interfaceFutureC3445f = ((g) obj).f13195i;
                if (!(interfaceFutureC3445f instanceof AbstractC3701a)) {
                    interfaceFutureC3445f.cancel(z10);
                    return true;
                }
                abstractC3701a = (AbstractC3701a) interfaceFutureC3445f;
                obj = abstractC3701a.f13176h;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z11 = true;
            } else {
                obj = abstractC3701a.f13176h;
                if (!(obj instanceof g)) {
                    return z11;
                }
            }
        }
    }

    /* renamed from: f */
    public final e m13965f(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f13177i;
        } while (!f13174m.mo13975a(this, eVar2, e.f13185d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f13188c;
            eVar4.f13188c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f13176h;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return m13966i(obj2);
        }
        i iVar = this.f13178j;
        if (iVar != i.f13196c) {
            i iVar2 = new i();
            do {
                iVar2.m13980a(iVar);
                if (f13174m.mo13977c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m13970o(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f13176h;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return m13966i(obj);
                }
                iVar = this.f13178j;
            } while (iVar != i.f13196c);
        }
        return m13966i(this.f13176h);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f13176h;
        if ((obj != null) && (!(obj instanceof g))) {
            return m13966i(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f13178j;
            if (iVar != i.f13196c) {
                i iVar2 = new i();
                do {
                    iVar2.m13980a(iVar);
                    if (f13174m.mo13977c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m13970o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f13176h;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m13966i(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m13970o(iVar2);
                    } else {
                        iVar = this.f13178j;
                    }
                } while (iVar != i.f13196c);
            }
            return m13966i(this.f13176h);
        }
        while (nanos > 0) {
            Object obj3 = this.f13176h;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m13966i(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractC3701a = toString();
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
        throw new TimeoutException(str + " for " + abstractC3701a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final V m13966i(Object obj) {
        if (obj instanceof c) {
            throw m13957d("Task was cancelled.", ((c) obj).f13182b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f13184a);
        }
        if (obj == f13175n) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f13176h instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f13176h != null);
    }

    /* renamed from: l */
    public void m13967l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public String m13968m() {
        Object obj = this.f13176h;
        if (obj instanceof g) {
            return "setFuture=[" + m13974s(((g) obj).f13195i) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: n */
    public final void m13969n() {
        i iVar;
        do {
            iVar = this.f13178j;
        } while (!f13174m.mo13977c(this, iVar, i.f13196c));
        while (iVar != null) {
            iVar.m13981b();
            iVar = iVar.f13198b;
        }
    }

    /* renamed from: o */
    public final void m13970o(i iVar) {
        iVar.f13197a = null;
        while (true) {
            i iVar2 = this.f13178j;
            if (iVar2 == i.f13196c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f13198b;
                if (iVar2.f13197a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f13198b = iVar4;
                    if (iVar3.f13197a == null) {
                        break;
                    }
                } else if (!f13174m.mo13977c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* renamed from: p */
    public boolean mo13971p(V v10) {
        if (v10 == null) {
            v10 = (V) f13175n;
        }
        if (!f13174m.mo13976b(this, null, v10)) {
            return false;
        }
        m13959g(this);
        return true;
    }

    /* renamed from: q */
    public boolean mo13972q(Throwable th) {
        if (!f13174m.mo13976b(this, null, new d((Throwable) m13958e(th)))) {
            return false;
        }
        m13959g(this);
        return true;
    }

    /* renamed from: r */
    public boolean mo13973r(InterfaceFutureC3445f<? extends V> interfaceFutureC3445f) {
        d dVar;
        m13958e(interfaceFutureC3445f);
        Object obj = this.f13176h;
        if (obj == null) {
            if (interfaceFutureC3445f.isDone()) {
                if (!f13174m.mo13976b(this, null, m13961j(interfaceFutureC3445f))) {
                    return false;
                }
                m13959g(this);
                return true;
            }
            g gVar = new g(this, interfaceFutureC3445f);
            if (f13174m.mo13976b(this, null, gVar)) {
                try {
                    interfaceFutureC3445f.mo12809b(gVar, EnumC3702b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f13183b;
                    }
                    f13174m.mo13976b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f13176h;
        }
        if (obj instanceof c) {
            interfaceFutureC3445f.cancel(((c) obj).f13181a);
        }
        return false;
    }

    /* renamed from: s */
    public final String m13974s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
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
                    str = m13968m();
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
            m13963a(sb2);
            sb2.append("]");
            return sb2.toString();
        }
        sb2.append(str2);
        sb2.append("]");
        return sb2.toString();
    }
}
