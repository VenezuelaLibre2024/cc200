package p079f6;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p079f6.InterfaceC1853m;

/* renamed from: f6.h */
/* loaded from: classes.dex */
public abstract class AbstractC1848h<R extends InterfaceC1853m> {

    /* renamed from: f6.h$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo7596a(Status status);
    }

    public void addStatusListener(a aVar) {
        throw new UnsupportedOperationException();
    }

    public abstract R await();

    public abstract R await(long j10, TimeUnit timeUnit);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(InterfaceC1854n<? super R> interfaceC1854n);

    public abstract void setResultCallback(InterfaceC1854n<? super R> interfaceC1854n, long j10, TimeUnit timeUnit);

    public <S extends InterfaceC1853m> AbstractC1857q<S> then(AbstractC1856p<? super R, ? extends S> abstractC1856p) {
        throw new UnsupportedOperationException();
    }
}
