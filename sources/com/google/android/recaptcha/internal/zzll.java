package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
abstract class zzll {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i10, int i11);

    public abstract void zzi(Object obj, int i10, long j10);

    public abstract void zzj(Object obj, int i10, Object obj2);

    public abstract void zzk(Object obj, int i10, zzgw zzgwVar);

    public abstract void zzl(Object obj, int i10, long j10);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public abstract void zzp(Object obj, zzmd zzmdVar);

    public abstract void zzq(Object obj, zzmd zzmdVar);

    public final boolean zzr(Object obj, zzkq zzkqVar) {
        int zzd = zzkqVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 == 0) {
            zzl(obj, i10, zzkqVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zzi(obj, i10, zzkqVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zzk(obj, i10, zzkqVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzje.zza();
            }
            zzh(obj, i10, zzkqVar.zzf());
            return true;
        }
        Object zzf = zzf();
        int i12 = i10 << 3;
        while (zzkqVar.zzc() != Integer.MAX_VALUE && zzr(zzf, zzkqVar)) {
        }
        if ((4 | i12) != zzkqVar.zzd()) {
            throw zzje.zzb();
        }
        zzg(zzf);
        zzj(obj, i10, zzf);
        return true;
    }

    public abstract boolean zzs(zzkq zzkqVar);
}
