package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzhd implements Iterator {
    public final Iterator zza;
    public final /* synthetic */ zzhe zzb;

    public zzhd(zzhe zzheVar) {
        zzff zzffVar;
        this.zzb = zzheVar;
        zzffVar = zzheVar.zza;
        this.zza = zzffVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
