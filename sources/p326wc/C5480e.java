package p326wc;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.p040zt.shareextend.ShareExtendProvider;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: wc.e */
/* loaded from: classes2.dex */
public class C5480e {
    /* renamed from: a */
    public static Uri m21712a(Context context, File file) {
        return ShareExtendProvider.m6101d(context.getPackageName() + ".shareextend.fileprovider", file.getAbsolutePath());
    }

    /* renamed from: b */
    public static void m21713b(Context context, List<Uri> list, Intent intent) {
        try {
            for (Uri uri : list) {
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
                while (it.hasNext()) {
                    context.grantUriPermission(it.next().activityInfo.packageName, uri, 3);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public static boolean m21714c(String str) {
        return str.startsWith(Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    /* renamed from: d */
    public static boolean m21715d(String str) {
        return Build.VERSION.SDK_INT >= 23 && m21714c(str);
    }

    /* renamed from: e */
    public static boolean m21716e(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (m21715d(it.next())) {
                return true;
            }
        }
        return false;
    }
}
