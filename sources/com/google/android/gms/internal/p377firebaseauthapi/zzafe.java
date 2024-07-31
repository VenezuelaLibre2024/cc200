package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzafe {
    private List<zzafb> zza;

    public zzafe() {
        this.zza = new ArrayList();
    }

    public zzafe(List<zzafb> list) {
        this.zza = Collections.unmodifiableList(list);
    }

    public final List<zzafb> zza() {
        return this.zza;
    }
}
