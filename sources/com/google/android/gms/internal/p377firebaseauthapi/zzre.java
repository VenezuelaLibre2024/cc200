package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzic;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzre implements zzpx {
    private static final zzic.zza zza = zzic.zza.zza;
    private final zzpi zzb;

    public zzre(zzpi zzpiVar) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.zzb = zzpiVar;
    }
}
