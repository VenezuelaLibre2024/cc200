package com.google.android.gms.internal.p377firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p207o6.C3946o;

/* loaded from: classes.dex */
public final class zzafu {
    private List<zzafr> zza;

    public zzafu() {
        this.zza = new ArrayList();
    }

    private zzafu(List<zzafr> list) {
        this.zza = !list.isEmpty() ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public static zzafu zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzafu(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            arrayList.add(jSONObject == null ? new zzafr() : new zzafr(C3946o.m14965a(jSONObject.optString("federatedId", null)), C3946o.m14965a(jSONObject.optString("displayName", null)), C3946o.m14965a(jSONObject.optString("photoUrl", null)), C3946o.m14965a(jSONObject.optString(Constants.PROVIDER_ID, null)), null, C3946o.m14965a(jSONObject.optString("phoneNumber", null)), C3946o.m14965a(jSONObject.optString(Constants.EMAIL, null))));
        }
        return new zzafu(arrayList);
    }

    public final List<zzafr> zza() {
        return this.zza;
    }
}
