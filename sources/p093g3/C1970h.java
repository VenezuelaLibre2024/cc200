package p093g3;

import java.util.Arrays;
import java.util.Objects;
import p045d3.C1531c;

/* renamed from: g3.h */
/* loaded from: classes.dex */
public final class C1970h {

    /* renamed from: a */
    public final C1531c f7876a;

    /* renamed from: b */
    public final byte[] f7877b;

    public C1970h(C1531c c1531c, byte[] bArr) {
        Objects.requireNonNull(c1531c, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f7876a = c1531c;
        this.f7877b = bArr;
    }

    /* renamed from: a */
    public byte[] m7978a() {
        return this.f7877b;
    }

    /* renamed from: b */
    public C1531c m7979b() {
        return this.f7876a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1970h)) {
            return false;
        }
        C1970h c1970h = (C1970h) obj;
        if (this.f7876a.equals(c1970h.f7876a)) {
            return Arrays.equals(this.f7877b, c1970h.f7877b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f7876a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7877b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f7876a + ", bytes=[...]}";
    }
}
