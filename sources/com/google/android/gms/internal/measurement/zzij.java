package com.google.android.gms.internal.measurement;

import p079f6.C1841a;

/* loaded from: classes.dex */
public abstract class zzij {
    private static volatile int zzd = 100;
    public int zza;
    public int zzb;
    public zzin zzc;
    private int zze;
    private boolean zzf;

    /* JADX INFO: Access modifiers changed from: private */
    public zzij() {
        this.zzb = zzd;
        this.zze = C1841a.e.API_PRIORITY_OTHER;
        this.zzf = false;
    }

    public /* synthetic */ zzij(zzik zzikVar) {
        this();
    }

    public static long zza(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static zzij zza(byte[] bArr, int i10, int i11, boolean z10) {
        zzii zziiVar = new zzii(bArr, i11);
        try {
            zziiVar.zza(i11);
            return zziiVar;
        } catch (zzjq e10) {
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

    public abstract zzhu zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();
}
