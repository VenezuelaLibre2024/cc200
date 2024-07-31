package com.google.android.gms.internal.p377firebaseauthapi;

import java.math.BigInteger;

/* loaded from: classes.dex */
final class zzmg {
    public static final zzmg zza;
    public BigInteger zzb;
    public BigInteger zzc;
    public BigInteger zzd;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zza = new zzmg(bigInteger, bigInteger, BigInteger.ZERO);
    }

    public zzmg(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzb = bigInteger;
        this.zzc = bigInteger2;
        this.zzd = bigInteger3;
    }

    public final boolean zza() {
        return this.zzd.equals(BigInteger.ZERO);
    }
}
