package p084fb;

/* renamed from: fb.f */
/* loaded from: classes.dex */
public enum EnumC1893f {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* renamed from: m */
    public static final EnumC1893f[] f7151m;

    /* renamed from: h */
    public final int f7153h;

    static {
        EnumC1893f enumC1893f = L;
        EnumC1893f enumC1893f2 = M;
        EnumC1893f enumC1893f3 = Q;
        f7151m = new EnumC1893f[]{enumC1893f2, enumC1893f, H, enumC1893f3};
    }

    EnumC1893f(int i10) {
        this.f7153h = i10;
    }

    /* renamed from: b */
    public static EnumC1893f m7742b(int i10) {
        if (i10 >= 0) {
            EnumC1893f[] enumC1893fArr = f7151m;
            if (i10 < enumC1893fArr.length) {
                return enumC1893fArr[i10];
            }
        }
        throw new IllegalArgumentException();
    }
}
