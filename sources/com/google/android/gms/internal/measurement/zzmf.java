package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class zzmf extends RuntimeException {
    private final List<String> zza;

    public zzmf(zzkr zzkrVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.zza = null;
    }
}
