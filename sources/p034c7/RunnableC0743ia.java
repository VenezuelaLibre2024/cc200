package p034c7;

import android.os.RemoteException;

/* renamed from: c7.ia */
/* loaded from: classes.dex */
public final class RunnableC0743ia implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0854q9 f3184h;

    /* renamed from: i */
    public final /* synthetic */ C0966y9 f3185i;

    public RunnableC0743ia(C0966y9 c0966y9, C0854q9 c0854q9) {
        this.f3184h = c0854q9;
        this.f3185i = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0821o4 interfaceC0821o4;
        long j10;
        String str;
        String str2;
        String packageName;
        interfaceC0821o4 = this.f3185i.f3778d;
        if (interfaceC0821o4 == null) {
            this.f3185i.zzj().m3914B().m3995a("Failed to send current screen to service");
            return;
        }
        try {
            C0854q9 c0854q9 = this.f3184h;
            if (c0854q9 == null) {
                j10 = 0;
                str = null;
                str2 = null;
                packageName = this.f3185i.zza().getPackageName();
            } else {
                j10 = c0854q9.f3475c;
                str = c0854q9.f3473a;
                str2 = c0854q9.f3474b;
                packageName = this.f3185i.zza().getPackageName();
            }
            interfaceC0821o4.mo3661i0(j10, str, str2, packageName);
            this.f3185i.m4042c0();
        } catch (RemoteException e10) {
            this.f3185i.zzj().m3914B().m3996b("Failed to send current screen to the service", e10);
        }
    }
}
