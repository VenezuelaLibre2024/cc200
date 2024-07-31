package com.google.android.gms.internal.common;

import java.util.Arrays;
import java.util.Objects;
import p079f6.C1841a;

/* loaded from: classes.dex */
class zzaa extends zzab {
    public Object[] zza = new Object[4];
    public int zzb = 0;
    public boolean zzc;

    public zzaa(int i10) {
    }

    public final zzaa zza(Object obj) {
        Objects.requireNonNull(obj);
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length >= i10) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.zza;
            int i11 = this.zzb;
            this.zzb = i11 + 1;
            objArr2[i11] = obj;
            return this;
        }
        int i12 = length + (length >> 1) + 1;
        if (i12 < i10) {
            int highestOneBit = Integer.highestOneBit(i10 - 1);
            i12 = highestOneBit + highestOneBit;
        }
        if (i12 < 0) {
            i12 = C1841a.e.API_PRIORITY_OTHER;
        }
        this.zza = Arrays.copyOf(objArr, i12);
        this.zzc = false;
        Object[] objArr22 = this.zza;
        int i112 = this.zzb;
        this.zzb = i112 + 1;
        objArr22[i112] = obj;
        return this;
    }
}
