package p034c7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzcb;

/* renamed from: c7.q5 */
/* loaded from: classes.dex */
public final class ServiceConnectionC0850q5 implements ServiceConnection {

    /* renamed from: h */
    public final String f3463h;

    /* renamed from: i */
    public final /* synthetic */ C0864r5 f3464i;

    public ServiceConnectionC0850q5(C0864r5 c0864r5, String str) {
        this.f3464i = c0864r5;
        this.f3463h = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f3464i.f3506a.zzj().m3919G().m3995a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzby zza = zzcb.zza(iBinder);
            if (zza == null) {
                this.f3464i.f3506a.zzj().m3919G().m3995a("Install Referrer Service implementation was not found");
            } else {
                this.f3464i.f3506a.zzj().m3918F().m3995a("Install Referrer Service connected");
                this.f3464i.f3506a.zzl().m3152y(new RunnableC0892t5(this, zza, this));
            }
        } catch (RuntimeException e10) {
            this.f3464i.f3506a.zzj().m3919G().m3996b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f3464i.f3506a.zzj().m3918F().m3995a("Install Referrer Service disconnected");
    }
}
