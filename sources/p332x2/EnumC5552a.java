package p332x2;

/* renamed from: x2.a */
/* loaded from: classes.dex */
public enum EnumC5552a {
    denied,
    deniedForever,
    whileInUse,
    always;

    /* renamed from: x2.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20823a;

        static {
            int[] iArr = new int[EnumC5552a.values().length];
            f20823a = iArr;
            try {
                iArr[EnumC5552a.denied.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20823a[EnumC5552a.deniedForever.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20823a[EnumC5552a.whileInUse.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20823a[EnumC5552a.always.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: c */
    public int m22358c() {
        int i10 = a.f20823a[ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new IndexOutOfBoundsException();
    }
}
