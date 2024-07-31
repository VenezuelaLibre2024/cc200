package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import gd.C2238l;
import gd.C2245s;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3478l;
import sd.InterfaceC4584p;
import td.C4753m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzav extends AbstractC3478l implements InterfaceC4584p {
    public final /* synthetic */ zzbd zza;
    public final /* synthetic */ zzaw zzb;
    public final /* synthetic */ RecaptchaAction zzc;
    public final /* synthetic */ zzog zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzav(zzbd zzbdVar, zzaw zzawVar, RecaptchaAction recaptchaAction, zzog zzogVar, InterfaceC3281d interfaceC3281d) {
        super(2, interfaceC3281d);
        this.zza = zzbdVar;
        this.zzb = zzawVar;
        this.zzc = recaptchaAction;
        this.zzd = zzogVar;
    }

    @Override // p173ld.AbstractC3467a
    public final InterfaceC3281d create(Object obj, InterfaceC3281d interfaceC3281d) {
        return new zzav(this.zza, this.zzb, this.zzc, this.zzd, interfaceC3281d);
    }

    @Override // sd.InterfaceC4584p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzav) create((InterfaceC1085p0) obj, (InterfaceC3281d) obj2)).invokeSuspend(C2245s.f8873a);
    }

    @Override // p173ld.AbstractC3467a
    public final Object invokeSuspend(Object obj) {
        zzbg zzbgVar;
        zzoe zzoeVar;
        zzoe zzoeVar2;
        zzbg zzbgVar2;
        zzab zzabVar;
        zzbg zzbgVar3;
        C3385c.m12581c();
        C2238l.m8975b(obj);
        zzbb zza = this.zza.zza(zzne.FETCH_TOKEN);
        zzbgVar = this.zzb.zzi;
        zzbgVar.zze.put(zza, new zzbf(zza, zzbgVar.zza, new zzac()));
        zzob zzf = zzoc.zzf();
        zzaw zzawVar = this.zzb;
        zzf.zzr(zzawVar.zzg());
        zzf.zzd(this.zzc.getAction());
        zzoeVar = zzawVar.zzg;
        zzf.zzq(zzoeVar.zzI());
        zzoeVar2 = zzawVar.zzg;
        zzf.zzp(zzoeVar2.zzH());
        zzog zzogVar = this.zzd;
        zzf.zzt(zzogVar.zzH());
        zzf.zze(zzogVar.zzj());
        zzf.zzs(zzogVar.zzI());
        zzoc zzocVar = (zzoc) zzf.zzj();
        try {
            zzabVar = this.zzb.zzf;
            URLConnection openConnection = new URL(zzabVar.zzd()).openConnection();
            C4753m.m18651d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
            try {
                httpURLConnection.connect();
                zzoi zzf2 = zzoj.zzf();
                zzf2.zzd(zzocVar.zzi());
                zzf2.zzq(zzocVar.zzk());
                zzf2.zzt(zzocVar.zzI());
                zzf2.zzp(zzocVar.zzH());
                zzf2.zzr(zzocVar.zzJ());
                zzf2.zzs(zzocVar.zzK());
                zzf2.zze(zzocVar.zzj());
                httpURLConnection.getOutputStream().write(((zzoj) zzf2.zzj()).zzd());
                if (httpURLConnection.getResponseCode() != 200) {
                    throw zzbr.zza(httpURLConnection.getResponseCode());
                }
                try {
                    zzol zzg = zzol.zzg(httpURLConnection.getInputStream());
                    zzbgVar3 = this.zzb.zzi;
                    zzbgVar3.zza(zza);
                    return zzg;
                } catch (Exception unused) {
                    throw new zzp(zzn.zzc, zzl.zzR, null);
                }
            } catch (Exception e10) {
                if (e10 instanceof zzp) {
                    throw ((zzp) e10);
                }
                throw new zzp(zzn.zze, zzl.zzQ, null);
            }
        } catch (Exception e11) {
            zzp zzpVar = e11 instanceof zzp ? (zzp) e11 : new zzp(zzn.zzc, zzl.zzam, null);
            zzbgVar2 = this.zzb.zzi;
            zzbgVar2.zzb(zza, zzpVar, null);
            throw zzpVar;
        }
    }
}
