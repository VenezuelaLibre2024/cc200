package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public class zzjv {
    private static final zzis zza = zzis.zza;
    private zzhu zzb;
    private volatile zzkr zzc;
    private volatile zzhu zzd;

    private final zzkr zzb(zzkr zzkrVar) {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    try {
                        this.zzc = zzkrVar;
                        this.zzd = zzhu.zza;
                    } catch (zzjq unused) {
                        this.zzc = zzkrVar;
                        this.zzd = zzhu.zza;
                    }
                }
            }
        }
        return this.zzc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjv)) {
            return false;
        }
        zzjv zzjvVar = (zzjv) obj;
        zzkr zzkrVar = this.zzc;
        zzkr zzkrVar2 = zzjvVar.zzc;
        return (zzkrVar == null && zzkrVar2 == null) ? zzc().equals(zzjvVar.zzc()) : (zzkrVar == null || zzkrVar2 == null) ? zzkrVar != null ? zzkrVar.equals(zzjvVar.zzb(zzkrVar.zzcf())) : zzb(zzkrVar2.zzcf()).equals(zzkrVar2) : zzkrVar.equals(zzkrVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzkr zza(zzkr zzkrVar) {
        zzkr zzkrVar2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzkrVar;
        return zzkrVar2;
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zzb();
        }
        if (this.zzc != null) {
            return this.zzc.zzbw();
        }
        return 0;
    }

    public final zzhu zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                return this.zzd;
            }
            this.zzd = this.zzc == null ? zzhu.zza : this.zzc.zzbu();
            return this.zzd;
        }
    }
}
