package com.google.android.gms.internal.p377firebaseauthapi;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;
import p108h6.C2394s;

/* loaded from: classes.dex */
public final class zzadl {
    public static void zza(String str, zzacr zzacrVar, zzadm<?> zzadmVar, Type type, zzacv zzacvVar) {
        String str2;
        try {
            C2394s.m9619l(zzacrVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzacrVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzacvVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                zza(httpURLConnection, zzadmVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (NullPointerException e10) {
            e = e10;
            str2 = e.getMessage();
            zzadmVar.zza(str2);
        } catch (SocketTimeoutException unused) {
            str2 = "TIMEOUT";
            zzadmVar.zza(str2);
        } catch (UnknownHostException unused2) {
            str2 = "<<Network Error>>";
            zzadmVar.zza(str2);
        } catch (IOException e11) {
            e = e11;
            str2 = e.getMessage();
            zzadmVar.zza(str2);
        } catch (JSONException e12) {
            e = e12;
            str2 = e.getMessage();
            zzadmVar.zza(str2);
        }
    }

    public static void zza(String str, zzadm<?> zzadmVar, Type type, zzacv zzacvVar) {
        String message;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzacvVar.zza(httpURLConnection);
            zza(httpURLConnection, zzadmVar, type);
        } catch (SocketTimeoutException unused) {
            message = "TIMEOUT";
            zzadmVar.zza(message);
        } catch (UnknownHostException unused2) {
            message = "<<Network Error>>";
            zzadmVar.zza(message);
        } catch (IOException e10) {
            message = e10.getMessage();
            zzadmVar.zza(message);
        }
    }

    private static void zza(HttpURLConnection httpURLConnection, zzadm<?> zzadmVar, Type type) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = zza(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb2.append(readLine);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb3 = sb2.toString();
                if (zza(responseCode)) {
                    zzadmVar.zza((zzadm<?>) zzaco.zza(sb3, type));
                } else {
                    zzadmVar.zza((String) zzaco.zza(sb3, String.class));
                }
                httpURLConnection.disconnect();
            } catch (zzaah e10) {
                e = e10;
                zzadmVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                zzadmVar.zza("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e11) {
                e = e11;
                zzadmVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    private static final boolean zza(int i10) {
        return i10 >= 200 && i10 < 300;
    }
}
