package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class ImagePickerUtils {
    private static PackageInfo getPermissionsPackageInfoPreApi33(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 4096);
    }

    private static boolean isPermissionPresentInManifest(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return Arrays.asList((Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : getPermissionsPackageInfoPreApi33(packageManager, context.getPackageName())).requestedPermissions).contains(str);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean needRequestCameraPermission(Context context) {
        return (Build.VERSION.SDK_INT >= 23) && isPermissionPresentInManifest(context, "android.permission.CAMERA");
    }
}
