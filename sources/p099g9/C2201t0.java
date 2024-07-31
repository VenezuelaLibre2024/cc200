package p099g9;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
import p108h6.C2388q;

/* renamed from: g9.t0 */
/* loaded from: classes.dex */
public final class C2201t0 {

    /* renamed from: d */
    public static final Pattern f8743d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    public final String f8744a;

    /* renamed from: b */
    public final String f8745b;

    /* renamed from: c */
    public final String f8746c;

    public C2201t0(String str, String str2) {
        this.f8744a = m8833d(str2, str);
        this.f8745b = str;
        this.f8746c = str + "!" + str2;
    }

    /* renamed from: a */
    public static C2201t0 m8832a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C2201t0(split[0], split[1]);
    }

    /* renamed from: d */
    public static String m8833d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f8743d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    /* renamed from: f */
    public static C2201t0 m8834f(String str) {
        return new C2201t0("S", str);
    }

    /* renamed from: g */
    public static C2201t0 m8835g(String str) {
        return new C2201t0("U", str);
    }

    /* renamed from: b */
    public String m8836b() {
        return this.f8745b;
    }

    /* renamed from: c */
    public String m8837c() {
        return this.f8744a;
    }

    /* renamed from: e */
    public String m8838e() {
        return this.f8746c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2201t0)) {
            return false;
        }
        C2201t0 c2201t0 = (C2201t0) obj;
        return this.f8744a.equals(c2201t0.f8744a) && this.f8745b.equals(c2201t0.f8745b);
    }

    public int hashCode() {
        return C2388q.m9593c(this.f8745b, this.f8744a);
    }
}
