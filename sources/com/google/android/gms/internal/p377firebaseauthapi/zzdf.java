package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzdm;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzdf extends zzda {
    private final zzdm zza;
    private final zzxt zzb;
    private final zzxt zzc;
    private final zzxr zzd;
    private final Integer zze;

    /* loaded from: classes.dex */
    public static class zza {
        private zzdm zza;
        private zzxt zzb;
        private zzxt zzc;
        private Integer zzd;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
        }

        public final zza zza(zzdm zzdmVar) {
            this.zza = zzdmVar;
            return this;
        }

        public final zza zza(zzxt zzxtVar) {
            this.zzb = zzxtVar;
            return this;
        }

        public final zza zza(Integer num) {
            this.zzd = num;
            return this;
        }

        public final zzdf zza() {
            zzxr zza;
            zzdm zzdmVar = this.zza;
            if (zzdmVar == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            if (this.zzb == null || this.zzc == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (zzdmVar.zzb() != this.zzb.zza()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (this.zza.zzc() != this.zzc.zza()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.zza.zza() && this.zzd == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzd != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzh() == zzdm.zzc.zzc) {
                zza = zzxr.zza(new byte[0]);
            } else if (this.zza.zzh() == zzdm.zzc.zzb) {
                zza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzd.intValue()).array());
            } else {
                if (this.zza.zzh() != zzdm.zzc.zza) {
                    throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + String.valueOf(this.zza.zzh()));
                }
                zza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzd.intValue()).array());
            }
            return new zzdf(this.zza, this.zzb, this.zzc, zza, this.zzd);
        }

        public final zza zzb(zzxt zzxtVar) {
            this.zzc = zzxtVar;
            return this;
        }
    }

    private zzdf(zzdm zzdmVar, zzxt zzxtVar, zzxt zzxtVar2, zzxr zzxrVar, Integer num) {
        this.zza = zzdmVar;
        this.zzb = zzxtVar;
        this.zzc = zzxtVar2;
        this.zzd = zzxrVar;
        this.zze = num;
    }

    public static zza zzb() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzbu
    public final Integer zza() {
        return this.zze;
    }

    public final zzdm zzc() {
        return this.zza;
    }

    public final zzxr zzd() {
        return this.zzd;
    }

    public final zzxt zze() {
        return this.zzb;
    }

    public final zzxt zzf() {
        return this.zzc;
    }
}
