package com.google.android.gms.internal.p377firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;
import p108h6.C2394s;
import p154k6.C3363a;
import p321w7.C5360f;
import p321w7.C5376j;

/* loaded from: classes.dex */
public class zzaeo implements zzacr {
    private static final String zza = "zzaeo";
    private static final C3363a zzb = new C3363a(zzaeo.class.getSimpleName(), new String[0]);
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;

    public zzaeo(C5376j c5376j, String str, String str2) {
        this.zzc = C2394s.m9613f(c5376j.zzc());
        this.zzd = C2394s.m9613f(c5376j.zze());
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacr
    public final String zza() {
        C5360f m21490c = C5360f.m21490c(this.zzd);
        String m21492a = m21490c != null ? m21490c.m21492a() : null;
        String m21494d = m21490c != null ? m21490c.m21494d() : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.EMAIL, this.zzc);
        if (m21492a != null) {
            jSONObject.put("oobCode", m21492a);
        }
        if (m21494d != null) {
            jSONObject.put("tenantId", m21494d);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put(Constants.ID_TOKEN, str);
        }
        String str2 = this.zzf;
        if (str2 != null) {
            zzahb.zza(jSONObject, "captchaResp", str2);
        } else {
            zzahb.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
