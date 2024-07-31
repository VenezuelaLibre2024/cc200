package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class zzjo extends zzjs {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzjo() {
        super(null);
    }

    public /* synthetic */ zzjo(zzjn zzjnVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j10, int i10) {
        zzjl zzjlVar;
        List list = (List) zzlv.zzf(obj, j10);
        if (list.isEmpty()) {
            List zzjlVar2 = list instanceof zzjm ? new zzjl(i10) : ((list instanceof zzkm) && (list instanceof zzjb)) ? ((zzjb) list).zzd(i10) : new ArrayList(i10);
            zzlv.zzs(obj, j10, zzjlVar2);
            return zzjlVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            zzjlVar = arrayList;
        } else {
            if (!(list instanceof zzlq)) {
                if (!(list instanceof zzkm) || !(list instanceof zzjb)) {
                    return list;
                }
                zzjb zzjbVar = (zzjb) list;
                if (zzjbVar.zzc()) {
                    return list;
                }
                zzjb zzd = zzjbVar.zzd(list.size() + i10);
                zzlv.zzs(obj, j10, zzd);
                return zzd;
            }
            zzjl zzjlVar3 = new zzjl(list.size() + i10);
            zzjlVar3.addAll(zzjlVar3.size(), (zzlq) list);
            zzjlVar = zzjlVar3;
        }
        zzlv.zzs(obj, j10, zzjlVar);
        return zzjlVar;
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final List zza(Object obj, long j10) {
        return zzf(obj, j10, 10);
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final void zzb(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzlv.zzf(obj, j10);
        if (list instanceof zzjm) {
            unmodifiableList = ((zzjm) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzkm) && (list instanceof zzjb)) {
                zzjb zzjbVar = (zzjb) list;
                if (zzjbVar.zzc()) {
                    zzjbVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzlv.zzs(obj, j10, unmodifiableList);
    }

    @Override // com.google.android.recaptcha.internal.zzjs
    public final void zzc(Object obj, Object obj2, long j10) {
        List list = (List) zzlv.zzf(obj2, j10);
        List zzf = zzf(obj, j10, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzlv.zzs(obj, j10, list);
    }
}
