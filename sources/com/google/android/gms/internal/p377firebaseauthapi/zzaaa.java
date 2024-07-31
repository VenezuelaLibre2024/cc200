package com.google.android.gms.internal.p377firebaseauthapi;

import p321w7.C5350c1;
import p337x7.C5712r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaaa implements zzadm<zzafm> {
    private final /* synthetic */ C5350c1 zza;
    private final /* synthetic */ zzacf zzb;
    private final /* synthetic */ zzyl zzc;

    public zzaaa(zzyl zzylVar, C5350c1 c5350c1, zzacf zzacfVar) {
        this.zza = c5350c1;
        this.zzb = zzacfVar;
        this.zzc = zzylVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadm
    public final /* synthetic */ void zza(zzafm zzafmVar) {
        zzafm zzafmVar2 = zzafmVar;
        zzagb zzagbVar = new zzagb();
        zzagbVar.zzd(zzafmVar2.zzc());
        if (this.zza.m21454J() || this.zza.m21455s() != null) {
            zzagbVar.zzb(this.zza.m21455s());
        }
        if (this.zza.zzc() || this.zza.m21453I() != null) {
            zzagbVar.zzg(this.zza.zza());
        }
        zzyl.zza(this.zzc, this.zzb, zzafmVar2, zzagbVar, this);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadj
    public final void zza(String str) {
        this.zzb.zza(C5712r.m22812a(str));
    }
}
