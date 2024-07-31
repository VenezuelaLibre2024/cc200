package p159kb;

import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kb.b */
/* loaded from: classes.dex */
public class C3380b {
    /* renamed from: a */
    public static Map<String, Object> m12577a(int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(ImagePickerCache.MAP_KEY_TYPE, Integer.valueOf(i10));
        hashMap.put(Constants.MESSAGE, str);
        return hashMap;
    }
}
