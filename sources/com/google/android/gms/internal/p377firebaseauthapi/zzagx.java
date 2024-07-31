package com.google.android.gms.internal.p377firebaseauthapi;

import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;
import p108h6.C2394s;

/* loaded from: classes.dex */
public final class zzagx implements zzacr {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzagx() {
    }

    public static zzagx zza(String str, String str2, boolean z10) {
        zzagx zzagxVar = new zzagx();
        zzagxVar.zzb = C2394s.m9613f(str);
        zzagxVar.zzc = C2394s.m9613f(str2);
        zzagxVar.zzf = z10;
        return zzagxVar;
    }

    public static zzagx zzb(String str, String str2, boolean z10) {
        zzagx zzagxVar = new zzagx();
        zzagxVar.zza = C2394s.m9613f(str);
        zzagxVar.zzd = C2394s.m9613f(str2);
        zzagxVar.zzf = z10;
        return zzagxVar;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacr
    public final String zza() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("sessionInfo", this.zzb);
            str = this.zzc;
            str2 = "code";
        } else {
            jSONObject.put("phoneNumber", this.zza);
            str = this.zzd;
            str2 = "temporaryProof";
        }
        jSONObject.put(str2, str);
        String str3 = this.zze;
        if (str3 != null) {
            jSONObject.put(Constants.ID_TOKEN, str3);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zza(String str) {
        this.zze = str;
    }
}
