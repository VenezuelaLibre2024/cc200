package p034c7;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p034c7.C0810n7;
import p108h6.C2394s;

/* renamed from: c7.ob */
/* loaded from: classes.dex */
public final class C0828ob {

    /* renamed from: b */
    public static final String[] f3416b = {"TcfDataEnabled", "GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* renamed from: a */
    public final Map<String, String> f3417a;

    public C0828ob(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        this.f3417a = hashMap;
        hashMap.putAll(map);
    }

    /* renamed from: a */
    public static int m3687a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static C0828ob m3688c(SharedPreferences sharedPreferences, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("TcfDataEnabled", z10 ? "1" : "0");
        String m3690f = m3690f(sharedPreferences, "IABTCF_VendorConsents");
        if (!"\u0000".equals(m3690f) && m3690f.length() > 754) {
            hashMap.put("GoogleConsent", String.valueOf(m3690f.charAt(754)));
        }
        int m3687a = m3687a(sharedPreferences, "IABTCF_gdprApplies");
        if (m3687a != -1) {
            hashMap.put("gdprApplies", String.valueOf(m3687a));
        }
        int m3687a2 = m3687a(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        if (m3687a2 != -1) {
            hashMap.put("EnableAdvertiserConsentMode", String.valueOf(m3687a2));
        }
        int m3687a3 = m3687a(sharedPreferences, "IABTCF_PolicyVersion");
        if (m3687a3 != -1) {
            hashMap.put("PolicyVersion", String.valueOf(m3687a3));
        }
        String m3690f2 = m3690f(sharedPreferences, "IABTCF_PurposeConsents");
        if (!"\u0000".equals(m3690f2)) {
            hashMap.put("PurposeConsents", m3690f2);
        }
        int m3687a4 = m3687a(sharedPreferences, "IABTCF_CmpSdkID");
        if (m3687a4 != -1) {
            hashMap.put("CmpSdkID", String.valueOf(m3687a4));
        }
        return new C0828ob(hashMap);
    }

    /* renamed from: d */
    public static String m3689d(String str, boolean z10) {
        if (!z10 || str.length() <= 4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i10 = 0;
        int i11 = 1;
        while (true) {
            if (i11 >= 64) {
                break;
            }
            if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11)) {
                i10 = i11;
                break;
            }
            i11++;
        }
        charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 | 1);
        return String.valueOf(charArray);
    }

    /* renamed from: f */
    public static String m3690f(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "\u0000");
        } catch (ClassCastException unused) {
            return "\u0000";
        }
    }

    /* renamed from: b */
    public final Bundle m3691b() {
        int m3695i;
        if (("1".equals(this.f3417a.get("TcfDataEnabled")) && "1".equals(this.f3417a.get("GoogleConsent")) && "1".equals(this.f3417a.get("gdprApplies")) && "1".equals(this.f3417a.get("EnableAdvertiserConsentMode"))) && (m3695i = m3695i()) >= 0) {
            String str = this.f3417a.get("PurposeConsents");
            if (TextUtils.isEmpty(str)) {
                return Bundle.EMPTY;
            }
            Bundle bundle = new Bundle();
            if (str.length() > 0) {
                bundle.putString(C0810n7.a.AD_STORAGE.f3361h, str.charAt(0) == '1' ? "granted" : "denied");
            }
            if (str.length() > 3) {
                bundle.putString(C0810n7.a.AD_PERSONALIZATION.f3361h, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
            }
            if (str.length() > 6 && m3695i >= 4) {
                bundle.putString(C0810n7.a.AD_USER_DATA.f3361h, (str.charAt(0) == '1' && str.charAt(6) == '1') ? "granted" : "denied");
            }
            return bundle;
        }
        return Bundle.EMPTY;
    }

    /* renamed from: e */
    public final String m3692e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        int m3694h = m3694h();
        if (m3694h < 0 || m3694h > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((m3694h >> 6) & 63));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(m3694h & 63));
        }
        int m3695i = m3695i();
        if (m3695i < 0 || m3695i > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(m3695i));
        }
        C2394s.m9608a(true);
        int i10 = "1".equals(this.f3417a.get("gdprApplies")) ? 2 : 0;
        if ("1".equals(this.f3417a.get("TcfDataEnabled"))) {
            i10 |= 4;
        }
        if ("1".equals(this.f3417a.get("EnableAdvertiserConsentMode"))) {
            i10 |= 8;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10));
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0828ob) {
            return m3693g().equalsIgnoreCase(((C0828ob) obj).m3693g());
        }
        return false;
    }

    /* renamed from: g */
    public final String m3693g() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : f3416b) {
            if (this.f3417a.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append(this.f3417a.get(str));
            }
        }
        return sb2.toString();
    }

    /* renamed from: h */
    public final int m3694h() {
        try {
            String str = this.f3417a.get("CmpSdkID");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final int hashCode() {
        return m3693g().hashCode();
    }

    /* renamed from: i */
    public final int m3695i() {
        try {
            String str = this.f3417a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final String toString() {
        return m3693g();
    }
}
