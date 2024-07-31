package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Objects;
import p109h7.AbstractC2429l;
import p109h7.InterfaceC2438u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgd extends zzhc {
    private final Context zza;
    private final InterfaceC2438u<AbstractC2429l<zzgp>> zzb;

    public zzgd(Context context, InterfaceC2438u<AbstractC2429l<zzgp>> interfaceC2438u) {
        Objects.requireNonNull(context, "Null context");
        this.zza = context;
        this.zzb = interfaceC2438u;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhc) {
            zzhc zzhcVar = (zzhc) obj;
            if (this.zza.equals(zzhcVar.zza())) {
                InterfaceC2438u<AbstractC2429l<zzgp>> interfaceC2438u = this.zzb;
                InterfaceC2438u<AbstractC2429l<zzgp>> zzb = zzhcVar.zzb();
                if (interfaceC2438u != null ? interfaceC2438u.equals(zzb) : zzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.zza.hashCode() ^ 1000003) * 1000003;
        InterfaceC2438u<AbstractC2429l<zzgp>> interfaceC2438u = this.zzb;
        return hashCode ^ (interfaceC2438u == null ? 0 : interfaceC2438u.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.zza) + ", hermeticFileOverrides=" + String.valueOf(this.zzb) + "}";
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final InterfaceC2438u<AbstractC2429l<zzgp>> zzb() {
        return this.zzb;
    }
}
