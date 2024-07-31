package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import gd.C2245s;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p038ce.InterfaceC1116x;

/* loaded from: classes.dex */
public final class zzeq {
    public final /* synthetic */ zzez zza;
    private Long zzb;
    private final zzfh zzc = zzfh.zzb();

    public zzeq(zzez zzezVar) {
        this.zza = zzezVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zzbg zzbgVar;
        zzbg zzbgVar2;
        zzbd zzbdVar;
        zznf zzI = zznf.zzI(zzfy.zzh().zzj(str));
        zzez zzezVar = this.zza;
        if (zzezVar.zzg().zzb == null) {
            zzbgVar2 = zzezVar.zzi;
            zzbdVar = zzezVar.zzp;
            zzbgVar2.zza(zzbdVar.zza(zzne.LOAD_WEBVIEW));
        }
        zzb();
        zzpc zzi = zzpd.zzi();
        zzi.zzd(zzI);
        zzpd zzpdVar = (zzpd) zzi.zzj();
        zzbgVar = this.zza.zzi;
        zzbgVar.zzd(zzpdVar);
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzbg zzbgVar;
        zzb();
        zzpc zzi = zzpd.zzi();
        zzi.zze(zznu.zzi(zzfy.zzh().zzj(str)));
        zzpd zzpdVar = (zzpd) zzi.zzj();
        zzbgVar = this.zza.zzi;
        zzbgVar.zzd(zzpdVar);
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzox zzg = zzox.zzg(zzfy.zzh().zzj(str));
        zzg.zzi().name();
        if (zzg.zzi() == zzpb.JS_CODE_SUCCESS) {
            this.zza.zzk().hashCode();
            if (this.zza.zzk().mo4596n0(C2245s.f8873a)) {
                return;
            }
            this.zza.zzk().hashCode();
            return;
        }
        zzg.zzi().name();
        zzo zzoVar = zzp.zza;
        zzp zza = zzo.zza(zzg.zzi());
        this.zza.zzk().hashCode();
        this.zza.zzk().mo4595l0(zza);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzbu zzbuVar = this.zza.zzc;
        if (zzbuVar == null) {
            zzbuVar = null;
        }
        zzbuVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        Map map;
        zzb();
        zzog zzi = zzog.zzi(zzfy.zzh().zzj(str));
        zzi.toString();
        map = this.zza.zzl;
        InterfaceC1116x interfaceC1116x = (InterfaceC1116x) map.remove(zzi.zzk());
        if (interfaceC1116x != null) {
            interfaceC1116x.mo4596n0(zzi);
        }
    }
}
