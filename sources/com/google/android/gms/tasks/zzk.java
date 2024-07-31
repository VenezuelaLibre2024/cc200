package com.google.android.gms.tasks;

import p108h6.C2394s;

/* loaded from: classes.dex */
final class zzk implements Runnable {
    public final /* synthetic */ Task zza;
    public final /* synthetic */ zzl zzb;

    public zzk(zzl zzlVar, Task task) {
        this.zzb = zzlVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        OnFailureListener onFailureListener;
        OnFailureListener onFailureListener2;
        obj = this.zzb.zzb;
        synchronized (obj) {
            zzl zzlVar = this.zzb;
            onFailureListener = zzlVar.zzc;
            if (onFailureListener != null) {
                onFailureListener2 = zzlVar.zzc;
                onFailureListener2.onFailure((Exception) C2394s.m9619l(this.zza.getException()));
            }
        }
    }
}
