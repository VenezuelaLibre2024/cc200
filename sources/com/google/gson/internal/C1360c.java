package com.google.gson.internal;

import com.google.gson.C1375k;
import com.google.gson.InterfaceC1304f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p323w9.AbstractC5449b;
import p339x9.C5740a;

/* renamed from: com.google.gson.internal.c */
/* loaded from: classes.dex */
public final class C1360c {

    /* renamed from: a */
    public final Map<Type, InterfaceC1304f<?>> f5141a;

    /* renamed from: b */
    public final AbstractC5449b f5142b = AbstractC5449b.m21611a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$a */
    /* loaded from: classes.dex */
    public class a<T> implements InterfaceC1365h<T> {
        public a() {
        }

        @Override // com.google.gson.internal.InterfaceC1365h
        /* renamed from: a */
        public T mo5794a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$b */
    /* loaded from: classes.dex */
    public class b<T> implements InterfaceC1365h<T> {
        public b() {
        }

        @Override // com.google.gson.internal.InterfaceC1365h
        /* renamed from: a */
        public T mo5794a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$c */
    /* loaded from: classes.dex */
    public class c<T> implements InterfaceC1365h<T> {
        public c() {
        }

        @Override // com.google.gson.internal.InterfaceC1365h
        /* renamed from: a */
        public T mo5794a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$d */
    /* loaded from: classes.dex */
    public class d<T> implements InterfaceC1365h<T> {
        public d() {
        }

        @Override // com.google.gson.internal.InterfaceC1365h
        /* renamed from: a */
        public T mo5794a() {
            return (T) new C1364g();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$e */
    /* loaded from: classes.dex */
    public class e<T> implements InterfaceC1365h<T> {

        /* renamed from: a */
        public final AbstractC1369l f5147a = AbstractC1369l.m5825b();

        /* renamed from: b */
        public final /* synthetic */ Class f5148b;

        /* renamed from: c */
        public final /* synthetic */ Type f5149c;

        public e(Class cls, Type type) {
            this.f5148b = cls;
            this.f5149c = type;
        }

        @Override // com.google.gson.internal.InterfaceC1365h
        /* renamed from: a */
        public T mo5794a() {
            try {
                return (T) this.f5147a.mo5826c(this.f5148b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f5149c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$f */
    /* loaded from: classes.dex */
    public class f<T> implements InterfaceC1365h<T> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC1304f f5151a;

        /* renamed from: b */
        public final /* synthetic */ Type f5152b;

        public f(InterfaceC1304f interfaceC1304f, Type type) {
            this.f5151a = interfaceC1304f;
            this.f5152b = type;
        }

        @Override // com.google.gson.internal.InterfaceC1365h
        /* renamed from: a */
        public T mo5794a() {
            return (T) this.f5151a.m5619a(this.f5152b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$g */
    /* loaded from: classes.dex */
    public class g<T> implements InterfaceC1365h<T> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC1304f f5154a;

        /* renamed from: b */
        public final /* synthetic */ Type f5155b;

        public g(InterfaceC1304f interfaceC1304f, Type type) {
            this.f5154a = interfaceC1304f;
            this.f5155b = type;
        }

        @Override // com.google.gson.internal.InterfaceC1365h
        /* renamed from: a */
        public T mo5794a() {
            return (T) this.f5154a.m5619a(this.f5155b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$h */
    /* loaded from: classes.dex */
    public class h<T> implements InterfaceC1365h<T> {

        /* renamed from: a */
        public final /* synthetic */ Constructor f5157a;

        public h(Constructor constructor) {
            this.f5157a = constructor;
        }

        @Override // com.google.gson.internal.InterfaceC1365h
        /* renamed from: a */
        public T mo5794a() {
            try {
                return (T) this.f5157a.newInstance(null);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke " + this.f5157a + " with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke " + this.f5157a + " with no args", e12.getTargetException());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$i */
    /* loaded from: classes.dex */
    public class i<T> implements InterfaceC1365h<T> {
        public i() {
        }

        @Override // com.google.gson.internal.InterfaceC1365h
        /* renamed from: a */
        public T mo5794a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$j */
    /* loaded from: classes.dex */
    public class j<T> implements InterfaceC1365h<T> {

        /* renamed from: a */
        public final /* synthetic */ Type f5160a;

        public j(Type type) {
            this.f5160a = type;
        }

        @Override // com.google.gson.internal.InterfaceC1365h
        /* renamed from: a */
        public T mo5794a() {
            Type type = this.f5160a;
            if (!(type instanceof ParameterizedType)) {
                throw new C1375k("Invalid EnumSet type: " + this.f5160a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new C1375k("Invalid EnumSet type: " + this.f5160a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$k */
    /* loaded from: classes.dex */
    public class k<T> implements InterfaceC1365h<T> {
        public k() {
        }

        @Override // com.google.gson.internal.InterfaceC1365h
        /* renamed from: a */
        public T mo5794a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$l */
    /* loaded from: classes.dex */
    public class l<T> implements InterfaceC1365h<T> {
        public l() {
        }

        @Override // com.google.gson.internal.InterfaceC1365h
        /* renamed from: a */
        public T mo5794a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$m */
    /* loaded from: classes.dex */
    public class m<T> implements InterfaceC1365h<T> {
        public m() {
        }

        @Override // com.google.gson.internal.InterfaceC1365h
        /* renamed from: a */
        public T mo5794a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$n */
    /* loaded from: classes.dex */
    public class n<T> implements InterfaceC1365h<T> {
        public n() {
        }

        @Override // com.google.gson.internal.InterfaceC1365h
        /* renamed from: a */
        public T mo5794a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public C1360c(Map<Type, InterfaceC1304f<?>> map) {
        this.f5141a = map;
    }

    /* renamed from: a */
    public <T> InterfaceC1365h<T> m5790a(C5740a<T> c5740a) {
        Type type = c5740a.getType();
        Class<? super T> rawType = c5740a.getRawType();
        InterfaceC1304f<?> interfaceC1304f = this.f5141a.get(type);
        if (interfaceC1304f != null) {
            return new f(interfaceC1304f, type);
        }
        InterfaceC1304f<?> interfaceC1304f2 = this.f5141a.get(rawType);
        if (interfaceC1304f2 != null) {
            return new g(interfaceC1304f2, type);
        }
        InterfaceC1365h<T> m5791b = m5791b(rawType);
        if (m5791b != null) {
            return m5791b;
        }
        InterfaceC1365h<T> m5792c = m5792c(type, rawType);
        return m5792c != null ? m5792c : m5793d(type, rawType);
    }

    /* renamed from: b */
    public final <T> InterfaceC1365h<T> m5791b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f5142b.mo21610b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final <T> InterfaceC1365h<T> m5792c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i() : EnumSet.class.isAssignableFrom(cls) ? new j(type) : Set.class.isAssignableFrom(cls) ? new k() : Queue.class.isAssignableFrom(cls) ? new l() : new m();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n() : ConcurrentMap.class.isAssignableFrom(cls) ? new a() : SortedMap.class.isAssignableFrom(cls) ? new b() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C5740a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new d() : new c();
        }
        return null;
    }

    /* renamed from: d */
    public final <T> InterfaceC1365h<T> m5793d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public String toString() {
        return this.f5141a.toString();
    }
}
