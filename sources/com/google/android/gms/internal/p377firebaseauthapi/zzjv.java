package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzjl;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* loaded from: classes.dex */
public final class zzjv extends zzkr {
    private final zzjl zza;
    private final ECPoint zzb;
    private final zzxr zzc;
    private final zzxr zzd;
    private final Integer zze;

    private zzjv(zzjl zzjlVar, ECPoint eCPoint, zzxr zzxrVar, zzxr zzxrVar2, Integer num) {
        this.zza = zzjlVar;
        this.zzb = eCPoint;
        this.zzc = zzxrVar;
        this.zzd = zzxrVar2;
        this.zze = num;
    }

    public static zzjv zza(zzjl zzjlVar, zzxr zzxrVar, Integer num) {
        if (!zzjlVar.zzd().equals(zzjl.zzc.zzd)) {
            throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        zzb(zzjlVar.zzg(), num);
        if (zzxrVar.zza() == 32) {
            return new zzjv(zzjlVar, null, zzxrVar, zza(zzjlVar.zzg(), num), num);
        }
        throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    public static zzjv zza(zzjl zzjlVar, ECPoint eCPoint, Integer num) {
        ECParameterSpec eCParameterSpec;
        if (zzjlVar.zzd().equals(zzjl.zzc.zzd)) {
            throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        }
        zzb(zzjlVar.zzg(), num);
        zzjl.zzc zzd = zzjlVar.zzd();
        if (zzd == zzjl.zzc.zza) {
            eCParameterSpec = zzmd.zza;
        } else if (zzd == zzjl.zzc.zzb) {
            eCParameterSpec = zzmd.zzb;
        } else {
            if (zzd != zzjl.zzc.zzc) {
                throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zzd));
            }
            eCParameterSpec = zzmd.zzc;
        }
        zzmd.zza(eCPoint, eCParameterSpec.getCurve());
        return new zzjv(zzjlVar, eCPoint, null, zza(zzjlVar.zzg(), num), num);
    }

    private static zzxr zza(zzjl.zzd zzdVar, Integer num) {
        if (zzdVar == zzjl.zzd.zzc) {
            return zzxr.zza(new byte[0]);
        }
        if (num == null) {
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: " + String.valueOf(zzdVar));
        }
        if (zzdVar == zzjl.zzd.zzb) {
            return zzxr.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (zzdVar == zzjl.zzd.zza) {
            return zzxr.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown EciesParameters.Variant: " + String.valueOf(zzdVar));
    }

    private static void zzb(zzjl.zzd zzdVar, Integer num) {
        zzjl.zzd zzdVar2 = zzjl.zzd.zzc;
        if (zzdVar.equals(zzdVar2) || num != null) {
            if (zzdVar.equals(zzdVar2) && num != null) {
                throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
            }
        } else {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + String.valueOf(zzdVar) + " variant.");
        }
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzbu
    public final Integer zza() {
        return this.zze;
    }

    public final zzjl zzb() {
        return this.zza;
    }

    public final zzxr zzc() {
        return this.zzc;
    }

    public final ECPoint zzd() {
        return this.zzb;
    }
}
