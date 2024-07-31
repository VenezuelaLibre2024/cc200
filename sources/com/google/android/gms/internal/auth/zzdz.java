package com.google.android.gms.internal.auth;

/* loaded from: classes.dex */
final class zzdz extends zzec {
    private final int zzc;

    public zzdz(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzef.zzi(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.auth.zzec
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.auth.zzec, com.google.android.gms.internal.auth.zzef
    public final int zzd() {
        return this.zzc;
    }
}
