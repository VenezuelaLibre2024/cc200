package com.google.android.gms.internal.location;

import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;
import p320w6.C5320q;
import p320w6.C5322r;

/* loaded from: classes.dex */
final class zzcq extends zzr {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzcq(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzs
    public final void zzb(C5322r c5322r) {
        C2074w.m8279b(c5322r.getStatus(), new C5320q(c5322r), this.zza);
    }
}
