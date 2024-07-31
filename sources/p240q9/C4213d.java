package p240q9;

import android.net.Uri;
import android.text.TextUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p108h6.C2394s;

/* renamed from: q9.d */
/* loaded from: classes.dex */
public class C4213d {
    /* renamed from: a */
    public static String m16230a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) && !str.endsWith(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE) && !str.contains("//")) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, -1)) {
            if (!TextUtils.isEmpty(str2)) {
                if (sb2.length() > 0) {
                    sb2.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
                }
                sb2.append(str2);
            }
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static String m16231b(String str) {
        return TextUtils.isEmpty(str) ? "" : m16232c(Uri.encode(str));
    }

    /* renamed from: c */
    public static String m16232c(String str) {
        C2394s.m9619l(str);
        return str.replace("%2F", FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
    }
}
