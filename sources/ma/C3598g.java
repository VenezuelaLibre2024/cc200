package ma;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;
import p129ia.EnumC2673e;

/* renamed from: ma.g */
/* loaded from: classes.dex */
public final class C3598g {

    /* renamed from: a */
    public static final String f12670a = "g";

    /* renamed from: b */
    public static final Pattern f12671b = Pattern.compile(",");

    /* renamed from: a */
    public static Map<EnumC2673e, Object> m13331a(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC2673e.class);
        for (EnumC2673e enumC2673e : EnumC2673e.values()) {
            if (enumC2673e != EnumC2673e.CHARACTER_SET && enumC2673e != EnumC2673e.NEED_RESULT_POINT_CALLBACK && enumC2673e != EnumC2673e.POSSIBLE_FORMATS) {
                String name = enumC2673e.name();
                if (extras.containsKey(name)) {
                    if (enumC2673e.m10882b().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(name);
                        if (!enumC2673e.m10882b().isInstance(obj)) {
                            Log.w(f12670a, "Ignoring hint " + enumC2673e + " because it is not assignable from " + obj);
                        }
                    }
                    enumMap.put((EnumMap) enumC2673e, (EnumC2673e) obj);
                }
            }
        }
        Log.i(f12670a, "Hints from the Intent: " + enumMap);
        return enumMap;
    }
}
