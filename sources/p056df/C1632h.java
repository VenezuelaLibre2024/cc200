package p056df;

import td.C4747g;

/* renamed from: df.h */
/* loaded from: classes2.dex */
public final class C1632h {

    /* renamed from: a */
    public final float f6036a;

    /* renamed from: b */
    public final float f6037b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1632h() {
        /*
            r3 = this;
            r0 = 0
            r1 = 3
            r2 = 0
            r3.<init>(r0, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p056df.C1632h.<init>():void");
    }

    public C1632h(float f10, float f11) {
        this.f6036a = f10;
        this.f6037b = f11;
    }

    public /* synthetic */ C1632h(float f10, float f11, int i10, C4747g c4747g) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1.0f : f11);
    }

    /* renamed from: a */
    public final float m6504a() {
        return this.f6036a;
    }

    /* renamed from: b */
    public final float m6505b() {
        return this.f6037b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1632h)) {
            return false;
        }
        C1632h c1632h = (C1632h) obj;
        return Float.compare(this.f6036a, c1632h.f6036a) == 0 && Float.compare(this.f6037b, c1632h.f6037b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f6036a) * 31) + Float.hashCode(this.f6037b);
    }

    public String toString() {
        return "VolumeInfo(left=" + this.f6036a + ", right=" + this.f6037b + ')';
    }
}
