package p344xe;

import bf.C0557c;
import bf.C0560f;
import bf.C0566l;
import bf.InterfaceC0559e;
import bf.InterfaceC0574t;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p079f6.C1841a;

/* renamed from: xe.d */
/* loaded from: classes2.dex */
public final class C5771d {

    /* renamed from: a */
    public static final C5770c[] f21375a;

    /* renamed from: b */
    public static final Map<C0560f, Integer> f21376b;

    /* renamed from: xe.d$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final List<C5770c> f21377a;

        /* renamed from: b */
        public final InterfaceC0559e f21378b;

        /* renamed from: c */
        public final int f21379c;

        /* renamed from: d */
        public int f21380d;

        /* renamed from: e */
        public C5770c[] f21381e;

        /* renamed from: f */
        public int f21382f;

        /* renamed from: g */
        public int f21383g;

        /* renamed from: h */
        public int f21384h;

        public a(int i10, int i11, InterfaceC0574t interfaceC0574t) {
            this.f21377a = new ArrayList();
            this.f21381e = new C5770c[8];
            this.f21382f = r0.length - 1;
            this.f21383g = 0;
            this.f21384h = 0;
            this.f21379c = i10;
            this.f21380d = i11;
            this.f21378b = C0566l.m2894b(interfaceC0574t);
        }

        public a(int i10, InterfaceC0574t interfaceC0574t) {
            this(i10, i10, interfaceC0574t);
        }

        /* renamed from: a */
        public final void m22915a() {
            int i10 = this.f21380d;
            int i11 = this.f21384h;
            if (i10 < i11) {
                if (i10 == 0) {
                    m22916b();
                } else {
                    m22918d(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        public final void m22916b() {
            Arrays.fill(this.f21381e, (Object) null);
            this.f21382f = this.f21381e.length - 1;
            this.f21383g = 0;
            this.f21384h = 0;
        }

        /* renamed from: c */
        public final int m22917c(int i10) {
            return this.f21382f + 1 + i10;
        }

        /* renamed from: d */
        public final int m22918d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f21381e.length;
                while (true) {
                    length--;
                    i11 = this.f21382f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C5770c[] c5770cArr = this.f21381e;
                    i10 -= c5770cArr[length].f21374c;
                    this.f21384h -= c5770cArr[length].f21374c;
                    this.f21383g--;
                    i12++;
                }
                C5770c[] c5770cArr2 = this.f21381e;
                System.arraycopy(c5770cArr2, i11 + 1, c5770cArr2, i11 + 1 + i12, this.f21383g);
                this.f21382f += i12;
            }
            return i12;
        }

        /* renamed from: e */
        public List<C5770c> m22919e() {
            ArrayList arrayList = new ArrayList(this.f21377a);
            this.f21377a.clear();
            return arrayList;
        }

        /* renamed from: f */
        public final C0560f m22920f(int i10) {
            C5770c c5770c;
            if (!m22922h(i10)) {
                int m22917c = m22917c(i10 - C5771d.f21375a.length);
                if (m22917c >= 0) {
                    C5770c[] c5770cArr = this.f21381e;
                    if (m22917c < c5770cArr.length) {
                        c5770c = c5770cArr[m22917c];
                    }
                }
                throw new IOException("Header index too large " + (i10 + 1));
            }
            c5770c = C5771d.f21375a[i10];
            return c5770c.f21372a;
        }

        /* renamed from: g */
        public final void m22921g(int i10, C5770c c5770c) {
            this.f21377a.add(c5770c);
            int i11 = c5770c.f21374c;
            if (i10 != -1) {
                i11 -= this.f21381e[m22917c(i10)].f21374c;
            }
            int i12 = this.f21380d;
            if (i11 > i12) {
                m22916b();
                return;
            }
            int m22918d = m22918d((this.f21384h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f21383g + 1;
                C5770c[] c5770cArr = this.f21381e;
                if (i13 > c5770cArr.length) {
                    C5770c[] c5770cArr2 = new C5770c[c5770cArr.length * 2];
                    System.arraycopy(c5770cArr, 0, c5770cArr2, c5770cArr.length, c5770cArr.length);
                    this.f21382f = this.f21381e.length - 1;
                    this.f21381e = c5770cArr2;
                }
                int i14 = this.f21382f;
                this.f21382f = i14 - 1;
                this.f21381e[i14] = c5770c;
                this.f21383g++;
            } else {
                this.f21381e[i10 + m22917c(i10) + m22918d] = c5770c;
            }
            this.f21384h += i11;
        }

        /* renamed from: h */
        public final boolean m22922h(int i10) {
            return i10 >= 0 && i10 <= C5771d.f21375a.length - 1;
        }

        /* renamed from: i */
        public final int m22923i() {
            return this.f21378b.readByte() & 255;
        }

        /* renamed from: j */
        public C0560f m22924j() {
            int m22923i = m22923i();
            boolean z10 = (m22923i & 128) == 128;
            int m22927m = m22927m(m22923i, 127);
            return z10 ? C0560f.m2860p(C5778k.m23051f().m23054c(this.f21378b.mo2841p0(m22927m))) : this.f21378b.mo2837m(m22927m);
        }

        /* renamed from: k */
        public void m22925k() {
            while (!this.f21378b.mo2805B()) {
                int readByte = this.f21378b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    m22926l(m22927m(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m22929o();
                } else if ((readByte & 64) == 64) {
                    m22928n(m22927m(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m22927m = m22927m(readByte, 31);
                    this.f21380d = m22927m;
                    if (m22927m < 0 || m22927m > this.f21379c) {
                        throw new IOException("Invalid dynamic table size update " + this.f21380d);
                    }
                    m22915a();
                } else if (readByte == 16 || readByte == 0) {
                    m22931q();
                } else {
                    m22930p(m22927m(readByte, 15) - 1);
                }
            }
        }

        /* renamed from: l */
        public final void m22926l(int i10) {
            if (m22922h(i10)) {
                this.f21377a.add(C5771d.f21375a[i10]);
                return;
            }
            int m22917c = m22917c(i10 - C5771d.f21375a.length);
            if (m22917c >= 0) {
                C5770c[] c5770cArr = this.f21381e;
                if (m22917c < c5770cArr.length) {
                    this.f21377a.add(c5770cArr[m22917c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        /* renamed from: m */
        public int m22927m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int m22923i = m22923i();
                if ((m22923i & 128) == 0) {
                    return i11 + (m22923i << i13);
                }
                i11 += (m22923i & 127) << i13;
                i13 += 7;
            }
        }

        /* renamed from: n */
        public final void m22928n(int i10) {
            m22921g(-1, new C5770c(m22920f(i10), m22924j()));
        }

        /* renamed from: o */
        public final void m22929o() {
            m22921g(-1, new C5770c(C5771d.m22913a(m22924j()), m22924j()));
        }

        /* renamed from: p */
        public final void m22930p(int i10) {
            this.f21377a.add(new C5770c(m22920f(i10), m22924j()));
        }

        /* renamed from: q */
        public final void m22931q() {
            this.f21377a.add(new C5770c(C5771d.m22913a(m22924j()), m22924j()));
        }
    }

    /* renamed from: xe.d$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public final C0557c f21385a;

        /* renamed from: b */
        public final boolean f21386b;

        /* renamed from: c */
        public int f21387c;

        /* renamed from: d */
        public boolean f21388d;

        /* renamed from: e */
        public int f21389e;

        /* renamed from: f */
        public int f21390f;

        /* renamed from: g */
        public C5770c[] f21391g;

        /* renamed from: h */
        public int f21392h;

        /* renamed from: i */
        public int f21393i;

        /* renamed from: j */
        public int f21394j;

        public b(int i10, boolean z10, C0557c c0557c) {
            this.f21387c = C1841a.e.API_PRIORITY_OTHER;
            this.f21391g = new C5770c[8];
            this.f21392h = r0.length - 1;
            this.f21393i = 0;
            this.f21394j = 0;
            this.f21389e = i10;
            this.f21390f = i10;
            this.f21386b = z10;
            this.f21385a = c0557c;
        }

        public b(C0557c c0557c) {
            this(4096, true, c0557c);
        }

        /* renamed from: a */
        public final void m22932a() {
            int i10 = this.f21390f;
            int i11 = this.f21394j;
            if (i10 < i11) {
                if (i10 == 0) {
                    m22933b();
                } else {
                    m22934c(i11 - i10);
                }
            }
        }

        /* renamed from: b */
        public final void m22933b() {
            Arrays.fill(this.f21391g, (Object) null);
            this.f21392h = this.f21391g.length - 1;
            this.f21393i = 0;
            this.f21394j = 0;
        }

        /* renamed from: c */
        public final int m22934c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f21391g.length;
                while (true) {
                    length--;
                    i11 = this.f21392h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    C5770c[] c5770cArr = this.f21391g;
                    i10 -= c5770cArr[length].f21374c;
                    this.f21394j -= c5770cArr[length].f21374c;
                    this.f21393i--;
                    i12++;
                }
                C5770c[] c5770cArr2 = this.f21391g;
                System.arraycopy(c5770cArr2, i11 + 1, c5770cArr2, i11 + 1 + i12, this.f21393i);
                C5770c[] c5770cArr3 = this.f21391g;
                int i13 = this.f21392h;
                Arrays.fill(c5770cArr3, i13 + 1, i13 + 1 + i12, (Object) null);
                this.f21392h += i12;
            }
            return i12;
        }

        /* renamed from: d */
        public final void m22935d(C5770c c5770c) {
            int i10 = c5770c.f21374c;
            int i11 = this.f21390f;
            if (i10 > i11) {
                m22933b();
                return;
            }
            m22934c((this.f21394j + i10) - i11);
            int i12 = this.f21393i + 1;
            C5770c[] c5770cArr = this.f21391g;
            if (i12 > c5770cArr.length) {
                C5770c[] c5770cArr2 = new C5770c[c5770cArr.length * 2];
                System.arraycopy(c5770cArr, 0, c5770cArr2, c5770cArr.length, c5770cArr.length);
                this.f21392h = this.f21391g.length - 1;
                this.f21391g = c5770cArr2;
            }
            int i13 = this.f21392h;
            this.f21392h = i13 - 1;
            this.f21391g[i13] = c5770c;
            this.f21393i++;
            this.f21394j += i10;
        }

        /* renamed from: e */
        public void m22936e(int i10) {
            this.f21389e = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f21390f;
            if (i11 == min) {
                return;
            }
            if (min < i11) {
                this.f21387c = Math.min(this.f21387c, min);
            }
            this.f21388d = true;
            this.f21390f = min;
            m22932a();
        }

        /* renamed from: f */
        public void m22937f(C0560f c0560f) {
            int mo2871u;
            int i10;
            if (!this.f21386b || C5778k.m23051f().m23056e(c0560f) >= c0560f.mo2871u()) {
                mo2871u = c0560f.mo2871u();
                i10 = 0;
            } else {
                C0557c c0557c = new C0557c();
                C5778k.m23051f().m23055d(c0560f, c0557c);
                c0560f = c0557c.m2821W();
                mo2871u = c0560f.mo2871u();
                i10 = 128;
            }
            m22939h(mo2871u, 127, i10);
            this.f21385a.m2840n0(c0560f);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m22938g(java.util.List<p344xe.C5770c> r14) {
            /*
                Method dump skipped, instructions count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p344xe.C5771d.b.m22938g(java.util.List):void");
        }

        /* renamed from: h */
        public void m22939h(int i10, int i11, int i12) {
            int i13;
            C0557c c0557c;
            if (i10 < i11) {
                c0557c = this.f21385a;
                i13 = i10 | i12;
            } else {
                this.f21385a.mo2807C(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f21385a.mo2807C(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                c0557c = this.f21385a;
            }
            c0557c.mo2807C(i13);
        }
    }

    static {
        C0560f c0560f = C5770c.f21368f;
        C0560f c0560f2 = C5770c.f21369g;
        C0560f c0560f3 = C5770c.f21370h;
        C0560f c0560f4 = C5770c.f21367e;
        f21375a = new C5770c[]{new C5770c(C5770c.f21371i, ""), new C5770c(c0560f, "GET"), new C5770c(c0560f, "POST"), new C5770c(c0560f2, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE), new C5770c(c0560f2, "/index.html"), new C5770c(c0560f3, "http"), new C5770c(c0560f3, "https"), new C5770c(c0560f4, "200"), new C5770c(c0560f4, "204"), new C5770c(c0560f4, "206"), new C5770c(c0560f4, "304"), new C5770c(c0560f4, "400"), new C5770c(c0560f4, "404"), new C5770c(c0560f4, "500"), new C5770c("accept-charset", ""), new C5770c("accept-encoding", "gzip, deflate"), new C5770c("accept-language", ""), new C5770c("accept-ranges", ""), new C5770c("accept", ""), new C5770c("access-control-allow-origin", ""), new C5770c("age", ""), new C5770c("allow", ""), new C5770c("authorization", ""), new C5770c("cache-control", ""), new C5770c("content-disposition", ""), new C5770c("content-encoding", ""), new C5770c("content-language", ""), new C5770c("content-length", ""), new C5770c("content-location", ""), new C5770c("content-range", ""), new C5770c("content-type", ""), new C5770c("cookie", ""), new C5770c("date", ""), new C5770c("etag", ""), new C5770c("expect", ""), new C5770c("expires", ""), new C5770c("from", ""), new C5770c(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, ""), new C5770c("if-match", ""), new C5770c("if-modified-since", ""), new C5770c("if-none-match", ""), new C5770c("if-range", ""), new C5770c("if-unmodified-since", ""), new C5770c("last-modified", ""), new C5770c("link", ""), new C5770c("location", ""), new C5770c("max-forwards", ""), new C5770c("proxy-authenticate", ""), new C5770c("proxy-authorization", ""), new C5770c("range", ""), new C5770c("referer", ""), new C5770c("refresh", ""), new C5770c("retry-after", ""), new C5770c("server", ""), new C5770c("set-cookie", ""), new C5770c("strict-transport-security", ""), new C5770c("transfer-encoding", ""), new C5770c("user-agent", ""), new C5770c("vary", ""), new C5770c("via", ""), new C5770c("www-authenticate", "")};
        f21376b = m22914b();
    }

    /* renamed from: a */
    public static C0560f m22913a(C0560f c0560f) {
        int mo2871u = c0560f.mo2871u();
        for (int i10 = 0; i10 < mo2871u; i10++) {
            byte mo2865n = c0560f.mo2865n(i10);
            if (mo2865n >= 65 && mo2865n <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c0560f.mo2876z());
            }
        }
        return c0560f;
    }

    /* renamed from: b */
    public static Map<C0560f, Integer> m22914b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f21375a.length);
        int i10 = 0;
        while (true) {
            C5770c[] c5770cArr = f21375a;
            if (i10 >= c5770cArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(c5770cArr[i10].f21372a)) {
                linkedHashMap.put(c5770cArr[i10].f21372a, Integer.valueOf(i10));
            }
            i10++;
        }
    }
}
