package com.google.android.recaptcha;

import gd.C2237k;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3470d;

/* loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends AbstractC3470d {
    public /* synthetic */ Object zza;
    public final /* synthetic */ Recaptcha zzb;
    public int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, InterfaceC3281d interfaceC3281d) {
        super(interfaceC3281d);
        this.zzb = recaptcha;
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object m24458getClientBWLJW6A = this.zzb.m24458getClientBWLJW6A(null, null, 0L, this);
        return m24458getClientBWLJW6A == C3385c.m12581c() ? m24458getClientBWLJW6A : C2237k.m8965a(m24458getClientBWLJW6A);
    }
}
