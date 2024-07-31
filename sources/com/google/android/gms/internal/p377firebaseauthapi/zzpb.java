package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzpb {
    private final Class<? extends zzow> zza;
    private final zzxr zzb;

    private zzpb(Class<? extends zzow> cls, zzxr zzxrVar) {
        this.zza = cls;
        this.zzb = zzxrVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpb)) {
            return false;
        }
        zzpb zzpbVar = (zzpb) obj;
        return zzpbVar.zza.equals(this.zza) && zzpbVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return this.zza.getSimpleName() + ", object identifier: " + String.valueOf(this.zzb);
    }
}
