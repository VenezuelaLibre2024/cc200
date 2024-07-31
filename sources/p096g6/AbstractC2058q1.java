package p096g6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.C1842b;

/* renamed from: g6.q1 */
/* loaded from: classes.dex */
public abstract class AbstractC2058q1 extends AbstractC2066t0 {

    /* renamed from: b */
    public final TaskCompletionSource f8130b;

    public AbstractC2058q1(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f8130b = taskCompletionSource;
    }

    @Override // p096g6.AbstractC2079x1
    /* renamed from: a */
    public final void mo8243a(Status status) {
        this.f8130b.trySetException(new C1842b(status));
    }

    @Override // p096g6.AbstractC2079x1
    /* renamed from: b */
    public final void mo8244b(Exception exc) {
        this.f8130b.trySetException(exc);
    }

    @Override // p096g6.AbstractC2079x1
    /* renamed from: c */
    public final void mo8245c(C2039k0 c2039k0) {
        try {
            mo8246h(c2039k0);
        } catch (DeadObjectException e10) {
            mo8243a(AbstractC2079x1.m8282e(e10));
            throw e10;
        } catch (RemoteException e11) {
            mo8243a(AbstractC2079x1.m8282e(e11));
        } catch (RuntimeException e12) {
            this.f8130b.trySetException(e12);
        }
    }

    /* renamed from: h */
    public abstract void mo8246h(C2039k0 c2039k0);
}
