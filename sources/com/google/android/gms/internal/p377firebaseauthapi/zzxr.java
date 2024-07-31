package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzxr {
    private final byte[] zza;

    private zzxr(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public static zzxr zza(byte[] bArr) {
        Objects.requireNonNull(bArr, "data must be non-null");
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new zzxr(bArr, 0, length);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzxr) {
            return Arrays.equals(((zzxr) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return "Bytes(" + zzxh.zza(this.zza) + ")";
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zza;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
