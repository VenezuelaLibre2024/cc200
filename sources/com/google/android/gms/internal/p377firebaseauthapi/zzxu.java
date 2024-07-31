package com.google.android.gms.internal.p377firebaseauthapi;

import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzxu {
    private final BigInteger zza;

    private zzxu(BigInteger bigInteger) {
        this.zza = bigInteger;
    }

    public static zzxu zza(BigInteger bigInteger, zzct zzctVar) {
        Objects.requireNonNull(zzctVar, "SecretKeyAccess required");
        return new zzxu(bigInteger);
    }

    public final BigInteger zza(zzct zzctVar) {
        Objects.requireNonNull(zzctVar, "SecretKeyAccess required");
        return this.zza;
    }
}
