package p034c7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcv;
import java.util.ArrayList;
import p108h6.C2394s;

/* renamed from: c7.pa */
/* loaded from: classes.dex */
public final class RunnableC0841pa implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ String f3453h;

    /* renamed from: i */
    public final /* synthetic */ String f3454i;

    /* renamed from: j */
    public final /* synthetic */ C0871rc f3455j;

    /* renamed from: k */
    public final /* synthetic */ zzcv f3456k;

    /* renamed from: l */
    public final /* synthetic */ C0966y9 f3457l;

    public RunnableC0841pa(C0966y9 c0966y9, String str, String str2, C0871rc c0871rc, zzcv zzcvVar) {
        this.f3453h = str;
        this.f3454i = str2;
        this.f3455j = c0871rc;
        this.f3456k = zzcvVar;
        this.f3457l = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0821o4 interfaceC0821o4;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                interfaceC0821o4 = this.f3457l.f3778d;
                if (interfaceC0821o4 == null) {
                    this.f3457l.zzj().m3914B().m3997c("Failed to get conditional properties; not connected to service", this.f3453h, this.f3454i);
                } else {
                    C2394s.m9619l(this.f3455j);
                    arrayList = C0857qc.m3754o0(interfaceC0821o4.mo3657e0(this.f3453h, this.f3454i, this.f3455j));
                    this.f3457l.m4042c0();
                }
            } catch (RemoteException e10) {
                this.f3457l.zzj().m3914B().m3998d("Failed to get conditional properties; remote exception", this.f3453h, this.f3454i, e10);
            }
        } finally {
            this.f3457l.mo3096f().m3788S(this.f3456k, arrayList);
        }
    }
}
