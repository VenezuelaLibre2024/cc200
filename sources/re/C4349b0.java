package re;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import re.C4373u;
import se.C4596e;
import ve.C5171f;

/* renamed from: re.b0 */
/* loaded from: classes2.dex */
public final class C4349b0 {

    /* renamed from: a */
    public final C4374v f15714a;

    /* renamed from: b */
    public final String f15715b;

    /* renamed from: c */
    public final C4373u f15716c;

    /* renamed from: d */
    public final AbstractC4351c0 f15717d;

    /* renamed from: e */
    public final Map<Class<?>, Object> f15718e;

    /* renamed from: f */
    public volatile C4352d f15719f;

    /* renamed from: re.b0$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public C4374v f15720a;

        /* renamed from: b */
        public String f15721b;

        /* renamed from: c */
        public C4373u.a f15722c;

        /* renamed from: d */
        public AbstractC4351c0 f15723d;

        /* renamed from: e */
        public Map<Class<?>, Object> f15724e;

        public a() {
            this.f15724e = Collections.emptyMap();
            this.f15721b = "GET";
            this.f15722c = new C4373u.a();
        }

        public a(C4349b0 c4349b0) {
            this.f15724e = Collections.emptyMap();
            this.f15720a = c4349b0.f15714a;
            this.f15721b = c4349b0.f15715b;
            this.f15723d = c4349b0.f15717d;
            this.f15724e = c4349b0.f15718e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(c4349b0.f15718e);
            this.f15722c = c4349b0.f15716c.m16830f();
        }

        /* renamed from: a */
        public C4349b0 m16667a() {
            if (this.f15720a != null) {
                return new C4349b0(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: b */
        public a m16668b() {
            return m16671e("HEAD", null);
        }

        /* renamed from: c */
        public a m16669c(String str, String str2) {
            this.f15722c.m16839f(str, str2);
            return this;
        }

        /* renamed from: d */
        public a m16670d(C4373u c4373u) {
            this.f15722c = c4373u.m16830f();
            return this;
        }

        /* renamed from: e */
        public a m16671e(String str, AbstractC4351c0 abstractC4351c0) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (abstractC4351c0 != null && !C5171f.m20943b(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (abstractC4351c0 != null || !C5171f.m20946e(str)) {
                this.f15721b = str;
                this.f15723d = abstractC4351c0;
                return this;
            }
            throw new IllegalArgumentException("method " + str + " must have a request body.");
        }

        /* renamed from: f */
        public a m16672f(String str) {
            this.f15722c.m16838e(str);
            return this;
        }

        /* renamed from: g */
        public a m16673g(String str) {
            StringBuilder sb2;
            int i10;
            Objects.requireNonNull(str, "url == null");
            if (!str.regionMatches(true, 0, "ws:", 0, 3)) {
                if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    sb2 = new StringBuilder();
                    sb2.append("https:");
                    i10 = 4;
                }
                return m16674h(C4374v.m16844k(str));
            }
            sb2 = new StringBuilder();
            sb2.append("http:");
            i10 = 3;
            sb2.append(str.substring(i10));
            str = sb2.toString();
            return m16674h(C4374v.m16844k(str));
        }

        /* renamed from: h */
        public a m16674h(C4374v c4374v) {
            Objects.requireNonNull(c4374v, "url == null");
            this.f15720a = c4374v;
            return this;
        }
    }

    public C4349b0(a aVar) {
        this.f15714a = aVar.f15720a;
        this.f15715b = aVar.f15721b;
        this.f15716c = aVar.f15722c.m16837d();
        this.f15717d = aVar.f15723d;
        this.f15718e = C4596e.m18113u(aVar.f15724e);
    }

    /* renamed from: a */
    public AbstractC4351c0 m16659a() {
        return this.f15717d;
    }

    /* renamed from: b */
    public C4352d m16660b() {
        C4352d c4352d = this.f15719f;
        if (c4352d != null) {
            return c4352d;
        }
        C4352d m16684k = C4352d.m16684k(this.f15716c);
        this.f15719f = m16684k;
        return m16684k;
    }

    /* renamed from: c */
    public String m16661c(String str) {
        return this.f15716c.m16828c(str);
    }

    /* renamed from: d */
    public C4373u m16662d() {
        return this.f15716c;
    }

    /* renamed from: e */
    public boolean m16663e() {
        return this.f15714a.m16862m();
    }

    /* renamed from: f */
    public String m16664f() {
        return this.f15715b;
    }

    /* renamed from: g */
    public a m16665g() {
        return new a(this);
    }

    /* renamed from: h */
    public C4374v m16666h() {
        return this.f15714a;
    }

    public String toString() {
        return "Request{method=" + this.f15715b + ", url=" + this.f15714a + ", tags=" + this.f15718e + '}';
    }
}
