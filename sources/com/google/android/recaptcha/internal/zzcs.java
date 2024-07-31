package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzcs implements zzdd {
    public static final zzcs zza = new zzcs();

    private zzcs() {
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) {
        boolean z10 = true;
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
        try {
            try {
                if (zza2 instanceof String) {
                    zza2 = zzcjVar.zzh().zza((String) zza2);
                }
                zzck zzc = zzcjVar.zzc();
                try {
                    zzci.zza(zza2);
                } catch (zzae e10) {
                    if (e10.zzb() != 8 && e10.zzb() != 6) {
                        if (e10.zzb() != 47) {
                            throw e10;
                        }
                    }
                    z10 = false;
                }
                zzc.zzf(i10, Boolean.valueOf(z10));
            } catch (Exception e11) {
                throw new zzae(6, 8, e11);
            }
        } catch (zzae e12) {
            throw e12;
        }
    }
}
