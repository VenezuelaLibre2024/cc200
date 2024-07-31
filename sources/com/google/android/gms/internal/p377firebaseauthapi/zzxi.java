package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.Provider;
import java.security.Signature;

/* loaded from: classes.dex */
public final class zzxi implements zzwz<Signature> {
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzwz
    public final /* synthetic */ Signature zza(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
