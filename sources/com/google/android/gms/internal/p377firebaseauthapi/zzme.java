package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzme {
    private static final byte[][] zza = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Byte.MAX_VALUE}};

    public static void zza(long[] jArr, byte[] bArr, byte[] bArr2) {
        int i10 = 32;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
        copyOf[31] = (byte) (copyOf[31] & Byte.MAX_VALUE);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[][] bArr3 = zza;
            if (i12 >= bArr3.length) {
                long[] zza2 = zzmj.zza(copyOf);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                int i13 = 10;
                System.arraycopy(zza2, 0, jArr2, 0, 10);
                int i14 = 0;
                while (i14 < i10) {
                    int i15 = bArr[(32 - i14) - 1] & 255;
                    while (i11 < 8) {
                        int i16 = (i15 >> (7 - i11)) & 1;
                        zza(jArr4, jArr2, i16);
                        zza(jArr5, jArr3, i16);
                        long[] copyOf2 = Arrays.copyOf(jArr4, i13);
                        int i17 = i15;
                        long[] jArr10 = new long[19];
                        long[] jArr11 = new long[19];
                        int i18 = i14;
                        long[] jArr12 = new long[19];
                        int i19 = i11;
                        long[] jArr13 = new long[19];
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr9;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        zzmj.zzd(jArr4, jArr5);
                        zzmj.zzc(jArr5, copyOf2);
                        long[] copyOf3 = Arrays.copyOf(jArr2, 10);
                        zzmj.zzd(jArr2, jArr3);
                        zzmj.zzc(jArr3, copyOf3);
                        zzmj.zzb(jArr13, jArr2, jArr5);
                        zzmj.zzb(jArr14, jArr4, jArr3);
                        zzmj.zzb(jArr13);
                        zzmj.zza(jArr13);
                        zzmj.zzb(jArr14);
                        zzmj.zza(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, copyOf3, 0, 10);
                        zzmj.zzd(jArr13, jArr14);
                        zzmj.zzc(jArr14, copyOf3);
                        zzmj.zzb(jArr17, jArr13);
                        zzmj.zzb(jArr16, jArr14);
                        zzmj.zzb(jArr14, jArr16, zza2);
                        zzmj.zzb(jArr14);
                        zzmj.zza(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        zzmj.zzb(jArr11, jArr4);
                        zzmj.zzb(jArr12, jArr5);
                        zzmj.zzb(jArr8, jArr11, jArr12);
                        zzmj.zzb(jArr8);
                        zzmj.zza(jArr8);
                        zzmj.zzc(jArr12, jArr11);
                        Arrays.fill(jArr10, 10, 18, 0L);
                        zzmj.zza(jArr10, jArr12, 121665L);
                        zzmj.zza(jArr10);
                        zzmj.zzd(jArr10, jArr11);
                        zzmj.zzb(jArr15, jArr12, jArr10);
                        zzmj.zzb(jArr15);
                        zzmj.zza(jArr15);
                        zza(jArr8, jArr6, i16);
                        zza(jArr15, jArr7, i16);
                        i11 = i19 + 1;
                        jArr2 = jArr6;
                        i15 = i17;
                        i14 = i18;
                        jArr6 = jArr18;
                        i13 = 10;
                        long[] jArr19 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr19;
                        long[] jArr20 = jArr8;
                        jArr8 = jArr4;
                        jArr4 = jArr20;
                        jArr9 = jArr5;
                        jArr5 = jArr15;
                    }
                    i14++;
                    i10 = 32;
                    i11 = 0;
                    i13 = 10;
                }
                int i20 = i13;
                long[] jArr21 = new long[i20];
                zzmj.zza(jArr21, jArr5);
                zzmj.zza(jArr, jArr4, jArr21);
                long[] jArr22 = new long[i20];
                long[] jArr23 = new long[i20];
                long[] jArr24 = new long[11];
                long[] jArr25 = new long[11];
                long[] jArr26 = new long[11];
                zzmj.zza(jArr22, zza2, jArr);
                zzmj.zzd(jArr23, zza2, jArr);
                long[] jArr27 = new long[i20];
                jArr27[0] = 486662;
                zzmj.zzd(jArr25, jArr23, jArr27);
                zzmj.zza(jArr25, jArr25, jArr3);
                zzmj.zzd(jArr25, jArr2);
                zzmj.zza(jArr25, jArr25, jArr22);
                zzmj.zza(jArr25, jArr25, jArr2);
                zzmj.zza(jArr24, jArr25, 4L);
                zzmj.zza(jArr24);
                zzmj.zza(jArr25, jArr22, jArr3);
                zzmj.zzc(jArr25, jArr25, jArr3);
                zzmj.zza(jArr26, jArr23, jArr2);
                zzmj.zzd(jArr25, jArr25, jArr26);
                zzmj.zzb(jArr25, jArr25);
                if (MessageDigest.isEqual(zzmj.zzc(jArr24), zzmj.zzc(jArr25))) {
                    return;
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + zzxh.zza(bArr2));
            }
            if (MessageDigest.isEqual(bArr3[i12], copyOf)) {
                throw new InvalidKeyException("Banned public key: " + zzxh.zza(bArr3[i12]));
            }
            i12++;
        }
    }

    private static void zza(long[] jArr, long[] jArr2, int i10) {
        int i11 = -i10;
        for (int i12 = 0; i12 < 10; i12++) {
            int i13 = (((int) jArr[i12]) ^ ((int) jArr2[i12])) & i11;
            jArr[i12] = ((int) jArr[i12]) ^ i13;
            jArr2[i12] = i13 ^ ((int) jArr2[i12]);
        }
    }
}
