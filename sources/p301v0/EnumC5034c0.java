package p301v0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'l' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: v0.c0 */
/* loaded from: classes.dex */
public final class EnumC5034c0 {

    /* renamed from: k */
    public static final EnumC5034c0 f18873k;

    /* renamed from: l */
    public static final EnumC5034c0 f18874l;

    /* renamed from: m */
    public static final EnumC5034c0 f18875m;

    /* renamed from: n */
    public static final EnumC5034c0 f18876n;

    /* renamed from: o */
    public static final EnumC5034c0 f18877o;

    /* renamed from: p */
    public static final EnumC5034c0 f18878p;

    /* renamed from: q */
    public static final EnumC5034c0 f18879q;

    /* renamed from: r */
    public static final EnumC5034c0 f18880r;

    /* renamed from: s */
    public static final EnumC5034c0 f18881s;

    /* renamed from: t */
    public static final EnumC5034c0 f18882t;

    /* renamed from: u */
    public static final /* synthetic */ EnumC5034c0[] f18883u;

    /* renamed from: h */
    public final Class<?> f18884h;

    /* renamed from: i */
    public final Class<?> f18885i;

    /* renamed from: j */
    public final Object f18886j;

    static {
        EnumC5034c0 enumC5034c0 = new EnumC5034c0("VOID", 0, Void.class, Void.class, null);
        f18873k = enumC5034c0;
        Class cls = Integer.TYPE;
        EnumC5034c0 enumC5034c02 = new EnumC5034c0("INT", 1, cls, Integer.class, 0);
        f18874l = enumC5034c02;
        EnumC5034c0 enumC5034c03 = new EnumC5034c0("LONG", 2, Long.TYPE, Long.class, 0L);
        f18875m = enumC5034c03;
        EnumC5034c0 enumC5034c04 = new EnumC5034c0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f18876n = enumC5034c04;
        EnumC5034c0 enumC5034c05 = new EnumC5034c0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f18877o = enumC5034c05;
        EnumC5034c0 enumC5034c06 = new EnumC5034c0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f18878p = enumC5034c06;
        EnumC5034c0 enumC5034c07 = new EnumC5034c0("STRING", 6, String.class, String.class, "");
        f18879q = enumC5034c07;
        EnumC5034c0 enumC5034c08 = new EnumC5034c0("BYTE_STRING", 7, AbstractC5048h.class, AbstractC5048h.class, AbstractC5048h.f18921i);
        f18880r = enumC5034c08;
        EnumC5034c0 enumC5034c09 = new EnumC5034c0("ENUM", 8, cls, Integer.class, null);
        f18881s = enumC5034c09;
        EnumC5034c0 enumC5034c010 = new EnumC5034c0("MESSAGE", 9, Object.class, Object.class, null);
        f18882t = enumC5034c010;
        f18883u = new EnumC5034c0[]{enumC5034c0, enumC5034c02, enumC5034c03, enumC5034c04, enumC5034c05, enumC5034c06, enumC5034c07, enumC5034c08, enumC5034c09, enumC5034c010};
    }

    public EnumC5034c0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f18884h = cls;
        this.f18885i = cls2;
        this.f18886j = obj;
    }

    public static EnumC5034c0 valueOf(String str) {
        return (EnumC5034c0) Enum.valueOf(EnumC5034c0.class, str);
    }

    public static EnumC5034c0[] values() {
        return (EnumC5034c0[]) f18883u.clone();
    }

    /* renamed from: b */
    public Class<?> m19822b() {
        return this.f18885i;
    }
}
