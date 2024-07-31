package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcm extends zzp {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzcm(zzda zzdaVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzq
    public final void zzb(Status status, Location location) {
        C2074w.m8279b(status, location, this.zza);
    }
}
