package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgy extends zzgv<Boolean> {
    public zzgy(zzhd zzhdVar, String str, Boolean bool, boolean z10) {
        super(zzhdVar, str, bool);
    }

    @Override // com.google.android.gms.internal.measurement.zzgv
    public final /* synthetic */ Boolean zza(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (zzfu.zzc.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (zzfu.zzd.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.zzb() + ": " + String.valueOf(obj));
        return null;
    }
}
