package p309v8;

import java.util.List;
import java.util.Objects;

/* renamed from: v8.a */
/* loaded from: classes.dex */
public final class C5141a extends AbstractC5152l {

    /* renamed from: a */
    public final String f19394a;

    /* renamed from: b */
    public final List<String> f19395b;

    public C5141a(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f19394a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f19395b = list;
    }

    @Override // p309v8.AbstractC5152l
    /* renamed from: b */
    public List<String> mo20817b() {
        return this.f19395b;
    }

    @Override // p309v8.AbstractC5152l
    /* renamed from: c */
    public String mo20818c() {
        return this.f19394a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5152l)) {
            return false;
        }
        AbstractC5152l abstractC5152l = (AbstractC5152l) obj;
        return this.f19394a.equals(abstractC5152l.mo20818c()) && this.f19395b.equals(abstractC5152l.mo20817b());
    }

    public int hashCode() {
        return ((this.f19394a.hashCode() ^ 1000003) * 1000003) ^ this.f19395b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f19394a + ", usedDates=" + this.f19395b + "}";
    }
}
