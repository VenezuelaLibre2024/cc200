package com.google.android.gms.internal.p377firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import p108h6.C2394s;
import p195n7.C3767g;
import p268s7.AbstractC4547c;
import p308v7.InterfaceC5140b;
import p309v8.InterfaceC5149i;

/* loaded from: classes.dex */
public final class zzacv {
    private Context zza;
    private zzado zzb;
    private String zzc;
    private final C3767g zzd;
    private boolean zze;
    private String zzf;

    public zzacv(Context context, C3767g c3767g, String str) {
        this.zze = false;
        this.zza = (Context) C2394s.m9619l(context);
        this.zzd = (C3767g) C2394s.m9619l(c3767g);
        this.zzc = String.format("Android/%s/%s", "Fallback", str);
    }

    public zzacv(C3767g c3767g, String str) {
        this(c3767g.m14349m(), c3767g, str);
    }

    private static String zza(C3767g c3767g) {
        InterfaceC5140b interfaceC5140b = FirebaseAuth.getInstance(c3767g).m5260v0().get();
        if (interfaceC5140b == null) {
            return null;
        }
        try {
            AbstractC4547c abstractC4547c = (AbstractC4547c) Tasks.await(interfaceC5140b.mo18541a(false));
            if (abstractC4547c.mo17979a() != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(abstractC4547c.mo17979a()));
            }
            return abstractC4547c.mo17980b();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e10.getMessage());
            return null;
        }
    }

    private static String zzb(C3767g c3767g) {
        InterfaceC5149i interfaceC5149i = FirebaseAuth.getInstance(c3767g).m5265y0().get();
        if (interfaceC5149i != null) {
            try {
                return (String) Tasks.await(interfaceC5149i.mo20828a());
            } catch (InterruptedException | ExecutionException e10) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e10.getMessage());
            }
        }
        return null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }

    public final void zza(URLConnection uRLConnection) {
        StringBuilder sb2;
        String str;
        if (this.zze) {
            String str2 = this.zzc;
            sb2 = new StringBuilder();
            sb2.append(str2);
            str = "/FirebaseUI-Android";
        } else {
            String str3 = this.zzc;
            sb2 = new StringBuilder();
            sb2.append(str3);
            str = "/FirebaseCore-Android";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        if (this.zzb == null) {
            this.zzb = new zzado(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzacu.zza());
        uRLConnection.setRequestProperty("X-Client-Version", sb3);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.m14351r().m14364c());
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String zza = zza(this.zzd);
        if (!TextUtils.isEmpty(zza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", zza);
        }
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }
}
