package com.google.android.gms.internal.p377firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import p207o6.C3946o;

/* loaded from: classes.dex */
public class zzagg implements zzacq<zzagg> {
    private static final String zza = "zzagg";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private long zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagg zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = C3946o.m14965a(jSONObject.optString(Constants.ID_TOKEN, null));
            this.zzc = C3946o.m14965a(jSONObject.optString("displayName", null));
            this.zzd = C3946o.m14965a(jSONObject.optString(Constants.EMAIL, null));
            this.zze = C3946o.m14965a(jSONObject.optString("refreshToken", null));
            this.zzf = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zze;
    }
}
