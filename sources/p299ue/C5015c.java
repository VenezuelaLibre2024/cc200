package p299ue;

import bf.AbstractC0561g;
import bf.AbstractC0562h;
import bf.C0557c;
import bf.C0566l;
import bf.InterfaceC0573s;
import bf.InterfaceC0574t;
import java.io.IOException;
import java.net.ProtocolException;
import re.AbstractC4355e0;
import re.AbstractC4371s;
import re.C4349b0;
import re.C4353d0;
import re.InterfaceC4354e;
import se.AbstractC4592a;
import ve.C5173h;
import ve.InterfaceC5168c;

/* renamed from: ue.c */
/* loaded from: classes2.dex */
public final class C5015c {

    /* renamed from: a */
    public final C5023k f18748a;

    /* renamed from: b */
    public final InterfaceC4354e f18749b;

    /* renamed from: c */
    public final AbstractC4371s f18750c;

    /* renamed from: d */
    public final C5016d f18751d;

    /* renamed from: e */
    public final InterfaceC5168c f18752e;

    /* renamed from: f */
    public boolean f18753f;

    /* renamed from: ue.c$a */
    /* loaded from: classes2.dex */
    public final class a extends AbstractC0561g {

        /* renamed from: i */
        public boolean f18754i;

        /* renamed from: j */
        public long f18755j;

        /* renamed from: k */
        public long f18756k;

        /* renamed from: l */
        public boolean f18757l;

        public a(InterfaceC0573s interfaceC0573s, long j10) {
            super(interfaceC0573s);
            this.f18755j = j10;
        }

        @Override // bf.AbstractC0561g, bf.InterfaceC0573s
        /* renamed from: C0 */
        public void mo2798C0(C0557c c0557c, long j10) {
            if (this.f18757l) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f18755j;
            if (j11 == -1 || this.f18756k + j10 <= j11) {
                try {
                    super.mo2798C0(c0557c, j10);
                    this.f18756k += j10;
                    return;
                } catch (IOException e10) {
                    throw m19667a(e10);
                }
            }
            throw new ProtocolException("expected " + this.f18755j + " bytes but received " + (this.f18756k + j10));
        }

        /* renamed from: a */
        public final IOException m19667a(IOException iOException) {
            if (this.f18754i) {
                return iOException;
            }
            this.f18754i = true;
            return C5015c.this.m19651a(this.f18756k, false, true, iOException);
        }

        @Override // bf.AbstractC0561g, bf.InterfaceC0573s, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f18757l) {
                return;
            }
            this.f18757l = true;
            long j10 = this.f18755j;
            if (j10 != -1 && this.f18756k != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m19667a(null);
            } catch (IOException e10) {
                throw m19667a(e10);
            }
        }

        @Override // bf.AbstractC0561g, bf.InterfaceC0573s, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw m19667a(e10);
            }
        }
    }

    /* renamed from: ue.c$b */
    /* loaded from: classes2.dex */
    public final class b extends AbstractC0562h {

        /* renamed from: i */
        public final long f18759i;

        /* renamed from: j */
        public long f18760j;

        /* renamed from: k */
        public boolean f18761k;

        /* renamed from: l */
        public boolean f18762l;

        public b(InterfaceC0574t interfaceC0574t, long j10) {
            super(interfaceC0574t);
            this.f18759i = j10;
            if (j10 == 0) {
                m19668d(null);
            }
        }

        @Override // bf.InterfaceC0574t
        /* renamed from: T */
        public long mo2800T(C0557c c0557c, long j10) {
            if (this.f18762l) {
                throw new IllegalStateException("closed");
            }
            try {
                long mo2800T = m2877a().mo2800T(c0557c, j10);
                if (mo2800T == -1) {
                    m19668d(null);
                    return -1L;
                }
                long j11 = this.f18760j + mo2800T;
                long j12 = this.f18759i;
                if (j12 != -1 && j11 > j12) {
                    throw new ProtocolException("expected " + this.f18759i + " bytes but received " + j11);
                }
                this.f18760j = j11;
                if (j11 == j12) {
                    m19668d(null);
                }
                return mo2800T;
            } catch (IOException e10) {
                throw m19668d(e10);
            }
        }

        @Override // bf.AbstractC0562h, bf.InterfaceC0574t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f18762l) {
                return;
            }
            this.f18762l = true;
            try {
                super.close();
                m19668d(null);
            } catch (IOException e10) {
                throw m19668d(e10);
            }
        }

        /* renamed from: d */
        public IOException m19668d(IOException iOException) {
            if (this.f18761k) {
                return iOException;
            }
            this.f18761k = true;
            return C5015c.this.m19651a(this.f18760j, true, false, iOException);
        }
    }

    public C5015c(C5023k c5023k, InterfaceC4354e interfaceC4354e, AbstractC4371s abstractC4371s, C5016d c5016d, InterfaceC5168c interfaceC5168c) {
        this.f18748a = c5023k;
        this.f18749b = interfaceC4354e;
        this.f18750c = abstractC4371s;
        this.f18751d = c5016d;
        this.f18752e = interfaceC5168c;
    }

    /* renamed from: a */
    public IOException m19651a(long j10, boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            m19665o(iOException);
        }
        if (z11) {
            AbstractC4371s abstractC4371s = this.f18750c;
            InterfaceC4354e interfaceC4354e = this.f18749b;
            if (iOException != null) {
                abstractC4371s.m16810p(interfaceC4354e, iOException);
            } else {
                abstractC4371s.m16808n(interfaceC4354e, j10);
            }
        }
        if (z10) {
            if (iOException != null) {
                this.f18750c.m16815u(this.f18749b, iOException);
            } else {
                this.f18750c.m16813s(this.f18749b, j10);
            }
        }
        return this.f18748a.m19729g(this, z11, z10, iOException);
    }

    /* renamed from: b */
    public void m19652b() {
        this.f18752e.cancel();
    }

    /* renamed from: c */
    public C5017e m19653c() {
        return this.f18752e.mo20928f();
    }

    /* renamed from: d */
    public InterfaceC0573s m19654d(C4349b0 c4349b0, boolean z10) {
        this.f18753f = z10;
        long mo16679a = c4349b0.m16659a().mo16679a();
        this.f18750c.m16809o(this.f18749b);
        return new a(this.f18752e.mo20927e(c4349b0, mo16679a), mo16679a);
    }

    /* renamed from: e */
    public void m19655e() {
        this.f18752e.cancel();
        this.f18748a.m19729g(this, true, true, null);
    }

    /* renamed from: f */
    public void m19656f() {
        try {
            this.f18752e.mo20923a();
        } catch (IOException e10) {
            this.f18750c.m16810p(this.f18749b, e10);
            m19665o(e10);
            throw e10;
        }
    }

    /* renamed from: g */
    public void m19657g() {
        try {
            this.f18752e.mo20929g();
        } catch (IOException e10) {
            this.f18750c.m16810p(this.f18749b, e10);
            m19665o(e10);
            throw e10;
        }
    }

    /* renamed from: h */
    public boolean m19658h() {
        return this.f18753f;
    }

    /* renamed from: i */
    public void m19659i() {
        this.f18752e.mo20928f().m19692p();
    }

    /* renamed from: j */
    public void m19660j() {
        this.f18748a.m19729g(this, true, false, null);
    }

    /* renamed from: k */
    public AbstractC4355e0 m19661k(C4353d0 c4353d0) {
        try {
            this.f18750c.m16814t(this.f18749b);
            String m16707l = c4353d0.m16707l("Content-Type");
            long mo20930h = this.f18752e.mo20930h(c4353d0);
            return new C5173h(m16707l, mo20930h, C0566l.m2894b(new b(this.f18752e.mo20924b(c4353d0), mo20930h)));
        } catch (IOException e10) {
            this.f18750c.m16815u(this.f18749b, e10);
            m19665o(e10);
            throw e10;
        }
    }

    /* renamed from: l */
    public C4353d0.a m19662l(boolean z10) {
        try {
            C4353d0.a mo20926d = this.f18752e.mo20926d(z10);
            if (mo20926d != null) {
                AbstractC4592a.f17225a.mo16929g(mo20926d, this);
            }
            return mo20926d;
        } catch (IOException e10) {
            this.f18750c.m16815u(this.f18749b, e10);
            m19665o(e10);
            throw e10;
        }
    }

    /* renamed from: m */
    public void m19663m(C4353d0 c4353d0) {
        this.f18750c.m16816v(this.f18749b, c4353d0);
    }

    /* renamed from: n */
    public void m19664n() {
        this.f18750c.m16817w(this.f18749b);
    }

    /* renamed from: o */
    public void m19665o(IOException iOException) {
        this.f18751d.m19676h();
        this.f18752e.mo20928f().m19698v(iOException);
    }

    /* renamed from: p */
    public void m19666p(C4349b0 c4349b0) {
        try {
            this.f18750c.m16812r(this.f18749b);
            this.f18752e.mo20925c(c4349b0);
            this.f18750c.m16811q(this.f18749b, c4349b0);
        } catch (IOException e10) {
            this.f18750c.m16810p(this.f18749b, e10);
            m19665o(e10);
            throw e10;
        }
    }
}
