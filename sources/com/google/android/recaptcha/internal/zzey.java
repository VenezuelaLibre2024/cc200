package com.google.android.recaptcha.internal;

import gd.C2238l;
import gd.C2245s;
import p038ce.C1063k;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzey extends AbstractC3478l implements InterfaceC4584p {
    public final /* synthetic */ zzez zza;
    public final /* synthetic */ zzoe zzb;
    public final /* synthetic */ zzbb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzey(zzez zzezVar, zzoe zzoeVar, zzbb zzbbVar, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zza = zzezVar;
        this.zzb = zzoeVar;
        this.zzc = zzbbVar;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzey(this.zza, this.zzb, this.zzc, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzey) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        zzbg zzbgVar;
        zzbd zzbdVar;
        zzt zztVar;
        C3385c.m12581c();
        C2238l.m8975b(obj);
        try {
            zzez zzezVar = this.zza;
            zzbq zzf = zzezVar.zzf();
            zzoe zzoeVar = this.zzb;
            zzbdVar = zzezVar.zzp;
            String zzb = zzf.zzb(zzoeVar, zzbdVar);
            zztVar = this.zza.zzq;
            C1063k.m4457d(zztVar.zzb(), null, null, new zzex(this.zza, zzb, null), 3, null);
        } catch (zzp e10) {
            zzez zzezVar2 = this.zza;
            zzbb zzbbVar = this.zzc;
            zzbgVar = zzezVar2.zzi;
            zzbgVar.zzb(zzbbVar, e10, null);
            this.zza.zzk().mo4595l0(e10);
        }
        return C2245s.f8873a;
    }
}
