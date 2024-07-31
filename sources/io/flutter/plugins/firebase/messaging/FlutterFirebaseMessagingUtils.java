package io.flutter.plugins.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import com.google.firebase.messaging.C1287d;
import com.google.firebase.messaging.FirebaseMessaging;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class FlutterFirebaseMessagingUtils {
    public static final String ACTION_REMOTE_MESSAGE = "io.flutter.plugins.firebase.messaging.NOTIFICATION";
    public static final String ACTION_TOKEN = "io.flutter.plugins.firebase.messaging.TOKEN";
    public static final String EXTRA_REMOTE_MESSAGE = "notification";
    public static final String EXTRA_TOKEN = "token";
    public static final String IS_AUTO_INIT_ENABLED = "isAutoInitEnabled";
    public static final int JOB_ID = 2020;
    private static final String KEY_COLLAPSE_KEY = "collapseKey";
    private static final String KEY_DATA = "data";
    private static final String KEY_FROM = "from";
    private static final String KEY_MESSAGE_ID = "messageId";
    private static final String KEY_MESSAGE_TYPE = "messageType";
    private static final String KEY_SENT_TIME = "sentTime";
    private static final String KEY_TO = "to";
    private static final String KEY_TTL = "ttl";
    public static final String SHARED_PREFERENCES_KEY = "io.flutter.firebase.messaging.callback";

    public static FirebaseMessaging getFirebaseMessagingForArguments(Map<String, Object> map) {
        return FirebaseMessaging.m5422r();
    }

    public static C1287d getRemoteMessageForArguments(Map<String, Object> map) {
        Object obj = map.get(Constants.MESSAGE);
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        Object obj2 = map2.get(KEY_TO);
        Objects.requireNonNull(obj2);
        C1287d.b bVar = new C1287d.b((String) obj2);
        String str = (String) map2.get(KEY_COLLAPSE_KEY);
        String str2 = (String) map2.get(KEY_MESSAGE_ID);
        String str3 = (String) map2.get(KEY_MESSAGE_TYPE);
        Integer num = (Integer) map2.get(KEY_TTL);
        Map<String, String> map3 = (Map) map2.get(KEY_DATA);
        if (str != null) {
            bVar.m5521b(str);
        }
        if (str3 != null) {
            bVar.m5524e(str3);
        }
        if (str2 != null) {
            bVar.m5523d(str2);
        }
        if (num != null) {
            bVar.m5525f(num.intValue());
        }
        if (map3 != null) {
            bVar.m5522c(map3);
        }
        return bVar.m5520a();
    }

    public static Map<String, Object> getRemoteMessageNotificationForArguments(Map<String, Object> map) {
        Object obj = map.get(Constants.MESSAGE);
        Objects.requireNonNull(obj);
        Map map2 = (Map) obj;
        if (map2.get(EXTRA_REMOTE_MESSAGE) == null) {
            return null;
        }
        return (Map) map2.get(EXTRA_REMOTE_MESSAGE);
    }

    public static boolean isApplicationForeground(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if ((keyguardManager != null && keyguardManager.isKeyguardLocked()) || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    private static Map<String, Object> remoteMessageNotificationToMap(C1287d.c cVar) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (cVar.m5541p() != null) {
            hashMap.put("title", cVar.m5541p());
        }
        if (cVar.m5543r() != null) {
            hashMap.put("titleLocKey", cVar.m5543r());
        }
        if (cVar.m5542q() != null) {
            hashMap.put("titleLocArgs", Arrays.asList(cVar.m5542q()));
        }
        if (cVar.m5527a() != null) {
            hashMap.put("body", cVar.m5527a());
        }
        if (cVar.m5529c() != null) {
            hashMap.put("bodyLocKey", cVar.m5529c());
        }
        if (cVar.m5528b() != null) {
            hashMap.put("bodyLocArgs", Arrays.asList(cVar.m5528b()));
        }
        if (cVar.m5530d() != null) {
            hashMap2.put("channelId", cVar.m5530d());
        }
        if (cVar.m5531e() != null) {
            hashMap2.put("clickAction", cVar.m5531e());
        }
        if (cVar.m5532f() != null) {
            hashMap2.put("color", cVar.m5532f());
        }
        if (cVar.m5533g() != null) {
            hashMap2.put("smallIcon", cVar.m5533g());
        }
        if (cVar.m5534h() != null) {
            hashMap2.put("imageUrl", cVar.m5534h().toString());
        }
        if (cVar.m5535i() != null) {
            hashMap2.put("link", cVar.m5535i().toString());
        }
        if (cVar.m5536k() != null) {
            hashMap2.put("count", cVar.m5536k());
        }
        if (cVar.m5537l() != null) {
            hashMap2.put("priority", cVar.m5537l());
        }
        if (cVar.m5538m() != null) {
            hashMap2.put("sound", cVar.m5538m());
        }
        if (cVar.m5540o() != null) {
            hashMap2.put("ticker", cVar.m5540o());
        }
        if (cVar.m5544s() != null) {
            hashMap2.put("visibility", cVar.m5544s());
        }
        if (cVar.m5539n() != null) {
            hashMap2.put("tag", cVar.m5539n());
        }
        hashMap.put("android", hashMap2);
        return hashMap;
    }

    public static Map<String, Object> remoteMessageToMap(C1287d c1287d) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (c1287d.m5508I() != null) {
            hashMap.put(KEY_COLLAPSE_KEY, c1287d.m5508I());
        }
        if (c1287d.m5510K() != null) {
            hashMap.put(KEY_FROM, c1287d.m5510K());
        }
        if (c1287d.m5517R() != null) {
            hashMap.put(KEY_TO, c1287d.m5517R());
        }
        if (c1287d.m5511L() != null) {
            hashMap.put(KEY_MESSAGE_ID, c1287d.m5511L());
        }
        if (c1287d.m5513N() != null) {
            hashMap.put(KEY_MESSAGE_TYPE, c1287d.m5513N());
        }
        if (c1287d.m5509J().size() > 0) {
            for (Map.Entry<String, String> entry : c1287d.m5509J().entrySet()) {
                hashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        hashMap.put(KEY_DATA, hashMap2);
        hashMap.put(KEY_TTL, Integer.valueOf(c1287d.m5518S()));
        hashMap.put(KEY_SENT_TIME, Long.valueOf(c1287d.m5516Q()));
        if (c1287d.m5514O() != null) {
            hashMap.put(EXTRA_REMOTE_MESSAGE, remoteMessageNotificationToMap(c1287d.m5514O()));
        }
        return hashMap;
    }
}
