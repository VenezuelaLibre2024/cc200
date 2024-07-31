package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzahp extends zzahr {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzahm zzc;

    public zzahp(zzahm zzahmVar) {
        this.zzc = zzahmVar;
        this.zzb = zzahmVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzahs
    public final byte zza() {
        int i10 = this.zza;
        if (i10 >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i10 + 1;
        return this.zzc.zzb(i10);
    }
}
