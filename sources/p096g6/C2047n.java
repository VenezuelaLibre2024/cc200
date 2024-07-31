package p096g6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;
import p079f6.AbstractC1847g;
import p079f6.AbstractC1848h;
import p079f6.AbstractC1856p;
import p079f6.AbstractC1857q;
import p079f6.InterfaceC1853m;
import p079f6.InterfaceC1854n;

/* renamed from: g6.n */
/* loaded from: classes.dex */
public final class C2047n<R extends InterfaceC1853m> extends AbstractC1847g<R> {

    /* renamed from: a */
    public final BasePendingResult f8103a;

    public C2047n(AbstractC1848h abstractC1848h) {
        this.f8103a = (BasePendingResult) abstractC1848h;
    }

    @Override // p079f6.AbstractC1848h
    public final void addStatusListener(AbstractC1848h.a aVar) {
        this.f8103a.addStatusListener(aVar);
    }

    @Override // p079f6.AbstractC1848h
    public final R await() {
        return (R) this.f8103a.await();
    }

    @Override // p079f6.AbstractC1848h
    public final R await(long j10, TimeUnit timeUnit) {
        return (R) this.f8103a.await(j10, timeUnit);
    }

    @Override // p079f6.AbstractC1848h
    public final void cancel() {
        this.f8103a.cancel();
    }

    @Override // p079f6.AbstractC1848h
    public final boolean isCanceled() {
        return this.f8103a.isCanceled();
    }

    @Override // p079f6.AbstractC1848h
    public final void setResultCallback(InterfaceC1854n<? super R> interfaceC1854n) {
        this.f8103a.setResultCallback(interfaceC1854n);
    }

    @Override // p079f6.AbstractC1848h
    public final void setResultCallback(InterfaceC1854n<? super R> interfaceC1854n, long j10, TimeUnit timeUnit) {
        this.f8103a.setResultCallback(interfaceC1854n, j10, timeUnit);
    }

    @Override // p079f6.AbstractC1848h
    public final <S extends InterfaceC1853m> AbstractC1857q<S> then(AbstractC1856p<? super R, ? extends S> abstractC1856p) {
        return this.f8103a.then(abstractC1856p);
    }
}
