package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.d */
/* loaded from: classes.dex */
public final class C2130d extends AbstractC2135f0.a.AbstractC6164a {

    /* renamed from: a */
    public final String f8422a;

    /* renamed from: b */
    public final String f8423b;

    /* renamed from: c */
    public final String f8424c;

    /* renamed from: g8.d$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.a.AbstractC6164a.AbstractC6165a {

        /* renamed from: a */
        public String f8425a;

        /* renamed from: b */
        public String f8426b;

        /* renamed from: c */
        public String f8427c;

        @Override // p098g8.AbstractC2135f0.a.AbstractC6164a.AbstractC6165a
        /* renamed from: a */
        public AbstractC2135f0.a.AbstractC6164a mo8424a() {
            String str = "";
            if (this.f8425a == null) {
                str = " arch";
            }
            if (this.f8426b == null) {
                str = str + " libraryName";
            }
            if (this.f8427c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new C2130d(this.f8425a, this.f8426b, this.f8427c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.a.AbstractC6164a.AbstractC6165a
        /* renamed from: b */
        public AbstractC2135f0.a.AbstractC6164a.AbstractC6165a mo8425b(String str) {
            Objects.requireNonNull(str, "Null arch");
            this.f8425a = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.a.AbstractC6164a.AbstractC6165a
        /* renamed from: c */
        public AbstractC2135f0.a.AbstractC6164a.AbstractC6165a mo8426c(String str) {
            Objects.requireNonNull(str, "Null buildId");
            this.f8427c = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.a.AbstractC6164a.AbstractC6165a
        /* renamed from: d */
        public AbstractC2135f0.a.AbstractC6164a.AbstractC6165a mo8427d(String str) {
            Objects.requireNonNull(str, "Null libraryName");
            this.f8426b = str;
            return this;
        }
    }

    public C2130d(String str, String str2, String str3) {
        this.f8422a = str;
        this.f8423b = str2;
        this.f8424c = str3;
    }

    @Override // p098g8.AbstractC2135f0.a.AbstractC6164a
    /* renamed from: b */
    public String mo8421b() {
        return this.f8422a;
    }

    @Override // p098g8.AbstractC2135f0.a.AbstractC6164a
    /* renamed from: c */
    public String mo8422c() {
        return this.f8424c;
    }

    @Override // p098g8.AbstractC2135f0.a.AbstractC6164a
    /* renamed from: d */
    public String mo8423d() {
        return this.f8423b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.a.AbstractC6164a)) {
            return false;
        }
        AbstractC2135f0.a.AbstractC6164a abstractC6164a = (AbstractC2135f0.a.AbstractC6164a) obj;
        return this.f8422a.equals(abstractC6164a.mo8421b()) && this.f8423b.equals(abstractC6164a.mo8423d()) && this.f8424c.equals(abstractC6164a.mo8422c());
    }

    public int hashCode() {
        return ((((this.f8422a.hashCode() ^ 1000003) * 1000003) ^ this.f8423b.hashCode()) * 1000003) ^ this.f8424c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f8422a + ", libraryName=" + this.f8423b + ", buildId=" + this.f8424c + "}";
    }
}
