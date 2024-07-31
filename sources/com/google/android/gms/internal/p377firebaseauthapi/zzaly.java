package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzaly extends zzaja<zzaly, zza> implements zzakm {
    private static final zzaly zzc;
    private static volatile zzakx<zzaly> zzd;
    private long zze;
    private int zzf;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzaly, zza> implements zzakm {
        private zza() {
            super(zzaly.zzc);
        }

        public /* synthetic */ zza(zzama zzamaVar) {
            this();
        }

        public final zza zza(int i10) {
            if (!this.zza.zzv()) {
                zzi();
            }
            ((zzaly) this.zza).zza(i10);
            return this;
        }

        public final zza zza(long j10) {
            if (!this.zza.zzv()) {
                zzi();
            }
            ((zzaly) this.zza).zza(j10);
            return this;
        }
    }

    static {
        zzaly zzalyVar = new zzaly();
        zzc = zzalyVar;
        zzaja.zza((Class<zzaly>) zzaly.class, zzalyVar);
    }

    private zzaly() {
    }

    public final void zza(int i10) {
        this.zzf = i10;
    }

    public final void zza(long j10) {
        this.zze = j10;
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zzama.zza[i10 - 1]) {
            case 1:
                return new zzaly();
            case 2:
                return new zza(null);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzaly> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzaly.class) {
                        zzakxVar = zzd;
                        if (zzakxVar == null) {
                            zzakxVar = new zzaja.zza<>(zzc);
                            zzd = zzakxVar;
                        }
                    }
                }
                return zzakxVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final long zzb() {
        return this.zze;
    }
}
