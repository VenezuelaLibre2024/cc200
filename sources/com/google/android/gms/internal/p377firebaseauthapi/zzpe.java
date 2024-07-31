package com.google.android.gms.internal.p377firebaseauthapi;

/* loaded from: classes.dex */
public final class zzpe extends RuntimeException {
    public zzpe(String str) {
        super(str);
    }

    public zzpe(String str, Throwable th) {
        super(str, th);
    }

    private zzpe(Throwable th) {
        super(th);
    }

    public static <T> T zza(zzph<T> zzphVar) {
        try {
            return zzphVar.zza();
        } catch (Exception e10) {
            throw new zzpe(e10);
        }
    }
}
