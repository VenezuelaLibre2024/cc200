package com.google.gson.internal.bind;

import com.google.gson.AbstractC1374j;
import com.google.gson.C1379o;
import com.google.gson.C1382r;
import com.google.gson.Gson;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.AbstractC1362e;
import com.google.gson.internal.C1310b;
import com.google.gson.internal.C1360c;
import com.google.gson.internal.C1368k;
import com.google.gson.internal.InterfaceC1365h;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;
import p355y9.EnumC5898b;

/* loaded from: classes.dex */
public final class MapTypeAdapterFactory implements InterfaceC1386v {

    /* renamed from: h */
    public final C1360c f5014h;

    /* renamed from: i */
    public final boolean f5015i;

    /* loaded from: classes.dex */
    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* renamed from: a */
        public final TypeAdapter<K> f5016a;

        /* renamed from: b */
        public final TypeAdapter<V> f5017b;

        /* renamed from: c */
        public final InterfaceC1365h<? extends Map<K, V>> f5018c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, InterfaceC1365h<? extends Map<K, V>> interfaceC1365h) {
            this.f5016a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f5017b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f5018c = interfaceC1365h;
        }

        /* renamed from: a */
        public final String m5672a(AbstractC1374j abstractC1374j) {
            if (!abstractC1374j.m5841m()) {
                if (abstractC1374j.m5839j()) {
                    return "null";
                }
                throw new AssertionError();
            }
            C1379o m5837d = abstractC1374j.m5837d();
            if (m5837d.m5852u()) {
                return String.valueOf(m5837d.m5850q());
            }
            if (m5837d.m5851s()) {
                return Boolean.toString(m5837d.mo5620a());
            }
            if (m5837d.m5853v()) {
                return m5837d.mo5621e();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public Map<K, V> read(C5897a c5897a) {
            EnumC5898b mo5774r0 = c5897a.mo5774r0();
            if (mo5774r0 == EnumC5898b.NULL) {
                c5897a.mo5770h0();
                return null;
            }
            Map<K, V> mo5794a = this.f5018c.mo5794a();
            if (mo5774r0 == EnumC5898b.BEGIN_ARRAY) {
                c5897a.mo5764a();
                while (c5897a.mo5755E()) {
                    c5897a.mo5764a();
                    K read = this.f5016a.read(c5897a);
                    if (mo5794a.put(read, this.f5017b.read(c5897a)) != null) {
                        throw new C1382r("duplicate key: " + read);
                    }
                    c5897a.mo5772n();
                }
                c5897a.mo5772n();
            } else {
                c5897a.mo5767d();
                while (c5897a.mo5755E()) {
                    AbstractC1362e.f5167a.mo5801a(c5897a);
                    K read2 = this.f5016a.read(c5897a);
                    if (mo5794a.put(read2, this.f5017b.read(c5897a)) != null) {
                        throw new C1382r("duplicate key: " + read2);
                    }
                }
                c5897a.mo5775w();
            }
            return mo5794a;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void write(C5899c c5899c, Map<K, V> map) {
            if (map == null) {
                c5899c.mo5779W();
                return;
            }
            if (!MapTypeAdapterFactory.this.f5015i) {
                c5899c.mo5781j();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    c5899c.mo5778K(String.valueOf(entry.getKey()));
                    this.f5017b.write(c5899c, entry.getValue());
                }
                c5899c.mo5787w();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                AbstractC1374j jsonTree = this.f5016a.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z10 |= jsonTree.m5838h() || jsonTree.m5840k();
            }
            if (!z10) {
                c5899c.mo5781j();
                int size = arrayList.size();
                while (i10 < size) {
                    c5899c.mo5778K(m5672a((AbstractC1374j) arrayList.get(i10)));
                    this.f5017b.write(c5899c, arrayList2.get(i10));
                    i10++;
                }
                c5899c.mo5787w();
                return;
            }
            c5899c.mo5780f();
            int size2 = arrayList.size();
            while (i10 < size2) {
                c5899c.mo5780f();
                C1368k.m5822b((AbstractC1374j) arrayList.get(i10), c5899c);
                this.f5017b.write(c5899c, arrayList2.get(i10));
                c5899c.mo5782n();
                i10++;
            }
            c5899c.mo5782n();
        }
    }

    public MapTypeAdapterFactory(C1360c c1360c, boolean z10) {
        this.f5014h = c1360c;
        this.f5015i = z10;
    }

    /* renamed from: a */
    public final TypeAdapter<?> m5671a(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f5090f : gson.m5588k(C5740a.get(type));
    }

    @Override // com.google.gson.InterfaceC1386v
    public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
        Type type = c5740a.getType();
        if (!Map.class.isAssignableFrom(c5740a.getRawType())) {
            return null;
        }
        Type[] m5646j = C1310b.m5646j(type, C1310b.m5647k(type));
        return new Adapter(gson, m5646j[0], m5671a(gson, m5646j[0]), m5646j[1], gson.m5588k(C5740a.get(m5646j[1])), this.f5014h.m5790a(c5740a));
    }
}
