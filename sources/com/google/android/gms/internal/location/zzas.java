package com.google.android.gms.internal.location;

import p096g6.C2034j;

/* loaded from: classes.dex */
final class zzas implements zzcs {
    private C2034j zza;

    public zzas(C2034j c2034j) {
        this.zza = c2034j;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized C2034j zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.location.zzcs
    public final synchronized void zzc(C2034j c2034j) {
        C2034j c2034j2 = this.zza;
        if (c2034j2 != c2034j) {
            c2034j2.m8159a();
            this.zza = c2034j;
        }
    }
}
