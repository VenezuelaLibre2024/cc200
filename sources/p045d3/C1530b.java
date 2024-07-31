package p045d3;

/* renamed from: d3.b */
/* loaded from: classes.dex */
public final class C1530b extends AbstractC1534f {

    /* renamed from: a */
    public final Integer f5626a;

    public C1530b(Integer num) {
        this.f5626a = num;
    }

    @Override // p045d3.AbstractC1534f
    /* renamed from: a */
    public Integer mo6231a() {
        return this.f5626a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1534f)) {
            return false;
        }
        Integer num = this.f5626a;
        Integer mo6231a = ((AbstractC1534f) obj).mo6231a();
        return num == null ? mo6231a == null : num.equals(mo6231a);
    }

    public int hashCode() {
        Integer num = this.f5626a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f5626a + "}";
    }
}
