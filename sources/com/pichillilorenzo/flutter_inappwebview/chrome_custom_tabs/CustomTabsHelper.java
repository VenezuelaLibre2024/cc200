package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public class CustomTabsHelper {
    public static final String BETA_PACKAGE = "com.chrome.beta";
    public static final String DEV_PACKAGE = "com.chrome.dev";
    public static final String EXTRA_CUSTOM_TABS_KEEP_ALIVE = "android.support.customtabs.extra.KEEP_ALIVE";
    public static final String LOCAL_PACKAGE = "com.google.android.apps.chrome";
    public static final String STABLE_PACKAGE = "com.android.chrome";
    public static final String TAG = "CustomTabsHelper";
    private static String sPackageNameToUse;

    private CustomTabsHelper() {
    }

    public static void addKeepAliveExtra(Context context, Intent intent) {
        intent.putExtra(EXTRA_CUSTOM_TABS_KEEP_ALIVE, new Intent().setClassName(context.getPackageName(), KeepAliveService.class.getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
    
        if (r6.contains(com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabsHelper.LOCAL_PACKAGE) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getPackageNameToUse(android.content.Context r10) {
        /*
            java.lang.String r0 = com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabsHelper.sPackageNameToUse
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "http://www.example.com"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = "android.intent.action.VIEW"
            r1.<init>(r3, r2)
            java.lang.String r2 = "android.intent.category.BROWSABLE"
            r1.addCategory(r2)
            r2 = 0
            android.content.pm.ResolveInfo r3 = r0.resolveActivity(r1, r2)
            r4 = 0
            if (r3 == 0) goto L28
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            goto L29
        L28:
            r3 = r4
        L29:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 < r6) goto L32
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L33
        L32:
            r5 = r2
        L33:
            java.util.List r5 = r0.queryIntentActivities(r1, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L40:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r5.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = "android.support.customtabs.action.CustomTabsService"
            r8.setAction(r9)
            android.content.pm.ActivityInfo r9 = r7.activityInfo
            java.lang.String r9 = r9.packageName
            r8.setPackage(r9)
            android.content.pm.ResolveInfo r8 = r0.resolveService(r8, r2)
            if (r8 == 0) goto L40
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r7 = r7.packageName
            r6.add(r7)
            goto L40
        L6b:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L74
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabsHelper.sPackageNameToUse = r4
            goto Lbd
        L74:
            int r0 = r6.size()
            r4 = 1
            if (r0 != r4) goto L84
            java.lang.Object r10 = r6.get(r2)
            java.lang.String r10 = (java.lang.String) r10
        L81:
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabsHelper.sPackageNameToUse = r10
            goto Lbd
        L84:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L99
            boolean r10 = hasSpecializedHandlerIntents(r10, r1)
            if (r10 != 0) goto L99
            boolean r10 = r6.contains(r3)
            if (r10 == 0) goto L99
            com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabsHelper.sPackageNameToUse = r3
            goto Lbd
        L99:
            java.lang.String r10 = "com.android.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto La2
        La1:
            goto L81
        La2:
            java.lang.String r10 = "com.chrome.beta"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Lab
            goto La1
        Lab:
            java.lang.String r10 = "com.chrome.dev"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Lb4
            goto La1
        Lb4:
            java.lang.String r10 = "com.google.android.apps.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Lbd
            goto La1
        Lbd:
            java.lang.String r10 = com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabsHelper.sPackageNameToUse
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.CustomTabsHelper.getPackageNameToUse(android.content.Context):java.lang.String");
    }

    public static String[] getPackages() {
        return new String[]{"", STABLE_PACKAGE, BETA_PACKAGE, DEV_PACKAGE, LOCAL_PACKAGE};
    }

    private static boolean hasSpecializedHandlerIntents(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        try {
            queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            Log.e(TAG, "Runtime exception while getting specialized handlers");
        }
        if (queryIntentActivities != null && queryIntentActivities.size() != 0) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}