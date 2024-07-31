package p165l2;

/* renamed from: l2.d */
/* loaded from: classes.dex */
public class C3408d {

    /* renamed from: a */
    public String f11982a;

    /* renamed from: b */
    public Long f11983b;

    public C3408d(String str, long j10) {
        this.f11982a = str;
        this.f11983b = Long.valueOf(j10);
    }

    public C3408d(String str, boolean z10) {
        this(str, z10 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3408d)) {
            return false;
        }
        C3408d c3408d = (C3408d) obj;
        if (!this.f11982a.equals(c3408d.f11982a)) {
            return false;
        }
        Long l10 = this.f11983b;
        Long l11 = c3408d.f11983b;
        return l10 != null ? l10.equals(l11) : l11 == null;
    }

    public int hashCode() {
        int hashCode = this.f11982a.hashCode() * 31;
        Long l10 = this.f11983b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }
}
