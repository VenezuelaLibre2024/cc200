package com.google.android.recaptcha.internal;

import gd.C2237k;
import gd.C2238l;
import gd.C2245s;
import p038ce.InterfaceC1085p0;
import p038ce.InterfaceC1116x;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import p173ld.C3468b;
import sd.InterfaceC4584p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzew extends AbstractC3478l implements InterfaceC4584p {
    public int zza;
    public final /* synthetic */ zzez zzb;
    public final /* synthetic */ zzoe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzew(zzez zzezVar, zzoe zzoeVar, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zzb = zzezVar;
        this.zzc = zzoeVar;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzew(this.zzb, this.zzc, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzew) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        zzbg zzbgVar;
        zzbd zzbdVar;
        zzfh zzfhVar;
        zzfh zzfhVar2;
        Object m12581c = C3385c.m12581c();
        int i10 = this.zza;
        C2238l.m8975b(obj);
        if (i10 == 0) {
            zzez zzezVar = this.zzb;
            zzbgVar = zzezVar.zzi;
            zzbdVar = zzezVar.zzp;
            zzbgVar.zza(zzbdVar.zza(zzne.INIT_NATIVE));
            zzcb.zza(zznz.zzj(zzfy.zzh().zzj(this.zzc.zzJ())));
            zzfhVar = this.zzb.zzn;
            zzfhVar.zzd();
            zzfhVar2 = this.zzb.zzn;
            zzfhVar2.zze();
            zzez.zzl(this.zzb, this.zzc);
            C3468b.m12914b(this.zzb.zzk().hashCode());
            InterfaceC1116x zzk = this.zzb.zzk();
            this.zza = 1;
            if (zzk.mo4597f0(this) == m12581c) {
                return m12581c;
            }
        }
        return C2237k.m8965a(C2237k.m8966b(C2245s.f8873a));
    }
}
