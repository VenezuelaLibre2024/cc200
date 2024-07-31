package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.x */
/* loaded from: classes.dex */
public final class C2154x extends AbstractC2135f0.e.d.AbstractC6180e.b {

    /* renamed from: a */
    public final String f8616a;

    /* renamed from: b */
    public final String f8617b;

    /* renamed from: g8.x$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.d.AbstractC6180e.b.a {

        /* renamed from: a */
        public String f8618a;

        /* renamed from: b */
        public String f8619b;

        @Override // p098g8.AbstractC2135f0.e.d.AbstractC6180e.b.a
        /* renamed from: a */
        public AbstractC2135f0.e.d.AbstractC6180e.b mo8673a() {
            String str = "";
            if (this.f8618a == null) {
                str = " rolloutId";
            }
            if (this.f8619b == null) {
                str = str + " variantId";
            }
            if (str.isEmpty()) {
                return new C2154x(this.f8618a, this.f8619b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.d.AbstractC6180e.b.a
        /* renamed from: b */
        public AbstractC2135f0.e.d.AbstractC6180e.b.a mo8674b(String str) {
            Objects.requireNonNull(str, "Null rolloutId");
            this.f8618a = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.AbstractC6180e.b.a
        /* renamed from: c */
        public AbstractC2135f0.e.d.AbstractC6180e.b.a mo8675c(String str) {
            Objects.requireNonNull(str, "Null variantId");
            this.f8619b = str;
            return this;
        }
    }

    public C2154x(String str, String str2) {
        this.f8616a = str;
        this.f8617b = str2;
    }

    @Override // p098g8.AbstractC2135f0.e.d.AbstractC6180e.b
    /* renamed from: b */
    public String mo8671b() {
        return this.f8616a;
    }

    @Override // p098g8.AbstractC2135f0.e.d.AbstractC6180e.b
    /* renamed from: c */
    public String mo8672c() {
        return this.f8617b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.d.AbstractC6180e.b)) {
            return false;
        }
        AbstractC2135f0.e.d.AbstractC6180e.b bVar = (AbstractC2135f0.e.d.AbstractC6180e.b) obj;
        return this.f8616a.equals(bVar.mo8671b()) && this.f8617b.equals(bVar.mo8672c());
    }

    public int hashCode() {
        return ((this.f8616a.hashCode() ^ 1000003) * 1000003) ^ this.f8617b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f8616a + ", variantId=" + this.f8617b + "}";
    }
}
