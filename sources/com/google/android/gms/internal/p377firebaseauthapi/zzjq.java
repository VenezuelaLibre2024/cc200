package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzjl;
import com.google.android.gms.internal.p377firebaseauthapi.zzts;
import com.google.android.gms.internal.p377firebaseauthapi.zztt;
import com.google.android.gms.internal.p377firebaseauthapi.zztw;
import com.google.android.gms.internal.p377firebaseauthapi.zzux;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjq {
    private static final zzxr zza;
    private static final zzxr zzb;
    private static final zzoa<zzjl, zzos> zzc;
    private static final zznw<zzos> zzd;
    private static final zzmx<zzjv, zzot> zze;
    private static final zzmt<zzot> zzf;
    private static final zzmx<zzjn, zzot> zzg;
    private static final zzmt<zzot> zzh;
    private static final zzmf<zzvt, zzjl.zzd> zzi;
    private static final zzmf<zzuc, zzjl.zzb> zzj;
    private static final zzmf<zztx, zzjl.zzc> zzk;
    private static final zzmf<zztj, zzjl.zze> zzl;

    static {
        zzxr zzb2 = zzpg.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza = zzb2;
        zzxr zzb3 = zzpg.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        zzb = zzb3;
        zzc = zzoa.zza(zzjp.zza, zzjl.class, zzos.class);
        zzd = zznw.zza(zzjs.zza, zzb2, zzos.class);
        zze = zzmx.zza(zzjr.zza, zzjv.class, zzot.class);
        zzf = zzmt.zza(zzju.zza, zzb3, zzot.class);
        zzg = zzmx.zza(zzjt.zza, zzjn.class, zzot.class);
        zzh = zzmt.zza(zzjw.zza, zzb2, zzot.class);
        zzmi zza2 = zzmf.zza().zza(zzvt.RAW, zzjl.zzd.zzc).zza(zzvt.TINK, zzjl.zzd.zza);
        zzvt zzvtVar = zzvt.LEGACY;
        zzjl.zzd zzdVar = zzjl.zzd.zzb;
        zzi = zza2.zza(zzvtVar, zzdVar).zza(zzvt.CRUNCHY, zzdVar).zza();
        zzj = zzmf.zza().zza(zzuc.SHA1, zzjl.zzb.zza).zza(zzuc.SHA224, zzjl.zzb.zzb).zza(zzuc.SHA256, zzjl.zzb.zzc).zza(zzuc.SHA384, zzjl.zzb.zzd).zza(zzuc.SHA512, zzjl.zzb.zze).zza();
        zzk = zzmf.zza().zza(zztx.NIST_P256, zzjl.zzc.zza).zza(zztx.NIST_P384, zzjl.zzc.zzb).zza(zztx.NIST_P521, zzjl.zzc.zzc).zza(zztx.CURVE25519, zzjl.zzc.zzd).zza();
        zzl = zzmf.zza().zza(zztj.UNCOMPRESSED, zzjl.zze.zzb).zza(zztj.COMPRESSED, zzjl.zze.zza).zza(zztj.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzjl.zze.zzc).zza();
    }

    private static int zza(zzjl.zzc zzcVar) {
        if (zzjl.zzc.zza.equals(zzcVar)) {
            return 33;
        }
        if (zzjl.zzc.zzb.equals(zzcVar)) {
            return 49;
        }
        if (zzjl.zzc.zzc.equals(zzcVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + String.valueOf(zzcVar));
    }

    private static zzjl zza(zzvt zzvtVar, zztp zztpVar) {
        zzjl.zza zza2 = zzjl.zzc().zza(zzi.zza((zzmf<zzvt, zzjl.zzd>) zzvtVar)).zza(zzk.zza((zzmf<zztx, zzjl.zzc>) zztpVar.zzf().zzd())).zza(zzj.zza((zzmf<zzuc, zzjl.zzb>) zztpVar.zzf().zze())).zza(zzcv.zza(((zzvd) ((zzaja) zzvd.zza().zza(zztpVar.zzb().zzd().zzf()).zza(zzvt.RAW).zza(zztpVar.zzb().zzd().zze()).zzf())).zzj())).zza(zzxr.zza(zztpVar.zzf().zzf().zzg()));
        if (!zztpVar.zzf().zzd().equals(zztx.CURVE25519)) {
            zza2.zza(zzl.zza((zzmf<zztj, zzjl.zze>) zztpVar.zza()));
        } else if (!zztpVar.zza().equals(zztj.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return zza2.zza();
    }

    public static /* synthetic */ zzot zza(zzjn zzjnVar, zzct zzctVar) {
        zzahm zza2;
        zzts.zza zza3 = zzts.zzb().zza(0).zza(zza((zzjv) zzjnVar.zzc()));
        if (zzjnVar.zzb().zzd().equals(zzjl.zzc.zzd)) {
            zza2 = zzahm.zza(zzjnVar.zze().zza(zzct.zza(zzctVar)));
        } else {
            zza2 = zzahm.zza(zzmb.zza(zzjnVar.zzd().zza(zzct.zza(zzctVar)), zza(zzjnVar.zzb().zzd())));
        }
        zza3.zza(zza2);
        return zzot.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((zzts) ((zzaja) zza3.zzf())).zzi(), zzux.zzb.ASYMMETRIC_PRIVATE, zzi.zza((zzmf<zzvt, zzjl.zzd>) zzjnVar.zzb().zzg()), zzjnVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zztt zza(zzjv zzjvVar) {
        zztt.zza zza2;
        zzahm zza3;
        if (zzjvVar.zzb().zzd().equals(zzjl.zzc.zzd)) {
            zza2 = zztt.zzc().zza(0).zza(zzb(zzjvVar.zzb())).zza(zzahm.zza(zzjvVar.zzc().zzb()));
            zza3 = zzahm.zza;
        } else {
            int zza4 = zza(zzjvVar.zzb().zzd());
            ECPoint zzd2 = zzjvVar.zzd();
            if (zzd2 == null) {
                throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
            }
            zza2 = zztt.zzc().zza(0).zza(zzb(zzjvVar.zzb())).zza(zzahm.zza(zzmb.zza(zzd2.getAffineX(), zza4)));
            zza3 = zzahm.zza(zzmb.zza(zzd2.getAffineY(), zza4));
        }
        return (zztt) ((zzaja) zza2.zzb(zza3).zzf());
    }

    public static void zza() {
        zznv zza2 = zznv.zza();
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
        zza2.zza(zzh);
    }

    public static zzjl zzb(zzos zzosVar) {
        if (zzosVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            try {
                return zza(zzosVar.zza().zzd(), zzto.zza(zzosVar.zza().zze(), zzaip.zza()).zzc());
            } catch (zzajj e10) {
                throw new GeneralSecurityException("Parsing EciesParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: " + zzosVar.zza().zzf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zztp zzb(zzjl zzjlVar) {
        zztw.zza zza2 = zztw.zza().zza(zzk.zza((zzmf<zztx, zzjl.zzc>) zzjlVar.zzd())).zza(zzj.zza((zzmf<zzuc, zzjl.zzb>) zzjlVar.zze()));
        if (zzjlVar.zzh() != null && zzjlVar.zzh().zza() > 0) {
            zza2.zza(zzahm.zza(zzjlVar.zzh().zzb()));
        }
        zztw zztwVar = (zztw) ((zzaja) zza2.zzf());
        try {
            zzvd zza3 = zzvd.zza(zzcv.zza(zzjlVar.zzb()), zzaip.zza());
            zztk zztkVar = (zztk) ((zzaja) zztk.zza().zza((zzvd) ((zzaja) zzvd.zza().zza(zza3.zzf()).zza(zzvt.TINK).zza(zza3.zze()).zzf())).zzf());
            zzjl.zze zzf2 = zzjlVar.zzf();
            if (zzf2 == null) {
                zzf2 = zzjl.zze.zza;
            }
            return (zztp) ((zzaja) zztp.zzc().zza(zztwVar).zza(zztkVar).zza(zzl.zza((zzmf<zztj, zzjl.zze>) zzf2)).zzf());
        } catch (zzajj e10) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e10);
        }
    }

    public static zzjn zzc(zzot zzotVar, zzct zzctVar) {
        if (!zzotVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: " + zzotVar.zzf());
        }
        try {
            zzts zza2 = zzts.zza(zzotVar.zzd(), zzaip.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zztt zzd2 = zza2.zzd();
            zzjl zza3 = zza(zzotVar.zzc(), zzd2.zzb());
            return zza3.zzd().equals(zzjl.zzc.zzd) ? zzjn.zza(zzjv.zza(zza3, zzxr.zza(zzd2.zzf().zzg()), zzotVar.zze()), zzxt.zza(zza2.zze().zzg(), zzct.zza(zzctVar))) : zzjn.zza(zzjv.zza(zza3, new ECPoint(zzmb.zza(zzd2.zzf().zzg()), zzmb.zza(zzd2.zzg().zzg())), zzotVar.zze()), zzxu.zza(zzmb.zza(zza2.zze().zzg()), zzct.zza(zzctVar)));
        } catch (zzajj | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    public static zzjv zzd(zzot zzotVar, zzct zzctVar) {
        if (!zzotVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: " + zzotVar.zzf());
        }
        try {
            zztt zza2 = zztt.zza(zzotVar.zzd(), zzaip.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzjl zza3 = zza(zzotVar.zzc(), zza2.zzb());
            if (!zza3.zzd().equals(zzjl.zzc.zzd)) {
                return zzjv.zza(zza3, new ECPoint(zzmb.zza(zza2.zzf().zzg()), zzmb.zza(zza2.zzg().zzg())), zzotVar.zze());
            }
            if (zza2.zzg().zze()) {
                return zzjv.zza(zza3, zzxr.zza(zza2.zzf().zzg()), zzotVar.zze());
            }
            throw new GeneralSecurityException("Y must be empty for X25519 points");
        } catch (zzajj | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }
}
