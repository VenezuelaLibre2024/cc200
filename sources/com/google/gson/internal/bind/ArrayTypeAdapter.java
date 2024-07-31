package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C1310b;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;
import p355y9.EnumC5898b;

/* loaded from: classes.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c */
    public static final InterfaceC1386v f5001c = new InterfaceC1386v() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.InterfaceC1386v
        public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
            Type type = c5740a.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type m5643g = C1310b.m5643g(type);
            return new ArrayTypeAdapter(gson, gson.m5588k(C5740a.get(m5643g)), C1310b.m5647k(m5643g));
        }
    };

    /* renamed from: a */
    public final Class<E> f5002a;

    /* renamed from: b */
    public final TypeAdapter<E> f5003b;

    /* renamed from: com.google.gson.internal.bind.ArrayTypeAdapter$1 */
    /* loaded from: classes.dex */
    public class C13111 implements InterfaceC1386v {
        @Override // com.google.gson.InterfaceC1386v
        public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
            Type type = c5740a.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type m5643g = C1310b.m5643g(type);
            return new ArrayTypeAdapter(gson, gson.m5588k(C5740a.get(m5643g)), C1310b.m5647k(m5643g));
        }
    }

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f5003b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f5002a = cls;
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(C5897a c5897a) {
        if (c5897a.mo5774r0() == EnumC5898b.NULL) {
            c5897a.mo5770h0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c5897a.mo5764a();
        while (c5897a.mo5755E()) {
            arrayList.add(this.f5003b.read(c5897a));
        }
        c5897a.mo5772n();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f5002a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(C5899c c5899c, Object obj) {
        if (obj == null) {
            c5899c.mo5779W();
            return;
        }
        c5899c.mo5780f();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f5003b.write(c5899c, Array.get(obj, i10));
        }
        c5899c.mo5782n();
    }
}
