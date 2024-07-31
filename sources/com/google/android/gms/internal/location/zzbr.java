package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p320w6.C5308k;

/* loaded from: classes.dex */
final class zzbr extends zzbu {
    public final /* synthetic */ C5308k zza;
    public final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbr(zzbv zzbvVar, AbstractC1846f abstractC1846f, C5308k c5308k, PendingIntent pendingIntent) {
        super(abstractC1846f);
        this.zza = c5308k;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1164a
    public final /* bridge */ /* synthetic */ void doExecute(C1841a.b bVar) {
        ((zzda) bVar).zzq(this.zza, this.zzb, zzbv.zza(this));
    }
}
