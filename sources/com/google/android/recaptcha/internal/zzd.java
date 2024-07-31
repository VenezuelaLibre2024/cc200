package com.google.android.recaptcha.internal;

import gd.C2237k;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3470d;

/* loaded from: classes.dex */
public final class zzd extends AbstractC3470d {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzg zzb;
    public int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zzg zzgVar, InterfaceC3281d interfaceC3281d) {
        super(interfaceC3281d);
        this.zzb = zzgVar;
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzb = this.zzb.zzb(0L, null, this);
        return zzb == C3385c.m12581c() ? zzb : C2237k.m8965a(zzb);
    }
}
