package com.google.android.gms.internal.p377firebaseauthapi;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes.dex */
final class zze extends zzb {
    private zze() {
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzb
    public final URLConnection zza(URL url, String str) {
        return url.openConnection();
    }
}
