package p066e8;

/* renamed from: e8.y */
/* loaded from: classes.dex */
public enum EnumC1758y {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: h */
    public final int f6499h;

    EnumC1758y(int i10) {
        this.f6499h = i10;
    }

    /* renamed from: b */
    public static EnumC1758y m7045b(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    /* renamed from: c */
    public int m7046c() {
        return this.f6499h;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f6499h);
    }
}
