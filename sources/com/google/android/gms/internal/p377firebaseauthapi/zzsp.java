package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzsp extends zzaja<zzsp, zza> implements zzakm {
    private static final zzsp zzc;
    private static volatile zzakx<zzsp> zzd;
    private int zze;
    private zzss zzf;
    private int zzg;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzsp, zza> implements zzakm {
        private zza() {
            super(zzsp.zzc);
        }

        public /* synthetic */ zza(zzsq zzsqVar) {
            this();
        }

        public final zza zza(int i10) {
            zzh();
            ((zzsp) this.zza).zza(i10);
            return this;
        }

        public final zza zza(zzss zzssVar) {
            zzh();
            ((zzsp) this.zza).zza(zzssVar);
            return this;
        }
    }

    static {
        zzsp zzspVar = new zzsp();
        zzc = zzspVar;
        zzaja.zza((Class<zzsp>) zzsp.class, zzspVar);
    }

    private zzsp() {
    }

    public static zzsp zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzsp) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i10) {
        this.zzg = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzss zzssVar) {
        zzssVar.getClass();
        this.zzf = zzssVar;
        this.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzl();
    }

    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzsq zzsqVar = null;
        switch (zzsq.zza[i10 - 1]) {
            case 1:
                return new zzsp();
            case 2:
                return new zza(zzsqVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzsp> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzsp.class) {
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

    public final zzss zzd() {
        zzss zzssVar = this.zzf;
        return zzssVar == null ? zzss.zzd() : zzssVar;
    }
}
