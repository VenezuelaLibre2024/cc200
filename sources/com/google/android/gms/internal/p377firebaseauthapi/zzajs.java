package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzajs extends zzajt {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: private */
    public zzajs() {
        super();
    }

    public /* synthetic */ zzajs(zzajv zzajvVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j10, int i10) {
        List<L> zza2;
        zzajr zzajrVar;
        List<L> zzc = zzc(obj, j10);
        if (!zzc.isEmpty()) {
            if (zza.isAssignableFrom(zzc.getClass())) {
                ArrayList arrayList = new ArrayList(zzc.size() + i10);
                arrayList.addAll(zzc);
                zzajrVar = arrayList;
            } else if (zzc instanceof zzamg) {
                zzajr zzajrVar2 = new zzajr(zzc.size() + i10);
                zzajrVar2.addAll((zzamg) zzc);
                zzajrVar = zzajrVar2;
            } else {
                if (!(zzc instanceof zzakw) || !(zzc instanceof zzajg)) {
                    return zzc;
                }
                zzajg zzajgVar = (zzajg) zzc;
                if (zzajgVar.zzc()) {
                    return zzc;
                }
                zza2 = zzajgVar.zza(zzc.size() + i10);
            }
            zzamh.zza(obj, j10, zzajrVar);
            return zzajrVar;
        }
        zza2 = zzc instanceof zzajq ? new zzajr(i10) : ((zzc instanceof zzakw) && (zzc instanceof zzajg)) ? ((zzajg) zzc).zza(i10) : new ArrayList<>(i10);
        zzamh.zza(obj, j10, zza2);
        return zza2;
    }

    private static <E> List<E> zzc(Object obj, long j10) {
        return (List) zzamh.zze(obj, j10);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzajt
    public final <L> List<L> zza(Object obj, long j10) {
        return zza(obj, j10, 10);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzajt
    public final <E> void zza(Object obj, Object obj2, long j10) {
        List zzc = zzc(obj2, j10);
        List zza2 = zza(obj, j10, zzc.size());
        int size = zza2.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza2.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza2;
        }
        zzamh.zza(obj, j10, zzc);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzajt
    public final void zzb(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzamh.zze(obj, j10);
        if (list instanceof zzajq) {
            unmodifiableList = ((zzajq) list).mo5025a_();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzakw) && (list instanceof zzajg)) {
                zzajg zzajgVar = (zzajg) list;
                if (zzajgVar.zzc()) {
                    zzajgVar.mo5024b_();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzamh.zza(obj, j10, unmodifiableList);
    }
}
