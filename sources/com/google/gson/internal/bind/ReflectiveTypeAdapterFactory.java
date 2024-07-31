package com.google.gson.internal.bind;

import com.google.gson.C1382r;
import com.google.gson.Gson;
import com.google.gson.InterfaceC1302d;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C1310b;
import com.google.gson.internal.C1360c;
import com.google.gson.internal.C1367j;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.InterfaceC1365h;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p295u9.InterfaceC4995b;
import p295u9.InterfaceC4996c;
import p323w9.AbstractC5449b;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;
import p355y9.EnumC5898b;

/* loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements InterfaceC1386v {

    /* renamed from: h */
    public final C1360c f5029h;

    /* renamed from: i */
    public final InterfaceC1302d f5030i;

    /* renamed from: j */
    public final Excluder f5031j;

    /* renamed from: k */
    public final JsonAdapterAnnotationTypeAdapterFactory f5032k;

    /* renamed from: l */
    public final AbstractC5449b f5033l = AbstractC5449b.m21611a();

    /* loaded from: classes.dex */
    public static final class Adapter<T> extends TypeAdapter<T> {

        /* renamed from: a */
        public final InterfaceC1365h<T> f5034a;

        /* renamed from: b */
        public final Map<String, AbstractC1320b> f5035b;

        public Adapter(InterfaceC1365h<T> interfaceC1365h, Map<String, AbstractC1320b> map) {
            this.f5034a = interfaceC1365h;
            this.f5035b = map;
        }

        @Override // com.google.gson.TypeAdapter
        public T read(C5897a c5897a) {
            if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                c5897a.mo5770h0();
                return null;
            }
            T mo5794a = this.f5034a.mo5794a();
            try {
                c5897a.mo5767d();
                while (c5897a.mo5755E()) {
                    AbstractC1320b abstractC1320b = this.f5035b.get(c5897a.mo5769f0());
                    if (abstractC1320b != null && abstractC1320b.f5045c) {
                        abstractC1320b.mo5686a(c5897a, mo5794a);
                    }
                    c5897a.mo5756J0();
                }
                c5897a.mo5775w();
                return mo5794a;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new C1382r(e11);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(C5899c c5899c, T t10) {
            if (t10 == null) {
                c5899c.mo5779W();
                return;
            }
            c5899c.mo5781j();
            try {
                for (AbstractC1320b abstractC1320b : this.f5035b.values()) {
                    if (abstractC1320b.mo5688c(t10)) {
                        c5899c.mo5778K(abstractC1320b.f5043a);
                        abstractC1320b.mo5687b(c5899c, t10);
                    }
                }
                c5899c.mo5787w();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$a */
    /* loaded from: classes.dex */
    public class C1319a extends AbstractC1320b {

        /* renamed from: d */
        public final /* synthetic */ Field f5036d;

        /* renamed from: e */
        public final /* synthetic */ boolean f5037e;

        /* renamed from: f */
        public final /* synthetic */ TypeAdapter f5038f;

        /* renamed from: g */
        public final /* synthetic */ Gson f5039g;

        /* renamed from: h */
        public final /* synthetic */ C5740a f5040h;

        /* renamed from: i */
        public final /* synthetic */ boolean f5041i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1319a(String str, boolean z10, boolean z11, Field field, boolean z12, TypeAdapter typeAdapter, Gson gson, C5740a c5740a, boolean z13) {
            super(str, z10, z11);
            this.f5036d = field;
            this.f5037e = z12;
            this.f5038f = typeAdapter;
            this.f5039g = gson;
            this.f5040h = c5740a;
            this.f5041i = z13;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC1320b
        /* renamed from: a */
        public void mo5686a(C5897a c5897a, Object obj) {
            Object read = this.f5038f.read(c5897a);
            if (read == null && this.f5041i) {
                return;
            }
            this.f5036d.set(obj, read);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC1320b
        /* renamed from: b */
        public void mo5687b(C5899c c5899c, Object obj) {
            (this.f5037e ? this.f5038f : new TypeAdapterRuntimeTypeWrapper(this.f5039g, this.f5038f, this.f5040h.getType())).write(c5899c, this.f5036d.get(obj));
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC1320b
        /* renamed from: c */
        public boolean mo5688c(Object obj) {
            return this.f5044b && this.f5036d.get(obj) != obj;
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1320b {

        /* renamed from: a */
        public final String f5043a;

        /* renamed from: b */
        public final boolean f5044b;

        /* renamed from: c */
        public final boolean f5045c;

        public AbstractC1320b(String str, boolean z10, boolean z11) {
            this.f5043a = str;
            this.f5044b = z10;
            this.f5045c = z11;
        }

        /* renamed from: a */
        public abstract void mo5686a(C5897a c5897a, Object obj);

        /* renamed from: b */
        public abstract void mo5687b(C5899c c5899c, Object obj);

        /* renamed from: c */
        public abstract boolean mo5688c(Object obj);
    }

    public ReflectiveTypeAdapterFactory(C1360c c1360c, InterfaceC1302d interfaceC1302d, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f5029h = c1360c;
        this.f5030i = interfaceC1302d;
        this.f5031j = excluder;
        this.f5032k = jsonAdapterAnnotationTypeAdapterFactory;
    }

    /* renamed from: c */
    public static boolean m5681c(Field field, boolean z10, Excluder excluder) {
        return (excluder.m5624c(field.getType(), z10) || excluder.m5627g(field, z10)) ? false : true;
    }

    /* renamed from: a */
    public final AbstractC1320b m5682a(Gson gson, Field field, String str, C5740a<?> c5740a, boolean z10, boolean z11) {
        boolean m5820a = C1367j.m5820a(c5740a.getRawType());
        InterfaceC4995b interfaceC4995b = (InterfaceC4995b) field.getAnnotation(InterfaceC4995b.class);
        TypeAdapter<?> m5670a = interfaceC4995b != null ? this.f5032k.m5670a(this.f5029h, gson, c5740a, interfaceC4995b) : null;
        boolean z12 = m5670a != null;
        if (m5670a == null) {
            m5670a = gson.m5588k(c5740a);
        }
        return new C1319a(str, z10, z11, field, z12, m5670a, gson, c5740a, m5820a);
    }

    /* renamed from: b */
    public boolean m5683b(Field field, boolean z10) {
        return m5681c(field, z10, this.f5031j);
    }

    @Override // com.google.gson.InterfaceC1386v
    public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
        Class<? super T> rawType = c5740a.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new Adapter(this.f5029h.m5790a(c5740a), m5684d(gson, c5740a, rawType));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* renamed from: d */
    public final Map<String, AbstractC1320b> m5684d(Gson gson, C5740a<?> c5740a, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = c5740a.getType();
        C5740a<?> c5740a2 = c5740a;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean m5683b = m5683b(field, true);
                boolean m5683b2 = m5683b(field, z10);
                if (m5683b || m5683b2) {
                    this.f5033l.mo21610b(field);
                    Type m5652p = C1310b.m5652p(c5740a2.getType(), cls2, field.getGenericType());
                    List<String> m5685e = m5685e(field);
                    int size = m5685e.size();
                    AbstractC1320b abstractC1320b = null;
                    ?? r22 = z10;
                    while (r22 < size) {
                        String str = m5685e.get(r22);
                        boolean z11 = r22 != 0 ? z10 : m5683b;
                        int i11 = r22;
                        AbstractC1320b abstractC1320b2 = abstractC1320b;
                        int i12 = size;
                        List<String> list = m5685e;
                        Field field2 = field;
                        abstractC1320b = abstractC1320b2 == null ? (AbstractC1320b) linkedHashMap.put(str, m5682a(gson, field, str, C5740a.get(m5652p), z11, m5683b2)) : abstractC1320b2;
                        m5683b = z11;
                        m5685e = list;
                        size = i12;
                        field = field2;
                        z10 = false;
                        r22 = i11 + 1;
                    }
                    AbstractC1320b abstractC1320b3 = abstractC1320b;
                    if (abstractC1320b3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + abstractC1320b3.f5043a);
                    }
                }
                i10++;
                z10 = false;
            }
            c5740a2 = C5740a.get(C1310b.m5652p(c5740a2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = c5740a2.getRawType();
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public final List<String> m5685e(Field field) {
        InterfaceC4996c interfaceC4996c = (InterfaceC4996c) field.getAnnotation(InterfaceC4996c.class);
        if (interfaceC4996c == null) {
            return Collections.singletonList(this.f5030i.mo5614b(field));
        }
        String value = interfaceC4996c.value();
        String[] alternate = interfaceC4996c.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }
}
