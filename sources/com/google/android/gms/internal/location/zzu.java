package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import p079f6.AbstractC1846f;
import p079f6.C1841a;

/* loaded from: classes.dex */
final class zzu extends zzv {
    public final /* synthetic */ PendingIntent zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzw zzwVar, AbstractC1846f abstractC1846f, PendingIntent pendingIntent) {
        super(abstractC1846f);
        this.zza = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1164a
    public final /* bridge */ /* synthetic */ void doExecute(C1841a.b bVar) {
        ((zzf) bVar).zzp(this.zza);
        setResult((zzu) Status.f4470m);
    }
}
