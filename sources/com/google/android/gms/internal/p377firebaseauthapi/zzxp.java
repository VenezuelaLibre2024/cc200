package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzxp {
    public static byte[] zza(byte[] bArr) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return zza(bArr, bArr2);
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        copyOf[0] = (byte) (copyOf[0] & 248);
        copyOf[31] = (byte) (copyOf[31] & Byte.MAX_VALUE);
        copyOf[31] = (byte) (copyOf[31] | 64);
        zzme.zza(jArr, copyOf, bArr2);
        return zzmj.zzc(jArr);
    }
}
