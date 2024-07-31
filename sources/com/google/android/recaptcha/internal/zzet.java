package com.google.android.recaptcha.internal;

import gd.C2238l;
import gd.C2245s;
import java.util.Map;
import p038ce.C1063k;
import p038ce.C1124z;
import p038ce.InterfaceC1085p0;
import p038ce.InterfaceC1116x;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzet extends AbstractC3478l implements InterfaceC4584p {
    public int zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzez zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzet(String str, zzez zzezVar, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zzb = str;
        this.zzc = zzezVar;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzet(this.zzb, this.zzc, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzet) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        Map map;
        zzt zztVar;
        Object m12581c = C3385c.m12581c();
        int i10 = this.zza;
        C2238l.m8975b(obj);
        if (i10 == 0) {
            zzez zzezVar = this.zzc;
            String str = this.zzb;
            InterfaceC1116x m4605b = C1124z.m4605b(null, 1, null);
            map = zzezVar.zzl;
            map.put(str, m4605b);
            String str2 = this.zzb;
            zzou zzf = zzov.zzf();
            zzf.zzd(str2);
            byte[] zzd = ((zzov) zzf.zzj()).zzd();
            String zzi = zzfy.zzh().zzi(zzd, 0, zzd.length);
            zztVar = this.zzc.zzq;
            C1063k.m4457d(zztVar.zzb(), null, null, new zzes(this.zzc, zzi, null), 3, null);
            this.zza = 1;
            obj = m4605b.mo4597f0(this);
            if (obj == m12581c) {
                return m12581c;
            }
        }
        return obj;
    }
}
