package p300v;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p170l7.InterfaceFutureC3445f;

/* renamed from: v.b */
/* loaded from: classes.dex */
public final class C5025b {

    /* renamed from: v.b$a */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        public Object f18855a;

        /* renamed from: b */
        public d<T> f18856b;

        /* renamed from: c */
        public C5026c<Void> f18857c = C5026c.m19774z();

        /* renamed from: d */
        public boolean f18858d;

        /* renamed from: a */
        public void m19766a() {
            this.f18855a = null;
            this.f18856b = null;
            this.f18857c.mo19754v(null);
        }

        /* renamed from: b */
        public boolean m19767b(T t10) {
            this.f18858d = true;
            d<T> dVar = this.f18856b;
            boolean z10 = dVar != null && dVar.m19772c(t10);
            if (z10) {
                m19769d();
            }
            return z10;
        }

        /* renamed from: c */
        public boolean m19768c() {
            this.f18858d = true;
            d<T> dVar = this.f18856b;
            boolean z10 = dVar != null && dVar.m19771a(true);
            if (z10) {
                m19769d();
            }
            return z10;
        }

        /* renamed from: d */
        public final void m19769d() {
            this.f18855a = null;
            this.f18856b = null;
            this.f18857c = null;
        }

        /* renamed from: e */
        public boolean m19770e(Throwable th) {
            this.f18858d = true;
            d<T> dVar = this.f18856b;
            boolean z10 = dVar != null && dVar.m19773d(th);
            if (z10) {
                m19769d();
            }
            return z10;
        }

        public void finalize() {
            C5026c<Void> c5026c;
            d<T> dVar = this.f18856b;
            if (dVar != null && !dVar.isDone()) {
                dVar.m19773d(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f18855a));
            }
            if (this.f18858d || (c5026c = this.f18857c) == null) {
                return;
            }
            c5026c.mo19754v(null);
        }
    }

    /* renamed from: v.b$b */
    /* loaded from: classes.dex */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: v.b$c */
    /* loaded from: classes.dex */
    public interface c<T> {
        /* renamed from: a */
        Object mo12397a(a<T> aVar);
    }

    /* renamed from: v.b$d */
    /* loaded from: classes.dex */
    public static final class d<T> implements InterfaceFutureC3445f<T> {

        /* renamed from: h */
        public final WeakReference<a<T>> f18859h;

        /* renamed from: i */
        public final AbstractC5024a<T> f18860i = new a();

        /* renamed from: v.b$d$a */
        /* loaded from: classes.dex */
        public class a extends AbstractC5024a<T> {
            public a() {
            }

            @Override // p300v.AbstractC5024a
            /* renamed from: s */
            public String mo19751s() {
                a<T> aVar = d.this.f18859h.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f18855a + "]";
            }
        }

        public d(a<T> aVar) {
            this.f18859h = new WeakReference<>(aVar);
        }

        /* renamed from: a */
        public boolean m19771a(boolean z10) {
            return this.f18860i.cancel(z10);
        }

        @Override // p170l7.InterfaceFutureC3445f
        /* renamed from: b */
        public void mo12809b(Runnable runnable, Executor executor) {
            this.f18860i.mo12809b(runnable, executor);
        }

        /* renamed from: c */
        public boolean m19772c(T t10) {
            return this.f18860i.mo19754v(t10);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            a<T> aVar = this.f18859h.get();
            boolean cancel = this.f18860i.cancel(z10);
            if (cancel && aVar != null) {
                aVar.m19766a();
            }
            return cancel;
        }

        /* renamed from: d */
        public boolean m19773d(Throwable th) {
            return this.f18860i.mo19755w(th);
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.f18860i.get();
        }

        @Override // java.util.concurrent.Future
        public T get(long j10, TimeUnit timeUnit) {
            return this.f18860i.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f18860i.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f18860i.isDone();
        }

        public String toString() {
            return this.f18860i.toString();
        }
    }

    /* renamed from: a */
    public static <T> InterfaceFutureC3445f<T> m19765a(c<T> cVar) {
        a<T> aVar = new a<>();
        d<T> dVar = new d<>(aVar);
        aVar.f18856b = dVar;
        aVar.f18855a = cVar.getClass();
        try {
            Object mo12397a = cVar.mo12397a(aVar);
            if (mo12397a != null) {
                aVar.f18855a = mo12397a;
            }
        } catch (Exception e10) {
            dVar.m19773d(e10);
        }
        return dVar;
    }
}
