package com.google.android.recaptcha.internal;

import java.util.Map;

/* loaded from: classes.dex */
final class zzig extends zzif {
    @Override // com.google.android.recaptcha.internal.zzif
    public final int zza(Map.Entry entry) {
        return ((zziq) entry.getKey()).zza;
    }

    @Override // com.google.android.recaptcha.internal.zzif
    public final zzij zzb(Object obj) {
        return ((zzip) obj).zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzif
    public final zzij zzc(Object obj) {
        return ((zzip) obj).zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzif
    public final Object zzd(zzie zzieVar, zzke zzkeVar, int i10) {
        return zzieVar.zza(zzkeVar, i10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    @Override // com.google.android.recaptcha.internal.zzif
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zze(java.lang.Object r2, com.google.android.recaptcha.internal.zzkq r3, java.lang.Object r4, com.google.android.recaptcha.internal.zzie r5, com.google.android.recaptcha.internal.zzij r6, java.lang.Object r7, com.google.android.recaptcha.internal.zzll r8) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzig.zze(java.lang.Object, com.google.android.recaptcha.internal.zzkq, java.lang.Object, com.google.android.recaptcha.internal.zzie, com.google.android.recaptcha.internal.zzij, java.lang.Object, com.google.android.recaptcha.internal.zzll):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zzif
    public final void zzf(Object obj) {
        ((zzip) obj).zzb.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzif
    public final void zzg(zzkq zzkqVar, Object obj, zzie zzieVar, zzij zzijVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzif
    public final void zzh(zzgw zzgwVar, Object obj, zzie zzieVar, zzij zzijVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzif
    public final void zzi(zzmd zzmdVar, Map.Entry entry) {
        zziq zziqVar = (zziq) entry.getKey();
        zzmb zzmbVar = zzmb.zza;
        switch (zziqVar.zzb.ordinal()) {
            case 0:
                zzmdVar.zzf(zziqVar.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzmdVar.zzo(zziqVar.zza, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzmdVar.zzt(zziqVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzmdVar.zzK(zziqVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzmdVar.zzr(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzmdVar.zzm(zziqVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzmdVar.zzk(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzmdVar.zzb(zziqVar.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzmdVar.zzG(zziqVar.zza, (String) entry.getValue());
                return;
            case 9:
                zzmdVar.zzq(zziqVar.zza, entry.getValue(), zzkn.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzmdVar.zzv(zziqVar.zza, entry.getValue(), zzkn.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzmdVar.zzd(zziqVar.zza, (zzgw) entry.getValue());
                return;
            case 12:
                zzmdVar.zzI(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzmdVar.zzr(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzmdVar.zzx(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzmdVar.zzz(zziqVar.zza, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzmdVar.zzB(zziqVar.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzmdVar.zzD(zziqVar.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzif
    public final boolean zzj(zzke zzkeVar) {
        return zzkeVar instanceof zzip;
    }
}
