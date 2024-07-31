package com.google.android.gms.internal.p377firebaseauthapi;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class zzu extends zzs implements Serializable {
    private final Pattern zza;

    public zzu(Pattern pattern) {
        this.zza = (Pattern) zzz.zza(pattern);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzs
    public final zzp zza(CharSequence charSequence) {
        return new zzt(this.zza.matcher(charSequence));
    }
}
