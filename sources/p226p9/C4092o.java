package p226p9;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p108h6.C2394s;
import p240q9.C4218i;

/* renamed from: p9.o */
/* loaded from: classes.dex */
public class C4092o {

    /* renamed from: a */
    public String f14761a;

    /* renamed from: b */
    public C4074f f14762b;

    /* renamed from: c */
    public C4093p f14763c;

    /* renamed from: d */
    public String f14764d;

    /* renamed from: e */
    public String f14765e;

    /* renamed from: f */
    public c<String> f14766f;

    /* renamed from: g */
    public String f14767g;

    /* renamed from: h */
    public String f14768h;

    /* renamed from: i */
    public String f14769i;

    /* renamed from: j */
    public long f14770j;

    /* renamed from: k */
    public String f14771k;

    /* renamed from: l */
    public c<String> f14772l;

    /* renamed from: m */
    public c<String> f14773m;

    /* renamed from: n */
    public c<String> f14774n;

    /* renamed from: o */
    public c<String> f14775o;

    /* renamed from: p */
    public c<Map<String, String>> f14776p;

    /* renamed from: p9.o$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public C4092o f14777a;

        /* renamed from: b */
        public boolean f14778b;

        public b() {
            this.f14777a = new C4092o();
        }

        public b(JSONObject jSONObject) {
            this.f14777a = new C4092o();
            if (jSONObject != null) {
                m15815c(jSONObject);
                this.f14778b = true;
            }
        }

        public b(JSONObject jSONObject, C4093p c4093p) {
            this(jSONObject);
            this.f14777a.f14763c = c4093p;
        }

        /* renamed from: a */
        public C4092o m15813a() {
            return new C4092o(this.f14778b);
        }

        /* renamed from: b */
        public final String m15814b(JSONObject jSONObject, String str) {
            if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        }

        /* renamed from: c */
        public final void m15815c(JSONObject jSONObject) {
            this.f14777a.f14765e = jSONObject.optString("generation");
            this.f14777a.f14761a = jSONObject.optString("name");
            this.f14777a.f14764d = jSONObject.optString("bucket");
            this.f14777a.f14767g = jSONObject.optString("metageneration");
            this.f14777a.f14768h = jSONObject.optString("timeCreated");
            this.f14777a.f14769i = jSONObject.optString("updated");
            this.f14777a.f14770j = jSONObject.optLong("size");
            this.f14777a.f14771k = jSONObject.optString("md5Hash");
            if (jSONObject.has("metadata") && !jSONObject.isNull("metadata")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m15821i(next, jSONObject2.getString(next));
                }
            }
            String m15814b = m15814b(jSONObject, "contentType");
            if (m15814b != null) {
                m15820h(m15814b);
            }
            String m15814b2 = m15814b(jSONObject, "cacheControl");
            if (m15814b2 != null) {
                m15816d(m15814b2);
            }
            String m15814b3 = m15814b(jSONObject, "contentDisposition");
            if (m15814b3 != null) {
                m15817e(m15814b3);
            }
            String m15814b4 = m15814b(jSONObject, "contentEncoding");
            if (m15814b4 != null) {
                m15818f(m15814b4);
            }
            String m15814b5 = m15814b(jSONObject, "contentLanguage");
            if (m15814b5 != null) {
                m15819g(m15814b5);
            }
        }

        /* renamed from: d */
        public b m15816d(String str) {
            this.f14777a.f14772l = c.m15823d(str);
            return this;
        }

        /* renamed from: e */
        public b m15817e(String str) {
            this.f14777a.f14773m = c.m15823d(str);
            return this;
        }

        /* renamed from: f */
        public b m15818f(String str) {
            this.f14777a.f14774n = c.m15823d(str);
            return this;
        }

        /* renamed from: g */
        public b m15819g(String str) {
            this.f14777a.f14775o = c.m15823d(str);
            return this;
        }

        /* renamed from: h */
        public b m15820h(String str) {
            this.f14777a.f14766f = c.m15823d(str);
            return this;
        }

        /* renamed from: i */
        public b m15821i(String str, String str2) {
            if (!this.f14777a.f14776p.m15825b()) {
                this.f14777a.f14776p = c.m15823d(new HashMap());
            }
            ((Map) this.f14777a.f14776p.m15824a()).put(str, str2);
            return this;
        }
    }

    /* renamed from: p9.o$c */
    /* loaded from: classes.dex */
    public static class c<T> {

        /* renamed from: a */
        public final boolean f14779a;

        /* renamed from: b */
        public final T f14780b;

        public c(T t10, boolean z10) {
            this.f14779a = z10;
            this.f14780b = t10;
        }

        /* renamed from: c */
        public static <T> c<T> m15822c(T t10) {
            return new c<>(t10, false);
        }

        /* renamed from: d */
        public static <T> c<T> m15823d(T t10) {
            return new c<>(t10, true);
        }

        /* renamed from: a */
        public T m15824a() {
            return this.f14780b;
        }

        /* renamed from: b */
        public boolean m15825b() {
            return this.f14779a;
        }
    }

    public C4092o() {
        this.f14761a = null;
        this.f14762b = null;
        this.f14763c = null;
        this.f14764d = null;
        this.f14765e = null;
        this.f14766f = c.m15822c("");
        this.f14767g = null;
        this.f14768h = null;
        this.f14769i = null;
        this.f14771k = null;
        this.f14772l = c.m15822c("");
        this.f14773m = c.m15822c("");
        this.f14774n = c.m15822c("");
        this.f14775o = c.m15822c("");
        this.f14776p = c.m15822c(Collections.emptyMap());
    }

    public C4092o(C4092o c4092o, boolean z10) {
        this.f14761a = null;
        this.f14762b = null;
        this.f14763c = null;
        this.f14764d = null;
        this.f14765e = null;
        this.f14766f = c.m15822c("");
        this.f14767g = null;
        this.f14768h = null;
        this.f14769i = null;
        this.f14771k = null;
        this.f14772l = c.m15822c("");
        this.f14773m = c.m15822c("");
        this.f14774n = c.m15822c("");
        this.f14775o = c.m15822c("");
        this.f14776p = c.m15822c(Collections.emptyMap());
        C2394s.m9619l(c4092o);
        this.f14761a = c4092o.f14761a;
        this.f14762b = c4092o.f14762b;
        this.f14763c = c4092o.f14763c;
        this.f14764d = c4092o.f14764d;
        this.f14766f = c4092o.f14766f;
        this.f14772l = c4092o.f14772l;
        this.f14773m = c4092o.f14773m;
        this.f14774n = c4092o.f14774n;
        this.f14775o = c4092o.f14775o;
        this.f14776p = c4092o.f14776p;
        if (z10) {
            this.f14771k = c4092o.f14771k;
            this.f14770j = c4092o.f14770j;
            this.f14769i = c4092o.f14769i;
            this.f14768h = c4092o.f14768h;
            this.f14767g = c4092o.f14767g;
            this.f14765e = c4092o.f14765e;
        }
    }

    /* renamed from: A */
    public String m15796A() {
        return this.f14765e;
    }

    /* renamed from: B */
    public String m15797B() {
        return this.f14771k;
    }

    /* renamed from: C */
    public String m15798C() {
        return this.f14767g;
    }

    /* renamed from: D */
    public String m15799D() {
        String m15800E = m15800E();
        if (TextUtils.isEmpty(m15800E)) {
            return null;
        }
        int lastIndexOf = m15800E.lastIndexOf(47);
        return lastIndexOf != -1 ? m15800E.substring(lastIndexOf + 1) : m15800E;
    }

    /* renamed from: E */
    public String m15800E() {
        String str = this.f14761a;
        return str != null ? str : "";
    }

    /* renamed from: F */
    public long m15801F() {
        return this.f14770j;
    }

    /* renamed from: G */
    public long m15802G() {
        return C4218i.m16242e(this.f14769i);
    }

    /* renamed from: q */
    public JSONObject m15803q() {
        HashMap hashMap = new HashMap();
        if (this.f14766f.m15825b()) {
            hashMap.put("contentType", m15809w());
        }
        if (this.f14776p.m15825b()) {
            hashMap.put("metadata", new JSONObject(this.f14776p.m15824a()));
        }
        if (this.f14772l.m15825b()) {
            hashMap.put("cacheControl", m15805s());
        }
        if (this.f14773m.m15825b()) {
            hashMap.put("contentDisposition", m15806t());
        }
        if (this.f14774n.m15825b()) {
            hashMap.put("contentEncoding", m15807u());
        }
        if (this.f14775o.m15825b()) {
            hashMap.put("contentLanguage", m15808v());
        }
        return new JSONObject(hashMap);
    }

    /* renamed from: r */
    public String m15804r() {
        return this.f14764d;
    }

    /* renamed from: s */
    public String m15805s() {
        return this.f14772l.m15824a();
    }

    /* renamed from: t */
    public String m15806t() {
        return this.f14773m.m15824a();
    }

    /* renamed from: u */
    public String m15807u() {
        return this.f14774n.m15824a();
    }

    /* renamed from: v */
    public String m15808v() {
        return this.f14775o.m15824a();
    }

    /* renamed from: w */
    public String m15809w() {
        return this.f14766f.m15824a();
    }

    /* renamed from: x */
    public long m15810x() {
        return C4218i.m16242e(this.f14768h);
    }

    /* renamed from: y */
    public String m15811y(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f14776p.m15824a().get(str);
    }

    /* renamed from: z */
    public Set<String> m15812z() {
        return this.f14776p.m15824a().keySet();
    }
}
