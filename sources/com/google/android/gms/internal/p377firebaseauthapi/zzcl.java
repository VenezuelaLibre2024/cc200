package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzcl implements Comparable<zzcl> {
    private final byte[] zza;

    private zzcl(byte[] bArr) {
        this.zza = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzcl zzclVar) {
        int i10;
        int i11;
        zzcl zzclVar2 = zzclVar;
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = zzclVar2.zza;
        if (length != bArr2.length) {
            i10 = bArr.length;
            i11 = bArr2.length;
        } else {
            int i12 = 0;
            while (true) {
                byte[] bArr3 = this.zza;
                if (i12 >= bArr3.length) {
                    return 0;
                }
                byte b10 = bArr3[i12];
                byte[] bArr4 = zzclVar2.zza;
                if (b10 != bArr4[i12]) {
                    i10 = bArr3[i12];
                    i11 = bArr4[i12];
                    break;
                }
                i12++;
            }
        }
        return i10 - i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcl) {
            return Arrays.equals(this.zza, ((zzcl) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzxh.zza(this.zza);
    }
}
