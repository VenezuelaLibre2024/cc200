package p108h6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import p064e6.C1667b;
import p108h6.AbstractC2346c;

/* renamed from: h6.j1 */
/* loaded from: classes.dex */
public final class C2369j1 extends AbstractC2404v0 {

    /* renamed from: g */
    public final IBinder f9651g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC2346c f9652h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2369j1(AbstractC2346c abstractC2346c, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC2346c, i10, bundle);
        this.f9652h = abstractC2346c;
        this.f9651g = iBinder;
    }

    @Override // p108h6.AbstractC2404v0
    /* renamed from: f */
    public final void mo9577f(C1667b c1667b) {
        if (this.f9652h.zzx != null) {
            this.f9652h.zzx.mo3823e(c1667b);
        }
        this.f9652h.onConnectionFailed(c1667b);
    }

    @Override // p108h6.AbstractC2404v0
    /* renamed from: g */
    public final boolean mo9578g() {
        String str;
        String interfaceDescriptor;
        AbstractC2346c.a aVar;
        AbstractC2346c.a aVar2;
        try {
            IBinder iBinder = this.f9651g;
            C2394s.m9619l(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f9652h.getServiceDescriptor().equals(interfaceDescriptor)) {
            str = "service descriptor mismatch: " + this.f9652h.getServiceDescriptor() + " vs. " + interfaceDescriptor;
            Log.w("GmsClient", str);
            return false;
        }
        IInterface createServiceInterface = this.f9652h.createServiceInterface(this.f9651g);
        if (createServiceInterface == null || !(AbstractC2346c.zzn(this.f9652h, 2, 4, createServiceInterface) || AbstractC2346c.zzn(this.f9652h, 3, 4, createServiceInterface))) {
            return false;
        }
        this.f9652h.zzB = null;
        AbstractC2346c abstractC2346c = this.f9652h;
        Bundle connectionHint = abstractC2346c.getConnectionHint();
        aVar = abstractC2346c.zzw;
        if (aVar == null) {
            return true;
        }
        aVar2 = this.f9652h.zzw;
        aVar2.mo3825g(connectionHint);
        return true;
    }
}
