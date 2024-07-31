package com.google.android.gms.internal.p377firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p207o6.C3938g;
import p207o6.C3946o;

/* loaded from: classes.dex */
public class zzafm extends AbstractC2601a implements zzacq<zzafm> {
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;
    private static final String zza = zzafm.class.getSimpleName();
    public static final Parcelable.Creator<zzafm> CREATOR = new zzafl();

    public zzafm() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    public zzafm(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public zzafm(String str, String str2, Long l10, String str3, Long l11) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l10;
        this.zze = str3;
        this.zzf = l11;
    }

    public static zzafm zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzafm zzafmVar = new zzafm();
            zzafmVar.zzb = jSONObject.optString("refresh_token", null);
            zzafmVar.zzc = jSONObject.optString("access_token", null);
            zzafmVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzafmVar.zze = jSONObject.optString("token_type", null);
            zzafmVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzafmVar;
        } catch (JSONException e10) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzxv(e10);
        }
    }

    @Override // com.google.android.gms.internal.p377firebaseauthapi.zzacq
    /* renamed from: zzd */
    public final zzafm zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = C3946o.m14965a(jSONObject.optString("refresh_token"));
            this.zzc = C3946o.m14965a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = C3946o.m14965a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e10) {
            throw zzahb.zza(e10, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 2, this.zzb, false);
        C2603c.m10456F(parcel, 3, this.zzc, false);
        C2603c.m10451A(parcel, 4, Long.valueOf(zza()), false);
        C2603c.m10456F(parcel, 5, this.zze, false);
        C2603c.m10451A(parcel, 6, Long.valueOf(this.zzf.longValue()), false);
        C2603c.m10466b(parcel, m10465a);
    }

    public final long zza() {
        Long l10 = this.zzd;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final void zzc(String str) {
        this.zzb = C2394s.m9613f(str);
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzxv(e10);
        }
    }

    public final boolean zzg() {
        return C3938g.m14938d().mo14932a() + 300000 < this.zzf.longValue() + (this.zzd.longValue() * 1000);
    }
}
