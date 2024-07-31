package p105h3;

import java.util.Arrays;
import java.util.Objects;
import p093g3.AbstractC1971i;
import p105h3.AbstractC2291f;

/* renamed from: h3.a */
/* loaded from: classes.dex */
public final class C2286a extends AbstractC2291f {

    /* renamed from: a */
    public final Iterable<AbstractC1971i> f9183a;

    /* renamed from: b */
    public final byte[] f9184b;

    /* renamed from: h3.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2291f.a {

        /* renamed from: a */
        public Iterable<AbstractC1971i> f9185a;

        /* renamed from: b */
        public byte[] f9186b;

        @Override // p105h3.AbstractC2291f.a
        /* renamed from: a */
        public AbstractC2291f mo9296a() {
            String str = "";
            if (this.f9185a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C2286a(this.f9185a, this.f9186b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p105h3.AbstractC2291f.a
        /* renamed from: b */
        public AbstractC2291f.a mo9297b(Iterable<AbstractC1971i> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f9185a = iterable;
            return this;
        }

        @Override // p105h3.AbstractC2291f.a
        /* renamed from: c */
        public AbstractC2291f.a mo9298c(byte[] bArr) {
            this.f9186b = bArr;
            return this;
        }
    }

    public C2286a(Iterable<AbstractC1971i> iterable, byte[] bArr) {
        this.f9183a = iterable;
        this.f9184b = bArr;
    }

    @Override // p105h3.AbstractC2291f
    /* renamed from: b */
    public Iterable<AbstractC1971i> mo9294b() {
        return this.f9183a;
    }

    @Override // p105h3.AbstractC2291f
    /* renamed from: c */
    public byte[] mo9295c() {
        return this.f9184b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2291f)) {
            return false;
        }
        AbstractC2291f abstractC2291f = (AbstractC2291f) obj;
        if (this.f9183a.equals(abstractC2291f.mo9294b())) {
            if (Arrays.equals(this.f9184b, abstractC2291f instanceof C2286a ? ((C2286a) abstractC2291f).f9184b : abstractC2291f.mo9295c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f9183a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f9184b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f9183a + ", extras=" + Arrays.toString(this.f9184b) + "}";
    }
}
