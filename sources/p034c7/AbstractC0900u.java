package p034c7;

import android.os.Handler;
import com.google.android.gms.internal.measurement.zzcp;
import p108h6.C2394s;

/* renamed from: c7.u */
/* loaded from: classes.dex */
public abstract class AbstractC0900u {

    /* renamed from: d */
    public static volatile Handler f3603d;

    /* renamed from: a */
    public final InterfaceC0782l7 f3604a;

    /* renamed from: b */
    public final Runnable f3605b;

    /* renamed from: c */
    public volatile long f3606c;

    public AbstractC0900u(InterfaceC0782l7 interfaceC0782l7) {
        C2394s.m9619l(interfaceC0782l7);
        this.f3604a = interfaceC0782l7;
        this.f3605b = new RunnableC0942x(this, interfaceC0782l7);
    }

    /* renamed from: a */
    public final void m3850a() {
        this.f3606c = 0L;
        m3853f().removeCallbacks(this.f3605b);
    }

    /* renamed from: b */
    public final void m3851b(long j10) {
        m3850a();
        if (j10 >= 0) {
            this.f3606c = this.f3604a.zzb().mo14932a();
            if (m3853f().postDelayed(this.f3605b, j10)) {
                return;
            }
            this.f3604a.zzj().m3914B().m3996b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    /* renamed from: d */
    public abstract void mo3524d();

    /* renamed from: e */
    public final boolean m3852e() {
        return this.f3606c != 0;
    }

    /* renamed from: f */
    public final Handler m3853f() {
        Handler handler;
        if (f3603d != null) {
            return f3603d;
        }
        synchronized (AbstractC0900u.class) {
            if (f3603d == null) {
                f3603d = new zzcp(this.f3604a.zza().getMainLooper());
            }
            handler = f3603d;
        }
        return handler;
    }
}
