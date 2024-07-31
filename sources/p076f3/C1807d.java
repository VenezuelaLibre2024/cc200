package p076f3;

import java.util.List;
import java.util.Objects;

/* renamed from: f3.d */
/* loaded from: classes.dex */
public final class C1807d extends AbstractC1813j {

    /* renamed from: a */
    public final List<AbstractC1816m> f6688a;

    public C1807d(List<AbstractC1816m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f6688a = list;
    }

    @Override // p076f3.AbstractC1813j
    /* renamed from: c */
    public List<AbstractC1816m> mo7331c() {
        return this.f6688a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1813j) {
            return this.f6688a.equals(((AbstractC1813j) obj).mo7331c());
        }
        return false;
    }

    public int hashCode() {
        return this.f6688a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f6688a + "}";
    }
}
