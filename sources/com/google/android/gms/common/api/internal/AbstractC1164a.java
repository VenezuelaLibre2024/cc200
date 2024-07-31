package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p079f6.C1841a.b;
import p079f6.InterfaceC1853m;
import p096g6.InterfaceC2010d;
import p108h6.C2394s;

/* renamed from: com.google.android.gms.common.api.internal.a */
/* loaded from: classes.dex */
public abstract class AbstractC1164a<R extends InterfaceC1853m, A extends C1841a.b> extends BasePendingResult<R> implements InterfaceC2010d<R> {
    private final C1841a<?> mApi;
    private final C1841a.c<A> mClientKey;

    public AbstractC1164a(BasePendingResult.HandlerC1163a<R> handlerC1163a) {
        super(handlerC1163a);
        this.mClientKey = new C1841a.c<>();
        this.mApi = null;
    }

    @Deprecated
    public AbstractC1164a(C1841a.c<A> cVar, AbstractC1846f abstractC1846f) {
        super((AbstractC1846f) C2394s.m9620m(abstractC1846f, "GoogleApiClient must not be null"));
        this.mClientKey = (C1841a.c) C2394s.m9619l(cVar);
        this.mApi = null;
    }

    public AbstractC1164a(C1841a<?> c1841a, AbstractC1846f abstractC1846f) {
        super((AbstractC1846f) C2394s.m9620m(abstractC1846f, "GoogleApiClient must not be null"));
        C2394s.m9620m(c1841a, "Api must not be null");
        this.mClientKey = c1841a.m7579b();
        this.mApi = c1841a;
    }

    private void setFailedResult(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    public abstract void doExecute(A a10);

    public final C1841a<?> getApi() {
        return this.mApi;
    }

    public final C1841a.c<A> getClientKey() {
        return this.mClientKey;
    }

    public void onSetFailedResult(R r10) {
    }

    public final void run(A a10) {
        try {
            doExecute(a10);
        } catch (DeadObjectException e10) {
            setFailedResult(e10);
            throw e10;
        } catch (RemoteException e11) {
            setFailedResult(e11);
        }
    }

    @Override // p096g6.InterfaceC2010d
    public final void setFailedResult(Status status) {
        C2394s.m9609b(!status.m4991N(), "Failed result must not be success");
        R createFailedResult = createFailedResult(status);
        setResult((AbstractC1164a<R, A>) createFailedResult);
        onSetFailedResult(createFailedResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((AbstractC1164a<R, A>) obj);
    }
}
