package p321w7;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzagq;
import com.google.android.gms.internal.p377firebaseauthapi.zzxv;
import org.json.JSONException;
import org.json.JSONObject;
import p108h6.C2394s;
import p125i6.C2603c;

/* renamed from: w7.x0 */
/* loaded from: classes.dex */
public class C5421x0 extends AbstractC5377j0 {
    public static final Parcelable.Creator<C5421x0> CREATOR = new C5413u1();

    /* renamed from: h */
    public final String f20247h;

    /* renamed from: i */
    public final String f20248i;

    /* renamed from: j */
    public final long f20249j;

    /* renamed from: k */
    public final zzagq f20250k;

    public C5421x0(String str, String str2, long j10, zzagq zzagqVar) {
        this.f20247h = C2394s.m9613f(str);
        this.f20248i = str2;
        this.f20249j = j10;
        this.f20250k = (zzagq) C2394s.m9620m(zzagqVar, "totpInfo cannot be null.");
    }

    /* renamed from: L */
    public static C5421x0 m21570L(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long optLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new C5421x0(jSONObject.optString("uid"), jSONObject.optString("displayName"), optLong, new zzagq());
    }

    @Override // p321w7.AbstractC5377j0
    /* renamed from: I */
    public long mo21512I() {
        return this.f20249j;
    }

    @Override // p321w7.AbstractC5377j0
    /* renamed from: J */
    public String mo21513J() {
        return "totp";
    }

    @Override // p321w7.AbstractC5377j0
    /* renamed from: K */
    public JSONObject mo21514K() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f20247h);
            jSONObject.putOpt("displayName", this.f20248i);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f20249j));
            jSONObject.putOpt("totpInfo", this.f20250k);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxv(e10);
        }
    }

    @Override // p321w7.AbstractC5377j0
    /* renamed from: b */
    public String mo21515b() {
        return this.f20247h;
    }

    @Override // p321w7.AbstractC5377j0
    /* renamed from: s */
    public String mo21516s() {
        return this.f20248i;
    }

    @Override // android.os.Parcelable
    @SuppressLint({"FirebaseUnknownNullness"})
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, mo21515b(), false);
        C2603c.m10456F(parcel, 2, mo21516s(), false);
        C2603c.m10489y(parcel, 3, mo21512I());
        C2603c.m10454D(parcel, 4, this.f20250k, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
