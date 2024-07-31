package com.google.android.gms.internal.p377firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import p108h6.C2394s;
import p154k6.C3363a;
import p195n7.C3767g;
import p337x7.C5712r;

/* loaded from: classes.dex */
public final class zzacg extends AsyncTask<Void, Void, zzacj> {
    private static final C3363a zza = new C3363a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzaci> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final C3767g zzg;

    public zzacg(String str, String str2, Intent intent, C3767g c3767g, zzaci zzaciVar) {
        this.zzb = C2394s.m9613f(str);
        this.zzg = (C3767g) C2394s.m9619l(c3767g);
        C2394s.m9613f(str2);
        C2394s.m9619l(intent);
        String m9613f = C2394s.m9613f(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder buildUpon = Uri.parse(zzaciVar.zza(m9613f)).buildUpon();
        buildUpon.appendPath("getProjectConfig").appendQueryParameter(Constants.KEY, m9613f).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) C2394s.m9619l(str2));
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference<>(zzaciVar);
        this.zze = zzaciVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final zzacj doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzaci zzaciVar = this.zzd.get();
            HttpURLConnection zza2 = zzaciVar.zza(url);
            zza2.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            zza2.setConnectTimeout(60000);
            new zzacv(zzaciVar.zza(), this.zzg, zzact.zza().zzb()).zza(zza2);
            int responseCode = zza2.getResponseCode();
            if (responseCode != 200) {
                String zza3 = zza(zza2);
                zza.m12508c(String.format("Error getting project config. Failed with %s %s", zza3, Integer.valueOf(responseCode)), new Object[0]);
                return zzacj.zzb(zza3);
            }
            zzafh zzafhVar = new zzafh();
            zzafhVar.zza(new String(zza(zza2.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzafhVar.zza().contains(this.zzf) ? zzacj.zzb("UNAUTHORIZED_DOMAIN") : zzacj.zza(this.zzf);
            }
            for (String str : zzafhVar.zza()) {
                if (zza(str)) {
                    return zzacj.zza(str);
                }
            }
            return null;
        } catch (zzaah e10) {
            zza.m12508c("ConversionException encountered: " + e10.getMessage(), new Object[0]);
            return null;
        } catch (IOException e11) {
            zza.m12508c("IOException occurred: " + e11.getMessage(), new Object[0]);
            return null;
        } catch (NullPointerException e12) {
            zza.m12508c("Null pointer encountered: " + e12.getMessage(), new Object[0]);
            return null;
        }
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                return (String) zzaco.zza(new String(zza(errorStream, 128)), String.class);
            }
            return "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
        } catch (IOException e10) {
            zza.m12513h("Error parsing error message from response body in getErrorMessageFromBody. " + String.valueOf(e10), new Object[0]);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(zzacj zzacjVar) {
        String str;
        Uri.Builder builder;
        zzaci zzaciVar = this.zzd.get();
        String str2 = null;
        if (zzacjVar != null) {
            str2 = zzacjVar.zza();
            str = zzacjVar.zzb();
        } else {
            str = null;
        }
        if (zzaciVar == null) {
            zza.m12508c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str2) || (builder = this.zze) == null) {
            zzaciVar.zza(this.zzb, C5712r.m22812a(str));
        } else {
            builder.authority(str2);
            zzaciVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).m5260v0());
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e10) {
            zza.m12508c("Error parsing URL for auth domain check: " + str + ". " + e10.getMessage(), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(zzacj zzacjVar) {
        onPostExecute((zzacj) null);
    }
}
