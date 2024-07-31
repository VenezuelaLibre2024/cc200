package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import p108h6.C2394s;
import p321w7.AbstractC5368h;

/* loaded from: classes.dex */
public final class zzadg<ResultT, CallbackT> implements zzacx<ResultT> {
    private final zzacw<ResultT, CallbackT> zza;
    private final TaskCompletionSource<ResultT> zzb;

    public zzadg(zzacw<ResultT, CallbackT> zzacwVar, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zza = zzacwVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacx
    public final void zza(ResultT resultt, Status status) {
        C2394s.m9620m(this.zzb, "completion source cannot be null");
        if (status == null) {
            this.zzb.setResult(resultt);
            return;
        }
        zzacw<ResultT, CallbackT> zzacwVar = this.zza;
        if (zzacwVar.zzs != null) {
            TaskCompletionSource<ResultT> taskCompletionSource = this.zzb;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzacwVar.zzc);
            zzacw<ResultT, CallbackT> zzacwVar2 = this.zza;
            taskCompletionSource.setException(zzach.zza(firebaseAuth, zzacwVar2.zzs, ("reauthenticateWithCredential".equals(zzacwVar2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) ? this.zza.zzd : null));
            return;
        }
        AbstractC5368h abstractC5368h = zzacwVar.zzp;
        if (abstractC5368h != null) {
            this.zzb.setException(zzach.zza(status, abstractC5368h, zzacwVar.zzq, zzacwVar.zzr));
        } else {
            this.zzb.setException(zzach.zza(status));
        }
    }
}
