package com.google.android.gms.internal.p377firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagi implements zzacq<zzagi> {
    private static final String zza = "zzagi";

    public String zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public zzagi zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("phoneSessionInfo") != null) {
                return (zzagm) ((zzagi) new zzagm().zza(str));
            }
            if (jSONObject.optJSONObject("totpSessionInfo") != null) {
                return (zzago) ((zzagi) new zzago().zza(str));
            }
            throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }
}
