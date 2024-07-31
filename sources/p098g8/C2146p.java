package p098g8;

import java.util.List;
import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.p */
/* loaded from: classes.dex */
public final class C2146p extends AbstractC2135f0.e.d.a.b.c {

    /* renamed from: a */
    public final String f8554a;

    /* renamed from: b */
    public final String f8555b;

    /* renamed from: c */
    public final List<AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b> f8556c;

    /* renamed from: d */
    public final AbstractC2135f0.e.d.a.b.c f8557d;

    /* renamed from: e */
    public final int f8558e;

    /* renamed from: g8.p$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.d.a.b.c.AbstractC6171a {

        /* renamed from: a */
        public String f8559a;

        /* renamed from: b */
        public String f8560b;

        /* renamed from: c */
        public List<AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b> f8561c;

        /* renamed from: d */
        public AbstractC2135f0.e.d.a.b.c f8562d;

        /* renamed from: e */
        public Integer f8563e;

        @Override // p098g8.AbstractC2135f0.e.d.a.b.c.AbstractC6171a
        /* renamed from: a */
        public AbstractC2135f0.e.d.a.b.c mo8591a() {
            String str = "";
            if (this.f8559a == null) {
                str = " type";
            }
            if (this.f8561c == null) {
                str = str + " frames";
            }
            if (this.f8563e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C2146p(this.f8559a, this.f8560b, this.f8561c, this.f8562d, this.f8563e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.c.AbstractC6171a
        /* renamed from: b */
        public AbstractC2135f0.e.d.a.b.c.AbstractC6171a mo8592b(AbstractC2135f0.e.d.a.b.c cVar) {
            this.f8562d = cVar;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.c.AbstractC6171a
        /* renamed from: c */
        public AbstractC2135f0.e.d.a.b.c.AbstractC6171a mo8593c(List<AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b> list) {
            Objects.requireNonNull(list, "Null frames");
            this.f8561c = list;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.c.AbstractC6171a
        /* renamed from: d */
        public AbstractC2135f0.e.d.a.b.c.AbstractC6171a mo8594d(int i10) {
            this.f8563e = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.c.AbstractC6171a
        /* renamed from: e */
        public AbstractC2135f0.e.d.a.b.c.AbstractC6171a mo8595e(String str) {
            this.f8560b = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.c.AbstractC6171a
        /* renamed from: f */
        public AbstractC2135f0.e.d.a.b.c.AbstractC6171a mo8596f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f8559a = str;
            return this;
        }
    }

    public C2146p(String str, String str2, List<AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b> list, AbstractC2135f0.e.d.a.b.c cVar, int i10) {
        this.f8554a = str;
        this.f8555b = str2;
        this.f8556c = list;
        this.f8557d = cVar;
        this.f8558e = i10;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.c
    /* renamed from: b */
    public AbstractC2135f0.e.d.a.b.c mo8586b() {
        return this.f8557d;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.c
    /* renamed from: c */
    public List<AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b> mo8587c() {
        return this.f8556c;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.c
    /* renamed from: d */
    public int mo8588d() {
        return this.f8558e;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.c
    /* renamed from: e */
    public String mo8589e() {
        return this.f8555b;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC2135f0.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.d.a.b.c)) {
            return false;
        }
        AbstractC2135f0.e.d.a.b.c cVar2 = (AbstractC2135f0.e.d.a.b.c) obj;
        return this.f8554a.equals(cVar2.mo8590f()) && ((str = this.f8555b) != null ? str.equals(cVar2.mo8589e()) : cVar2.mo8589e() == null) && this.f8556c.equals(cVar2.mo8587c()) && ((cVar = this.f8557d) != null ? cVar.equals(cVar2.mo8586b()) : cVar2.mo8586b() == null) && this.f8558e == cVar2.mo8588d();
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.c
    /* renamed from: f */
    public String mo8590f() {
        return this.f8554a;
    }

    public int hashCode() {
        int hashCode = (this.f8554a.hashCode() ^ 1000003) * 1000003;
        String str = this.f8555b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f8556c.hashCode()) * 1000003;
        AbstractC2135f0.e.d.a.b.c cVar = this.f8557d;
        return ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f8558e;
    }

    public String toString() {
        return "Exception{type=" + this.f8554a + ", reason=" + this.f8555b + ", frames=" + this.f8556c + ", causedBy=" + this.f8557d + ", overflowCount=" + this.f8558e + "}";
    }
}
