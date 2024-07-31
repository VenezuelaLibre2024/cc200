package re;

import java.io.Closeable;
import p299ue.C5015c;
import re.C4373u;

/* renamed from: re.d0 */
/* loaded from: classes2.dex */
public final class C4353d0 implements Closeable {

    /* renamed from: h */
    public final C4349b0 f15753h;

    /* renamed from: i */
    public final EnumC4378z f15754i;

    /* renamed from: j */
    public final int f15755j;

    /* renamed from: k */
    public final String f15756k;

    /* renamed from: l */
    public final C4372t f15757l;

    /* renamed from: m */
    public final C4373u f15758m;

    /* renamed from: n */
    public final AbstractC4355e0 f15759n;

    /* renamed from: o */
    public final C4353d0 f15760o;

    /* renamed from: p */
    public final C4353d0 f15761p;

    /* renamed from: q */
    public final C4353d0 f15762q;

    /* renamed from: r */
    public final long f15763r;

    /* renamed from: s */
    public final long f15764s;

    /* renamed from: t */
    public final C5015c f15765t;

    /* renamed from: u */
    public volatile C4352d f15766u;

    /* renamed from: re.d0$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public C4349b0 f15767a;

        /* renamed from: b */
        public EnumC4378z f15768b;

        /* renamed from: c */
        public int f15769c;

        /* renamed from: d */
        public String f15770d;

        /* renamed from: e */
        public C4372t f15771e;

        /* renamed from: f */
        public C4373u.a f15772f;

        /* renamed from: g */
        public AbstractC4355e0 f15773g;

        /* renamed from: h */
        public C4353d0 f15774h;

        /* renamed from: i */
        public C4353d0 f15775i;

        /* renamed from: j */
        public C4353d0 f15776j;

        /* renamed from: k */
        public long f15777k;

        /* renamed from: l */
        public long f15778l;

        /* renamed from: m */
        public C5015c f15779m;

        public a() {
            this.f15769c = -1;
            this.f15772f = new C4373u.a();
        }

        public a(C4353d0 c4353d0) {
            this.f15769c = -1;
            this.f15767a = c4353d0.f15753h;
            this.f15768b = c4353d0.f15754i;
            this.f15769c = c4353d0.f15755j;
            this.f15770d = c4353d0.f15756k;
            this.f15771e = c4353d0.f15757l;
            this.f15772f = c4353d0.f15758m.m16830f();
            this.f15773g = c4353d0.f15759n;
            this.f15774h = c4353d0.f15760o;
            this.f15775i = c4353d0.f15761p;
            this.f15776j = c4353d0.f15762q;
            this.f15777k = c4353d0.f15763r;
            this.f15778l = c4353d0.f15764s;
            this.f15779m = c4353d0.f15765t;
        }

        /* renamed from: a */
        public a m16711a(String str, String str2) {
            this.f15772f.m16834a(str, str2);
            return this;
        }

        /* renamed from: b */
        public a m16712b(AbstractC4355e0 abstractC4355e0) {
            this.f15773g = abstractC4355e0;
            return this;
        }

        /* renamed from: c */
        public C4353d0 m16713c() {
            if (this.f15767a == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f15768b == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f15769c >= 0) {
                if (this.f15770d != null) {
                    return new C4353d0(this);
                }
                throw new IllegalStateException("message == null");
            }
            throw new IllegalStateException("code < 0: " + this.f15769c);
        }

        /* renamed from: d */
        public a m16714d(C4353d0 c4353d0) {
            if (c4353d0 != null) {
                m16716f("cacheResponse", c4353d0);
            }
            this.f15775i = c4353d0;
            return this;
        }

        /* renamed from: e */
        public final void m16715e(C4353d0 c4353d0) {
            if (c4353d0.f15759n != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: f */
        public final void m16716f(String str, C4353d0 c4353d0) {
            if (c4353d0.f15759n != null) {
                throw new IllegalArgumentException(str + ".body != null");
            }
            if (c4353d0.f15760o != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            if (c4353d0.f15761p != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            if (c4353d0.f15762q == null) {
                return;
            }
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }

        /* renamed from: g */
        public a m16717g(int i10) {
            this.f15769c = i10;
            return this;
        }

        /* renamed from: h */
        public a m16718h(C4372t c4372t) {
            this.f15771e = c4372t;
            return this;
        }

        /* renamed from: i */
        public a m16719i(String str, String str2) {
            this.f15772f.m16839f(str, str2);
            return this;
        }

        /* renamed from: j */
        public a m16720j(C4373u c4373u) {
            this.f15772f = c4373u.m16830f();
            return this;
        }

        /* renamed from: k */
        public void m16721k(C5015c c5015c) {
            this.f15779m = c5015c;
        }

        /* renamed from: l */
        public a m16722l(String str) {
            this.f15770d = str;
            return this;
        }

        /* renamed from: m */
        public a m16723m(C4353d0 c4353d0) {
            if (c4353d0 != null) {
                m16716f("networkResponse", c4353d0);
            }
            this.f15774h = c4353d0;
            return this;
        }

        /* renamed from: n */
        public a m16724n(C4353d0 c4353d0) {
            if (c4353d0 != null) {
                m16715e(c4353d0);
            }
            this.f15776j = c4353d0;
            return this;
        }

        /* renamed from: o */
        public a m16725o(EnumC4378z enumC4378z) {
            this.f15768b = enumC4378z;
            return this;
        }

        /* renamed from: p */
        public a m16726p(long j10) {
            this.f15778l = j10;
            return this;
        }

        /* renamed from: q */
        public a m16727q(C4349b0 c4349b0) {
            this.f15767a = c4349b0;
            return this;
        }

        /* renamed from: r */
        public a m16728r(long j10) {
            this.f15777k = j10;
            return this;
        }
    }

    public C4353d0(a aVar) {
        this.f15753h = aVar.f15767a;
        this.f15754i = aVar.f15768b;
        this.f15755j = aVar.f15769c;
        this.f15756k = aVar.f15770d;
        this.f15757l = aVar.f15771e;
        this.f15758m = aVar.f15772f.m16837d();
        this.f15759n = aVar.f15773g;
        this.f15760o = aVar.f15774h;
        this.f15761p = aVar.f15775i;
        this.f15762q = aVar.f15776j;
        this.f15763r = aVar.f15777k;
        this.f15764s = aVar.f15778l;
        this.f15765t = aVar.f15779m;
    }

    /* renamed from: E */
    public C4353d0 m16699E() {
        return this.f15762q;
    }

    /* renamed from: I */
    public long m16700I() {
        return this.f15764s;
    }

    /* renamed from: K */
    public C4349b0 m16701K() {
        return this.f15753h;
    }

    /* renamed from: P */
    public long m16702P() {
        return this.f15763r;
    }

    /* renamed from: a */
    public AbstractC4355e0 m16703a() {
        return this.f15759n;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC4355e0 abstractC4355e0 = this.f15759n;
        if (abstractC4355e0 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC4355e0.close();
    }

    /* renamed from: d */
    public C4352d m16704d() {
        C4352d c4352d = this.f15766u;
        if (c4352d != null) {
            return c4352d;
        }
        C4352d m16684k = C4352d.m16684k(this.f15758m);
        this.f15766u = m16684k;
        return m16684k;
    }

    /* renamed from: f */
    public int m16705f() {
        return this.f15755j;
    }

    /* renamed from: j */
    public C4372t m16706j() {
        return this.f15757l;
    }

    /* renamed from: l */
    public String m16707l(String str) {
        return m16708n(str, null);
    }

    /* renamed from: n */
    public String m16708n(String str, String str2) {
        String m16828c = this.f15758m.m16828c(str);
        return m16828c != null ? m16828c : str2;
    }

    public String toString() {
        return "Response{protocol=" + this.f15754i + ", code=" + this.f15755j + ", message=" + this.f15756k + ", url=" + this.f15753h.m16666h() + '}';
    }

    /* renamed from: w */
    public C4373u m16709w() {
        return this.f15758m;
    }

    /* renamed from: x */
    public a m16710x() {
        return new a(this);
    }
}
