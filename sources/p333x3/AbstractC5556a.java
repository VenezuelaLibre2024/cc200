package p333x3;

import p222p5.C4014a;
import p222p5.C4041n0;
import p333x3.InterfaceC5586z;

/* renamed from: x3.a */
/* loaded from: classes.dex */
public abstract class AbstractC5556a {

    /* renamed from: a */
    public final a f20827a;

    /* renamed from: b */
    public final f f20828b;

    /* renamed from: c */
    public c f20829c;

    /* renamed from: d */
    public final int f20830d;

    /* renamed from: x3.a$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC5586z {

        /* renamed from: a */
        public final d f20831a;

        /* renamed from: b */
        public final long f20832b;

        /* renamed from: c */
        public final long f20833c;

        /* renamed from: d */
        public final long f20834d;

        /* renamed from: e */
        public final long f20835e;

        /* renamed from: f */
        public final long f20836f;

        /* renamed from: g */
        public final long f20837g;

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f20831a = dVar;
            this.f20832b = j10;
            this.f20833c = j11;
            this.f20834d = j12;
            this.f20835e = j13;
            this.f20836f = j14;
            this.f20837g = j15;
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: d */
        public long mo3035d() {
            return this.f20832b;
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: f */
        public boolean mo3036f() {
            return true;
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: i */
        public InterfaceC5586z.a mo3037i(long j10) {
            return new InterfaceC5586z.a(new C5557a0(j10, c.m22389h(this.f20831a.mo158a(j10), this.f20833c, this.f20834d, this.f20835e, this.f20836f, this.f20837g)));
        }

        /* renamed from: k */
        public long m22381k(long j10) {
            return this.f20831a.mo158a(j10);
        }
    }

    /* renamed from: x3.a$b */
    /* loaded from: classes.dex */
    public static final class b implements d {
        @Override // p333x3.AbstractC5556a.d
        /* renamed from: a */
        public long mo158a(long j10) {
            return j10;
        }
    }

    /* renamed from: x3.a$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final long f20838a;

        /* renamed from: b */
        public final long f20839b;

        /* renamed from: c */
        public final long f20840c;

        /* renamed from: d */
        public long f20841d;

        /* renamed from: e */
        public long f20842e;

        /* renamed from: f */
        public long f20843f;

        /* renamed from: g */
        public long f20844g;

        /* renamed from: h */
        public long f20845h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f20838a = j10;
            this.f20839b = j11;
            this.f20841d = j12;
            this.f20842e = j13;
            this.f20843f = j14;
            this.f20844g = j15;
            this.f20840c = j16;
            this.f20845h = m22389h(j11, j12, j13, j14, j15, j16);
        }

        /* renamed from: h */
        public static long m22389h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
            return C4041n0.m15479r(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* renamed from: i */
        public final long m22390i() {
            return this.f20844g;
        }

        /* renamed from: j */
        public final long m22391j() {
            return this.f20843f;
        }

        /* renamed from: k */
        public final long m22392k() {
            return this.f20845h;
        }

        /* renamed from: l */
        public final long m22393l() {
            return this.f20838a;
        }

        /* renamed from: m */
        public final long m22394m() {
            return this.f20839b;
        }

        /* renamed from: n */
        public final void m22395n() {
            this.f20845h = m22389h(this.f20839b, this.f20841d, this.f20842e, this.f20843f, this.f20844g, this.f20840c);
        }

        /* renamed from: o */
        public final void m22396o(long j10, long j11) {
            this.f20842e = j10;
            this.f20844g = j11;
            m22395n();
        }

        /* renamed from: p */
        public final void m22397p(long j10, long j11) {
            this.f20841d = j10;
            this.f20843f = j11;
            m22395n();
        }
    }

    /* renamed from: x3.a$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        long mo158a(long j10);
    }

    /* renamed from: x3.a$e */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d */
        public static final e f20846d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a */
        public final int f20847a;

        /* renamed from: b */
        public final long f20848b;

        /* renamed from: c */
        public final long f20849c;

        public e(int i10, long j10, long j11) {
            this.f20847a = i10;
            this.f20848b = j10;
            this.f20849c = j11;
        }

        /* renamed from: d */
        public static e m22401d(long j10, long j11) {
            return new e(-1, j10, j11);
        }

        /* renamed from: e */
        public static e m22402e(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }

        /* renamed from: f */
        public static e m22403f(long j10, long j11) {
            return new e(-2, j10, j11);
        }
    }

    /* renamed from: x3.a$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        e mo159a(InterfaceC5572l interfaceC5572l, long j10);

        /* renamed from: b */
        default void mo9348b() {
        }
    }

    public AbstractC5556a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f20828b = fVar;
        this.f20830d = i10;
        this.f20827a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    /* renamed from: a */
    public c m22367a(long j10) {
        return new c(j10, this.f20827a.m22381k(j10), this.f20827a.f20833c, this.f20827a.f20834d, this.f20827a.f20835e, this.f20827a.f20836f, this.f20827a.f20837g);
    }

    /* renamed from: b */
    public final InterfaceC5586z m22368b() {
        return this.f20827a;
    }

    /* renamed from: c */
    public int m22369c(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        while (true) {
            c cVar = (c) C4014a.m15202h(this.f20829c);
            long m22391j = cVar.m22391j();
            long m22390i = cVar.m22390i();
            long m22392k = cVar.m22392k();
            if (m22390i - m22391j <= this.f20830d) {
                m22371e(false, m22391j);
                return m22373g(interfaceC5572l, m22391j, c5585y);
            }
            if (!m22375i(interfaceC5572l, m22392k)) {
                return m22373g(interfaceC5572l, m22392k, c5585y);
            }
            interfaceC5572l.mo22427l();
            e mo159a = this.f20828b.mo159a(interfaceC5572l, cVar.m22394m());
            int i10 = mo159a.f20847a;
            if (i10 == -3) {
                m22371e(false, m22392k);
                return m22373g(interfaceC5572l, m22392k, c5585y);
            }
            if (i10 == -2) {
                cVar.m22397p(mo159a.f20848b, mo159a.f20849c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    m22375i(interfaceC5572l, mo159a.f20849c);
                    m22371e(true, mo159a.f20849c);
                    return m22373g(interfaceC5572l, mo159a.f20849c, c5585y);
                }
                cVar.m22396o(mo159a.f20848b, mo159a.f20849c);
            }
        }
    }

    /* renamed from: d */
    public final boolean m22370d() {
        return this.f20829c != null;
    }

    /* renamed from: e */
    public final void m22371e(boolean z10, long j10) {
        this.f20829c = null;
        this.f20828b.mo9348b();
        m22372f(z10, j10);
    }

    /* renamed from: f */
    public void m22372f(boolean z10, long j10) {
    }

    /* renamed from: g */
    public final int m22373g(InterfaceC5572l interfaceC5572l, long j10, C5585y c5585y) {
        if (j10 == interfaceC5572l.getPosition()) {
            return 0;
        }
        c5585y.f20962a = j10;
        return 1;
    }

    /* renamed from: h */
    public final void m22374h(long j10) {
        c cVar = this.f20829c;
        if (cVar == null || cVar.m22393l() != j10) {
            this.f20829c = m22367a(j10);
        }
    }

    /* renamed from: i */
    public final boolean m22375i(InterfaceC5572l interfaceC5572l, long j10) {
        long position = j10 - interfaceC5572l.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        interfaceC5572l.mo22428m((int) position);
        return true;
    }
}
