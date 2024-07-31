package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.a0 */
/* loaded from: classes.dex */
public final class C2125a0 extends AbstractC2135f0.e.f {

    /* renamed from: a */
    public final String f8371a;

    /* renamed from: g8.a0$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.f.a {

        /* renamed from: a */
        public String f8372a;

        @Override // p098g8.AbstractC2135f0.e.f.a
        /* renamed from: a */
        public AbstractC2135f0.e.f mo8367a() {
            String str = "";
            if (this.f8372a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new C2125a0(this.f8372a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.f.a
        /* renamed from: b */
        public AbstractC2135f0.e.f.a mo8368b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f8372a = str;
            return this;
        }
    }

    public C2125a0(String str) {
        this.f8371a = str;
    }

    @Override // p098g8.AbstractC2135f0.e.f
    /* renamed from: b */
    public String mo8366b() {
        return this.f8371a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2135f0.e.f) {
            return this.f8371a.equals(((AbstractC2135f0.e.f) obj).mo8366b());
        }
        return false;
    }

    public int hashCode() {
        return this.f8371a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f8371a + "}";
    }
}
