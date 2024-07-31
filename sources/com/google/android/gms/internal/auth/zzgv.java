package com.google.android.gms.internal.auth;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzgv extends AbstractMap {
    private final int zza;
    private boolean zzd;
    private volatile zzgt zze;
    private List zzb = Collections.emptyList();
    private Map zzc = Collections.emptyMap();
    private Map zzf = Collections.emptyMap();

    private final int zzk(Comparable comparable) {
        int size = this.zzb.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((zzgp) this.zzb.get(size)).zza());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = comparable.compareTo(((zzgp) this.zzb.get(i11)).zza());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzl(int i10) {
        zzn();
        Object value = ((zzgp) this.zzb.remove(i10)).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator it = zzm().entrySet().iterator();
            List list = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new zzgp(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap zzm() {
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzk(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzgt(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        Object entrySet;
        Object entrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgv)) {
            return super.equals(obj);
        }
        zzgv zzgvVar = (zzgv) obj;
        int size = size();
        if (size != zzgvVar.size()) {
            return false;
        }
        int zzb = zzb();
        if (zzb == zzgvVar.zzb()) {
            for (int i10 = 0; i10 < zzb; i10++) {
                if (!zzg(i10).equals(zzgvVar.zzg(i10))) {
                    return false;
                }
            }
            if (zzb == size) {
                return true;
            }
            entrySet = this.zzc;
            entrySet2 = zzgvVar.zzc;
        } else {
            entrySet = entrySet();
            entrySet2 = zzgvVar.entrySet();
        }
        return entrySet.equals(entrySet2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        return zzk >= 0 ? ((zzgp) this.zzb.get(zzk)).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int zzb = zzb();
        int i10 = 0;
        for (int i11 = 0; i11 < zzb; i11++) {
            i10 += ((zzgp) this.zzb.get(i11)).hashCode();
        }
        return this.zzc.size() > 0 ? i10 + this.zzc.hashCode() : i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzn();
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return zzl(zzk);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb.size() + this.zzc.size();
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final Iterable zzc() {
        return this.zzc.isEmpty() ? zzgo.zza() : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzn();
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return ((zzgp) this.zzb.get(zzk)).setValue(obj);
        }
        zzn();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i10 = -(zzk + 1);
        if (i10 >= this.zza) {
            return zzm().put(comparable, obj);
        }
        int size = this.zzb.size();
        int i11 = this.zza;
        if (size == i11) {
            zzgp zzgpVar = (zzgp) this.zzb.remove(i11 - 1);
            zzm().put(zzgpVar.zza(), zzgpVar.getValue());
        }
        this.zzb.add(i10, new zzgp(this, comparable, obj));
        return null;
    }

    public final Map.Entry zzg(int i10) {
        return (Map.Entry) this.zzb.get(i10);
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
