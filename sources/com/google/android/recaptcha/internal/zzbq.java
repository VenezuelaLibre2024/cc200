package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import td.C4753m;

/* loaded from: classes.dex */
public final class zzbq {
    private final zzh zza;
    private final zzbg zzb;

    public zzbq(zzh zzhVar, zzbg zzbgVar) {
        this.zza = zzhVar;
        this.zzb = zzbgVar;
    }

    public final zzoe zza(String str, byte[] bArr, zzbd zzbdVar) {
        zzbb zza = zzbdVar.zza(zzne.VALIDATE_INPUT);
        r0.zze.put(zza, new zzbf(zza, this.zzb.zza, new zzac()));
        try {
            URLConnection openConnection = new URL(str).openConnection();
            C4753m.m18651d(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
            try {
                httpURLConnection.connect();
                httpURLConnection.getOutputStream().write(bArr);
                if (httpURLConnection.getResponseCode() == 200) {
                    try {
                        zzoe zzi = zzoe.zzi(httpURLConnection.getInputStream());
                        this.zzb.zza(zza);
                        return zzi;
                    } catch (Exception unused) {
                        throw new zzp(zzn.zzc, zzl.zzR, null);
                    }
                }
                if (httpURLConnection.getResponseCode() != 400) {
                    throw zzbr.zza(httpURLConnection.getResponseCode());
                }
                zzoz zzg = zzoz.zzg(httpURLConnection.getErrorStream());
                zzo zzoVar = zzp.zza;
                throw zzo.zza(zzg.zzi());
            } catch (Exception e10) {
                if (e10 instanceof zzp) {
                    throw ((zzp) e10);
                }
                throw new zzp(zzn.zze, zzl.zzQ, null);
            }
        } catch (zzp e11) {
            this.zzb.zzb(zza, e11, null);
            throw e11.zzc();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: Exception -> 0x0121, TRY_LEAVE, TryCatch #6 {Exception -> 0x0121, blocks: (B:3:0x0003, B:5:0x0015, B:11:0x004d, B:13:0x0058, B:18:0x0084, B:29:0x00b2, B:30:0x00b7, B:34:0x00cd, B:21:0x00e6, B:22:0x00f6, B:37:0x00dc, B:38:0x00e5, B:40:0x00f7, B:41:0x0100, B:43:0x0101, B:44:0x010a, B:46:0x010c, B:47:0x0111, B:48:0x0112, B:51:0x003c, B:52:0x002e, B:7:0x0020, B:9:0x0028, B:32:0x00bd), top: B:2:0x0003, inners: #0, #1, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzb(com.google.android.recaptcha.internal.zzoe r12, com.google.android.recaptcha.internal.zzbd r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzbq.zzb(com.google.android.recaptcha.internal.zzoe, com.google.android.recaptcha.internal.zzbd):java.lang.String");
    }
}
