package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzat<K, V> {
    public zzaw zza;
    private Object[] zzb;
    private int zzc;
    private boolean zzd;

    public zzat() {
        this(4);
    }

    public zzat(int i10) {
        this.zzb = new Object[i10 * 2];
        this.zzc = 0;
        this.zzd = false;
    }

    private final void zza(int i10) {
        int i11 = i10 << 1;
        Object[] objArr = this.zzb;
        if (i11 > objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzan.zza(objArr.length, i11));
            this.zzd = false;
        }
    }

    public final zzat<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zza(this.zzc + ((Collection) iterable).size());
        }
        for (Map.Entry<? extends K, ? extends V> entry : iterable) {
            K key = entry.getKey();
            V value = entry.getValue();
            zza(this.zzc + 1);
            zzaj.zza(key, value);
            Object[] objArr = this.zzb;
            int i10 = this.zzc;
            objArr[i10 * 2] = key;
            objArr[(i10 * 2) + 1] = value;
            this.zzc = i10 + 1;
        }
        return this;
    }

    public final zzau<K, V> zza() {
        zzaw zzawVar = this.zza;
        if (zzawVar != null) {
            throw zzawVar.zza();
        }
        int i10 = this.zzc;
        Object[] objArr = this.zzb;
        this.zzd = true;
        zzax zza = zzax.zza(i10, objArr, this);
        zzaw zzawVar2 = this.zza;
        if (zzawVar2 == null) {
            return zza;
        }
        throw zzawVar2.zza();
    }
}
