package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzci;
import com.google.android.gms.internal.p377firebaseauthapi.zzow;

/* loaded from: classes.dex */
public abstract class zzoa<ParametersT extends zzci, SerializationT extends zzow> {
    private final Class<ParametersT> zza;
    private final Class<SerializationT> zzb;

    private zzoa(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static <ParametersT extends zzci, SerializationT extends zzow> zzoa<ParametersT, SerializationT> zza(zzoc<ParametersT, SerializationT> zzocVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new zzod(cls, cls2, zzocVar);
    }

    public abstract SerializationT zza(ParametersT parameterst);

    public final Class<ParametersT> zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }
}
