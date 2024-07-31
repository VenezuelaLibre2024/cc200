package p108h6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p194n6.C3760a;

/* renamed from: h6.t1 */
/* loaded from: classes.dex */
public final class C2399t1 extends AbstractC2364i {

    /* renamed from: f */
    public final HashMap f9706f = new HashMap();

    /* renamed from: g */
    public final Context f9707g;

    /* renamed from: h */
    public volatile Handler f9708h;

    /* renamed from: i */
    public final C2396s1 f9709i;

    /* renamed from: j */
    public final C3760a f9710j;

    /* renamed from: k */
    public final long f9711k;

    /* renamed from: l */
    public final long f9712l;

    /* renamed from: m */
    public volatile Executor f9713m;

    public C2399t1(Context context, Looper looper, Executor executor) {
        C2396s1 c2396s1 = new C2396s1(this, null);
        this.f9709i = c2396s1;
        this.f9707g = context.getApplicationContext();
        this.f9708h = new zzi(looper, c2396s1);
        this.f9710j = C3760a.m14312b();
        this.f9711k = 5000L;
        this.f9712l = 300000L;
        this.f9713m = executor;
    }

    @Override // p108h6.AbstractC2364i
    /* renamed from: f */
    public final void mo9566f(C2387p1 c2387p1, ServiceConnection serviceConnection, String str) {
        C2394s.m9620m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9706f) {
            ServiceConnectionC2390q1 serviceConnectionC2390q1 = (ServiceConnectionC2390q1) this.f9706f.get(c2387p1);
            if (serviceConnectionC2390q1 == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + c2387p1.toString());
            }
            if (!serviceConnectionC2390q1.m9603h(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + c2387p1.toString());
            }
            serviceConnectionC2390q1.m9601f(serviceConnection, str);
            if (serviceConnectionC2390q1.m9604i()) {
                this.f9708h.sendMessageDelayed(this.f9708h.obtainMessage(0, c2387p1), this.f9711k);
            }
        }
    }

    @Override // p108h6.AbstractC2364i
    /* renamed from: h */
    public final boolean mo9568h(C2387p1 c2387p1, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean m9605j;
        C2394s.m9620m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9706f) {
            ServiceConnectionC2390q1 serviceConnectionC2390q1 = (ServiceConnectionC2390q1) this.f9706f.get(c2387p1);
            if (executor == null) {
                executor = this.f9713m;
            }
            if (serviceConnectionC2390q1 == null) {
                serviceConnectionC2390q1 = new ServiceConnectionC2390q1(this, c2387p1);
                serviceConnectionC2390q1.m9599d(serviceConnection, serviceConnection, str);
                serviceConnectionC2390q1.m9600e(str, executor);
                this.f9706f.put(c2387p1, serviceConnectionC2390q1);
            } else {
                this.f9708h.removeMessages(0, c2387p1);
                if (serviceConnectionC2390q1.m9603h(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + c2387p1.toString());
                }
                serviceConnectionC2390q1.m9599d(serviceConnection, serviceConnection, str);
                int m9596a = serviceConnectionC2390q1.m9596a();
                if (m9596a == 1) {
                    serviceConnection.onServiceConnected(serviceConnectionC2390q1.m9597b(), serviceConnectionC2390q1.m9598c());
                } else if (m9596a == 2) {
                    serviceConnectionC2390q1.m9600e(str, executor);
                }
            }
            m9605j = serviceConnectionC2390q1.m9605j();
        }
        return m9605j;
    }
}
