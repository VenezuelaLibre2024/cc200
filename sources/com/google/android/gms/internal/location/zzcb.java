package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1164a;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p079f6.InterfaceC1853m;
import p320w6.C5322r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzcb extends AbstractC1164a {
    public zzcb(AbstractC1846f abstractC1846f) {
        super((C1841a<?>) zzbp.zzb, abstractC1846f);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ InterfaceC1853m createFailedResult(Status status) {
        return new C5322r(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1164a, p096g6.InterfaceC2010d
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((zzcb) obj);
    }
}
