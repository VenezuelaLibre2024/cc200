package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes.dex */
public final class zzxf implements zzwz<MessageDigest> {
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzwz
    public final /* synthetic */ MessageDigest zza(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
