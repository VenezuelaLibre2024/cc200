package com.google.android.gms.internal.p377firebaseauthapi;

import p079f6.C1841a;

/* loaded from: classes.dex */
public abstract class zzaib {
    private static volatile int zze = 100;
    public int zza;
    public int zzb;
    public int zzc;
    public zzaig zzd;
    private boolean zzf;

    /* JADX INFO: Access modifiers changed from: private */
    public zzaib() {
        this.zzb = zze;
        this.zzc = C1841a.e.API_PRIORITY_OTHER;
        this.zzf = false;
    }

    public /* synthetic */ zzaib(zzaih zzaihVar) {
        this();
    }

    public static long zza(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static zzaib zza(byte[] bArr, int i10, int i11, boolean z10) {
        zzaia zzaiaVar = new zzaia(bArr, i10, i11, z10);
        try {
            zzaiaVar.zza(i11);
            return zzaiaVar;
        } catch (zzajj e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zze(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract double zza();

    public abstract int zza(int i10);

    public abstract float zzb();

    public abstract void zzb(int i10);

    public abstract int zzc();

    public abstract void zzc(int i10);

    public abstract int zzd();

    public abstract boolean zzd(int i10);

    public abstract int zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzahm zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();
}
