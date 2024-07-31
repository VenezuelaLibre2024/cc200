package p034c7;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p108h6.C2394s;

/* renamed from: c7.sa */
/* loaded from: classes.dex */
public final class RunnableC0883sa implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ AtomicReference f3573h;

    /* renamed from: i */
    public final /* synthetic */ String f3574i;

    /* renamed from: j */
    public final /* synthetic */ String f3575j;

    /* renamed from: k */
    public final /* synthetic */ String f3576k;

    /* renamed from: l */
    public final /* synthetic */ C0871rc f3577l;

    /* renamed from: m */
    public final /* synthetic */ boolean f3578m;

    /* renamed from: n */
    public final /* synthetic */ C0966y9 f3579n;

    public RunnableC0883sa(C0966y9 c0966y9, AtomicReference atomicReference, String str, String str2, String str3, C0871rc c0871rc, boolean z10) {
        this.f3573h = atomicReference;
        this.f3574i = str;
        this.f3575j = str2;
        this.f3576k = str3;
        this.f3577l = c0871rc;
        this.f3578m = z10;
        this.f3579n = c0966y9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        InterfaceC0821o4 interfaceC0821o4;
        AtomicReference atomicReference2;
        List<C0787lc> mo3670v;
        synchronized (this.f3573h) {
            try {
                try {
                    interfaceC0821o4 = this.f3579n.f3778d;
                } finally {
                    this.f3573h.notify();
                }
            } catch (RemoteException e10) {
                this.f3579n.zzj().m3914B().m3998d("(legacy) Failed to get user properties; remote exception", C0919v4.m3906q(this.f3574i), this.f3575j, e10);
                this.f3573h.set(Collections.emptyList());
                atomicReference = this.f3573h;
            }
            if (interfaceC0821o4 == null) {
                this.f3579n.zzj().m3914B().m3998d("(legacy) Failed to get user properties; not connected to service", C0919v4.m3906q(this.f3574i), this.f3575j, this.f3576k);
                this.f3573h.set(Collections.emptyList());
                return;
            }
            if (TextUtils.isEmpty(this.f3574i)) {
                C2394s.m9619l(this.f3577l);
                atomicReference2 = this.f3573h;
                mo3670v = interfaceC0821o4.mo3668q(this.f3575j, this.f3576k, this.f3578m, this.f3577l);
            } else {
                atomicReference2 = this.f3573h;
                mo3670v = interfaceC0821o4.mo3670v(this.f3574i, this.f3575j, this.f3576k, this.f3578m);
            }
            atomicReference2.set(mo3670v);
            this.f3579n.m4042c0();
            atomicReference = this.f3573h;
            atomicReference.notify();
        }
    }
}
