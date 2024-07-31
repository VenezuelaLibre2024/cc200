package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzqm;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzqb extends zzqp {
    private final zzqm zza;
    private final zzxt zzb;
    private final zzxr zzc;
    private final Integer zzd;

    /* loaded from: classes.dex */
    public static class zza {
        private zzqm zza;
        private zzxt zzb;
        private Integer zzc;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzqm zzqmVar) {
            this.zza = zzqmVar;
            return this;
        }

        public final zza zza(zzxt zzxtVar) {
            this.zzb = zzxtVar;
            return this;
        }

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        public final zzqb zza() {
            zzxr zza;
            zzqm zzqmVar = this.zza;
            if (zzqmVar == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzqmVar.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzf() == zzqm.zzc.zzd) {
                zza = zzxr.zza(new byte[0]);
            } else if (this.zza.zzf() == zzqm.zzc.zzc || this.zza.zzf() == zzqm.zzc.zzb) {
                zza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
            } else {
                if (this.zza.zzf() != zzqm.zzc.zza) {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: " + String.valueOf(this.zza.zzf()));
                }
                zza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
            }
            return new zzqb(this.zza, this.zzb, zza, this.zzc);
        }
    }

    private zzqb(zzqm zzqmVar, zzxt zzxtVar, zzxr zzxrVar, Integer num) {
        this.zza = zzqmVar;
        this.zzb = zzxtVar;
        this.zzc = zzxrVar;
        this.zzd = num;
    }

    public static zza zzb() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzbu
    public final Integer zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzqp
    public final /* synthetic */ zzqs zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzqp
    public final zzxr zzd() {
        return this.zzc;
    }

    public final zzxt zze() {
        return this.zzb;
    }
}
