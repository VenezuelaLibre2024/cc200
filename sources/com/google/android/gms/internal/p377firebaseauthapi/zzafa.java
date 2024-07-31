package com.google.android.gms.internal.p377firebaseauthapi;

import org.json.JSONObject;
import p108h6.C2394s;

/* loaded from: classes.dex */
public final class zzafa implements zzacr {
    private String zza = zzaey.REFRESH_TOKEN.toString();
    private String zzb;

    public zzafa(String str) {
        this.zzb = C2394s.m9613f(str);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacr
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }
}
