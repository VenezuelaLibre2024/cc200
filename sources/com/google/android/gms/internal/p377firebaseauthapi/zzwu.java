package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzwu<JcePrimitiveT> implements zzxa<JcePrimitiveT> {
    private final zzwz<JcePrimitiveT> zza;

    private zzwu(zzwz<JcePrimitiveT> zzwzVar) {
        this.zza = zzwzVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzxa
    public final JcePrimitiveT zza(String str) {
        Iterator<Provider> it = zzwr.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        return this.zza.zza(str, null);
    }
}
