package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
class zzao<E> extends zzan<E> {
    public Object[] zza;
    public int zzb;
    public boolean zzc;

    public zzao(int i10) {
        zzaj.zza(4, "initialCapacity");
        this.zza = new Object[4];
        this.zzb = 0;
    }

    public zzao<E> zza(E e10) {
        zzz.zza(e10);
        int i10 = this.zzb + 1;
        Object[] objArr = this.zza;
        if (objArr.length >= i10) {
            if (this.zzc) {
                this.zza = (Object[]) objArr.clone();
            }
            Object[] objArr2 = this.zza;
            int i11 = this.zzb;
            this.zzb = i11 + 1;
            objArr2[i11] = e10;
            return this;
        }
        this.zza = Arrays.copyOf(objArr, zzan.zza(objArr.length, i10));
        this.zzc = false;
        Object[] objArr22 = this.zza;
        int i112 = this.zzb;
        this.zzb = i112 + 1;
        objArr22[i112] = e10;
        return this;
    }
}
