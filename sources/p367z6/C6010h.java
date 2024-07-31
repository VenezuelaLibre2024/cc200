package p367z6;

/* renamed from: z6.h */
/* loaded from: classes.dex */
public final class C6010h extends C6004e {

    /* renamed from: l */
    public final C5998b f22416l;

    /* renamed from: m */
    public final float f22417m;

    public C6010h(C5998b c5998b) {
        this(c5998b, 10.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6010h(p367z6.C5998b r3, float r4) {
        /*
            r2 = this;
            java.lang.String r0 = "bitmapDescriptor must not be null"
            java.lang.Object r0 = p108h6.C2394s.m9620m(r3, r0)
            z6.b r0 = (p367z6.C5998b) r0
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L15
            r2.<init>(r0, r4)
            r2.f22416l = r3
            r2.f22417m = r4
            return
        L15:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "refWidth must be positive"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p367z6.C6010h.<init>(z6.b, float):void");
    }

    @Override // p367z6.C6004e
    public String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.f22416l) + " refWidth=" + this.f22417m + "]";
    }
}
