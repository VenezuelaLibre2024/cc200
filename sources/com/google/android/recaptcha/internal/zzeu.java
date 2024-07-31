package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import td.C4753m;

/* loaded from: classes.dex */
public final class zzeu extends WebViewClient {
    public final /* synthetic */ zzez zza;

    public zzeu(zzez zzezVar) {
        this.zza = zzezVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zzbg zzbgVar;
        zzbd zzbdVar;
        zzfh zzfhVar;
        zzez zzezVar = this.zza;
        zzbgVar = zzezVar.zzi;
        zzbdVar = zzezVar.zzp;
        zzbgVar.zza(zzbdVar.zza(zzne.INIT_NETWORK));
        zzfhVar = this.zza.zzn;
        long zza = zzfhVar.zza(TimeUnit.MICROSECONDS);
        zzv zzvVar = zzv.zza;
        zzv.zza(zzx.zzl.zza(), zza);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        Map map;
        super.onReceivedError(webView, i10, str, str2);
        zzn zznVar = zzn.zze;
        map = this.zza.zzk;
        zzl zzlVar = (zzl) map.get(Integer.valueOf(i10));
        if (zzlVar == null) {
            zzlVar = zzl.zzY;
        }
        zzp zzpVar = new zzp(zznVar, zzlVar, null);
        this.zza.zzk().hashCode();
        zzpVar.getMessage();
        this.zza.zzk().mo4595l0(zzpVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        zzfb zzfbVar = zzfb.zza;
        C4753m.m18650c(parse);
        if (!zzfb.zzb(parse) || zzfb.zza(parse)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzp zzpVar = new zzp(zzn.zzc, zzl.zzac, null);
        this.zza.zzk().hashCode();
        parse.toString();
        this.zza.zzk().mo4595l0(zzpVar);
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
