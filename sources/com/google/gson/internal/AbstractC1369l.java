package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.google.gson.internal.l */
/* loaded from: classes.dex */
public abstract class AbstractC1369l {

    /* renamed from: com.google.gson.internal.l$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC1369l {

        /* renamed from: a */
        public final /* synthetic */ Method f5196a;

        /* renamed from: b */
        public final /* synthetic */ Object f5197b;

        public a(Method method, Object obj) {
            this.f5196a = method;
            this.f5197b = obj;
        }

        @Override // com.google.gson.internal.AbstractC1369l
        /* renamed from: c */
        public <T> T mo5826c(Class<T> cls) {
            AbstractC1369l.m5824a(cls);
            return (T) this.f5196a.invoke(this.f5197b, cls);
        }
    }

    /* renamed from: com.google.gson.internal.l$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC1369l {

        /* renamed from: a */
        public final /* synthetic */ Method f5198a;

        /* renamed from: b */
        public final /* synthetic */ int f5199b;

        public b(Method method, int i10) {
            this.f5198a = method;
            this.f5199b = i10;
        }

        @Override // com.google.gson.internal.AbstractC1369l
        /* renamed from: c */
        public <T> T mo5826c(Class<T> cls) {
            AbstractC1369l.m5824a(cls);
            return (T) this.f5198a.invoke(null, cls, Integer.valueOf(this.f5199b));
        }
    }

    /* renamed from: com.google.gson.internal.l$c */
    /* loaded from: classes.dex */
    public class c extends AbstractC1369l {

        /* renamed from: a */
        public final /* synthetic */ Method f5200a;

        public c(Method method) {
            this.f5200a = method;
        }

        @Override // com.google.gson.internal.AbstractC1369l
        /* renamed from: c */
        public <T> T mo5826c(Class<T> cls) {
            AbstractC1369l.m5824a(cls);
            return (T) this.f5200a.invoke(null, cls, Object.class);
        }
    }

    /* renamed from: com.google.gson.internal.l$d */
    /* loaded from: classes.dex */
    public class d extends AbstractC1369l {
        @Override // com.google.gson.internal.AbstractC1369l
        /* renamed from: c */
        public <T> T mo5826c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    /* renamed from: a */
    public static void m5824a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    /* renamed from: b */
    public static AbstractC1369l m5825b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                }
            } catch (Exception unused3) {
                return new d();
            }
        }
    }

    /* renamed from: c */
    public abstract <T> T mo5826c(Class<T> cls);
}
