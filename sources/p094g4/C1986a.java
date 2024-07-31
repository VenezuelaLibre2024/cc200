package p094g4;

import java.io.EOFException;
import java.io.IOException;
import p222p5.C4014a;
import p222p5.C4041n0;
import p333x3.C5557a0;
import p333x3.C5574n;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5586z;

/* renamed from: g4.a */
/* loaded from: classes.dex */
public final class C1986a implements InterfaceC1992g {

    /* renamed from: a */
    public final C1991f f7901a;

    /* renamed from: b */
    public final long f7902b;

    /* renamed from: c */
    public final long f7903c;

    /* renamed from: d */
    public final AbstractC1994i f7904d;

    /* renamed from: e */
    public int f7905e;

    /* renamed from: f */
    public long f7906f;

    /* renamed from: g */
    public long f7907g;

    /* renamed from: h */
    public long f7908h;

    /* renamed from: i */
    public long f7909i;

    /* renamed from: j */
    public long f7910j;

    /* renamed from: k */
    public long f7911k;

    /* renamed from: l */
    public long f7912l;

    /* renamed from: g4.a$b */
    /* loaded from: classes.dex */
    public final class b implements InterfaceC5586z {
        public b() {
        }

        public /* synthetic */ b(C1986a c1986a, a aVar) {
            this();
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: d */
        public long mo3035d() {
            return C1986a.this.f7904d.m8050b(C1986a.this.f7906f);
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: f */
        public boolean mo3036f() {
            return true;
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: i */
        public InterfaceC5586z.a mo3037i(long j10) {
            return new InterfaceC5586z.a(new C5557a0(j10, C4041n0.m15479r((C1986a.this.f7902b + ((C1986a.this.f7904d.m8051c(j10) * (C1986a.this.f7903c - C1986a.this.f7902b)) / C1986a.this.f7906f)) - 30000, C1986a.this.f7902b, C1986a.this.f7903c - 1)));
        }
    }

    public C1986a(AbstractC1994i abstractC1994i, long j10, long j11, long j12, long j13, boolean z10) {
        C4014a.m15195a(j10 >= 0 && j11 > j10);
        this.f7904d = abstractC1994i;
        this.f7902b = j10;
        this.f7903c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f7906f = j13;
            this.f7905e = 4;
        } else {
            this.f7905e = 0;
        }
        this.f7901a = new C1991f();
    }

    @Override // p094g4.InterfaceC1992g
    /* renamed from: a */
    public long mo8019a(InterfaceC5572l interfaceC5572l) {
        int i10 = this.f7905e;
        if (i10 == 0) {
            long position = interfaceC5572l.getPosition();
            this.f7907g = position;
            this.f7905e = 1;
            long j10 = this.f7903c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long m8023i = m8023i(interfaceC5572l);
                if (m8023i != -1) {
                    return m8023i;
                }
                this.f7905e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            m8025k(interfaceC5572l);
            this.f7905e = 4;
            return -(this.f7911k + 2);
        }
        this.f7906f = m8024j(interfaceC5572l);
        this.f7905e = 4;
        return this.f7907g;
    }

    @Override // p094g4.InterfaceC1992g
    /* renamed from: c */
    public void mo8021c(long j10) {
        this.f7908h = C4041n0.m15479r(j10, 0L, this.f7906f - 1);
        this.f7905e = 2;
        this.f7909i = this.f7902b;
        this.f7910j = this.f7903c;
        this.f7911k = 0L;
        this.f7912l = this.f7906f;
    }

    @Override // p094g4.InterfaceC1992g
    /* renamed from: h */
    public b mo8020b() {
        if (this.f7906f != 0) {
            return new b();
        }
        return null;
    }

    /* renamed from: i */
    public final long m8023i(InterfaceC5572l interfaceC5572l) {
        if (this.f7909i == this.f7910j) {
            return -1L;
        }
        long position = interfaceC5572l.getPosition();
        if (!this.f7901a.m8046d(interfaceC5572l, this.f7910j)) {
            long j10 = this.f7909i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f7901a.m8043a(interfaceC5572l, false);
        interfaceC5572l.mo22427l();
        long j11 = this.f7908h;
        C1991f c1991f = this.f7901a;
        long j12 = c1991f.f7932c;
        long j13 = j11 - j12;
        int i10 = c1991f.f7937h + c1991f.f7938i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f7910j = position;
            this.f7912l = j12;
        } else {
            this.f7909i = interfaceC5572l.getPosition() + i10;
            this.f7911k = this.f7901a.f7932c;
        }
        long j14 = this.f7910j;
        long j15 = this.f7909i;
        if (j14 - j15 < 100000) {
            this.f7910j = j15;
            return j15;
        }
        long position2 = interfaceC5572l.getPosition() - (i10 * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f7910j;
        long j17 = this.f7909i;
        return C4041n0.m15479r(position2 + ((j13 * (j16 - j17)) / (this.f7912l - this.f7911k)), j17, j16 - 1);
    }

    /* renamed from: j */
    public long m8024j(InterfaceC5572l interfaceC5572l) {
        long j10;
        C1991f c1991f;
        this.f7901a.m8044b();
        if (!this.f7901a.m8045c(interfaceC5572l)) {
            throw new EOFException();
        }
        this.f7901a.m8043a(interfaceC5572l, false);
        C1991f c1991f2 = this.f7901a;
        interfaceC5572l.mo22428m(c1991f2.f7937h + c1991f2.f7938i);
        do {
            j10 = this.f7901a.f7932c;
            C1991f c1991f3 = this.f7901a;
            if ((c1991f3.f7931b & 4) == 4 || !c1991f3.m8045c(interfaceC5572l) || interfaceC5572l.getPosition() >= this.f7903c || !this.f7901a.m8043a(interfaceC5572l, true)) {
                break;
            }
            c1991f = this.f7901a;
        } while (C5574n.m22464e(interfaceC5572l, c1991f.f7937h + c1991f.f7938i));
        return j10;
    }

    /* renamed from: k */
    public final void m8025k(InterfaceC5572l interfaceC5572l) {
        while (true) {
            this.f7901a.m8045c(interfaceC5572l);
            this.f7901a.m8043a(interfaceC5572l, false);
            C1991f c1991f = this.f7901a;
            if (c1991f.f7932c > this.f7908h) {
                interfaceC5572l.mo22427l();
                return;
            } else {
                interfaceC5572l.mo22428m(c1991f.f7937h + c1991f.f7938i);
                this.f7909i = interfaceC5572l.getPosition();
                this.f7911k = this.f7901a.f7932c;
            }
        }
    }
}
