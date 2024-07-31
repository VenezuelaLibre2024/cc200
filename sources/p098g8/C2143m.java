package p098g8;

import java.util.List;
import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.m */
/* loaded from: classes.dex */
public final class C2143m extends AbstractC2135f0.e.d.a {

    /* renamed from: a */
    public final AbstractC2135f0.e.d.a.b f8522a;

    /* renamed from: b */
    public final List<AbstractC2135f0.c> f8523b;

    /* renamed from: c */
    public final List<AbstractC2135f0.c> f8524c;

    /* renamed from: d */
    public final Boolean f8525d;

    /* renamed from: e */
    public final AbstractC2135f0.e.d.a.c f8526e;

    /* renamed from: f */
    public final List<AbstractC2135f0.e.d.a.c> f8527f;

    /* renamed from: g */
    public final int f8528g;

    /* renamed from: g8.m$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.d.a.AbstractC6167a {

        /* renamed from: a */
        public AbstractC2135f0.e.d.a.b f8529a;

        /* renamed from: b */
        public List<AbstractC2135f0.c> f8530b;

        /* renamed from: c */
        public List<AbstractC2135f0.c> f8531c;

        /* renamed from: d */
        public Boolean f8532d;

        /* renamed from: e */
        public AbstractC2135f0.e.d.a.c f8533e;

        /* renamed from: f */
        public List<AbstractC2135f0.e.d.a.c> f8534f;

        /* renamed from: g */
        public Integer f8535g;

        public b() {
        }

        public b(AbstractC2135f0.e.d.a aVar) {
            this.f8529a = aVar.mo8549f();
            this.f8530b = aVar.mo8548e();
            this.f8531c = aVar.mo8550g();
            this.f8532d = aVar.mo8546c();
            this.f8533e = aVar.mo8547d();
            this.f8534f = aVar.mo8545b();
            this.f8535g = Integer.valueOf(aVar.mo8551h());
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.AbstractC6167a
        /* renamed from: a */
        public AbstractC2135f0.e.d.a mo8553a() {
            String str = "";
            if (this.f8529a == null) {
                str = " execution";
            }
            if (this.f8535g == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C2143m(this.f8529a, this.f8530b, this.f8531c, this.f8532d, this.f8533e, this.f8534f, this.f8535g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.AbstractC6167a
        /* renamed from: b */
        public AbstractC2135f0.e.d.a.AbstractC6167a mo8554b(List<AbstractC2135f0.e.d.a.c> list) {
            this.f8534f = list;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.AbstractC6167a
        /* renamed from: c */
        public AbstractC2135f0.e.d.a.AbstractC6167a mo8555c(Boolean bool) {
            this.f8532d = bool;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.AbstractC6167a
        /* renamed from: d */
        public AbstractC2135f0.e.d.a.AbstractC6167a mo8556d(AbstractC2135f0.e.d.a.c cVar) {
            this.f8533e = cVar;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.AbstractC6167a
        /* renamed from: e */
        public AbstractC2135f0.e.d.a.AbstractC6167a mo8557e(List<AbstractC2135f0.c> list) {
            this.f8530b = list;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.AbstractC6167a
        /* renamed from: f */
        public AbstractC2135f0.e.d.a.AbstractC6167a mo8558f(AbstractC2135f0.e.d.a.b bVar) {
            Objects.requireNonNull(bVar, "Null execution");
            this.f8529a = bVar;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.AbstractC6167a
        /* renamed from: g */
        public AbstractC2135f0.e.d.a.AbstractC6167a mo8559g(List<AbstractC2135f0.c> list) {
            this.f8531c = list;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.AbstractC6167a
        /* renamed from: h */
        public AbstractC2135f0.e.d.a.AbstractC6167a mo8560h(int i10) {
            this.f8535g = Integer.valueOf(i10);
            return this;
        }
    }

    public C2143m(AbstractC2135f0.e.d.a.b bVar, List<AbstractC2135f0.c> list, List<AbstractC2135f0.c> list2, Boolean bool, AbstractC2135f0.e.d.a.c cVar, List<AbstractC2135f0.e.d.a.c> list3, int i10) {
        this.f8522a = bVar;
        this.f8523b = list;
        this.f8524c = list2;
        this.f8525d = bool;
        this.f8526e = cVar;
        this.f8527f = list3;
        this.f8528g = i10;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a
    /* renamed from: b */
    public List<AbstractC2135f0.e.d.a.c> mo8545b() {
        return this.f8527f;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a
    /* renamed from: c */
    public Boolean mo8546c() {
        return this.f8525d;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a
    /* renamed from: d */
    public AbstractC2135f0.e.d.a.c mo8547d() {
        return this.f8526e;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a
    /* renamed from: e */
    public List<AbstractC2135f0.c> mo8548e() {
        return this.f8523b;
    }

    public boolean equals(Object obj) {
        List<AbstractC2135f0.c> list;
        List<AbstractC2135f0.c> list2;
        Boolean bool;
        AbstractC2135f0.e.d.a.c cVar;
        List<AbstractC2135f0.e.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.d.a)) {
            return false;
        }
        AbstractC2135f0.e.d.a aVar = (AbstractC2135f0.e.d.a) obj;
        return this.f8522a.equals(aVar.mo8549f()) && ((list = this.f8523b) != null ? list.equals(aVar.mo8548e()) : aVar.mo8548e() == null) && ((list2 = this.f8524c) != null ? list2.equals(aVar.mo8550g()) : aVar.mo8550g() == null) && ((bool = this.f8525d) != null ? bool.equals(aVar.mo8546c()) : aVar.mo8546c() == null) && ((cVar = this.f8526e) != null ? cVar.equals(aVar.mo8547d()) : aVar.mo8547d() == null) && ((list3 = this.f8527f) != null ? list3.equals(aVar.mo8545b()) : aVar.mo8545b() == null) && this.f8528g == aVar.mo8551h();
    }

    @Override // p098g8.AbstractC2135f0.e.d.a
    /* renamed from: f */
    public AbstractC2135f0.e.d.a.b mo8549f() {
        return this.f8522a;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a
    /* renamed from: g */
    public List<AbstractC2135f0.c> mo8550g() {
        return this.f8524c;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a
    /* renamed from: h */
    public int mo8551h() {
        return this.f8528g;
    }

    public int hashCode() {
        int hashCode = (this.f8522a.hashCode() ^ 1000003) * 1000003;
        List<AbstractC2135f0.c> list = this.f8523b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<AbstractC2135f0.c> list2 = this.f8524c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f8525d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        AbstractC2135f0.e.d.a.c cVar = this.f8526e;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<AbstractC2135f0.e.d.a.c> list3 = this.f8527f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f8528g;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a
    /* renamed from: i */
    public AbstractC2135f0.e.d.a.AbstractC6167a mo8552i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f8522a + ", customAttributes=" + this.f8523b + ", internalKeys=" + this.f8524c + ", background=" + this.f8525d + ", currentProcessDetails=" + this.f8526e + ", appProcessDetails=" + this.f8527f + ", uiOrientation=" + this.f8528g + "}";
    }
}
