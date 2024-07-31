package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzic;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class zzxm implements zzrv {
    private static final zzic.zza zza = zzic.zza.zzb;
    private final ThreadLocal<Mac> zzb;
    private final String zzc;
    private final Key zzd;
    private final int zze;

    public zzxm(String str, Key key) {
        int i10;
        zzxl zzxlVar = new zzxl(this);
        this.zzb = zzxlVar;
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzc = str;
        this.zzd = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c10 = 0;
                    break;
                }
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c10 = 1;
                    break;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c10 = 2;
                    break;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c10 = 3;
                    break;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = 20;
                break;
            case 1:
                i10 = 28;
                break;
            case 2:
                i10 = 32;
                break;
            case 3:
                i10 = 48;
                break;
            case 4:
                i10 = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        this.zze = i10;
        zzxlVar.get();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzrv
    public final byte[] zza(byte[] bArr, int i10) {
        if (i10 > this.zze) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.zzb.get().update(bArr);
        return Arrays.copyOf(this.zzb.get().doFinal(), i10);
    }
}