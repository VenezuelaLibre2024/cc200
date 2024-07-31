package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Iterator;

/* loaded from: classes.dex */
final class zzbc<K> extends zzav<K> {
    private final transient zzau<K, ?> zza;
    private final transient zzaq<K> zzb;

    public zzbc(zzau<K, ?> zzauVar, zzaq<K> zzaqVar) {
        this.zza = zzauVar;
        this.zzb = zzaqVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzav, com.google.android.gms.internal.p377firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal
    public final int zza(Object[] objArr, int i10) {
        return zzc().zza(objArr, i10);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzav, com.google.android.gms.internal.p377firebaseauthapi.zzal
    public final zzaq<K> zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal
    /* renamed from: zzd */
    public final zzbd<K> iterator() {
        return (zzbd) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal
    public final boolean zze() {
        return true;
    }
}
