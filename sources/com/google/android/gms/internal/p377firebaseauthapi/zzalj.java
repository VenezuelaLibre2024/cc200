package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzalj implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzalh zzc;

    private zzalj(zzalh zzalhVar) {
        List list;
        this.zzc = zzalhVar;
        list = zzalhVar.zzb;
        this.zza = list.size();
    }

    private final Iterator zza() {
        Map map;
        if (this.zzb == null) {
            map = this.zzc.zzf;
            this.zzb = map.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i10 = this.zza;
        if (i10 > 0) {
            list = this.zzc.zzb;
            if (i10 <= list.size()) {
                return true;
            }
        }
        return zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Object obj;
        if (zza().hasNext()) {
            obj = zza().next();
        } else {
            list = this.zzc.zzb;
            int i10 = this.zza - 1;
            this.zza = i10;
            obj = list.get(i10);
        }
        return (Map.Entry) obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
