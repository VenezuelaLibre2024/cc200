package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Build;
import gd.C2238l;
import gd.C2245s;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;

/* loaded from: classes.dex */
final class zzal extends AbstractC3478l implements InterfaceC4584p {
    public final /* synthetic */ Application zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbd zzc;
    public final /* synthetic */ zzbq zzd;
    public final /* synthetic */ zzab zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(Application application, String str, zzbd zzbdVar, zzbq zzbqVar, zzab zzabVar, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zza = application;
        this.zzb = str;
        this.zzc = zzbdVar;
        this.zzd = zzbqVar;
        this.zze = zzabVar;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzal(this.zza, this.zzb, this.zzc, this.zzd, this.zze, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        C3385c.m12581c();
        C2238l.m8975b(obj);
        zzaf zzafVar = zzaf.zza;
        zzbd zzbdVar = this.zzc;
        Application application = this.zza;
        String zza = zzaf.zza(application);
        String packageName = application.getPackageName();
        String zzd = zzbdVar.zzd();
        zzq zzqVar = new zzq(application);
        int i10 = Build.VERSION.SDK_INT;
        String zza2 = zzqVar.zza("_GRECAPTCHA_KC");
        if (zza2 == null) {
            zza2 = "";
        }
        byte[] bytes = ("k=" + URLEncoder.encode(this.zzb, "UTF-8") + "&pk=" + URLEncoder.encode(packageName, "UTF-8") + "&mst=" + URLEncoder.encode(zza, "UTF-8") + "&msv=" + URLEncoder.encode("18.4.0", "UTF-8") + "&msi=" + URLEncoder.encode(zzd, "UTF-8") + "&mov=" + i10 + "&mkc=" + zza2).getBytes(Charset.forName("UTF-8"));
        return this.zzd.zza(this.zze.zzb(), bytes, this.zzc);
    }
}
