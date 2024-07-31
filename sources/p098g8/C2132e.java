package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.e */
/* loaded from: classes.dex */
public final class C2132e extends AbstractC2135f0.c {

    /* renamed from: a */
    public final String f8437a;

    /* renamed from: b */
    public final String f8438b;

    /* renamed from: g8.e$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.c.a {

        /* renamed from: a */
        public String f8439a;

        /* renamed from: b */
        public String f8440b;

        @Override // p098g8.AbstractC2135f0.c.a
        /* renamed from: a */
        public AbstractC2135f0.c mo8439a() {
            String str = "";
            if (this.f8439a == null) {
                str = " key";
            }
            if (this.f8440b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C2132e(this.f8439a, this.f8440b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.c.a
        /* renamed from: b */
        public AbstractC2135f0.c.a mo8440b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.f8439a = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.c.a
        /* renamed from: c */
        public AbstractC2135f0.c.a mo8441c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.f8440b = str;
            return this;
        }
    }

    public C2132e(String str, String str2) {
        this.f8437a = str;
        this.f8438b = str2;
    }

    @Override // p098g8.AbstractC2135f0.c
    /* renamed from: b */
    public String mo8437b() {
        return this.f8437a;
    }

    @Override // p098g8.AbstractC2135f0.c
    /* renamed from: c */
    public String mo8438c() {
        return this.f8438b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.c)) {
            return false;
        }
        AbstractC2135f0.c cVar = (AbstractC2135f0.c) obj;
        return this.f8437a.equals(cVar.mo8437b()) && this.f8438b.equals(cVar.mo8438c());
    }

    public int hashCode() {
        return ((this.f8437a.hashCode() ^ 1000003) * 1000003) ^ this.f8438b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f8437a + ", value=" + this.f8438b + "}";
    }
}
