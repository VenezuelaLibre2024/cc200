package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class zzqi extends zzoi<zzcf, zzue> {
    public zzqi(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzoi
    public final /* synthetic */ zzcf zza(zzue zzueVar) {
        zzue zzueVar2 = zzueVar;
        zzuc zzb = zzueVar2.zze().zzb();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzueVar2.zzf().zzg(), "HMAC");
        int zza = zzueVar2.zze().zza();
        int i10 = zzqk.zza[zzb.ordinal()];
        if (i10 == 1) {
            return new zzxo(new zzxm("HMACSHA1", secretKeySpec), zza);
        }
        if (i10 == 2) {
            return new zzxo(new zzxm("HMACSHA224", secretKeySpec), zza);
        }
        if (i10 == 3) {
            return new zzxo(new zzxm("HMACSHA256", secretKeySpec), zza);
        }
        if (i10 == 4) {
            return new zzxo(new zzxm("HMACSHA384", secretKeySpec), zza);
        }
        if (i10 == 5) {
            return new zzxo(new zzxm("HMACSHA512", secretKeySpec), zza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
