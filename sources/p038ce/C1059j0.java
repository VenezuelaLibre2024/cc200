package p038ce;

import p146jd.C3285h;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3282e;
import p146jd.InterfaceC3284g;
import p173ld.InterfaceC3471e;
import sd.InterfaceC4584p;
import td.AbstractC4754n;
import td.C4763w;

/* renamed from: ce.j0 */
/* loaded from: classes2.dex */
public final class C1059j0 {

    /* renamed from: ce.j0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4584p<InterfaceC3284g, InterfaceC3284g.b, InterfaceC3284g> {

        /* renamed from: h */
        public static final a f4013h = new a();

        public a() {
            super(2);
        }

        @Override // sd.InterfaceC4584p
        /* renamed from: a */
        public final InterfaceC3284g invoke(InterfaceC3284g interfaceC3284g, InterfaceC3284g.b bVar) {
            return bVar instanceof InterfaceC1049h0 ? interfaceC3284g.mo4369e0(((InterfaceC1049h0) bVar).m4343g0()) : interfaceC3284g.mo4369e0(bVar);
        }
    }

    /* renamed from: ce.j0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC4754n implements InterfaceC4584p<InterfaceC3284g, InterfaceC3284g.b, InterfaceC3284g> {

        /* renamed from: h */
        public final /* synthetic */ C4763w<InterfaceC3284g> f4014h;

        /* renamed from: i */
        public final /* synthetic */ boolean f4015i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4763w<InterfaceC3284g> c4763w, boolean z10) {
            super(2);
            this.f4014h = c4763w;
            this.f4015i = z10;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [jd.g, T] */
        @Override // sd.InterfaceC4584p
        /* renamed from: a */
        public final InterfaceC3284g invoke(InterfaceC3284g interfaceC3284g, InterfaceC3284g.b bVar) {
            if (!(bVar instanceof InterfaceC1049h0)) {
                return interfaceC3284g.mo4369e0(bVar);
            }
            InterfaceC3284g.b mo4368d = this.f4014h.f17731h.mo4368d(bVar.getKey());
            if (mo4368d != null) {
                C4763w<InterfaceC3284g> c4763w = this.f4014h;
                c4763w.f17731h = c4763w.f17731h.mo4367b0(bVar.getKey());
                return interfaceC3284g.mo4369e0(((InterfaceC1049h0) bVar).m4342W(mo4368d));
            }
            InterfaceC1049h0 interfaceC1049h0 = (InterfaceC1049h0) bVar;
            if (this.f4015i) {
                interfaceC1049h0 = interfaceC1049h0.m4343g0();
            }
            return interfaceC3284g.mo4369e0(interfaceC1049h0);
        }
    }

    /* renamed from: ce.j0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC4754n implements InterfaceC4584p<Boolean, InterfaceC3284g.b, Boolean> {

        /* renamed from: h */
        public static final c f4016h = new c();

        public c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean m4382a(boolean z10, InterfaceC3284g.b bVar) {
            return Boolean.valueOf(z10 || (bVar instanceof InterfaceC1049h0));
        }

        @Override // sd.InterfaceC4584p
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, InterfaceC3284g.b bVar) {
            return m4382a(bool.booleanValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* renamed from: a */
    public static final InterfaceC3284g m4373a(InterfaceC3284g interfaceC3284g, InterfaceC3284g interfaceC3284g2, boolean z10) {
        boolean m4375c = m4375c(interfaceC3284g);
        boolean m4375c2 = m4375c(interfaceC3284g2);
        if (!m4375c && !m4375c2) {
            return interfaceC3284g.mo4369e0(interfaceC3284g2);
        }
        C4763w c4763w = new C4763w();
        c4763w.f17731h = interfaceC3284g2;
        C3285h c3285h = C3285h.f11452h;
        InterfaceC3284g interfaceC3284g3 = (InterfaceC3284g) interfaceC3284g.mo4370z0(c3285h, new b(c4763w, z10));
        if (m4375c2) {
            c4763w.f17731h = ((InterfaceC3284g) c4763w.f17731h).mo4370z0(c3285h, a.f4013h);
        }
        return interfaceC3284g3.mo4369e0((InterfaceC3284g) c4763w.f17731h);
    }

    /* renamed from: b */
    public static final String m4374b(InterfaceC3284g interfaceC3284g) {
        C1077n0 c1077n0;
        String str;
        if (!C1101t0.m4575c() || (c1077n0 = (C1077n0) interfaceC3284g.mo4368d(C1077n0.f4056j)) == null) {
            return null;
        }
        C1081o0 c1081o0 = (C1081o0) interfaceC3284g.mo4368d(C1081o0.f4065j);
        if (c1081o0 == null || (str = c1081o0.m4524H0()) == null) {
            str = "coroutine";
        }
        return str + '#' + c1077n0.m4495H0();
    }

    /* renamed from: c */
    public static final boolean m4375c(InterfaceC3284g interfaceC3284g) {
        return ((Boolean) interfaceC3284g.mo4370z0(Boolean.FALSE, c.f4016h)).booleanValue();
    }

    /* renamed from: d */
    public static final InterfaceC3284g m4376d(InterfaceC1085p0 interfaceC1085p0, InterfaceC3284g interfaceC3284g) {
        InterfaceC3284g m4373a = m4373a(interfaceC1085p0.mo1763b(), interfaceC3284g, true);
        InterfaceC3284g mo4369e0 = C1101t0.m4575c() ? m4373a.mo4369e0(new C1077n0(C1101t0.m4574b().incrementAndGet())) : m4373a;
        return (m4373a == C1045g1.m4326a() || m4373a.mo4368d(InterfaceC3282e.f11449e) != null) ? mo4369e0 : mo4369e0.mo4369e0(C1045g1.m4326a());
    }

    /* renamed from: e */
    public static final InterfaceC3284g m4377e(InterfaceC3284g interfaceC3284g, InterfaceC3284g interfaceC3284g2) {
        return !m4375c(interfaceC3284g2) ? interfaceC3284g.mo4369e0(interfaceC3284g2) : m4373a(interfaceC3284g, interfaceC3284g2, false);
    }

    /* renamed from: f */
    public static final C1052h3<?> m4378f(InterfaceC3471e interfaceC3471e) {
        while (!(interfaceC3471e instanceof C1025c1) && (interfaceC3471e = interfaceC3471e.getCallerFrame()) != null) {
            if (interfaceC3471e instanceof C1052h3) {
                return (C1052h3) interfaceC3471e;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final C1052h3<?> m4379g(InterfaceC3281d<?> interfaceC3281d, InterfaceC3284g interfaceC3284g, Object obj) {
        if (!(interfaceC3281d instanceof InterfaceC3471e)) {
            return null;
        }
        if (!(interfaceC3284g.mo4368d(C1057i3.f4012h) != null)) {
            return null;
        }
        C1052h3<?> m4378f = m4378f((InterfaceC3471e) interfaceC3281d);
        if (m4378f != null) {
            m4378f.m4355T0(interfaceC3284g, obj);
        }
        return m4378f;
    }
}
