package com.google.android.recaptcha.internal;

import p146jd.InterfaceC3281d;
import p173ld.AbstractC3470d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzao extends AbstractC3470d {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzaw zzb;
    public int zzc;
    public zzaw zzd;
    public zzbb zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzao(zzaw zzawVar, InterfaceC3281d interfaceC3281d) {
        super(interfaceC3281d);
        this.zzb = zzawVar;
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        Object zzj;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzj = this.zzb.zzj(0L, null, null, this);
        return zzj;
    }
}
