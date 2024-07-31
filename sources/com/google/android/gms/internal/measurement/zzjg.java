package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjg implements zzks {
    private static final zzjg zza = new zzjg();

    private zzjg() {
    }

    public static zzjg zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzks
    public final zzkp zza(Class<?> cls) {
        if (!zzjf.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (zzkp) zzjf.zza(cls.asSubclass(zzjf.class)).zza(zzjf.zze.zzc, (Object) null, (Object) null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzks
    public final boolean zzb(Class<?> cls) {
        return zzjf.class.isAssignableFrom(cls);
    }
}
