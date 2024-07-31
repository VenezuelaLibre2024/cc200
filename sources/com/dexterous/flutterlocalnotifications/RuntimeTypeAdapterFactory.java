package com.dexterous.flutterlocalnotifications;

import androidx.annotation.Keep;
import com.google.gson.AbstractC1374j;
import com.google.gson.C1377m;
import com.google.gson.C1378n;
import com.google.gson.C1379o;
import com.google.gson.Gson;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C1368k;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.LinkedHashMap;
import java.util.Map;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;

@Keep
/* loaded from: classes.dex */
public final class RuntimeTypeAdapterFactory<T> implements InterfaceC1386v {
    private final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    /* renamed from: com.dexterous.flutterlocalnotifications.RuntimeTypeAdapterFactory$1 */
    /* loaded from: classes.dex */
    public class C11401<R> extends TypeAdapter<R> {
        public final /* synthetic */ Map val$labelToDelegate;
        public final /* synthetic */ Map val$subtypeToDelegate;

        public C11401(Map map, Map map2) {
            r2 = map;
            r3 = map2;
        }

        @Override // com.google.gson.TypeAdapter
        public R read(C5897a c5897a) {
            AbstractC1374j m5821a = C1368k.m5821a(c5897a);
            AbstractC1374j m5845q = m5821a.m5836c().m5845q(RuntimeTypeAdapterFactory.this.typeFieldName);
            if (m5845q == null) {
                throw new C1378n("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }
            String mo5621e = m5845q.mo5621e();
            TypeAdapter typeAdapter = (TypeAdapter) r2.get(mo5621e);
            if (typeAdapter != null) {
                return (R) typeAdapter.fromJsonTree(m5821a);
            }
            throw new C1378n("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " subtype named " + mo5621e + "; did you forget to register a subtype?");
        }

        @Override // com.google.gson.TypeAdapter
        public void write(C5899c c5899c, R r10) {
            Class<?> cls = r10.getClass();
            String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
            TypeAdapter typeAdapter = (TypeAdapter) r3.get(cls);
            if (typeAdapter == null) {
                throw new C1378n("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
            }
            C1377m m5836c = typeAdapter.toJsonTree(r10).m5836c();
            if (m5836c.m5844p(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                throw new C1378n("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }
            C1377m c1377m = new C1377m();
            c1377m.m5842n(RuntimeTypeAdapterFactory.this.typeFieldName, new C1379o(str));
            for (Map.Entry<String, AbstractC1374j> entry : m5836c.m5843o()) {
                c1377m.m5842n(entry.getKey(), entry.getValue());
            }
            C1368k.m5822b(c1377m, c5899c);
        }
    }

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
    }

    /* renamed from: of */
    public static <T> RuntimeTypeAdapterFactory<T> m4696of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, ImagePickerCache.MAP_KEY_TYPE);
    }

    /* renamed from: of */
    public static <T> RuntimeTypeAdapterFactory<T> m4697of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    @Override // com.google.gson.InterfaceC1386v
    public <R> TypeAdapter<R> create(Gson gson, C5740a<R> c5740a) {
        if (c5740a.getRawType() != this.baseType) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            TypeAdapter<T> m5589l = gson.m5589l(this, C5740a.get((Class) entry.getValue()));
            linkedHashMap.put(entry.getKey(), m5589l);
            linkedHashMap2.put(entry.getValue(), m5589l);
        }
        return new TypeAdapter<R>() { // from class: com.dexterous.flutterlocalnotifications.RuntimeTypeAdapterFactory.1
            public final /* synthetic */ Map val$labelToDelegate;
            public final /* synthetic */ Map val$subtypeToDelegate;

            public C11401(Map linkedHashMap3, Map linkedHashMap22) {
                r2 = linkedHashMap3;
                r3 = linkedHashMap22;
            }

            @Override // com.google.gson.TypeAdapter
            public R read(C5897a c5897a) {
                AbstractC1374j m5821a = C1368k.m5821a(c5897a);
                AbstractC1374j m5845q = m5821a.m5836c().m5845q(RuntimeTypeAdapterFactory.this.typeFieldName);
                if (m5845q == null) {
                    throw new C1378n("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                String mo5621e = m5845q.mo5621e();
                TypeAdapter typeAdapter = (TypeAdapter) r2.get(mo5621e);
                if (typeAdapter != null) {
                    return (R) typeAdapter.fromJsonTree(m5821a);
                }
                throw new C1378n("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " subtype named " + mo5621e + "; did you forget to register a subtype?");
            }

            @Override // com.google.gson.TypeAdapter
            public void write(C5899c c5899c, R r10) {
                Class<?> cls = r10.getClass();
                String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
                TypeAdapter typeAdapter = (TypeAdapter) r3.get(cls);
                if (typeAdapter == null) {
                    throw new C1378n("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
                }
                C1377m m5836c = typeAdapter.toJsonTree(r10).m5836c();
                if (m5836c.m5844p(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                    throw new C1378n("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                C1377m c1377m = new C1377m();
                c1377m.m5842n(RuntimeTypeAdapterFactory.this.typeFieldName, new C1379o(str));
                for (Map.Entry<String, AbstractC1374j> entry2 : m5836c.m5843o()) {
                    c1377m.m5842n(entry2.getKey(), entry2.getValue());
                }
                C1368k.m5822b(c1377m, c5899c);
            }
        }.nullSafe();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }
}
