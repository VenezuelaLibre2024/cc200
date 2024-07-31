package com.google.android.recaptcha.internal;

import android.net.TrafficStats;
import android.webkit.URLUtil;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import p115hd.C2502n;
import td.C4753m;

/* loaded from: classes.dex */
public final class zzbo implements zzbn {
    private final String zza;

    public zzbo(String str) {
        this.zza = str;
    }

    private static final void zzb(byte[] bArr) {
        for (zznf zznfVar : zzni.zzk(bArr).zzH()) {
            if (C2502n.m9991g("INIT_TOTAL", "EXECUTE_TOTAL").contains(zznfVar.zzj().name()) && zznfVar.zzT()) {
                zznfVar.zzJ();
                zznfVar.zzK();
                zznfVar.zzj().name();
                zznfVar.zzg().zzk();
                zznfVar.zzg().zzf();
            } else {
                zznfVar.zzJ();
                zznfVar.zzK();
                zznfVar.zzj().name();
            }
            zznfVar.zzU();
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbn
    public final boolean zza(byte[] bArr) {
        HttpURLConnection httpURLConnection;
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            zzb(bArr);
            if (URLUtil.isHttpUrl(this.zza)) {
                URLConnection openConnection = new URL(this.zza).openConnection();
                C4753m.m18651d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) openConnection;
            } else {
                if (!URLUtil.isHttpsUrl(this.zza)) {
                    throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
                }
                URLConnection openConnection2 = new URL(this.zza).openConnection();
                C4753m.m18651d(openConnection2, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                httpURLConnection = (HttpsURLConnection) openConnection2;
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
            httpURLConnection.connect();
            httpURLConnection.getOutputStream().write(bArr);
            return httpURLConnection.getResponseCode() == 200;
        } catch (Exception e10) {
            e10.getMessage();
            return false;
        }
    }
}
