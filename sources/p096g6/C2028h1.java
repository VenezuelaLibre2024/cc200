package p096g6;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p079f6.AbstractC1848h;
import p079f6.AbstractC1856p;
import p079f6.AbstractC1857q;
import p079f6.InterfaceC1853m;
import p079f6.InterfaceC1854n;

/* renamed from: g6.h1 */
/* loaded from: classes.dex */
public final class C2028h1<R extends InterfaceC1853m> extends AbstractC1848h<R> {

    /* renamed from: a */
    public final Status f8045a;

    /* renamed from: a */
    public final Status m8152a() {
        return this.f8045a;
    }

    @Override // p079f6.AbstractC1848h
    public final void addStatusListener(AbstractC1848h.a aVar) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    @Override // p079f6.AbstractC1848h
    public final R await() {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    @Override // p079f6.AbstractC1848h
    public final R await(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    @Override // p079f6.AbstractC1848h
    public final void cancel() {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    @Override // p079f6.AbstractC1848h
    public final boolean isCanceled() {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    @Override // p079f6.AbstractC1848h
    public final void setResultCallback(InterfaceC1854n<? super R> interfaceC1854n) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    @Override // p079f6.AbstractC1848h
    public final void setResultCallback(InterfaceC1854n<? super R> interfaceC1854n, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }

    @Override // p079f6.AbstractC1848h
    public final <S extends InterfaceC1853m> AbstractC1857q<S> then(AbstractC1856p<? super R, ? extends S> abstractC1856p) {
        throw new UnsupportedOperationException("Operation not supported on PendingResults generated by ResultTransform.createFailedResult()");
    }
}
