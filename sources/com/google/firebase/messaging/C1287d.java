package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.C1284a;
import java.util.Map;
import p099g9.C2187m0;
import p125i6.AbstractC2601a;
import p285u.C4771a;

/* renamed from: com.google.firebase.messaging.d */
/* loaded from: classes.dex */
public final class C1287d extends AbstractC2601a {
    public static final Parcelable.Creator<C1287d> CREATOR = new C2187m0();

    /* renamed from: h */
    public Bundle f4877h;

    /* renamed from: i */
    public Map<String, String> f4878i;

    /* renamed from: j */
    public c f4879j;

    /* renamed from: com.google.firebase.messaging.d$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final Bundle f4880a;

        /* renamed from: b */
        public final Map<String, String> f4881b;

        public b(String str) {
            Bundle bundle = new Bundle();
            this.f4880a = bundle;
            this.f4881b = new C4771a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        /* renamed from: a */
        public C1287d m5520a() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.f4881b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.f4880a);
            this.f4880a.remove("from");
            return new C1287d(bundle);
        }

        /* renamed from: b */
        public b m5521b(String str) {
            this.f4880a.putString("collapse_key", str);
            return this;
        }

        /* renamed from: c */
        public b m5522c(Map<String, String> map) {
            this.f4881b.clear();
            this.f4881b.putAll(map);
            return this;
        }

        /* renamed from: d */
        public b m5523d(String str) {
            this.f4880a.putString("google.message_id", str);
            return this;
        }

        /* renamed from: e */
        public b m5524e(String str) {
            this.f4880a.putString("message_type", str);
            return this;
        }

        /* renamed from: f */
        public b m5525f(int i10) {
            this.f4880a.putString("google.ttl", String.valueOf(i10));
            return this;
        }
    }

    /* renamed from: com.google.firebase.messaging.d$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final String f4882a;

        /* renamed from: b */
        public final String f4883b;

        /* renamed from: c */
        public final String[] f4884c;

        /* renamed from: d */
        public final String f4885d;

        /* renamed from: e */
        public final String f4886e;

        /* renamed from: f */
        public final String[] f4887f;

        /* renamed from: g */
        public final String f4888g;

        /* renamed from: h */
        public final String f4889h;

        /* renamed from: i */
        public final String f4890i;

        /* renamed from: j */
        public final String f4891j;

        /* renamed from: k */
        public final String f4892k;

        /* renamed from: l */
        public final String f4893l;

        /* renamed from: m */
        public final String f4894m;

        /* renamed from: n */
        public final Uri f4895n;

        /* renamed from: o */
        public final String f4896o;

        /* renamed from: p */
        public final Integer f4897p;

        /* renamed from: q */
        public final Integer f4898q;

        /* renamed from: r */
        public final Integer f4899r;

        /* renamed from: s */
        public final int[] f4900s;

        /* renamed from: t */
        public final Long f4901t;

        /* renamed from: u */
        public final boolean f4902u;

        /* renamed from: v */
        public final boolean f4903v;

        /* renamed from: w */
        public final boolean f4904w;

        /* renamed from: x */
        public final boolean f4905x;

        /* renamed from: y */
        public final boolean f4906y;

        /* renamed from: z */
        public final long[] f4907z;

        public c(C1286c c1286c) {
            this.f4882a = c1286c.m5502p("gcm.n.title");
            this.f4883b = c1286c.m5494h("gcm.n.title");
            this.f4884c = m5526j(c1286c, "gcm.n.title");
            this.f4885d = c1286c.m5502p("gcm.n.body");
            this.f4886e = c1286c.m5494h("gcm.n.body");
            this.f4887f = m5526j(c1286c, "gcm.n.body");
            this.f4888g = c1286c.m5502p("gcm.n.icon");
            this.f4890i = c1286c.m5501o();
            this.f4891j = c1286c.m5502p("gcm.n.tag");
            this.f4892k = c1286c.m5502p("gcm.n.color");
            this.f4893l = c1286c.m5502p("gcm.n.click_action");
            this.f4894m = c1286c.m5502p("gcm.n.android_channel_id");
            this.f4895n = c1286c.m5492f();
            this.f4889h = c1286c.m5502p("gcm.n.image");
            this.f4896o = c1286c.m5502p("gcm.n.ticker");
            this.f4897p = c1286c.m5489b("gcm.n.notification_priority");
            this.f4898q = c1286c.m5489b("gcm.n.visibility");
            this.f4899r = c1286c.m5489b("gcm.n.notification_count");
            this.f4902u = c1286c.m5488a("gcm.n.sticky");
            this.f4903v = c1286c.m5488a("gcm.n.local_only");
            this.f4904w = c1286c.m5488a("gcm.n.default_sound");
            this.f4905x = c1286c.m5488a("gcm.n.default_vibrate_timings");
            this.f4906y = c1286c.m5488a("gcm.n.default_light_settings");
            this.f4901t = c1286c.m5496j("gcm.n.event_time");
            this.f4900s = c1286c.m5491e();
            this.f4907z = c1286c.m5503q();
        }

        /* renamed from: j */
        public static String[] m5526j(C1286c c1286c, String str) {
            Object[] m5493g = c1286c.m5493g(str);
            if (m5493g == null) {
                return null;
            }
            String[] strArr = new String[m5493g.length];
            for (int i10 = 0; i10 < m5493g.length; i10++) {
                strArr[i10] = String.valueOf(m5493g[i10]);
            }
            return strArr;
        }

        /* renamed from: a */
        public String m5527a() {
            return this.f4885d;
        }

        /* renamed from: b */
        public String[] m5528b() {
            return this.f4887f;
        }

        /* renamed from: c */
        public String m5529c() {
            return this.f4886e;
        }

        /* renamed from: d */
        public String m5530d() {
            return this.f4894m;
        }

        /* renamed from: e */
        public String m5531e() {
            return this.f4893l;
        }

        /* renamed from: f */
        public String m5532f() {
            return this.f4892k;
        }

        /* renamed from: g */
        public String m5533g() {
            return this.f4888g;
        }

        /* renamed from: h */
        public Uri m5534h() {
            String str = this.f4889h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        /* renamed from: i */
        public Uri m5535i() {
            return this.f4895n;
        }

        /* renamed from: k */
        public Integer m5536k() {
            return this.f4899r;
        }

        /* renamed from: l */
        public Integer m5537l() {
            return this.f4897p;
        }

        /* renamed from: m */
        public String m5538m() {
            return this.f4890i;
        }

        /* renamed from: n */
        public String m5539n() {
            return this.f4891j;
        }

        /* renamed from: o */
        public String m5540o() {
            return this.f4896o;
        }

        /* renamed from: p */
        public String m5541p() {
            return this.f4882a;
        }

        /* renamed from: q */
        public String[] m5542q() {
            return this.f4884c;
        }

        /* renamed from: r */
        public String m5543r() {
            return this.f4883b;
        }

        /* renamed from: s */
        public Integer m5544s() {
            return this.f4898q;
        }
    }

    public C1287d(Bundle bundle) {
        this.f4877h = bundle;
    }

    /* renamed from: I */
    public String m5508I() {
        return this.f4877h.getString("collapse_key");
    }

    /* renamed from: J */
    public Map<String, String> m5509J() {
        if (this.f4878i == null) {
            this.f4878i = C1284a.a.m5452a(this.f4877h);
        }
        return this.f4878i;
    }

    /* renamed from: K */
    public String m5510K() {
        return this.f4877h.getString("from");
    }

    /* renamed from: L */
    public String m5511L() {
        String string = this.f4877h.getString("google.message_id");
        return string == null ? this.f4877h.getString("message_id") : string;
    }

    /* renamed from: M */
    public final int m5512M(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    /* renamed from: N */
    public String m5513N() {
        return this.f4877h.getString("message_type");
    }

    /* renamed from: O */
    public c m5514O() {
        if (this.f4879j == null && C1286c.m5484t(this.f4877h)) {
            this.f4879j = new c(new C1286c(this.f4877h));
        }
        return this.f4879j;
    }

    /* renamed from: P */
    public int m5515P() {
        String string = this.f4877h.getString("google.original_priority");
        if (string == null) {
            string = this.f4877h.getString("google.priority");
        }
        return m5512M(string);
    }

    /* renamed from: Q */
    public long m5516Q() {
        Object obj = this.f4877h.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    /* renamed from: R */
    public String m5517R() {
        return this.f4877h.getString("google.to");
    }

    /* renamed from: S */
    public int m5518S() {
        Object obj = this.f4877h.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    /* renamed from: T */
    public void m5519T(Intent intent) {
        intent.putExtras(this.f4877h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C2187m0.m8801c(this, parcel, i10);
    }
}
