package p350y4;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import p140j7.C3253a;
import p222p5.C4041n0;
import p264s3.C4463m1;

/* renamed from: y4.k */
/* loaded from: classes.dex */
public abstract class AbstractC5810k {

    /* renamed from: a */
    public final C5808i f21822a;

    /* renamed from: b */
    public final long f21823b;

    /* renamed from: c */
    public final long f21824c;

    /* renamed from: y4.k$a */
    /* loaded from: classes.dex */
    public static abstract class a extends AbstractC5810k {

        /* renamed from: d */
        public final long f21825d;

        /* renamed from: e */
        public final long f21826e;

        /* renamed from: f */
        public final List<d> f21827f;

        /* renamed from: g */
        public final long f21828g;

        /* renamed from: h */
        public final long f21829h;

        /* renamed from: i */
        public final long f21830i;

        public a(C5808i c5808i, long j10, long j11, long j12, long j13, List<d> list, long j14, long j15, long j16) {
            super(c5808i, j10, j11);
            this.f21825d = j12;
            this.f21826e = j13;
            this.f21827f = list;
            this.f21830i = j14;
            this.f21828g = j15;
            this.f21829h = j16;
        }

        /* renamed from: c */
        public long m23369c(long j10, long j11) {
            long mo23373g = mo23373g(j10);
            return mo23373g != -1 ? mo23373g : (int) (m23375i((j11 - this.f21829h) + this.f21830i, j10) - m23370d(j10, j11));
        }

        /* renamed from: d */
        public long m23370d(long j10, long j11) {
            if (mo23373g(j10) == -1) {
                long j12 = this.f21828g;
                if (j12 != -9223372036854775807L) {
                    return Math.max(m23371e(), m23375i((j11 - this.f21829h) - j12, j10));
                }
            }
            return m23371e();
        }

        /* renamed from: e */
        public long m23371e() {
            return this.f21825d;
        }

        /* renamed from: f */
        public long m23372f(long j10, long j11) {
            if (this.f21827f != null) {
                return -9223372036854775807L;
            }
            long m23370d = m23370d(j10, j11) + m23369c(j10, j11);
            return (m23376j(m23370d) + m23374h(m23370d, j10)) - this.f21830i;
        }

        /* renamed from: g */
        public abstract long mo23373g(long j10);

        /* renamed from: h */
        public final long m23374h(long j10, long j11) {
            List<d> list = this.f21827f;
            if (list != null) {
                return (list.get((int) (j10 - this.f21825d)).f21836b * 1000000) / this.f21823b;
            }
            long mo23373g = mo23373g(j11);
            return (mo23373g == -1 || j10 != (m23371e() + mo23373g) - 1) ? (this.f21826e * 1000000) / this.f21823b : j11 - m23376j(j10);
        }

        /* renamed from: i */
        public long m23375i(long j10, long j11) {
            long m23371e = m23371e();
            long mo23373g = mo23373g(j11);
            if (mo23373g == 0) {
                return m23371e;
            }
            if (this.f21827f == null) {
                long j12 = this.f21825d + (j10 / ((this.f21826e * 1000000) / this.f21823b));
                return j12 < m23371e ? m23371e : mo23373g == -1 ? j12 : Math.min(j12, (m23371e + mo23373g) - 1);
            }
            long j13 = (mo23373g + m23371e) - 1;
            long j14 = m23371e;
            while (j14 <= j13) {
                long j15 = ((j13 - j14) / 2) + j14;
                long m23376j = m23376j(j15);
                if (m23376j < j10) {
                    j14 = j15 + 1;
                } else {
                    if (m23376j <= j10) {
                        return j15;
                    }
                    j13 = j15 - 1;
                }
            }
            return j14 == m23371e ? j14 : j13;
        }

        /* renamed from: j */
        public final long m23376j(long j10) {
            List<d> list = this.f21827f;
            return C4041n0.m15420N0(list != null ? list.get((int) (j10 - this.f21825d)).f21835a - this.f21824c : (j10 - this.f21825d) * this.f21826e, 1000000L, this.f21823b);
        }

        /* renamed from: k */
        public abstract C5808i mo23377k(AbstractC5809j abstractC5809j, long j10);

        /* renamed from: l */
        public boolean mo23378l() {
            return this.f21827f != null;
        }
    }

    /* renamed from: y4.k$b */
    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: j */
        public final List<C5808i> f21831j;

        public b(C5808i c5808i, long j10, long j11, long j12, long j13, List<d> list, long j14, List<C5808i> list2, long j15, long j16) {
            super(c5808i, j10, j11, j12, j13, list, j14, j15, j16);
            this.f21831j = list2;
        }

        @Override // p350y4.AbstractC5810k.a
        /* renamed from: g */
        public long mo23373g(long j10) {
            return this.f21831j.size();
        }

        @Override // p350y4.AbstractC5810k.a
        /* renamed from: k */
        public C5808i mo23377k(AbstractC5809j abstractC5809j, long j10) {
            return this.f21831j.get((int) (j10 - this.f21825d));
        }

        @Override // p350y4.AbstractC5810k.a
        /* renamed from: l */
        public boolean mo23378l() {
            return true;
        }
    }

    /* renamed from: y4.k$c */
    /* loaded from: classes.dex */
    public static final class c extends a {

        /* renamed from: j */
        public final C5813n f21832j;

        /* renamed from: k */
        public final C5813n f21833k;

        /* renamed from: l */
        public final long f21834l;

        public c(C5808i c5808i, long j10, long j11, long j12, long j13, long j14, List<d> list, long j15, C5813n c5813n, C5813n c5813n2, long j16, long j17) {
            super(c5808i, j10, j11, j12, j14, list, j15, j16, j17);
            this.f21832j = c5813n;
            this.f21833k = c5813n2;
            this.f21834l = j13;
        }

        @Override // p350y4.AbstractC5810k
        /* renamed from: a */
        public C5808i mo23367a(AbstractC5809j abstractC5809j) {
            C5813n c5813n = this.f21832j;
            if (c5813n == null) {
                return super.mo23367a(abstractC5809j);
            }
            C4463m1 c4463m1 = abstractC5809j.f21809b;
            return new C5808i(c5813n.m23382a(c4463m1.f16495h, 0L, c4463m1.f16502o, 0L), 0L, -1L);
        }

        @Override // p350y4.AbstractC5810k.a
        /* renamed from: g */
        public long mo23373g(long j10) {
            if (this.f21827f != null) {
                return r0.size();
            }
            long j11 = this.f21834l;
            if (j11 != -1) {
                return (j11 - this.f21825d) + 1;
            }
            if (j10 != -9223372036854775807L) {
                return C3253a.m11752a(BigInteger.valueOf(j10).multiply(BigInteger.valueOf(this.f21823b)), BigInteger.valueOf(this.f21826e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // p350y4.AbstractC5810k.a
        /* renamed from: k */
        public C5808i mo23377k(AbstractC5809j abstractC5809j, long j10) {
            List<d> list = this.f21827f;
            long j11 = list != null ? list.get((int) (j10 - this.f21825d)).f21835a : (j10 - this.f21825d) * this.f21826e;
            C5813n c5813n = this.f21833k;
            C4463m1 c4463m1 = abstractC5809j.f21809b;
            return new C5808i(c5813n.m23382a(c4463m1.f16495h, j10, c4463m1.f16502o, j11), 0L, -1L);
        }
    }

    /* renamed from: y4.k$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final long f21835a;

        /* renamed from: b */
        public final long f21836b;

        public d(long j10, long j11) {
            this.f21835a = j10;
            this.f21836b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f21835a == dVar.f21835a && this.f21836b == dVar.f21836b;
        }

        public int hashCode() {
            return (((int) this.f21835a) * 31) + ((int) this.f21836b);
        }
    }

    /* renamed from: y4.k$e */
    /* loaded from: classes.dex */
    public static class e extends AbstractC5810k {

        /* renamed from: d */
        public final long f21837d;

        /* renamed from: e */
        public final long f21838e;

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }

        public e(C5808i c5808i, long j10, long j11, long j12, long j13) {
            super(c5808i, j10, j11);
            this.f21837d = j12;
            this.f21838e = j13;
        }

        /* renamed from: c */
        public C5808i m23379c() {
            long j10 = this.f21838e;
            if (j10 <= 0) {
                return null;
            }
            return new C5808i(null, this.f21837d, j10);
        }
    }

    public AbstractC5810k(C5808i c5808i, long j10, long j11) {
        this.f21822a = c5808i;
        this.f21823b = j10;
        this.f21824c = j11;
    }

    /* renamed from: a */
    public C5808i mo23367a(AbstractC5809j abstractC5809j) {
        return this.f21822a;
    }

    /* renamed from: b */
    public long m23368b() {
        return C4041n0.m15420N0(this.f21824c, 1000000L, this.f21823b);
    }
}
