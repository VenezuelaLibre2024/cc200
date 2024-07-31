package com.google.android.recaptcha.internal;

import gd.C2237k;
import gd.C2238l;
import gd.C2245s;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* loaded from: classes.dex */
final class zzb extends AbstractC3478l implements InterfaceC4584p {
    public int zza;
    public final /* synthetic */ zza zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(zza zzaVar, String str, long j10, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zzb = zzaVar;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzb(this.zzb, this.zzc, this.zzd, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzb) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        Object zza;
        Object m12581c = C3385c.m12581c();
        int i10 = this.zza;
        C2238l.m8975b(obj);
        if (i10 != 0) {
            zza = ((C2237k) obj).m8973i();
        } else {
            zza zzaVar = this.zzb;
            String str = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            zza = zzaVar.zza(str, j10, this);
            if (zza == m12581c) {
                return m12581c;
            }
        }
        return C2237k.m8965a(zza);
    }
}
