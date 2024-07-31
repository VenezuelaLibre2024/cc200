package p340xa;

/* renamed from: xa.b */
/* loaded from: classes.dex */
public class C5742b {

    /* renamed from: a */
    public final int f21290a;

    /* renamed from: b */
    public final int f21291b;

    public C5742b(int i10, int i11) {
        this.f21290a = i10;
        this.f21291b = i11;
    }

    /* renamed from: a */
    public final int m22851a() {
        return this.f21291b;
    }

    /* renamed from: b */
    public final int m22852b() {
        return this.f21290a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5742b)) {
            return false;
        }
        C5742b c5742b = (C5742b) obj;
        return this.f21290a == c5742b.f21290a && this.f21291b == c5742b.f21291b;
    }

    public final int hashCode() {
        return this.f21290a ^ this.f21291b;
    }

    public final String toString() {
        return this.f21290a + "(" + this.f21291b + ')';
    }
}
