package p099g9;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import androidx.window.layout.ExecutorC0412c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import p207o6.C3944m;

/* renamed from: g9.k0 */
/* loaded from: classes.dex */
public final class C2183k0 {
    /* renamed from: b */
    public static boolean m8774b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    /* renamed from: c */
    public static void m8775c(Context context) {
        if (C2185l0.m8792b(context)) {
            return;
        }
        m8777e(ExecutorC0412c.f1952h, context, m8778f(context));
    }

    /* renamed from: d */
    public static /* synthetic */ void m8776d(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        try {
            if (!m8774b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            C2185l0.m8793c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z10) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    @TargetApi(29)
    /* renamed from: e */
    public static Task<Void> m8777e(Executor executor, final Context context, final boolean z10) {
        if (!C3944m.m14961j()) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: g9.j0
            @Override // java.lang.Runnable
            public final void run() {
                C2183k0.m8776d(context, z10, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: f */
    public static boolean m8778f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
