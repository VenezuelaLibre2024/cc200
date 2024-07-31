package com.google.android.recaptcha.internal;

import gd.C2237k;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3470d;

/* loaded from: classes.dex */
public final class zzev extends AbstractC3470d {
    public long zza;
    public /* synthetic */ Object zzb;
    public final /* synthetic */ zzez zzc;
    public int zzd;
    public zzez zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(zzez zzezVar, InterfaceC3281d interfaceC3281d) {
        super(interfaceC3281d);
        this.zzc = zzezVar;
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object zzb = this.zzc.zzb(0L, null, this);
        return zzb == C3385c.m12581c() ? zzb : C2237k.m8965a(zzb);
    }
}
