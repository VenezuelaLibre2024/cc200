package com.google.android.gms.internal.p377firebaseauthapi;

/* loaded from: classes.dex */
final class zzag extends zzaf {
    private final /* synthetic */ zzp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzad zzadVar, zzac zzacVar, CharSequence charSequence, zzp zzpVar) {
        super(zzacVar, charSequence);
        this.zzb = zzpVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaf
    public final int zza(int i10) {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzaf
    public final int zzb(int i10) {
        if (this.zzb.zza(i10)) {
            return this.zzb.zzb();
        }
        return -1;
    }
}
