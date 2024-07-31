package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.regex.Matcher;

/* loaded from: classes.dex */
final class zzt extends zzp {
    private final Matcher zza;

    public zzt(Matcher matcher) {
        this.zza = (Matcher) zzz.zza(matcher);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzp
    public final int zza() {
        return this.zza.end();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzp
    public final boolean zza(int i10) {
        return this.zza.find(i10);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzp
    public final int zzb() {
        return this.zza.start();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzp
    public final boolean zzc() {
        return this.zza.matches();
    }
}
