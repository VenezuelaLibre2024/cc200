package com.google.android.gms.internal.p377firebaseauthapi;

import java.security.SecureRandom;

/* loaded from: classes.dex */
final class zzou extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ SecureRandom initialValue() {
        return zzov.zza();
    }
}
