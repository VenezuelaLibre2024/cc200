package com.google.android.gms.internal.location;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.C1841a;
import p096g6.InterfaceC2056q;
import p320w6.C5296e;

/* loaded from: classes.dex */
public final /* synthetic */ class zzbh implements InterfaceC2056q {
    public final /* synthetic */ C5296e zza;
    public final /* synthetic */ CancellationToken zzb;

    public /* synthetic */ zzbh(C5296e c5296e, CancellationToken cancellationToken) {
        this.zza = c5296e;
        this.zzb = cancellationToken;
    }

    @Override // p096g6.InterfaceC2056q
    public final void accept(Object obj, Object obj2) {
        C1841a c1841a = zzbp.zzb;
        ((zzda) obj).zzs(this.zza, this.zzb, (TaskCompletionSource) obj2);
    }
}
