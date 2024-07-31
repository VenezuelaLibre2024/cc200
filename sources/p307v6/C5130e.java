package p307v6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;
import p108h6.C2394s;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

@Deprecated
/* renamed from: v6.e */
/* loaded from: classes.dex */
public class C5130e extends AbstractC2601a {
    public static final Parcelable.Creator<C5130e> CREATOR = new C5137l();

    /* renamed from: h */
    public final C5127b f19391h;

    /* renamed from: i */
    public final String f19392i;

    /* renamed from: j */
    public String f19393j;

    public C5130e(C5127b c5127b, String str, String str2) {
        this.f19391h = (C5127b) C2394s.m9619l(c5127b);
        this.f19393j = str;
        this.f19392i = str2;
    }

    /* renamed from: I */
    public String m20814I() {
        return this.f19392i;
    }

    /* renamed from: J */
    public String m20815J() {
        return this.f19393j;
    }

    /* renamed from: K */
    public C5127b m20816K() {
        return this.f19391h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5130e)) {
            return false;
        }
        C5130e c5130e = (C5130e) obj;
        String str = this.f19393j;
        if (str == null) {
            if (c5130e.f19393j != null) {
                return false;
            }
        } else if (!str.equals(c5130e.f19393j)) {
            return false;
        }
        if (!this.f19391h.equals(c5130e.f19391h)) {
            return false;
        }
        String str2 = this.f19392i;
        String str3 = c5130e.f19392i;
        if (str2 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str2.equals(str3)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f19393j;
        int hashCode = (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.f19391h.hashCode();
        String str2 = this.f19392i;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.f19391h.m20806I(), 11));
            if (this.f19391h.m20807J() != EnumC5128c.UNKNOWN) {
                jSONObject.put("version", this.f19391h.m20807J().toString());
            }
            if (this.f19391h.m20808K() != null) {
                jSONObject.put("transports", this.f19391h.m20808K().toString());
            }
            String str = this.f19393j;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.f19392i;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 2, m20816K(), i10, false);
        C2603c.m10456F(parcel, 3, m20815J(), false);
        C2603c.m10456F(parcel, 4, m20814I(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
