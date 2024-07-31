package p159kb;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kb.a */
/* loaded from: classes.dex */
public class C3379a {
    /* renamed from: a */
    public static String m12576a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }
}
