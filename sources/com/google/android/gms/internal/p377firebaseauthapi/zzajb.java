package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzaja;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzajb implements zzakl {
    private static final zzajb zza = new zzajb();

    private zzajb() {
    }

    public static zzajb zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakl
    public final zzaki zza(Class<?> cls) {
        if (!zzaja.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (zzaki) zzaja.zza(cls.asSubclass(zzaja.class)).zza(zzaja.zze.zzc, (Object) null, (Object) null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzakl
    public final boolean zzb(Class<?> cls) {
        return zzaja.class.isAssignableFrom(cls);
    }
}
