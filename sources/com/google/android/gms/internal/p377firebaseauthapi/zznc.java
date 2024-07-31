package com.google.android.gms.internal.p377firebaseauthapi;

/* loaded from: classes.dex */
public final class zznc extends zzbu {
    private final zzot zza;

    public zznc(zzot zzotVar, zzct zzctVar) {
        zza(zzotVar, zzctVar);
        this.zza = zzotVar;
    }

    private static void zza(zzot zzotVar, zzct zzctVar) {
        int i10 = zznf.zza[zzotVar.zza().ordinal()];
        if (i10 == 1 || i10 == 2) {
            zzct.zza(zzctVar);
        }
    }

    public final zzot zza(zzct zzctVar) {
        zza(this.zza, zzctVar);
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzbu
    public final Integer zza() {
        return this.zza.zze();
    }
}
