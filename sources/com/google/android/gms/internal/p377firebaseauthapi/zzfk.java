package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzfo;
import com.google.android.gms.internal.p377firebaseauthapi.zzux;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzfk {
    private static final zzoe<zzfl, zzbh> zza = zzoe.zza(new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfn
        @Override // com.google.android.gms.internal.p377firebaseauthapi.zzog
        public final Object zza(zzbu zzbuVar) {
            return zzwh.zza((zzfl) zzbuVar);
        }
    }, zzfl.class, zzbh.class);
    private static final zznn<zzfo> zzb = new zznn() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfm
        @Override // com.google.android.gms.internal.p377firebaseauthapi.zznn
        public final zzbu zza(zzci zzciVar, Integer num) {
            return zzfk.zza((zzfo) zzciVar, null);
        }
    };
    private static final zzbt<zzbh> zzc = zznd.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzbh.class, zzux.zzb.SYMMETRIC, zztf.zze());

    public static zzfl zza(zzfo zzfoVar, Integer num) {
        return zzfl.zza(zzfoVar.zzb(), zzxt.zza(32), num);
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public static void zza(boolean z10) {
        zzfq.zza();
        zzns.zza().zza(zza);
        zznk.zza().zza(zzb, zzfo.class);
        zznt zza2 = zznt.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", zzfo.zza(zzfo.zza.zza));
        hashMap.put("CHACHA20_POLY1305_RAW", zzfo.zza(zzfo.zza.zzc));
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zzcu.zza((zzbt) zzc, true);
    }
}
