package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzhd;
import com.google.android.gms.internal.p377firebaseauthapi.zzux;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzgz {
    private static final zzoe<zzha, zzbh> zza = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhc
        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzog
        public final Object zza(zzbu zzbuVar) {
            return zzxs.zza((zzha) zzbuVar);
        }
    }, zzha.class, zzbh.class);
    private static final zzbt<zzbh> zzb = zznd.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzbh.class, zzux.zzb.SYMMETRIC, zzvw.zze());
    private static final zznp<zzhd> zzc = new zznp() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhb
    };
    private static final zznn<zzhd> zzd = new zznn() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhe
        @Override // com.google.android.gms.internal.p377firebaseauthapi.zznn
        public final zzbu zza(zzci zzciVar, Integer num) {
            return zzgz.zza((zzhd) zzciVar, null);
        }
    };

    public static zzha zza(zzhd zzhdVar, Integer num) {
        return zzha.zza(zzhdVar.zzb(), zzxt.zza(32), num);
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static void zza(boolean z10) {
        zzhu.zza();
        zzns.zza().zza(zza);
        zznt zza2 = zznt.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", zzhd.zza(zzhd.zza.zza));
        hashMap.put("XCHACHA20_POLY1305_RAW", zzhd.zza(zzhd.zza.zzc));
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zznk.zza().zza(zzd, zzhd.class);
        zznm.zza().zza(zzc, zzhd.class);
        zzcu.zza((zzbt) zzb, true);
    }
}
