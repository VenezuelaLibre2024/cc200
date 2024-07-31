package p272t0;

import java.util.Objects;
import p272t0.C4607g;
import p301v0.AbstractC5096y;
import p301v0.InterfaceC5082s0;
import p301v0.InterfaceC5099z0;

/* renamed from: t0.h */
/* loaded from: classes.dex */
public final class C4608h extends AbstractC5096y<C4608h, a> implements InterfaceC5082s0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final C4608h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC5099z0<C4608h> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    /* renamed from: t0.h$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC5096y.a<C4608h, a> implements InterfaceC5082s0 {
        public a() {
            super(C4608h.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(C4605e c4605e) {
            this();
        }

        /* renamed from: A */
        public a m18179A(float f10) {
            m20712t();
            ((C4608h) this.f19220i).m18174f0(f10);
            return this;
        }

        /* renamed from: B */
        public a m18180B(int i10) {
            m20712t();
            ((C4608h) this.f19220i).m18175g0(i10);
            return this;
        }

        /* renamed from: C */
        public a m18181C(long j10) {
            m20712t();
            ((C4608h) this.f19220i).m18176h0(j10);
            return this;
        }

        /* renamed from: D */
        public a m18182D(String str) {
            m20712t();
            ((C4608h) this.f19220i).m18177i0(str);
            return this;
        }

        /* renamed from: F */
        public a m18183F(C4607g.a aVar) {
            m20712t();
            ((C4608h) this.f19220i).m18178j0(aVar);
            return this;
        }

        /* renamed from: y */
        public a m18184y(boolean z10) {
            m20712t();
            ((C4608h) this.f19220i).m18172d0(z10);
            return this;
        }

        /* renamed from: z */
        public a m18185z(double d10) {
            m20712t();
            ((C4608h) this.f19220i).m18173e0(d10);
            return this;
        }
    }

    /* renamed from: t0.h$b */
    /* loaded from: classes.dex */
    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);


        /* renamed from: h */
        public final int f17273h;

        b(int i10) {
            this.f17273h = i10;
        }

        /* renamed from: b */
        public static b m18186b(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }
    }

    static {
        C4608h c4608h = new C4608h();
        DEFAULT_INSTANCE = c4608h;
        AbstractC5096y.m20697J(C4608h.class, c4608h);
    }

    /* renamed from: U */
    public static C4608h m18162U() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: c0 */
    public static a m18163c0() {
        return DEFAULT_INSTANCE.m20705t();
    }

    /* renamed from: T */
    public boolean m18164T() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* renamed from: V */
    public double m18165V() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    /* renamed from: W */
    public float m18166W() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* renamed from: X */
    public int m18167X() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* renamed from: Y */
    public long m18168Y() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* renamed from: Z */
    public String m18169Z() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* renamed from: a0 */
    public C4607g m18170a0() {
        return this.valueCase_ == 6 ? (C4607g) this.value_ : C4607g.m18148P();
    }

    /* renamed from: b0 */
    public b m18171b0() {
        return b.m18186b(this.valueCase_);
    }

    /* renamed from: d0 */
    public final void m18172d0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    /* renamed from: e0 */
    public final void m18173e0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* renamed from: f0 */
    public final void m18174f0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* renamed from: g0 */
    public final void m18175g0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* renamed from: h0 */
    public final void m18176h0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* renamed from: i0 */
    public final void m18177i0(String str) {
        Objects.requireNonNull(str);
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* renamed from: j0 */
    public final void m18178j0(C4607g.a aVar) {
        this.value_ = aVar.mo20461a();
        this.valueCase_ = 6;
    }

    @Override // p301v0.AbstractC5096y
    /* renamed from: w */
    public final Object mo18144w(AbstractC5096y.f fVar, Object obj, Object obj2) {
        switch (C4605e.f17262a[fVar.ordinal()]) {
            case 1:
                return new C4608h();
            case 2:
                return new a(null);
            case 3:
                return AbstractC5096y.m20694G(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C4607g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5099z0<C4608h> interfaceC5099z0 = PARSER;
                if (interfaceC5099z0 == null) {
                    synchronized (C4608h.class) {
                        interfaceC5099z0 = PARSER;
                        if (interfaceC5099z0 == null) {
                            interfaceC5099z0 = new AbstractC5096y.b<>(DEFAULT_INSTANCE);
                            PARSER = interfaceC5099z0;
                        }
                    }
                }
                return interfaceC5099z0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
