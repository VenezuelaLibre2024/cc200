package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1164a;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p079f6.InterfaceC1853m;
import p291u5.InterfaceC4899g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzac extends AbstractC1164a {
    public final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzal zzalVar, C1841a c1841a, AbstractC1846f abstractC1846f, boolean z10) {
        super((C1841a<?>) c1841a, abstractC1846f);
        this.zza = z10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final InterfaceC1853m createFailedResult(Status status) {
        return new zzaj(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1164a
    public final /* bridge */ /* synthetic */ void doExecute(C1841a.b bVar) {
        ((InterfaceC4899g) ((zzam) bVar).getService()).mo19464k1(this.zza);
        setResult((zzac) new zzaj(Status.f4470m));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1164a, p096g6.InterfaceC2010d
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzac) obj);
    }
}
