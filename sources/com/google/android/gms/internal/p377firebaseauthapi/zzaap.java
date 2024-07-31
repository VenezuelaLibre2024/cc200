package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p321w7.AbstractC5373i0;
import p337x7.InterfaceC5720t1;

/* loaded from: classes.dex */
public final class zzaap extends zzacw<Void, InterfaceC5720t1> {
    private final String zzaa;
    private final String zzab;
    private final AbstractC5373i0 zzy;
    private final String zzz;

    public zzaap(AbstractC5373i0 abstractC5373i0, String str, String str2, String str3) {
        super(2);
        this.zzy = (AbstractC5373i0) C2394s.m9619l(abstractC5373i0);
        this.zzz = C2394s.m9613f(str);
        this.zzaa = str2;
        this.zzab = str3;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzz, this.zzaa, this.zzab, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
        ((InterfaceC5720t1) this.zze).mo5269a(this.zzj, zzaag.zza(this.zzc, this.zzk));
        zzb(null);
    }
}
