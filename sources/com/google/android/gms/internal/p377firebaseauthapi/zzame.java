package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzame {
    private static final zzame zza = new zzame(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzame() {
        this(0, new int[8], new Object[8], true);
    }

    private zzame(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzame zza(zzame zzameVar, zzame zzameVar2) {
        int i10 = zzameVar.zzb + zzameVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzameVar.zzc, i10);
        System.arraycopy(zzameVar2.zzc, 0, copyOf, zzameVar.zzb, zzameVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzameVar.zzd, i10);
        System.arraycopy(zzameVar2.zzd, 0, copyOf2, zzameVar.zzb, zzameVar2.zzb);
        return new zzame(i10, copyOf, copyOf2, true);
    }

    private final void zza(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    private static void zza(int i10, Object obj, zzanb zzanbVar) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            zzanbVar.zzb(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            zzanbVar.zza(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            zzanbVar.zza(i11, (zzahm) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new RuntimeException(zzajj.zza());
            }
            zzanbVar.zzb(i11, ((Integer) obj).intValue());
        } else if (zzanbVar.zza() == zzana.zza) {
            zzanbVar.zzb(i11);
            ((zzame) obj).zzb(zzanbVar);
            zzanbVar.zza(i11);
        } else {
            zzanbVar.zza(i11);
            ((zzame) obj).zzb(zzanbVar);
            zzanbVar.zzb(i11);
        }
    }

    public static zzame zzc() {
        return zza;
    }

    public static zzame zzd() {
        return new zzame();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzame)) {
            return false;
        }
        zzame zzameVar = (zzame) obj;
        int i10 = this.zzb;
        if (i10 == zzameVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzameVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    z10 = true;
                    break;
                }
                if (iArr[i11] != iArr2[i11]) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                Object[] objArr = this.zzd;
                Object[] objArr2 = zzameVar.zzd;
                int i12 = this.zzb;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        z11 = true;
                        break;
                    }
                    if (!objArr[i13].equals(objArr2[i13])) {
                        z11 = false;
                        break;
                    }
                    i13++;
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.zzc;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.zzd;
        int i16 = this.zzb;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int zza() {
        int zze;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                zze = zzaii.zze(i14, ((Long) this.zzd[i12]).longValue());
            } else if (i15 == 1) {
                zze = zzaii.zza(i14, ((Long) this.zzd[i12]).longValue());
            } else if (i15 == 2) {
                zze = zzaii.zza(i14, (zzahm) this.zzd[i12]);
            } else if (i15 == 3) {
                zze = (zzaii.zzg(i14) << 1) + ((zzame) this.zzd[i12]).zza();
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException(zzajj.zza());
                }
                zze = zzaii.zzb(i14, ((Integer) this.zzd[i12]).intValue());
            }
            i11 += zze;
        }
        this.zze = i11;
        return i11;
    }

    public final zzame zza(zzame zzameVar) {
        if (zzameVar.equals(zza)) {
            return this;
        }
        zzf();
        int i10 = this.zzb + zzameVar.zzb;
        zza(i10);
        System.arraycopy(zzameVar.zzc, 0, this.zzc, this.zzb, zzameVar.zzb);
        System.arraycopy(zzameVar.zzd, 0, this.zzd, this.zzb, zzameVar.zzb);
        this.zzb = i10;
        return this;
    }

    public final void zza(int i10, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    public final void zza(zzanb zzanbVar) {
        if (zzanbVar.zza() == zzana.zzb) {
            for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
                zzanbVar.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzanbVar.zza(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    public final void zza(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzakp.zza(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            i11 += zzaii.zzb(this.zzc[i12] >>> 3, (zzahm) this.zzd[i12]);
        }
        this.zze = i11;
        return i11;
    }

    public final void zzb(zzanb zzanbVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zzanbVar.zza() == zzana.zza) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                zza(this.zzc[i10], this.zzd[i10], zzanbVar);
            }
            return;
        }
        for (int i11 = this.zzb - 1; i11 >= 0; i11--) {
            zza(this.zzc[i11], this.zzd[i11], zzanbVar);
        }
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }
}
