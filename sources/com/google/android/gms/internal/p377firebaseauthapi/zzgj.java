package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzgj extends zzdc {
    private final String zza;
    private final zzb zzb;
    private final zzdc zzc;

    /* loaded from: classes.dex */
    public static class zza {
        private String zza;
        private zzb zzb;
        private zzdc zzc;

        private zza() {
        }

        public final zza zza(zzdc zzdcVar) {
            this.zzc = zzdcVar;
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzb = zzbVar;
            return this;
        }

        public final zza zza(String str) {
            this.zza = str;
            return this;
        }

        public final zzgj zza() {
            if (this.zza == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            zzdc zzdcVar = this.zzc;
            if (zzdcVar == null) {
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (zzdcVar.zza()) {
                throw new GeneralSecurityException("dekParametersForNewKeys must note have ID Requirements");
            }
            zzb zzbVar = this.zzb;
            zzdc zzdcVar2 = this.zzc;
            boolean z10 = true;
            if ((!zzbVar.equals(zzb.zza) || !(zzdcVar2 instanceof zzer)) && ((!zzbVar.equals(zzb.zzc) || !(zzdcVar2 instanceof zzfo)) && ((!zzbVar.equals(zzb.zzb) || !(zzdcVar2 instanceof zzhd)) && ((!zzbVar.equals(zzb.zzd) || !(zzdcVar2 instanceof zzdm)) && ((!zzbVar.equals(zzb.zze) || !(zzdcVar2 instanceof zzea)) && (!zzbVar.equals(zzb.zzf) || !(zzdcVar2 instanceof zzfa))))))) {
                z10 = false;
            }
            if (z10) {
                return new zzgj(this.zza, this.zzb, this.zzc);
            }
            throw new GeneralSecurityException("Cannot use parsing strategy " + this.zzb.toString() + " when new keys are picked according to " + String.valueOf(this.zzc) + ".");
        }
    }

    /* loaded from: classes.dex */
    public static final class zzb {
        public static final zzb zza = new zzb("ASSUME_AES_GCM");
        public static final zzb zzb = new zzb("ASSUME_XCHACHA20POLY1305");
        public static final zzb zzc = new zzb("ASSUME_CHACHA20POLY1305");
        public static final zzb zzd = new zzb("ASSUME_AES_CTR_HMAC");
        public static final zzb zze = new zzb("ASSUME_AES_EAX");
        public static final zzb zzf = new zzb("ASSUME_AES_GCM_SIV");
        private final String zzg;

        private zzb(String str) {
            this.zzg = str;
        }

        public final String toString() {
            return this.zzg;
        }
    }

    private zzgj(String str, zzb zzbVar, zzdc zzdcVar) {
        this.zza = str;
        this.zzb = zzbVar;
        this.zzc = zzdcVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgj)) {
            return false;
        }
        zzgj zzgjVar = (zzgj) obj;
        return zzgjVar.zzb.equals(this.zzb) && zzgjVar.zzc.equals(this.zzc) && zzgjVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzgj.class, this.zza, this.zzb, this.zzc);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zza + ", dekParsingStrategy: " + String.valueOf(this.zzb) + ", dekParametersForNewKeys: " + String.valueOf(this.zzc) + ")";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzci
    public final boolean zza() {
        return false;
    }

    public final zzdc zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza;
    }
}
