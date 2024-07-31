package com.google.android.recaptcha.internal;

import gd.C2238l;
import gd.C2245s;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p038ce.C1089q0;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import p173ld.C3468b;
import sd.InterfaceC4584p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbx extends AbstractC3478l implements InterfaceC4584p {
    public int zza;
    public final /* synthetic */ zzcj zzb;
    public final /* synthetic */ List zzc;
    public final /* synthetic */ zzca zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbx(zzcj zzcjVar, List list, zzca zzcaVar, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zzb = zzcjVar;
        this.zzc = list;
        this.zzd = zzcaVar;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        zzbx zzbxVar = new zzbx(this.zzb, this.zzc, this.zzd, interfaceC3281d);
        zzbxVar.zze = obj;
        return zzbxVar;
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbx) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        Object m12581c = C3385c.m12581c();
        int i10 = this.zza;
        C2238l.m8975b(obj);
        if (i10 == 0) {
            InterfaceC1085p0 interfaceC1085p0 = (InterfaceC1085p0) this.zze;
            zzfh zzb = zzfh.zzb();
            while (true) {
                zzcj zzcjVar = this.zzb;
                if (zzcjVar.zza() < 0) {
                    break;
                }
                if (zzcjVar.zza() >= this.zzc.size() || !C1089q0.m4561e(interfaceC1085p0)) {
                    break;
                }
                try {
                    this.zzd.zzi((zzpr) this.zzc.get(this.zzb.zza()), this.zzb);
                } catch (Exception e10) {
                    zzca zzcaVar = this.zzd;
                    zzcj zzcjVar2 = this.zzb;
                    this.zza = 1;
                    zzh = zzcaVar.zzh(e10, zzcjVar2, this);
                    if (zzh == m12581c) {
                        return m12581c;
                    }
                }
            }
            zzb.zzf();
            C3468b.m12915c(zzb.zza(TimeUnit.MICROSECONDS));
            return C2245s.f8873a;
        }
        return C2245s.f8873a;
    }
}
