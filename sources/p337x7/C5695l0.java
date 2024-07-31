package p337x7;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p377firebaseauthapi.zzac;
import com.google.android.gms.internal.p377firebaseauthapi.zzxv;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p108h6.C2394s;
import p154k6.C3363a;
import p207o6.C3934c;
import p285u.C4771a;

/* renamed from: x7.l0 */
/* loaded from: classes.dex */
public final class C5695l0 {

    /* renamed from: a */
    public static final C3363a f21209a = new C3363a("JSONParser", new String[0]);

    /* renamed from: a */
    public static List<Object> m22781a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = m22781a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m22783c((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static Map<String, Object> m22782b(String str) {
        C2394s.m9613f(str);
        List<String> zza = zzac.zza('.').zza((CharSequence) str);
        if (zza.size() < 2) {
            f21209a.m12508c("Invalid idToken " + str, new Object[0]);
            return new HashMap();
        }
        try {
            Map<String, Object> m22784d = m22784d(new String(C3934c.m14928b(zza.get(1)), "UTF-8"));
            return m22784d == null ? new HashMap() : m22784d;
        } catch (UnsupportedEncodingException e10) {
            f21209a.m12507b("Unable to decode token", e10, new Object[0]);
            return new HashMap();
        }
    }

    /* renamed from: c */
    public static Map<String, Object> m22783c(JSONObject jSONObject) {
        C4771a c4771a = new C4771a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m22781a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m22783c((JSONObject) obj);
            }
            c4771a.put(next, obj);
        }
        return c4771a;
    }

    /* renamed from: d */
    public static Map<String, Object> m22784d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m22783c(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzxv(e10);
        }
    }
}
