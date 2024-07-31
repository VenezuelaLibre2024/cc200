package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import p079f6.AbstractC1846f;
import p079f6.AbstractC1848h;
import p079f6.C1842b;
import p096g6.InterfaceC2010d;
import p320w6.C5308k;
import p320w6.InterfaceC5302h;
import p320w6.InterfaceC5306j;

/* loaded from: classes.dex */
public final class zzbv implements InterfaceC5306j {
    public static /* bridge */ /* synthetic */ TaskCompletionSource zza(final InterfaceC2010d interfaceC2010d) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.location.zzbq
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

    @Deprecated
    public final AbstractC1848h<Status> addGeofences(AbstractC1846f abstractC1846f, List<InterfaceC5302h> list, PendingIntent pendingIntent) {
        C5308k.a aVar = new C5308k.a();
        aVar.m21382b(list);
        aVar.m21384d(5);
        return abstractC1846f.mo7589b(new zzbr(this, abstractC1846f, aVar.m21383c(), pendingIntent));
    }

    public final AbstractC1848h<Status> addGeofences(AbstractC1846f abstractC1846f, C5308k c5308k, PendingIntent pendingIntent) {
        return abstractC1846f.mo7589b(new zzbr(this, abstractC1846f, c5308k, pendingIntent));
    }

    public final AbstractC1848h<Status> removeGeofences(AbstractC1846f abstractC1846f, PendingIntent pendingIntent) {
        return abstractC1846f.mo7589b(new zzbs(this, abstractC1846f, pendingIntent));
    }

    public final AbstractC1848h<Status> removeGeofences(AbstractC1846f abstractC1846f, List<String> list) {
        return abstractC1846f.mo7589b(new zzbt(this, abstractC1846f, list));
    }
}
