package p098g8;

import java.util.List;
import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.f */
/* loaded from: classes.dex */
public final class C2134f extends AbstractC2135f0.d {

    /* renamed from: a */
    public final List<AbstractC2135f0.d.b> f8444a;

    /* renamed from: b */
    public final String f8445b;

    /* renamed from: g8.f$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.d.a {

        /* renamed from: a */
        public List<AbstractC2135f0.d.b> f8446a;

        /* renamed from: b */
        public String f8447b;

        @Override // p098g8.AbstractC2135f0.d.a
        /* renamed from: a */
        public AbstractC2135f0.d mo8447a() {
            String str = "";
            if (this.f8446a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new C2134f(this.f8446a, this.f8447b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.d.a
        /* renamed from: b */
        public AbstractC2135f0.d.a mo8448b(List<AbstractC2135f0.d.b> list) {
            Objects.requireNonNull(list, "Null files");
            this.f8446a = list;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.d.a
        /* renamed from: c */
        public AbstractC2135f0.d.a mo8449c(String str) {
            this.f8447b = str;
            return this;
        }
    }

    public C2134f(List<AbstractC2135f0.d.b> list, String str) {
        this.f8444a = list;
        this.f8445b = str;
    }

    @Override // p098g8.AbstractC2135f0.d
    /* renamed from: b */
    public List<AbstractC2135f0.d.b> mo8445b() {
        return this.f8444a;
    }

    @Override // p098g8.AbstractC2135f0.d
    /* renamed from: c */
    public String mo8446c() {
        return this.f8445b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.d)) {
            return false;
        }
        AbstractC2135f0.d dVar = (AbstractC2135f0.d) obj;
        if (this.f8444a.equals(dVar.mo8445b())) {
            String str = this.f8445b;
            String mo8446c = dVar.mo8446c();
            if (str == null) {
                if (mo8446c == null) {
                    return true;
                }
            } else if (str.equals(mo8446c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f8444a.hashCode() ^ 1000003) * 1000003;
        String str = this.f8445b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f8444a + ", orgId=" + this.f8445b + "}";
    }
}
