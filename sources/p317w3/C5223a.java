package p317w3;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p222p5.C4041n0;
import p222p5.C4046r;

/* renamed from: w3.a */
/* loaded from: classes.dex */
public final class C5223a {
    /* renamed from: a */
    public static byte[] m21114a(byte[] bArr) {
        return C4041n0.f14513a >= 27 ? bArr : C4041n0.m15468l0(m21116c(C4041n0.m15399D(bArr)));
    }

    /* renamed from: b */
    public static byte[] m21115b(byte[] bArr) {
        if (C4041n0.f14513a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(C4041n0.m15399D(bArr));
            StringBuilder sb2 = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                sb2.append("{\"k\":\"");
                sb2.append(m21117d(jSONObject2.getString("k")));
                sb2.append("\",\"kid\":\"");
                sb2.append(m21117d(jSONObject2.getString("kid")));
                sb2.append("\",\"kty\":\"");
                sb2.append(jSONObject2.getString("kty"));
                sb2.append("\"}");
            }
            sb2.append("]}");
            return C4041n0.m15468l0(sb2.toString());
        } catch (JSONException e10) {
            C4046r.m15524d("ClearKeyUtil", "Failed to adjust response data: " + C4041n0.m15399D(bArr), e10);
            return bArr;
        }
    }

    /* renamed from: c */
    public static String m21116c(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    /* renamed from: d */
    public static String m21117d(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
