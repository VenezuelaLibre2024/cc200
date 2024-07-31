package p097g7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: g7.c */
/* loaded from: classes.dex */
public final class ServiceConnectionC2090c implements ServiceConnection {

    /* renamed from: h */
    public final /* synthetic */ C2092d f8188h;

    public /* synthetic */ ServiceConnectionC2090c(C2092d c2092d, C2088b c2088b) {
        this.f8188h = c2092d;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C2091c0 c2091c0;
        c2091c0 = this.f8188h.f8192b;
        c2091c0.m8293c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f8188h.m8312c().post(new C2107k0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2091c0 c2091c0;
        c2091c0 = this.f8188h.f8192b;
        c2091c0.m8293c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f8188h.m8312c().post(new C2109l0(this));
    }
}
