package p093g3;

import java.util.Objects;
import p045d3.AbstractC1532d;
import p045d3.C1531c;
import p045d3.InterfaceC1535g;
import p093g3.AbstractC1977o;

/* renamed from: g3.c */
/* loaded from: classes.dex */
public final class C1965c extends AbstractC1977o {

    /* renamed from: a */
    public final AbstractC1978p f7846a;

    /* renamed from: b */
    public final String f7847b;

    /* renamed from: c */
    public final AbstractC1532d<?> f7848c;

    /* renamed from: d */
    public final InterfaceC1535g<?, byte[]> f7849d;

    /* renamed from: e */
    public final C1531c f7850e;

    /* renamed from: g3.c$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1977o.a {

        /* renamed from: a */
        public AbstractC1978p f7851a;

        /* renamed from: b */
        public String f7852b;

        /* renamed from: c */
        public AbstractC1532d<?> f7853c;

        /* renamed from: d */
        public InterfaceC1535g<?, byte[]> f7854d;

        /* renamed from: e */
        public C1531c f7855e;

        @Override // p093g3.AbstractC1977o.a
        /* renamed from: a */
        public AbstractC1977o mo7958a() {
            String str = "";
            if (this.f7851a == null) {
                str = " transportContext";
            }
            if (this.f7852b == null) {
                str = str + " transportName";
            }
            if (this.f7853c == null) {
                str = str + " event";
            }
            if (this.f7854d == null) {
                str = str + " transformer";
            }
            if (this.f7855e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C1965c(this.f7851a, this.f7852b, this.f7853c, this.f7854d, this.f7855e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p093g3.AbstractC1977o.a
        /* renamed from: b */
        public AbstractC1977o.a mo7959b(C1531c c1531c) {
            Objects.requireNonNull(c1531c, "Null encoding");
            this.f7855e = c1531c;
            return this;
        }

        @Override // p093g3.AbstractC1977o.a
        /* renamed from: c */
        public AbstractC1977o.a mo7960c(AbstractC1532d<?> abstractC1532d) {
            Objects.requireNonNull(abstractC1532d, "Null event");
            this.f7853c = abstractC1532d;
            return this;
        }

        @Override // p093g3.AbstractC1977o.a
        /* renamed from: d */
        public AbstractC1977o.a mo7961d(InterfaceC1535g<?, byte[]> interfaceC1535g) {
            Objects.requireNonNull(interfaceC1535g, "Null transformer");
            this.f7854d = interfaceC1535g;
            return this;
        }

        @Override // p093g3.AbstractC1977o.a
        /* renamed from: e */
        public AbstractC1977o.a mo7962e(AbstractC1978p abstractC1978p) {
            Objects.requireNonNull(abstractC1978p, "Null transportContext");
            this.f7851a = abstractC1978p;
            return this;
        }

        @Override // p093g3.AbstractC1977o.a
        /* renamed from: f */
        public AbstractC1977o.a mo7963f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f7852b = str;
            return this;
        }
    }

    public C1965c(AbstractC1978p abstractC1978p, String str, AbstractC1532d<?> abstractC1532d, InterfaceC1535g<?, byte[]> interfaceC1535g, C1531c c1531c) {
        this.f7846a = abstractC1978p;
        this.f7847b = str;
        this.f7848c = abstractC1532d;
        this.f7849d = interfaceC1535g;
        this.f7850e = c1531c;
    }

    public /* synthetic */ C1965c(AbstractC1978p abstractC1978p, String str, AbstractC1532d abstractC1532d, InterfaceC1535g interfaceC1535g, C1531c c1531c, a aVar) {
        this(abstractC1978p, str, abstractC1532d, interfaceC1535g, c1531c);
    }

    @Override // p093g3.AbstractC1977o
    /* renamed from: b */
    public C1531c mo7953b() {
        return this.f7850e;
    }

    @Override // p093g3.AbstractC1977o
    /* renamed from: c */
    public AbstractC1532d<?> mo7954c() {
        return this.f7848c;
    }

    @Override // p093g3.AbstractC1977o
    /* renamed from: e */
    public InterfaceC1535g<?, byte[]> mo7955e() {
        return this.f7849d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1977o)) {
            return false;
        }
        AbstractC1977o abstractC1977o = (AbstractC1977o) obj;
        return this.f7846a.equals(abstractC1977o.mo7956f()) && this.f7847b.equals(abstractC1977o.mo7957g()) && this.f7848c.equals(abstractC1977o.mo7954c()) && this.f7849d.equals(abstractC1977o.mo7955e()) && this.f7850e.equals(abstractC1977o.mo7953b());
    }

    @Override // p093g3.AbstractC1977o
    /* renamed from: f */
    public AbstractC1978p mo7956f() {
        return this.f7846a;
    }

    @Override // p093g3.AbstractC1977o
    /* renamed from: g */
    public String mo7957g() {
        return this.f7847b;
    }

    public int hashCode() {
        return ((((((((this.f7846a.hashCode() ^ 1000003) * 1000003) ^ this.f7847b.hashCode()) * 1000003) ^ this.f7848c.hashCode()) * 1000003) ^ this.f7849d.hashCode()) * 1000003) ^ this.f7850e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f7846a + ", transportName=" + this.f7847b + ", event=" + this.f7848c + ", transformer=" + this.f7849d + ", encoding=" + this.f7850e + "}";
    }
}
