package com.google.android.gms.internal.auth;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzdw extends zzdy {
    public final /* synthetic */ zzef zza;
    private int zzb = 0;
    private final int zzc;

    public zzdw(zzef zzefVar) {
        this.zza = zzefVar;
        this.zzc = zzefVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzea
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }
}
