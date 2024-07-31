package com.google.android.recaptcha.internal;

import android.app.Application;
import gd.C2238l;
import gd.C2245s;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzah extends AbstractC3478l implements InterfaceC4584p {
    public int zza;
    public final /* synthetic */ Application zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzah(Application application, String str, long j10, zzbq zzbqVar, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j10;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzah(this.zzb, this.zzc, this.zzd, null, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzah) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        Object m12581c = C3385c.m12581c();
        int i10 = this.zza;
        C2238l.m8975b(obj);
        if (i10 == 0) {
            Application application = this.zzb;
            String str = this.zzc;
            long j10 = this.zzd;
            zzam zzamVar = zzam.zza;
            this.zza = 1;
            obj = zzamVar.zza(application, str, j10, new zzab("https://www.recaptcha.net/recaptcha/api3"), null, null, zzam.zze, this);
            if (obj == m12581c) {
                return m12581c;
            }
        }
        return obj;
    }
}
