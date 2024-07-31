package com.google.android.gms.internal.p376authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2074w;
import p096g6.InterfaceC2022g;
import p108h6.C2343b;

/* loaded from: classes.dex */
final class zzu extends InterfaceC2022g.a {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // p096g6.InterfaceC2022g
    public final void onResult(Status status) {
        if (status.m4987J() == 6) {
            this.zza.trySetException(C2343b.m9513a(status));
        } else {
            C2074w.m8278a(status, this.zza);
        }
    }
}
