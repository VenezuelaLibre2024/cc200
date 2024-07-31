package com.google.android.recaptcha.internal;

import java.util.Arrays;
import p115hd.C2497j;

/* loaded from: classes.dex */
public final class zzdg implements zzdd {
    public static final zzdg zza = new zzdg();

    private zzdg() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        int length = zzpqVarArr.length;
        if (length == 0) {
            throw new zzae(4, 3, null);
        }
        Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (zza2 instanceof Class)) {
            zza2 = null;
        }
        Class cls = (Class) zza2;
        if (cls == null) {
            throw new zzae(4, 5, null);
        }
        Class[] zzg = zzcjVar.zzc().zzg(C2497j.m9954O(zzpqVarArr).subList(1, length));
        try {
            zzcjVar.zzc().zzf(i10, cls.getConstructor((Class[]) Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e10) {
            throw new zzae(6, 9, e10);
        }
    }
}
