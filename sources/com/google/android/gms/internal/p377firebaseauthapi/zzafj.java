package com.google.android.gms.internal.p377firebaseauthapi;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p108h6.C2394s;
import p207o6.C3946o;

/* loaded from: classes.dex */
public class zzafj implements zzacq<zzafj> {
    private static final String zza = "zzafj";
    private String zzb;
    private zzaq<zzaft> zzc;

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacq
    /* renamed from: zzc */
    public final zzafj zza(String str) {
        zzaq<zzaft> zza2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = C3946o.m14965a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    zzap zzg = zzaq.zzg();
                    for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                        zzg.zza(jSONObject2 == null ? zzaft.zza(null, null) : zzaft.zza(C3946o.m14965a(jSONObject2.optString("provider")), C3946o.m14965a(jSONObject2.optString("enforcementState"))));
                    }
                    zza2 = zzg.zza();
                    this.zzc = zza2;
                }
                zza2 = zzaq.zza(new ArrayList());
                this.zzc = zza2;
            }
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb(String str) {
        C2394s.m9613f(str);
        zzaq<zzaft> zzaqVar = this.zzc;
        String str2 = null;
        if (zzaqVar != null && !zzaqVar.isEmpty()) {
            zzaq<zzaft> zzaqVar2 = this.zzc;
            int size = zzaqVar2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                zzaft zzaftVar = zzaqVar2.get(i10);
                i10++;
                zzaft zzaftVar2 = zzaftVar;
                String zza2 = zzaftVar2.zza();
                String zzb = zzaftVar2.zzb();
                if (zza2 != null && zzb != null && zzb.equals(str)) {
                    str2 = zzaftVar2.zza();
                    break;
                }
            }
        }
        if (str2 == null) {
            return false;
        }
        return str2.equals("ENFORCE") || str2.equals("AUDIT");
    }
}
