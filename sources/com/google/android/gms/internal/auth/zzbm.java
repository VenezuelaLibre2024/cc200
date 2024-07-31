package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;
import p366z5.C5993c;

/* loaded from: classes.dex */
final class zzbm extends zzbd {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzbm(zzbo zzboVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzb(C5993c c5993c) {
        C2074w.m8279b(new Status(c5993c.f22378h), c5993c, this.zza);
    }
}
