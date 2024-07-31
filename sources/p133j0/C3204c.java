package p133j0;

/* renamed from: j0.c */
/* loaded from: classes.dex */
public class C3204c<F, S> {

    /* renamed from: a */
    public final F f11097a;

    /* renamed from: b */
    public final S f11098b;

    public C3204c(F f10, S s10) {
        this.f11097a = f10;
        this.f11098b = s10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3204c)) {
            return false;
        }
        C3204c c3204c = (C3204c) obj;
        return C3203b.m11399a(c3204c.f11097a, this.f11097a) && C3203b.m11399a(c3204c.f11098b, this.f11098b);
    }

    public int hashCode() {
        F f10 = this.f11097a;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f11098b;
        return hashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f11097a + " " + this.f11098b + "}";
    }
}
