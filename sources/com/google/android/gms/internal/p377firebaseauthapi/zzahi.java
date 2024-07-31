package com.google.android.gms.internal.p377firebaseauthapi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzahi {
    public static double zza(byte[] bArr, int i10) {
        return Double.longBitsToDouble(zzd(bArr, i10));
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzahl zzahlVar) {
        if ((i10 >>> 3) == 0) {
            throw zzajj.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzd(bArr, i11, zzahlVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzc(bArr, i11, zzahlVar) + zzahlVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzajj.zzc();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzc(bArr, i11, zzahlVar);
            i15 = zzahlVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zza(i15, bArr, i11, i12, zzahlVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzajj.zzg();
        }
        return i11;
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzajg<?> zzajgVar, zzahl zzahlVar) {
        zzajd zzajdVar = (zzajd) zzajgVar;
        int zzc = zzc(bArr, i11, zzahlVar);
        while (true) {
            zzajdVar.zzc(zzahlVar.zza);
            if (zzc >= i12) {
                break;
            }
            int zzc2 = zzc(bArr, zzc, zzahlVar);
            if (i10 != zzahlVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzahlVar);
        }
        return zzc;
    }

    public static int zza(int i10, byte[] bArr, int i11, int i12, zzame zzameVar, zzahl zzahlVar) {
        if ((i10 >>> 3) == 0) {
            throw zzajj.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int zzd = zzd(bArr, i11, zzahlVar);
            zzameVar.zza(i10, Long.valueOf(zzahlVar.zzb));
            return zzd;
        }
        if (i13 == 1) {
            zzameVar.zza(i10, Long.valueOf(zzd(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int zzc = zzc(bArr, i11, zzahlVar);
            int i14 = zzahlVar.zza;
            if (i14 < 0) {
                throw zzajj.zzf();
            }
            if (i14 > bArr.length - zzc) {
                throw zzajj.zzi();
            }
            zzameVar.zza(i10, i14 == 0 ? zzahm.zza : zzahm.zza(bArr, zzc, i14));
            return zzc + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzajj.zzc();
            }
            zzameVar.zza(i10, Integer.valueOf(zzc(bArr, i11)));
            return i11 + 4;
        }
        zzame zzd2 = zzame.zzd();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int zzc2 = zzc(bArr, i11, zzahlVar);
            int i17 = zzahlVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = zzc2;
                break;
            }
            int zza = zza(i16, bArr, zzc2, i12, zzd2, zzahlVar);
            i16 = i17;
            i11 = zza;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzajj.zzg();
        }
        zzameVar.zza(i10, zzd2);
        return i11;
    }

    public static int zza(int i10, byte[] bArr, int i11, zzahl zzahlVar) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 < 0) {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                zzahlVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzahlVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzahlVar.zza = i14 | i13;
        return i15;
    }

    public static int zza(zzalc<?> zzalcVar, int i10, byte[] bArr, int i11, int i12, zzajg<?> zzajgVar, zzahl zzahlVar) {
        int zza = zza(zzalcVar, bArr, i11, i12, zzahlVar);
        while (true) {
            zzajgVar.add(zzahlVar.zzc);
            if (zza >= i12) {
                break;
            }
            int zzc = zzc(bArr, zza, zzahlVar);
            if (i10 != zzahlVar.zza) {
                break;
            }
            zza = zza(zzalcVar, bArr, zzc, i12, zzahlVar);
        }
        return zza;
    }

    public static int zza(zzalc zzalcVar, byte[] bArr, int i10, int i11, int i12, zzahl zzahlVar) {
        Object zza = zzalcVar.zza();
        int zza2 = zza(zza, zzalcVar, bArr, i10, i11, i12, zzahlVar);
        zzalcVar.zzc(zza);
        zzahlVar.zzc = zza;
        return zza2;
    }

    public static int zza(zzalc zzalcVar, byte[] bArr, int i10, int i11, zzahl zzahlVar) {
        Object zza = zzalcVar.zza();
        int zza2 = zza(zza, zzalcVar, bArr, i10, i11, zzahlVar);
        zzalcVar.zzc(zza);
        zzahlVar.zzc = zza;
        return zza2;
    }

    public static int zza(Object obj, zzalc zzalcVar, byte[] bArr, int i10, int i11, int i12, zzahl zzahlVar) {
        int zza = ((zzako) zzalcVar).zza((zzako) obj, bArr, i10, i11, i12, zzahlVar);
        zzahlVar.zzc = obj;
        return zza;
    }

    public static int zza(Object obj, zzalc zzalcVar, byte[] bArr, int i10, int i11, zzahl zzahlVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zza(i13, bArr, i12, zzahlVar);
            i13 = zzahlVar.zza;
        }
        int i14 = i12;
        if (i13 < 0 || i13 > i11 - i14) {
            throw zzajj.zzi();
        }
        int i15 = i13 + i14;
        zzalcVar.zza(obj, bArr, i14, i15, zzahlVar);
        zzahlVar.zzc = obj;
        return i15;
    }

    public static int zza(byte[] bArr, int i10, zzahl zzahlVar) {
        int zzc = zzc(bArr, i10, zzahlVar);
        int i11 = zzahlVar.zza;
        if (i11 < 0) {
            throw zzajj.zzf();
        }
        if (i11 > bArr.length - zzc) {
            throw zzajj.zzi();
        }
        if (i11 == 0) {
            zzahlVar.zzc = zzahm.zza;
            return zzc;
        }
        zzahlVar.zzc = zzahm.zza(bArr, zzc, i11);
        return zzc + i11;
    }

    public static int zza(byte[] bArr, int i10, zzajg<?> zzajgVar, zzahl zzahlVar) {
        zzajd zzajdVar = (zzajd) zzajgVar;
        int zzc = zzc(bArr, i10, zzahlVar);
        int i11 = zzahlVar.zza + zzc;
        while (zzc < i11) {
            zzc = zzc(bArr, zzc, zzahlVar);
            zzajdVar.zzc(zzahlVar.zza);
        }
        if (zzc == i11) {
            return zzc;
        }
        throw zzajj.zzi();
    }

    public static float zzb(byte[] bArr, int i10) {
        return Float.intBitsToFloat(zzc(bArr, i10));
    }

    public static int zzb(byte[] bArr, int i10, zzahl zzahlVar) {
        int zzc = zzc(bArr, i10, zzahlVar);
        int i11 = zzahlVar.zza;
        if (i11 < 0) {
            throw zzajj.zzf();
        }
        if (i11 == 0) {
            zzahlVar.zzc = "";
            return zzc;
        }
        zzahlVar.zzc = zzaml.zzb(bArr, zzc, i11);
        return zzc + i11;
    }

    public static int zzc(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int zzc(byte[] bArr, int i10, zzahl zzahlVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zza(b10, bArr, i11, zzahlVar);
        }
        zzahlVar.zza = b10;
        return i11;
    }

    public static int zzd(byte[] bArr, int i10, zzahl zzahlVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzahlVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        zzahlVar.zzb = j11;
        return i12;
    }

    public static long zzd(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }
}
