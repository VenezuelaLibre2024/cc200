package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzqh implements zzqe {
    private static final zzgv<Boolean> zza;
    private static final zzgv<Boolean> zzb;

    static {
        zzhd zza2 = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.tcf.client.dev", false);
        zzb = zza2.zza("measurement.tcf.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzqe
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqe
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqe
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
