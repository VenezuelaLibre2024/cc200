package p222p5;

/* renamed from: p5.d0 */
/* loaded from: classes.dex */
public final class C4021d0 {

    /* renamed from: c */
    public static final C4021d0 f14459c = new C4021d0(-1, -1);

    /* renamed from: d */
    public static final C4021d0 f14460d = new C4021d0(0, 0);

    /* renamed from: a */
    public final int f14461a;

    /* renamed from: b */
    public final int f14462b;

    public C4021d0(int i10, int i11) {
        C4014a.m15195a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f14461a = i10;
        this.f14462b = i11;
    }

    /* renamed from: a */
    public int m15275a() {
        return this.f14462b;
    }

    /* renamed from: b */
    public int m15276b() {
        return this.f14461a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4021d0)) {
            return false;
        }
        C4021d0 c4021d0 = (C4021d0) obj;
        return this.f14461a == c4021d0.f14461a && this.f14462b == c4021d0.f14462b;
    }

    public int hashCode() {
        int i10 = this.f14462b;
        int i11 = this.f14461a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f14461a + "x" + this.f14462b;
    }
}
