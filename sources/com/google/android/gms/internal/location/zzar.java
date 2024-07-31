package com.google.android.gms.internal.location;

import android.location.Location;
import p079f6.AbstractC1846f;
import p079f6.C1841a;

/* loaded from: classes.dex */
final class zzar extends zzat {
    public final /* synthetic */ Location zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(zzau zzauVar, AbstractC1846f abstractC1846f, Location location) {
        super(abstractC1846f);
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1164a
    public final /* bridge */ /* synthetic */ void doExecute(C1841a.b bVar) {
        ((zzda) bVar).zzz(this.zza, zzau.zza(this));
    }
}
