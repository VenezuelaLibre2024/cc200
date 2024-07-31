package p368z7;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p300v.AbstractC5024a;

@SuppressLint({"RestrictedApi"})
/* renamed from: z7.p */
/* loaded from: classes.dex */
public class ScheduledFutureC6066p<V> extends AbstractC5024a<V> implements ScheduledFuture<V> {

    /* renamed from: o */
    public final ScheduledFuture<?> f22561o;

    /* renamed from: z7.p$a */
    /* loaded from: classes.dex */
    public class a implements b<V> {
        public a() {
        }

        @Override // p368z7.ScheduledFutureC6066p.b
        /* renamed from: a */
        public void mo24290a(Throwable th) {
            ScheduledFutureC6066p.this.mo19755w(th);
        }

        @Override // p368z7.ScheduledFutureC6066p.b
        public void set(V v10) {
            ScheduledFutureC6066p.this.mo19754v(v10);
        }
    }

    /* renamed from: z7.p$b */
    /* loaded from: classes.dex */
    public interface b<T> {
        /* renamed from: a */
        void mo24290a(Throwable th);

        void set(T t10);
    }

    /* renamed from: z7.p$c */
    /* loaded from: classes.dex */
    public interface c<T> {
        /* renamed from: a */
        ScheduledFuture<?> mo24262a(b<T> bVar);
    }

    public ScheduledFutureC6066p(c<V> cVar) {
        this.f22561o = cVar.mo24262a(new a());
    }

    @Override // java.lang.Comparable
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f22561o.compareTo(delayed);
    }

    @Override // p300v.AbstractC5024a
    /* renamed from: f */
    public void mo19747f() {
        this.f22561o.cancel(m19757y());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f22561o.getDelay(timeUnit);
    }
}
