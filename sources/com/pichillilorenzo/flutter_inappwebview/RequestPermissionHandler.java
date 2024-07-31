package com.pichillilorenzo.flutter_inappwebview;

import android.app.Activity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p329x.C5484b;
import p345y.C5782a;

/* loaded from: classes.dex */
public abstract class RequestPermissionHandler implements C5484b.g {
    private static Map<Integer, List<Runnable>> actionDictionary = new HashMap();

    public static void checkAndRun(Activity activity, String str, int i10, Runnable runnable) {
        if (C5782a.checkSelfPermission(activity.getApplicationContext(), str) == 0) {
            runnable.run();
            return;
        }
        if (actionDictionary.containsKey(Integer.valueOf(i10))) {
            actionDictionary.get(Integer.valueOf(i10)).add(runnable);
        } else {
            actionDictionary.put(Integer.valueOf(i10), Arrays.asList(runnable));
        }
        C5484b.m21745g(activity, new String[]{str}, i10);
    }

    @Override // p329x.C5484b.g
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (iArr.length <= 0 || iArr[0] != 0) {
            return;
        }
        List<Runnable> list = actionDictionary.get(Integer.valueOf(i10));
        for (Runnable runnable : list) {
            runnable.run();
            list.remove(runnable);
        }
    }
}
