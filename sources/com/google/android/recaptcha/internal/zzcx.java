package com.google.android.recaptcha.internal;

import gd.C2245s;
import sd.InterfaceC4584p;
import td.AbstractC4754n;

/* loaded from: classes.dex */
final class zzcx extends AbstractC4754n implements InterfaceC4584p {
    public final /* synthetic */ zzcj zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzcj zzcjVar, String str, int i10) {
        super(2);
        this.zza = zzcjVar;
        this.zzb = str;
        this.zzc = i10;
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i10 = this.zzc;
        if (i10 != -1) {
            this.zza.zzc().zzf(i10, objArr);
        }
        return C2245s.f8873a;
    }
}
