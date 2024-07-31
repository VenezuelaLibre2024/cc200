package p119i0;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: i0.b */
/* loaded from: classes.dex */
public final class C2574b {

    /* renamed from: a */
    public static Method f10107a;

    /* renamed from: b */
    public static Method f10108b;

    /* renamed from: i0.b$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static String m10304a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: i0.b$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static ULocale m10305a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        /* renamed from: b */
        public static ULocale m10306b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        /* renamed from: c */
        public static String m10307c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            if (i10 < 24) {
                try {
                    f10108b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            f10107a = cls.getMethod("getScript", String.class);
            f10108b = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception e11) {
            f10107a = null;
            f10108b = null;
            Log.w("ICUCompat", e11);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: a */
    public static String m10301a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f10108b;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException e10) {
            Log.w("ICUCompat", e10);
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: b */
    public static String m10302b(String str) {
        try {
            Method method = f10107a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException e10) {
            Log.w("ICUCompat", e10);
        }
        return null;
    }

    /* renamed from: c */
    public static String m10303c(Locale locale) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return b.m10307c(b.m10305a(b.m10306b(locale)));
        }
        if (i10 >= 21) {
            try {
                return a.m10304a((Locale) f10108b.invoke(null, locale));
            } catch (IllegalAccessException | InvocationTargetException e10) {
                Log.w("ICUCompat", e10);
                return a.m10304a(locale);
            }
        }
        String m10301a = m10301a(locale);
        if (m10301a != null) {
            return m10302b(m10301a);
        }
        return null;
    }
}
