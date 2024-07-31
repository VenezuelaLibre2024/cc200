package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class zzxg implements zzwz<Mac> {
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzwz
    public final /* synthetic */ Mac zza(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
