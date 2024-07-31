package p293u7;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p108h6.C2394s;
import p285u.C4771a;

/* renamed from: u7.c */
/* loaded from: classes.dex */
public class C4989c {
    /* renamed from: a */
    public static Map<String, Object> m19557a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m19560d(jSONObject);
            }
            return null;
        } catch (Exception e10) {
            C4988b.m19551f().m19553b("Failed to parse JSONObject into Map:\n" + e10);
            return Collections.emptyMap();
        }
    }

    /* renamed from: b */
    public static Map<String, Object> m19558b(String str) {
        C4988b m19551f;
        StringBuilder sb2;
        C2394s.m9613f(str);
        String[] split = str.split("\\.", -1);
        if (split.length < 2) {
            m19551f = C4988b.m19551f();
            sb2 = new StringBuilder();
            sb2.append("Invalid token (too few subsections):\n");
            sb2.append(str);
        } else {
            try {
                Map<String, Object> m19557a = m19557a(new String(Base64.decode(split[1], 11), "UTF-8"));
                return m19557a == null ? Collections.emptyMap() : m19557a;
            } catch (UnsupportedEncodingException e10) {
                m19551f = C4988b.m19551f();
                sb2 = new StringBuilder();
                sb2.append("Unable to decode token (charset unknown):\n");
                sb2.append(e10);
            }
        }
        m19551f.m19555d(sb2.toString());
        return Collections.emptyMap();
    }

    /* renamed from: c */
    public static List<Object> m19559c(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONArray) {
                obj = m19559c((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m19560d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: d */
    public static Map<String, Object> m19560d(JSONObject jSONObject) {
        C4771a c4771a = new C4771a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m19559c((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m19560d((JSONObject) obj);
            } else if (obj.equals(JSONObject.NULL)) {
                obj = null;
            }
            c4771a.put(next, obj);
        }
        return c4771a;
    }
}
