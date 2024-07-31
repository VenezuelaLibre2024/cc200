package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p108h6.C2394s;
import p337x7.C5706p;
import p337x7.InterfaceC5720t1;

/* loaded from: classes.dex */
final class zzabr extends zzacw<Void, InterfaceC5720t1> {
    private final String zzaa;
    private final long zzab;
    private final boolean zzac;
    private final boolean zzad;
    private final String zzae;
    private final String zzaf;
    private final boolean zzag;
    private final String zzy;
    private final String zzz;

    public zzabr(C5706p c5706p, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12) {
        super(8);
        C2394s.m9619l(c5706p);
        C2394s.m9613f(str);
        this.zzy = C2394s.m9613f(c5706p.m22796L());
        this.zzz = str;
        this.zzaa = str2;
        this.zzab = j10;
        this.zzac = z10;
        this.zzad = z11;
        this.zzae = str3;
        this.zzaf = str4;
        this.zzag = z12;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzz, this.zzaa, this.zzab, this.zzac, this.zzad, this.zzae, this.zzaf, this.zzag, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
    }
}
