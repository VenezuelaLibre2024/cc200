package com.google.android.recaptcha.internal;

import java.util.Arrays;
import p115hd.C2497j;
import td.C4753m;

/* loaded from: classes.dex */
public final class zzdi implements zzdd {
    public static final zzdi zza = new zzdi();

    private zzdi() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        int length = zzpqVarArr.length;
        if (length < 2) {
            throw new zzae(4, 3, null);
        }
        Class<?> zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzae(4, 5, null);
        }
        Class<?> cls = zza2 instanceof Class ? zza2 : zza2.getClass();
        Object zza3 = zzcjVar.zzc().zza(zzpqVarArr[1]);
        if (true != (zza3 instanceof String)) {
            zza3 = null;
        }
        String str = (String) zza3;
        if (str == null) {
            throw new zzae(4, 5, null);
        }
        String zza4 = zzcjVar.zzh().zza(str);
        if (C4753m.m18648a(zza4, "forName")) {
            throw new zzae(6, 48, null);
        }
        Class[] zzg = zzcjVar.zzc().zzg(C2497j.m9954O(zzpqVarArr).subList(2, length));
        try {
            zzcjVar.zzc().zzf(i10, cls.getMethod(zza4, (Class[]) Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e10) {
            throw new zzae(6, 13, e10);
        }
    }
}
