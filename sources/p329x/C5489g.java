package p329x;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: x.g */
/* loaded from: classes.dex */
public final class C5489g {

    /* renamed from: x.g$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static IBinder m21797a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: b */
        public static void m21798b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: x.g$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public static Method f20423a;

        /* renamed from: b */
        public static boolean f20424b;

        /* renamed from: c */
        public static Method f20425c;

        /* renamed from: d */
        public static boolean f20426d;

        /* renamed from: a */
        public static IBinder m21799a(Bundle bundle, String str) {
            if (!f20424b) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f20423a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", e10);
                }
                f20424b = true;
            }
            Method method2 = f20423a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", e11);
                    f20423a = null;
                }
            }
            return null;
        }

        /* renamed from: b */
        public static void m21800b(Bundle bundle, String str, IBinder iBinder) {
            if (!f20426d) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f20425c = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e10);
                }
                f20426d = true;
            }
            Method method2 = f20425c;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e11);
                    f20425c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m21795a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? a.m21797a(bundle, str) : b.m21799a(bundle, str);
    }

    /* renamed from: b */
    public static void m21796b(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            a.m21798b(bundle, str, iBinder);
        } else {
            b.m21800b(bundle, str, iBinder);
        }
    }
}
