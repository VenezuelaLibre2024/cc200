package com.google.android.gms.internal.p377firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzmi<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    /* JADX INFO: Access modifiers changed from: private */
    public zzmi() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public /* synthetic */ zzmi(zzmh zzmhVar) {
        this();
    }

    public final zzmf<E, O> zza() {
        return new zzmf<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb));
    }

    public final zzmi<E, O> zza(E e10, O o10) {
        this.zza.put(e10, o10);
        this.zzb.put(o10, e10);
        return this;
    }
}
