package p337x7;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p108h6.C2394s;
import p125i6.C2605e;

/* renamed from: x7.k1 */
/* loaded from: classes.dex */
public final class C5693k1 {

    /* renamed from: a */
    public static final Map<String, String> f21207a;

    static {
        HashMap hashMap = new HashMap();
        f21207a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    /* renamed from: a */
    public static Status m22777a(Intent intent) {
        C2394s.m9619l(intent);
        C2394s.m9608a(m22780d(intent));
        return (Status) C2605e.m10492b(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    /* renamed from: b */
    public static Status m22778b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString(Constants.MESSAGE);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map<String, String> map = f21207a;
                if (map.containsKey(string)) {
                    return C5712r.m22812a(map.get(string) + ":" + string2);
                }
            }
            return C5712r.m22812a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e10) {
            return C5712r.m22812a("WEB_INTERNAL_ERROR:" + str + "[ " + e10.getLocalizedMessage() + " ]");
        }
    }

    /* renamed from: c */
    public static void m22779c(Intent intent, Status status) {
        C2605e.m10495e(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    /* renamed from: d */
    public static boolean m22780d(Intent intent) {
        C2394s.m9619l(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }
}
