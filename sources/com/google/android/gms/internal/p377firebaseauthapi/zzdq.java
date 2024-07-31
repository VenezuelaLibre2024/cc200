package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzdm;
import com.google.android.gms.internal.p377firebaseauthapi.zzui;
import com.google.android.gms.internal.p377firebaseauthapi.zzux;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdq {
    private static final zzxr zza;
    private static final zzoa<zzdm, zzos> zzb;
    private static final zznw<zzos> zzc;
    private static final zzmx<zzdf, zzot> zzd;
    private static final zzmt<zzot> zze;

    static {
        zzxr zzb2 = zzpg.zzb(zzcx.zza);
        zza = zzb2;
        zzb = zzoa.zza(new zzoc() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdp
            @Override // com.google.android.gms.internal.p377firebaseauthapi.zzoc
            public final zzow zza(zzci zzciVar) {
                zzos zzb3;
                zzb3 = zzos.zzb((zzvd) ((zzaja) zzvd.zza().zza(zzcx.zza).zza(((zzsg) ((zzaja) zzsg.zza().zza((zzsk) ((zzaja) zzsk.zzb().zza((zzsl) ((zzaja) zzsl.zzb().zza(r1.zzd()).zzf())).zza(r1.zzb()).zzf())).zza((zzuf) ((zzaja) zzuf.zzc().zza(zzdq.zzb(r1)).zza(r1.zzc()).zzf())).zzf())).zzi()).zza(zzdq.zza(((zzdm) zzciVar).zzh())).zzf()));
                return zzb3;
            }
        }, zzdm.class, zzos.class);
        zzc = zznw.zza(new zzny() { // from class: com.google.android.gms.internal.firebase-auth-api.zzds
            @Override // com.google.android.gms.internal.p377firebaseauthapi.zzny
            public final zzci zza(zzow zzowVar) {
                zzdm zzb3;
                zzb3 = zzdq.zzb((zzos) zzowVar);
                return zzb3;
            }
        }, zzb2, zzos.class);
        zzd = zzmx.zza(new zzmz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdr
            @Override // com.google.android.gms.internal.p377firebaseauthapi.zzmz
            public final zzow zza(zzbu zzbuVar, zzct zzctVar) {
                zzot zza2;
                zza2 = zzot.zza(zzcx.zza, ((zzsd) ((zzaja) zzsd.zzb().zza((zzsh) ((zzaja) zzsh.zzb().zza((zzsl) ((zzaja) zzsl.zzb().zza(r1.zzc().zzd()).zzf())).zza(zzahm.zza(r1.zze().zza(zzct.zza(zzctVar)))).zzf())).zza((zzue) ((zzaja) zzue.zzb().zza(zzdq.zzb(r1.zzc())).zza(zzahm.zza(r1.zzf().zza(zzct.zza(zzctVar)))).zzf())).zzf())).zzi(), zzux.zzb.SYMMETRIC, zzdq.zza(r1.zzc().zzh()), ((zzdf) zzbuVar).zza());
                return zza2;
            }
        }, zzdf.class, zzot.class);
        zze = zzmt.zza(new zzmv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzdu
            @Override // com.google.android.gms.internal.p377firebaseauthapi.zzmv
            public final zzbu zza(zzow zzowVar, zzct zzctVar) {
                zzdf zzb3;
                zzb3 = zzdq.zzb((zzot) zzowVar, zzctVar);
                return zzb3;
            }
        }, zzb2, zzot.class);
    }

    private static zzdm.zzb zza(zzuc zzucVar) {
        int i10 = zzdt.zzb[zzucVar.ordinal()];
        if (i10 == 1) {
            return zzdm.zzb.zza;
        }
        if (i10 == 2) {
            return zzdm.zzb.zzb;
        }
        if (i10 == 3) {
            return zzdm.zzb.zzc;
        }
        if (i10 == 4) {
            return zzdm.zzb.zzd;
        }
        if (i10 == 5) {
            return zzdm.zzb.zze;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zzucVar.zza());
    }

    private static zzdm.zzc zza(zzvt zzvtVar) {
        int i10 = zzdt.zza[zzvtVar.ordinal()];
        if (i10 == 1) {
            return zzdm.zzc.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzdm.zzc.zzb;
        }
        if (i10 == 4) {
            return zzdm.zzc.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvtVar.zza());
    }

    private static zzvt zza(zzdm.zzc zzcVar) {
        if (zzdm.zzc.zza.equals(zzcVar)) {
            return zzvt.TINK;
        }
        if (zzdm.zzc.zzb.equals(zzcVar)) {
            return zzvt.CRUNCHY;
        }
        if (zzdm.zzc.zzc.equals(zzcVar)) {
            return zzvt.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzcVar));
    }

    public static void zza() {
        zznv zza2 = zznv.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdf zzb(zzot zzotVar, zzct zzctVar) {
        if (!zzotVar.zzf().equals(zzcx.zza)) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzsd zza2 = zzsd.zza(zzotVar.zzd(), zzaip.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zza2.zzd().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zza2.zze().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return zzdf.zzb().zza(zzdm.zzf().zza(zza2.zzd().zzf().zzb()).zzb(zza2.zze().zzf().zzb()).zzc(zza2.zzd().zze().zza()).zzd(zza2.zze().zze().zza()).zza(zza(zza2.zze().zze().zzb())).zza(zza(zzotVar.zzc())).zza()).zza(zzxt.zza(zza2.zzd().zzf().zzg(), zzct.zza(zzctVar))).zzb(zzxt.zza(zza2.zze().zzf().zzg(), zzct.zza(zzctVar))).zza(zzotVar.zze()).zza();
        } catch (zzajj unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdm zzb(zzos zzosVar) {
        if (!zzosVar.zza().zzf().equals(zzcx.zza)) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + zzosVar.zza().zzf());
        }
        try {
            zzsg zza2 = zzsg.zza(zzosVar.zza().zze(), zzaip.zza());
            if (zza2.zzd().zzb() == 0) {
                return zzdm.zzf().zza(zza2.zzc().zza()).zzb(zza2.zzd().zza()).zzc(zza2.zzc().zze().zza()).zzd(zza2.zzd().zzf().zza()).zza(zza(zza2.zzd().zzf().zzb())).zza(zza(zzosVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzajj e10) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
        }
    }

    private static zzui zzb(zzdm zzdmVar) {
        zzuc zzucVar;
        zzui.zza zza2 = zzui.zzc().zza(zzdmVar.zze());
        zzdm.zzb zzg = zzdmVar.zzg();
        if (zzdm.zzb.zza.equals(zzg)) {
            zzucVar = zzuc.SHA1;
        } else if (zzdm.zzb.zzb.equals(zzg)) {
            zzucVar = zzuc.SHA224;
        } else if (zzdm.zzb.zzc.equals(zzg)) {
            zzucVar = zzuc.SHA256;
        } else if (zzdm.zzb.zzd.equals(zzg)) {
            zzucVar = zzuc.SHA384;
        } else {
            if (!zzdm.zzb.zze.equals(zzg)) {
                throw new GeneralSecurityException("Unable to serialize HashType " + String.valueOf(zzg));
            }
            zzucVar = zzuc.SHA512;
        }
        return (zzui) ((zzaja) zza2.zza(zzucVar).zzf());
    }
}
