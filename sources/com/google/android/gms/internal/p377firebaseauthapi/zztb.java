package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zztb extends zzaja<zztb, zza> implements zzakm {
    private static final zztb zzc;
    private static volatile zzakx<zztb> zzd;
    private int zze;
    private zzahm zzf = zzahm.zza;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zztb, zza> implements zzakm {
        private zza() {
            super(zztb.zzc);
        }

        public /* synthetic */ zza(zztc zztcVar) {
            this();
        }

        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zztb) this.zza).zza(zzahmVar);
            return this;
        }
    }

    static {
        zztb zztbVar = new zztb();
        zzc = zztbVar;
        zzaja.zza((Class<zztb>) zztb.class, zztbVar);
    }

    private zztb() {
    }

    public static zztb zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zztb) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzf = zzahmVar;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public static zzakx<zztb> zze() {
        return (zzakx) zzc.zza(zzaja.zze.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        switch (zztc.zza[i10 - 1]) {
            case 1:
                return new zztb();
            case 2:
                return new zza(null);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zztb> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zztb.class) {
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

    public final zzahm zzd() {
        return this.zzf;
    }
}