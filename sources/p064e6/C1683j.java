package p064e6;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p108h6.C2348c1;
import p108h6.C2394s;
import p207o6.C3939h;
import p207o6.C3944m;
import p207o6.C3947p;
import p207o6.C3949r;
import p237q6.C4195c;

/* renamed from: e6.j */
/* loaded from: classes.dex */
public class C1683j {

    /* renamed from: a */
    @Deprecated
    public static final int f6269a = 12451000;

    /* renamed from: c */
    public static boolean f6271c = false;

    /* renamed from: d */
    public static boolean f6272d = false;

    /* renamed from: b */
    @Deprecated
    public static final AtomicBoolean f6270b = new AtomicBoolean();

    /* renamed from: e */
    public static final AtomicBoolean f6273e = new AtomicBoolean();

    @Deprecated
    /* renamed from: a */
    public static void m6723a(Context context, int i10) {
        int mo6698h = C1675f.m6715f().mo6698h(context, i10);
        if (mo6698h != 0) {
            Intent mo6694b = C1675f.m6715f().mo6694b(context, mo6698h, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + mo6698h);
            if (mo6694b != null) {
                throw new C1679h(mo6698h, "Google Play Services not available", mo6694b);
            }
            throw new C1677g(mo6698h);
        }
    }

    @Deprecated
    /* renamed from: b */
    public static int m6724b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    /* renamed from: c */
    public static String m6725c(int i10) {
        return C1667b.m6676N(i10);
    }

    /* renamed from: d */
    public static Context m6726d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Resources m6727e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m6728f(Context context) {
        try {
            if (!f6272d) {
                try {
                    PackageInfo m16180e = C4195c.m16183a(context).m16180e("com.google.android.gms", 64);
                    C1685k.m6736a(context);
                    if (m16180e == null || C1685k.m6738e(m16180e, false) || !C1685k.m6738e(m16180e, true)) {
                        f6271c = false;
                    } else {
                        f6271c = true;
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                }
            }
            return f6271c || !C3939h.m14940b();
        } finally {
            f6272d = true;
        }
    }

    @Deprecated
    /* renamed from: g */
    public static int m6729g(Context context, int i10) {
        String valueOf;
        String str;
        PackageInfo packageInfo;
        try {
            context.getResources().getString(C1687l.f6278a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f6273e.get()) {
            int m9517a = C2348c1.m9517a(context);
            if (m9517a == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (m9517a != f6269a) {
                throw new GooglePlayServicesIncorrectManifestValueException(m9517a);
            }
        }
        boolean z10 = (C3939h.m14942d(context) || C3939h.m14944f(context)) ? false : true;
        C2394s.m9608a(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                valueOf = String.valueOf(packageName);
                str = " requires the Google Play Store, but it is missing.";
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C1685k.m6736a(context);
            if (C1685k.m6738e(packageInfo2, true)) {
                if (z10) {
                    C2394s.m9619l(packageInfo);
                    if (!C1685k.m6738e(packageInfo, true)) {
                        valueOf = String.valueOf(packageName);
                        str = " requires Google Play Store, but its signature is invalid.";
                    }
                }
                if (!z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    if (C3949r.m14974a(packageInfo2.versionCode) >= C3949r.m14974a(i10)) {
                        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e10) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                                return 1;
                            }
                        }
                        return !applicationInfo.enabled ? 3 : 0;
                    }
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + packageInfo2.versionCode);
                    return 2;
                }
                valueOf = String.valueOf(packageName);
                str = " requires Google Play Store, but its signature doesn't match that of Google Play services.";
            } else {
                valueOf = String.valueOf(packageName);
                str = " requires Google Play services, but their signature is invalid.";
            }
            Log.w("GooglePlayServicesUtil", valueOf.concat(str));
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    /* renamed from: h */
    public static boolean m6730h(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return m6734l(context, "com.google.android.gms");
        }
        return false;
    }

    @TargetApi(18)
    /* renamed from: i */
    public static boolean m6731i(Context context) {
        if (!C3944m.m14954c()) {
            return false;
        }
        Object systemService = context.getSystemService(Constants.USER);
        C2394s.m9619l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    /* renamed from: j */
    public static boolean m6732j(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @TargetApi(19)
    @Deprecated
    /* renamed from: k */
    public static boolean m6733k(Context context, int i10, String str) {
        return C3947p.m14968b(context, i10, str);
    }

    @TargetApi(21)
    /* renamed from: l */
    public static boolean m6734l(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (C3944m.m14957f()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !m6731i(context);
    }
}
