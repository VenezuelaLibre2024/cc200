package p321w7;

import android.net.Uri;
import com.google.android.gms.internal.p377firebaseauthapi.zzau;
import java.util.HashMap;
import java.util.Set;
import p108h6.C2394s;

/* renamed from: w7.f */
/* loaded from: classes.dex */
public class C5360f {

    /* renamed from: g */
    public static final zzau<String, Integer> f20185g;

    /* renamed from: a */
    public final String f20186a;

    /* renamed from: b */
    public final String f20187b;

    /* renamed from: c */
    public final String f20188c;

    /* renamed from: d */
    public final String f20189d;

    /* renamed from: e */
    public final String f20190e;

    /* renamed from: f */
    public final String f20191f;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("recoverEmail", 2);
        hashMap.put("resetPassword", 0);
        hashMap.put("signIn", 4);
        hashMap.put("verifyEmail", 1);
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f20185g = zzau.zza(hashMap);
    }

    public C5360f(String str) {
        String m21491e = m21491e(str, "apiKey");
        String m21491e2 = m21491e(str, "oobCode");
        String m21491e3 = m21491e(str, "mode");
        if (m21491e == null || m21491e2 == null || m21491e3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.f20186a = C2394s.m9613f(m21491e);
        this.f20187b = C2394s.m9613f(m21491e2);
        this.f20188c = C2394s.m9613f(m21491e3);
        this.f20189d = m21491e(str, "continueUrl");
        this.f20190e = m21491e(str, "languageCode");
        this.f20191f = m21491e(str, "tenantId");
    }

    /* renamed from: c */
    public static C5360f m21490c(String str) {
        C2394s.m9613f(str);
        try {
            return new C5360f(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m21491e(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(C2394s.m9613f(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String m21492a() {
        return this.f20187b;
    }

    /* renamed from: b */
    public int m21493b() {
        zzau<String, Integer> zzauVar = f20185g;
        if (zzauVar.containsKey(this.f20188c)) {
            return zzauVar.get(this.f20188c).intValue();
        }
        return 3;
    }

    /* renamed from: d */
    public final String m21494d() {
        return this.f20191f;
    }
}
