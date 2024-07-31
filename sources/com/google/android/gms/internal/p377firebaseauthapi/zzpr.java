package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzpp;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzpr {
    private static final zzxr zza;
    private static final zzoa<zzpp, zzos> zzb;
    private static final zznw<zzos> zzc;
    private static final zzmx<zzpi, zzot> zzd;
    private static final zzmt<zzot> zze;

    static {
        zzxr zzb2 = zzpg.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzb2;
        zzb = zzoa.zza(zzpu.zza, zzpp.class, zzos.class);
        zzc = zznw.zza(zzpt.zza, zzb2, zzos.class);
        zzd = zzmx.zza(zzpw.zza, zzpi.class, zzot.class);
        zze = zzmt.zza(zzpv.zza, zzb2, zzot.class);
    }

    private static zzpp.zzb zza(zzvt zzvtVar) {
        int i10 = zzpy.zza[zzvtVar.ordinal()];
        if (i10 == 1) {
            return zzpp.zzb.zza;
        }
        if (i10 == 2) {
            return zzpp.zzb.zzb;
        }
        if (i10 == 3) {
            return zzpp.zzb.zzc;
        }
        if (i10 == 4) {
            return zzpp.zzb.zzd;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvtVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzvt zza(zzpp.zzb zzbVar) {
        if (zzpp.zzb.zza.equals(zzbVar)) {
            return zzvt.TINK;
        }
        if (zzpp.zzb.zzb.equals(zzbVar)) {
            return zzvt.CRUNCHY;
        }
        if (zzpp.zzb.zzd.equals(zzbVar)) {
            return zzvt.RAW;
        }
        if (zzpp.zzb.zzc.equals(zzbVar)) {
            return zzvt.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVar));
    }

    public static void zza() {
        zznv zza2 = zznv.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    public static zzpi zzb(zzot zzotVar, zzct zzctVar) {
        if (!zzotVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzry zza2 = zzry.zza(zzotVar.zzd(), zzaip.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzpi.zzb().zza(zzpp.zzd().zza(zza2.zze().zzb()).zzb(zza2.zzd().zza()).zza(zza(zzotVar.zzc())).zza()).zza(zzxt.zza(zza2.zze().zzg(), zzct.zza(zzctVar))).zza(zzotVar.zze()).zza();
        } catch (zzajj | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static zzpp zzb(zzos zzosVar) {
        if (zzosVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzrz zza2 = zzrz.zza(zzosVar.zza().zze(), zzaip.zza());
                return zzpp.zzd().zza(zza2.zza()).zzb(zza2.zzd().zza()).zza(zza(zzosVar.zza().zzd())).zza();
            } catch (zzajj e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + zzosVar.zza().zzf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzsc zzb(zzpp zzppVar) {
        return (zzsc) ((zzaja) zzsc.zzb().zza(zzppVar.zzb()).zzf());
    }
}
