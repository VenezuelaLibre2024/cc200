package com.google.android.gms.internal.p377firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p108h6.C2394s;

/* loaded from: classes.dex */
public final class zzafq {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzagq zze;
    private String zzf;

    private zzafq(String str, String str2, String str3, long j10, zzagq zzagqVar) {
        if (!TextUtils.isEmpty(str) && zzagqVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        }
        this.zza = str;
        this.zzb = C2394s.m9613f(str2);
        this.zzc = str3;
        this.zzd = j10;
        this.zze = zzagqVar;
    }

    private static long zza(String str) {
        try {
            return zzand.zza(zzand.zza(str));
        } catch (ParseException e10) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e10);
            return 0L;
        }
    }

    public static zzafq zza(JSONObject jSONObject) {
        zzafq zzafqVar = new zzafq(jSONObject.optString("phoneInfo", null), jSONObject.optString("mfaEnrollmentId", null), jSONObject.optString("displayName", null), zza(jSONObject.optString("enrolledAt", "")), jSONObject.opt("totpInfo") != null ? new zzagq() : null);
        zzafqVar.zzf = jSONObject.optString("unobfuscatedPhoneInfo");
        return zzafqVar;
    }

    public static List<zzafq> zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(zza(jSONArray.getJSONObject(i10)));
        }
        return arrayList;
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzagq zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }
}
