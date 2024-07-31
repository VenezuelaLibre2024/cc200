package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;
import p079f6.AbstractC1845e;
import p079f6.C1841a;
import p096g6.AbstractC2071v;
import p096g6.C2034j;
import p096g6.C2038k;
import p096g6.C2053p;
import p096g6.InterfaceC2056q;
import p108h6.C2394s;
import p320w6.AbstractC5312m;
import p320w6.C5296e;
import p320w6.C5310l;
import p320w6.C5313m0;
import p320w6.InterfaceC5300g;
import p320w6.InterfaceC5314n;

/* loaded from: classes.dex */
public final class zzbp extends AbstractC1845e implements InterfaceC5300g {
    public static final C1841a.g zza;
    public static final C1841a zzb;

    static {
        C1841a.g gVar = new C1841a.g();
        zza = gVar;
        zzb = new C1841a("LocationServices.API", new zzbm(), gVar);
    }

    public zzbp(Activity activity) {
        super(activity, (C1841a<C1841a.d.c>) zzb, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
    }

    public zzbp(Context context) {
        super(context, (C1841a<C1841a.d.c>) zzb, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
    }

    private final Task zza(LocationRequest locationRequest, C2034j c2034j) {
        zzbo zzboVar = new zzbo(this, c2034j, zzax.zza);
        return doRegisterEventListener(C2053p.m8235a().m8239b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzay
            public final /* synthetic */ LocationRequest zzb;

            public /* synthetic */ zzay(LocationRequest locationRequest2) {
                r2 = locationRequest2;
            }

            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                C1841a c1841a = zzbp.zzb;
                ((zzda) obj).zzu(zzbo.this, r2, (TaskCompletionSource) obj2);
            }
        }).m8241d(zzboVar).m8242e(c2034j).m8240c(2436).m8238a());
    }

    private final Task zzb(LocationRequest locationRequest, C2034j c2034j) {
        zzbo zzboVar = new zzbo(this, c2034j, zzbd.zza);
        return doRegisterEventListener(C2053p.m8235a().m8239b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzbf
            public final /* synthetic */ LocationRequest zzb;

            public /* synthetic */ zzbf(LocationRequest locationRequest2) {
                r2 = locationRequest2;
            }

            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                C1841a c1841a = zzbp.zzb;
                ((zzda) obj).zzv(zzbo.this, r2, (TaskCompletionSource) obj2);
            }
        }).m8241d(zzboVar).m8242e(c2034j).m8240c(2435).m8238a());
    }

    public final Task<Void> flushLocations() {
        return doWrite(AbstractC2071v.m8266a().m8272b(zzav.zza).m8275e(2422).m8271a());
    }

    public final Task<Location> getCurrentLocation(int i10, CancellationToken cancellationToken) {
        C5296e.a aVar = new C5296e.a();
        aVar.m21376b(i10);
        C5296e m21375a = aVar.m21375a();
        if (cancellationToken != null) {
            C2394s.m9609b(!cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        Task<Location> doRead = doRead(AbstractC2071v.m8266a().m8272b(new zzbh(m21375a, cancellationToken)).m8275e(2415).m8271a());
        if (cancellationToken == null) {
            return doRead;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        doRead.continueWith(new zzbi(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final Task<Location> getCurrentLocation(C5296e c5296e, CancellationToken cancellationToken) {
        if (cancellationToken != null) {
            C2394s.m9609b(!cancellationToken.isCancellationRequested(), "cancellationToken may not be already canceled");
        }
        Task<Location> doRead = doRead(AbstractC2071v.m8266a().m8272b(new zzbh(c5296e, cancellationToken)).m8275e(2415).m8271a());
        if (cancellationToken == null) {
            return doRead;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        doRead.continueWith(new zzbi(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // p320w6.InterfaceC5300g
    public final Task<Location> getLastLocation() {
        return doRead(AbstractC2071v.m8266a().m8272b(zzbe.zza).m8275e(2414).m8271a());
    }

    public final Task<Location> getLastLocation(C5310l c5310l) {
        return doRead(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzbj
            public /* synthetic */ zzbj() {
            }

            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                C1841a c1841a = zzbp.zzb;
                ((zzda) obj).zzt(C5310l.this, (TaskCompletionSource) obj2);
            }
        }).m8275e(2414).m8274d(C5313m0.f20117f).m8271a());
    }

    public final Task<LocationAvailability> getLocationAvailability() {
        return doRead(AbstractC2071v.m8266a().m8272b(zzba.zza).m8275e(2416).m8271a());
    }

    public final Task<Void> removeLocationUpdates(PendingIntent pendingIntent) {
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzbg
            public final /* synthetic */ PendingIntent zza;

            public /* synthetic */ zzbg(PendingIntent pendingIntent2) {
                r1 = pendingIntent2;
            }

            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                C1841a c1841a = zzbp.zzb;
                ((zzda) obj).zzD(r1, (TaskCompletionSource) obj2, null);
            }
        }).m8275e(2418).m8271a());
    }

    @Override // p320w6.InterfaceC5300g
    public final Task<Void> removeLocationUpdates(AbstractC5312m abstractC5312m) {
        return doUnregisterEventListener(C2038k.m8170c(abstractC5312m, AbstractC5312m.class.getSimpleName()), 2418).continueWith(zzbk.zza, zzbc.zza);
    }

    public final Task<Void> removeLocationUpdates(InterfaceC5314n interfaceC5314n) {
        return doUnregisterEventListener(C2038k.m8170c(interfaceC5314n, InterfaceC5314n.class.getSimpleName()), 2418).continueWith(zzbk.zza, zzbl.zza);
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzaz
            public final /* synthetic */ PendingIntent zza;
            public final /* synthetic */ LocationRequest zzb;

            public /* synthetic */ zzaz(PendingIntent pendingIntent2, LocationRequest locationRequest2) {
                r1 = pendingIntent2;
                r2 = locationRequest2;
            }

            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                C1841a c1841a = zzbp.zzb;
                ((zzda) obj).zzw(r1, r2, (TaskCompletionSource) obj2);
            }
        }).m8275e(2417).m8271a());
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, AbstractC5312m abstractC5312m) {
        return zza(locationRequest, C2038k.m8169b(abstractC5312m, executor, AbstractC5312m.class.getSimpleName()));
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, InterfaceC5314n interfaceC5314n) {
        return zzb(locationRequest, C2038k.m8169b(interfaceC5314n, executor, InterfaceC5314n.class.getSimpleName()));
    }

    @Override // p320w6.InterfaceC5300g
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, AbstractC5312m abstractC5312m, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            C2394s.m9620m(looper, "invalid null looper");
        }
        return zza(locationRequest, C2038k.m8168a(abstractC5312m, looper, AbstractC5312m.class.getSimpleName()));
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, InterfaceC5314n interfaceC5314n, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            C2394s.m9620m(looper, "invalid null looper");
        }
        return zzb(locationRequest, C2038k.m8168a(interfaceC5314n, looper, InterfaceC5314n.class.getSimpleName()));
    }

    public final Task<Void> setMockLocation(Location location) {
        C2394s.m9608a(location != null);
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzaw
            public final /* synthetic */ Location zza;

            public /* synthetic */ zzaw(Location location2) {
                r1 = location2;
            }

            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                C1841a c1841a = zzbp.zzb;
                ((zzda) obj).zzz(r1, (TaskCompletionSource) obj2);
            }
        }).m8275e(2421).m8271a());
    }

    public final Task<Void> setMockMode(boolean z10) {
        return doWrite(AbstractC2071v.m8266a().m8272b(new InterfaceC2056q() { // from class: com.google.android.gms.internal.location.zzbb
            public final /* synthetic */ boolean zza;

            public /* synthetic */ zzbb(boolean z102) {
                r1 = z102;
            }

            @Override // p096g6.InterfaceC2056q
            public final void accept(Object obj, Object obj2) {
                C1841a c1841a = zzbp.zzb;
                ((zzda) obj).zzA(r1, (TaskCompletionSource) obj2);
            }
        }).m8275e(2420).m8271a());
    }
}
