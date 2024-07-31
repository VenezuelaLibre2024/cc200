package p099g9;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: g9.l0 */
/* loaded from: classes.dex */
public final class C2185l0 {
    /* renamed from: a */
    public static SharedPreferences m8791a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* renamed from: b */
    public static boolean m8792b(Context context) {
        return m8791a(context).getBoolean("proxy_notification_initialized", false);
    }

    /* renamed from: c */
    public static void m8793c(Context context, boolean z10) {
        SharedPreferences.Editor edit = m8791a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z10);
        edit.apply();
    }
}
