package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.internal.p377firebaseauthapi.zzaja;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzaip {
    public static final zzaip zza = new zzaip(true);
    private static volatile boolean zzb = false;
    private static boolean zzc = true;
    private final Map<zzaio, zzaja.zzf<?, ?>> zzd;

    public zzaip() {
        this.zzd = new HashMap();
    }

    private zzaip(boolean z10) {
        this.zzd = Collections.emptyMap();
    }

    public static zzaip zza() {
        return zza;
    }

    public final <ContainingType extends zzakk> zzaja.zzf<ContainingType, ?> zza(ContainingType containingtype, int i10) {
        return (zzaja.zzf) this.zzd.get(new zzaio(containingtype, i10));
    }
}
