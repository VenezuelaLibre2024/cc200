package com.google.android.gms.internal.p377firebaseauthapi;

import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONObject;
import p108h6.C2394s;

/* loaded from: classes.dex */
public final class zzagl implements zzagf {
    private final String zza;
    private final String zzb;

    private zzagl(String str, String str2) {
        this.zza = C2394s.m9613f(str);
        this.zzb = str2;
    }

    public static zzagl zza(String str, String str2) {
        return new zzagl(str, str2);
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacr
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.ID_TOKEN, this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            jSONObject.put("tenantId", this.zzb);
        }
        jSONObject.put("totpEnrollmentInfo", new JSONObject());
        return jSONObject.toString();
    }
}
