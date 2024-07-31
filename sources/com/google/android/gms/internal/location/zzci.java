package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;
import p320w6.C5304i;

/* loaded from: classes.dex */
final class zzci extends zzl {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzci(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzb(int i10, String[] strArr) {
        C2074w.m8278a(new Status(C5304i.m21378b(i10)), this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzc(int i10, PendingIntent pendingIntent) {
        C2074w.m8278a(new Status(C5304i.m21378b(i10)), this.zza);
    }

    @Override // com.google.android.gms.internal.location.zzm
    public final void zzd(int i10, String[] strArr) {
        C2074w.m8278a(new Status(C5304i.m21378b(i10)), this.zza);
    }
}
