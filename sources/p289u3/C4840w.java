package p289u3;

/* renamed from: u3.w */
/* loaded from: classes.dex */
public final class C4840w {

    /* renamed from: a */
    public final int f18193a;

    /* renamed from: b */
    public final float f18194b;

    public C4840w(int i10, float f10) {
        this.f18193a = i10;
        this.f18194b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4840w.class != obj.getClass()) {
            return false;
        }
        C4840w c4840w = (C4840w) obj;
        return this.f18193a == c4840w.f18193a && Float.compare(c4840w.f18194b, this.f18194b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f18193a) * 31) + Float.floatToIntBits(this.f18194b);
    }
}
