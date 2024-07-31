package p066e8;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: e8.n */
/* loaded from: classes.dex */
public class C1743n {

    /* renamed from: a */
    public final Executor f6381a;

    /* renamed from: b */
    public Task<Void> f6382b = Tasks.forResult(null);

    /* renamed from: c */
    public final Object f6383c = new Object();

    /* renamed from: d */
    public final ThreadLocal<Boolean> f6384d = new ThreadLocal<>();

    /* renamed from: e8.n$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1743n.this.f6384d.set(Boolean.TRUE);
        }
    }

    /* renamed from: e8.n$b */
    /* loaded from: classes.dex */
    public class b implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ Runnable f6386a;

        public b(Runnable runnable) {
            this.f6386a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            this.f6386a.run();
            return null;
        }
    }

    /* renamed from: e8.n$c */
    /* loaded from: classes.dex */
    public class c<T> implements Continuation<Void, T> {

        /* renamed from: a */
        public final /* synthetic */ Callable f6388a;

        public c(Callable callable) {
            this.f6388a = callable;
        }

        @Override // com.google.android.gms.tasks.Continuation
        public T then(Task<Void> task) {
            return (T) this.f6388a.call();
        }
    }

    /* renamed from: e8.n$d */
    /* loaded from: classes.dex */
    public class d<T> implements Continuation<T, Void> {
        public d() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: a */
        public Void then(Task<T> task) {
            return null;
        }
    }

    public C1743n(Executor executor) {
        this.f6381a = executor;
        executor.execute(new a());
    }

    /* renamed from: b */
    public void m6881b() {
        if (!m6884e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor m6882c() {
        return this.f6381a;
    }

    /* renamed from: d */
    public final <T> Task<Void> m6883d(Task<T> task) {
        return task.continueWith(this.f6381a, new d());
    }

    /* renamed from: e */
    public final boolean m6884e() {
        return Boolean.TRUE.equals(this.f6384d.get());
    }

    /* renamed from: f */
    public final <T> Continuation<Void, T> m6885f(Callable<T> callable) {
        return new c(callable);
    }

    /* renamed from: g */
    public Task<Void> m6886g(Runnable runnable) {
        return m6887h(new b(runnable));
    }

    /* renamed from: h */
    public <T> Task<T> m6887h(Callable<T> callable) {
        Task<T> continueWith;
        synchronized (this.f6383c) {
            continueWith = this.f6382b.continueWith(this.f6381a, m6885f(callable));
            this.f6382b = m6883d(continueWith);
        }
        return continueWith;
    }

    /* renamed from: i */
    public <T> Task<T> m6888i(Callable<Task<T>> callable) {
        Task<T> continueWithTask;
        synchronized (this.f6383c) {
            continueWithTask = this.f6382b.continueWithTask(this.f6381a, m6885f(callable));
            this.f6382b = m6883d(continueWithTask);
        }
        return continueWithTask;
    }
}
