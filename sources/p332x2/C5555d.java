package p332x2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* renamed from: x2.d */
/* loaded from: classes.dex */
public class C5555d {
    /* renamed from: a */
    public static PackageInfo m22365a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        return Build.VERSION.SDK_INT < 33 ? packageManager.getPackageInfo(packageName, 4096) : packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096L));
    }

    /* renamed from: b */
    public static boolean m22366b(Context context, String str) {
        try {
            String[] strArr = m22365a(context).requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }
}
