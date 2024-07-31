package p098g8;

import java.util.List;
import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.r */
/* loaded from: classes.dex */
public final class C2148r extends AbstractC2135f0.e.d.a.b.AbstractC6174e {

    /* renamed from: a */
    public final String f8570a;

    /* renamed from: b */
    public final int f8571b;

    /* renamed from: c */
    public final List<AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b> f8572c;

    /* renamed from: g8.r$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6175a {

        /* renamed from: a */
        public String f8573a;

        /* renamed from: b */
        public Integer f8574b;

        /* renamed from: c */
        public List<AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b> f8575c;

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6175a
        /* renamed from: a */
        public AbstractC2135f0.e.d.a.b.AbstractC6174e mo8609a() {
            String str = "";
            if (this.f8573a == null) {
                str = " name";
            }
            if (this.f8574b == null) {
                str = str + " importance";
            }
            if (this.f8575c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C2148r(this.f8573a, this.f8574b.intValue(), this.f8575c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6175a
        /* renamed from: b */
        public AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6175a mo8610b(List<AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b> list) {
            Objects.requireNonNull(list, "Null frames");
            this.f8575c = list;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6175a
        /* renamed from: c */
        public AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6175a mo8611c(int i10) {
            this.f8574b = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6175a
        /* renamed from: d */
        public AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6175a mo8612d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f8573a = str;
            return this;
        }
    }

    public C2148r(String str, int i10, List<AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b> list) {
        this.f8570a = str;
        this.f8571b = i10;
        this.f8572c = list;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e
    /* renamed from: b */
    public List<AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b> mo8606b() {
        return this.f8572c;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e
    /* renamed from: c */
    public int mo8607c() {
        return this.f8571b;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e
    /* renamed from: d */
    public String mo8608d() {
        return this.f8570a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.d.a.b.AbstractC6174e)) {
            return false;
        }
        AbstractC2135f0.e.d.a.b.AbstractC6174e abstractC6174e = (AbstractC2135f0.e.d.a.b.AbstractC6174e) obj;
        return this.f8570a.equals(abstractC6174e.mo8608d()) && this.f8571b == abstractC6174e.mo8607c() && this.f8572c.equals(abstractC6174e.mo8606b());
    }

    public int hashCode() {
        return ((((this.f8570a.hashCode() ^ 1000003) * 1000003) ^ this.f8571b) * 1000003) ^ this.f8572c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f8570a + ", importance=" + this.f8571b + ", frames=" + this.f8572c + "}";
    }
}
