package io.flutter.util;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* loaded from: classes2.dex */
public final class PathUtils {
    public static String getCacheDirectory(Context context) {
        File cacheDir;
        if (Build.VERSION.SDK_INT < 21 || (cacheDir = context.getCodeCacheDir()) == null) {
            cacheDir = context.getCacheDir();
        }
        if (cacheDir == null) {
            cacheDir = new File(getDataDirPath(context), "cache");
        }
        return cacheDir.getPath();
    }

    private static String getDataDirPath(Context context) {
        return Build.VERSION.SDK_INT >= 24 ? context.getDataDir().getPath() : context.getApplicationInfo().dataDir;
    }

    public static String getDataDirectory(Context context) {
        File dir = context.getDir("flutter", 0);
        if (dir == null) {
            dir = new File(getDataDirPath(context), "app_flutter");
        }
        return dir.getPath();
    }

    public static String getFilesDir(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            filesDir = new File(getDataDirPath(context), "files");
        }
        return filesDir.getPath();
    }
}
