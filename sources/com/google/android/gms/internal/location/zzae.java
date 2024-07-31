package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;
import p096g6.InterfaceC2022g;

/* loaded from: classes.dex */
final class zzae extends InterfaceC2022g.a {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzae(zzag zzagVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // p096g6.InterfaceC2022g
    public final void onResult(Status status) {
        C2074w.m8278a(status, this.zza);
    }
}
