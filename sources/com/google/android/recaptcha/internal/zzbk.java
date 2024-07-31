package com.google.android.recaptcha.internal;

import gd.C2238l;
import gd.C2245s;
import java.util.Timer;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* loaded from: classes.dex */
final class zzbk extends AbstractC3478l implements InterfaceC4584p {
    public final /* synthetic */ zzbm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbk(zzbm zzbmVar, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zza = zzbmVar;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzbk(this.zza, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbk) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        zzaz zzazVar;
        C2245s c2245s;
        Timer timer;
        C3385c.m12581c();
        C2238l.m8975b(obj);
        zzbm zzbmVar = this.zza;
        synchronized (zzbh.class) {
            zzazVar = zzbmVar.zze;
            if (zzazVar != null && zzazVar.zzb() == 0) {
                timer = zzbm.zzb;
                if (timer != null) {
                    timer.cancel();
                }
                zzbm.zzb = null;
            }
            zzbmVar.zzg();
            c2245s = C2245s.f8873a;
        }
        return c2245s;
    }
}
