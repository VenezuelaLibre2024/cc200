package com.google.android.gms.internal.location;

import com.google.android.gms.tasks.TaskCompletionSource;
import p096g6.C2034j;
import p096g6.InterfaceC2056q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbo implements InterfaceC2056q, zzcs {
    public final /* synthetic */ zzbp zza;
    private final zzbn zzb;
    private C2034j zzc;
    private boolean zzd = true;

    public zzbo(zzbp zzbpVar, C2034j c2034j, zzbn zzbnVar) {
        this.zza = zzbpVar;
        this.zzc = c2034j;
        this.zzb = zzbnVar;
    }

    @Override // p096g6.InterfaceC2056q
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        C2034j.a m8160b;
        boolean z10;
        zzda zzdaVar = (zzda) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        synchronized (this) {
            m8160b = this.zzc.m8160b();
            z10 = this.zzd;
            this.zzc.m8159a();
        }
        if (m8160b == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            this.zzb.zza(zzdaVar, m8160b, z10, taskCompletionSource);
        }
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized C2034j zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
        C2034j.a<?> m8160b;
        synchronized (this) {
            this.zzd = false;
            m8160b = this.zzc.m8160b();
        }
        if (m8160b != null) {
            this.zza.doUnregisterEventListener(m8160b, 2441);
        }
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized void zzc(C2034j c2034j) {
        C2034j c2034j2 = this.zzc;
        if (c2034j2 != c2034j) {
            c2034j2.m8159a();
            this.zzc = c2034j;
        }
    }
}
