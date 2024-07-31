package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zziq;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzjb {
    private static final zzxr zza;
    private static final zzoa<zziq, zzos> zzb;
    private static final zznw<zzos> zzc;
    private static final zzmx<zzij, zzot> zzd;
    private static final zzmt<zzot> zze;
    private static final Map<zziq.zzb, zzvt> zzf;
    private static final Map<zzvt, zziq.zzb> zzg;

    static {
        zzxr zzb2 = zzpg.zzb(zzis.zza);
        zza = zzb2;
        zzb = zzoa.zza(zzja.zza, zziq.class, zzos.class);
        zzc = zznw.zza(zzjd.zza, zzb2, zzos.class);
        zzd = zzmx.zza(zzjc.zza, zzij.class, zzot.class);
        zze = zzmt.zza(zzjf.zza, zzb2, zzot.class);
        HashMap hashMap = new HashMap();
        zziq.zzb zzbVar = zziq.zzb.zzc;
        zzvt zzvtVar = zzvt.RAW;
        hashMap.put(zzbVar, zzvtVar);
        zziq.zzb zzbVar2 = zziq.zzb.zza;
        zzvt zzvtVar2 = zzvt.TINK;
        hashMap.put(zzbVar2, zzvtVar2);
        zziq.zzb zzbVar3 = zziq.zzb.zzb;
        zzvt zzvtVar3 = zzvt.CRUNCHY;
        hashMap.put(zzbVar3, zzvtVar3);
        zzf = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(zzvt.class);
        enumMap.put((EnumMap) zzvtVar, (zzvt) zzbVar);
        enumMap.put((EnumMap) zzvtVar2, (zzvt) zzbVar2);
        enumMap.put((EnumMap) zzvtVar3, (zzvt) zzbVar3);
        enumMap.put((EnumMap) zzvt.LEGACY, (zzvt) zzbVar3);
        zzg = Collections.unmodifiableMap(enumMap);
    }

    private static zziq.zzb zza(zzvt zzvtVar) {
        Map<zzvt, zziq.zzb> map = zzg;
        if (map.containsKey(zzvtVar)) {
            return map.get(zzvtVar);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzvtVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzvt zza(zziq.zzb zzbVar) {
        Map<zziq.zzb, zzvt> map = zzf;
        if (map.containsKey(zzbVar)) {
            return map.get(zzbVar);
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

    public static zzij zzb(zzot zzotVar, zzct zzctVar) {
        if (!zzotVar.zzf().equals(zzis.zza)) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            zztb zza2 = zztb.zza(zzotVar.zzd(), zzaip.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzij.zzb().zza(zziq.zzc().zza(zza2.zzd().zzb()).zza(zza(zzotVar.zzc())).zza()).zza(zzxt.zza(zza2.zzd().zzg(), zzct.zza(zzctVar))).zza(zzotVar.zze()).zza();
        } catch (zzajj unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }

    public static zziq zzb(zzos zzosVar) {
        if (!zzosVar.zza().zzf().equals(zzis.zza)) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + zzosVar.zza().zzf());
        }
        try {
            zzte zza2 = zzte.zza(zzosVar.zza().zze(), zzaip.zza());
            if (zza2.zzb() == 0) {
                return zziq.zzc().zza(zza2.zza()).zza(zza(zzosVar.zza().zzd())).zza();
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzajj e10) {
            throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e10);
        }
    }
}
