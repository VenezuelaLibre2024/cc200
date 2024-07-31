package p272t0;

import java.util.List;
import p301v0.AbstractC5027a;
import p301v0.AbstractC5096y;
import p301v0.C5028a0;
import p301v0.InterfaceC5082s0;
import p301v0.InterfaceC5099z0;

/* renamed from: t0.g */
/* loaded from: classes.dex */
public final class C4607g extends AbstractC5096y<C4607g, a> implements InterfaceC5082s0 {
    private static final C4607g DEFAULT_INSTANCE;
    private static volatile InterfaceC5099z0<C4607g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C5028a0.i<String> strings_ = AbstractC5096y.m20699x();

    /* renamed from: t0.g$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC5096y.a<C4607g, a> implements InterfaceC5082s0 {
        public a() {
            super(C4607g.DEFAULT_INSTANCE);
        }

        public /* synthetic */ a(C4605e c4605e) {
            this();
        }

        /* renamed from: y */
        public a m18153y(Iterable<String> iterable) {
            m20712t();
            ((C4607g) this.f19220i).m18150N(iterable);
            return this;
        }
    }

    static {
        C4607g c4607g = new C4607g();
        DEFAULT_INSTANCE = c4607g;
        AbstractC5096y.m20697J(C4607g.class, c4607g);
    }

    /* renamed from: P */
    public static C4607g m18148P() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: R */
    public static a m18149R() {
        return DEFAULT_INSTANCE.m20705t();
    }

    /* renamed from: N */
    public final void m18150N(Iterable<String> iterable) {
        m18151O();
        AbstractC5027a.m19775d(iterable, this.strings_);
    }

    /* renamed from: O */
    public final void m18151O() {
        if (this.strings_.mo19802H()) {
            return;
        }
        this.strings_ = AbstractC5096y.m20693D(this.strings_);
    }

    /* renamed from: Q */
    public List<String> m18152Q() {
        return this.strings_;
    }

    @Override // p301v0.AbstractC5096y
    /* renamed from: w */
    public final Object mo18144w(AbstractC5096y.f fVar, Object obj, Object obj2) {
        C4605e c4605e = null;
        switch (C4605e.f17262a[fVar.ordinal()]) {
            case 1:
                return new C4607g();
            case 2:
                return new a(c4605e);
            case 3:
                return AbstractC5096y.m20694G(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC5099z0<C4607g> interfaceC5099z0 = PARSER;
                if (interfaceC5099z0 == null) {
                    synchronized (C4607g.class) {
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
