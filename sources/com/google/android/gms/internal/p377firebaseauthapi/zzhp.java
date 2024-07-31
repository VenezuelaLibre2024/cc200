package com.google.android.gms.internal.p377firebaseauthapi;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class zzhp extends zzho {
    public zzhp(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzho
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzho
    public final /* bridge */ /* synthetic */ void zza(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        super.zza(byteBuffer, bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzho
    public final /* bridge */ /* synthetic */ byte[] zza(byte[] bArr, ByteBuffer byteBuffer) {
        return super.zza(bArr, byteBuffer);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzho
    public final int[] zza(int[] iArr, int i10) {
        if (iArr.length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
        }
        int[] iArr2 = new int[16];
        zzhk.zza(iArr2, this.zza);
        iArr2[12] = i10;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }
}
