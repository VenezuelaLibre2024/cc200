package com.google.android.gms.internal.p375authapi;

import android.util.Base64;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class zbat {
    private static final SecureRandom zba = new SecureRandom();

    public static String zba() {
        byte[] bArr = new byte[16];
        zba.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
