package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.InterfaceC2022g;

/* loaded from: classes.dex */
final class zzx extends InterfaceC2022g.a {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzx(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // p096g6.InterfaceC2022g
    public final void onResult(Status status) {
        zzab.zzf(status, null, this.zza);
    }
}
