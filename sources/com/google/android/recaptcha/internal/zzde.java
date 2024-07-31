package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p115hd.C2497j;
import p115hd.C2503o;

/* loaded from: classes.dex */
public final class zzde implements zzdd {
    public static final zzde zza = new zzde();

    private zzde() {
    }

    private static final List zzc(Object obj) {
        if (obj instanceof byte[]) {
            return C2497j.m9949J((byte[]) obj);
        }
        if (obj instanceof short[]) {
            return C2497j.m9955P((short[]) obj);
        }
        if (obj instanceof int[]) {
            return C2497j.m9952M((int[]) obj);
        }
        if (obj instanceof long[]) {
            return C2497j.m9953N((long[]) obj);
        }
        if (obj instanceof float[]) {
            return C2497j.m9951L((float[]) obj);
        }
        if (obj instanceof double[]) {
            return C2497j.m9950K((double[]) obj);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        if (zzpqVarArr.length != 2) {
            throw new zzae(4, 3, null);
        }
        Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzae(4, 5, null);
        }
        Object zza3 = zzcjVar.zzc().zza(zzpqVarArr[1]);
        if (true != (zza3 instanceof Object)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzae(4, 5, null);
        }
        zzcjVar.zzc().zzf(i10, zzb(zza2, zza3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object zzb(Object obj, Object obj2) {
        Object array;
        List zzc = zzc(obj);
        List zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                ArrayList arrayList = new ArrayList(C2503o.m9995k(zzc2, 10));
                Iterator it = zzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                array = arrayList.toArray(new Double[0]);
                return (Serializable) array;
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(C2503o.m9995k(zzc, 10));
            Iterator it2 = zzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            array = arrayList2.toArray(new Double[0]);
            return (Serializable) array;
        }
        if (zzc == null || zzc2 == null) {
            throw new zzae(4, 5, null);
        }
        zzdc.zza(this, zzc.size(), zzc2.size());
        int size = zzc.size();
        Double[] dArr = new Double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = Double.valueOf(Math.pow(((Number) zzc.get(i10)).doubleValue(), ((Number) zzc2.get(i10)).doubleValue()));
        }
        return (Serializable) dArr;
    }
}
