package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzls implements zzlg {
    private final zzwq zza;
    private final zzkx zzb;

    private zzls(zzkx zzkxVar, zzwq zzwqVar) {
        this.zzb = zzkxVar;
        this.zza = zzwqVar;
    }

    public static zzls zza(zzwq zzwqVar) {
        int i10 = zzlr.zza[zzwqVar.ordinal()];
        if (i10 == 1) {
            return new zzls(new zzkx("HmacSha256"), zzwq.NIST_P256);
        }
        if (i10 == 2) {
            return new zzls(new zzkx("HmacSha384"), zzwq.NIST_P384);
        }
        if (i10 == 3) {
            return new zzls(new zzkx("HmacSha512"), zzwq.NIST_P521);
        }
        throw new GeneralSecurityException("invalid curve type: " + String.valueOf(zzwqVar));
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzlg
    public final byte[] zza() {
        int i10 = zzlr.zza[this.zza.ordinal()];
        if (i10 == 1) {
            return zzlq.zzc;
        }
        if (i10 == 2) {
            return zzlq.zzd;
        }
        if (i10 == 3) {
            return zzlq.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzlg
    public final byte[] zza(byte[] bArr, zzli zzliVar) {
        byte[] zza = zzwn.zza(zzwn.zza(this.zza, zzliVar.zza().zzb()), zzwn.zza(this.zza, zzwp.UNCOMPRESSED, bArr));
        byte[] zza2 = zzwi.zza(bArr, zzliVar.zzb().zzb());
        byte[] zza3 = zzlq.zza(zza());
        zzkx zzkxVar = this.zzb;
        return zzkxVar.zza(null, zza, "eae_prk", zza2, "shared_secret", zza3, zzkxVar.zza());
    }
}
