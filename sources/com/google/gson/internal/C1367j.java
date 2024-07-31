package com.google.gson.internal;

import java.lang.reflect.Type;

/* renamed from: com.google.gson.internal.j */
/* loaded from: classes.dex */
public final class C1367j {
    /* renamed from: a */
    public static boolean m5820a(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }
}
