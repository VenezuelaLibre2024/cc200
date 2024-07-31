package p098g8;

import java.util.List;
import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.y */
/* loaded from: classes.dex */
public final class C2155y extends AbstractC2135f0.e.d.f {

    /* renamed from: a */
    public final List<AbstractC2135f0.e.d.AbstractC6180e> f8620a;

    /* renamed from: g8.y$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.d.f.a {

        /* renamed from: a */
        public List<AbstractC2135f0.e.d.AbstractC6180e> f8621a;

        @Override // p098g8.AbstractC2135f0.e.d.f.a
        /* renamed from: a */
        public AbstractC2135f0.e.d.f mo8678a() {
            String str = "";
            if (this.f8621a == null) {
                str = " rolloutAssignments";
            }
            if (str.isEmpty()) {
                return new C2155y(this.f8621a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.d.f.a
        /* renamed from: b */
        public AbstractC2135f0.e.d.f.a mo8679b(List<AbstractC2135f0.e.d.AbstractC6180e> list) {
            Objects.requireNonNull(list, "Null rolloutAssignments");
            this.f8621a = list;
            return this;
        }
    }

    public C2155y(List<AbstractC2135f0.e.d.AbstractC6180e> list) {
        this.f8620a = list;
    }

    @Override // p098g8.AbstractC2135f0.e.d.f
    /* renamed from: b */
    public List<AbstractC2135f0.e.d.AbstractC6180e> mo8677b() {
        return this.f8620a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2135f0.e.d.f) {
            return this.f8620a.equals(((AbstractC2135f0.e.d.f) obj).mo8677b());
        }
        return false;
    }

    public int hashCode() {
        return this.f8620a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f8620a + "}";
    }
}
