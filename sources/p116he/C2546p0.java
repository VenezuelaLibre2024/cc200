package p116he;

import p038ce.InterfaceC1119x2;
import p146jd.InterfaceC3284g;
import sd.InterfaceC4584p;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: he.p0 */
/* loaded from: classes2.dex */
public final class C2546p0 {

    /* renamed from: a */
    public static final C2538l0 f9994a = new C2538l0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    public static final InterfaceC4584p<Object, InterfaceC3284g.b, Object> f9995b = a.f9998h;

    /* renamed from: c */
    public static final InterfaceC4584p<InterfaceC1119x2<?>, InterfaceC3284g.b, InterfaceC1119x2<?>> f9996c = b.f9999h;

    /* renamed from: d */
    public static final InterfaceC4584p<C2554t0, InterfaceC3284g.b, C2554t0> f9997d = c.f10000h;

    /* renamed from: he.p0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4584p<Object, InterfaceC3284g.b, Object> {

        /* renamed from: h */
        public static final a f9998h = new a();

        public a() {
            super(2);
        }

        @Override // sd.InterfaceC4584p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, InterfaceC3284g.b bVar) {
            if (!(bVar instanceof InterfaceC1119x2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: he.p0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC4754n implements InterfaceC4584p<InterfaceC1119x2<?>, InterfaceC3284g.b, InterfaceC1119x2<?>> {

        /* renamed from: h */
        public static final b f9999h = new b();

        public b() {
            super(2);
        }

        @Override // sd.InterfaceC4584p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1119x2<?> invoke(InterfaceC1119x2<?> interfaceC1119x2, InterfaceC3284g.b bVar) {
            if (interfaceC1119x2 != null) {
                return interfaceC1119x2;
            }
            if (bVar instanceof InterfaceC1119x2) {
                return (InterfaceC1119x2) bVar;
            }
            return null;
        }
    }

    /* renamed from: he.p0$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC4754n implements InterfaceC4584p<C2554t0, InterfaceC3284g.b, C2554t0> {

        /* renamed from: h */
        public static final c f10000h = new c();

        public c() {
            super(2);
        }

        @Override // sd.InterfaceC4584p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2554t0 invoke(C2554t0 c2554t0, InterfaceC3284g.b bVar) {
            if (bVar instanceof InterfaceC1119x2) {
                InterfaceC1119x2<?> interfaceC1119x2 = (InterfaceC1119x2) bVar;
                c2554t0.m10176a(interfaceC1119x2, interfaceC1119x2.mo4498r0(c2554t0.f10012a));
            }
            return c2554t0;
        }
    }

    /* renamed from: a */
    public static final void m10147a(InterfaceC3284g interfaceC3284g, Object obj) {
        if (obj == f9994a) {
            return;
        }
        if (obj instanceof C2554t0) {
            ((C2554t0) obj).m10177b(interfaceC3284g);
            return;
        }
        Object mo4370z0 = interfaceC3284g.mo4370z0(null, f9996c);
        C4753m.m18651d(mo4370z0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC1119x2) mo4370z0).mo4494E(interfaceC3284g, obj);
    }

    /* renamed from: b */
    public static final Object m10148b(InterfaceC3284g interfaceC3284g) {
        Object mo4370z0 = interfaceC3284g.mo4370z0(0, f9995b);
        C4753m.m18650c(mo4370z0);
        return mo4370z0;
    }

    /* renamed from: c */
    public static final Object m10149c(InterfaceC3284g interfaceC3284g, Object obj) {
        if (obj == null) {
            obj = m10148b(interfaceC3284g);
        }
        if (obj == 0) {
            return f9994a;
        }
        if (obj instanceof Integer) {
            return interfaceC3284g.mo4370z0(new C2554t0(interfaceC3284g, ((Number) obj).intValue()), f9997d);
        }
        C4753m.m18651d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((InterfaceC1119x2) obj).mo4498r0(interfaceC3284g);
    }
}
