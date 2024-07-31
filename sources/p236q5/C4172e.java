package p236q5;

import java.util.Arrays;

/* renamed from: q5.e */
/* loaded from: classes.dex */
public final class C4172e {

    /* renamed from: c */
    public boolean f15000c;

    /* renamed from: d */
    public boolean f15001d;

    /* renamed from: f */
    public int f15003f;

    /* renamed from: a */
    public a f14998a = new a();

    /* renamed from: b */
    public a f14999b = new a();

    /* renamed from: e */
    public long f15002e = -9223372036854775807L;

    /* renamed from: q5.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public long f15004a;

        /* renamed from: b */
        public long f15005b;

        /* renamed from: c */
        public long f15006c;

        /* renamed from: d */
        public long f15007d;

        /* renamed from: e */
        public long f15008e;

        /* renamed from: f */
        public long f15009f;

        /* renamed from: g */
        public final boolean[] f15010g = new boolean[15];

        /* renamed from: h */
        public int f15011h;

        /* renamed from: c */
        public static int m16040c(long j10) {
            return (int) (j10 % 15);
        }

        /* renamed from: a */
        public long m16041a() {
            long j10 = this.f15008e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f15009f / j10;
        }

        /* renamed from: b */
        public long m16042b() {
            return this.f15009f;
        }

        /* renamed from: d */
        public boolean m16043d() {
            long j10 = this.f15007d;
            if (j10 == 0) {
                return false;
            }
            return this.f15010g[m16040c(j10 - 1)];
        }

        /* renamed from: e */
        public boolean m16044e() {
            return this.f15007d > 15 && this.f15011h == 0;
        }

        /* renamed from: f */
        public void m16045f(long j10) {
            int i10;
            long j11 = this.f15007d;
            if (j11 == 0) {
                this.f15004a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f15004a;
                this.f15005b = j12;
                this.f15009f = j12;
                this.f15008e = 1L;
            } else {
                long j13 = j10 - this.f15006c;
                int m16040c = m16040c(j11);
                if (Math.abs(j13 - this.f15005b) <= 1000000) {
                    this.f15008e++;
                    this.f15009f += j13;
                    boolean[] zArr = this.f15010g;
                    if (zArr[m16040c]) {
                        zArr[m16040c] = false;
                        i10 = this.f15011h - 1;
                        this.f15011h = i10;
                    }
                } else {
                    boolean[] zArr2 = this.f15010g;
                    if (!zArr2[m16040c]) {
                        zArr2[m16040c] = true;
                        i10 = this.f15011h + 1;
                        this.f15011h = i10;
                    }
                }
            }
            this.f15007d++;
            this.f15006c = j10;
        }

        /* renamed from: g */
        public void m16046g() {
            this.f15007d = 0L;
            this.f15008e = 0L;
            this.f15009f = 0L;
            this.f15011h = 0;
            Arrays.fill(this.f15010g, false);
        }
    }

    /* renamed from: a */
    public long m16033a() {
        if (m16037e()) {
            return this.f14998a.m16041a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public float m16034b() {
        if (m16037e()) {
            return (float) (1.0E9d / this.f14998a.m16041a());
        }
        return -1.0f;
    }

    /* renamed from: c */
    public int m16035c() {
        return this.f15003f;
    }

    /* renamed from: d */
    public long m16036d() {
        if (m16037e()) {
            return this.f14998a.m16042b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public boolean m16037e() {
        return this.f14998a.m16044e();
    }

    /* renamed from: f */
    public void m16038f(long j10) {
        this.f14998a.m16045f(j10);
        if (this.f14998a.m16044e() && !this.f15001d) {
            this.f15000c = false;
        } else if (this.f15002e != -9223372036854775807L) {
            if (!this.f15000c || this.f14999b.m16043d()) {
                this.f14999b.m16046g();
                this.f14999b.m16045f(this.f15002e);
            }
            this.f15000c = true;
            this.f14999b.m16045f(j10);
        }
        if (this.f15000c && this.f14999b.m16044e()) {
            a aVar = this.f14998a;
            this.f14998a = this.f14999b;
            this.f14999b = aVar;
            this.f15000c = false;
            this.f15001d = false;
        }
        this.f15002e = j10;
        this.f15003f = this.f14998a.m16044e() ? 0 : this.f15003f + 1;
    }

    /* renamed from: g */
    public void m16039g() {
        this.f14998a.m16046g();
        this.f14999b.m16046g();
        this.f15000c = false;
        this.f15002e = -9223372036854775807L;
        this.f15003f = 0;
    }
}
