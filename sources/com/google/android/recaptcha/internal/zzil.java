package com.google.android.recaptcha.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p079f6.C1841a;

/* loaded from: classes.dex */
final class zzil extends zzgh implements RandomAccess, zzkm {
    private static final zzil zza = new zzil(new float[0], 0, false);
    private float[] zzb;
    private int zzc;

    public zzil() {
        this(new float[10], 0, true);
    }

    private zzil(float[] fArr, int i10, boolean z10) {
        super(z10);
        this.zzb = fArr;
        this.zzc = i10;
    }

    private final String zzf(int i10) {
        return "Index:" + i10 + ", Size:" + this.zzc;
    }

    private final void zzg(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
        int i12 = i10 + 1;
        float[] fArr = this.zzb;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i12, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.zzb, i10, fArr2, i12, this.zzc - i10);
            this.zzb = fArr2;
        }
        this.zzb[i10] = floatValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzjc.zzd;
        Objects.requireNonNull(collection);
        if (!(collection instanceof zzil)) {
            return super.addAll(collection);
        }
        zzil zzilVar = (zzil) collection;
        int i10 = zzilVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (C1841a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.zzb;
        if (i12 > fArr.length) {
            this.zzb = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(zzilVar.zzb, 0, this.zzb, this.zzc, zzilVar.zzc);
        this.zzc = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzil)) {
            return super.equals(obj);
        }
        zzil zzilVar = (zzil) obj;
        if (this.zzc != zzilVar.zzc) {
            return false;
        }
        float[] fArr = zzilVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (Float.floatToIntBits(this.zzb[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzg(i10);
        return Float.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.zzb[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == floatValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzg(i10);
        float[] fArr = this.zzb;
        float f10 = fArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzb;
        System.arraycopy(fArr, i11, fArr, i10, this.zzc - i11);
        this.zzc -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzgh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzg(i10);
        float[] fArr = this.zzb;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final /* bridge */ /* synthetic */ zzjb zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzil(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(float f10) {
        zza();
        int i10 = this.zzc;
        float[] fArr = this.zzb;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        fArr3[i11] = f10;
    }
}
