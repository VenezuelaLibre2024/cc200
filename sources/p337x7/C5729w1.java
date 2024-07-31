package p337x7;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import p108h6.C2394s;

/* renamed from: x7.w1 */
/* loaded from: classes.dex */
public final class C5729w1 {

    /* renamed from: a */
    public static C5729w1 f21269a = new C5729w1();

    /* renamed from: a */
    public static SharedPreferences m22826a(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", str), 0);
    }

    /* renamed from: b */
    public static C5729w1 m22827b() {
        return f21269a;
    }

    /* renamed from: f */
    public static void m22828f(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            edit.remove(it.next());
        }
        edit.apply();
    }

    /* renamed from: c */
    public final synchronized C5738z1 m22829c(Context context, String str, String str2) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        SharedPreferences m22826a = m22826a(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2);
        String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        String string = m22826a.getString(format, null);
        String string2 = m22826a.getString(format2, null);
        String string3 = m22826a.getString(format3, null);
        String string4 = m22826a.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
        String string5 = m22826a.getString(format4, null);
        SharedPreferences.Editor edit = m22826a.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.remove(format3);
        edit.remove(format4);
        edit.apply();
        if (string == null || string2 == null || string3 == null) {
            return null;
        }
        return new C5738z1(string, string2, string3, string4, string5);
    }

    /* renamed from: d */
    public final synchronized void m22830d(Context context, String str, String str2, String str3, String str4) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        SharedPreferences m22826a = m22826a(context, str);
        m22828f(m22826a);
        SharedPreferences.Editor edit = m22826a.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str3);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str4);
        edit.apply();
    }

    /* renamed from: e */
    public final synchronized void m22831e(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9613f(str3);
        C2394s.m9613f(str7);
        SharedPreferences m22826a = m22826a(context, str);
        m22828f(m22826a);
        SharedPreferences.Editor edit = m22826a.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2), str3);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str4);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2), str5);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str7);
        edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
        edit.apply();
    }

    /* renamed from: g */
    public final synchronized String m22832g(Context context, String str, String str2) {
        String string;
        String string2;
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        SharedPreferences m22826a = m22826a(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        string = m22826a.getString(format, null);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        string2 = m22826a.getString(format2, null);
        SharedPreferences.Editor edit = m22826a.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.apply();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string2;
    }
}
