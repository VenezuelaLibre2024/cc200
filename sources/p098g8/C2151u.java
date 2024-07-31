package p098g8;

import p098g8.AbstractC2135f0;

/* renamed from: g8.u */
/* loaded from: classes.dex */
public final class C2151u extends AbstractC2135f0.e.d.c {

    /* renamed from: a */
    public final Double f8594a;

    /* renamed from: b */
    public final int f8595b;

    /* renamed from: c */
    public final boolean f8596c;

    /* renamed from: d */
    public final int f8597d;

    /* renamed from: e */
    public final long f8598e;

    /* renamed from: f */
    public final long f8599f;

    /* renamed from: g8.u$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.d.c.a {

        /* renamed from: a */
        public Double f8600a;

        /* renamed from: b */
        public Integer f8601b;

        /* renamed from: c */
        public Boolean f8602c;

        /* renamed from: d */
        public Integer f8603d;

        /* renamed from: e */
        public Long f8604e;

        /* renamed from: f */
        public Long f8605f;

        @Override // p098g8.AbstractC2135f0.e.d.c.a
        /* renamed from: a */
        public AbstractC2135f0.e.d.c mo8649a() {
            String str = "";
            if (this.f8601b == null) {
                str = " batteryVelocity";
            }
            if (this.f8602c == null) {
                str = str + " proximityOn";
            }
            if (this.f8603d == null) {
                str = str + " orientation";
            }
            if (this.f8604e == null) {
                str = str + " ramUsed";
            }
            if (this.f8605f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C2151u(this.f8600a, this.f8601b.intValue(), this.f8602c.booleanValue(), this.f8603d.intValue(), this.f8604e.longValue(), this.f8605f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.d.c.a
        /* renamed from: b */
        public AbstractC2135f0.e.d.c.a mo8650b(Double d10) {
            this.f8600a = d10;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.c.a
        /* renamed from: c */
        public AbstractC2135f0.e.d.c.a mo8651c(int i10) {
            this.f8601b = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.c.a
        /* renamed from: d */
        public AbstractC2135f0.e.d.c.a mo8652d(long j10) {
            this.f8605f = Long.valueOf(j10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.c.a
        /* renamed from: e */
        public AbstractC2135f0.e.d.c.a mo8653e(int i10) {
            this.f8603d = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.c.a
        /* renamed from: f */
        public AbstractC2135f0.e.d.c.a mo8654f(boolean z10) {
            this.f8602c = Boolean.valueOf(z10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.c.a
        /* renamed from: g */
        public AbstractC2135f0.e.d.c.a mo8655g(long j10) {
            this.f8604e = Long.valueOf(j10);
            return this;
        }
    }

    public C2151u(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f8594a = d10;
        this.f8595b = i10;
        this.f8596c = z10;
        this.f8597d = i11;
        this.f8598e = j10;
        this.f8599f = j11;
    }

    @Override // p098g8.AbstractC2135f0.e.d.c
    /* renamed from: b */
    public Double mo8643b() {
        return this.f8594a;
    }

    @Override // p098g8.AbstractC2135f0.e.d.c
    /* renamed from: c */
    public int mo8644c() {
        return this.f8595b;
    }

    @Override // p098g8.AbstractC2135f0.e.d.c
    /* renamed from: d */
    public long mo8645d() {
        return this.f8599f;
    }

    @Override // p098g8.AbstractC2135f0.e.d.c
    /* renamed from: e */
    public int mo8646e() {
        return this.f8597d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.d.c)) {
            return false;
        }
        AbstractC2135f0.e.d.c cVar = (AbstractC2135f0.e.d.c) obj;
        Double d10 = this.f8594a;
        if (d10 != null ? d10.equals(cVar.mo8643b()) : cVar.mo8643b() == null) {
            if (this.f8595b == cVar.mo8644c() && this.f8596c == cVar.mo8648g() && this.f8597d == cVar.mo8646e() && this.f8598e == cVar.mo8647f() && this.f8599f == cVar.mo8645d()) {
                return true;
            }
        }
        return false;
    }

    @Override // p098g8.AbstractC2135f0.e.d.c
    /* renamed from: f */
    public long mo8647f() {
        return this.f8598e;
    }

    @Override // p098g8.AbstractC2135f0.e.d.c
    /* renamed from: g */
    public boolean mo8648g() {
        return this.f8596c;
    }

    public int hashCode() {
        Double d10 = this.f8594a;
        int hashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f8595b) * 1000003) ^ (this.f8596c ? 1231 : 1237)) * 1000003) ^ this.f8597d) * 1000003;
        long j10 = this.f8598e;
        long j11 = this.f8599f;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f8594a + ", batteryVelocity=" + this.f8595b + ", proximityOn=" + this.f8596c + ", orientation=" + this.f8597d + ", ramUsed=" + this.f8598e + ", diskUsed=" + this.f8599f + "}";
    }
}
