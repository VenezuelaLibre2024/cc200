package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzmn;
import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzmr implements zzmn.zza {
    private final /* synthetic */ zzoq zza;
    private final /* synthetic */ zznb zzb;

    public zzmr(zzoq zzoqVar, zznb zznbVar) {
        this.zza = zzoqVar;
        this.zzb = zznbVar;
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzmn.zza
    public final zzbt<?> zza() {
        zzoq zzoqVar = this.zza;
        return new zzor(zzoqVar, this.zzb, zzoqVar.zze());
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzmn.zza
    public final <Q> zzbt<Q> zza(Class<Q> cls) {
        try {
            return new zzor(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzmn.zza
    public final Class<?> zzb() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.firebase-auth-api.zzmn.zza
    public final Set<Class<?>> zzc() {
        return this.zza.zzg();
    }
}
