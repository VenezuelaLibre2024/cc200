package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes.dex */
public final class zzxe implements zzwz<KeyFactory> {
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzwz
    public final /* synthetic */ KeyFactory zza(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
