package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzvm extends zzaja<zzvm, zza> implements zzakm {
    private static final zzvm zzc;
    private static volatile zzakx<zzvm> zzd;
    private String zze = "";

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzvm, zza> implements zzakm {
        private zza() {
            super(zzvm.zzc);
        }

        public /* synthetic */ zza(zzvn zzvnVar) {
            this();
        }

        public final zza zza(String str) {
            zzh();
            ((zzvm) this.zza).zza(str);
            return this;
        }
    }

    static {
        zzvm zzvmVar = new zzvm();
        zzc = zzvmVar;
        zzaja.zza((Class<zzvm>) zzvm.class, zzvmVar);
    }

    private zzvm() {
    }

    public static zza zza() {
        return zzc.zzl();
    }

    public static zzvm zza(zzahm zzahmVar, zzaip zzaipVar) {
        return (zzvm) zzaja.zza(zzc, zzahmVar, zzaipVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str) {
        str.getClass();
        this.zze = str;
    }

    public static zzvm zzc() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzvn zzvnVar = null;
        switch (zzvn.zza[i10 - 1]) {
            case 1:
                return new zzvm();
            case 2:
                return new zza(zzvnVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzvm> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzvm.class) {
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

    public final String zzd() {
        return this.zze;
    }
}
