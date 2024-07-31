package com.google.android.gms.internal.p377firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzaek implements zzacq<zzaek> {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzaek";
    private String zzb;
    private int zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacq
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaek zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString(ImagePickerCache.MAP_KEY_ERROR));
            this.zzc = jSONObject.getInt("code");
            this.zzb = jSONObject.getString(Constants.MESSAGE);
            return this;
        } catch (NullPointerException | JSONException e10) {
            Log.e(zza, "Failed to parse error for string [" + str + "] with exception: " + e10.getMessage());
            throw new zzaah("Failed to parse error for string [" + str + "]", e10);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
