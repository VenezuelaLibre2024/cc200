package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C1310b;
import com.google.gson.internal.C1360c;
import com.google.gson.internal.InterfaceC1365h;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;
import p355y9.EnumC5898b;

/* loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements InterfaceC1386v {

    /* renamed from: h */
    public final C1360c f5004h;

    /* loaded from: classes.dex */
    public static final class Adapter<E> extends TypeAdapter<Collection<E>> {

        /* renamed from: a */
        public final TypeAdapter<E> f5005a;

        /* renamed from: b */
        public final InterfaceC1365h<? extends Collection<E>> f5006b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, InterfaceC1365h<? extends Collection<E>> interfaceC1365h) {
            this.f5005a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f5006b = interfaceC1365h;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Collection<E> read(C5897a c5897a) {
            if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                c5897a.mo5770h0();
                return null;
            }
            Collection<E> mo5794a = this.f5006b.mo5794a();
            c5897a.mo5764a();
            while (c5897a.mo5755E()) {
                mo5794a.add(this.f5005a.read(c5897a));
            }
            c5897a.mo5772n();
            return mo5794a;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, Collection<E> collection) {
            if (collection == null) {
                c5899c.mo5779W();
                return;
            }
            c5899c.mo5780f();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f5005a.write(c5899c, it.next());
            }
            c5899c.mo5782n();
        }
    }

    public CollectionTypeAdapterFactory(C1360c c1360c) {
        this.f5004h = c1360c;
    }

    @Override // com.google.gson.InterfaceC1386v
    public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
        Type type = c5740a.getType();
        Class<? super T> rawType = c5740a.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type m5644h = C1310b.m5644h(type, rawType);
        return new Adapter(gson, m5644h, gson.m5588k(C5740a.get(m5644h)), this.f5004h.m5790a(c5740a));
    }
}
