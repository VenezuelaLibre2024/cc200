package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p079f6.AbstractC1846f;
import p079f6.AbstractC1848h;
import p079f6.C1842b;
import p096g6.C2038k;
import p096g6.InterfaceC2010d;
import p108h6.C2394s;
import p320w6.AbstractC5312m;
import p320w6.C5310l;
import p320w6.InterfaceC5298f;
import p320w6.InterfaceC5314n;

/* loaded from: classes.dex */
public final class zzau implements InterfaceC5298f {
    public static /* bridge */ /* synthetic */ TaskCompletionSource zza(InterfaceC2010d interfaceC2010d) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzah
            public /* synthetic */ zzah() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                InterfaceC2010d interfaceC2010d2 = InterfaceC2010d.this;
                if (task.isSuccessful()) {
                    interfaceC2010d2.setResult(Status.f4470m);
                    return;
                }
                if (task.isCanceled()) {
                    interfaceC2010d2.setFailedResult(Status.f4474q);
                    return;
                }
                Exception exception = task.getException();
                if (exception instanceof C1842b) {
                    interfaceC2010d2.setFailedResult(((C1842b) exception).getStatus());
                } else {
                    interfaceC2010d2.setFailedResult(Status.f4472o);
                }
            }
        });
        return taskCompletionSource;
    }

    public final AbstractC1848h<Status> flushLocations(AbstractC1846f abstractC1846f) {
        return abstractC1846f.mo7589b(new zzaj(this, abstractC1846f));
    }

    public final Location getLastLocation(AbstractC1846f abstractC1846f) {
        boolean await;
        boolean z10 = false;
        C2394s.m9609b(abstractC1846f != null, "GoogleApiClient parameter is required.");
        zzda zzdaVar = (zzda) abstractC1846f.m7590d(zzbp.zza);
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        try {
            zzdaVar.zzt(new C5310l.a().m21387a(), taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzai
                public final /* synthetic */ AtomicReference zza;
                public final /* synthetic */ CountDownLatch zzb;

                public /* synthetic */ zzai(AtomicReference atomicReference2, CountDownLatch countDownLatch2) {
                    r1 = atomicReference2;
                    r2 = countDownLatch2;
                }

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    AtomicReference atomicReference2 = r1;
                    CountDownLatch countDownLatch2 = r2;
                    if (task.isSuccessful()) {
                        atomicReference2.set((Location) task.getResult());
                    }
                    countDownLatch2.countDown();
                }
            });
            try {
                long nanos = TimeUnit.SECONDS.toNanos(30L);
                long nanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            await = countDownLatch2.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            z10 = true;
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = nanoTime - System.nanoTime();
                        z10 = true;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                if (await) {
                    return (Location) atomicReference2.get();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public final LocationAvailability getLocationAvailability(AbstractC1846f abstractC1846f) {
        C2394s.m9609b(abstractC1846f != null, "GoogleApiClient parameter is required.");
        try {
            return ((zzda) abstractC1846f.m7590d(zzbp.zza)).zzp();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final AbstractC1848h<Status> removeLocationUpdates(AbstractC1846f abstractC1846f, PendingIntent pendingIntent) {
        return abstractC1846f.mo7589b(new zzao(this, abstractC1846f, pendingIntent));
    }

    public final AbstractC1848h<Status> removeLocationUpdates(AbstractC1846f abstractC1846f, AbstractC5312m abstractC5312m) {
        return abstractC1846f.mo7589b(new zzap(this, abstractC1846f, abstractC5312m));
    }

    public final AbstractC1848h<Status> removeLocationUpdates(AbstractC1846f abstractC1846f, InterfaceC5314n interfaceC5314n) {
        return abstractC1846f.mo7589b(new zzan(this, abstractC1846f, interfaceC5314n));
    }

    public final AbstractC1848h<Status> requestLocationUpdates(AbstractC1846f abstractC1846f, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return abstractC1846f.mo7589b(new zzam(this, abstractC1846f, pendingIntent, locationRequest));
    }

    public final AbstractC1848h<Status> requestLocationUpdates(AbstractC1846f abstractC1846f, LocationRequest locationRequest, AbstractC5312m abstractC5312m, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            C2394s.m9620m(looper, "invalid null looper");
        }
        return abstractC1846f.mo7589b(new zzal(this, abstractC1846f, C2038k.m8168a(abstractC5312m, looper, AbstractC5312m.class.getSimpleName()), locationRequest));
    }

    public final AbstractC1848h<Status> requestLocationUpdates(AbstractC1846f abstractC1846f, LocationRequest locationRequest, InterfaceC5314n interfaceC5314n) {
        Looper myLooper = Looper.myLooper();
        C2394s.m9620m(myLooper, "invalid null looper");
        return abstractC1846f.mo7589b(new zzak(this, abstractC1846f, C2038k.m8168a(interfaceC5314n, myLooper, InterfaceC5314n.class.getSimpleName()), locationRequest));
    }

    public final AbstractC1848h<Status> requestLocationUpdates(AbstractC1846f abstractC1846f, LocationRequest locationRequest, InterfaceC5314n interfaceC5314n, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            C2394s.m9620m(looper, "invalid null looper");
        }
        return abstractC1846f.mo7589b(new zzak(this, abstractC1846f, C2038k.m8168a(interfaceC5314n, looper, InterfaceC5314n.class.getSimpleName()), locationRequest));
    }

    public final AbstractC1848h<Status> setMockLocation(AbstractC1846f abstractC1846f, Location location) {
        return abstractC1846f.mo7589b(new zzar(this, abstractC1846f, location));
    }

    public final AbstractC1848h<Status> setMockMode(AbstractC1846f abstractC1846f, boolean z10) {
        return abstractC1846f.mo7589b(new zzaq(this, abstractC1846f, z10));
    }
}
