package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p108h6.C2394s;

/* loaded from: classes.dex */
final class zzt extends zzv {
    public final /* synthetic */ long zza;
    public final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzw zzwVar, AbstractC1846f abstractC1846f, long j10, PendingIntent pendingIntent) {
        super(abstractC1846f);
        this.zza = j10;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1164a
    public final /* bridge */ /* synthetic */ void doExecute(C1841a.b bVar) {
        zzf zzfVar = (zzf) bVar;
        long j10 = this.zza;
        PendingIntent pendingIntent = this.zzb;
        C2394s.m9619l(pendingIntent);
        C2394s.m9609b(j10 >= 0, "detectionIntervalMillis must be >= 0");
        ((zzo) zzfVar.getService()).zzr(j10, true, pendingIntent);
        setResult((zzt) Status.f4470m);
    }
}
