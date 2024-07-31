package p207o6;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: o6.o */
/* loaded from: classes.dex */
public class C3946o {

    /* renamed from: a */
    public static final Pattern f14196a = Pattern.compile("\\$\\{(.*?)\\}");

    /* renamed from: a */
    public static String m14965a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m14966b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
