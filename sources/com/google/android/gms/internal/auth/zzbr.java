package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class zzbr extends zzbd {
    public final /* synthetic */ zzbs zza;

    public zzbr(zzbs zzbsVar) {
        this.zza = zzbsVar;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzc(String str) {
        if (str != null) {
            this.zza.setResult((zzbs) new zzbv(str));
        } else {
            this.zza.setResult((zzbs) new zzbv(new Status(3006)));
        }
    }
}
