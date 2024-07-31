package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.v */
/* loaded from: classes.dex */
public final class C2152v extends AbstractC2135f0.e.d.AbstractC6179d {

    /* renamed from: a */
    public final String f8606a;

    /* renamed from: g8.v$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.d.AbstractC6179d.a {

        /* renamed from: a */
        public String f8607a;

        @Override // p098g8.AbstractC2135f0.e.d.AbstractC6179d.a
        /* renamed from: a */
        public AbstractC2135f0.e.d.AbstractC6179d mo8658a() {
            String str = "";
            if (this.f8607a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new C2152v(this.f8607a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.d.AbstractC6179d.a
        /* renamed from: b */
        public AbstractC2135f0.e.d.AbstractC6179d.a mo8659b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.f8607a = str;
            return this;
        }
    }

    public C2152v(String str) {
        this.f8606a = str;
    }

    @Override // p098g8.AbstractC2135f0.e.d.AbstractC6179d
    /* renamed from: b */
    public String mo8657b() {
        return this.f8606a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2135f0.e.d.AbstractC6179d) {
            return this.f8606a.equals(((AbstractC2135f0.e.d.AbstractC6179d) obj).mo8657b());
        }
        return false;
    }

    public int hashCode() {
        return this.f8606a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f8606a + "}";
    }
}
