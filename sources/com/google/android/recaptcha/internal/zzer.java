package com.google.android.recaptcha.internal;

import gd.C2237k;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3470d;

/* loaded from: classes.dex */
public final class zzer extends AbstractC3470d {
    public /* synthetic */ Object zza;
    public final /* synthetic */ zzez zzb;
    public int zzc;
    public zzez zzd;
    public String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzer(zzez zzezVar, InterfaceC3281d interfaceC3281d) {
        super(interfaceC3281d);
        this.zzb = zzezVar;
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zza = this.zzb.zza(null, 0L, this);
        return zza == C3385c.m12581c() ? zza : C2237k.m8965a(zza);
    }
}
