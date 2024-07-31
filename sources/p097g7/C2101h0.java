package p097g7;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: g7.h0 */
/* loaded from: classes.dex */
public final class C2101h0 extends AbstractRunnableC2093d0 {

    /* renamed from: h */
    public final /* synthetic */ C2092d f8213h;

    public C2101h0(C2092d c2092d) {
        this.f8213h = c2092d;
    }

    @Override // p097g7.AbstractRunnableC2093d0
    /* renamed from: b */
    public final void mo5116b() {
        Object obj;
        AtomicInteger atomicInteger;
        IInterface iInterface;
        C2091c0 c2091c0;
        Context context;
        ServiceConnection serviceConnection;
        AtomicInteger atomicInteger2;
        C2091c0 c2091c02;
        obj = this.f8213h.f8196f;
        synchronized (obj) {
            atomicInteger = this.f8213h.f8202l;
            if (atomicInteger.get() > 0) {
                atomicInteger2 = this.f8213h.f8202l;
                if (atomicInteger2.decrementAndGet() > 0) {
                    c2091c02 = this.f8213h.f8192b;
                    c2091c02.m8293c("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
            }
            C2092d c2092d = this.f8213h;
            iInterface = c2092d.f8204n;
            if (iInterface != null) {
                c2091c0 = c2092d.f8192b;
                c2091c0.m8293c("Unbind from service.", new Object[0]);
                C2092d c2092d2 = this.f8213h;
                context = c2092d2.f8191a;
                serviceConnection = c2092d2.f8203m;
                context.unbindService(serviceConnection);
                this.f8213h.f8197g = false;
                this.f8213h.f8204n = null;
                this.f8213h.f8203m = null;
            }
            this.f8213h.m8318x();
        }
    }
}
