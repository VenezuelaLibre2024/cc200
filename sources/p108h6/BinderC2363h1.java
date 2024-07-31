package p108h6;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* renamed from: h6.h1 */
/* loaded from: classes.dex */
public final class BinderC2363h1 extends AbstractBinderC2410x0 {

    /* renamed from: a */
    public AbstractC2346c f9639a;

    /* renamed from: b */
    public final int f9640b;

    public BinderC2363h1(AbstractC2346c abstractC2346c, int i10) {
        this.f9639a = abstractC2346c;
        this.f9640b = i10;
    }

    @Override // p108h6.InterfaceC2376m
    /* renamed from: B */
    public final void mo9558B(int i10, IBinder iBinder, C2375l1 c2375l1) {
        AbstractC2346c abstractC2346c = this.f9639a;
        C2394s.m9620m(abstractC2346c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C2394s.m9619l(c2375l1);
        AbstractC2346c.zzj(abstractC2346c, c2375l1);
        mo9560x0(i10, iBinder, c2375l1.f9657h);
    }

    @Override // p108h6.InterfaceC2376m
    /* renamed from: W */
    public final void mo9559W(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // p108h6.InterfaceC2376m
    /* renamed from: x0 */
    public final void mo9560x0(int i10, IBinder iBinder, Bundle bundle) {
        C2394s.m9620m(this.f9639a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f9639a.onPostInitHandler(i10, iBinder, bundle, this.f9640b);
        this.f9639a = null;
    }
}
