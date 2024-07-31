package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* renamed from: androidx.profileinstaller.a */
/* loaded from: classes.dex */
public class C0383a {

    /* renamed from: androidx.profileinstaller.a$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static File m1925a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* renamed from: androidx.profileinstaller.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static File m1926a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    /* renamed from: a */
    public static boolean m1923a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z10 = true;
        for (File file2 : listFiles) {
            z10 = m1923a(file2) && z10;
        }
        return z10;
    }

    /* renamed from: b */
    public static void m1924b(Context context, ProfileInstallReceiver.C0379a c0379a) {
        int i10 = Build.VERSION.SDK_INT;
        c0379a.mo1908b(m1923a(i10 >= 24 ? b.m1926a(context) : i10 >= 23 ? a.m1925a(context) : context.getCacheDir()) ? 14 : 15, null);
    }
}
