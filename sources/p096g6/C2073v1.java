package p096g6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p064e6.C1671d;

/* renamed from: g6.v1 */
/* loaded from: classes.dex */
public final class C2073v1 extends AbstractC2066t0 {

    /* renamed from: b */
    public final AbstractC2071v f8159b;

    /* renamed from: c */
    public final TaskCompletionSource f8160c;

    /* renamed from: d */
    public final InterfaceC2065t f8161d;

    public C2073v1(int i10, AbstractC2071v abstractC2071v, TaskCompletionSource taskCompletionSource, InterfaceC2065t interfaceC2065t) {
        super(i10);
        this.f8160c = taskCompletionSource;
        this.f8159b = abstractC2071v;
        this.f8161d = interfaceC2065t;
        if (i10 == 2 && abstractC2071v.m8267c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // p096g6.AbstractC2079x1
    /* renamed from: a */
    public final void mo8243a(Status status) {
        this.f8160c.trySetException(this.f8161d.mo8074a(status));
    }

    @Override // p096g6.AbstractC2079x1
    /* renamed from: b */
    public final void mo8244b(Exception exc) {
        this.f8160c.trySetException(exc);
    }

    @Override // p096g6.AbstractC2079x1
    /* renamed from: c */
    public final void mo8245c(C2039k0 c2039k0) {
        try {
            this.f8159b.mo8223b(c2039k0.m8209v(), this.f8160c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            mo8243a(AbstractC2079x1.m8282e(e11));
        } catch (RuntimeException e12) {
            this.f8160c.trySetException(e12);
        }
    }

    @Override // p096g6.AbstractC2079x1
    /* renamed from: d */
    public final void mo8265d(C1999a0 c1999a0, boolean z10) {
        c1999a0.m8078d(this.f8160c, z10);
    }

    @Override // p096g6.AbstractC2066t0
    /* renamed from: f */
    public final boolean mo8263f(C2039k0 c2039k0) {
        return this.f8159b.m8267c();
    }

    @Override // p096g6.AbstractC2066t0
    /* renamed from: g */
    public final C1671d[] mo8264g(C2039k0 c2039k0) {
        return this.f8159b.m8269e();
    }
}
