package com.google.android.gms.internal.maps;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzbb extends zzbf {
    public boolean zza;
    public final /* synthetic */ Object zzb;

    public zzbb(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza) {
            throw new NoSuchElementException();
        }
        this.zza = true;
        return this.zzb;
    }
}
