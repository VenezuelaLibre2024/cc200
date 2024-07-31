package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzay {
    public final List<zzbv> zza = new ArrayList();

    public final zzaq zza(String str) {
        if (!this.zza.contains(zzg.zza(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: " + str);
    }

    public abstract zzaq zza(String str, zzh zzhVar, List<zzaq> list);
}
