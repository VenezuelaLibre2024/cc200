package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzqm;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzrg {
    private static final zzxr zza;
    private static final zzmf<zzvt, zzqm.zzc> zzb;
    private static final zzmf<zzuc, zzqm.zzb> zzc;
    private static final zzoa<zzqm, zzos> zzd;
    private static final zznw<zzos> zze;
    private static final zzmx<zzqb, zzot> zzf;
    private static final zzmt<zzot> zzg;

    static {
        zzxr zzb2 = zzpg.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zza = zzb2;
        zzb = zzmf.zza().zza(zzvt.RAW, zzqm.zzc.zzd).zza(zzvt.TINK, zzqm.zzc.zza).zza(zzvt.LEGACY, zzqm.zzc.zzc).zza(zzvt.CRUNCHY, zzqm.zzc.zzb).zza();
        zzc = zzmf.zza().zza(zzuc.SHA1, zzqm.zzb.zza).zza(zzuc.SHA224, zzqm.zzb.zzb).zza(zzuc.SHA256, zzqm.zzb.zzc).zza(zzuc.SHA384, zzqm.zzb.zzd).zza(zzuc.SHA512, zzqm.zzb.zze).zza();
        zzd = zzoa.zza(zzrf.zza, zzqm.class, zzos.class);
        zze = zznw.zza(zzri.zza, zzb2, zzos.class);
        zzf = zzmx.zza(zzrh.zza, zzqb.class, zzot.class);
        zzg = zzmt.zza(zzrk.zza, zzb2, zzot.class);
    }

    public static void zza() {
        zznv zza2 = zznv.zza();
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
    }

    public static zzqb zzb(zzot zzotVar, zzct zzctVar) {
        if (!zzotVar.zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzue zza2 = zzue.zza(zzotVar.zzd(), zzaip.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzqb.zzb().zza(zzqm.zzd().zza(zza2.zzf().zzb()).zzb(zza2.zze().zza()).zza(zzc.zza((zzmf<zzuc, zzqm.zzb>) zza2.zze().zzb())).zza(zzb.zza((zzmf<zzvt, zzqm.zzc>) zzotVar.zzc())).zza()).zza(zzxt.zza(zza2.zzf().zzg(), zzct.zza(zzctVar))).zza(zzotVar.zze()).zza();
        } catch (zzajj | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static zzqm zzb(zzos zzosVar) {
        if (!zzosVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + zzosVar.zza().zzf());
        }
        try {
            zzuf zza2 = zzuf.zza(zzosVar.zza().zze(), zzaip.zza());
            if (zza2.zzb() == 0) {
                return zzqm.zzd().zza(zza2.zza()).zzb(zza2.zzf().zza()).zza(zzc.zza((zzmf<zzuc, zzqm.zzb>) zza2.zzf().zzb())).zza(zzb.zza((zzmf<zzvt, zzqm.zzc>) zzosVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zza2.zzb());
        } catch (zzajj e10) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzui zzb(zzqm zzqmVar) {
        return (zzui) ((zzaja) zzui.zzc().zza(zzqmVar.zzb()).zza(zzc.zza((zzmf<zzuc, zzqm.zzb>) zzqmVar.zze())).zzf());
    }
}
