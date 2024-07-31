package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2038k;
import p320w6.AbstractC5312m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcj extends AbstractC5312m {
    public final /* synthetic */ TaskCompletionSource zza;
    public final /* synthetic */ zzda zzb;

    public zzcj(zzda zzdaVar, TaskCompletionSource taskCompletionSource) {
        this.zzb = zzdaVar;
        this.zza = taskCompletionSource;
    }

    @Override // p320w6.AbstractC5312m
    public final void onLocationResult(LocationResult locationResult) {
        this.zza.trySetResult(locationResult.m5065I());
        try {
            this.zzb.zzB(C2038k.m8170c(this, "GetCurrentLocation"), false, new TaskCompletionSource());
        } catch (RemoteException unused) {
        }
    }
}
