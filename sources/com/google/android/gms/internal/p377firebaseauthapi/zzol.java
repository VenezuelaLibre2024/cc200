package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzol {
    private final Map<zzom, zzoe<?, ?>> zza;
    private final Map<Class<?>, zzcq<?, ?>> zzb;

    /* JADX INFO: Access modifiers changed from: private */
    public zzol(zzok zzokVar) {
        Map map;
        Map map2;
        map = zzokVar.zza;
        this.zza = new HashMap(map);
        map2 = zzokVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public /* synthetic */ zzol(zzok zzokVar, zzoo zzooVar) {
        this(zzokVar);
    }

    public static zzok zza(zzol zzolVar) {
        return new zzok(zzolVar);
    }

    public final Class<?> zza(Class<?> cls) {
        if (this.zzb.containsKey(cls)) {
            return this.zzb.get(cls).zza();
        }
        throw new GeneralSecurityException("No input primitive class for " + String.valueOf(cls) + " available");
    }

    public final <KeyT extends zzbu, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) {
        zzom zzomVar = new zzom(keyt.getClass(), cls);
        if (this.zza.containsKey(zzomVar)) {
            return (PrimitiveT) this.zza.get(zzomVar).zza(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + String.valueOf(zzomVar) + " available");
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzch<InputPrimitiveT> zzchVar, Class<WrapperPrimitiveT> cls) {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + String.valueOf(cls));
        }
        zzcq<?, ?> zzcqVar = this.zzb.get(cls);
        if (zzchVar.zzc().equals(zzcqVar.zza()) && zzcqVar.zza().equals(zzchVar.zzc())) {
            return (WrapperPrimitiveT) zzcqVar.zza(zzchVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}