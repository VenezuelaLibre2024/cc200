package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.c */
/* loaded from: classes.dex */
public class C1286c {

    /* renamed from: a */
    public final Bundle f4876a;

    public C1286c(Bundle bundle) {
        Objects.requireNonNull(bundle, "data");
        this.f4876a = new Bundle(bundle);
    }

    /* renamed from: d */
    public static int m5482d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    public static boolean m5483s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    /* renamed from: t */
    public static boolean m5484t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(m5486v("gcm.n.e")));
    }

    /* renamed from: u */
    public static boolean m5485u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    /* renamed from: v */
    public static String m5486v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: z */
    public static String m5487z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: a */
    public boolean m5488a(String str) {
        String m5502p = m5502p(str);
        return "1".equals(m5502p) || Boolean.parseBoolean(m5502p);
    }

    /* renamed from: b */
    public Integer m5489b(String str) {
        String m5502p = m5502p(str);
        if (TextUtils.isEmpty(m5502p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m5502p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m5487z(str) + "(" + m5502p + ") into an int");
            return null;
        }
    }

    /* renamed from: c */
    public JSONArray m5490c(String str) {
        String m5502p = m5502p(str);
        if (TextUtils.isEmpty(m5502p)) {
            return null;
        }
        try {
            return new JSONArray(m5502p);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + m5487z(str) + ": " + m5502p + ", falling back to default");
            return null;
        }
    }

    /* renamed from: e */
    public int[] m5491e() {
        String str;
        JSONArray m5490c = m5490c("gcm.n.light_settings");
        if (m5490c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (m5490c.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = m5482d(m5490c.optString(0));
            iArr[1] = m5490c.optInt(1);
            iArr[2] = m5490c.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            str = "LightSettings is invalid: " + m5490c + ". " + e10.getMessage() + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        } catch (JSONException unused) {
            str = "LightSettings is invalid: " + m5490c + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        }
    }

    /* renamed from: f */
    public Uri m5492f() {
        String m5502p = m5502p("gcm.n.link_android");
        if (TextUtils.isEmpty(m5502p)) {
            m5502p = m5502p("gcm.n.link");
        }
        if (TextUtils.isEmpty(m5502p)) {
            return null;
        }
        return Uri.parse(m5502p);
    }

    /* renamed from: g */
    public Object[] m5493g(String str) {
        JSONArray m5490c = m5490c(str + "_loc_args");
        if (m5490c == null) {
            return null;
        }
        int length = m5490c.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = m5490c.optString(i10);
        }
        return strArr;
    }

    /* renamed from: h */
    public String m5494h(String str) {
        return m5502p(str + "_loc_key");
    }

    /* renamed from: i */
    public String m5495i(Resources resources, String str, String str2) {
        String m5494h = m5494h(str2);
        if (TextUtils.isEmpty(m5494h)) {
            return null;
        }
        int identifier = resources.getIdentifier(m5494h, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m5487z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] m5493g = m5493g(str2);
        if (m5493g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, m5493g);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + m5487z(str2) + ": " + Arrays.toString(m5493g) + " Default value will be used.", e10);
            return null;
        }
    }

    /* renamed from: j */
    public Long m5496j(String str) {
        String m5502p = m5502p(str);
        if (TextUtils.isEmpty(m5502p)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(m5502p));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + m5487z(str) + "(" + m5502p + ") into a long");
            return null;
        }
    }

    /* renamed from: k */
    public String m5497k() {
        return m5502p("gcm.n.android_channel_id");
    }

    /* renamed from: l */
    public Integer m5498l() {
        Integer m5489b = m5489b("gcm.n.notification_count");
        if (m5489b == null) {
            return null;
        }
        if (m5489b.intValue() >= 0) {
            return m5489b;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + m5489b + ". Skipping setting notificationCount.");
        return null;
    }

    /* renamed from: m */
    public Integer m5499m() {
        Integer m5489b = m5489b("gcm.n.notification_priority");
        if (m5489b == null) {
            return null;
        }
        if (m5489b.intValue() >= -2 && m5489b.intValue() <= 2) {
            return m5489b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + m5489b + ". Skipping setting notificationPriority.");
        return null;
    }

    /* renamed from: n */
    public String m5500n(Resources resources, String str, String str2) {
        String m5502p = m5502p(str2);
        return !TextUtils.isEmpty(m5502p) ? m5502p : m5495i(resources, str, str2);
    }

    /* renamed from: o */
    public String m5501o() {
        String m5502p = m5502p("gcm.n.sound2");
        return TextUtils.isEmpty(m5502p) ? m5502p("gcm.n.sound") : m5502p;
    }

    /* renamed from: p */
    public String m5502p(String str) {
        return this.f4876a.getString(m5505w(str));
    }

    /* renamed from: q */
    public long[] m5503q() {
        JSONArray m5490c = m5490c("gcm.n.vibrate_timings");
        if (m5490c == null) {
            return null;
        }
        try {
            if (m5490c.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = m5490c.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = m5490c.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + m5490c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* renamed from: r */
    public Integer m5504r() {
        Integer m5489b = m5489b("gcm.n.visibility");
        if (m5489b == null) {
            return null;
        }
        if (m5489b.intValue() >= -1 && m5489b.intValue() <= 1) {
            return m5489b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + m5489b + ". Skipping setting visibility.");
        return null;
    }

    /* renamed from: w */
    public final String m5505w(String str) {
        if (!this.f4876a.containsKey(str) && str.startsWith("gcm.n.")) {
            String m5486v = m5486v(str);
            if (this.f4876a.containsKey(m5486v)) {
                return m5486v;
            }
        }
        return str;
    }

    /* renamed from: x */
    public Bundle m5506x() {
        Bundle bundle = new Bundle(this.f4876a);
        for (String str : this.f4876a.keySet()) {
            if (!m5483s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle m5507y() {
        Bundle bundle = new Bundle(this.f4876a);
        for (String str : this.f4876a.keySet()) {
            if (m5485u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
