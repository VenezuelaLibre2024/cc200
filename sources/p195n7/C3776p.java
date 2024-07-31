package p195n7;

import android.content.Context;
import android.text.TextUtils;
import p108h6.C2388q;
import p108h6.C2394s;
import p108h6.C2403v;
import p207o6.C3946o;

/* renamed from: n7.p */
/* loaded from: classes.dex */
public final class C3776p {

    /* renamed from: a */
    public final String f13597a;

    /* renamed from: b */
    public final String f13598b;

    /* renamed from: c */
    public final String f13599c;

    /* renamed from: d */
    public final String f13600d;

    /* renamed from: e */
    public final String f13601e;

    /* renamed from: f */
    public final String f13602f;

    /* renamed from: g */
    public final String f13603g;

    /* renamed from: n7.p$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public String f13604a;

        /* renamed from: b */
        public String f13605b;

        /* renamed from: c */
        public String f13606c;

        /* renamed from: d */
        public String f13607d;

        /* renamed from: e */
        public String f13608e;

        /* renamed from: f */
        public String f13609f;

        /* renamed from: g */
        public String f13610g;

        /* renamed from: a */
        public C3776p m14370a() {
            return new C3776p(this.f13605b, this.f13604a, this.f13606c, this.f13607d, this.f13608e, this.f13609f, this.f13610g);
        }

        /* renamed from: b */
        public b m14371b(String str) {
            this.f13604a = C2394s.m9614g(str, "ApiKey must be set.");
            return this;
        }

        /* renamed from: c */
        public b m14372c(String str) {
            this.f13605b = C2394s.m9614g(str, "ApplicationId must be set.");
            return this;
        }

        /* renamed from: d */
        public b m14373d(String str) {
            this.f13606c = str;
            return this;
        }

        /* renamed from: e */
        public b m14374e(String str) {
            this.f13607d = str;
            return this;
        }

        /* renamed from: f */
        public b m14375f(String str) {
            this.f13608e = str;
            return this;
        }

        /* renamed from: g */
        public b m14376g(String str) {
            this.f13610g = str;
            return this;
        }

        /* renamed from: h */
        public b m14377h(String str) {
            this.f13609f = str;
            return this;
        }
    }

    public C3776p(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C2394s.m9623p(!C3946o.m14966b(str), "ApplicationId must be set.");
        this.f13598b = str;
        this.f13597a = str2;
        this.f13599c = str3;
        this.f13600d = str4;
        this.f13601e = str5;
        this.f13602f = str6;
        this.f13603g = str7;
    }

    /* renamed from: a */
    public static C3776p m14362a(Context context) {
        C2403v c2403v = new C2403v(context);
        String m9640a = c2403v.m9640a("google_app_id");
        if (TextUtils.isEmpty(m9640a)) {
            return null;
        }
        return new C3776p(m9640a, c2403v.m9640a("google_api_key"), c2403v.m9640a("firebase_database_url"), c2403v.m9640a("ga_trackingId"), c2403v.m9640a("gcm_defaultSenderId"), c2403v.m9640a("google_storage_bucket"), c2403v.m9640a("project_id"));
    }

    /* renamed from: b */
    public String m14363b() {
        return this.f13597a;
    }

    /* renamed from: c */
    public String m14364c() {
        return this.f13598b;
    }

    /* renamed from: d */
    public String m14365d() {
        return this.f13599c;
    }

    /* renamed from: e */
    public String m14366e() {
        return this.f13600d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3776p)) {
            return false;
        }
        C3776p c3776p = (C3776p) obj;
        return C2388q.m9592b(this.f13598b, c3776p.f13598b) && C2388q.m9592b(this.f13597a, c3776p.f13597a) && C2388q.m9592b(this.f13599c, c3776p.f13599c) && C2388q.m9592b(this.f13600d, c3776p.f13600d) && C2388q.m9592b(this.f13601e, c3776p.f13601e) && C2388q.m9592b(this.f13602f, c3776p.f13602f) && C2388q.m9592b(this.f13603g, c3776p.f13603g);
    }

    /* renamed from: f */
    public String m14367f() {
        return this.f13601e;
    }

    /* renamed from: g */
    public String m14368g() {
        return this.f13603g;
    }

    /* renamed from: h */
    public String m14369h() {
        return this.f13602f;
    }

    public int hashCode() {
        return C2388q.m9593c(this.f13598b, this.f13597a, this.f13599c, this.f13600d, this.f13601e, this.f13602f, this.f13603g);
    }

    public String toString() {
        return C2388q.m9594d(this).m9595a("applicationId", this.f13598b).m9595a("apiKey", this.f13597a).m9595a("databaseUrl", this.f13599c).m9595a("gcmSenderId", this.f13601e).m9595a("storageBucket", this.f13602f).m9595a("projectId", this.f13603g).toString();
    }
}
