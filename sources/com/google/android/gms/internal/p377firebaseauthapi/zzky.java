package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
final class zzky implements zzla {
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzla
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzla
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            return new zzhr(bArr).zza(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzla
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzla
    public final byte[] zzc() {
        return zzlq.zzk;
    }
}
