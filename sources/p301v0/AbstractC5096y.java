package p301v0;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p301v0.AbstractC5027a;
import p301v0.AbstractC5096y;
import p301v0.AbstractC5096y.a;
import p301v0.C5028a0;
import p301v0.C5086t1;
import p301v0.C5087u;
import p301v0.InterfaceC5079r0;

/* renamed from: v0.y */
/* loaded from: classes.dex */
public abstract class AbstractC5096y<MessageType extends AbstractC5096y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC5027a<MessageType, BuilderType> {
    private static Map<Object, AbstractC5096y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public C5071o1 unknownFields = C5071o1.m20404e();
    public int memoizedSerializedSize = -1;

    /* renamed from: v0.y$a */
    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends AbstractC5096y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC5027a.a<MessageType, BuilderType> {

        /* renamed from: h */
        public final MessageType f19219h;

        /* renamed from: i */
        public MessageType f19220i;

        /* renamed from: j */
        public boolean f19221j = false;

        public a(MessageType messagetype) {
            this.f19219h = messagetype;
            this.f19220i = (MessageType) messagetype.m20706u(f.NEW_MUTABLE_INSTANCE);
        }

        @Override // p301v0.InterfaceC5079r0.a
        /* renamed from: q */
        public final MessageType mo20461a() {
            MessageType mo20460E = mo20460E();
            if (mo20460E.mo20527k()) {
                return mo20460E;
            }
            throw AbstractC5027a.a.m19785p(mo20460E);
        }

        @Override // p301v0.InterfaceC5079r0.a
        /* renamed from: r */
        public MessageType mo20460E() {
            if (this.f19221j) {
                return this.f19220i;
            }
            this.f19220i.m20701C();
            this.f19221j = true;
            return this.f19220i;
        }

        /* renamed from: s */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) mo20526b().mo20458h();
            buildertype.m20715w(mo20460E());
            return buildertype;
        }

        /* renamed from: t */
        public void m20712t() {
            if (this.f19221j) {
                MessageType messagetype = (MessageType) this.f19220i.m20706u(f.NEW_MUTABLE_INSTANCE);
                m20716x(messagetype, this.f19220i);
                this.f19220i = messagetype;
                this.f19221j = false;
            }
        }

        @Override // p301v0.InterfaceC5082s0
        /* renamed from: u */
        public MessageType mo20526b() {
            return this.f19219h;
        }

        @Override // p301v0.AbstractC5027a.a
        /* renamed from: v */
        public BuilderType mo19787n(MessageType messagetype) {
            return m20715w(messagetype);
        }

        /* renamed from: w */
        public BuilderType m20715w(MessageType messagetype) {
            m20712t();
            m20716x(this.f19220i, messagetype);
            return this;
        }

        /* renamed from: x */
        public final void m20716x(MessageType messagetype, MessageType messagetype2) {
            C5035c1.m19823a().m19827e(messagetype).mo19938a(messagetype, messagetype2);
        }
    }

    /* renamed from: v0.y$b */
    /* loaded from: classes.dex */
    public static class b<T extends AbstractC5096y<T, ?>> extends AbstractC5030b<T> {

        /* renamed from: b */
        public final T f19222b;

        public b(T t10) {
            this.f19222b = t10;
        }

        @Override // p301v0.InterfaceC5099z0
        /* renamed from: g */
        public T mo20717b(AbstractC5051i abstractC5051i, C5072p c5072p) {
            return (T) AbstractC5096y.m20696I(this.f19222b, abstractC5051i, c5072p);
        }
    }

    /* renamed from: v0.y$c */
    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC5096y<MessageType, BuilderType> implements InterfaceC5082s0 {
        public C5087u<d> extensions = C5087u.m20585h();

        /* renamed from: L */
        public C5087u<d> m20719L() {
            if (this.extensions.m20599o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // p301v0.AbstractC5096y, p301v0.InterfaceC5082s0
        /* renamed from: b */
        public /* bridge */ /* synthetic */ InterfaceC5079r0 mo20526b() {
            return super.mo20526b();
        }

        @Override // p301v0.AbstractC5096y, p301v0.InterfaceC5079r0
        /* renamed from: c */
        public /* bridge */ /* synthetic */ InterfaceC5079r0.a mo20455c() {
            return super.mo20455c();
        }

        @Override // p301v0.AbstractC5096y, p301v0.InterfaceC5079r0
        /* renamed from: h */
        public /* bridge */ /* synthetic */ InterfaceC5079r0.a mo20458h() {
            return super.mo20458h();
        }
    }

    /* renamed from: v0.y$d */
    /* loaded from: classes.dex */
    public static final class d implements C5087u.b<d> {

        /* renamed from: h */
        public final C5028a0.d<?> f19223h;

        /* renamed from: i */
        public final int f19224i;

        /* renamed from: j */
        public final C5086t1.b f19225j;

        /* renamed from: k */
        public final boolean f19226k;

        /* renamed from: l */
        public final boolean f19227l;

        @Override // p301v0.C5087u.b
        /* renamed from: a */
        public int mo20607a() {
            return this.f19224i;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(d dVar) {
            return this.f19224i - dVar.f19224i;
        }

        /* renamed from: c */
        public C5028a0.d<?> m20721c() {
            return this.f19223h;
        }

        @Override // p301v0.C5087u.b
        /* renamed from: d */
        public boolean mo20608d() {
            return this.f19226k;
        }

        @Override // p301v0.C5087u.b
        /* renamed from: e */
        public C5086t1.b mo20609e() {
            return this.f19225j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p301v0.C5087u.b
        /* renamed from: g */
        public InterfaceC5079r0.a mo20610g(InterfaceC5079r0.a aVar, InterfaceC5079r0 interfaceC5079r0) {
            return ((a) aVar).m20715w((AbstractC5096y) interfaceC5079r0);
        }

        @Override // p301v0.C5087u.b
        /* renamed from: j */
        public C5086t1.c mo20611j() {
            return this.f19225j.m20578b();
        }

        @Override // p301v0.C5087u.b
        /* renamed from: k */
        public boolean mo20612k() {
            return this.f19227l;
        }
    }

    /* renamed from: v0.y$e */
    /* loaded from: classes.dex */
    public static class e<ContainingType extends InterfaceC5079r0, Type> extends AbstractC5066n<ContainingType, Type> {

        /* renamed from: a */
        public final InterfaceC5079r0 f19228a;

        /* renamed from: b */
        public final d f19229b;

        /* renamed from: a */
        public C5086t1.b m20722a() {
            return this.f19229b.mo20609e();
        }

        /* renamed from: b */
        public InterfaceC5079r0 m20723b() {
            return this.f19228a;
        }

        /* renamed from: c */
        public int m20724c() {
            return this.f19229b.mo20607a();
        }

        /* renamed from: d */
        public boolean m20725d() {
            return this.f19229b.f19226k;
        }
    }

    /* renamed from: v0.y$f */
    /* loaded from: classes.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: A */
    public static Object m20691A(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: B */
    public static final <T extends AbstractC5096y<T, ?>> boolean m20692B(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.m20706u(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo19940c = C5035c1.m19823a().m19827e(t10).mo19940c(t10);
        if (z10) {
            t10.m20707v(f.SET_MEMOIZED_IS_INITIALIZED, mo19940c ? t10 : null);
        }
        return mo19940c;
    }

    /* renamed from: D */
    public static <E> C5028a0.i<E> m20693D(C5028a0.i<E> iVar) {
        int size = iVar.size();
        return iVar.mo19804i(size == 0 ? 10 : size * 2);
    }

    /* renamed from: G */
    public static Object m20694G(InterfaceC5079r0 interfaceC5079r0, String str, Object[] objArr) {
        return new C5041e1(interfaceC5079r0, str, objArr);
    }

    /* renamed from: H */
    public static <T extends AbstractC5096y<T, ?>> T m20695H(T t10, InputStream inputStream) {
        return (T) m20698s(m20696I(t10, AbstractC5051i.m19990f(inputStream), C5072p.m20419b()));
    }

    /* renamed from: I */
    public static <T extends AbstractC5096y<T, ?>> T m20696I(T t10, AbstractC5051i abstractC5051i, C5072p c5072p) {
        T t11 = (T) t10.m20706u(f.NEW_MUTABLE_INSTANCE);
        try {
            InterfaceC5047g1 m19827e = C5035c1.m19823a().m19827e(t11);
            m19827e.mo19942e(t11, C5054j.m20121Q(abstractC5051i), c5072p);
            m19827e.mo19939b(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof C5031b0) {
                throw ((C5031b0) e10.getCause());
            }
            throw new C5031b0(e10.getMessage()).m19820i(t11);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof C5031b0) {
                throw ((C5031b0) e11.getCause());
            }
            throw e11;
        }
    }

    /* renamed from: J */
    public static <T extends AbstractC5096y<?, ?>> void m20697J(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    /* renamed from: s */
    public static <T extends AbstractC5096y<T, ?>> T m20698s(T t10) {
        if (t10 == null || t10.mo20527k()) {
            return t10;
        }
        throw t10.m19780o().m20373a().m19820i(t10);
    }

    /* renamed from: x */
    public static <E> C5028a0.i<E> m20699x() {
        return C5038d1.m19835c();
    }

    /* renamed from: y */
    public static <T extends AbstractC5096y<?, ?>> T m20700y(Class<T> cls) {
        AbstractC5096y<?, ?> abstractC5096y = defaultInstanceMap.get(cls);
        if (abstractC5096y == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC5096y = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC5096y == null) {
            abstractC5096y = (T) ((AbstractC5096y) C5080r1.m20487i(cls)).mo20526b();
            if (abstractC5096y == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC5096y);
        }
        return (T) abstractC5096y;
    }

    /* renamed from: C */
    public void m20701C() {
        C5035c1.m19823a().m19827e(this).mo19939b(this);
    }

    @Override // p301v0.InterfaceC5079r0
    /* renamed from: F */
    public final BuilderType mo20458h() {
        return (BuilderType) m20706u(f.NEW_BUILDER);
    }

    @Override // p301v0.InterfaceC5079r0
    /* renamed from: K */
    public final BuilderType mo20455c() {
        BuilderType buildertype = (BuilderType) m20706u(f.NEW_BUILDER);
        buildertype.m20715w(this);
        return buildertype;
    }

    @Override // p301v0.InterfaceC5079r0
    /* renamed from: e */
    public void mo20456e(AbstractC5057k abstractC5057k) {
        C5035c1.m19823a().m19827e(this).mo19941d(this, C5060l.m20290P(abstractC5057k));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (mo20526b().getClass().isInstance(obj)) {
            return C5035c1.m19823a().m19827e(this).mo19943f(this, (AbstractC5096y) obj);
        }
        return false;
    }

    @Override // p301v0.InterfaceC5079r0
    /* renamed from: g */
    public int mo20457g() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = C5035c1.m19823a().m19827e(this).mo19944g(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int mo19946i = C5035c1.m19823a().m19827e(this).mo19946i(this);
        this.memoizedHashCode = mo19946i;
        return mo19946i;
    }

    @Override // p301v0.InterfaceC5079r0
    /* renamed from: i */
    public final InterfaceC5099z0<MessageType> mo20459i() {
        return (InterfaceC5099z0) m20706u(f.GET_PARSER);
    }

    @Override // p301v0.InterfaceC5082s0
    /* renamed from: k */
    public final boolean mo20527k() {
        return m20692B(this, true);
    }

    @Override // p301v0.AbstractC5027a
    /* renamed from: l */
    public int mo19777l() {
        return this.memoizedSerializedSize;
    }

    @Override // p301v0.AbstractC5027a
    /* renamed from: p */
    public void mo19781p(int i10) {
        this.memoizedSerializedSize = i10;
    }

    /* renamed from: r */
    public Object m20704r() {
        return m20706u(f.BUILD_MESSAGE_INFO);
    }

    /* renamed from: t */
    public final <MessageType extends AbstractC5096y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType m20705t() {
        return (BuilderType) m20706u(f.NEW_BUILDER);
    }

    public String toString() {
        return C5085t0.m20574e(this, super.toString());
    }

    /* renamed from: u */
    public Object m20706u(f fVar) {
        return mo18144w(fVar, null, null);
    }

    /* renamed from: v */
    public Object m20707v(f fVar, Object obj) {
        return mo18144w(fVar, obj, null);
    }

    /* renamed from: w */
    public abstract Object mo18144w(f fVar, Object obj, Object obj2);

    @Override // p301v0.InterfaceC5082s0
    /* renamed from: z */
    public final MessageType mo20526b() {
        return (MessageType) m20706u(f.GET_DEFAULT_INSTANCE);
    }
}
