package p034c7;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p108h6.C2394s;

/* renamed from: c7.qa */
/* loaded from: classes.dex */
public final class RunnableC0855qa implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ AtomicReference f3479h;

    /* renamed from: i */
    public final /* synthetic */ String f3480i;

    /* renamed from: j */
    public final /* synthetic */ String f3481j;

    /* renamed from: k */
    public final /* synthetic */ String f3482k;

    /* renamed from: l */
    public final /* synthetic */ C0871rc f3483l;

    /* renamed from: m */
    public final /* synthetic */ C0966y9 f3484m;

    public RunnableC0855qa(C0966y9 c0966y9, AtomicReference atomicReference, String str, String str2, String str3, C0871rc c0871rc) {
        this.f3479h = atomicReference;
        this.f3480i = str;
        this.f3481j = str2;
        this.f3482k = str3;
        this.f3483l = c0871rc;
        this.f3484m = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC0821o4 interfaceC0821o4;
        AtomicReference atomicReference2;
        List<C0690f> mo3666m0;
        synchronized (this.f3479h) {
            try {
                try {
                    interfaceC0821o4 = this.f3484m.f3778d;
                } catch (RemoteException e10) {
                    this.f3484m.zzj().m3914B().m3998d("(legacy) Failed to get conditional properties; remote exception", C0919v4.m3906q(this.f3480i), this.f3481j, e10);
                    this.f3479h.set(Collections.emptyList());
                    atomicReference = this.f3479h;
                }
                if (interfaceC0821o4 == null) {
                    this.f3484m.zzj().m3914B().m3998d("(legacy) Failed to get conditional properties; not connected to service", C0919v4.m3906q(this.f3480i), this.f3481j, this.f3482k);
                    this.f3479h.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f3480i)) {
                    C2394s.m9619l(this.f3483l);
                    atomicReference2 = this.f3479h;
                    mo3666m0 = interfaceC0821o4.mo3657e0(this.f3481j, this.f3482k, this.f3483l);
                } else {
                    atomicReference2 = this.f3479h;
                    mo3666m0 = interfaceC0821o4.mo3666m0(this.f3480i, this.f3481j, this.f3482k);
                }
                atomicReference2.set(mo3666m0);
                this.f3484m.m4042c0();
                atomicReference = this.f3479h;
                atomicReference.notify();
            } finally {
                this.f3479h.notify();
            }
        }
    }
}
