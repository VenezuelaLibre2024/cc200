package com.google.android.gms.internal.p377firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p207o6.C3946o;

/* loaded from: classes.dex */
public class zzafc implements zzacq<zzafc> {
    private static final String zza = "zzafc";
    private zzafe zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzafc zza(String str) {
        zzafe zzafeVar;
        int i10;
        zzafb zzafbVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z10 = false;
                    int i11 = 0;
                    while (i11 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                        if (jSONObject2 == null) {
                            zzafbVar = new zzafb();
                            i10 = i11;
                        } else {
                            i10 = i11;
                            zzafbVar = new zzafb(C3946o.m14965a(jSONObject2.optString("localId", null)), C3946o.m14965a(jSONObject2.optString(Constants.EMAIL, null)), jSONObject2.optBoolean("emailVerified", z10), C3946o.m14965a(jSONObject2.optString("displayName", null)), C3946o.m14965a(jSONObject2.optString("photoUrl", null)), zzafu.zza(jSONObject2.optJSONArray("providerUserInfo")), C3946o.m14965a(jSONObject2.optString("rawPassword", null)), C3946o.m14965a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzafq.zza(jSONObject2.optJSONArray("mfaInfo")), zzafp.zza(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzafbVar);
                        i11 = i10 + 1;
                        z10 = false;
                    }
                    zzafeVar = new zzafe(arrayList);
                }
                zzafeVar = new zzafe(new ArrayList());
            } else {
                zzafeVar = new zzafe();
            }
            this.zzb = zzafeVar;
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final List<zzafb> zza() {
        return this.zzb.zza();
    }
}
