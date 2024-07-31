package com.google.android.recaptcha.internal;

import gd.C2237k;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3470d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzap extends AbstractC3470d {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzaw zzb;
    public int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzap(zzaw zzawVar, InterfaceC3281d interfaceC3281d) {
        super(interfaceC3281d);
        this.zzb = zzawVar;
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo24459execute0E7RQCE = this.zzb.mo24459execute0E7RQCE(null, 0L, this);
        return mo24459execute0E7RQCE == C3385c.m12581c() ? mo24459execute0E7RQCE : C2237k.m8965a(mo24459execute0E7RQCE);
    }
}
