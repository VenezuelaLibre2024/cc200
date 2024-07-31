package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzne extends zzci {
    private final zzos zza;

    public zzne(zzos zzosVar) {
        this.zza = zzosVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzne)) {
            return false;
        }
        zzos zzosVar = ((zzne) obj).zza;
        return this.zza.zza().zzd().equals(zzosVar.zza().zzd()) && this.zza.zza().zzf().equals(zzosVar.zza().zzf()) && this.zza.zza().zze().equals(zzosVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzb());
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zza().zzf();
        int i10 = zznh.zza[this.zza.zza().zzd().ordinal()];
        objArr[1] = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzci
    public final boolean zza() {
        return this.zza.zza().zzd() != zzvt.RAW;
    }

    public final zzos zzb() {
        return this.zza;
    }
}
