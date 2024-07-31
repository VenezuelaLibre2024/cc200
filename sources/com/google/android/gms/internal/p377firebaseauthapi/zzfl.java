package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzfo;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzfl extends zzda {
    private final zzfo zza;
    private final zzxt zzb;
    private final zzxr zzc;
    private final Integer zzd;

    private zzfl(zzfo zzfoVar, zzxt zzxtVar, zzxr zzxrVar, Integer num) {
        this.zza = zzfoVar;
        this.zzb = zzxtVar;
        this.zzc = zzxrVar;
        this.zzd = num;
    }

    public static zzfl zza(zzfo.zza zzaVar, zzxt zzxtVar, Integer num) {
        zzxr zza;
        zzfo.zza zzaVar2 = zzfo.zza.zzc;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzaVar) + " the value of idRequirement must be non-null");
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzxtVar.zza() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzxtVar.zza());
        }
        zzfo zza2 = zzfo.zza(zzaVar);
        if (zza2.zzb() == zzaVar2) {
            zza = zzxr.zza(new byte[0]);
        } else if (zza2.zzb() == zzfo.zza.zzb) {
            zza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (zza2.zzb() != zzfo.zza.zza) {
                throw new IllegalStateException("Unknown Variant: " + String.valueOf(zza2.zzb()));
            }
            zza = zzxr.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new zzfl(zza2, zzxtVar, zza, num);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzbu
    public final Integer zza() {
        return this.zzd;
    }

    public final zzfo zzb() {
        return this.zza;
    }

    public final zzxr zzc() {
        return this.zzc;
    }

    public final zzxt zzd() {
        return this.zzb;
    }
}
