package p034c7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;
import p108h6.C2394s;

/* renamed from: c7.z9 */
/* loaded from: classes.dex */
public final class RunnableC0980z9 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ String f3846h;

    /* renamed from: i */
    public final /* synthetic */ String f3847i;

    /* renamed from: j */
    public final /* synthetic */ C0871rc f3848j;

    /* renamed from: k */
    public final /* synthetic */ boolean f3849k;

    /* renamed from: l */
    public final /* synthetic */ zzcv f3850l;

    /* renamed from: m */
    public final /* synthetic */ C0966y9 f3851m;

    public RunnableC0980z9(C0966y9 c0966y9, String str, String str2, C0871rc c0871rc, boolean z10, zzcv zzcvVar) {
        this.f3846h = str;
        this.f3847i = str2;
        this.f3848j = c0871rc;
        this.f3849k = z10;
        this.f3850l = zzcvVar;
        this.f3851m = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0821o4 interfaceC0821o4;
        Bundle bundle = new Bundle();
        try {
            try {
                interfaceC0821o4 = this.f3851m.f3778d;
                if (interfaceC0821o4 == null) {
                    this.f3851m.zzj().m3914B().m3997c("Failed to get user properties; not connected to service", this.f3846h, this.f3847i);
                } else {
                    C2394s.m9619l(this.f3848j);
                    bundle = C0857qc.m3734B(interfaceC0821o4.mo3668q(this.f3846h, this.f3847i, this.f3849k, this.f3848j));
                    this.f3851m.m4042c0();
                }
            } catch (RemoteException e10) {
                this.f3851m.zzj().m3914B().m3997c("Failed to get user properties; remote exception", this.f3846h, e10);
            }
        } finally {
            this.f3851m.mo3096f().m3784Q(this.f3850l, bundle);
        }
    }
}
