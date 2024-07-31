package p165l2;

/* renamed from: l2.g */
/* loaded from: classes.dex */
public class C3411g {

    /* renamed from: a */
    public final String f11987a;

    /* renamed from: b */
    public final int f11988b;

    public C3411g(String str, int i10) {
        this.f11987a = str;
        this.f11988b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3411g)) {
            return false;
        }
        C3411g c3411g = (C3411g) obj;
        if (this.f11988b != c3411g.f11988b) {
            return false;
        }
        return this.f11987a.equals(c3411g.f11987a);
    }

    public int hashCode() {
        return (this.f11987a.hashCode() * 31) + this.f11988b;
    }
}
