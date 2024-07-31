package p238q7;

import android.os.Bundle;
import io.flutter.plugins.firebase.crashlytics.Constants;
import p034c7.C0824o7;
import p034c7.C0838p7;
import p126i7.AbstractC2651u;
import p126i7.AbstractC2657x;

/* renamed from: q7.a */
/* loaded from: classes.dex */
public final class C4196a {

    /* renamed from: a */
    public static final AbstractC2657x<String> f15148a = AbstractC2657x.m10827x("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");

    /* renamed from: b */
    public static final AbstractC2651u<String> f15149b = AbstractC2651u.m10775z("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    public static final AbstractC2651u<String> f15150c = AbstractC2651u.m10773x("auto", "app", "am");

    /* renamed from: d */
    public static final AbstractC2651u<String> f15151d = AbstractC2651u.m10772w("_r", "_dbg");

    /* renamed from: e */
    public static final AbstractC2651u<String> f15152e = new AbstractC2651u.a().m10782i(C0838p7.f3440a).m10782i(C0838p7.f3441b).m10784k();

    /* renamed from: f */
    public static final AbstractC2651u<String> f15153f = AbstractC2651u.m10772w("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: a */
    public static String m16185a(String str) {
        String m3683a = C0824o7.m3683a(str);
        return m3683a != null ? m3683a : str;
    }

    /* renamed from: b */
    public static void m16186b(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    /* renamed from: c */
    public static boolean m16187c(String str, Bundle bundle) {
        if (f15149b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        AbstractC2651u<String> abstractC2651u = f15151d;
        int size = abstractC2651u.size();
        int i10 = 0;
        while (i10 < size) {
            String str2 = abstractC2651u.get(i10);
            i10++;
            if (bundle.containsKey(str2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m16188d(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (f15152e.contains(str2)) {
            return false;
        }
        AbstractC2651u<String> abstractC2651u = f15153f;
        int size = abstractC2651u.size();
        int i10 = 0;
        while (i10 < size) {
            String str3 = abstractC2651u.get(i10);
            i10++;
            if (str2.matches(str3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m16189e(String str, String str2, Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m16191g(str) || bundle == null) {
            return false;
        }
        AbstractC2651u<String> abstractC2651u = f15151d;
        int size = abstractC2651u.size();
        int i10 = 0;
        while (i10 < size) {
            String str4 = abstractC2651u.get(i10);
            i10++;
            if (bundle.containsKey(str4)) {
                return false;
            }
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 101200:
                if (str.equals("fcm")) {
                    c10 = 0;
                    break;
                }
                break;
            case 101230:
                if (str.equals("fdl")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3142703:
                if (str.equals("fiam")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                str3 = "fcm_integration";
                break;
            case 1:
                str3 = "fdl_integration";
                break;
            case 2:
                str3 = "fiam_integration";
                break;
            default:
                return false;
        }
        bundle.putString("_cis", str3);
        return true;
    }

    /* renamed from: f */
    public static boolean m16190f(String str) {
        return !f15148a.contains(str);
    }

    /* renamed from: g */
    public static boolean m16191g(String str) {
        return !f15150c.contains(str);
    }
}
