package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzge extends zzdc {
    private final String zza;

    private zzge(String str) {
        this.zza = str;
    }

    public static zzge zza(String str) {
        return new zzge(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzge) {
            return ((zzge) obj).zza.equals(this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzge.class, this.zza);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ")";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzci
    public final boolean zza() {
        return false;
    }

    public final String zzb() {
        return this.zza;
    }
}
