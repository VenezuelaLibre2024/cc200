package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzct {
    private static final zzct zza = new zzct();

    private zzct() {
    }

    public static zzct zza() {
        return zza;
    }

    public static zzct zza(zzct zzctVar) {
        if (zzctVar != null) {
            return zzctVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
