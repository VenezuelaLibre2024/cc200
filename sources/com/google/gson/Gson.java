package com.google.gson;

import com.google.gson.internal.C1360c;
import com.google.gson.internal.C1368k;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.C1373a;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;
import p355y9.C5900d;
import p355y9.EnumC5898b;

/* loaded from: classes.dex */
public final class Gson {

    /* renamed from: x */
    public static final C5740a<?> f4924x = C5740a.get(Object.class);

    /* renamed from: a */
    public final ThreadLocal<Map<C5740a<?>, FutureTypeAdapter<?>>> f4925a = new ThreadLocal<>();

    /* renamed from: b */
    public final Map<C5740a<?>, TypeAdapter<?>> f4926b = new ConcurrentHashMap();

    /* renamed from: c */
    public final C1360c f4927c;

    /* renamed from: d */
    public final JsonAdapterAnnotationTypeAdapterFactory f4928d;

    /* renamed from: e */
    public final List<InterfaceC1386v> f4929e;

    /* renamed from: f */
    public final Excluder f4930f;

    /* renamed from: g */
    public final InterfaceC1302d f4931g;

    /* renamed from: h */
    public final Map<Type, InterfaceC1304f<?>> f4932h;

    /* renamed from: i */
    public final boolean f4933i;

    /* renamed from: j */
    public final boolean f4934j;

    /* renamed from: k */
    public final boolean f4935k;

    /* renamed from: l */
    public final boolean f4936l;

    /* renamed from: m */
    public final boolean f4937m;

    /* renamed from: n */
    public final boolean f4938n;

    /* renamed from: o */
    public final boolean f4939o;

    /* renamed from: p */
    public final String f4940p;

    /* renamed from: q */
    public final int f4941q;

    /* renamed from: r */
    public final int f4942r;

    /* renamed from: s */
    public final EnumC1383s f4943s;

    /* renamed from: t */
    public final List<InterfaceC1386v> f4944t;

    /* renamed from: u */
    public final List<InterfaceC1386v> f4945u;

    /* renamed from: v */
    public final InterfaceC1385u f4946v;

    /* renamed from: w */
    public final InterfaceC1385u f4947w;

    /* loaded from: classes.dex */
    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {

        /* renamed from: a */
        public TypeAdapter<T> f4952a;

        /* renamed from: a */
        public void m5609a(TypeAdapter<T> typeAdapter) {
            if (this.f4952a != null) {
                throw new AssertionError();
            }
            this.f4952a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public T read(C5897a c5897a) {
            TypeAdapter<T> typeAdapter = this.f4952a;
            if (typeAdapter != null) {
                return typeAdapter.read(c5897a);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.TypeAdapter
        public void write(C5899c c5899c, T t10) {
            TypeAdapter<T> typeAdapter = this.f4952a;
            if (typeAdapter == null) {
                throw new IllegalStateException();
            }
            typeAdapter.write(c5899c, t10);
        }
    }

    public Gson(Excluder excluder, InterfaceC1302d interfaceC1302d, Map<Type, InterfaceC1304f<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, EnumC1383s enumC1383s, String str, int i10, int i11, List<InterfaceC1386v> list, List<InterfaceC1386v> list2, List<InterfaceC1386v> list3, InterfaceC1385u interfaceC1385u, InterfaceC1385u interfaceC1385u2) {
        this.f4930f = excluder;
        this.f4931g = interfaceC1302d;
        this.f4932h = map;
        C1360c c1360c = new C1360c(map);
        this.f4927c = c1360c;
        this.f4933i = z10;
        this.f4934j = z11;
        this.f4935k = z12;
        this.f4936l = z13;
        this.f4937m = z14;
        this.f4938n = z15;
        this.f4939o = z16;
        this.f4943s = enumC1383s;
        this.f4940p = str;
        this.f4941q = i10;
        this.f4942r = i11;
        this.f4944t = list;
        this.f4945u = list2;
        this.f4946v = interfaceC1385u;
        this.f4947w = interfaceC1385u2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f5083V);
        arrayList.add(ObjectTypeAdapter.m5679a(interfaceC1385u));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f5063B);
        arrayList.add(TypeAdapters.f5097m);
        arrayList.add(TypeAdapters.f5091g);
        arrayList.add(TypeAdapters.f5093i);
        arrayList.add(TypeAdapters.f5095k);
        TypeAdapter<Number> m5581m = m5581m(enumC1383s);
        arrayList.add(TypeAdapters.m5693b(Long.TYPE, Long.class, m5581m));
        arrayList.add(TypeAdapters.m5693b(Double.TYPE, Double.class, m5582e(z16)));
        arrayList.add(TypeAdapters.m5693b(Float.TYPE, Float.class, m5583f(z16)));
        arrayList.add(NumberTypeAdapter.m5675a(interfaceC1385u2));
        arrayList.add(TypeAdapters.f5099o);
        arrayList.add(TypeAdapters.f5101q);
        arrayList.add(TypeAdapters.m5692a(AtomicLong.class, m5578b(m5581m)));
        arrayList.add(TypeAdapters.m5692a(AtomicLongArray.class, m5579c(m5581m)));
        arrayList.add(TypeAdapters.f5103s);
        arrayList.add(TypeAdapters.f5108x);
        arrayList.add(TypeAdapters.f5065D);
        arrayList.add(TypeAdapters.f5067F);
        arrayList.add(TypeAdapters.m5692a(BigDecimal.class, TypeAdapters.f5110z));
        arrayList.add(TypeAdapters.m5692a(BigInteger.class, TypeAdapters.f5062A));
        arrayList.add(TypeAdapters.f5069H);
        arrayList.add(TypeAdapters.f5071J);
        arrayList.add(TypeAdapters.f5075N);
        arrayList.add(TypeAdapters.f5077P);
        arrayList.add(TypeAdapters.f5081T);
        arrayList.add(TypeAdapters.f5073L);
        arrayList.add(TypeAdapters.f5088d);
        arrayList.add(DateTypeAdapter.f5007b);
        arrayList.add(TypeAdapters.f5079R);
        if (C1373a.f5207a) {
            arrayList.add(C1373a.f5211e);
            arrayList.add(C1373a.f5210d);
            arrayList.add(C1373a.f5212f);
        }
        arrayList.add(ArrayTypeAdapter.f5001c);
        arrayList.add(TypeAdapters.f5086b);
        arrayList.add(new CollectionTypeAdapterFactory(c1360c));
        arrayList.add(new MapTypeAdapterFactory(c1360c, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(c1360c);
        this.f4928d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f5084W);
        arrayList.add(new ReflectiveTypeAdapterFactory(c1360c, interfaceC1302d, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f4929e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m5577a(Object obj, C5897a c5897a) {
        if (obj != null) {
            try {
                if (c5897a.mo5774r0() == EnumC5898b.END_DOCUMENT) {
                } else {
                    throw new C1375k("JSON document was not fully consumed.");
                }
            } catch (C5900d e10) {
                throw new C1382r(e10);
            } catch (IOException e11) {
                throw new C1375k(e11);
            }
        }
    }

    /* renamed from: b */
    public static TypeAdapter<AtomicLong> m5578b(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicLong read(C5897a c5897a) {
                return new AtomicLong(((Number) TypeAdapter.this.read(c5897a)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(C5899c c5899c, AtomicLong atomicLong) {
                TypeAdapter.this.write(c5899c, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe();
    }

    /* renamed from: c */
    public static TypeAdapter<AtomicLongArray> m5579c(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AtomicLongArray read(C5897a c5897a) {
                ArrayList arrayList = new ArrayList();
                c5897a.mo5764a();
                while (c5897a.mo5755E()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.read(c5897a)).longValue()));
                }
                c5897a.mo5772n();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(C5899c c5899c, AtomicLongArray atomicLongArray) {
                c5899c.mo5780f();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    TypeAdapter.this.write(c5899c, Long.valueOf(atomicLongArray.get(i10)));
                }
                c5899c.mo5782n();
            }
        }.nullSafe();
    }

    /* renamed from: d */
    public static void m5580d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: m */
    public static TypeAdapter<Number> m5581m(EnumC1383s enumC1383s) {
        return enumC1383s == EnumC1383s.f5216h ? TypeAdapters.f5104t : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Number read(C5897a c5897a) {
                if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                    return Long.valueOf(c5897a.mo5768e0());
                }
                c5897a.mo5770h0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(C5899c c5899c, Number number) {
                if (number == null) {
                    c5899c.mo5779W();
                } else {
                    c5899c.mo5786v0(number.toString());
                }
            }
        };
    }

    /* renamed from: e */
    public final TypeAdapter<Number> m5582e(boolean z10) {
        return z10 ? TypeAdapters.f5106v : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Double read(C5897a c5897a) {
                if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                    return Double.valueOf(c5897a.mo5765b0());
                }
                c5897a.mo5770h0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(C5899c c5899c, Number number) {
                if (number == null) {
                    c5899c.mo5779W();
                } else {
                    Gson.m5580d(number.doubleValue());
                    c5899c.mo5785u0(number);
                }
            }
        };
    }

    /* renamed from: f */
    public final TypeAdapter<Number> m5583f(boolean z10) {
        return z10 ? TypeAdapters.f5105u : new TypeAdapter<Number>() { // from class: com.google.gson.Gson.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Float read(C5897a c5897a) {
                if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                    return Float.valueOf((float) c5897a.mo5765b0());
                }
                c5897a.mo5770h0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void write(C5899c c5899c, Number number) {
                if (number == null) {
                    c5899c.mo5779W();
                } else {
                    Gson.m5580d(number.floatValue());
                    c5899c.mo5785u0(number);
                }
            }
        };
    }

    /* renamed from: g */
    public <T> T m5584g(Reader reader, Type type) {
        C5897a m5590n = m5590n(reader);
        T t10 = (T) m5586i(m5590n, type);
        m5577a(t10, m5590n);
        return t10;
    }

    /* renamed from: h */
    public <T> T m5585h(String str, Type type) {
        if (str == null) {
            return null;
        }
        return (T) m5584g(new StringReader(str), type);
    }

    /* renamed from: i */
    public <T> T m5586i(C5897a c5897a, Type type) {
        boolean m23571I = c5897a.m23571I();
        boolean z10 = true;
        c5897a.m23587y0(true);
        try {
            try {
                try {
                    c5897a.mo5774r0();
                    z10 = false;
                    T read = m5588k(C5740a.get(type)).read(c5897a);
                    c5897a.m23587y0(m23571I);
                    return read;
                } catch (EOFException e10) {
                    if (!z10) {
                        throw new C1382r(e10);
                    }
                    c5897a.m23587y0(m23571I);
                    return null;
                } catch (IOException e11) {
                    throw new C1382r(e11);
                }
            } catch (AssertionError e12) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e12.getMessage());
                assertionError.initCause(e12);
                throw assertionError;
            } catch (IllegalStateException e13) {
                throw new C1382r(e13);
            }
        } catch (Throwable th) {
            c5897a.m23587y0(m23571I);
            throw th;
        }
    }

    /* renamed from: j */
    public <T> TypeAdapter<T> m5587j(Class<T> cls) {
        return m5588k(C5740a.get((Class) cls));
    }

    /* renamed from: k */
    public <T> TypeAdapter<T> m5588k(C5740a<T> c5740a) {
        TypeAdapter<T> typeAdapter = (TypeAdapter) this.f4926b.get(c5740a == null ? f4924x : c5740a);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map<C5740a<?>, FutureTypeAdapter<?>> map = this.f4925a.get();
        boolean z10 = false;
        if (map == null) {
            map = new HashMap<>();
            this.f4925a.set(map);
            z10 = true;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map.get(c5740a);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map.put(c5740a, futureTypeAdapter2);
            Iterator<InterfaceC1386v> it = this.f4929e.iterator();
            while (it.hasNext()) {
                TypeAdapter<T> create = it.next().create(this, c5740a);
                if (create != null) {
                    futureTypeAdapter2.m5609a(create);
                    this.f4926b.put(c5740a, create);
                    return create;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + c5740a);
        } finally {
            map.remove(c5740a);
            if (z10) {
                this.f4925a.remove();
            }
        }
    }

    /* renamed from: l */
    public <T> TypeAdapter<T> m5589l(InterfaceC1386v interfaceC1386v, C5740a<T> c5740a) {
        if (!this.f4929e.contains(interfaceC1386v)) {
            interfaceC1386v = this.f4928d;
        }
        boolean z10 = false;
        for (InterfaceC1386v interfaceC1386v2 : this.f4929e) {
            if (z10) {
                TypeAdapter<T> create = interfaceC1386v2.create(this, c5740a);
                if (create != null) {
                    return create;
                }
            } else if (interfaceC1386v2 == interfaceC1386v) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c5740a);
    }

    /* renamed from: n */
    public C5897a m5590n(Reader reader) {
        C5897a c5897a = new C5897a(reader);
        c5897a.m23587y0(this.f4938n);
        return c5897a;
    }

    /* renamed from: o */
    public C5899c m5591o(Writer writer) {
        if (this.f4935k) {
            writer.write(")]}'\n");
        }
        C5899c c5899c = new C5899c(writer);
        if (this.f4937m) {
            c5899c.m23599h0("  ");
        }
        c5899c.m23602l0(this.f4933i);
        return c5899c;
    }

    /* renamed from: p */
    public String m5592p(AbstractC1374j abstractC1374j) {
        StringWriter stringWriter = new StringWriter();
        m5595s(abstractC1374j, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: q */
    public String m5593q(Object obj) {
        return obj == null ? m5592p(C1376l.f5213a) : m5594r(obj, obj.getClass());
    }

    /* renamed from: r */
    public String m5594r(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m5597u(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: s */
    public void m5595s(AbstractC1374j abstractC1374j, Appendable appendable) {
        try {
            m5596t(abstractC1374j, m5591o(C1368k.m5823c(appendable)));
        } catch (IOException e10) {
            throw new C1375k(e10);
        }
    }

    /* renamed from: t */
    public void m5596t(AbstractC1374j abstractC1374j, C5899c c5899c) {
        boolean m23590I = c5899c.m23590I();
        c5899c.m23600i0(true);
        boolean m23589E = c5899c.m23589E();
        c5899c.m23598g0(this.f4936l);
        boolean m23604x = c5899c.m23604x();
        c5899c.m23602l0(this.f4933i);
        try {
            try {
                C1368k.m5822b(abstractC1374j, c5899c);
            } catch (IOException e10) {
                throw new C1375k(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            c5899c.m23600i0(m23590I);
            c5899c.m23598g0(m23589E);
            c5899c.m23602l0(m23604x);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f4933i + ",factories:" + this.f4929e + ",instanceCreators:" + this.f4927c + "}";
    }

    /* renamed from: u */
    public void m5597u(Object obj, Type type, Appendable appendable) {
        try {
            m5598v(obj, type, m5591o(C1368k.m5823c(appendable)));
        } catch (IOException e10) {
            throw new C1375k(e10);
        }
    }

    /* renamed from: v */
    public void m5598v(Object obj, Type type, C5899c c5899c) {
        TypeAdapter m5588k = m5588k(C5740a.get(type));
        boolean m23590I = c5899c.m23590I();
        c5899c.m23600i0(true);
        boolean m23589E = c5899c.m23589E();
        c5899c.m23598g0(this.f4936l);
        boolean m23604x = c5899c.m23604x();
        c5899c.m23602l0(this.f4933i);
        try {
            try {
                m5588k.write(c5899c, obj);
            } catch (IOException e10) {
                throw new C1375k(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            c5899c.m23600i0(m23590I);
            c5899c.m23598g0(m23589E);
            c5899c.m23602l0(m23604x);
        }
    }
}
