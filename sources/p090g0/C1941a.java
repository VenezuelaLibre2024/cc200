package p090g0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* renamed from: g0.a */
/* loaded from: classes.dex */
public class C1941a {

    /* renamed from: a */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f7743a;

    /* renamed from: b */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f7744b;

    /* renamed from: c */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f7745c;

    /* renamed from: d */
    @SuppressLint({"CompileTimeConstant"})
    public static final int f7746d;

    /* renamed from: g0.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final int f7747a = SdkExtensions.getExtensionVersion(30);

        /* renamed from: b */
        public static final int f7748b = SdkExtensions.getExtensionVersion(31);

        /* renamed from: c */
        public static final int f7749c = SdkExtensions.getExtensionVersion(33);

        /* renamed from: d */
        public static final int f7750d = SdkExtensions.getExtensionVersion(1000000);
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f7743a = i10 >= 30 ? a.f7747a : 0;
        f7744b = i10 >= 30 ? a.f7748b : 0;
        f7745c = i10 >= 30 ? a.f7749c : 0;
        f7746d = i10 >= 30 ? a.f7750d : 0;
    }

    /* renamed from: a */
    public static boolean m7845a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m7846b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @SuppressLint({"RestrictedApi"})
    @Deprecated
    /* renamed from: c */
    public static boolean m7847c() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 31 || (i10 >= 30 && m7845a("S", Build.VERSION.CODENAME));
    }

    /* renamed from: d */
    public static boolean m7848d() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 33 || (i10 >= 32 && m7845a("Tiramisu", Build.VERSION.CODENAME));
    }
}
