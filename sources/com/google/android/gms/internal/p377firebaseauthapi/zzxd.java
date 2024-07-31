package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: classes.dex */
public final class zzxd implements zzwz<KeyPairGenerator> {
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzwz
    public final /* synthetic */ KeyPairGenerator zza(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
