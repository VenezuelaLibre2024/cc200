package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;
import p096g6.InterfaceC2022g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcl extends InterfaceC2022g.a {
    public final /* synthetic */ Object zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public zzcl(zzda zzdaVar, Object obj, TaskCompletionSource taskCompletionSource) {
        this.zza = obj;
        this.zzb = taskCompletionSource;
    }

    @Override // p096g6.InterfaceC2022g
    public final void onResult(Status status) {
        C2074w.m8279b(status, this.zza, this.zzb);
    }
}
