package p099g9;

import android.R;
import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.C1286c;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.atomic.AtomicInteger;
import p329x.C5494l;
import p345y.C5782a;

/* renamed from: g9.c */
/* loaded from: classes.dex */
public final class C2163c {

    /* renamed from: a */
    public static final AtomicInteger f8657a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: g9.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final C5494l.e f8658a;

        /* renamed from: b */
        public final String f8659b;

        /* renamed from: c */
        public final int f8660c;

        public a(C5494l.e eVar, String str, int i10) {
            this.f8658a = eVar;
            this.f8659b = str;
            this.f8660c = i10;
        }
    }

    /* renamed from: a */
    public static PendingIntent m8708a(Context context, C1286c c1286c, String str, PackageManager packageManager) {
        Intent m8713f = m8713f(str, c1286c, packageManager);
        if (m8713f == null) {
            return null;
        }
        m8713f.addFlags(67108864);
        m8713f.putExtras(c1286c.m5507y());
        if (m8724q(c1286c)) {
            m8713f.putExtra("gcm.n.analytics_data", c1286c.m5506x());
        }
        return PendingIntent.getActivity(context, m8714g(), m8713f, m8719l(1073741824));
    }

    /* renamed from: b */
    public static PendingIntent m8709b(Context context, Context context2, C1286c c1286c) {
        if (m8724q(c1286c)) {
            return m8710c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c1286c.m5506x()));
        }
        return null;
    }

    /* renamed from: c */
    public static PendingIntent m8710c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, m8714g(), new Intent(FirebaseMessagingService.ACTION_REMOTE_INTENT).setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), m8719l(1073741824));
    }

    /* renamed from: d */
    public static a m8711d(Context context, Context context2, C1286c c1286c, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        C5494l.e eVar = new C5494l.e(context2, str);
        String m5500n = c1286c.m5500n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(m5500n)) {
            eVar.m21900u(m5500n);
        }
        String m5500n2 = c1286c.m5500n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(m5500n2)) {
            eVar.m21899t(m5500n2);
            eVar.m21873P(new C5494l.c().m21849x(m5500n2));
        }
        eVar.m21871N(m8720m(packageManager, resources, packageName, c1286c.m5502p("gcm.n.icon"), bundle));
        Uri m8721n = m8721n(packageName, c1286c, resources);
        if (m8721n != null) {
            eVar.m21872O(m8721n);
        }
        eVar.m21898s(m8708a(context, c1286c, packageName, packageManager));
        PendingIntent m8709b = m8709b(context, context2, c1286c);
        if (m8709b != null) {
            eVar.m21902w(m8709b);
        }
        Integer m8715h = m8715h(context2, c1286c.m5502p("gcm.n.color"), bundle);
        if (m8715h != null) {
            eVar.m21896q(m8715h.intValue());
        }
        eVar.m21892m(!c1286c.m5488a("gcm.n.sticky"));
        eVar.m21862E(c1286c.m5488a("gcm.n.local_only"));
        String m5502p = c1286c.m5502p("gcm.n.ticker");
        if (m5502p != null) {
            eVar.m21875R(m5502p);
        }
        Integer m5499m = c1286c.m5499m();
        if (m5499m != null) {
            eVar.m21866I(m5499m.intValue());
        }
        Integer m5504r = c1286c.m5504r();
        if (m5504r != null) {
            eVar.m21879V(m5504r.intValue());
        }
        Integer m5498l = c1286c.m5498l();
        if (m5498l != null) {
            eVar.m21863F(m5498l.intValue());
        }
        Long m5496j = c1286c.m5496j("gcm.n.event_time");
        if (m5496j != null) {
            eVar.m21869L(true);
            eVar.m21880W(m5496j.longValue());
        }
        long[] m5503q = c1286c.m5503q();
        if (m5503q != null) {
            eVar.m21878U(m5503q);
        }
        int[] m5491e = c1286c.m5491e();
        if (m5491e != null) {
            eVar.m21861D(m5491e[0], m5491e[1], m5491e[2]);
        }
        eVar.m21901v(m8716i(c1286c));
        return new a(eVar, m8722o(c1286c), 0);
    }

    /* renamed from: e */
    public static a m8712e(Context context, C1286c c1286c) {
        Bundle m8717j = m8717j(context.getPackageManager(), context.getPackageName());
        return m8711d(context, context, c1286c, m8718k(context, c1286c.m5497k(), m8717j), m8717j);
    }

    /* renamed from: f */
    public static Intent m8713f(String str, C1286c c1286c, PackageManager packageManager) {
        String m5502p = c1286c.m5502p("gcm.n.click_action");
        if (!TextUtils.isEmpty(m5502p)) {
            Intent intent = new Intent(m5502p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri m5492f = c1286c.m5492f();
        if (m5492f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(m5492f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    public static int m8714g() {
        return f8657a.incrementAndGet();
    }

    /* renamed from: h */
    public static Integer m8715h(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
            try {
                return Integer.valueOf(C5782a.getColor(context, i10));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: i */
    public static int m8716i(C1286c c1286c) {
        boolean m5488a = c1286c.m5488a("gcm.n.default_sound");
        ?? r02 = m5488a;
        if (c1286c.m5488a("gcm.n.default_vibrate_timings")) {
            r02 = (m5488a ? 1 : 0) | 2;
        }
        return c1286c.m5488a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    /* renamed from: j */
    public static Bundle m8717j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    /* renamed from: k */
    public static String m8718k(Context context, String str, Bundle bundle) {
        String str2;
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static int m8719l(int i10) {
        return Build.VERSION.SDK_INT >= 23 ? i10 | 67108864 : i10;
    }

    /* renamed from: m */
    public static int m8720m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m8723p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m8723p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !m8723p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        return (i10 == 0 || !m8723p(resources, i10)) ? R.drawable.sym_def_app_icon : i10;
    }

    /* renamed from: n */
    public static Uri m8721n(String str, C1286c c1286c, Resources resources) {
        String m5501o = c1286c.m5501o();
        if (TextUtils.isEmpty(m5501o)) {
            return null;
        }
        if ("default".equals(m5501o) || resources.getIdentifier(m5501o, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + m5501o);
    }

    /* renamed from: o */
    public static String m8722o(C1286c c1286c) {
        String m5502p = c1286c.m5502p("gcm.n.tag");
        if (!TextUtils.isEmpty(m5502p)) {
            return m5502p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    /* renamed from: p */
    public static boolean m8723p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    /* renamed from: q */
    public static boolean m8724q(C1286c c1286c) {
        return c1286c.m5488a("google.c.a.e");
    }
}
