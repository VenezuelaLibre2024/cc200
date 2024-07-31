package com.google.android.gms.internal.p377firebaseauthapi;

import org.json.JSONObject;
import p108h6.C2394s;

/* loaded from: classes.dex */
public final class zzaed {
    private final String zza;

    public zzaed(String str) {
        this.zza = C2394s.m9613f(str);
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.zza);
        return jSONObject;
    }
}
