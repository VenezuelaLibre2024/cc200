package p272t0;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import p301v0.AbstractC5096y;
import p301v0.C5058k0;
import p301v0.C5061l0;
import p301v0.C5086t1;
import p301v0.InterfaceC5082s0;
import p301v0.InterfaceC5099z0;

/* renamed from: t0.f */
/* loaded from: classes.dex */
public final class C4606f extends AbstractC5096y<C4606f, a> implements InterfaceC5082s0 {
    private static final C4606f DEFAULT_INSTANCE;
    private static volatile InterfaceC5099z0<C4606f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C5061l0<String, C4608h> preferences_ = C5061l0.m20341f();

    /* renamed from: t0.f$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC5096y.a<C4606f, a> implements InterfaceC5082s0 {
        public a() {
            super(C4606f.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(C4605e c4605e) {
            this();
        }

        /* renamed from: y */
        public a m18145y(String str, C4608h c4608h) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(c4608h);
            m20712t();
            ((C4606f) this.f19220i).m18140N().put(str, c4608h);
            return this;
        }
    }

    /* renamed from: t0.f$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public static final C5058k0<String, C4608h> f17263a = C5058k0.m20284d(C5086t1.b.f19094r, "", C5086t1.b.f19096t, C4608h.m18162U());
    }

    static {
        C4606f c4606f = new C4606f();
        DEFAULT_INSTANCE = c4606f;
        AbstractC5096y.m20697J(C4606f.class, c4606f);
    }

    /* renamed from: R */
    public static a m18138R() {
        return DEFAULT_INSTANCE.m20705t();
    }

    /* renamed from: S */
    public static C4606f m18139S(InputStream inputStream) {
        return (C4606f) AbstractC5096y.m20695H(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: N */
    public final Map<String, C4608h> m18140N() {
        return m18142P();
    }

    /* renamed from: O */
    public Map<String, C4608h> m18141O() {
        return Collections.unmodifiableMap(m18143Q());
    }

    /* renamed from: P */
    public final C5061l0<String, C4608h> m18142P() {
        if (!this.preferences_.m20345k()) {
            this.preferences_ = this.preferences_.m20348n();
        }
        return this.preferences_;
    }

    /* renamed from: Q */
    public final C5061l0<String, C4608h> m18143Q() {
        return this.preferences_;
    }

    @Override // p301v0.AbstractC5096y
    /* renamed from: w */
    public final Object mo18144w(AbstractC5096y.f fVar, Object obj, Object obj2) {
        C4605e c4605e = null;
        switch (C4605e.f17262a[fVar.ordinal()]) {
            case 1:
                return new C4606f();
            case 2:
                return new a(c4605e);
            case 3:
                return AbstractC5096y.m20694G(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f17263a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5099z0<C4606f> interfaceC5099z0 = PARSER;
                if (interfaceC5099z0 == null) {
                    synchronized (C4606f.class) {
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
