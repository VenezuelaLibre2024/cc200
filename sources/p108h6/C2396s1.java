package p108h6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: h6.s1 */
/* loaded from: classes.dex */
public final class C2396s1 implements Handler.Callback {

    /* renamed from: h */
    public final /* synthetic */ C2399t1 f9697h;

    public /* synthetic */ C2396s1(C2399t1 c2399t1, C2393r1 c2393r1) {
        this.f9697h = c2399t1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i10 = message.what;
        if (i10 == 0) {
            hashMap = this.f9697h.f9706f;
            synchronized (hashMap) {
                C2387p1 c2387p1 = (C2387p1) message.obj;
                hashMap2 = this.f9697h.f9706f;
                ServiceConnectionC2390q1 serviceConnectionC2390q1 = (ServiceConnectionC2390q1) hashMap2.get(c2387p1);
                if (serviceConnectionC2390q1 != null && serviceConnectionC2390q1.m9604i()) {
                    if (serviceConnectionC2390q1.m9605j()) {
                        serviceConnectionC2390q1.m9602g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f9697h.f9706f;
                    hashMap3.remove(c2387p1);
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        hashMap4 = this.f9697h.f9706f;
        synchronized (hashMap4) {
            C2387p1 c2387p12 = (C2387p1) message.obj;
            hashMap5 = this.f9697h.f9706f;
            ServiceConnectionC2390q1 serviceConnectionC2390q12 = (ServiceConnectionC2390q1) hashMap5.get(c2387p12);
            if (serviceConnectionC2390q12 != null && serviceConnectionC2390q12.m9596a() == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(c2387p12), new Exception());
                ComponentName m9597b = serviceConnectionC2390q12.m9597b();
                if (m9597b == null) {
                    m9597b = c2387p12.m9588a();
                }
                if (m9597b == null) {
                    String m9590c = c2387p12.m9590c();
                    C2394s.m9619l(m9590c);
                    m9597b = new ComponentName(m9590c, "unknown");
                }
                serviceConnectionC2390q12.onServiceDisconnected(m9597b);
            }
        }
        return true;
    }
}
