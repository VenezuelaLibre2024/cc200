package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.List;

/* loaded from: classes.dex */
public final class zzamc extends RuntimeException {
    private final List<String> zza;

    public zzamc(zzakk zzakkVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.zza = null;
    }

    public final zzajj zza() {
        return new zzajj(getMessage());
    }
}
