package com.google.android.gms.internal.location;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdq extends zzdo {
    private final zzds zza;

    public zzdq(zzds zzdsVar, int i10) {
        super(zzdsVar.size(), i10);
        this.zza = zzdsVar;
    }

    @Override // com.google.android.gms.internal.location.zzdo
    public final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
