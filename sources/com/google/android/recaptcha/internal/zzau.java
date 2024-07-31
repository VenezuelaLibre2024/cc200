package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import gd.C2237k;
import gd.C2238l;
import gd.C2245s;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* loaded from: classes.dex */
final class zzau extends AbstractC3478l implements InterfaceC4584p {
    public int zza;
    public final /* synthetic */ zzaw zzb;
    public final /* synthetic */ RecaptchaAction zzc;
    public final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzau(zzaw zzawVar, RecaptchaAction recaptchaAction, long j10, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zzb = zzawVar;
        this.zzc = recaptchaAction;
        this.zzd = j10;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzau(this.zzb, this.zzc, this.zzd, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzau) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        Object zzk;
        Object m12581c = C3385c.m12581c();
        int i10 = this.zza;
        C2238l.m8975b(obj);
        if (i10 != 0) {
            zzk = ((C2237k) obj).m8973i();
        } else {
            zzaw zzawVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            zzk = zzawVar.zzk(recaptchaAction, j10, this);
            if (zzk == m12581c) {
                return m12581c;
            }
        }
        C2238l.m8975b(zzk);
        return zzk;
    }
}
