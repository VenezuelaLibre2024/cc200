package p329x;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* renamed from: x.j */
/* loaded from: classes.dex */
public final class C5492j {

    /* renamed from: x.j$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static Intent m21808a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        /* renamed from: b */
        public static boolean m21809b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        /* renamed from: c */
        public static boolean m21810c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    /* renamed from: a */
    public static Intent m21802a(Activity activity) {
        Intent m21808a;
        if (Build.VERSION.SDK_INT >= 16 && (m21808a = a.m21808a(activity)) != null) {
            return m21808a;
        }
        String m21804c = m21804c(activity);
        if (m21804c == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, m21804c);
        try {
            return m21805d(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m21804c + "' in manifest");
            return null;
        }
    }

    /* renamed from: b */
    public static Intent m21803b(Context context, ComponentName componentName) {
        String m21805d = m21805d(context, componentName);
        if (m21805d == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), m21805d);
        return m21805d(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: c */
    public static String m21804c(Activity activity) {
        try {
            return m21805d(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: d */
    public static String m21805d(Context context, ComponentName componentName) {
        String string;
        String str;
        PackageManager packageManager = context.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 640;
        if (i10 >= 29) {
            i11 = 269222528;
        } else if (i10 >= 24) {
            i11 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i11);
        if (i10 >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* renamed from: e */
    public static void m21806e(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            a.m21809b(activity, intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }

    /* renamed from: f */
    public static boolean m21807f(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return a.m21810c(activity, intent);
        }
        String action = activity.getIntent().getAction();
        return (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
    }
}
