package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzft {
    private static zzfw zza;

    public static synchronized zzfw zza() {
        zzfw zzfwVar;
        synchronized (zzft.class) {
            if (zza == null) {
                zza(new zzfv());
            }
            zzfwVar = zza;
        }
        return zzfwVar;
    }

    private static synchronized void zza(zzfw zzfwVar) {
        synchronized (zzft.class) {
            if (zza != null) {
                throw new IllegalStateException("init() already called");
            }
            zza = zzfwVar;
        }
    }
}
