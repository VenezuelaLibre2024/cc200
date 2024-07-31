package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.C1260b;
import p108h6.C2394s;
import p321w7.C5403r0;

/* loaded from: classes.dex */
final class zzabt extends zzacw<Void, C1260b.b> {
    private final zzyh zzy;

    public zzabt(C5403r0 c5403r0, String str, String str2, long j10, boolean z10, boolean z11, String str3, String str4, boolean z12) {
        super(8);
        C2394s.m9619l(c5403r0);
        C2394s.m9613f(str);
        this.zzy = new zzyh(c5403r0, str, str2, j10, z10, z11, str3, str4, z12);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "startMfaSignInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
    }
}
