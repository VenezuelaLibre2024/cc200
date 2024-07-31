package com.google.android.recaptcha.internal;

import gd.C2238l;
import gd.C2245s;
import java.util.Arrays;
import p038ce.C1089q0;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;
import td.C4764x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzby extends AbstractC3478l implements InterfaceC4584p {
    public final /* synthetic */ Exception zza;
    public final /* synthetic */ zzcj zzb;
    public final /* synthetic */ zzca zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzby(Exception exc, zzcj zzcjVar, zzca zzcaVar, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zza = exc;
        this.zzb = zzcjVar;
        this.zzc = zzcaVar;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        zzby zzbyVar = new zzby(this.zza, this.zzb, this.zzc, interfaceC3281d);
        zzbyVar.zzd = obj;
        return zzbyVar;
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzby) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        zzpg zzpgVar;
        C3385c.m12581c();
        C2238l.m8975b(obj);
        InterfaceC1085p0 interfaceC1085p0 = (InterfaceC1085p0) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzae) {
            zzpgVar = ((zzae) exc).zza();
            zzpgVar.zzd(this.zzb.zza());
        } else {
            zzcj zzcjVar = this.zzb;
            zzpg zzf = zzph.zzf();
            zzf.zzd(zzcjVar.zza());
            zzf.zzp(2);
            zzf.zze(2);
            zzpgVar = zzf;
        }
        zzph zzphVar = (zzph) zzpgVar.zzj();
        zzphVar.zzk();
        zzphVar.zzj();
        C4764x.m18672b(this.zza.getClass()).mo18642a();
        this.zza.getMessage();
        zzcj zzcjVar2 = this.zzb;
        zzz zzb = zzcjVar2.zzb();
        zzz zzzVar = zzcjVar2.zza;
        if (zzzVar == null) {
            zzzVar = null;
        }
        zzno zza = zzbp.zza(zzb, zzzVar);
        String zzd = this.zzb.zzd();
        if (zzd.length() == 0) {
            zzd = "recaptcha.m.Main.rge";
        }
        if (C1089q0.m4561e(interfaceC1085p0)) {
            zzca zzcaVar = this.zzc;
            zzfy zzh = zzfy.zzh();
            byte[] zzd2 = zzphVar.zzd();
            zzfy zzh2 = zzfy.zzh();
            byte[] zzd3 = zza.zzd();
            zzcaVar.zzc.zze().zzb(zzd, (String[]) Arrays.copyOf(new String[]{zzh.zzi(zzd2, 0, zzd2.length), zzh2.zzi(zzd3, 0, zzd3.length)}, 2));
        }
        return C2245s.f8873a;
    }
}
