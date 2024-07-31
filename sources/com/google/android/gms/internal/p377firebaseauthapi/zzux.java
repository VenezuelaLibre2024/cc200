package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class zzux extends zzaja<zzux, zza> implements zzakm {
    private static final zzux zzc;
    private static volatile zzakx<zzux> zzd;
    private String zze = "";
    private zzahm zzf = zzahm.zza;
    private int zzg;

    /* loaded from: classes.dex */
    public static final class zza extends zzaja.zzb<zzux, zza> implements zzakm {
        private zza() {
            super(zzux.zzc);
        }

        public /* synthetic */ zza(zzuy zzuyVar) {
            this();
        }

        public final zza zza(zzahm zzahmVar) {
            zzh();
            ((zzux) this.zza).zza(zzahmVar);
            return this;
        }

        public final zza zza(zzb zzbVar) {
            zzh();
            ((zzux) this.zza).zza(zzbVar);
            return this;
        }

        public final zza zza(String str) {
            zzh();
            ((zzux) this.zza).zza(str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum zzb implements zzajf {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        private static final zzaje<zzb> zzg = new zzuz();
        private final int zzi;

        zzb(int i10) {
            this.zzi = i10;
        }

        public static zzb zza(int i10) {
            if (i10 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i10 == 1) {
                return SYMMETRIC;
            }
            if (i10 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i10 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i10 != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("<");
            sb2.append(zzb.class.getName());
            sb2.append('@');
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb2.append(" number=");
                sb2.append(zza());
            }
            sb2.append(" name=");
            sb2.append(name());
            sb2.append('>');
            return sb2.toString();
        }

        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzajf
        public final int zza() {
            if (this != UNRECOGNIZED) {
                return this.zzi;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        zzux zzuxVar = new zzux();
        zzc = zzuxVar;
        zzaja.zza((Class<zzux>) zzux.class, zzuxVar);
    }

    private zzux() {
    }

    public static zza zza() {
        return zzc.zzl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzahm zzahmVar) {
        zzahmVar.getClass();
        this.zzf = zzahmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        this.zzg = zzbVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str) {
        str.getClass();
        this.zze = str;
    }

    public static zzux zzd() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaja
    public final Object zza(int i10, Object obj, Object obj2) {
        zzuy zzuyVar = null;
        switch (zzuy.zza[i10 - 1]) {
            case 1:
                return new zzux();
            case 2:
                return new zza(zzuyVar);
            case 3:
                return zzaja.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzakx<zzux> zzakxVar = zzd;
                if (zzakxVar == null) {
                    synchronized (zzux.class) {
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

    public final zzb zzb() {
        zzb zza2 = zzb.zza(this.zzg);
        return zza2 == null ? zzb.UNRECOGNIZED : zza2;
    }

    public final zzahm zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }
}
