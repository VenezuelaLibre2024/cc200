package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzlp implements Iterator {
    public final Iterator zza;
    public final /* synthetic */ zzlq zzb;

    public zzlp(zzlq zzlqVar) {
        zzjm zzjmVar;
        this.zzb = zzlqVar;
        zzjmVar = zzlqVar.zza;
        this.zza = zzjmVar.iterator();
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
