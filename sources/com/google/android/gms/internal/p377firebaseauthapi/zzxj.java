package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzic;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzxj implements zzrv {
    private static final zzic.zza zza = zzic.zza.zza;
    private final SecretKey zzb;
    private byte[] zzc;
    private byte[] zzd;

    public zzxj(byte[] bArr) {
        zzxq.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzb = secretKeySpec;
        Cipher zza2 = zza();
        zza2.init(1, secretKeySpec);
        byte[] zzb = zzrb.zzb(zza2.doFinal(new byte[16]));
        this.zzc = zzb;
        this.zzd = zzrb.zzb(zzb);
    }

    private static Cipher zza() {
        if (zza.zza()) {
            return zzwr.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzrv
    public final byte[] zza(byte[] bArr, int i10) {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher zza2 = zza();
        zza2.init(1, this.zzb);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        byte[] zza3 = (max << 4) == bArr.length ? zzwi.zza(bArr, (max - 1) << 4, this.zzc, 0, 16) : zzwi.zza(zzrb.zza(Arrays.copyOfRange(bArr, (max - 1) << 4, bArr.length)), this.zzd);
        byte[] bArr2 = new byte[16];
        for (int i11 = 0; i11 < max - 1; i11++) {
            bArr2 = zza2.doFinal(zzwi.zza(bArr2, 0, bArr, i11 << 4, 16));
        }
        return Arrays.copyOf(zza2.doFinal(zzwi.zza(zza3, bArr2)), i10);
    }
}
