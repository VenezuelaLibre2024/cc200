package com.google.android.recaptcha.internal;

import gd.C2237k;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3470d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzar extends AbstractC3470d {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzaw zzb;
    public int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(zzaw zzawVar, InterfaceC3281d interfaceC3281d) {
        super(interfaceC3281d);
        this.zzb = zzawVar;
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo24460executegIAlus = this.zzb.mo24460executegIAlus(null, this);
        return mo24460executegIAlus == C3385c.m12581c() ? mo24460executegIAlus : C2237k.m8965a(mo24460executegIAlus);
    }
}
