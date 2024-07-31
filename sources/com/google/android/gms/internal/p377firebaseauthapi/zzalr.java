package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzalr implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzalh zzd;

    private zzalr(zzalh zzalhVar) {
        this.zzd = zzalhVar;
        this.zza = -1;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzc == null) {
            map = this.zzd.zzc;
            this.zzc = map.entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i10 = this.zza + 1;
        list = this.zzd.zzb;
        if (i10 >= list.size()) {
            map = this.zzd.zzc;
            if (map.isEmpty() || !zza().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Object next;
        List list2;
        this.zzb = true;
        int i10 = this.zza + 1;
        this.zza = i10;
        list = this.zzd.zzb;
        if (i10 < list.size()) {
            list2 = this.zzd.zzb;
            next = list2.get(this.zza);
        } else {
            next = zza().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzg();
        int i10 = this.zza;
        list = this.zzd.zzb;
        if (i10 >= list.size()) {
            zza().remove();
            return;
        }
        zzalh zzalhVar = this.zzd;
        int i11 = this.zza;
        this.zza = i11 - 1;
        zzalhVar.zzc(i11);
    }
}
