package com.google.android.gms.internal.p377firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p079f6.C1841a;

/* loaded from: classes.dex */
public final class zzwi {
    public static final void zza(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (i10 < 0 || byteBuffer2.remaining() < i10 || byteBuffer3.remaining() < i10 || byteBuffer.remaining() < i10) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] zza(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        if (i12 < 0 || bArr.length - i12 < i10 || bArr2.length - i12 < i11) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr3[i13] = (byte) (bArr[i13 + i10] ^ bArr2[i13 + i11]);
        }
        return bArr3;
    }

    public static final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return zza(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static byte[] zza(byte[]... bArr) {
        int i10 = 0;
        for (byte[] bArr2 : bArr) {
            if (i10 > C1841a.e.API_PRIORITY_OTHER - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i10 += bArr2.length;
        }
        byte[] bArr3 = new byte[i10];
        int i11 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i11, bArr4.length);
            i11 += bArr4.length;
        }
        return bArr3;
    }
}
