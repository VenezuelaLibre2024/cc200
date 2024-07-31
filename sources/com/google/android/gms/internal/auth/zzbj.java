package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1164a;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p079f6.InterfaceC1853m;
import p306v5.C5118b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzbj extends AbstractC1164a {
    public zzbj(AbstractC1846f abstractC1846f) {
        super(C5118b.f19355a, abstractC1846f);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ InterfaceC1853m createFailedResult(Status status) {
        return new zzbv(status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.AbstractC1164a
    public final /* bridge */ /* synthetic */ void doExecute(C1841a.b bVar) {
        zzbe zzbeVar = (zzbe) bVar;
        zza(zzbeVar.getContext(), (zzbh) zzbeVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1164a, p096g6.InterfaceC2010d
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzbj) obj);
    }

    public abstract void zza(Context context, zzbh zzbhVar);
}
