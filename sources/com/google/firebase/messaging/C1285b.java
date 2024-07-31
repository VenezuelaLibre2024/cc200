package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import java.util.concurrent.ExecutionException;
import p045d3.AbstractC1532d;
import p045d3.AbstractC1534f;
import p045d3.C1531c;
import p045d3.InterfaceC1535g;
import p045d3.InterfaceC1537i;
import p111h9.C2451a;
import p111h9.C2452b;
import p195n7.C3767g;
import p224p7.InterfaceC4059a;
import p369z8.C6083g;

/* renamed from: com.google.firebase.messaging.b */
/* loaded from: classes.dex */
public class C1285b {
    /* renamed from: A */
    public static boolean m5453A(Intent intent) {
        if (intent == null || m5473r(intent)) {
            return false;
        }
        return m5456a();
    }

    /* renamed from: B */
    public static boolean m5454B(Intent intent) {
        if (intent == null || m5473r(intent)) {
            return false;
        }
        return m5455C(intent.getExtras());
    }

    /* renamed from: C */
    public static boolean m5455C(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    public static boolean m5456a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C3767g.m14334o();
            Context m14349m = C3767g.m14334o().m14349m();
            SharedPreferences sharedPreferences = m14349m.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = m14349m.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m14349m.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    public static C2451a m5457b(C2451a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C2451a.a m9799h = C2451a.m9776p().m9804m(m5471p(extras)).m9796e(bVar).m9797f(m5461f(extras)).m9800i(m5468m()).m9802k(C2451a.d.ANDROID).m9799h(m5466k(extras));
        String m5463h = m5463h(extras);
        if (m5463h != null) {
            m9799h.m9798g(m5463h);
        }
        String m5470o = m5470o(extras);
        if (m5470o != null) {
            m9799h.m9803l(m5470o);
        }
        String m5458c = m5458c(extras);
        if (m5458c != null) {
            m9799h.m9794c(m5458c);
        }
        String m5464i = m5464i(extras);
        if (m5464i != null) {
            m9799h.m9793b(m5464i);
        }
        String m5460e = m5460e(extras);
        if (m5460e != null) {
            m9799h.m9795d(m5460e);
        }
        long m5469n = m5469n(extras);
        if (m5469n > 0) {
            m9799h.m9801j(m5469n);
        }
        return m9799h.m9792a();
    }

    /* renamed from: c */
    public static String m5458c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* renamed from: d */
    public static String m5459d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* renamed from: e */
    public static String m5460e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* renamed from: f */
    public static String m5461f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(C6083g.m24307q(C3767g.m14334o()).getId());
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: g */
    public static String m5462g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* renamed from: h */
    public static String m5463h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    /* renamed from: i */
    public static String m5464i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* renamed from: j */
    public static String m5465j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* renamed from: k */
    public static C2451a.c m5466k(Bundle bundle) {
        return (bundle == null || !C1286c.m5484t(bundle)) ? C2451a.c.DATA_MESSAGE : C2451a.c.DISPLAY_NOTIFICATION;
    }

    /* renamed from: l */
    public static String m5467l(Bundle bundle) {
        return (bundle == null || !C1286c.m5484t(bundle)) ? "data" : "display";
    }

    /* renamed from: m */
    public static String m5468m() {
        return C3767g.m14334o().m14349m().getPackageName();
    }

    /* renamed from: n */
    public static long m5469n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing project number", e10);
            }
        }
        C3767g m14334o = C3767g.m14334o();
        String m14367f = m14334o.m14351r().m14367f();
        if (m14367f != null) {
            try {
                return Long.parseLong(m14367f);
            } catch (NumberFormatException e11) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e11);
            }
        }
        String m14364c = m14334o.m14351r().m14364c();
        try {
            if (!m14364c.startsWith("1:")) {
                return Long.parseLong(m14364c);
            }
            String[] split = m14364c.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException e12) {
            Log.w("FirebaseMessaging", "error parsing app ID", e12);
            return 0L;
        }
    }

    /* renamed from: o */
    public static String m5470o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* renamed from: p */
    public static int m5471p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* renamed from: q */
    public static String m5472q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    public static boolean m5473r(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m5474s(Intent intent) {
        m5479x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m5475t(Intent intent) {
        m5479x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m5476u(Bundle bundle) {
        m5481z(bundle);
        m5479x("_no", bundle);
    }

    /* renamed from: v */
    public static void m5477v(Intent intent) {
        if (m5454B(intent)) {
            m5479x("_nr", intent.getExtras());
        }
        if (m5453A(intent)) {
            m5478w(C2451a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m5424w());
        }
    }

    /* renamed from: w */
    public static void m5478w(C2451a.b bVar, Intent intent, InterfaceC1537i interfaceC1537i) {
        if (interfaceC1537i == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C2451a m5457b = m5457b(bVar, intent);
        if (m5457b == null) {
            return;
        }
        try {
            interfaceC1537i.mo6240a("FCM_CLIENT_EVENT_LOGGING", C2452b.class, C1531c.m6232b("proto"), new InterfaceC1535g() { // from class: g9.g0
                @Override // p045d3.InterfaceC1535g
                public final Object apply(Object obj) {
                    return ((C2452b) obj).m9808c();
                }
            }).mo6238a(AbstractC1532d.m6235f(C2452b.m9806b().m9810b(m5457b).m9809a(), AbstractC1534f.m6237b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e10) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e10);
        }
    }

    /* renamed from: x */
    public static void m5479x(String str, Bundle bundle) {
        try {
            C3767g.m14334o();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String m5459d = m5459d(bundle);
            if (m5459d != null) {
                bundle2.putString("_nmid", m5459d);
            }
            String m5460e = m5460e(bundle);
            if (m5460e != null) {
                bundle2.putString("_nmn", m5460e);
            }
            String m5464i = m5464i(bundle);
            if (!TextUtils.isEmpty(m5464i)) {
                bundle2.putString("label", m5464i);
            }
            String m5462g = m5462g(bundle);
            if (!TextUtils.isEmpty(m5462g)) {
                bundle2.putString("message_channel", m5462g);
            }
            String m5470o = m5470o(bundle);
            if (m5470o != null) {
                bundle2.putString("_nt", m5470o);
            }
            String m5465j = m5465j(bundle);
            if (m5465j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(m5465j));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String m5472q = m5472q(bundle);
            if (m5472q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(m5472q));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String m5467l = m5467l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", m5467l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC4059a interfaceC4059a = (InterfaceC4059a) C3767g.m14334o().m14348k(InterfaceC4059a.class);
            if (interfaceC4059a != null) {
                interfaceC4059a.mo15613a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: y */
    public static void m5480y(boolean z10) {
        C3767g.m14334o().m14349m().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z10).apply();
    }

    /* renamed from: z */
    public static void m5481z(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        InterfaceC4059a interfaceC4059a = (InterfaceC4059a) C3767g.m14334o().m14348k(InterfaceC4059a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (interfaceC4059a == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        interfaceC4059a.mo15614b("fcm", "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", "Firebase");
        bundle2.putString("medium", FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE);
        bundle2.putString("campaign", string);
        interfaceC4059a.mo15613a("fcm", "_cmp", bundle2);
    }
}
