package p098g8;

import java.util.Arrays;
import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.g */
/* loaded from: classes.dex */
public final class C2136g extends AbstractC2135f0.d.b {

    /* renamed from: a */
    public final String f8449a;

    /* renamed from: b */
    public final byte[] f8450b;

    /* renamed from: g8.g$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.d.b.a {

        /* renamed from: a */
        public String f8451a;

        /* renamed from: b */
        public byte[] f8452b;

        @Override // p098g8.AbstractC2135f0.d.b.a
        /* renamed from: a */
        public AbstractC2135f0.d.b mo8465a() {
            String str = "";
            if (this.f8451a == null) {
                str = " filename";
            }
            if (this.f8452b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C2136g(this.f8451a, this.f8452b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.d.b.a
        /* renamed from: b */
        public AbstractC2135f0.d.b.a mo8466b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f8452b = bArr;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.d.b.a
        /* renamed from: c */
        public AbstractC2135f0.d.b.a mo8467c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f8451a = str;
            return this;
        }
    }

    public C2136g(String str, byte[] bArr) {
        this.f8449a = str;
        this.f8450b = bArr;
    }

    @Override // p098g8.AbstractC2135f0.d.b
    /* renamed from: b */
    public byte[] mo8463b() {
        return this.f8450b;
    }

    @Override // p098g8.AbstractC2135f0.d.b
    /* renamed from: c */
    public String mo8464c() {
        return this.f8449a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.d.b)) {
            return false;
        }
        AbstractC2135f0.d.b bVar = (AbstractC2135f0.d.b) obj;
        if (this.f8449a.equals(bVar.mo8464c())) {
            if (Arrays.equals(this.f8450b, bVar instanceof C2136g ? ((C2136g) bVar).f8450b : bVar.mo8463b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f8449a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8450b);
    }

    public String toString() {
        return "File{filename=" + this.f8449a + ", contents=" + Arrays.toString(this.f8450b) + "}";
    }
}
