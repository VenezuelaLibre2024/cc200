package p108h6;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import p033c6.C0616b;
import p064e6.C1681i;
import p064e6.C1687l;
import p090g0.C1946f;
import p207o6.C3939h;
import p237q6.C4195c;
import p285u.C4777g;

/* renamed from: h6.f0 */
/* loaded from: classes.dex */
public final class C2356f0 {

    /* renamed from: a */
    public static final C4777g f9612a = new C4777g();

    /* renamed from: b */
    public static Locale f9613b;

    /* renamed from: a */
    public static String m9541a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C4195c.m16183a(context).m16179d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m9542b(Context context) {
        return context.getResources().getString(C0616b.f2742g);
    }

    /* renamed from: c */
    public static String m9543c(Context context, int i10) {
        return context.getResources().getString(i10 != 1 ? i10 != 2 ? i10 != 3 ? R.string.ok : C0616b.f2736a : C0616b.f2745j : C0616b.f2739d);
    }

    /* renamed from: d */
    public static String m9544d(Context context, int i10) {
        Resources resources = context.getResources();
        String m9541a = m9541a(context);
        if (i10 == 1) {
            return resources.getString(C0616b.f2740e, m9541a);
        }
        if (i10 == 2) {
            return C3939h.m14942d(context) ? resources.getString(C0616b.f2749n) : resources.getString(C0616b.f2746k, m9541a);
        }
        if (i10 == 3) {
            return resources.getString(C0616b.f2737b, m9541a);
        }
        if (i10 == 5) {
            return m9548h(context, "common_google_play_services_invalid_account_text", m9541a);
        }
        if (i10 == 7) {
            return m9548h(context, "common_google_play_services_network_error_text", m9541a);
        }
        if (i10 == 9) {
            return resources.getString(C0616b.f2744i, m9541a);
        }
        if (i10 == 20) {
            return m9548h(context, "common_google_play_services_restricted_profile_text", m9541a);
        }
        switch (i10) {
            case 16:
                return m9548h(context, "common_google_play_services_api_unavailable_text", m9541a);
            case 17:
                return m9548h(context, "common_google_play_services_sign_in_failed_text", m9541a);
            case 18:
                return resources.getString(C0616b.f2748m, m9541a);
            default:
                return resources.getString(C1687l.f6278a, m9541a);
        }
    }

    /* renamed from: e */
    public static String m9545e(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? m9548h(context, "common_google_play_services_resolution_required_text", m9541a(context)) : m9544d(context, i10);
    }

    /* renamed from: f */
    public static String m9546f(Context context, int i10) {
        String m9549i = i10 == 6 ? m9549i(context, "common_google_play_services_resolution_required_title") : m9547g(context, i10);
        return m9549i == null ? context.getResources().getString(C0616b.f2743h) : m9549i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* renamed from: g */
    public static String m9547g(Context context, int i10) {
        String str;
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(C0616b.f2741f);
            case 2:
                return resources.getString(C0616b.f2747l);
            case 3:
                return resources.getString(C0616b.f2738c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m9549i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m9549i(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 11:
                str = "The application is not licensed to the user.";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                str = "Unexpected error code " + i10;
                Log.e("GoogleApiAvailability", str);
                return null;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                Log.e("GoogleApiAvailability", str);
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m9549i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m9549i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    /* renamed from: h */
    public static String m9548h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String m9549i = m9549i(context, str);
        if (m9549i == null) {
            m9549i = resources.getString(C1687l.f6278a);
        }
        return String.format(resources.getConfiguration().locale, m9549i, str2);
    }

    /* renamed from: i */
    public static String m9549i(Context context, String str) {
        C4777g c4777g = f9612a;
        synchronized (c4777g) {
            Locale m7867c = C1946f.m7858a(context.getResources().getConfiguration()).m7867c(0);
            if (!m7867c.equals(f9613b)) {
                c4777g.clear();
                f9613b = m7867c;
            }
            String str2 = (String) c4777g.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources m6721e = C1681i.m6721e(context);
            if (m6721e == null) {
                return null;
            }
            int identifier = m6721e.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", "Missing resource: " + str);
                return null;
            }
            String string = m6721e.getString(identifier);
            if (!TextUtils.isEmpty(string)) {
                c4777g.put(str, string);
                return string;
            }
            Log.w("GoogleApiAvailability", "Got empty resource: " + str);
            return null;
        }
    }
}
