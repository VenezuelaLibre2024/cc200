package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzom {
    private final Class<?> zza;
    private final Class<?> zzb;

    private zzom(Class<?> cls, Class<?> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzom)) {
            return false;
        }
        zzom zzomVar = (zzom) obj;
        return zzomVar.zza.equals(this.zza) && zzomVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return this.zza.getSimpleName() + " with primitive type: " + this.zzb.getSimpleName();
    }
}
