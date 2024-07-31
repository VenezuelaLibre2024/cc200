package com.google.android.gms.internal.auth;

import android.content.Context;
import p079f6.AbstractC1846f;
import p366z5.C5992b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbq extends zzbi {
    public final /* synthetic */ C5992b zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbq(zzbt zzbtVar, AbstractC1846f abstractC1846f, C5992b c5992b) {
        super(abstractC1846f);
        this.zza = c5992b;
    }

    @Override // com.google.android.gms.internal.auth.zzbi
    public final void zza(Context context, zzbh zzbhVar) {
        zzbhVar.zze(new zzbp(this), this.zza);
    }
}
