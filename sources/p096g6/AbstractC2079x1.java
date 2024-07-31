package p096g6;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: g6.x1 */
/* loaded from: classes.dex */
public abstract class AbstractC2079x1 {

    /* renamed from: a */
    public final int f8169a;

    public AbstractC2079x1(int i10) {
        this.f8169a = i10;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ Status m8282e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    /* renamed from: a */
    public abstract void mo8243a(Status status);

    /* renamed from: b */
    public abstract void mo8244b(Exception exc);

    /* renamed from: c */
    public abstract void mo8245c(C2039k0 c2039k0);

    /* renamed from: d */
    public abstract void mo8265d(C1999a0 c1999a0, boolean z10);
}
