package p034c7;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c7.n7 */
/* loaded from: classes.dex */
public final class C0810n7 {

    /* renamed from: c */
    public static final C0810n7 f3353c = new C0810n7(null, null, 100);

    /* renamed from: a */
    public final EnumMap<a, Boolean> f3354a;

    /* renamed from: b */
    public final int f3355b;

    /* renamed from: c7.n7$a */
    /* loaded from: classes.dex */
    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");


        /* renamed from: h */
        public final String f3361h;

        a(String str) {
            this.f3361h = str;
        }
    }

    public C0810n7(Boolean bool, Boolean bool2, int i10) {
        EnumMap<a, Boolean> enumMap = new EnumMap<>((Class<a>) a.class);
        this.f3354a = enumMap;
        enumMap.put((EnumMap<a, Boolean>) a.AD_STORAGE, (a) bool);
        enumMap.put((EnumMap<a, Boolean>) a.ANALYTICS_STORAGE, (a) bool2);
        this.f3355b = i10;
    }

    public C0810n7(EnumMap<a, Boolean> enumMap, int i10) {
        EnumMap<a, Boolean> enumMap2 = new EnumMap<>((Class<a>) a.class);
        this.f3354a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f3355b = i10;
    }

    /* renamed from: a */
    public static char m3620a(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    /* renamed from: c */
    public static C0810n7 m3621c(Bundle bundle, int i10) {
        a[] aVarArr;
        if (bundle == null) {
            return new C0810n7(null, null, i10);
        }
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = EnumC0796m7.STORAGE.f3329h;
        for (a aVar : aVarArr) {
            enumMap.put((EnumMap) aVar, (a) m3630q(bundle.getString(aVar.f3361h)));
        }
        return new C0810n7(enumMap, i10);
    }

    /* renamed from: e */
    public static C0810n7 m3622e(String str) {
        return m3623f(str, 100);
    }

    /* renamed from: f */
    public static C0810n7 m3623f(String str, int i10) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str != null) {
            a[] m3614b = EnumC0796m7.STORAGE.m3614b();
            for (int i11 = 0; i11 < m3614b.length; i11++) {
                a aVar = m3614b[i11];
                int i12 = i11 + 2;
                if (i12 < str.length()) {
                    enumMap.put((EnumMap) aVar, (a) m3624g(str.charAt(i12)));
                }
            }
        }
        return new C0810n7(enumMap, i10);
    }

    /* renamed from: g */
    public static Boolean m3624g(char c10) {
        if (c10 == '0') {
            return Boolean.FALSE;
        }
        if (c10 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: h */
    public static String m3625h(int i10) {
        return i10 != -20 ? i10 != -10 ? i10 != 0 ? i10 != 30 ? i10 != 90 ? i10 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API";
    }

    /* renamed from: i */
    public static String m3626i(Bundle bundle) {
        a[] aVarArr;
        String string;
        aVarArr = EnumC0796m7.STORAGE.f3329h;
        for (a aVar : aVarArr) {
            if (bundle.containsKey(aVar.f3361h) && (string = bundle.getString(aVar.f3361h)) != null && m3630q(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static String m3627j(boolean z10) {
        return z10 ? "granted" : "denied";
    }

    /* renamed from: k */
    public static boolean m3628k(int i10, int i11) {
        return i10 <= i11;
    }

    /* renamed from: n */
    public static int m3629n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: q */
    public static Boolean m3630q(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: b */
    public final int m3631b() {
        return this.f3355b;
    }

    /* renamed from: d */
    public final C0810n7 m3632d(C0810n7 c0810n7) {
        a[] aVarArr;
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = EnumC0796m7.STORAGE.f3329h;
        for (a aVar : aVarArr) {
            Boolean bool = this.f3354a.get(aVar);
            Boolean bool2 = c0810n7.f3354a.get(aVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) aVar, (a) bool);
        }
        return new C0810n7(enumMap, 100);
    }

    public final boolean equals(Object obj) {
        a[] aVarArr;
        if (!(obj instanceof C0810n7)) {
            return false;
        }
        C0810n7 c0810n7 = (C0810n7) obj;
        aVarArr = EnumC0796m7.STORAGE.f3329h;
        for (a aVar : aVarArr) {
            if (m3629n(this.f3354a.get(aVar)) != m3629n(c0810n7.f3354a.get(aVar))) {
                return false;
            }
        }
        return this.f3355b == c0810n7.f3355b;
    }

    public final int hashCode() {
        int i10 = this.f3355b * 17;
        Iterator<Boolean> it = this.f3354a.values().iterator();
        while (it.hasNext()) {
            i10 = (i10 * 31) + m3629n(it.next());
        }
        return i10;
    }

    /* renamed from: l */
    public final boolean m3633l(a aVar) {
        Boolean bool = this.f3354a.get(aVar);
        return bool == null || bool.booleanValue();
    }

    /* renamed from: m */
    public final boolean m3634m(C0810n7 c0810n7, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!c0810n7.m3633l(aVar) && m3633l(aVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public final Bundle m3635o() {
        Bundle bundle = new Bundle();
        for (Map.Entry<a, Boolean> entry : this.f3354a.entrySet()) {
            Boolean value = entry.getValue();
            if (value != null) {
                bundle.putString(entry.getKey().f3361h, m3627j(value.booleanValue()));
            }
        }
        return bundle;
    }

    /* renamed from: p */
    public final C0810n7 m3636p(C0810n7 c0810n7) {
        a[] aVarArr;
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = EnumC0796m7.STORAGE.f3329h;
        for (a aVar : aVarArr) {
            Boolean bool = this.f3354a.get(aVar);
            if (bool == null) {
                bool = c0810n7.f3354a.get(aVar);
            }
            enumMap.put((EnumMap) aVar, (a) bool);
        }
        return new C0810n7(enumMap, this.f3355b);
    }

    /* renamed from: r */
    public final boolean m3637r(C0810n7 c0810n7, a... aVarArr) {
        for (a aVar : aVarArr) {
            Boolean bool = this.f3354a.get(aVar);
            Boolean bool2 = c0810n7.f3354a.get(aVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final Boolean m3638s() {
        return this.f3354a.get(a.AD_STORAGE);
    }

    /* renamed from: t */
    public final boolean m3639t(C0810n7 c0810n7) {
        return m3637r(c0810n7, (a[]) this.f3354a.keySet().toArray(new a[0]));
    }

    public final String toString() {
        a[] aVarArr;
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(m3625h(this.f3355b));
        aVarArr = EnumC0796m7.STORAGE.f3329h;
        for (a aVar : aVarArr) {
            sb2.append(",");
            sb2.append(aVar.f3361h);
            sb2.append("=");
            Boolean bool = this.f3354a.get(aVar);
            sb2.append(bool == null ? "uninitialized" : bool.booleanValue() ? "granted" : "denied");
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public final Boolean m3640u() {
        return this.f3354a.get(a.ANALYTICS_STORAGE);
    }

    /* renamed from: v */
    public final String m3641v() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (a aVar : EnumC0796m7.STORAGE.m3614b()) {
            sb2.append(m3620a(this.f3354a.get(aVar)));
        }
        return sb2.toString();
    }

    /* renamed from: w */
    public final String m3642w() {
        StringBuilder sb2 = new StringBuilder("G2");
        for (a aVar : EnumC0796m7.STORAGE.m3614b()) {
            Boolean bool = this.f3354a.get(aVar);
            sb2.append(bool == null ? 'g' : bool.booleanValue() ? 'G' : 'D');
        }
        return sb2.toString();
    }

    /* renamed from: x */
    public final boolean m3643x() {
        return m3633l(a.AD_STORAGE);
    }

    /* renamed from: y */
    public final boolean m3644y() {
        return m3633l(a.ANALYTICS_STORAGE);
    }

    /* renamed from: z */
    public final boolean m3645z() {
        Iterator<Boolean> it = this.f3354a.values().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                return true;
            }
        }
        return false;
    }
}
