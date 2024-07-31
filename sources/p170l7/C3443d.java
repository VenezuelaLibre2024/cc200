package p170l7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p109h7.C2426i;
import p109h7.C2432o;
import p183m7.AbstractC3548a;
import p183m7.C3549b;

/* renamed from: l7.d */
/* loaded from: classes.dex */
public final class C3443d extends AbstractC3444e {

    /* renamed from: l7.d$a */
    /* loaded from: classes.dex */
    public static final class a<V> implements Runnable {

        /* renamed from: h */
        public final Future<V> f12116h;

        /* renamed from: i */
        public final InterfaceC3442c<? super V> f12117i;

        public a(Future<V> future, InterfaceC3442c<? super V> interfaceC3442c) {
            this.f12116h = future;
            this.f12117i = interfaceC3442c;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable m13196a;
            Future<V> future = this.f12116h;
            if ((future instanceof AbstractC3548a) && (m13196a = C3549b.m13196a((AbstractC3548a) future)) != null) {
                this.f12117i.mo3296a(m13196a);
                return;
            }
            try {
                this.f12117i.onSuccess(C3443d.m12829b(this.f12116h));
            } catch (Error e10) {
                e = e10;
                this.f12117i.mo3296a(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f12117i.mo3296a(e);
            } catch (ExecutionException e12) {
                this.f12117i.mo3296a(e12.getCause());
            }
        }

        public String toString() {
            return C2426i.m9682b(this).m9686c(this.f12117i).toString();
        }
    }

    /* renamed from: a */
    public static <V> void m12828a(InterfaceFutureC3445f<V> interfaceFutureC3445f, InterfaceC3442c<? super V> interfaceC3442c, Executor executor) {
        C2432o.m9704j(interfaceC3442c);
        interfaceFutureC3445f.mo12809b(new a(interfaceFutureC3445f, interfaceC3442c), executor);
    }

    /* renamed from: b */
    public static <V> V m12829b(Future<V> future) {
        C2432o.m9711q(future.isDone(), "Future was expected to be done: %s", future);
        return (V) C3449j.m12833a(future);
    }
}
