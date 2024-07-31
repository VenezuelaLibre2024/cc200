package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzpp;
import com.google.android.gms.internal.p377firebaseauthapi.zzqm;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzxo implements zzcf {
    private static final byte[] zza = {0};
    private final zzrv zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzxo(zzpi zzpiVar) {
        this.zzb = new zzxj(zzpiVar.zze().zza(zzbr.zza()));
        this.zzc = ((zzpp) zzpiVar.zzc()).zzb();
        this.zzd = zzpiVar.zzd().zzb();
        if (!((zzpp) zzpiVar.zzc()).zze().equals(zzpp.zzb.zzc)) {
            this.zze = new byte[0];
        } else {
            byte[] bArr = zza;
            this.zze = Arrays.copyOf(bArr, bArr.length);
        }
    }

    private zzxo(zzqb zzqbVar) {
        this.zzb = new zzxm("HMAC" + String.valueOf(((zzqm) zzqbVar.zzc()).zze()), new SecretKeySpec(zzqbVar.zze().zza(zzbr.zza()), "HMAC"));
        this.zzc = ((zzqm) zzqbVar.zzc()).zzb();
        this.zzd = zzqbVar.zzd().zzb();
        if (!((zzqm) zzqbVar.zzc()).zzf().equals(zzqm.zzc.zzc)) {
            this.zze = new byte[0];
        } else {
            byte[] bArr = zza;
            this.zze = Arrays.copyOf(bArr, bArr.length);
        }
    }

    public zzxo(zzrv zzrvVar, int i10) {
        this.zzb = zzrvVar;
        this.zzc = i10;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzrvVar.zza(new byte[0], i10);
    }

    public static zzcf zza(zzpi zzpiVar) {
        return new zzxo(zzpiVar);
    }

    public static zzcf zza(zzqb zzqbVar) {
        return new zzxo(zzqbVar);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzcf
    public final void zza(byte[] bArr, byte[] bArr2) {
        if (!MessageDigest.isEqual(zza(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzcf
    public final byte[] zza(byte[] bArr) {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? zzwi.zza(this.zzd, this.zzb.zza(zzwi.zza(bArr, bArr2), this.zzc)) : zzwi.zza(this.zzd, this.zzb.zza(bArr, this.zzc));
    }
}
