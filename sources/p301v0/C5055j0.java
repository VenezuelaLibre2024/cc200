package p301v0;

/* renamed from: v0.j0 */
/* loaded from: classes.dex */
public final class C5055j0 implements InterfaceC5050h1 {

    /* renamed from: b */
    public static final InterfaceC5076q0 f18971b = new a();

    /* renamed from: a */
    public final InterfaceC5076q0 f18972a;

    /* renamed from: v0.j0$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC5076q0 {
        @Override // p301v0.InterfaceC5076q0
        /* renamed from: a */
        public InterfaceC5073p0 mo20134a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // p301v0.InterfaceC5076q0
        /* renamed from: b */
        public boolean mo20135b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: v0.j0$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC5076q0 {

        /* renamed from: a */
        public InterfaceC5076q0[] f18973a;

        public b(InterfaceC5076q0... interfaceC5076q0Arr) {
            this.f18973a = interfaceC5076q0Arr;
        }

        @Override // p301v0.InterfaceC5076q0
        /* renamed from: a */
        public InterfaceC5073p0 mo20134a(Class<?> cls) {
            for (InterfaceC5076q0 interfaceC5076q0 : this.f18973a) {
                if (interfaceC5076q0.mo20135b(cls)) {
                    return interfaceC5076q0.mo20134a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // p301v0.InterfaceC5076q0
        /* renamed from: b */
        public boolean mo20135b(Class<?> cls) {
            for (InterfaceC5076q0 interfaceC5076q0 : this.f18973a) {
                if (interfaceC5076q0.mo20135b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C5055j0() {
        this(m20130b());
    }

    public C5055j0(InterfaceC5076q0 interfaceC5076q0) {
        this.f18972a = (InterfaceC5076q0) C5028a0.m19790b(interfaceC5076q0, "messageInfoFactory");
    }

    /* renamed from: b */
    public static InterfaceC5076q0 m20130b() {
        return new b(C5094x.m20690c(), m20131c());
    }

    /* renamed from: c */
    public static InterfaceC5076q0 m20131c() {
        try {
            return (InterfaceC5076q0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f18971b;
        }
    }

    /* renamed from: d */
    public static boolean m20132d(InterfaceC5073p0 interfaceC5073p0) {
        return interfaceC5073p0.mo19912c() == EnumC5032b1.PROTO2;
    }

    /* renamed from: e */
    public static <T> InterfaceC5047g1<T> m20133e(Class<T> cls, InterfaceC5073p0 interfaceC5073p0) {
        return AbstractC5096y.class.isAssignableFrom(cls) ? m20132d(interfaceC5073p0) ? C5088u0.m20617N(cls, interfaceC5073p0, C5097y0.m20727b(), AbstractC5049h0.m19980b(), C5053i1.m20076M(), C5081s.m20524b(), C5070o0.m20400b()) : C5088u0.m20617N(cls, interfaceC5073p0, C5097y0.m20727b(), AbstractC5049h0.m19980b(), C5053i1.m20076M(), null, C5070o0.m20400b()) : m20132d(interfaceC5073p0) ? C5088u0.m20617N(cls, interfaceC5073p0, C5097y0.m20726a(), AbstractC5049h0.m19979a(), C5053i1.m20071H(), C5081s.m20523a(), C5070o0.m20399a()) : C5088u0.m20617N(cls, interfaceC5073p0, C5097y0.m20726a(), AbstractC5049h0.m19979a(), C5053i1.m20072I(), null, C5070o0.m20399a());
    }

    @Override // p301v0.InterfaceC5050h1
    /* renamed from: a */
    public <T> InterfaceC5047g1<T> mo19987a(Class<T> cls) {
        AbstractC5068n1<?, ?> m20071H;
        AbstractC5075q<?> m20523a;
        C5053i1.m20073J(cls);
        InterfaceC5073p0 mo20134a = this.f18972a.mo20134a(cls);
        if (!mo20134a.mo19910a()) {
            return m20133e(cls, mo20134a);
        }
        if (AbstractC5096y.class.isAssignableFrom(cls)) {
            m20071H = C5053i1.m20076M();
            m20523a = C5081s.m20524b();
        } else {
            m20071H = C5053i1.m20071H();
            m20523a = C5081s.m20523a();
        }
        return C5091v0.m20672l(m20071H, m20523a, mo20134a.mo19911b());
    }
}
