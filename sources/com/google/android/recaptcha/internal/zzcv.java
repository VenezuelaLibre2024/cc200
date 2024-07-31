package com.google.android.recaptcha.internal;

import ae.C0097c;
import java.util.Collection;
import p115hd.C2497j;
import p115hd.C2510v;

/* loaded from: classes.dex */
public final class zzcv implements zzdd {
    public static final zzcv zza = new zzcv();

    private zzcv() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        String m10025x;
        String str;
        if (zzpqVarArr.length != 1) {
            throw new zzae(4, 3, null);
        }
        Object zza2 = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzae(4, 5, null);
        }
        if (zza2 instanceof int[]) {
            m10025x = C2497j.m9943D((int[]) zza2, ",", "[", "]", 0, null, null, 56, null);
        } else {
            if (zza2 instanceof byte[]) {
                str = new String((byte[]) zza2, C0097c.f330b);
            } else if (zza2 instanceof long[]) {
                m10025x = C2497j.m9944E((long[]) zza2, ",", "[", "]", 0, null, null, 56, null);
            } else if (zza2 instanceof short[]) {
                m10025x = C2497j.m9946G((short[]) zza2, ",", "[", "]", 0, null, null, 56, null);
            } else if (zza2 instanceof float[]) {
                m10025x = C2497j.m9942C((float[]) zza2, ",", "[", "]", 0, null, null, 56, null);
            } else if (zza2 instanceof double[]) {
                m10025x = C2497j.m9941B((double[]) zza2, ",", "[", "]", 0, null, null, 56, null);
            } else if (zza2 instanceof char[]) {
                str = new String((char[]) zza2);
            } else if (zza2 instanceof Object[]) {
                m10025x = C2497j.m9945F((Object[]) zza2, ",", "[", "]", 0, null, null, 56, null);
            } else {
                if (!(zza2 instanceof Collection)) {
                    throw new zzae(4, 5, null);
                }
                m10025x = C2510v.m10025x((Iterable) zza2, ",", "[", "]", 0, null, null, 56, null);
            }
            m10025x = str;
        }
        zzcjVar.zzc().zzf(i10, m10025x);
    }
}
