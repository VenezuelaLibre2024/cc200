package p329x;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import p090g0.C1941a;
import p345y.C5782a;

/* renamed from: x.b */
/* loaded from: classes.dex */
public class C5484b extends C5782a {

    /* renamed from: a */
    public static h f20400a;

    /* renamed from: x.b$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ String[] f20401h;

        /* renamed from: i */
        public final /* synthetic */ Activity f20402i;

        /* renamed from: j */
        public final /* synthetic */ int f20403j;

        public a(String[] strArr, Activity activity, int i10) {
            this.f20401h = strArr;
            this.f20402i = activity;
            this.f20403j = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f20401h.length];
            PackageManager packageManager = this.f20402i.getPackageManager();
            String packageName = this.f20402i.getPackageName();
            int length = this.f20401h.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f20401h[i10], packageName);
            }
            ((g) this.f20402i).onRequestPermissionsResult(this.f20403j, this.f20401h, iArr);
        }
    }

    /* renamed from: x.b$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static void m21752a(Activity activity) {
            activity.finishAffinity();
        }

        /* renamed from: b */
        public static void m21753b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        /* renamed from: c */
        public static void m21754c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* renamed from: x.b$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public static void m21755a(Activity activity) {
            activity.finishAfterTransition();
        }

        /* renamed from: b */
        public static void m21756b(Activity activity) {
            activity.postponeEnterTransition();
        }

        /* renamed from: c */
        public static void m21757c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: d */
        public static void m21758d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        /* renamed from: e */
        public static void m21759e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: x.b$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: a */
        public static void m21760a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        /* renamed from: b */
        public static void m21761b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        /* renamed from: c */
        public static boolean m21762c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: x.b$e */
    /* loaded from: classes.dex */
    public static class e {
        /* renamed from: a */
        public static boolean m21763a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        public static boolean m21764b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    /* renamed from: x.b$f */
    /* loaded from: classes.dex */
    public static class f {
        /* renamed from: a */
        public static boolean m21765a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* renamed from: x.b$g */
    /* loaded from: classes.dex */
    public interface g {
        void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    /* renamed from: x.b$h */
    /* loaded from: classes.dex */
    public interface h {
        /* renamed from: a */
        boolean m21766a(Activity activity, String[] strArr, int i10);
    }

    /* renamed from: x.b$i */
    /* loaded from: classes.dex */
    public interface i {
        void validateRequestPermissionsRequestCode(int i10);
    }

    /* renamed from: b */
    public static void m21740b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            b.m21752a(activity);
        } else {
            activity.finish();
        }
    }

    /* renamed from: c */
    public static void m21741c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.m21755a(activity);
        } else {
            activity.finish();
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m21742d(Activity activity) {
        if (activity.isFinishing() || C5486d.m21775i(activity)) {
            return;
        }
        activity.recreate();
    }

    /* renamed from: e */
    public static void m21743e(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.m21756b(activity);
        }
    }

    /* renamed from: f */
    public static void m21744f(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: x.a
                @Override // java.lang.Runnable
                public final void run() {
                    C5484b.m21742d(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static void m21745g(Activity activity, String[] strArr, int i10) {
        h hVar = f20400a;
        if (hVar == null || !hVar.m21766a(activity, strArr, i10)) {
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < strArr.length; i11++) {
                if (TextUtils.isEmpty(strArr[i11])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
                if (!C1941a.m7848d() && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
            if (size > 0) {
                if (size == strArr.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < strArr.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr2[i12] = strArr[i13];
                        i12++;
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof i) {
                    ((i) activity).validateRequestPermissionsRequestCode(i10);
                }
                d.m21761b(activity, strArr, i10);
            } else if (activity instanceof g) {
                new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i10));
            }
        }
    }

    /* renamed from: h */
    public static void m21746h(Activity activity, AbstractC5503u abstractC5503u) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.m21757c(activity, null);
        }
    }

    /* renamed from: i */
    public static void m21747i(Activity activity, AbstractC5503u abstractC5503u) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.m21758d(activity, null);
        }
    }

    /* renamed from: j */
    public static boolean m21748j(Activity activity, String str) {
        if (!C1941a.m7848d() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 32) {
            return f.m21765a(activity, str);
        }
        if (i10 == 31) {
            return e.m21764b(activity, str);
        }
        if (i10 >= 23) {
            return d.m21762c(activity, str);
        }
        return false;
    }

    /* renamed from: k */
    public static void m21749k(Activity activity, Intent intent, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            b.m21753b(activity, intent, i10, bundle);
        } else {
            activity.startActivityForResult(intent, i10);
        }
    }

    /* renamed from: l */
    public static void m21750l(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            b.m21754c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
        }
    }

    /* renamed from: m */
    public static void m21751m(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            c.m21759e(activity);
        }
    }
}
