package p119i0;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: i0.f */
/* loaded from: classes.dex */
public final class C2578f {

    /* renamed from: a */
    public static final Locale f10134a = new Locale("", "");

    /* renamed from: i0.f$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static int m10327a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    /* renamed from: a */
    public static int m10325a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m10326b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return a.m10327a(locale);
        }
        if (locale == null || locale.equals(f10134a)) {
            return 0;
        }
        String m10303c = C2574b.m10303c(locale);
        return m10303c == null ? m10325a(locale) : (m10303c.equalsIgnoreCase("Arab") || m10303c.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
