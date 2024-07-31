package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.t */
/* loaded from: classes.dex */
public final class C2150t extends AbstractC2135f0.e.d.a.c {

    /* renamed from: a */
    public final String f8586a;

    /* renamed from: b */
    public final int f8587b;

    /* renamed from: c */
    public final int f8588c;

    /* renamed from: d */
    public final boolean f8589d;

    /* renamed from: g8.t$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.d.a.c.AbstractC6178a {

        /* renamed from: a */
        public String f8590a;

        /* renamed from: b */
        public Integer f8591b;

        /* renamed from: c */
        public Integer f8592c;

        /* renamed from: d */
        public Boolean f8593d;

        @Override // p098g8.AbstractC2135f0.e.d.a.c.AbstractC6178a
        /* renamed from: a */
        public AbstractC2135f0.e.d.a.c mo8630a() {
            String str = "";
            if (this.f8590a == null) {
                str = " processName";
            }
            if (this.f8591b == null) {
                str = str + " pid";
            }
            if (this.f8592c == null) {
                str = str + " importance";
            }
            if (this.f8593d == null) {
                str = str + " defaultProcess";
            }
            if (str.isEmpty()) {
                return new C2150t(this.f8590a, this.f8591b.intValue(), this.f8592c.intValue(), this.f8593d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.c.AbstractC6178a
        /* renamed from: b */
        public AbstractC2135f0.e.d.a.c.AbstractC6178a mo8631b(boolean z10) {
            this.f8593d = Boolean.valueOf(z10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.c.AbstractC6178a
        /* renamed from: c */
        public AbstractC2135f0.e.d.a.c.AbstractC6178a mo8632c(int i10) {
            this.f8592c = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.c.AbstractC6178a
        /* renamed from: d */
        public AbstractC2135f0.e.d.a.c.AbstractC6178a mo8633d(int i10) {
            this.f8591b = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.c.AbstractC6178a
        /* renamed from: e */
        public AbstractC2135f0.e.d.a.c.AbstractC6178a mo8634e(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.f8590a = str;
            return this;
        }
    }

    public C2150t(String str, int i10, int i11, boolean z10) {
        this.f8586a = str;
        this.f8587b = i10;
        this.f8588c = i11;
        this.f8589d = z10;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.c
    /* renamed from: b */
    public int mo8626b() {
        return this.f8588c;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.c
    /* renamed from: c */
    public int mo8627c() {
        return this.f8587b;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.c
    /* renamed from: d */
    public String mo8628d() {
        return this.f8586a;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.c
    /* renamed from: e */
    public boolean mo8629e() {
        return this.f8589d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.d.a.c)) {
            return false;
        }
        AbstractC2135f0.e.d.a.c cVar = (AbstractC2135f0.e.d.a.c) obj;
        return this.f8586a.equals(cVar.mo8628d()) && this.f8587b == cVar.mo8627c() && this.f8588c == cVar.mo8626b() && this.f8589d == cVar.mo8629e();
    }

    public int hashCode() {
        return ((((((this.f8586a.hashCode() ^ 1000003) * 1000003) ^ this.f8587b) * 1000003) ^ this.f8588c) * 1000003) ^ (this.f8589d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f8586a + ", pid=" + this.f8587b + ", importance=" + this.f8588c + ", defaultProcess=" + this.f8589d + "}";
    }
}
