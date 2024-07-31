package p079f6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import p079f6.InterfaceC1853m;

/* renamed from: f6.o */
/* loaded from: classes.dex */
public abstract class AbstractC1855o<R extends InterfaceC1853m> implements InterfaceC1854n<R> {
    @Override // p079f6.InterfaceC1854n
    /* renamed from: a */
    public final void mo7602a(R r10) {
        Status status = r10.getStatus();
        if (status.m4991N()) {
            m7604c(r10);
            return;
        }
        m7603b(status);
        if (r10 instanceof InterfaceC1850j) {
            try {
                ((InterfaceC1850j) r10).release();
            } catch (RuntimeException e10) {
                Log.w("ResultCallbacks", "Unable to release ".concat(String.valueOf(r10)), e10);
            }
        }
    }

    /* renamed from: b */
    public abstract void m7603b(Status status);

    /* renamed from: c */
    public abstract void m7604c(R r10);
}
