package p301v0;

/* renamed from: v0.t1 */
/* loaded from: classes.dex */
public final class C5086t1 {

    /* renamed from: a */
    public static final int f19080a = m20577c(1, 3);

    /* renamed from: b */
    public static final int f19081b = m20577c(1, 4);

    /* renamed from: c */
    public static final int f19082c = m20577c(2, 0);

    /* renamed from: d */
    public static final int f19083d = m20577c(3, 2);

    /* renamed from: v0.t1$b */
    /* loaded from: classes.dex */
    public static class b extends Enum<b> {

        /* renamed from: A */
        public static final b f19084A;

        /* renamed from: B */
        public static final /* synthetic */ b[] f19085B;

        /* renamed from: j */
        public static final b f19086j;

        /* renamed from: k */
        public static final b f19087k;

        /* renamed from: l */
        public static final b f19088l;

        /* renamed from: m */
        public static final b f19089m;

        /* renamed from: n */
        public static final b f19090n;

        /* renamed from: o */
        public static final b f19091o;

        /* renamed from: p */
        public static final b f19092p;

        /* renamed from: q */
        public static final b f19093q;

        /* renamed from: r */
        public static final b f19094r;

        /* renamed from: s */
        public static final b f19095s;

        /* renamed from: t */
        public static final b f19096t;

        /* renamed from: u */
        public static final b f19097u;

        /* renamed from: v */
        public static final b f19098v;

        /* renamed from: w */
        public static final b f19099w;

        /* renamed from: x */
        public static final b f19100x;

        /* renamed from: y */
        public static final b f19101y;

        /* renamed from: z */
        public static final b f19102z;

        /* renamed from: h */
        public final c f19103h;

        /* renamed from: i */
        public final int f19104i;

        /* renamed from: v0.t1$b$a */
        /* loaded from: classes.dex */
        public enum a extends b {
            public a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: v0.t1$b$b */
        /* loaded from: classes.dex */
        public enum C6211b extends b {
            public C6211b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: v0.t1$b$c */
        /* loaded from: classes.dex */
        public enum c extends b {
            public c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: v0.t1$b$d */
        /* loaded from: classes.dex */
        public enum d extends b {
            public d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f19086j = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f19087k = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f19088l = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f19089m = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f19090n = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f19091o = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f19092p = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f19093q = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f19094r = aVar;
            c cVar3 = c.MESSAGE;
            C6211b c6211b = new C6211b("GROUP", 9, cVar3, 3);
            f19095s = c6211b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f19096t = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f19097u = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f19098v = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f19099w = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f19100x = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f19101y = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f19102z = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f19084A = bVar14;
            f19085B = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c6211b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.f19103h = cVar;
            this.f19104i = i11;
        }

        public /* synthetic */ b(String str, int i10, c cVar, int i11, a aVar) {
            this(str, i10, cVar, i11);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f19085B.clone();
        }

        /* renamed from: b */
        public c m20578b() {
            return this.f19103h;
        }

        /* renamed from: c */
        public int m20579c() {
            return this.f19104i;
        }
    }

    /* renamed from: v0.t1$c */
    /* loaded from: classes.dex */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC5048h.f18921i),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: h */
        public final Object f19115h;

        c(Object obj) {
            this.f19115h = obj;
        }
    }

    /* renamed from: a */
    public static int m20575a(int i10) {
        return i10 >>> 3;
    }

    /* renamed from: b */
    public static int m20576b(int i10) {
        return i10 & 7;
    }

    /* renamed from: c */
    public static int m20577c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
