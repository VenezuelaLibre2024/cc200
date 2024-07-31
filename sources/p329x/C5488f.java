package p329x;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: x.f */
/* loaded from: classes.dex */
public final class C5488f {

    /* renamed from: x.f$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static <T> T m21788a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: b */
        public static int m21789b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        public static int m21790c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        public static String m21791d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: x.f$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static int m21792a(AppOpsManager appOpsManager, String str, int i10, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i10, str2);
        }

        /* renamed from: b */
        public static String m21793b(Context context) {
            return context.getOpPackageName();
        }

        /* renamed from: c */
        public static AppOpsManager m21794c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m21785a(Context context, int i10, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m21786b(context, str, str2);
        }
        AppOpsManager m21794c = b.m21794c(context);
        int m21792a = b.m21792a(m21794c, str, Binder.getCallingUid(), str2);
        return m21792a != 0 ? m21792a : b.m21792a(m21794c, str, i10, b.m21793b(context));
    }

    /* renamed from: b */
    public static int m21786b(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.m21790c((AppOpsManager) a.m21788a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    /* renamed from: c */
    public static String m21787c(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.m21791d(str);
        }
        return null;
    }
}
