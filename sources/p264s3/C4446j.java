package p264s3;

import android.os.SystemClock;
import p155k7.C3370g;
import p222p5.C4041n0;
import p264s3.C4503u1;

/* renamed from: s3.j */
/* loaded from: classes.dex */
public final class C4446j implements InterfaceC4488r1 {

    /* renamed from: a */
    public final float f16378a;

    /* renamed from: b */
    public final float f16379b;

    /* renamed from: c */
    public final long f16380c;

    /* renamed from: d */
    public final float f16381d;

    /* renamed from: e */
    public final long f16382e;

    /* renamed from: f */
    public final long f16383f;

    /* renamed from: g */
    public final float f16384g;

    /* renamed from: h */
    public long f16385h;

    /* renamed from: i */
    public long f16386i;

    /* renamed from: j */
    public long f16387j;

    /* renamed from: k */
    public long f16388k;

    /* renamed from: l */
    public long f16389l;

    /* renamed from: m */
    public long f16390m;

    /* renamed from: n */
    public float f16391n;

    /* renamed from: o */
    public float f16392o;

    /* renamed from: p */
    public float f16393p;

    /* renamed from: q */
    public long f16394q;

    /* renamed from: r */
    public long f16395r;

    /* renamed from: s */
    public long f16396s;

    /* renamed from: s3.j$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public float f16397a = 0.97f;

        /* renamed from: b */
        public float f16398b = 1.03f;

        /* renamed from: c */
        public long f16399c = 1000;

        /* renamed from: d */
        public float f16400d = 1.0E-7f;

        /* renamed from: e */
        public long f16401e = C4041n0.m15396B0(20);

        /* renamed from: f */
        public long f16402f = C4041n0.m15396B0(500);

        /* renamed from: g */
        public float f16403g = 0.999f;

        /* renamed from: a */
        public C4446j m17364a() {
            return new C4446j(this.f16397a, this.f16398b, this.f16399c, this.f16400d, this.f16401e, this.f16402f, this.f16403g);
        }
    }

    public C4446j(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f16378a = f10;
        this.f16379b = f11;
        this.f16380c = j10;
        this.f16381d = f12;
        this.f16382e = j11;
        this.f16383f = j12;
        this.f16384g = f13;
        this.f16385h = -9223372036854775807L;
        this.f16386i = -9223372036854775807L;
        this.f16388k = -9223372036854775807L;
        this.f16389l = -9223372036854775807L;
        this.f16392o = f10;
        this.f16391n = f11;
        this.f16393p = 1.0f;
        this.f16394q = -9223372036854775807L;
        this.f16387j = -9223372036854775807L;
        this.f16390m = -9223372036854775807L;
        this.f16395r = -9223372036854775807L;
        this.f16396s = -9223372036854775807L;
    }

    /* renamed from: h */
    public static long m17355h(long j10, long j11, float f10) {
        return (((float) j10) * f10) + ((1.0f - f10) * ((float) j11));
    }

    @Override // p264s3.InterfaceC4488r1
    /* renamed from: a */
    public float mo17356a(long j10, long j11) {
        if (this.f16385h == -9223372036854775807L) {
            return 1.0f;
        }
        m17363i(j10, j11);
        if (this.f16394q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f16394q < this.f16380c) {
            return this.f16393p;
        }
        this.f16394q = SystemClock.elapsedRealtime();
        m17361f(j10);
        long j12 = j10 - this.f16390m;
        if (Math.abs(j12) < this.f16382e) {
            this.f16393p = 1.0f;
        } else {
            this.f16393p = C4041n0.m15475p((this.f16381d * ((float) j12)) + 1.0f, this.f16392o, this.f16391n);
        }
        return this.f16393p;
    }

    @Override // p264s3.InterfaceC4488r1
    /* renamed from: b */
    public long mo17357b() {
        return this.f16390m;
    }

    @Override // p264s3.InterfaceC4488r1
    /* renamed from: c */
    public void mo17358c() {
        long j10 = this.f16390m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f16383f;
        this.f16390m = j11;
        long j12 = this.f16389l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f16390m = j12;
        }
        this.f16394q = -9223372036854775807L;
    }

    @Override // p264s3.InterfaceC4488r1
    /* renamed from: d */
    public void mo17359d(long j10) {
        this.f16386i = j10;
        m17362g();
    }

    @Override // p264s3.InterfaceC4488r1
    /* renamed from: e */
    public void mo17360e(C4503u1.g gVar) {
        this.f16385h = C4041n0.m15396B0(gVar.f16776h);
        this.f16388k = C4041n0.m15396B0(gVar.f16777i);
        this.f16389l = C4041n0.m15396B0(gVar.f16778j);
        float f10 = gVar.f16779k;
        if (f10 == -3.4028235E38f) {
            f10 = this.f16378a;
        }
        this.f16392o = f10;
        float f11 = gVar.f16780l;
        if (f11 == -3.4028235E38f) {
            f11 = this.f16379b;
        }
        this.f16391n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f16385h = -9223372036854775807L;
        }
        m17362g();
    }

    /* renamed from: f */
    public final void m17361f(long j10) {
        long j11 = this.f16395r + (this.f16396s * 3);
        if (this.f16390m > j11) {
            float m15396B0 = (float) C4041n0.m15396B0(this.f16380c);
            this.f16390m = C3370g.m12539c(j11, this.f16387j, this.f16390m - (((this.f16393p - 1.0f) * m15396B0) + ((this.f16391n - 1.0f) * m15396B0)));
            return;
        }
        long m15479r = C4041n0.m15479r(j10 - (Math.max(0.0f, this.f16393p - 1.0f) / this.f16381d), this.f16390m, j11);
        this.f16390m = m15479r;
        long j12 = this.f16389l;
        if (j12 == -9223372036854775807L || m15479r <= j12) {
            return;
        }
        this.f16390m = j12;
    }

    /* renamed from: g */
    public final void m17362g() {
        long j10 = this.f16385h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f16386i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f16388k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f16389l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f16387j == j10) {
            return;
        }
        this.f16387j = j10;
        this.f16390m = j10;
        this.f16395r = -9223372036854775807L;
        this.f16396s = -9223372036854775807L;
        this.f16394q = -9223372036854775807L;
    }

    /* renamed from: i */
    public final void m17363i(long j10, long j11) {
        long m17355h;
        long j12 = j10 - j11;
        long j13 = this.f16395r;
        if (j13 == -9223372036854775807L) {
            this.f16395r = j12;
            m17355h = 0;
        } else {
            long max = Math.max(j12, m17355h(j13, j12, this.f16384g));
            this.f16395r = max;
            m17355h = m17355h(this.f16396s, Math.abs(j12 - max), this.f16384g);
        }
        this.f16396s = m17355h;
    }
}
