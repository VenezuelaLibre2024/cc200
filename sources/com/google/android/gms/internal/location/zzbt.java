package com.google.android.gms.internal.location;

import java.util.List;
import p079f6.AbstractC1846f;
import p079f6.C1841a;

/* loaded from: classes.dex */
final class zzbt extends zzbu {
    public final /* synthetic */ List zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbt(zzbv zzbvVar, AbstractC1846f abstractC1846f, List list) {
        super(abstractC1846f);
        this.zza = list;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1164a
    public final /* bridge */ /* synthetic */ void doExecute(C1841a.b bVar) {
        ((zzda) bVar).zzy(this.zza, zzbv.zza(this));
    }
}
