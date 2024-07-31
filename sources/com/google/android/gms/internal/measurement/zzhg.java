package com.google.android.gms.internal.measurement;

import p109h7.C2432o;

/* loaded from: classes.dex */
public final class zzhg {
    private final boolean zza;

    public zzhg(zzhj zzhjVar) {
        C2432o.m9705k(zzhjVar, "BuildInfo must be non-null");
        this.zza = !zzhjVar.zza();
    }

    public final boolean zza(String str) {
        C2432o.m9705k(str, "flagName must not be null");
        if (this.zza) {
            return zzhi.zza.get().mo10595b(str);
        }
        return true;
    }
}
