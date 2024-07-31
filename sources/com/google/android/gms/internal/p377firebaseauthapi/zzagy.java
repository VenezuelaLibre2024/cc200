package com.google.android.gms.internal.p377firebaseauthapi;

import android.text.TextUtils;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p207o6.C3946o;

/* loaded from: classes.dex */
public class zzagy implements zzacq<zzagy> {
    private static final String zza = "zzagy";
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private List<zzafq> zzi;
    private String zzj;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagy zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = C3946o.m14965a(jSONObject.optString("localId", null));
            this.zzc = C3946o.m14965a(jSONObject.optString(Constants.EMAIL, null));
            this.zzd = C3946o.m14965a(jSONObject.optString("displayName", null));
            this.zze = C3946o.m14965a(jSONObject.optString(Constants.ID_TOKEN, null));
            this.zzf = C3946o.m14965a(jSONObject.optString("photoUrl", null));
            this.zzg = C3946o.m14965a(jSONObject.optString("refreshToken", null));
            this.zzh = jSONObject.optLong("expiresIn", 0L);
            this.zzi = zzafq.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzj = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    public final long zza() {
        return this.zzh;
    }

    public final String zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzj;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final List<zzafq> zze() {
        return this.zzi;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzj);
    }
}
