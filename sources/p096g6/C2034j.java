package p096g6;

import android.os.Looper;
import java.util.concurrent.Executor;
import p108h6.C2394s;
import p223p6.ExecutorC4055a;

/* renamed from: g6.j */
/* loaded from: classes.dex */
public final class C2034j<L> {

    /* renamed from: a */
    public final Executor f8055a;

    /* renamed from: b */
    public volatile Object f8056b;

    /* renamed from: c */
    public volatile a f8057c;

    /* renamed from: g6.j$a */
    /* loaded from: classes.dex */
    public static final class a<L> {

        /* renamed from: a */
        public final Object f8058a;

        /* renamed from: b */
        public final String f8059b;

        public a(L l10, String str) {
            this.f8058a = l10;
            this.f8059b = str;
        }

        /* renamed from: a */
        public String m8163a() {
            return this.f8059b + "@" + System.identityHashCode(this.f8058a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8058a == aVar.f8058a && this.f8059b.equals(aVar.f8059b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f8058a) * 31) + this.f8059b.hashCode();
        }
    }

    /* renamed from: g6.j$b */
    /* loaded from: classes.dex */
    public interface b<L> {
        void notifyListener(L l10);

        void onNotifyListenerFailed();
    }

    public C2034j(Looper looper, L l10, String str) {
        this.f8055a = new ExecutorC4055a(looper);
        this.f8056b = C2394s.m9620m(l10, "Listener must not be null");
        this.f8057c = new a(l10, C2394s.m9613f(str));
    }

    public C2034j(Executor executor, L l10, String str) {
        this.f8055a = (Executor) C2394s.m9620m(executor, "Executor must not be null");
        this.f8056b = C2394s.m9620m(l10, "Listener must not be null");
        this.f8057c = new a(l10, C2394s.m9613f(str));
    }

    /* renamed from: a */
    public void m8159a() {
        this.f8056b = null;
        this.f8057c = null;
    }

    /* renamed from: b */
    public a<L> m8160b() {
        return this.f8057c;
    }

    /* renamed from: c */
    public void m8161c(final b<? super L> bVar) {
        C2394s.m9620m(bVar, "Notifier must not be null");
        this.f8055a.execute(new Runnable() { // from class: g6.u0
            @Override // java.lang.Runnable
            public final void run() {
                C2034j.this.m8162d(bVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final void m8162d(b bVar) {
        Object obj = this.f8056b;
        if (obj == null) {
            bVar.onNotifyListenerFailed();
            return;
        }
        try {
            bVar.notifyListener(obj);
        } catch (RuntimeException e10) {
            bVar.onNotifyListenerFailed();
            throw e10;
        }
    }
}
