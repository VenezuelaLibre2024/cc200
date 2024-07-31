package p034c7;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import p064e6.C1667b;
import p108h6.AbstractC2346c;
import p108h6.C2394s;
import p194n6.C3760a;

/* renamed from: c7.ra */
/* loaded from: classes.dex */
public final class ServiceConnectionC0869ra implements ServiceConnection, AbstractC2346c.a, AbstractC2346c.b {

    /* renamed from: h */
    public volatile boolean f3517h;

    /* renamed from: i */
    public volatile C0933w4 f3518i;

    /* renamed from: j */
    public final /* synthetic */ C0966y9 f3519j;

    public ServiceConnectionC0869ra(C0966y9 c0966y9) {
        this.f3519j = c0966y9;
    }

    /* renamed from: a */
    public final void m3820a() {
        this.f3519j.mo3099i();
        Context zza = this.f3519j.zza();
        synchronized (this) {
            if (this.f3517h) {
                this.f3519j.zzj().m3918F().m3995a("Connection attempt already in progress");
                return;
            }
            if (this.f3518i != null && (this.f3518i.isConnecting() || this.f3518i.isConnected())) {
                this.f3519j.zzj().m3918F().m3995a("Already awaiting connection attempt");
                return;
            }
            this.f3518i = new C0933w4(zza, Looper.getMainLooper(), this, this);
            this.f3519j.zzj().m3918F().m3995a("Connecting to remote service");
            this.f3517h = true;
            C2394s.m9619l(this.f3518i);
            this.f3518i.checkAvailabilityAndConnect();
        }
    }

    /* renamed from: b */
    public final void m3821b(Intent intent) {
        ServiceConnectionC0869ra serviceConnectionC0869ra;
        this.f3519j.mo3099i();
        Context zza = this.f3519j.zza();
        C3760a m14312b = C3760a.m14312b();
        synchronized (this) {
            if (this.f3517h) {
                this.f3519j.zzj().m3918F().m3995a("Connection attempt already in progress");
                return;
            }
            this.f3519j.zzj().m3918F().m3995a("Using local app measurement service");
            this.f3517h = true;
            serviceConnectionC0869ra = this.f3519j.f3777c;
            m14312b.m14316a(zza, intent, serviceConnectionC0869ra, 129);
        }
    }

    @Override // p108h6.AbstractC2346c.a
    /* renamed from: c */
    public final void mo3822c(int i10) {
        C2394s.m9612e("MeasurementServiceConnection.onConnectionSuspended");
        this.f3519j.zzj().m3913A().m3995a("Service connection suspended");
        this.f3519j.zzl().m3152y(new RunnableC0925va(this));
    }

    @Override // p108h6.AbstractC2346c.b
    /* renamed from: e */
    public final void mo3823e(C1667b c1667b) {
        C2394s.m9612e("MeasurementServiceConnection.onConnectionFailed");
        C0919v4 m3518z = this.f3519j.f3198a.m3518z();
        if (m3518z != null) {
            m3518z.m3919G().m3996b("Service connection failed", c1667b);
        }
        synchronized (this) {
            this.f3517h = false;
            this.f3518i = null;
        }
        this.f3519j.zzl().m3152y(new RunnableC0967ya(this));
    }

    /* renamed from: f */
    public final void m3824f() {
        if (this.f3518i != null && (this.f3518i.isConnected() || this.f3518i.isConnecting())) {
            this.f3518i.disconnect();
        }
        this.f3518i = null;
    }

    @Override // p108h6.AbstractC2346c.a
    /* renamed from: g */
    public final void mo3825g(Bundle bundle) {
        C2394s.m9612e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C2394s.m9619l(this.f3518i);
                this.f3519j.zzl().m3152y(new RunnableC0939wa(this, this.f3518i.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f3518i = null;
                this.f3517h = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnectionC0869ra serviceConnectionC0869ra;
        C2394s.m9612e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f3517h = false;
                this.f3519j.zzj().m3914B().m3995a("Service connected with null binder");
                return;
            }
            InterfaceC0821o4 interfaceC0821o4 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    interfaceC0821o4 = queryLocalInterface instanceof InterfaceC0821o4 ? (InterfaceC0821o4) queryLocalInterface : new C0849q4(iBinder);
                    this.f3519j.zzj().m3918F().m3995a("Bound to IMeasurementService interface");
                } else {
                    this.f3519j.zzj().m3914B().m3996b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f3519j.zzj().m3914B().m3995a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC0821o4 == null) {
                this.f3517h = false;
                try {
                    C3760a m14312b = C3760a.m14312b();
                    Context zza = this.f3519j.zza();
                    serviceConnectionC0869ra = this.f3519j.f3777c;
                    m14312b.m14317c(zza, serviceConnectionC0869ra);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f3519j.zzl().m3152y(new RunnableC0911ua(this, interfaceC0821o4));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C2394s.m9612e("MeasurementServiceConnection.onServiceDisconnected");
        this.f3519j.zzj().m3913A().m3995a("Service disconnected");
        this.f3519j.zzl().m3152y(new RunnableC0897ta(this, componentName));
    }
}
