package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzakk;

/* loaded from: classes.dex */
public abstract class zzoq<KeyProtoT extends zzakk, PublicKeyProtoT extends zzakk> extends zznb<KeyProtoT> {
    private final Class<PublicKeyProtoT> zza;

    @SafeVarargs
    public zzoq(Class<KeyProtoT> cls, Class<PublicKeyProtoT> cls2, zzoi<?, KeyProtoT>... zzoiVarArr) {
        super(cls, zzoiVarArr);
        this.zza = cls2;
    }

    public abstract PublicKeyProtoT zza(KeyProtoT keyprotot);
}
