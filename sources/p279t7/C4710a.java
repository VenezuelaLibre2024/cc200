package p279t7;

import android.util.Log;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p108h6.C2394s;
import p268s7.AbstractC4546b;
import p293u7.C4989c;

/* renamed from: t7.a */
/* loaded from: classes.dex */
public final class C4710a extends AbstractC4546b {

    /* renamed from: d */
    public static final String f17590d = "t7.a";

    /* renamed from: a */
    public final String f17591a;

    /* renamed from: b */
    public final long f17592b;

    /* renamed from: c */
    public final long f17593c;

    public C4710a(String str, long j10, long j11) {
        C2394s.m9613f(str);
        this.f17591a = str;
        this.f17593c = j10;
        this.f17592b = j11;
    }

    /* renamed from: c */
    public static C4710a m18523c(String str) {
        C2394s.m9619l(str);
        Map<String, Object> m19558b = C4989c.m19558b(str);
        long m18525f = m18525f(m19558b, "iat");
        return new C4710a(str, (m18525f(m19558b, "exp") - m18525f) * 1000, m18525f * 1000);
    }

    /* renamed from: d */
    public static C4710a m18524d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C4710a(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e10) {
            Log.e(f17590d, "Could not deserialize token: " + e10.getMessage());
            return null;
        }
    }

    /* renamed from: f */
    public static long m18525f(Map<String, Object> map, String str) {
        C2394s.m9619l(map);
        C2394s.m9613f(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @Override // p268s7.AbstractC4546b
    /* renamed from: a */
    public long mo17977a() {
        return this.f17592b + this.f17593c;
    }

    @Override // p268s7.AbstractC4546b
    /* renamed from: b */
    public String mo17978b() {
        return this.f17591a;
    }

    /* renamed from: e */
    public long m18526e() {
        return this.f17593c;
    }

    /* renamed from: g */
    public long m18527g() {
        return this.f17592b;
    }

    /* renamed from: h */
    public String m18528h() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", this.f17591a);
            jSONObject.put("receivedAt", this.f17592b);
            jSONObject.put("expiresIn", this.f17593c);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.e(f17590d, "Could not serialize token: " + e10.getMessage());
            return null;
        }
    }
}
