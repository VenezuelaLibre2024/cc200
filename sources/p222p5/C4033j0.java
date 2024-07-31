package p222p5;

/* renamed from: p5.j0 */
/* loaded from: classes.dex */
public final class C4033j0 {

    /* renamed from: a */
    public long f14502a;

    /* renamed from: b */
    public long f14503b;

    /* renamed from: c */
    public long f14504c;

    /* renamed from: d */
    public final ThreadLocal<Long> f14505d = new ThreadLocal<>();

    public C4033j0(long j10) {
        m15367g(j10);
    }

    /* renamed from: f */
    public static long m15359f(long j10) {
        return (j10 * 1000000) / 90000;
    }

    /* renamed from: i */
    public static long m15360i(long j10) {
        return (j10 * 90000) / 1000000;
    }

    /* renamed from: j */
    public static long m15361j(long j10) {
        return m15360i(j10) % 8589934592L;
    }

    /* renamed from: a */
    public synchronized long m15362a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f14503b == -9223372036854775807L) {
            long j11 = this.f14502a;
            if (j11 == 9223372036854775806L) {
                j11 = ((Long) C4014a.m15199e(this.f14505d.get())).longValue();
            }
            this.f14503b = j11 - j10;
            notifyAll();
        }
        this.f14504c = j10;
        return j10 + this.f14503b;
    }

    /* renamed from: b */
    public synchronized long m15363b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f14504c;
        if (j11 != -9223372036854775807L) {
            long m15360i = m15360i(j11);
            long j12 = (4294967296L + m15360i) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j10;
            j10 += j12 * 8589934592L;
            if (Math.abs(j13 - m15360i) < Math.abs(j10 - m15360i)) {
                j10 = j13;
            }
        }
        return m15362a(m15359f(j10));
    }

    /* renamed from: c */
    public synchronized long m15364c() {
        long j10;
        j10 = this.f14502a;
        if (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) {
            j10 = -9223372036854775807L;
        }
        return j10;
    }

    /* renamed from: d */
    public synchronized long m15365d() {
        long j10;
        j10 = this.f14504c;
        return j10 != -9223372036854775807L ? j10 + this.f14503b : m15364c();
    }

    /* renamed from: e */
    public synchronized long m15366e() {
        return this.f14503b;
    }

    /* renamed from: g */
    public synchronized void m15367g(long j10) {
        this.f14502a = j10;
        this.f14503b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f14504c = -9223372036854775807L;
    }

    /* renamed from: h */
    public synchronized void m15368h(boolean z10, long j10) {
        C4014a.m15200f(this.f14502a == 9223372036854775806L);
        if (this.f14503b != -9223372036854775807L) {
            return;
        }
        if (z10) {
            this.f14505d.set(Long.valueOf(j10));
        } else {
            while (this.f14503b == -9223372036854775807L) {
                wait();
            }
        }
    }
}
