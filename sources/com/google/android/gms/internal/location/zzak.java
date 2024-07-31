package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationRequest;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p096g6.C2034j;

/* loaded from: classes.dex */
final class zzak extends zzat {
    public final /* synthetic */ C2034j zza;
    public final /* synthetic */ LocationRequest zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(zzau zzauVar, AbstractC1846f abstractC1846f, C2034j c2034j, LocationRequest locationRequest) {
        super(abstractC1846f);
        this.zza = c2034j;
        this.zzb = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1164a
    public final /* bridge */ /* synthetic */ void doExecute(C1841a.b bVar) {
        ((zzda) bVar).zzv(new zzas(this.zza), this.zzb, zzau.zza(this));
    }
}
