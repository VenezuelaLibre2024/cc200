package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzjx;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzkb {
    private static final zzxr zza;
    private static final zzxr zzb;
    private static final zzoa<zzjx, zzos> zzc;
    private static final zznw<zzos> zzd;
    private static final zzmx<zzkk, zzot> zze;
    private static final zzmt<zzot> zzf;
    private static final zzmx<zzkc, zzot> zzg;
    private static final zzmt<zzot> zzh;
    private static final zzmf<zzvt, zzjx.zzf> zzi;
    private static final zzmf<zzum, zzjx.zzd> zzj;
    private static final zzmf<zzuk, zzjx.zze> zzk;
    private static final zzmf<zzuj, zzjx.zza> zzl;

    static {
        zzxr zzb2 = zzpg.zzb("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        zza = zzb2;
        zzxr zzb3 = zzpg.zzb("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        zzb = zzb3;
        zzc = zzoa.zza(zzke.zza, zzjx.class, zzos.class);
        zzd = zznw.zza(zzkd.zza, zzb2, zzos.class);
        zze = zzmx.zza(zzkg.zza, zzkk.class, zzot.class);
        zzf = zzmt.zza(zzkf.zza, zzb3, zzot.class);
        zzg = zzmx.zza(zzki.zza, zzkc.class, zzot.class);
        zzh = zzmt.zza(zzkh.zza, zzb2, zzot.class);
        zzmi zza2 = zzmf.zza().zza(zzvt.RAW, zzjx.zzf.zzc).zza(zzvt.TINK, zzjx.zzf.zza);
        zzvt zzvtVar = zzvt.LEGACY;
        zzjx.zzf zzfVar = zzjx.zzf.zzb;
        zzi = zza2.zza(zzvtVar, zzfVar).zza(zzvt.CRUNCHY, zzfVar).zza();
        zzj = zzmf.zza().zza(zzum.DHKEM_P256_HKDF_SHA256, zzjx.zzd.zza).zza(zzum.DHKEM_P384_HKDF_SHA384, zzjx.zzd.zzb).zza(zzum.DHKEM_P521_HKDF_SHA512, zzjx.zzd.zzc).zza(zzum.DHKEM_X25519_HKDF_SHA256, zzjx.zzd.zzd).zza();
        zzk = zzmf.zza().zza(zzuk.HKDF_SHA256, zzjx.zze.zza).zza(zzuk.HKDF_SHA384, zzjx.zze.zzb).zza(zzuk.HKDF_SHA512, zzjx.zze.zzc).zza();
        zzl = zzmf.zza().zza(zzuj.AES_128_GCM, zzjx.zza.zza).zza(zzuj.AES_256_GCM, zzjx.zza.zzb).zza(zzuj.CHACHA20_POLY1305, zzjx.zza.zzc).zza();
    }

    private static zzjx zza(zzvt zzvtVar, zzus zzusVar) {
        return zzjx.zzc().zza(zzi.zza((zzmf<zzvt, zzjx.zzf>) zzvtVar)).zza(zzj.zza((zzmf<zzum, zzjx.zzd>) zzusVar.zzc())).zza(zzk.zza((zzmf<zzuk, zzjx.zze>) zzusVar.zzb())).zza(zzl.zza((zzmf<zzuj, zzjx.zza>) zzusVar.zza())).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzuw zza(zzkk zzkkVar) {
        return (zzuw) ((zzaja) zzuw.zzc().zza(0).zza(zzb(zzkkVar.zzb())).zza(zzahm.zza(zzkkVar.zzc().zzb())).zzf());
    }

    private static zzxr zza(zzum zzumVar, byte[] bArr) {
        return zzxr.zza(zzmb.zza(zzmb.zza(bArr), zzlq.zzb(zzumVar)));
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

    public static zzjx zzb(zzos zzosVar) {
        if (zzosVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            try {
                return zza(zzosVar.zza().zzd(), zzuo.zza(zzosVar.zza().zze(), zzaip.zza()).zzc());
            } catch (zzajj e10) {
                throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: " + zzosVar.zza().zzf());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzus zzb(zzjx zzjxVar) {
        return (zzus) ((zzaja) zzus.zzd().zza(zzj.zza((zzmf<zzum, zzjx.zzd>) zzjxVar.zze())).zza(zzk.zza((zzmf<zzuk, zzjx.zze>) zzjxVar.zzd())).zza(zzl.zza((zzmf<zzuj, zzjx.zza>) zzjxVar.zzb())).zzf());
    }

    public static zzkc zzc(zzot zzotVar, zzct zzctVar) {
        if (!zzotVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: " + zzotVar.zzf());
        }
        try {
            zzut zza2 = zzut.zza(zzotVar.zzd(), zzaip.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzuw zzd2 = zza2.zzd();
            return zzkc.zza(zzkk.zza(zza(zzotVar.zzc(), zzd2.zzb()), zza(zzd2.zzb().zzc(), zzd2.zzf().zzg()), zzotVar.zze()), zzxt.zza(zzmb.zza(zzmb.zza(zza2.zze().zzg()), zzlq.zza(zzd2.zzb().zzc())), zzct.zza(zzctVar)));
        } catch (zzajj unused) {
            throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
        }
    }

    public static zzkk zzd(zzot zzotVar, zzct zzctVar) {
        if (!zzotVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: " + zzotVar.zzf());
        }
        try {
            zzuw zza2 = zzuw.zza(zzotVar.zzd(), zzaip.zza());
            if (zza2.zza() == 0) {
                return zzkk.zza(zza(zzotVar.zzc(), zza2.zzb()), zza(zza2.zzb().zzc(), zza2.zzf().zzg()), zzotVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzajj unused) {
            throw new GeneralSecurityException("Parsing HpkePublicKey failed");
        }
    }
}
