package com.google.android.recaptcha.internal;

import p146jd.InterfaceC3281d;
import p173ld.AbstractC3470d;
import p174le.InterfaceC3479a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzai extends AbstractC3470d {
    public Object zza;
    public Object zzb;
    public Object zzc;
    public long zzd;
    public /* synthetic */ Object zze;
    public final /* synthetic */ zzam zzf;
    public int zzg;
    public InterfaceC3479a zzh;
    public zzt zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzai(zzam zzamVar, InterfaceC3281d interfaceC3281d) {
        super(interfaceC3281d);
        this.zzf = zzamVar;
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= Integer.MIN_VALUE;
        return this.zzf.zza(null, null, 0L, null, null, null, null, this);
    }
}
