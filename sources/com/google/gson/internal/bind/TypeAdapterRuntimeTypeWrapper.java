package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* renamed from: a */
    public final Gson f5059a;

    /* renamed from: b */
    public final TypeAdapter<T> f5060b;

    /* renamed from: c */
    public final Type f5061c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f5059a = gson;
        this.f5060b = typeAdapter;
        this.f5061c = type;
    }

    /* renamed from: a */
    public final Type m5691a(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }

    @Override // com.google.gson.TypeAdapter
    public T read(C5897a c5897a) {
        return this.f5060b.read(c5897a);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(C5899c c5899c, T t10) {
        TypeAdapter<T> typeAdapter = this.f5060b;
        Type m5691a = m5691a(this.f5061c, t10);
        if (m5691a != this.f5061c) {
            typeAdapter = this.f5059a.m5588k(C5740a.get(m5691a));
            if (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter2 = this.f5060b;
                if (!(typeAdapter2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    typeAdapter = typeAdapter2;
                }
            }
        }
        typeAdapter.write(c5899c, t10);
    }
}
