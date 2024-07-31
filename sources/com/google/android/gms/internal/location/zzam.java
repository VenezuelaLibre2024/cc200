package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.location.LocationRequest;
import p079f6.AbstractC1846f;
import p079f6.C1841a;

/* loaded from: classes.dex */
final class zzam extends zzat {
    public final /* synthetic */ PendingIntent zza;
    public final /* synthetic */ LocationRequest zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzau zzauVar, AbstractC1846f abstractC1846f, PendingIntent pendingIntent, LocationRequest locationRequest) {
        super(abstractC1846f);
        this.zza = pendingIntent;
        this.zzb = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1164a
    public final /* bridge */ /* synthetic */ void doExecute(C1841a.b bVar) {
        ((zzda) bVar).zzw(this.zza, this.zzb, zzau.zza(this));
    }
}
