package p311vb;

/* renamed from: vb.c */
/* loaded from: classes.dex */
public enum EnumC5159c {
    ABSENT,
    REMOVING,
    PASS_THROUGH,
    COMPRESSING;

    /* renamed from: vb.c$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19447a;

        static {
            int[] iArr = new int[EnumC5159c.values().length];
            f19447a = iArr;
            try {
                iArr[EnumC5159c.PASS_THROUGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19447a[EnumC5159c.COMPRESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19447a[EnumC5159c.REMOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19447a[EnumC5159c.ABSENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: b */
    public boolean m20886b() {
        int i10 = a.f19447a[ordinal()];
        if (i10 == 1 || i10 == 2) {
            return true;
        }
        if (i10 == 3 || i10 == 4) {
            return false;
        }
        throw new RuntimeException("Unexpected track status: " + this);
    }
}
