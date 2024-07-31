package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class zzaf extends zzah {
    public final /* synthetic */ zzag zza;

    public zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, p291u5.InterfaceC4896d
    public final void zzc(boolean z10) {
        this.zza.setResult((zzag) new zzak(z10 ? Status.f4470m : zzal.zza));
    }
}
