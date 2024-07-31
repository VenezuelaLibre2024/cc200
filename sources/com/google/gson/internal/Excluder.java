package com.google.gson.internal;

import com.google.gson.C1300b;
import com.google.gson.Gson;
import com.google.gson.InterfaceC1299a;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p295u9.InterfaceC4994a;
import p295u9.InterfaceC4997d;
import p295u9.InterfaceC4998e;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;

/* loaded from: classes.dex */
public final class Excluder implements InterfaceC1386v, Cloneable {

    /* renamed from: n */
    public static final Excluder f4981n = new Excluder();

    /* renamed from: k */
    public boolean f4985k;

    /* renamed from: h */
    public double f4982h = -1.0d;

    /* renamed from: i */
    public int f4983i = 136;

    /* renamed from: j */
    public boolean f4984j = true;

    /* renamed from: l */
    public List<InterfaceC1299a> f4986l = Collections.emptyList();

    /* renamed from: m */
    public List<InterfaceC1299a> f4987m = Collections.emptyList();

    /* renamed from: com.google.gson.internal.Excluder$1 */
    /* loaded from: classes.dex */
    public class C13081<T> extends TypeAdapter<T> {

        /* renamed from: a */
        public TypeAdapter<T> f4988a;

        /* renamed from: b */
        public final /* synthetic */ boolean f4989b;

        /* renamed from: c */
        public final /* synthetic */ boolean f4990c;

        /* renamed from: d */
        public final /* synthetic */ Gson f4991d;

        /* renamed from: e */
        public final /* synthetic */ C5740a f4992e;

        public C13081(boolean z10, boolean z11, Gson gson, C5740a c5740a) {
            r2 = z10;
            r3 = z11;
            r4 = gson;
            r5 = c5740a;
        }

        /* renamed from: a */
        public final TypeAdapter<T> m5634a() {
            TypeAdapter<T> typeAdapter = this.f4988a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            TypeAdapter<T> m5589l = r4.m5589l(Excluder.this, r5);
            this.f4988a = m5589l;
            return m5589l;
        }

        @Override // com.google.gson.TypeAdapter
        public T read(C5897a c5897a) {
            if (!r2) {
                return m5634a().read(c5897a);
            }
            c5897a.mo5756J0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void write(C5899c c5899c, T t10) {
            if (r3) {
                c5899c.mo5779W();
            } else {
                m5634a().write(c5899c, t10);
            }
        }
    }

    /* renamed from: b */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: c */
    public boolean m5624c(Class<?> cls, boolean z10) {
        return m5625e(cls) || m5626f(cls, z10);
    }

    @Override // com.google.gson.InterfaceC1386v
    public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
        Class<? super T> rawType = c5740a.getRawType();
        boolean m5625e = m5625e(rawType);
        boolean z10 = m5625e || m5626f(rawType, true);
        boolean z11 = m5625e || m5626f(rawType, false);
        if (z10 || z11) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a */
                public TypeAdapter<T> f4988a;

                /* renamed from: b */
                public final /* synthetic */ boolean f4989b;

                /* renamed from: c */
                public final /* synthetic */ boolean f4990c;

                /* renamed from: d */
                public final /* synthetic */ Gson f4991d;

                /* renamed from: e */
                public final /* synthetic */ C5740a f4992e;

                public C13081(boolean z112, boolean z102, Gson gson2, C5740a c5740a2) {
                    r2 = z112;
                    r3 = z102;
                    r4 = gson2;
                    r5 = c5740a2;
                }

                /* renamed from: a */
                public final TypeAdapter<T> m5634a() {
                    TypeAdapter<T> typeAdapter = this.f4988a;
                    if (typeAdapter != null) {
                        return typeAdapter;
                    }
                    TypeAdapter<T> m5589l = r4.m5589l(Excluder.this, r5);
                    this.f4988a = m5589l;
                    return m5589l;
                }

                @Override // com.google.gson.TypeAdapter
                public T read(C5897a c5897a) {
                    if (!r2) {
                        return m5634a().read(c5897a);
                    }
                    c5897a.mo5756J0();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void write(C5899c c5899c, T t10) {
                    if (r3) {
                        c5899c.mo5779W();
                    } else {
                        m5634a().write(c5899c, t10);
                    }
                }
            };
        }
        return null;
    }

    /* renamed from: e */
    public final boolean m5625e(Class<?> cls) {
        if (this.f4982h == -1.0d || m5633n((InterfaceC4997d) cls.getAnnotation(InterfaceC4997d.class), (InterfaceC4998e) cls.getAnnotation(InterfaceC4998e.class))) {
            return (!this.f4984j && m5629i(cls)) || m5628h(cls);
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m5626f(Class<?> cls, boolean z10) {
        Iterator<InterfaceC1299a> it = (z10 ? this.f4986l : this.f4987m).iterator();
        while (it.hasNext()) {
            if (it.next().m5611b(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public boolean m5627g(Field field, boolean z10) {
        InterfaceC4994a interfaceC4994a;
        if ((this.f4983i & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f4982h != -1.0d && !m5633n((InterfaceC4997d) field.getAnnotation(InterfaceC4997d.class), (InterfaceC4998e) field.getAnnotation(InterfaceC4998e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f4985k && ((interfaceC4994a = (InterfaceC4994a) field.getAnnotation(InterfaceC4994a.class)) == null || (!z10 ? interfaceC4994a.deserialize() : interfaceC4994a.serialize()))) {
            return true;
        }
        if ((!this.f4984j && m5629i(field.getType())) || m5628h(field.getType())) {
            return true;
        }
        List<InterfaceC1299a> list = z10 ? this.f4986l : this.f4987m;
        if (list.isEmpty()) {
            return false;
        }
        C1300b c1300b = new C1300b(field);
        Iterator<InterfaceC1299a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().m5610a(c1300b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m5628h(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || m5630k(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    /* renamed from: i */
    public final boolean m5629i(Class<?> cls) {
        return cls.isMemberClass() && !m5630k(cls);
    }

    /* renamed from: k */
    public final boolean m5630k(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: l */
    public final boolean m5631l(InterfaceC4997d interfaceC4997d) {
        return interfaceC4997d == null || interfaceC4997d.value() <= this.f4982h;
    }

    /* renamed from: m */
    public final boolean m5632m(InterfaceC4998e interfaceC4998e) {
        return interfaceC4998e == null || interfaceC4998e.value() > this.f4982h;
    }

    /* renamed from: n */
    public final boolean m5633n(InterfaceC4997d interfaceC4997d, InterfaceC4998e interfaceC4998e) {
        return m5631l(interfaceC4997d) && m5632m(interfaceC4998e);
    }
}
