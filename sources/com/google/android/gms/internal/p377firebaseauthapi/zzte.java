package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzte extends zzaja<zzte, zza> implements zzakm {
    private static final zzte zzc;
    private static volatile zzakx<zzte> zzd;
    private int zze;
    private int zzf;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzte, zza> implements zzakm {
        private zza() {
            super(zzte.zzc);
        }

        public /* synthetic */ zza(zztd zztdVar) {
            this();
        }

        public final zza zza(int i10) {
            zzh();
            ((zzte) this.zza).zza(i10);
            return this;
        }
    }

    static {
        zzte zzteVar = new zzte();
        zzc = zzteVar;
        zzaja.zza((Class<zzte>) zzte.class, zzteVar);
    }

    private zzte() {
    }

    public static zzte zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzte) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zze = i10;
    }

    public static zza zzc() {
        return zzc.zzl();
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zztd zztdVar = null;
        switch (zztd.zza[i10 - 1]) {
            case 1:
                return new zzte();
            case 2:
                return new zza(zztdVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzte> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzte.class) {
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

    public final int zzb() {
        return this.zzf;
    }
}
