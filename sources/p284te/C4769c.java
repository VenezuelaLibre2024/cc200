package p284te;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import re.C4349b0;
import re.C4352d;
import re.C4353d0;
import re.C4373u;
import se.AbstractC4592a;
import ve.C5169d;
import ve.C5170e;

/* renamed from: te.c */
/* loaded from: classes2.dex */
public final class C4769c {

    /* renamed from: a */
    public final C4349b0 f17741a;

    /* renamed from: b */
    public final C4353d0 f17742b;

    /* renamed from: te.c$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public final long f17743a;

        /* renamed from: b */
        public final C4349b0 f17744b;

        /* renamed from: c */
        public final C4353d0 f17745c;

        /* renamed from: d */
        public Date f17746d;

        /* renamed from: e */
        public String f17747e;

        /* renamed from: f */
        public Date f17748f;

        /* renamed from: g */
        public String f17749g;

        /* renamed from: h */
        public Date f17750h;

        /* renamed from: i */
        public long f17751i;

        /* renamed from: j */
        public long f17752j;

        /* renamed from: k */
        public String f17753k;

        /* renamed from: l */
        public int f17754l;

        public a(long j10, C4349b0 c4349b0, C4353d0 c4353d0) {
            this.f17754l = -1;
            this.f17743a = j10;
            this.f17744b = c4349b0;
            this.f17745c = c4353d0;
            if (c4353d0 != null) {
                this.f17751i = c4353d0.m16702P();
                this.f17752j = c4353d0.m16700I();
                C4373u m16709w = c4353d0.m16709w();
                int m16831h = m16709w.m16831h();
                for (int i10 = 0; i10 < m16831h; i10++) {
                    String m16829e = m16709w.m16829e(i10);
                    String m16832i = m16709w.m16832i(i10);
                    if ("Date".equalsIgnoreCase(m16829e)) {
                        this.f17746d = C5169d.m20932b(m16832i);
                        this.f17747e = m16832i;
                    } else if ("Expires".equalsIgnoreCase(m16829e)) {
                        this.f17750h = C5169d.m20932b(m16832i);
                    } else if ("Last-Modified".equalsIgnoreCase(m16829e)) {
                        this.f17748f = C5169d.m20932b(m16832i);
                        this.f17749g = m16832i;
                    } else if ("ETag".equalsIgnoreCase(m16829e)) {
                        this.f17753k = m16832i;
                    } else if ("Age".equalsIgnoreCase(m16829e)) {
                        this.f17754l = C5170e.m20937d(m16832i, -1);
                    }
                }
            }
        }

        /* renamed from: e */
        public static boolean m18693e(C4349b0 c4349b0) {
            return (c4349b0.m16661c("If-Modified-Since") == null && c4349b0.m16661c("If-None-Match") == null) ? false : true;
        }

        /* renamed from: a */
        public final long m18694a() {
            Date date = this.f17746d;
            long max = date != null ? Math.max(0L, this.f17752j - date.getTime()) : 0L;
            int i10 = this.f17754l;
            if (i10 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f17752j;
            return max + (j10 - this.f17751i) + (this.f17743a - j10);
        }

        /* renamed from: b */
        public final long m18695b() {
            if (this.f17745c.m16704d().m16688d() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m16688d());
            }
            if (this.f17750h != null) {
                Date date = this.f17746d;
                long time = this.f17750h.getTime() - (date != null ? date.getTime() : this.f17752j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f17748f == null || this.f17745c.m16701K().m16666h().m16867x() != null) {
                return 0L;
            }
            Date date2 = this.f17746d;
            long time2 = (date2 != null ? date2.getTime() : this.f17751i) - this.f17748f.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        /* renamed from: c */
        public C4769c m18696c() {
            C4769c m18697d = m18697d();
            return (m18697d.f17741a == null || !this.f17744b.m16660b().m16694j()) ? m18697d : new C4769c(null, null);
        }

        /* renamed from: d */
        public final C4769c m18697d() {
            if (this.f17745c == null) {
                return new C4769c(this.f17744b, null);
            }
            if ((!this.f17744b.m16663e() || this.f17745c.m16706j() != null) && C4769c.m18692a(this.f17745c, this.f17744b)) {
                C4352d m16660b = this.f17744b.m16660b();
                if (m16660b.m16692h() || m18693e(this.f17744b)) {
                    return new C4769c(this.f17744b, null);
                }
                C4352d m16704d = this.f17745c.m16704d();
                long m18694a = m18694a();
                long m18695b = m18695b();
                if (m16660b.m16688d() != -1) {
                    m18695b = Math.min(m18695b, TimeUnit.SECONDS.toMillis(m16660b.m16688d()));
                }
                long j10 = 0;
                long millis = m16660b.m16690f() != -1 ? TimeUnit.SECONDS.toMillis(m16660b.m16690f()) : 0L;
                if (!m16704d.m16691g() && m16660b.m16689e() != -1) {
                    j10 = TimeUnit.SECONDS.toMillis(m16660b.m16689e());
                }
                if (!m16704d.m16692h()) {
                    long j11 = millis + m18694a;
                    if (j11 < j10 + m18695b) {
                        C4353d0.a m16710x = this.f17745c.m16710x();
                        if (j11 >= m18695b) {
                            m16710x.m16711a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (m18694a > 86400000 && m18698f()) {
                            m16710x.m16711a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new C4769c(null, m16710x.m16713c());
                    }
                }
                String str = this.f17753k;
                String str2 = "If-Modified-Since";
                if (str != null) {
                    str2 = "If-None-Match";
                } else if (this.f17748f != null) {
                    str = this.f17749g;
                } else {
                    if (this.f17746d == null) {
                        return new C4769c(this.f17744b, null);
                    }
                    str = this.f17747e;
                }
                C4373u.a m16830f = this.f17744b.m16662d().m16830f();
                AbstractC4592a.f17225a.mo16924b(m16830f, str2, str);
                return new C4769c(this.f17744b.m16665g().m16670d(m16830f.m16837d()).m16667a(), this.f17745c);
            }
            return new C4769c(this.f17744b, null);
        }

        /* renamed from: f */
        public final boolean m18698f() {
            return this.f17745c.m16704d().m16688d() == -1 && this.f17750h == null;
        }
    }

    public C4769c(C4349b0 c4349b0, C4353d0 c4353d0) {
        this.f17741a = c4349b0;
        this.f17742b = c4353d0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.m16704d().m16686b() == false) goto L33;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m18692a(re.C4353d0 r3, re.C4349b0 r4) {
        /*
            int r0 = r3.m16705f()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.m16707l(r0)
            if (r0 != 0) goto L5a
            re.d r0 = r3.m16704d()
            int r0 = r0.m16688d()
            r1 = -1
            if (r0 != r1) goto L5a
            re.d r0 = r3.m16704d()
            boolean r0 = r0.m16687c()
            if (r0 != 0) goto L5a
            re.d r0 = r3.m16704d()
            boolean r0 = r0.m16686b()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            re.d r3 = r3.m16704d()
            boolean r3 = r3.m16693i()
            if (r3 != 0) goto L6f
            re.d r3 = r4.m16660b()
            boolean r3 = r3.m16693i()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p284te.C4769c.m18692a(re.d0, re.b0):boolean");
    }
}
