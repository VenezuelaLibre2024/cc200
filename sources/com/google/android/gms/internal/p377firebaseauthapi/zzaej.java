package com.google.android.gms.internal.p377firebaseauthapi;

import io.flutter.plugins.firebase.crashlytics.Constants;
import org.json.JSONObject;
import p108h6.C2394s;

/* loaded from: classes.dex */
public final class zzaej implements zzacr {
    private String zza;
    private String zzb = "http://localhost";
    private final String zzc;

    public zzaej(String str, String str2) {
        this.zza = C2394s.m9613f(str);
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacr
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.IDENTIFIER, this.zza);
        jSONObject.put("continueUri", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
