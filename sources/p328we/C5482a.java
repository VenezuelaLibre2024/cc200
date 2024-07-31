package p328we;

import bf.C0557c;
import bf.C0563i;
import bf.C0575u;
import bf.InterfaceC0558d;
import bf.InterfaceC0559e;
import bf.InterfaceC0573s;
import bf.InterfaceC0574t;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p079f6.C1841a;
import p299ue.C5017e;
import re.C4349b0;
import re.C4353d0;
import re.C4373u;
import re.C4374v;
import re.C4377y;
import se.AbstractC4592a;
import se.C4596e;
import ve.C5170e;
import ve.C5174i;
import ve.C5176k;
import ve.InterfaceC5168c;

/* renamed from: we.a */
/* loaded from: classes2.dex */
public final class C5482a implements InterfaceC5168c {

    /* renamed from: a */
    public final C4377y f20375a;

    /* renamed from: b */
    public final C5017e f20376b;

    /* renamed from: c */
    public final InterfaceC0559e f20377c;

    /* renamed from: d */
    public final InterfaceC0558d f20378d;

    /* renamed from: e */
    public int f20379e = 0;

    /* renamed from: f */
    public long f20380f = 262144;

    /* renamed from: g */
    public C4373u f20381g;

    /* renamed from: we.a$b */
    /* loaded from: classes2.dex */
    public abstract class b implements InterfaceC0574t {

        /* renamed from: h */
        public final C0563i f20382h;

        /* renamed from: i */
        public boolean f20383i;

        public b() {
            this.f20382h = new C0563i(C5482a.this.f20377c.mo2801c());
        }

        @Override // bf.InterfaceC0574t
        /* renamed from: T */
        public long mo2800T(C0557c c0557c, long j10) {
            try {
                return C5482a.this.f20377c.mo2800T(c0557c, j10);
            } catch (IOException e10) {
                C5482a.this.f20376b.m19692p();
                m21737a();
                throw e10;
            }
        }

        /* renamed from: a */
        public final void m21737a() {
            if (C5482a.this.f20379e == 6) {
                return;
            }
            if (C5482a.this.f20379e == 5) {
                C5482a.this.m21729s(this.f20382h);
                C5482a.this.f20379e = 6;
            } else {
                throw new IllegalStateException("state: " + C5482a.this.f20379e);
            }
        }

        @Override // bf.InterfaceC0574t
        /* renamed from: c */
        public C0575u mo2801c() {
            return this.f20382h;
        }
    }

    /* renamed from: we.a$c */
    /* loaded from: classes2.dex */
    public final class c implements InterfaceC0573s {

        /* renamed from: h */
        public final C0563i f20385h;

        /* renamed from: i */
        public boolean f20386i;

        public c() {
            this.f20385h = new C0563i(C5482a.this.f20378d.mo2799c());
        }

        @Override // bf.InterfaceC0573s
        /* renamed from: C0 */
        public void mo2798C0(C0557c c0557c, long j10) {
            if (this.f20386i) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            C5482a.this.f20378d.mo2826d0(j10);
            C5482a.this.f20378d.mo2820S("\r\n");
            C5482a.this.f20378d.mo2798C0(c0557c, j10);
            C5482a.this.f20378d.mo2820S("\r\n");
        }

        @Override // bf.InterfaceC0573s
        /* renamed from: c */
        public C0575u mo2799c() {
            return this.f20385h;
        }

        @Override // bf.InterfaceC0573s, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f20386i) {
                return;
            }
            this.f20386i = true;
            C5482a.this.f20378d.mo2820S("0\r\n\r\n");
            C5482a.this.m21729s(this.f20385h);
            C5482a.this.f20379e = 3;
        }

        @Override // bf.InterfaceC0573s, java.io.Flushable
        public synchronized void flush() {
            if (this.f20386i) {
                return;
            }
            C5482a.this.f20378d.flush();
        }
    }

    /* renamed from: we.a$d */
    /* loaded from: classes2.dex */
    public class d extends b {

        /* renamed from: k */
        public final C4374v f20388k;

        /* renamed from: l */
        public long f20389l;

        /* renamed from: m */
        public boolean f20390m;

        public d(C4374v c4374v) {
            super();
            this.f20389l = -1L;
            this.f20390m = true;
            this.f20388k = c4374v;
        }

        @Override // p328we.C5482a.b, bf.InterfaceC0574t
        /* renamed from: T */
        public long mo2800T(C0557c c0557c, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f20383i) {
                throw new IllegalStateException("closed");
            }
            if (!this.f20390m) {
                return -1L;
            }
            long j11 = this.f20389l;
            if (j11 == 0 || j11 == -1) {
                m21738d();
                if (!this.f20390m) {
                    return -1L;
                }
            }
            long mo2800T = super.mo2800T(c0557c, Math.min(j10, this.f20389l));
            if (mo2800T != -1) {
                this.f20389l -= mo2800T;
                return mo2800T;
            }
            C5482a.this.f20376b.m19692p();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m21737a();
            throw protocolException;
        }

        @Override // bf.InterfaceC0574t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f20383i) {
                return;
            }
            if (this.f20390m && !C4596e.m18107o(this, 100, TimeUnit.MILLISECONDS)) {
                C5482a.this.f20376b.m19692p();
                m21737a();
            }
            this.f20383i = true;
        }

        /* renamed from: d */
        public final void m21738d() {
            if (this.f20389l != -1) {
                C5482a.this.f20377c.mo2834k0();
            }
            try {
                this.f20389l = C5482a.this.f20377c.mo2809F0();
                String trim = C5482a.this.f20377c.mo2834k0().trim();
                if (this.f20389l < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f20389l + trim + "\"");
                }
                if (this.f20389l == 0) {
                    this.f20390m = false;
                    C5482a c5482a = C5482a.this;
                    c5482a.f20381g = c5482a.m21736z();
                    C5170e.m20938e(C5482a.this.f20375a.m16907i(), this.f20388k, C5482a.this.f20381g);
                    m21737a();
                }
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }
    }

    /* renamed from: we.a$e */
    /* loaded from: classes2.dex */
    public class e extends b {

        /* renamed from: k */
        public long f20392k;

        public e(long j10) {
            super();
            this.f20392k = j10;
            if (j10 == 0) {
                m21737a();
            }
        }

        @Override // p328we.C5482a.b, bf.InterfaceC0574t
        /* renamed from: T */
        public long mo2800T(C0557c c0557c, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f20383i) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f20392k;
            if (j11 == 0) {
                return -1L;
            }
            long mo2800T = super.mo2800T(c0557c, Math.min(j11, j10));
            if (mo2800T == -1) {
                C5482a.this.f20376b.m19692p();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m21737a();
                throw protocolException;
            }
            long j12 = this.f20392k - mo2800T;
            this.f20392k = j12;
            if (j12 == 0) {
                m21737a();
            }
            return mo2800T;
        }

        @Override // bf.InterfaceC0574t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f20383i) {
                return;
            }
            if (this.f20392k != 0 && !C4596e.m18107o(this, 100, TimeUnit.MILLISECONDS)) {
                C5482a.this.f20376b.m19692p();
                m21737a();
            }
            this.f20383i = true;
        }
    }

    /* renamed from: we.a$f */
    /* loaded from: classes2.dex */
    public final class f implements InterfaceC0573s {

        /* renamed from: h */
        public final C0563i f20394h;

        /* renamed from: i */
        public boolean f20395i;

        public f() {
            this.f20394h = new C0563i(C5482a.this.f20378d.mo2799c());
        }

        @Override // bf.InterfaceC0573s
        /* renamed from: C0 */
        public void mo2798C0(C0557c c0557c, long j10) {
            if (this.f20395i) {
                throw new IllegalStateException("closed");
            }
            C4596e.m18097e(c0557c.m2831g0(), 0L, j10);
            C5482a.this.f20378d.mo2798C0(c0557c, j10);
        }

        @Override // bf.InterfaceC0573s
        /* renamed from: c */
        public C0575u mo2799c() {
            return this.f20394h;
        }

        @Override // bf.InterfaceC0573s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f20395i) {
                return;
            }
            this.f20395i = true;
            C5482a.this.m21729s(this.f20394h);
            C5482a.this.f20379e = 3;
        }

        @Override // bf.InterfaceC0573s, java.io.Flushable
        public void flush() {
            if (this.f20395i) {
                return;
            }
            C5482a.this.f20378d.flush();
        }
    }

    /* renamed from: we.a$g */
    /* loaded from: classes2.dex */
    public class g extends b {

        /* renamed from: k */
        public boolean f20397k;

        public g() {
            super();
        }

        @Override // p328we.C5482a.b, bf.InterfaceC0574t
        /* renamed from: T */
        public long mo2800T(C0557c c0557c, long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j10);
            }
            if (this.f20383i) {
                throw new IllegalStateException("closed");
            }
            if (this.f20397k) {
                return -1L;
            }
            long mo2800T = super.mo2800T(c0557c, j10);
            if (mo2800T != -1) {
                return mo2800T;
            }
            this.f20397k = true;
            m21737a();
            return -1L;
        }

        @Override // bf.InterfaceC0574t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f20383i) {
                return;
            }
            if (!this.f20397k) {
                m21737a();
            }
            this.f20383i = true;
        }
    }

    public C5482a(C4377y c4377y, C5017e c5017e, InterfaceC0559e interfaceC0559e, InterfaceC0558d interfaceC0558d) {
        this.f20375a = c4377y;
        this.f20376b = c5017e;
        this.f20377c = interfaceC0559e;
        this.f20378d = interfaceC0558d;
    }

    /* renamed from: A */
    public void m21727A(C4353d0 c4353d0) {
        long m20935b = C5170e.m20935b(c4353d0);
        if (m20935b == -1) {
            return;
        }
        InterfaceC0574t m21732v = m21732v(m20935b);
        C4596e.m18085E(m21732v, C1841a.e.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
        m21732v.close();
    }

    /* renamed from: B */
    public void m21728B(C4373u c4373u, String str) {
        if (this.f20379e != 0) {
            throw new IllegalStateException("state: " + this.f20379e);
        }
        this.f20378d.mo2820S(str).mo2820S("\r\n");
        int m16831h = c4373u.m16831h();
        for (int i10 = 0; i10 < m16831h; i10++) {
            this.f20378d.mo2820S(c4373u.m16829e(i10)).mo2820S(": ").mo2820S(c4373u.m16832i(i10)).mo2820S("\r\n");
        }
        this.f20378d.mo2820S("\r\n");
        this.f20379e = 1;
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: a */
    public void mo20923a() {
        this.f20378d.flush();
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: b */
    public InterfaceC0574t mo20924b(C4353d0 c4353d0) {
        if (!C5170e.m20936c(c4353d0)) {
            return m21732v(0L);
        }
        if ("chunked".equalsIgnoreCase(c4353d0.m16707l("Transfer-Encoding"))) {
            return m21731u(c4353d0.m16701K().m16666h());
        }
        long m20935b = C5170e.m20935b(c4353d0);
        return m20935b != -1 ? m21732v(m20935b) : m21734x();
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: c */
    public void mo20925c(C4349b0 c4349b0) {
        m21728B(c4349b0.m16662d(), C5174i.m20950a(c4349b0, this.f20376b.m19693q().m16738b().type()));
    }

    @Override // ve.InterfaceC5168c
    public void cancel() {
        C5017e c5017e = this.f20376b;
        if (c5017e != null) {
            c5017e.m19679c();
        }
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: d */
    public C4353d0.a mo20926d(boolean z10) {
        int i10 = this.f20379e;
        if (i10 != 1 && i10 != 3) {
            throw new IllegalStateException("state: " + this.f20379e);
        }
        try {
            C5176k m20958a = C5176k.m20958a(m21735y());
            C4353d0.a m16720j = new C4353d0.a().m16725o(m20958a.f19522a).m16717g(m20958a.f19523b).m16722l(m20958a.f19524c).m16720j(m21736z());
            if (z10 && m20958a.f19523b == 100) {
                return null;
            }
            if (m20958a.f19523b == 100) {
                this.f20379e = 3;
                return m16720j;
            }
            this.f20379e = 4;
            return m16720j;
        } catch (EOFException e10) {
            C5017e c5017e = this.f20376b;
            throw new IOException("unexpected end of stream on " + (c5017e != null ? c5017e.m19693q().m16737a().m16644l().m16868z() : "unknown"), e10);
        }
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: e */
    public InterfaceC0573s mo20927e(C4349b0 c4349b0, long j10) {
        if (c4349b0.m16659a() != null && c4349b0.m16659a().m16681e()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(c4349b0.m16661c("Transfer-Encoding"))) {
            return m21730t();
        }
        if (j10 != -1) {
            return m21733w();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: f */
    public C5017e mo20928f() {
        return this.f20376b;
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: g */
    public void mo20929g() {
        this.f20378d.flush();
    }

    @Override // ve.InterfaceC5168c
    /* renamed from: h */
    public long mo20930h(C4353d0 c4353d0) {
        if (!C5170e.m20936c(c4353d0)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(c4353d0.m16707l("Transfer-Encoding"))) {
            return -1L;
        }
        return C5170e.m20935b(c4353d0);
    }

    /* renamed from: s */
    public final void m21729s(C0563i c0563i) {
        C0575u m2885i = c0563i.m2885i();
        c0563i.m2886j(C0575u.f2551d);
        m2885i.mo2878a();
        m2885i.mo2879b();
    }

    /* renamed from: t */
    public final InterfaceC0573s m21730t() {
        if (this.f20379e == 1) {
            this.f20379e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f20379e);
    }

    /* renamed from: u */
    public final InterfaceC0574t m21731u(C4374v c4374v) {
        if (this.f20379e == 4) {
            this.f20379e = 5;
            return new d(c4374v);
        }
        throw new IllegalStateException("state: " + this.f20379e);
    }

    /* renamed from: v */
    public final InterfaceC0574t m21732v(long j10) {
        if (this.f20379e == 4) {
            this.f20379e = 5;
            return new e(j10);
        }
        throw new IllegalStateException("state: " + this.f20379e);
    }

    /* renamed from: w */
    public final InterfaceC0573s m21733w() {
        if (this.f20379e == 1) {
            this.f20379e = 2;
            return new f();
        }
        throw new IllegalStateException("state: " + this.f20379e);
    }

    /* renamed from: x */
    public final InterfaceC0574t m21734x() {
        if (this.f20379e == 4) {
            this.f20379e = 5;
            this.f20376b.m19692p();
            return new g();
        }
        throw new IllegalStateException("state: " + this.f20379e);
    }

    /* renamed from: y */
    public final String m21735y() {
        String mo2818L = this.f20377c.mo2818L(this.f20380f);
        this.f20380f -= mo2818L.length();
        return mo2818L;
    }

    /* renamed from: z */
    public final C4373u m21736z() {
        C4373u.a aVar = new C4373u.a();
        while (true) {
            String m21735y = m21735y();
            if (m21735y.length() == 0) {
                return aVar.m16837d();
            }
            AbstractC4592a.f17225a.mo16923a(aVar, m21735y);
        }
    }
}
