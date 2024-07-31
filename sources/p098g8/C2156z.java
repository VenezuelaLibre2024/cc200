package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.z */
/* loaded from: classes.dex */
public final class C2156z extends AbstractC2135f0.e.AbstractC6181e {

    /* renamed from: a */
    public final int f8622a;

    /* renamed from: b */
    public final String f8623b;

    /* renamed from: c */
    public final String f8624c;

    /* renamed from: d */
    public final boolean f8625d;

    /* renamed from: g8.z$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.AbstractC6181e.a {

        /* renamed from: a */
        public Integer f8626a;

        /* renamed from: b */
        public String f8627b;

        /* renamed from: c */
        public String f8628c;

        /* renamed from: d */
        public Boolean f8629d;

        @Override // p098g8.AbstractC2135f0.e.AbstractC6181e.a
        /* renamed from: a */
        public AbstractC2135f0.e.AbstractC6181e mo8685a() {
            String str = "";
            if (this.f8626a == null) {
                str = " platform";
            }
            if (this.f8627b == null) {
                str = str + " version";
            }
            if (this.f8628c == null) {
                str = str + " buildVersion";
            }
            if (this.f8629d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C2156z(this.f8626a.intValue(), this.f8627b, this.f8628c, this.f8629d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.AbstractC6181e.a
        /* renamed from: b */
        public AbstractC2135f0.e.AbstractC6181e.a mo8686b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f8628c = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.AbstractC6181e.a
        /* renamed from: c */
        public AbstractC2135f0.e.AbstractC6181e.a mo8687c(boolean z10) {
            this.f8629d = Boolean.valueOf(z10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.AbstractC6181e.a
        /* renamed from: d */
        public AbstractC2135f0.e.AbstractC6181e.a mo8688d(int i10) {
            this.f8626a = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.AbstractC6181e.a
        /* renamed from: e */
        public AbstractC2135f0.e.AbstractC6181e.a mo8689e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f8627b = str;
            return this;
        }
    }

    public C2156z(int i10, String str, String str2, boolean z10) {
        this.f8622a = i10;
        this.f8623b = str;
        this.f8624c = str2;
        this.f8625d = z10;
    }

    @Override // p098g8.AbstractC2135f0.e.AbstractC6181e
    /* renamed from: b */
    public String mo8681b() {
        return this.f8624c;
    }

    @Override // p098g8.AbstractC2135f0.e.AbstractC6181e
    /* renamed from: c */
    public int mo8682c() {
        return this.f8622a;
    }

    @Override // p098g8.AbstractC2135f0.e.AbstractC6181e
    /* renamed from: d */
    public String mo8683d() {
        return this.f8623b;
    }

    @Override // p098g8.AbstractC2135f0.e.AbstractC6181e
    /* renamed from: e */
    public boolean mo8684e() {
        return this.f8625d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.AbstractC6181e)) {
            return false;
        }
        AbstractC2135f0.e.AbstractC6181e abstractC6181e = (AbstractC2135f0.e.AbstractC6181e) obj;
        return this.f8622a == abstractC6181e.mo8682c() && this.f8623b.equals(abstractC6181e.mo8683d()) && this.f8624c.equals(abstractC6181e.mo8681b()) && this.f8625d == abstractC6181e.mo8684e();
    }

    public int hashCode() {
        return ((((((this.f8622a ^ 1000003) * 1000003) ^ this.f8623b.hashCode()) * 1000003) ^ this.f8624c.hashCode()) * 1000003) ^ (this.f8625d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f8622a + ", version=" + this.f8623b + ", buildVersion=" + this.f8624c + ", jailbroken=" + this.f8625d + "}";
    }
}
