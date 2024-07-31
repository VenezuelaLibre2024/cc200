package p333x3;

/* renamed from: x3.a0 */
/* loaded from: classes.dex */
public final class C5557a0 {

    /* renamed from: c */
    public static final C5557a0 f20850c = new C5557a0(0, 0);

    /* renamed from: a */
    public final long f20851a;

    /* renamed from: b */
    public final long f20852b;

    public C5557a0(long j10, long j11) {
        this.f20851a = j10;
        this.f20852b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5557a0.class != obj.getClass()) {
            return false;
        }
        C5557a0 c5557a0 = (C5557a0) obj;
        return this.f20851a == c5557a0.f20851a && this.f20852b == c5557a0.f20852b;
    }

    public int hashCode() {
        return (((int) this.f20851a) * 31) + ((int) this.f20852b);
    }

    public String toString() {
        return "[timeUs=" + this.f20851a + ", position=" + this.f20852b + "]";
    }
}
