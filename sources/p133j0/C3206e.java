package p133j0;

/* renamed from: j0.e */
/* loaded from: classes.dex */
public final class C3206e {

    /* renamed from: a */
    public final float f11099a;

    /* renamed from: b */
    public final float f11100b;

    public C3206e(float f10, float f11) {
        this.f11099a = C3205d.m11407c(f10, "width");
        this.f11100b = C3205d.m11407c(f11, "height");
    }

    /* renamed from: a */
    public float m11417a() {
        return this.f11100b;
    }

    /* renamed from: b */
    public float m11418b() {
        return this.f11099a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3206e)) {
            return false;
        }
        C3206e c3206e = (C3206e) obj;
        return c3206e.f11099a == this.f11099a && c3206e.f11100b == this.f11100b;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f11099a) ^ Float.floatToIntBits(this.f11100b);
    }

    public String toString() {
        return this.f11099a + "x" + this.f11100b;
    }
}
