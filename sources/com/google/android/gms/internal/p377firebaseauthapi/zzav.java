package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzav<E> extends zzal<E> implements Set<E> {
    private transient zzaq<E> zza;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return zzbe.zza(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzbe.zza(this);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal
    public zzaq<E> zzc() {
        zzaq<E> zzaqVar = this.zza;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zzaq<E> zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    public zzaq<E> zzg() {
        return zzaq.zza(toArray());
    }
}
