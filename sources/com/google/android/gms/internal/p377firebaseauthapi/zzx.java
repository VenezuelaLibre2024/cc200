package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class zzx implements zzv {
    /* JADX INFO: Access modifiers changed from: private */
    public zzx() {
    }

    public /* synthetic */ zzx(zzaa zzaaVar) {
        this();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzv
    public final zzs zza(String str) {
        return new zzu(Pattern.compile(str));
    }
}
