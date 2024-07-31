package com.google.android.gms.internal.p377firebaseauthapi;

import org.json.JSONObject;
import p108h6.C2394s;

/* loaded from: classes.dex */
public final class zzagt implements zzacr {
    private String zza;
    private String zzb;

    public zzagt(String str, String str2) {
        this.zza = C2394s.m9613f(str);
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacr
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.zza);
        jSONObject.put("returnSecureToken", true);
        String str = this.zzb;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
