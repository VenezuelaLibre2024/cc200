package p084fb;

import p211oa.C3965b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fb.c */
/* loaded from: classes.dex */
public abstract class EnumC1890c {

    /* renamed from: h */
    public static final EnumC1890c f7135h;

    /* renamed from: i */
    public static final EnumC1890c f7136i;

    /* renamed from: j */
    public static final EnumC1890c f7137j;

    /* renamed from: k */
    public static final EnumC1890c f7138k;

    /* renamed from: l */
    public static final EnumC1890c f7139l;

    /* renamed from: m */
    public static final EnumC1890c f7140m;

    /* renamed from: n */
    public static final EnumC1890c f7141n;

    /* renamed from: o */
    public static final EnumC1890c f7142o;

    /* renamed from: p */
    public static final /* synthetic */ EnumC1890c[] f7143p;

    /* renamed from: fb.c$a */
    /* loaded from: classes.dex */
    public enum a extends EnumC1890c {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p084fb.EnumC1890c
        /* renamed from: b */
        public boolean mo7729b(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        f7135h = aVar;
        EnumC1890c enumC1890c = new EnumC1890c("DATA_MASK_001", 1) { // from class: fb.c.b
            {
                a aVar2 = null;
            }

            @Override // p084fb.EnumC1890c
            /* renamed from: b */
            public boolean mo7729b(int i10, int i11) {
                return (i10 & 1) == 0;
            }
        };
        f7136i = enumC1890c;
        EnumC1890c enumC1890c2 = new EnumC1890c("DATA_MASK_010", 2) { // from class: fb.c.c
            {
                a aVar2 = null;
            }

            @Override // p084fb.EnumC1890c
            /* renamed from: b */
            public boolean mo7729b(int i10, int i11) {
                return i11 % 3 == 0;
            }
        };
        f7137j = enumC1890c2;
        EnumC1890c enumC1890c3 = new EnumC1890c("DATA_MASK_011", 3) { // from class: fb.c.d
            {
                a aVar2 = null;
            }

            @Override // p084fb.EnumC1890c
            /* renamed from: b */
            public boolean mo7729b(int i10, int i11) {
                return (i10 + i11) % 3 == 0;
            }
        };
        f7138k = enumC1890c3;
        EnumC1890c enumC1890c4 = new EnumC1890c("DATA_MASK_100", 4) { // from class: fb.c.e
            {
                a aVar2 = null;
            }

            @Override // p084fb.EnumC1890c
            /* renamed from: b */
            public boolean mo7729b(int i10, int i11) {
                return (((i10 / 2) + (i11 / 3)) & 1) == 0;
            }
        };
        f7139l = enumC1890c4;
        EnumC1890c enumC1890c5 = new EnumC1890c("DATA_MASK_101", 5) { // from class: fb.c.f
            {
                a aVar2 = null;
            }

            @Override // p084fb.EnumC1890c
            /* renamed from: b */
            public boolean mo7729b(int i10, int i11) {
                return (i10 * i11) % 6 == 0;
            }
        };
        f7140m = enumC1890c5;
        EnumC1890c enumC1890c6 = new EnumC1890c("DATA_MASK_110", 6) { // from class: fb.c.g
            {
                a aVar2 = null;
            }

            @Override // p084fb.EnumC1890c
            /* renamed from: b */
            public boolean mo7729b(int i10, int i11) {
                return (i10 * i11) % 6 < 3;
            }
        };
        f7141n = enumC1890c6;
        EnumC1890c enumC1890c7 = new EnumC1890c("DATA_MASK_111", 7) { // from class: fb.c.h
            {
                a aVar2 = null;
            }

            @Override // p084fb.EnumC1890c
            /* renamed from: b */
            public boolean mo7729b(int i10, int i11) {
                return (((i10 + i11) + ((i10 * i11) % 3)) & 1) == 0;
            }
        };
        f7142o = enumC1890c7;
        f7143p = new EnumC1890c[]{aVar, enumC1890c, enumC1890c2, enumC1890c3, enumC1890c4, enumC1890c5, enumC1890c6, enumC1890c7};
    }

    public EnumC1890c(String str, int i10) {
    }

    public /* synthetic */ EnumC1890c(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static EnumC1890c valueOf(String str) {
        return (EnumC1890c) Enum.valueOf(EnumC1890c.class, str);
    }

    public static EnumC1890c[] values() {
        return (EnumC1890c[]) f7143p.clone();
    }

    /* renamed from: b */
    public abstract boolean mo7729b(int i10, int i11);

    /* renamed from: c */
    public final void m7730c(C3965b c3965b, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (mo7729b(i11, i12)) {
                    c3965b.m15034f(i12, i11);
                }
            }
        }
    }
}
