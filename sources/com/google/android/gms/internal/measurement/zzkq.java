package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzkq {
    private static final zzko zza = zzc();
    private static final zzko zzb = new zzkn();

    public static zzko zza() {
        return zza;
    }

    public static zzko zzb() {
        return zzb;
    }

    private static zzko zzc() {
        try {
            return (zzko) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
