package p301v0;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: v0.r1 */
/* loaded from: classes.dex */
public final class C5080r1 {

    /* renamed from: a */
    public static final Logger f19052a = Logger.getLogger(C5080r1.class.getName());

    /* renamed from: b */
    public static final Unsafe f19053b = m20463B();

    /* renamed from: c */
    public static final Class<?> f19054c = C5036d.m19829b();

    /* renamed from: d */
    public static final boolean f19055d = m20491m(Long.TYPE);

    /* renamed from: e */
    public static final boolean f19056e = m20491m(Integer.TYPE);

    /* renamed from: f */
    public static final e f19057f = m20504z();

    /* renamed from: g */
    public static final boolean f19058g = m20478Q();

    /* renamed from: h */
    public static final boolean f19059h = m20477P();

    /* renamed from: i */
    public static final long f19060i;

    /* renamed from: j */
    public static final long f19061j;

    /* renamed from: k */
    public static final long f19062k;

    /* renamed from: l */
    public static final long f19063l;

    /* renamed from: m */
    public static final long f19064m;

    /* renamed from: n */
    public static final long f19065n;

    /* renamed from: o */
    public static final long f19066o;

    /* renamed from: p */
    public static final long f19067p;

    /* renamed from: q */
    public static final long f19068q;

    /* renamed from: r */
    public static final long f19069r;

    /* renamed from: s */
    public static final long f19070s;

    /* renamed from: t */
    public static final long f19071t;

    /* renamed from: u */
    public static final long f19072u;

    /* renamed from: v */
    public static final long f19073v;

    /* renamed from: w */
    public static final int f19074w;

    /* renamed from: x */
    public static final boolean f19075x;

    /* renamed from: v0.r1$a */
    /* loaded from: classes.dex */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: v0.r1$b */
    /* loaded from: classes.dex */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: c */
        public boolean mo20506c(Object obj, long j10) {
            return C5080r1.f19075x ? C5080r1.m20495q(obj, j10) : C5080r1.m20496r(obj, j10);
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: d */
        public byte mo20507d(Object obj, long j10) {
            return C5080r1.f19075x ? C5080r1.m20498t(obj, j10) : C5080r1.m20499u(obj, j10);
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: e */
        public double mo20508e(Object obj, long j10) {
            return Double.longBitsToDouble(m20517h(obj, j10));
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: f */
        public float mo20509f(Object obj, long j10) {
            return Float.intBitsToFloat(m20516g(obj, j10));
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: k */
        public void mo20510k(Object obj, long j10, boolean z10) {
            if (C5080r1.f19075x) {
                C5080r1.m20467F(obj, j10, z10);
            } else {
                C5080r1.m20468G(obj, j10, z10);
            }
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: l */
        public void mo20511l(Object obj, long j10, byte b10) {
            if (C5080r1.f19075x) {
                C5080r1.m20470I(obj, j10, b10);
            } else {
                C5080r1.m20471J(obj, j10, b10);
            }
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: m */
        public void mo20512m(Object obj, long j10, double d10) {
            m20521p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: n */
        public void mo20513n(Object obj, long j10, float f10) {
            m20520o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* renamed from: v0.r1$c */
    /* loaded from: classes.dex */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: c */
        public boolean mo20506c(Object obj, long j10) {
            return C5080r1.f19075x ? C5080r1.m20495q(obj, j10) : C5080r1.m20496r(obj, j10);
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: d */
        public byte mo20507d(Object obj, long j10) {
            return C5080r1.f19075x ? C5080r1.m20498t(obj, j10) : C5080r1.m20499u(obj, j10);
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: e */
        public double mo20508e(Object obj, long j10) {
            return Double.longBitsToDouble(m20517h(obj, j10));
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: f */
        public float mo20509f(Object obj, long j10) {
            return Float.intBitsToFloat(m20516g(obj, j10));
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: k */
        public void mo20510k(Object obj, long j10, boolean z10) {
            if (C5080r1.f19075x) {
                C5080r1.m20467F(obj, j10, z10);
            } else {
                C5080r1.m20468G(obj, j10, z10);
            }
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: l */
        public void mo20511l(Object obj, long j10, byte b10) {
            if (C5080r1.f19075x) {
                C5080r1.m20470I(obj, j10, b10);
            } else {
                C5080r1.m20471J(obj, j10, b10);
            }
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: m */
        public void mo20512m(Object obj, long j10, double d10) {
            m20521p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: n */
        public void mo20513n(Object obj, long j10, float f10) {
            m20520o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* renamed from: v0.r1$d */
    /* loaded from: classes.dex */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: c */
        public boolean mo20506c(Object obj, long j10) {
            return this.f19076a.getBoolean(obj, j10);
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: d */
        public byte mo20507d(Object obj, long j10) {
            return this.f19076a.getByte(obj, j10);
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: e */
        public double mo20508e(Object obj, long j10) {
            return this.f19076a.getDouble(obj, j10);
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: f */
        public float mo20509f(Object obj, long j10) {
            return this.f19076a.getFloat(obj, j10);
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: k */
        public void mo20510k(Object obj, long j10, boolean z10) {
            this.f19076a.putBoolean(obj, j10, z10);
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: l */
        public void mo20511l(Object obj, long j10, byte b10) {
            this.f19076a.putByte(obj, j10, b10);
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: m */
        public void mo20512m(Object obj, long j10, double d10) {
            this.f19076a.putDouble(obj, j10, d10);
        }

        @Override // p301v0.C5080r1.e
        /* renamed from: n */
        public void mo20513n(Object obj, long j10, float f10) {
            this.f19076a.putFloat(obj, j10, f10);
        }
    }

    /* renamed from: v0.r1$e */
    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a */
        public Unsafe f19076a;

        public e(Unsafe unsafe) {
            this.f19076a = unsafe;
        }

        /* renamed from: a */
        public final int m20514a(Class<?> cls) {
            return this.f19076a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m20515b(Class<?> cls) {
            return this.f19076a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo20506c(Object obj, long j10);

        /* renamed from: d */
        public abstract byte mo20507d(Object obj, long j10);

        /* renamed from: e */
        public abstract double mo20508e(Object obj, long j10);

        /* renamed from: f */
        public abstract float mo20509f(Object obj, long j10);

        /* renamed from: g */
        public final int m20516g(Object obj, long j10) {
            return this.f19076a.getInt(obj, j10);
        }

        /* renamed from: h */
        public final long m20517h(Object obj, long j10) {
            return this.f19076a.getLong(obj, j10);
        }

        /* renamed from: i */
        public final Object m20518i(Object obj, long j10) {
            return this.f19076a.getObject(obj, j10);
        }

        /* renamed from: j */
        public final long m20519j(Field field) {
            return this.f19076a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo20510k(Object obj, long j10, boolean z10);

        /* renamed from: l */
        public abstract void mo20511l(Object obj, long j10, byte b10);

        /* renamed from: m */
        public abstract void mo20512m(Object obj, long j10, double d10);

        /* renamed from: n */
        public abstract void mo20513n(Object obj, long j10, float f10);

        /* renamed from: o */
        public final void m20520o(Object obj, long j10, int i10) {
            this.f19076a.putInt(obj, j10, i10);
        }

        /* renamed from: p */
        public final void m20521p(Object obj, long j10, long j11) {
            this.f19076a.putLong(obj, j10, j11);
        }

        /* renamed from: q */
        public final void m20522q(Object obj, long j10, Object obj2) {
            this.f19076a.putObject(obj, j10, obj2);
        }
    }

    static {
        long m20488j = m20488j(byte[].class);
        f19060i = m20488j;
        f19061j = m20488j(boolean[].class);
        f19062k = m20489k(boolean[].class);
        f19063l = m20488j(int[].class);
        f19064m = m20489k(int[].class);
        f19065n = m20488j(long[].class);
        f19066o = m20489k(long[].class);
        f19067p = m20488j(float[].class);
        f19068q = m20489k(float[].class);
        f19069r = m20488j(double[].class);
        f19070s = m20489k(double[].class);
        f19071t = m20488j(Object[].class);
        f19072u = m20489k(Object[].class);
        f19073v = m20493o(m20490l());
        f19074w = (int) (7 & m20488j);
        f19075x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: A */
    public static Object m20462A(Object obj, long j10) {
        return f19057f.m20518i(obj, j10);
    }

    /* renamed from: B */
    public static Unsafe m20463B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static boolean m20464C() {
        return f19059h;
    }

    /* renamed from: D */
    public static boolean m20465D() {
        return f19058g;
    }

    /* renamed from: E */
    public static void m20466E(Object obj, long j10, boolean z10) {
        f19057f.mo20510k(obj, j10, z10);
    }

    /* renamed from: F */
    public static void m20467F(Object obj, long j10, boolean z10) {
        m20470I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: G */
    public static void m20468G(Object obj, long j10, boolean z10) {
        m20471J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* renamed from: H */
    public static void m20469H(byte[] bArr, long j10, byte b10) {
        f19057f.mo20511l(bArr, f19060i + j10, b10);
    }

    /* renamed from: I */
    public static void m20470I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int m20502x = m20502x(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        m20474M(obj, j11, ((255 & b10) << i10) | (m20502x & (~(255 << i10))));
    }

    /* renamed from: J */
    public static void m20471J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        m20474M(obj, j11, ((255 & b10) << i10) | (m20502x(obj, j11) & (~(255 << i10))));
    }

    /* renamed from: K */
    public static void m20472K(Object obj, long j10, double d10) {
        f19057f.mo20512m(obj, j10, d10);
    }

    /* renamed from: L */
    public static void m20473L(Object obj, long j10, float f10) {
        f19057f.mo20513n(obj, j10, f10);
    }

    /* renamed from: M */
    public static void m20474M(Object obj, long j10, int i10) {
        f19057f.m20520o(obj, j10, i10);
    }

    /* renamed from: N */
    public static void m20475N(Object obj, long j10, long j11) {
        f19057f.m20521p(obj, j10, j11);
    }

    /* renamed from: O */
    public static void m20476O(Object obj, long j10, Object obj2) {
        f19057f.m20522q(obj, j10, obj2);
    }

    /* renamed from: P */
    public static boolean m20477P() {
        Unsafe unsafe = f19053b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (C5036d.m19830c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            f19052a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: Q */
    public static boolean m20478Q() {
        Unsafe unsafe = f19053b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m20490l() == null) {
                return false;
            }
            if (C5036d.m19830c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            f19052a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: i */
    public static <T> T m20487i(Class<T> cls) {
        try {
            return (T) f19053b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: j */
    public static int m20488j(Class<?> cls) {
        if (f19059h) {
            return f19057f.m20514a(cls);
        }
        return -1;
    }

    /* renamed from: k */
    public static int m20489k(Class<?> cls) {
        if (f19059h) {
            return f19057f.m20515b(cls);
        }
        return -1;
    }

    /* renamed from: l */
    public static Field m20490l() {
        Field m20492n;
        if (C5036d.m19830c() && (m20492n = m20492n(Buffer.class, "effectiveDirectAddress")) != null) {
            return m20492n;
        }
        Field m20492n2 = m20492n(Buffer.class, "address");
        if (m20492n2 == null || m20492n2.getType() != Long.TYPE) {
            return null;
        }
        return m20492n2;
    }

    /* renamed from: m */
    public static boolean m20491m(Class<?> cls) {
        if (!C5036d.m19830c()) {
            return false;
        }
        try {
            Class<?> cls2 = f19054c;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: n */
    public static Field m20492n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: o */
    public static long m20493o(Field field) {
        e eVar;
        if (field == null || (eVar = f19057f) == null) {
            return -1L;
        }
        return eVar.m20519j(field);
    }

    /* renamed from: p */
    public static boolean m20494p(Object obj, long j10) {
        return f19057f.mo20506c(obj, j10);
    }

    /* renamed from: q */
    public static boolean m20495q(Object obj, long j10) {
        return m20498t(obj, j10) != 0;
    }

    /* renamed from: r */
    public static boolean m20496r(Object obj, long j10) {
        return m20499u(obj, j10) != 0;
    }

    /* renamed from: s */
    public static byte m20497s(byte[] bArr, long j10) {
        return f19057f.mo20507d(bArr, f19060i + j10);
    }

    /* renamed from: t */
    public static byte m20498t(Object obj, long j10) {
        return (byte) ((m20502x(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* renamed from: u */
    public static byte m20499u(Object obj, long j10) {
        return (byte) ((m20502x(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* renamed from: v */
    public static double m20500v(Object obj, long j10) {
        return f19057f.mo20508e(obj, j10);
    }

    /* renamed from: w */
    public static float m20501w(Object obj, long j10) {
        return f19057f.mo20509f(obj, j10);
    }

    /* renamed from: x */
    public static int m20502x(Object obj, long j10) {
        return f19057f.m20516g(obj, j10);
    }

    /* renamed from: y */
    public static long m20503y(Object obj, long j10) {
        return f19057f.m20517h(obj, j10);
    }

    /* renamed from: z */
    public static e m20504z() {
        Unsafe unsafe = f19053b;
        if (unsafe == null) {
            return null;
        }
        if (!C5036d.m19830c()) {
            return new d(unsafe);
        }
        if (f19055d) {
            return new c(unsafe);
        }
        if (f19056e) {
            return new b(unsafe);
        }
        return null;
    }
}
