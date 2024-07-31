package p076f3;

/* renamed from: f3.h */
/* loaded from: classes.dex */
public final class C1811h extends AbstractC1817n {

    /* renamed from: a */
    public final long f6721a;

    public C1811h(long j10) {
        this.f6721a = j10;
    }

    @Override // p076f3.AbstractC1817n
    /* renamed from: c */
    public long mo7367c() {
        return this.f6721a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC1817n) && this.f6721a == ((AbstractC1817n) obj).mo7367c();
    }

    public int hashCode() {
        long j10 = this.f6721a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f6721a + "}";
    }
}
