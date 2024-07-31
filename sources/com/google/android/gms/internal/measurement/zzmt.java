package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzmt extends zzmq {
    @Override // com.google.android.gms.internal.measurement.zzmq
    public final int zza(int i10, byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i12) {
            return 0;
        }
        while (i11 < i12) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i13 >= i12) {
                        return b10;
                    }
                    if (b10 >= -62) {
                        i11 = i13 + 1;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (b10 >= -16) {
                    if (i13 >= i12 - 2) {
                        return zzmp.zza(bArr, i13, i12);
                    }
                    int i14 = i13 + 1;
                    byte b11 = bArr[i13];
                    if (b11 <= -65 && (((b10 << 28) + (b11 + 112)) >> 30) == 0) {
                        int i15 = i14 + 1;
                        if (bArr[i14] <= -65) {
                            i13 = i15 + 1;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i13 >= i12 - 1) {
                    return zzmp.zza(bArr, i13, i12);
                }
                int i16 = i13 + 1;
                byte b12 = bArr[i13];
                if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
                    i11 = i16 + 1;
                    if (bArr[i16] > -65) {
                    }
                }
                return -1;
            }
            i11 = i13;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.measurement.zzmq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmt.zza(java.lang.String, byte[], int, int):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzmq
    public final String zza(byte[] bArr, int i10, int i11) {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!(b10 >= 0)) {
                break;
            }
            i10++;
            zzmr.zza(b10, cArr, i13);
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 >= 0) {
                int i16 = i14 + 1;
                zzmr.zza(b11, cArr, i14);
                while (i15 < i12) {
                    byte b12 = bArr[i15];
                    if (!(b12 >= 0)) {
                        break;
                    }
                    i15++;
                    zzmr.zza(b12, cArr, i16);
                    i16++;
                }
                i10 = i15;
                i14 = i16;
            } else if (b11 < -32) {
                if (i15 >= i12) {
                    throw zzjq.zzd();
                }
                zzmr.zza(b11, bArr[i15], cArr, i14);
                i10 = i15 + 1;
                i14++;
            } else if (b11 < -16) {
                if (i15 >= i12 - 1) {
                    throw zzjq.zzd();
                }
                int i17 = i15 + 1;
                zzmr.zza(b11, bArr[i15], bArr[i17], cArr, i14);
                i10 = i17 + 1;
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw zzjq.zzd();
                }
                int i18 = i15 + 1;
                byte b13 = bArr[i15];
                int i19 = i18 + 1;
                zzmr.zza(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                i10 = i19 + 1;
                i14 = i14 + 1 + 1;
            }
        }
        return new String(cArr, 0, i14);
    }
}
