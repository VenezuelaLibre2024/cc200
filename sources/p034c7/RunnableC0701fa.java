package p034c7;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;
import p108h6.C2394s;

/* renamed from: c7.fa */
/* loaded from: classes.dex */
public final class RunnableC0701fa implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0871rc f2936h;

    /* renamed from: i */
    public final /* synthetic */ zzcv f2937i;

    /* renamed from: j */
    public final /* synthetic */ C0966y9 f2938j;

    public RunnableC0701fa(C0966y9 c0966y9, C0871rc c0871rc, zzcv zzcvVar) {
        this.f2936h = c0871rc;
        this.f2937i = zzcvVar;
        this.f2938j = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0821o4 interfaceC0821o4;
        String str = null;
        try {
            try {
                if (this.f2938j.mo3095e().m3410G().m3644y()) {
                    interfaceC0821o4 = this.f2938j.f3778d;
                    if (interfaceC0821o4 == null) {
                        this.f2938j.zzj().m3914B().m3995a("Failed to get app instance id");
                    } else {
                        C2394s.m9619l(this.f2936h);
                        str = interfaceC0821o4.mo3672y(this.f2936h);
                        if (str != null) {
                            this.f2938j.mo3103m().m3955P(str);
                            this.f2938j.mo3095e().f3155i.m3674b(str);
                        }
                        this.f2938j.m4042c0();
                    }
                } else {
                    this.f2938j.zzj().m3920H().m3995a("Analytics storage consent denied; will not get app instance id");
                    this.f2938j.mo3103m().m3955P(null);
                    this.f2938j.mo3095e().f3155i.m3674b(null);
                }
            } catch (RemoteException e10) {
                this.f2938j.zzj().m3914B().m3996b("Failed to get app instance id", e10);
            }
        } finally {
            this.f2938j.mo3096f().m3786R(this.f2937i, null);
        }
    }
}
