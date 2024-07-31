package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzio extends zzhv {
    private static final Logger zzb = Logger.getLogger(zzio.class.getName());
    private static final boolean zzc = zzmo.zzc();
    public zzir zza;

    /* loaded from: classes.dex */
    public static class zza extends zzio {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        public zza(byte[] bArr, int i10, int i11) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            if ((i11 | 0 | (bArr.length - i11)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)));
            }
            this.zzb = bArr;
            this.zzc = 0;
            this.zze = 0;
            this.zzd = i11;
        }

        private final void zzc(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.zzb, this.zze, i11);
                this.zze += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final int zza() {
            return this.zzd - this.zze;
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(byte b10) {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zze;
                this.zze = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i10) {
            try {
                byte[] bArr = this.zzb;
                int i11 = this.zze;
                int i12 = i11 + 1;
                this.zze = i12;
                bArr[i11] = (byte) i10;
                int i13 = i12 + 1;
                this.zze = i13;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i13 + 1;
                this.zze = i14;
                bArr[i13] = (byte) (i10 >> 16);
                this.zze = i14 + 1;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i10, int i11) {
            zzc(i10, 5);
            zza(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i10, long j10) {
            zzc(i10, 1);
            zza(j10);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i10, zzhu zzhuVar) {
            zzc(i10, 2);
            zza(zzhuVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i10, zzkr zzkrVar) {
            zzc(1, 3);
            zzd(2, i10);
            zzc(3, 2);
            zza(zzkrVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i10, zzkr zzkrVar, zzlj zzljVar) {
            zzc(i10, 2);
            zzc(((zzhl) zzkrVar).zza(zzljVar));
            zzljVar.zza((zzlj) zzkrVar, (zzne) this.zza);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i10, String str) {
            zzc(i10, 2);
            zza(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(int i10, boolean z10) {
            zzc(i10, 0);
            zza(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(long j10) {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zze;
                int i11 = i10 + 1;
                this.zze = i11;
                bArr[i10] = (byte) j10;
                int i12 = i11 + 1;
                this.zze = i12;
                bArr[i11] = (byte) (j10 >> 8);
                int i13 = i12 + 1;
                this.zze = i13;
                bArr[i12] = (byte) (j10 >> 16);
                int i14 = i13 + 1;
                this.zze = i14;
                bArr[i13] = (byte) (j10 >> 24);
                int i15 = i14 + 1;
                this.zze = i15;
                bArr[i14] = (byte) (j10 >> 32);
                int i16 = i15 + 1;
                this.zze = i16;
                bArr[i15] = (byte) (j10 >> 40);
                int i17 = i16 + 1;
                this.zze = i17;
                bArr[i16] = (byte) (j10 >> 48);
                this.zze = i17 + 1;
                bArr[i17] = (byte) (j10 >> 56);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(zzhu zzhuVar) {
            zzc(zzhuVar.zzb());
            zzhuVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(zzkr zzkrVar) {
            zzc(zzkrVar.zzbw());
            zzkrVar.zza(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zza(String str) {
            int i10 = this.zze;
            try {
                int zzj = zzio.zzj(str.length() * 3);
                int zzj2 = zzio.zzj(str.length());
                if (zzj2 != zzj) {
                    zzc(zzmp.zza(str));
                    this.zze = zzmp.zza(str, this.zzb, this.zze, zza());
                    return;
                }
                int i11 = i10 + zzj2;
                this.zze = i11;
                int zza = zzmp.zza(str, this.zzb, i11, zza());
                this.zze = i10;
                zzc((zza - i10) - zzj2);
                this.zze = zza;
            } catch (zzms e10) {
                this.zze = i10;
                zza(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzb(e11);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzhv
        public final void zza(byte[] bArr, int i10, int i11) {
            zzc(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzb(int i10) {
            if (i10 >= 0) {
                zzc(i10);
            } else {
                zzb(i10);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzb(int i10, int i11) {
            zzc(i10, 0);
            zzb(i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzb(int i10, long j10) {
            zzc(i10, 0);
            zzb(j10);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzb(int i10, zzhu zzhuVar) {
            zzc(1, 3);
            zzd(2, i10);
            zza(3, zzhuVar);
            zzc(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzb(long j10) {
            if (zzio.zzc && zza() >= 10) {
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i10 = this.zze;
                    this.zze = i10 + 1;
                    zzmo.zza(bArr, i10, (byte) (((int) j10) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i11 = this.zze;
                this.zze = i11 + 1;
                zzmo.zza(bArr2, i11, (byte) j10);
                return;
            }
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i12 = this.zze;
                    this.zze = i12 + 1;
                    bArr3[i12] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
                }
            }
            byte[] bArr4 = this.zzb;
            int i13 = this.zze;
            this.zze = i13 + 1;
            bArr4[i13] = (byte) j10;
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzb(byte[] bArr, int i10, int i11) {
            zzc(i11);
            zzc(bArr, 0, i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzc(int i10) {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i11 = this.zze;
                    this.zze = i11 + 1;
                    bArr[i11] = (byte) (i10 | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
                }
            }
            byte[] bArr2 = this.zzb;
            int i12 = this.zze;
            this.zze = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzc(int i10, int i11) {
            zzc((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.measurement.zzio
        public final void zzd(int i10, int i11) {
            zzc(i10, 0);
            zzc(i11);
        }
    }

    /* loaded from: classes.dex */
    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private zzio() {
    }

    public static int zza(double d10) {
        return 8;
    }

    public static int zza(float f10) {
        return 4;
    }

    public static int zza(int i10, double d10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zza(int i10, float f10) {
        return zzj(i10 << 3) + 4;
    }

    public static int zza(int i10, zzjv zzjvVar) {
        return (zzj(8) << 1) + zzj(2, i10) + zzb(3, zzjvVar);
    }

    public static int zza(zzjv zzjvVar) {
        int zzb2 = zzjvVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zza(zzkr zzkrVar, zzlj zzljVar) {
        int zza2 = ((zzhl) zzkrVar).zza(zzljVar);
        return zzj(zza2) + zza2;
    }

    public static int zza(boolean z10) {
        return 1;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    public static int zzb(int i10, zzjv zzjvVar) {
        int zzj = zzj(i10 << 3);
        int zzb2 = zzjvVar.zzb();
        return zzj + zzj(zzb2) + zzb2;
    }

    public static int zzb(int i10, zzkr zzkrVar) {
        return (zzj(8) << 1) + zzj(2, i10) + zzj(24) + zzc(zzkrVar);
    }

    @Deprecated
    public static int zzb(int i10, zzkr zzkrVar, zzlj zzljVar) {
        return (zzj(i10 << 3) << 1) + ((zzhl) zzkrVar).zza(zzljVar);
    }

    public static int zzb(int i10, String str) {
        return zzj(i10 << 3) + zzb(str);
    }

    public static int zzb(int i10, boolean z10) {
        return zzj(i10 << 3) + 1;
    }

    public static int zzb(zzhu zzhuVar) {
        int zzb2 = zzhuVar.zzb();
        return zzj(zzb2) + zzb2;
    }

    @Deprecated
    public static int zzb(zzkr zzkrVar) {
        return zzkrVar.zzbw();
    }

    public static int zzb(String str) {
        int length;
        try {
            length = zzmp.zza(str);
        } catch (zzms unused) {
            length = str.getBytes(zzjh.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzio zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zzc(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zzc(int i10, zzhu zzhuVar) {
        int zzj = zzj(i10 << 3);
        int zzb2 = zzhuVar.zzb();
        return zzj + zzj(zzb2) + zzb2;
    }

    public static int zzc(int i10, zzkr zzkrVar, zzlj zzljVar) {
        return zzj(i10 << 3) + zza(zzkrVar, zzljVar);
    }

    public static int zzc(long j10) {
        return 8;
    }

    public static int zzc(zzkr zzkrVar) {
        int zzbw = zzkrVar.zzbw();
        return zzj(zzbw) + zzbw;
    }

    public static int zzd(int i10) {
        return zzg(i10);
    }

    public static int zzd(int i10, long j10) {
        return zzj(i10 << 3) + zzg(j10);
    }

    public static int zzd(int i10, zzhu zzhuVar) {
        return (zzj(8) << 1) + zzj(2, i10) + zzc(3, zzhuVar);
    }

    public static int zzd(long j10) {
        return zzg(j10);
    }

    public static int zze(int i10) {
        return 4;
    }

    public static int zze(int i10, int i11) {
        return zzj(i10 << 3) + zzg(i11);
    }

    public static int zze(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zze(long j10) {
        return 8;
    }

    public static int zzf(int i10) {
        return zzg(i10);
    }

    public static int zzf(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzf(int i10, long j10) {
        return zzj(i10 << 3) + zzg(zzi(j10));
    }

    public static int zzf(long j10) {
        return zzg(zzi(j10));
    }

    public static int zzg(int i10) {
        return 4;
    }

    public static int zzg(int i10, int i11) {
        return zzj(i10 << 3) + zzg(i11);
    }

    public static int zzg(int i10, long j10) {
        return zzj(i10 << 3) + zzg(j10);
    }

    public static int zzg(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int zzh(int i10) {
        return zzj(zzl(i10));
    }

    public static int zzh(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzi(int i10) {
        return zzj(i10 << 3);
    }

    public static int zzi(int i10, int i11) {
        return zzj(i10 << 3) + zzj(zzl(i11));
    }

    private static long zzi(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int zzj(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int zzj(int i10, int i11) {
        return zzj(i10 << 3) + zzj(i11);
    }

    private static int zzl(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b10);

    public abstract void zza(int i10);

    public abstract void zza(int i10, int i11);

    public abstract void zza(int i10, long j10);

    public abstract void zza(int i10, zzhu zzhuVar);

    public abstract void zza(int i10, zzkr zzkrVar);

    public abstract void zza(int i10, zzkr zzkrVar, zzlj zzljVar);

    public abstract void zza(int i10, String str);

    public abstract void zza(int i10, boolean z10);

    public abstract void zza(long j10);

    public abstract void zza(zzhu zzhuVar);

    public abstract void zza(zzkr zzkrVar);

    public abstract void zza(String str);

    public final void zza(String str, zzms zzmsVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmsVar);
        byte[] bytes = str.getBytes(zzjh.zza);
        try {
            zzc(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzb(e10);
        }
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzb(double d10) {
        zza(Double.doubleToRawLongBits(d10));
    }

    public final void zzb(float f10) {
        zza(Float.floatToRawIntBits(f10));
    }

    public abstract void zzb(int i10);

    public final void zzb(int i10, double d10) {
        zza(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i10, float f10) {
        zza(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void zzb(int i10, int i11);

    public abstract void zzb(int i10, long j10);

    public abstract void zzb(int i10, zzhu zzhuVar);

    public abstract void zzb(long j10);

    public final void zzb(boolean z10) {
        zza(z10 ? (byte) 1 : (byte) 0);
    }

    public abstract void zzb(byte[] bArr, int i10, int i11);

    public abstract void zzc(int i10);

    public abstract void zzc(int i10, int i11);

    public abstract void zzd(int i10, int i11);

    public final void zzh(int i10, long j10) {
        zzb(i10, zzi(j10));
    }

    public final void zzh(long j10) {
        zzb(zzi(j10));
    }

    public final void zzk(int i10) {
        zzc(zzl(i10));
    }

    public final void zzk(int i10, int i11) {
        zzd(i10, zzl(i11));
    }
}
