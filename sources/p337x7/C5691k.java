package p337x7;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
import p125i6.C2603c;
import p321w7.InterfaceC5345b0;

/* renamed from: x7.k */
/* loaded from: classes.dex */
public final class C5691k implements InterfaceC5345b0 {
    public static final Parcelable.Creator<C5691k> CREATOR = new C5688j();

    /* renamed from: h */
    public long f21203h;

    /* renamed from: i */
    public long f21204i;

    public C5691k(long j10, long j11) {
        this.f21203h = j10;
        this.f21204i = j11;
    }

    /* renamed from: b */
    public static C5691k m22775b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C5691k(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final JSONObject m22776a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f21203h);
            jSONObject.put("creationTimestamp", this.f21204i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p321w7.InterfaceC5345b0
    /* renamed from: o */
    public final long mo21441o() {
        return this.f21204i;
    }

    @Override // p321w7.InterfaceC5345b0
    /* renamed from: t */
    public final long mo21442t() {
        return this.f21203h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10489y(parcel, 1, mo21442t());
        C2603c.m10489y(parcel, 2, mo21441o());
        C2603c.m10466b(parcel, m10465a);
    }
}
