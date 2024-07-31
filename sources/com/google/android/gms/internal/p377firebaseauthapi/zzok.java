package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzok {
    private final Map<zzom, zzoe<?, ?>> zza;
    private final Map<Class<?>, zzcq<?, ?>> zzb;

    private zzok() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    private zzok(zzol zzolVar) {
        this.zza = new HashMap(zzol.zzb(zzolVar));
        this.zzb = new HashMap(zzol.zzc(zzolVar));
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> zzok zza(zzcq<InputPrimitiveT, WrapperPrimitiveT> zzcqVar) {
        Objects.requireNonNull(zzcqVar, "wrapper must be non-null");
        Class<WrapperPrimitiveT> zzb = zzcqVar.zzb();
        if (this.zzb.containsKey(zzb)) {
            zzcq<?, ?> zzcqVar2 = this.zzb.get(zzb);
            if (!zzcqVar2.equals(zzcqVar) || !zzcqVar.equals(zzcqVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + String.valueOf(zzb));
            }
        } else {
            this.zzb.put(zzb, zzcqVar);
        }
        return this;
    }

    public final <KeyT extends zzbu, PrimitiveT> zzok zza(zzoe<KeyT, PrimitiveT> zzoeVar) {
        Objects.requireNonNull(zzoeVar, "primitive constructor must be non-null");
        zzom zzomVar = new zzom(zzoeVar.zza(), zzoeVar.zzb());
        if (this.zza.containsKey(zzomVar)) {
            zzoe<?, ?> zzoeVar2 = this.zza.get(zzomVar);
            if (!zzoeVar2.equals(zzoeVar) || !zzoeVar.equals(zzoeVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + String.valueOf(zzomVar));
            }
        } else {
            this.zza.put(zzomVar, zzoeVar);
        }
        return this;
    }

    public final zzol zza() {
        return new zzol(this);
    }
}
