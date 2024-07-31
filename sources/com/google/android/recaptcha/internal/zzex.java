package com.google.android.recaptcha.internal;

import gd.C2238l;
import gd.C2245s;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* loaded from: classes.dex */
final class zzex extends AbstractC3478l implements InterfaceC4584p {
    public final /* synthetic */ zzez zza;
    public final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzex(zzez zzezVar, String str, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zza = zzezVar;
        this.zzb = str;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzex(this.zza, this.zzb, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzex) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        C3385c.m12581c();
        C2238l.m8975b(obj);
        zzez.zzm(this.zza, this.zzb);
        return C2245s.f8873a;
    }
}
