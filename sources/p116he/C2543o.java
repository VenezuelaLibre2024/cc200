package p116he;

import gd.C2236j;
import gd.C2237k;
import gd.C2238l;
import gd.C2240n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import p038ce.InterfaceC1054i0;
import p259rd.C4344a;
import sd.InterfaceC4580l;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: he.o */
/* loaded from: classes2.dex */
public final class C2543o {

    /* renamed from: a */
    public static final int f9985a = m10126e(Throwable.class, -1);

    /* renamed from: b */
    public static final AbstractC2533j f9986b;

    /* renamed from: he.o$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4580l<Throwable, Throwable> {

        /* renamed from: h */
        public final /* synthetic */ Constructor<?> f9987h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Constructor<?> constructor) {
            super(1);
            this.f9987h = constructor;
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object newInstance = this.f9987h.newInstance(th.getMessage(), th);
            C4753m.m18651d(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            return (Throwable) newInstance;
        }
    }

    /* renamed from: he.o$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC4754n implements InterfaceC4580l<Throwable, Throwable> {

        /* renamed from: h */
        public final /* synthetic */ Constructor<?> f9988h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor<?> constructor) {
            super(1);
            this.f9988h = constructor;
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object newInstance = this.f9988h.newInstance(th.getMessage());
            C4753m.m18651d(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            Throwable th2 = (Throwable) newInstance;
            th2.initCause(th);
            return th2;
        }
    }

    /* renamed from: he.o$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC4754n implements InterfaceC4580l<Throwable, Throwable> {

        /* renamed from: h */
        public final /* synthetic */ Constructor<?> f9989h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor<?> constructor) {
            super(1);
            this.f9989h = constructor;
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object newInstance = this.f9989h.newInstance(th);
            C4753m.m18651d(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            return (Throwable) newInstance;
        }
    }

    /* renamed from: he.o$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC4754n implements InterfaceC4580l<Throwable, Throwable> {

        /* renamed from: h */
        public final /* synthetic */ Constructor<?> f9990h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor<?> constructor) {
            super(1);
            this.f9990h = constructor;
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object newInstance = this.f9990h.newInstance(new Object[0]);
            C4753m.m18651d(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
            Throwable th2 = (Throwable) newInstance;
            th2.initCause(th);
            return th2;
        }
    }

    /* renamed from: he.o$e */
    /* loaded from: classes2.dex */
    public static final class e extends AbstractC4754n implements InterfaceC4580l {

        /* renamed from: h */
        public static final e f9991h = new e();

        public e() {
            super(1);
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* renamed from: he.o$f */
    /* loaded from: classes2.dex */
    public static final class f extends AbstractC4754n implements InterfaceC4580l<Throwable, Throwable> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC4580l<Throwable, Throwable> f9992h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(InterfaceC4580l<? super Throwable, ? extends Throwable> interfaceC4580l) {
            super(1);
            this.f9992h = interfaceC4580l;
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Throwable invoke(Throwable th) {
            Object m8966b;
            InterfaceC4580l<Throwable, Throwable> interfaceC4580l = this.f9992h;
            try {
                C2237k.a aVar = C2237k.f8865i;
                Throwable invoke = interfaceC4580l.invoke(th);
                if (!C4753m.m18648a(th.getMessage(), invoke.getMessage()) && !C4753m.m18648a(invoke.getMessage(), th.toString())) {
                    invoke = null;
                }
                m8966b = C2237k.m8966b(invoke);
            } catch (Throwable th2) {
                C2237k.a aVar2 = C2237k.f8865i;
                m8966b = C2237k.m8966b(C2238l.m8974a(th2));
            }
            return (Throwable) (C2237k.m8970f(m8966b) ? null : m8966b);
        }
    }

    static {
        AbstractC2533j abstractC2533j;
        try {
            abstractC2533j = C2547q.m10153a() ? C2558v0.f10017a : C2519c.f9955a;
        } catch (Throwable unused) {
            abstractC2533j = C2558v0.f10017a;
        }
        f9986b = abstractC2533j;
    }

    /* renamed from: b */
    public static final <E extends Throwable> InterfaceC4580l<Throwable, Throwable> m10123b(Class<E> cls) {
        Object obj;
        InterfaceC4580l<Throwable, Throwable> interfaceC4580l;
        int i10;
        e eVar = e.f9991h;
        if (f9985a != m10126e(cls, 0)) {
            return eVar;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i11 = 0;
        while (true) {
            obj = null;
            if (i11 >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i11];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                obj = m10127f(new d(constructor));
                i10 = 0;
            } else if (length2 != 1) {
                if (length2 == 2 && C4753m.m18648a(parameterTypes[0], String.class) && C4753m.m18648a(parameterTypes[1], Throwable.class)) {
                    obj = m10127f(new a(constructor));
                    i10 = 3;
                }
                i10 = -1;
            } else {
                Class<?> cls2 = parameterTypes[0];
                if (C4753m.m18648a(cls2, String.class)) {
                    obj = m10127f(new b(constructor));
                    i10 = 2;
                } else {
                    if (C4753m.m18648a(cls2, Throwable.class)) {
                        obj = m10127f(new c(constructor));
                        i10 = 1;
                    }
                    i10 = -1;
                }
            }
            arrayList.add(C2240n.m8977a(obj, i10));
            i11++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((C2236j) obj).m8964d()).intValue();
                do {
                    Object next = it.next();
                    int intValue2 = ((Number) ((C2236j) next).m8964d()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        C2236j c2236j = (C2236j) obj;
        return (c2236j == null || (interfaceC4580l = (InterfaceC4580l) c2236j.m8963c()) == null) ? eVar : interfaceC4580l;
    }

    /* renamed from: c */
    public static final int m10124c(Class<?> cls, int i10) {
        do {
            int length = cls.getDeclaredFields().length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (!Modifier.isStatic(r0[i12].getModifiers())) {
                    i11++;
                }
            }
            i10 += i11;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i10;
    }

    /* renamed from: d */
    public static /* synthetic */ int m10125d(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return m10124c(cls, i10);
    }

    /* renamed from: e */
    public static final int m10126e(Class<?> cls, int i10) {
        Object m8966b;
        C4344a.m16632c(cls);
        try {
            C2237k.a aVar = C2237k.f8865i;
            m8966b = C2237k.m8966b(Integer.valueOf(m10125d(cls, 0, 1, null)));
        } catch (Throwable th) {
            C2237k.a aVar2 = C2237k.f8865i;
            m8966b = C2237k.m8966b(C2238l.m8974a(th));
        }
        Integer valueOf = Integer.valueOf(i10);
        if (C2237k.m8970f(m8966b)) {
            m8966b = valueOf;
        }
        return ((Number) m8966b).intValue();
    }

    /* renamed from: f */
    public static final InterfaceC4580l<Throwable, Throwable> m10127f(InterfaceC4580l<? super Throwable, ? extends Throwable> interfaceC4580l) {
        return new f(interfaceC4580l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static final <E extends Throwable> E m10128g(E e10) {
        Object m8966b;
        if (!(e10 instanceof InterfaceC1054i0)) {
            return (E) f9986b.mo10053a(e10.getClass()).invoke(e10);
        }
        try {
            C2237k.a aVar = C2237k.f8865i;
            m8966b = C2237k.m8966b(((InterfaceC1054i0) e10).mo4295a());
        } catch (Throwable th) {
            C2237k.a aVar2 = C2237k.f8865i;
            m8966b = C2237k.m8966b(C2238l.m8974a(th));
        }
        if (C2237k.m8970f(m8966b)) {
            m8966b = null;
        }
        return (E) m8966b;
    }
}
