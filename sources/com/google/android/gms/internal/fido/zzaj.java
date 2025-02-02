package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzaj {
    private final String zza;
    private final zzah zzb;
    private zzah zzc;

    public /* synthetic */ zzaj(String str, zzai zzaiVar) {
        zzah zzahVar = new zzah(null);
        this.zzb = zzahVar;
        this.zzc = zzahVar;
        Objects.requireNonNull(str);
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzah zzahVar = this.zzb.zzc;
        String str = "";
        while (zzahVar != null) {
            Object obj = zzahVar.zzb;
            boolean z10 = zzahVar instanceof zzaf;
            sb2.append(str);
            String str2 = zzahVar.zza;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            zzahVar = zzahVar.zzc;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzaj zza(String str, int i10) {
        String valueOf = String.valueOf(i10);
        zzaf zzafVar = new zzaf(null);
        this.zzc.zzc = zzafVar;
        this.zzc = zzafVar;
        zzafVar.zzb = valueOf;
        zzafVar.zza = "errorCode";
        return this;
    }

    public final zzaj zzb(String str, Object obj) {
        zzah zzahVar = new zzah(null);
        this.zzc.zzc = zzahVar;
        this.zzc = zzahVar;
        zzahVar.zzb = obj;
        zzahVar.zza = str;
        return this;
    }
}
