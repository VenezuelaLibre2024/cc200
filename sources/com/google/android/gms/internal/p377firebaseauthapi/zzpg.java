package com.google.android.gms.internal.p377firebaseauthapi;

import android.os.Build;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzpg {
    public static final Charset zza = Charset.forName("UTF-8");

    public static int zza() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i10 = 0;
        while (i10 == 0) {
            secureRandom.nextBytes(bArr);
            i10 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i10;
    }

    public static final zzxr zza(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
            bArr[i10] = (byte) charAt;
        }
        return zzxr.zza(bArr);
    }

    public static boolean zza(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr2[i10] != bArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public static final zzxr zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < '!' || charAt > '~') {
                throw new zzpe("Not a printable ASCII character: " + charAt);
            }
            bArr[i10] = (byte) charAt;
        }
        return zzxr.zza(bArr);
    }

    public static Integer zzb() {
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
        return null;
    }
}
