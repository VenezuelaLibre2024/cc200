package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p321w7.AbstractC5341a0;
import p321w7.AbstractC5373i0;
import p321w7.InterfaceC5372i;
import p337x7.C5684h2;
import p337x7.C5685i;
import p337x7.InterfaceC5720t1;

/* loaded from: classes.dex */
public final class zzaao extends zzacw<InterfaceC5372i, InterfaceC5720t1> {
    private final String zzaa;
    private final AbstractC5373i0 zzy;
    private final String zzz;

    public zzaao(AbstractC5373i0 abstractC5373i0, String str, String str2) {
        super(2);
        this.zzy = (AbstractC5373i0) C2394s.m9619l(abstractC5373i0);
        this.zzz = C2394s.m9613f(str);
        this.zzaa = str2;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzz, this.zzy, this.zzaa, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
        C5685i zza = zzaag.zza(this.zzc, this.zzk);
        AbstractC5341a0 abstractC5341a0 = this.zzd;
        if (abstractC5341a0 != null && !abstractC5341a0.mo21427b().equalsIgnoreCase(zza.mo21427b())) {
            zza(new Status(17024));
        } else {
            ((InterfaceC5720t1) this.zze).mo5269a(this.zzj, zza);
            zzb(new C5684h2(zza));
        }
    }
}
