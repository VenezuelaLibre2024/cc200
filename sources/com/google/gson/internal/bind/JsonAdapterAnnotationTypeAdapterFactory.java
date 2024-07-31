package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.InterfaceC1307i;
import com.google.gson.InterfaceC1381q;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C1360c;
import p295u9.InterfaceC4995b;
import p339x9.C5740a;

/* loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements InterfaceC1386v {

    /* renamed from: h */
    public final C1360c f5013h;

    public JsonAdapterAnnotationTypeAdapterFactory(C1360c c1360c) {
        this.f5013h = c1360c;
    }

    /* renamed from: a */
    public TypeAdapter<?> m5670a(C1360c c1360c, Gson gson, C5740a<?> c5740a, InterfaceC4995b interfaceC4995b) {
        TypeAdapter<?> treeTypeAdapter;
        Object mo5794a = c1360c.m5790a(C5740a.get((Class) interfaceC4995b.value())).mo5794a();
        if (mo5794a instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) mo5794a;
        } else if (mo5794a instanceof InterfaceC1386v) {
            treeTypeAdapter = ((InterfaceC1386v) mo5794a).create(gson, c5740a);
        } else {
            boolean z10 = mo5794a instanceof InterfaceC1381q;
            if (!z10 && !(mo5794a instanceof InterfaceC1307i)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + mo5794a.getClass().getName() + " as a @JsonAdapter for " + c5740a.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z10 ? (InterfaceC1381q) mo5794a : null, mo5794a instanceof InterfaceC1307i ? (InterfaceC1307i) mo5794a : null, gson, c5740a, null);
        }
        return (treeTypeAdapter == null || !interfaceC4995b.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.nullSafe();
    }

    @Override // com.google.gson.InterfaceC1386v
    public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
        InterfaceC4995b interfaceC4995b = (InterfaceC4995b) c5740a.getRawType().getAnnotation(InterfaceC4995b.class);
        if (interfaceC4995b == null) {
            return null;
        }
        return (TypeAdapter<T>) m5670a(this.f5013h, gson, c5740a, interfaceC4995b);
    }
}
