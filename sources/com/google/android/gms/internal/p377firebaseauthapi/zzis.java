package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzis {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesSivKey";

    @Deprecated
    private static final zzvv zzb = zzvv.zzb();

    @Deprecated
    private static final zzvv zzc = zzvv.zzb();

    static {
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() {
        zzix.zzc();
        if (zzic.zzb()) {
            return;
        }
        zzin.zza(true);
    }
}
