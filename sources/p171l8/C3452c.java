package p171l8;

import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p023b8.C0515g;
import p066e8.C1751r;
import p127i8.C2663a;
import p127i8.C2664b;
import p127i8.C2665c;

/* renamed from: l8.c */
/* loaded from: classes.dex */
public class C3452c implements InterfaceC3460k {

    /* renamed from: a */
    public final String f12119a;

    /* renamed from: b */
    public final C2664b f12120b;

    /* renamed from: c */
    public final C0515g f12121c;

    public C3452c(String str, C2664b c2664b) {
        this(str, c2664b, C0515g.m2482f());
    }

    public C3452c(String str, C2664b c2664b, C0515g c0515g) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f12121c = c0515g;
        this.f12120b = c2664b;
        this.f12119a = str;
    }

    @Override // p171l8.InterfaceC3460k
    /* renamed from: a */
    public JSONObject mo12839a(C3459j c3459j, boolean z10) {
        if (!z10) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> m12844f = m12844f(c3459j);
            C2663a m12840b = m12840b(m12842d(m12844f), c3459j);
            this.f12121c.m2484b("Requesting settings from " + this.f12119a);
            this.f12121c.m2490i("Settings query params were: " + m12844f);
            return m12845g(m12840b.m10860c());
        } catch (IOException e10) {
            this.f12121c.m2487e("Settings request failed.", e10);
            return null;
        }
    }

    /* renamed from: b */
    public final C2663a m12840b(C2663a c2663a, C3459j c3459j) {
        m12841c(c2663a, "X-CRASHLYTICS-GOOGLE-APP-ID", c3459j.f12150a);
        m12841c(c2663a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m12841c(c2663a, "X-CRASHLYTICS-API-CLIENT-VERSION", C1751r.m6976l());
        m12841c(c2663a, "Accept", "application/json");
        m12841c(c2663a, "X-CRASHLYTICS-DEVICE-MODEL", c3459j.f12151b);
        m12841c(c2663a, "X-CRASHLYTICS-OS-BUILD-VERSION", c3459j.f12152c);
        m12841c(c2663a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c3459j.f12153d);
        m12841c(c2663a, "X-CRASHLYTICS-INSTALLATION-ID", c3459j.f12154e.mo6772a().mo6783c());
        return c2663a;
    }

    /* renamed from: c */
    public final void m12841c(C2663a c2663a, String str, String str2) {
        if (str2 != null) {
            c2663a.m10861d(str, str2);
        }
    }

    /* renamed from: d */
    public C2663a m12842d(Map<String, String> map) {
        return this.f12120b.m10863a(this.f12119a, map).m10861d("User-Agent", "Crashlytics Android SDK/" + C1751r.m6976l()).m10861d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: e */
    public final JSONObject m12843e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e10) {
            this.f12121c.m2493l("Failed to parse settings JSON from " + this.f12119a, e10);
            this.f12121c.m2492k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    public final Map<String, String> m12844f(C3459j c3459j) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", c3459j.f12157h);
        hashMap.put("display_version", c3459j.f12156g);
        hashMap.put("source", Integer.toString(c3459j.f12158i));
        String str = c3459j.f12155f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: g */
    public JSONObject m12845g(C2665c c2665c) {
        int m10865b = c2665c.m10865b();
        this.f12121c.m2490i("Settings response code was: " + m10865b);
        if (m12846h(m10865b)) {
            return m12843e(c2665c.m10864a());
        }
        this.f12121c.m2486d("Settings request failed; (status: " + m10865b + ") from " + this.f12119a);
        return null;
    }

    /* renamed from: h */
    public boolean m12846h(int i10) {
        return i10 == 200 || i10 == 201 || i10 == 202 || i10 == 203;
    }
}
