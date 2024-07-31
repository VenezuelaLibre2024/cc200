package p099g9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: g9.p0 */
/* loaded from: classes.dex */
public class C2193p0 {

    /* renamed from: e */
    public static C2193p0 f8720e;

    /* renamed from: a */
    public String f8721a = null;

    /* renamed from: b */
    public Boolean f8722b = null;

    /* renamed from: c */
    public Boolean f8723c = null;

    /* renamed from: d */
    public final Queue<Intent> f8724d = new ArrayDeque();

    /* renamed from: b */
    public static synchronized C2193p0 m8808b() {
        C2193p0 c2193p0;
        synchronized (C2193p0.class) {
            if (f8720e == null) {
                f8720e = new C2193p0();
            }
            c2193p0 = f8720e;
        }
        return c2193p0;
    }

    /* renamed from: a */
    public final int m8809a(Context context, Intent intent) {
        ComponentName startService;
        String m8813f = m8813f(context, intent);
        if (m8813f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + m8813f);
            }
            intent.setClassName(context.getPackageName(), m8813f);
        }
        try {
            if (m8812e(context)) {
                startService = C2213z0.m8883h(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e10) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
            return 402;
        } catch (SecurityException e11) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
            return 401;
        }
    }

    /* renamed from: c */
    public Intent m8810c() {
        return this.f8724d.poll();
    }

    /* renamed from: d */
    public boolean m8811d(Context context) {
        if (this.f8723c == null) {
            this.f8723c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f8722b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f8723c.booleanValue();
    }

    /* renamed from: e */
    public boolean m8812e(Context context) {
        if (this.f8722b == null) {
            this.f8722b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f8722b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f8722b.booleanValue();
    }

    /* renamed from: f */
    public final synchronized String m8813f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2;
        String str3 = this.f8721a;
        if (str3 != null) {
            return str3;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    str2 = context.getPackageName() + serviceInfo.name;
                } else {
                    str2 = serviceInfo.name;
                }
                this.f8721a = str2;
                return this.f8721a;
            }
            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + serviceInfo.name);
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* renamed from: g */
    public int m8814g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f8724d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m8809a(context, intent2);
    }
}
