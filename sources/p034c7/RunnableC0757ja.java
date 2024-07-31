package p034c7;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;

/* renamed from: c7.ja */
/* loaded from: classes.dex */
public final class RunnableC0757ja implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0705g0 f3200h;

    /* renamed from: i */
    public final /* synthetic */ String f3201i;

    /* renamed from: j */
    public final /* synthetic */ zzcv f3202j;

    /* renamed from: k */
    public final /* synthetic */ C0966y9 f3203k;

    public RunnableC0757ja(C0966y9 c0966y9, C0705g0 c0705g0, String str, zzcv zzcvVar) {
        this.f3200h = c0705g0;
        this.f3201i = str;
        this.f3202j = zzcvVar;
        this.f3203k = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0821o4 interfaceC0821o4;
        byte[] bArr = null;
        try {
            try {
                interfaceC0821o4 = this.f3203k.f3778d;
                if (interfaceC0821o4 == null) {
                    this.f3203k.zzj().m3914B().m3995a("Discarding data. Failed to send event to service to bundle");
                } else {
                    bArr = interfaceC0821o4.mo3664k(this.f3200h, this.f3201i);
                    this.f3203k.m4042c0();
                }
            } catch (RemoteException e10) {
                this.f3203k.zzj().m3914B().m3996b("Failed to send event to the service to bundle", e10);
            }
        } finally {
            this.f3203k.mo3096f().m3791U(this.f3202j, bArr);
        }
    }
}
