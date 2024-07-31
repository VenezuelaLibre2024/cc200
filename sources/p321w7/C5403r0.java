package p321w7;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzxv;
import io.flutter.plugins.firebase.auth.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import p108h6.C2394s;
import p125i6.C2603c;

/* renamed from: w7.r0 */
/* loaded from: classes.dex */
public class C5403r0 extends AbstractC5377j0 {
    public static final Parcelable.Creator<C5403r0> CREATOR = new C5407s1();

    /* renamed from: h */
    public final String f20235h;

    /* renamed from: i */
    public final String f20236i;

    /* renamed from: j */
    public final long f20237j;

    /* renamed from: k */
    public final String f20238k;

    public C5403r0(String str, String str2, long j10, String str3) {
        this.f20235h = C2394s.m9613f(str);
        this.f20236i = str2;
        this.f20237j = j10;
        this.f20238k = C2394s.m9613f(str3);
    }

    /* renamed from: L */
    public static C5403r0 m21550L(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new C5403r0(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // p321w7.AbstractC5377j0
    /* renamed from: I */
    public long mo21512I() {
        return this.f20237j;
    }

    @Override // p321w7.AbstractC5377j0
    /* renamed from: J */
    public String mo21513J() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }

    @Override // p321w7.AbstractC5377j0
    /* renamed from: K */
    public JSONObject mo21514K() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", Constants.SIGN_IN_METHOD_PHONE);
            jSONObject.putOpt("uid", this.f20235h);
            jSONObject.putOpt("displayName", this.f20236i);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f20237j));
            jSONObject.putOpt("phoneNumber", this.f20238k);
            return jSONObject;
        } catch (JSONException e10) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzxv(e10);
        }
    }

    @Override // p321w7.AbstractC5377j0
    /* renamed from: b */
    public String mo21515b() {
        return this.f20235h;
    }

    /* renamed from: m */
    public String m21551m() {
        return this.f20238k;
    }

    @Override // p321w7.AbstractC5377j0
    /* renamed from: s */
    public String mo21516s() {
        return this.f20236i;
    }

    @Override // android.os.Parcelable
    @SuppressLint({"FirebaseUnknownNullness"})
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10456F(parcel, 1, mo21515b(), false);
        C2603c.m10456F(parcel, 2, mo21516s(), false);
        C2603c.m10489y(parcel, 3, mo21512I());
        C2603c.m10456F(parcel, 4, m21551m(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
