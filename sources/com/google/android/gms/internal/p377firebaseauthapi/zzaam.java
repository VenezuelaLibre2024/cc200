package com.google.android.gms.internal.p377firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import p108h6.C2394s;
import p321w7.InterfaceC5412u0;
import p337x7.C5721u;
import p337x7.InterfaceC5720t1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaam extends zzacw<InterfaceC5412u0, InterfaceC5720t1> {
    private final String zzy;
    private final String zzz;

    public zzaam(String str, String str2) {
        super(3);
        C2394s.m9614g(str, "email cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzadh
    public final void zza(TaskCompletionSource taskCompletionSource, zzace zzaceVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaceVar.zze(this.zzy, this.zzz, this.zzb);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacw
    public final void zzb() {
        zzb(new C5721u(this.zzl.zza() == null ? zzaq.zzh() : (List) C2394s.m9619l(this.zzl.zza())));
    }
}
