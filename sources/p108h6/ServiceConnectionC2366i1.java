package p108h6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: h6.i1 */
/* loaded from: classes.dex */
public final class ServiceConnectionC2366i1 implements ServiceConnection {

    /* renamed from: h */
    public final int f9646h;

    /* renamed from: i */
    public final /* synthetic */ AbstractC2346c f9647i;

    public ServiceConnectionC2366i1(AbstractC2346c abstractC2346c, int i10) {
        this.f9647i = abstractC2346c;
        this.f9646h = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        AbstractC2346c abstractC2346c = this.f9647i;
        if (iBinder == null) {
            AbstractC2346c.zzk(abstractC2346c, 16);
            return;
        }
        obj = abstractC2346c.zzq;
        synchronized (obj) {
            AbstractC2346c abstractC2346c2 = this.f9647i;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            abstractC2346c2.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC2379n)) ? new C2413y0(iBinder) : (InterfaceC2379n) queryLocalInterface;
        }
        this.f9647i.zzl(0, null, this.f9646h);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f9647i.zzq;
        synchronized (obj) {
            this.f9647i.zzr = null;
        }
        AbstractC2346c abstractC2346c = this.f9647i;
        int i10 = this.f9646h;
        Handler handler = abstractC2346c.zzb;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
