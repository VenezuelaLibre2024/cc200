package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzba<K, V> extends zzav<Map.Entry<K, V>> {
    private final transient zzau<K, V> zza;
    private final transient Object[] zzb;
    private final transient int zzc = 0;
    private final transient int zzd;

    public zzba(zzau<K, V> zzauVar, Object[] objArr, int i10, int i11) {
        this.zza = zzauVar;
        this.zzb = objArr;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzav, com.google.android.gms.internal.p377firebaseauthapi.zzal, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal
    public final int zza(Object[] objArr, int i10) {
        return zzc().zza(objArr, i10);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal
    /* renamed from: zzd */
    public final zzbd<Map.Entry<K, V>> iterator() {
        return (zzbd) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzal
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzav
    public final zzaq<Map.Entry<K, V>> zzg() {
        return new zzaz(this);
    }
}
