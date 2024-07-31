package com.google.android.gms.internal.p377firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* loaded from: classes.dex */
public final class zzafp extends AbstractC2601a {
    public static final Parcelable.Creator<zzafp> CREATOR = new zzafs();
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzafp(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public static zzaq<zzafp> zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzaq.zza(new ArrayList());
        }
        zzap zzg = zzaq.zzg();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            zzg.zza(new zzafp(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzg.zza();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, this.zza, false);
        C2603c.m10456F(parcel, 2, this.zzb, false);
        C2603c.m10456F(parcel, 3, this.zzc, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
