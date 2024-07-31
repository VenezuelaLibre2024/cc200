package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzxt {
    private final zzxr zza;

    private zzxt(zzxr zzxrVar) {
        this.zza = zzxrVar;
    }

    public static zzxt zza(int i10) {
        return new zzxt(zzxr.zza(zzov.zza(i10)));
    }

    public static zzxt zza(byte[] bArr, zzct zzctVar) {
        Objects.requireNonNull(zzctVar, "SecretKeyAccess required");
        return new zzxt(zzxr.zza(bArr));
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zza(zzct zzctVar) {
        Objects.requireNonNull(zzctVar, "SecretKeyAccess required");
        return this.zza.zzb();
    }
}
