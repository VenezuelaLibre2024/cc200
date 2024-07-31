package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.k */
/* loaded from: classes.dex */
public final class C2141k extends AbstractC2135f0.e.c {

    /* renamed from: a */
    public final int f8492a;

    /* renamed from: b */
    public final String f8493b;

    /* renamed from: c */
    public final int f8494c;

    /* renamed from: d */
    public final long f8495d;

    /* renamed from: e */
    public final long f8496e;

    /* renamed from: f */
    public final boolean f8497f;

    /* renamed from: g */
    public final int f8498g;

    /* renamed from: h */
    public final String f8499h;

    /* renamed from: i */
    public final String f8500i;

    /* renamed from: g8.k$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.c.a {

        /* renamed from: a */
        public Integer f8501a;

        /* renamed from: b */
        public String f8502b;

        /* renamed from: c */
        public Integer f8503c;

        /* renamed from: d */
        public Long f8504d;

        /* renamed from: e */
        public Long f8505e;

        /* renamed from: f */
        public Boolean f8506f;

        /* renamed from: g */
        public Integer f8507g;

        /* renamed from: h */
        public String f8508h;

        /* renamed from: i */
        public String f8509i;

        @Override // p098g8.AbstractC2135f0.e.c.a
        /* renamed from: a */
        public AbstractC2135f0.e.c mo8526a() {
            String str = "";
            if (this.f8501a == null) {
                str = " arch";
            }
            if (this.f8502b == null) {
                str = str + " model";
            }
            if (this.f8503c == null) {
                str = str + " cores";
            }
            if (this.f8504d == null) {
                str = str + " ram";
            }
            if (this.f8505e == null) {
                str = str + " diskSpace";
            }
            if (this.f8506f == null) {
                str = str + " simulator";
            }
            if (this.f8507g == null) {
                str = str + " state";
            }
            if (this.f8508h == null) {
                str = str + " manufacturer";
            }
            if (this.f8509i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C2141k(this.f8501a.intValue(), this.f8502b, this.f8503c.intValue(), this.f8504d.longValue(), this.f8505e.longValue(), this.f8506f.booleanValue(), this.f8507g.intValue(), this.f8508h, this.f8509i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.c.a
        /* renamed from: b */
        public AbstractC2135f0.e.c.a mo8527b(int i10) {
            this.f8501a = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.c.a
        /* renamed from: c */
        public AbstractC2135f0.e.c.a mo8528c(int i10) {
            this.f8503c = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.c.a
        /* renamed from: d */
        public AbstractC2135f0.e.c.a mo8529d(long j10) {
            this.f8505e = Long.valueOf(j10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.c.a
        /* renamed from: e */
        public AbstractC2135f0.e.c.a mo8530e(String str) {
            Objects.requireNonNull(str, "Null manufacturer");
            this.f8508h = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.c.a
        /* renamed from: f */
        public AbstractC2135f0.e.c.a mo8531f(String str) {
            Objects.requireNonNull(str, "Null model");
            this.f8502b = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.c.a
        /* renamed from: g */
        public AbstractC2135f0.e.c.a mo8532g(String str) {
            Objects.requireNonNull(str, "Null modelClass");
            this.f8509i = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.c.a
        /* renamed from: h */
        public AbstractC2135f0.e.c.a mo8533h(long j10) {
            this.f8504d = Long.valueOf(j10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.c.a
        /* renamed from: i */
        public AbstractC2135f0.e.c.a mo8534i(boolean z10) {
            this.f8506f = Boolean.valueOf(z10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.c.a
        /* renamed from: j */
        public AbstractC2135f0.e.c.a mo8535j(int i10) {
            this.f8507g = Integer.valueOf(i10);
            return this;
        }
    }

    public C2141k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f8492a = i10;
        this.f8493b = str;
        this.f8494c = i11;
        this.f8495d = j10;
        this.f8496e = j11;
        this.f8497f = z10;
        this.f8498g = i12;
        this.f8499h = str2;
        this.f8500i = str3;
    }

    @Override // p098g8.AbstractC2135f0.e.c
    /* renamed from: b */
    public int mo8517b() {
        return this.f8492a;
    }

    @Override // p098g8.AbstractC2135f0.e.c
    /* renamed from: c */
    public int mo8518c() {
        return this.f8494c;
    }

    @Override // p098g8.AbstractC2135f0.e.c
    /* renamed from: d */
    public long mo8519d() {
        return this.f8496e;
    }

    @Override // p098g8.AbstractC2135f0.e.c
    /* renamed from: e */
    public String mo8520e() {
        return this.f8499h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.c)) {
            return false;
        }
        AbstractC2135f0.e.c cVar = (AbstractC2135f0.e.c) obj;
        return this.f8492a == cVar.mo8517b() && this.f8493b.equals(cVar.mo8521f()) && this.f8494c == cVar.mo8518c() && this.f8495d == cVar.mo8523h() && this.f8496e == cVar.mo8519d() && this.f8497f == cVar.mo8525j() && this.f8498g == cVar.mo8524i() && this.f8499h.equals(cVar.mo8520e()) && this.f8500i.equals(cVar.mo8522g());
    }

    @Override // p098g8.AbstractC2135f0.e.c
    /* renamed from: f */
    public String mo8521f() {
        return this.f8493b;
    }

    @Override // p098g8.AbstractC2135f0.e.c
    /* renamed from: g */
    public String mo8522g() {
        return this.f8500i;
    }

    @Override // p098g8.AbstractC2135f0.e.c
    /* renamed from: h */
    public long mo8523h() {
        return this.f8495d;
    }

    public int hashCode() {
        int hashCode = (((((this.f8492a ^ 1000003) * 1000003) ^ this.f8493b.hashCode()) * 1000003) ^ this.f8494c) * 1000003;
        long j10 = this.f8495d;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f8496e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f8497f ? 1231 : 1237)) * 1000003) ^ this.f8498g) * 1000003) ^ this.f8499h.hashCode()) * 1000003) ^ this.f8500i.hashCode();
    }

    @Override // p098g8.AbstractC2135f0.e.c
    /* renamed from: i */
    public int mo8524i() {
        return this.f8498g;
    }

    @Override // p098g8.AbstractC2135f0.e.c
    /* renamed from: j */
    public boolean mo8525j() {
        return this.f8497f;
    }

    public String toString() {
        return "Device{arch=" + this.f8492a + ", model=" + this.f8493b + ", cores=" + this.f8494c + ", ram=" + this.f8495d + ", diskSpace=" + this.f8496e + ", simulator=" + this.f8497f + ", state=" + this.f8498g + ", manufacturer=" + this.f8499h + ", modelClass=" + this.f8500i + "}";
    }
}
