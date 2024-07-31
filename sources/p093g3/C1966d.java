package p093g3;

import java.util.Arrays;
import java.util.Objects;
import p045d3.EnumC1533e;
import p093g3.AbstractC1978p;

/* renamed from: g3.d */
/* loaded from: classes.dex */
public final class C1966d extends AbstractC1978p {

    /* renamed from: a */
    public final String f7856a;

    /* renamed from: b */
    public final byte[] f7857b;

    /* renamed from: c */
    public final EnumC1533e f7858c;

    /* renamed from: g3.d$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1978p.a {

        /* renamed from: a */
        public String f7859a;

        /* renamed from: b */
        public byte[] f7860b;

        /* renamed from: c */
        public EnumC1533e f7861c;

        @Override // p093g3.AbstractC1978p.a
        /* renamed from: a */
        public AbstractC1978p mo7967a() {
            String str = "";
            if (this.f7859a == null) {
                str = " backendName";
            }
            if (this.f7861c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C1966d(this.f7859a, this.f7860b, this.f7861c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p093g3.AbstractC1978p.a
        /* renamed from: b */
        public AbstractC1978p.a mo7968b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f7859a = str;
            return this;
        }

        @Override // p093g3.AbstractC1978p.a
        /* renamed from: c */
        public AbstractC1978p.a mo7969c(byte[] bArr) {
            this.f7860b = bArr;
            return this;
        }

        @Override // p093g3.AbstractC1978p.a
        /* renamed from: d */
        public AbstractC1978p.a mo7970d(EnumC1533e enumC1533e) {
            Objects.requireNonNull(enumC1533e, "Null priority");
            this.f7861c = enumC1533e;
            return this;
        }
    }

    public C1966d(String str, byte[] bArr, EnumC1533e enumC1533e) {
        this.f7856a = str;
        this.f7857b = bArr;
        this.f7858c = enumC1533e;
    }

    public /* synthetic */ C1966d(String str, byte[] bArr, EnumC1533e enumC1533e, a aVar) {
        this(str, bArr, enumC1533e);
    }

    @Override // p093g3.AbstractC1978p
    /* renamed from: b */
    public String mo7964b() {
        return this.f7856a;
    }

    @Override // p093g3.AbstractC1978p
    /* renamed from: c */
    public byte[] mo7965c() {
        return this.f7857b;
    }

    @Override // p093g3.AbstractC1978p
    /* renamed from: d */
    public EnumC1533e mo7966d() {
        return this.f7858c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1978p)) {
            return false;
        }
        AbstractC1978p abstractC1978p = (AbstractC1978p) obj;
        if (this.f7856a.equals(abstractC1978p.mo7964b())) {
            if (Arrays.equals(this.f7857b, abstractC1978p instanceof C1966d ? ((C1966d) abstractC1978p).f7857b : abstractC1978p.mo7965c()) && this.f7858c.equals(abstractC1978p.mo7966d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f7856a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7857b)) * 1000003) ^ this.f7858c.hashCode();
    }
}
