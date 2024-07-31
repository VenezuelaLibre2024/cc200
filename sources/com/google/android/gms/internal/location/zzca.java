package com.google.android.gms.internal.location;

import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p108h6.C2394s;
import p320w6.C5318p;

/* loaded from: classes.dex */
final class zzca extends zzcb {
    public final /* synthetic */ C5318p zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzca(zzcc zzccVar, AbstractC1846f abstractC1846f, C5318p c5318p, String str) {
        super(abstractC1846f);
        this.zza = c5318p;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1164a
    public final /* synthetic */ void doExecute(C1841a.b bVar) {
        zzda zzdaVar = (zzda) bVar;
        C5318p c5318p = this.zza;
        C2394s.m9609b(c5318p != null, "locationSettingsRequest can't be null");
        ((zzo) zzdaVar.getService()).zzh(c5318p, new zzcr(this), null);
    }
}
