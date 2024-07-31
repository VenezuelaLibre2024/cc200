package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: com.google.gson.internal.b */
/* loaded from: classes.dex */
public final class C1310b {

    /* renamed from: a */
    public static final Type[] f4994a = new Type[0];

    /* renamed from: com.google.gson.internal.b$a */
    /* loaded from: classes.dex */
    public static final class a implements GenericArrayType, Serializable {

        /* renamed from: h */
        public final Type f4995h;

        public a(Type type) {
            this.f4995h = C1310b.m5638b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C1310b.m5642f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f4995h;
        }

        public int hashCode() {
            return this.f4995h.hashCode();
        }

        public String toString() {
            return C1310b.m5657u(this.f4995h) + "[]";
        }
    }

    /* renamed from: com.google.gson.internal.b$b */
    /* loaded from: classes.dex */
    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: h */
        public final Type f4996h;

        /* renamed from: i */
        public final Type f4997i;

        /* renamed from: j */
        public final Type[] f4998j;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z10 = true;
                boolean z11 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z11) {
                    z10 = false;
                }
                C1309a.m5635a(z10);
            }
            this.f4996h = type == null ? null : C1310b.m5638b(type);
            this.f4997i = C1310b.m5638b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f4998j = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                C1309a.m5636b(this.f4998j[i10]);
                C1310b.m5639c(this.f4998j[i10]);
                Type[] typeArr3 = this.f4998j;
                typeArr3[i10] = C1310b.m5638b(typeArr3[i10]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C1310b.m5642f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f4998j.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f4996h;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f4997i;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f4998j) ^ this.f4997i.hashCode()) ^ C1310b.m5649m(this.f4996h);
        }

        public String toString() {
            int length = this.f4998j.length;
            if (length == 0) {
                return C1310b.m5657u(this.f4997i);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(C1310b.m5657u(this.f4997i));
            sb2.append("<");
            sb2.append(C1310b.m5657u(this.f4998j[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(C1310b.m5657u(this.f4998j[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* renamed from: com.google.gson.internal.b$c */
    /* loaded from: classes.dex */
    public static final class c implements WildcardType, Serializable {

        /* renamed from: h */
        public final Type f4999h;

        /* renamed from: i */
        public final Type f5000i;

        public c(Type[] typeArr, Type[] typeArr2) {
            C1309a.m5635a(typeArr2.length <= 1);
            C1309a.m5635a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                C1309a.m5636b(typeArr[0]);
                C1310b.m5639c(typeArr[0]);
                this.f5000i = null;
                this.f4999h = C1310b.m5638b(typeArr[0]);
                return;
            }
            C1309a.m5636b(typeArr2[0]);
            C1310b.m5639c(typeArr2[0]);
            C1309a.m5635a(typeArr[0] == Object.class);
            this.f5000i = C1310b.m5638b(typeArr2[0]);
            this.f4999h = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C1310b.m5642f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f5000i;
            return type != null ? new Type[]{type} : C1310b.f4994a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f4999h};
        }

        public int hashCode() {
            Type type = this.f5000i;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f4999h.hashCode() + 31);
        }

        public String toString() {
            StringBuilder sb2;
            Type type;
            if (this.f5000i != null) {
                sb2 = new StringBuilder();
                sb2.append("? super ");
                type = this.f5000i;
            } else {
                if (this.f4999h == Object.class) {
                    return "?";
                }
                sb2 = new StringBuilder();
                sb2.append("? extends ");
                type = this.f4999h;
            }
            sb2.append(C1310b.m5657u(type));
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static GenericArrayType m5637a(Type type) {
        return new a(type);
    }

    /* renamed from: b */
    public static Type m5638b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(m5638b(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* renamed from: c */
    public static void m5639c(Type type) {
        C1309a.m5635a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* renamed from: d */
    public static Class<?> m5640d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m5641e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: f */
    public static boolean m5642f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return m5641e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m5642f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* renamed from: g */
    public static Type m5643g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m5644h(Type type, Class<?> cls) {
        Type m5648l = m5648l(type, cls, Collection.class);
        if (m5648l instanceof WildcardType) {
            m5648l = ((WildcardType) m5648l).getUpperBounds()[0];
        }
        return m5648l instanceof ParameterizedType ? ((ParameterizedType) m5648l).getActualTypeArguments()[0] : Object.class;
    }

    /* renamed from: i */
    public static Type m5645i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (interfaces[i10] == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(interfaces[i10])) {
                    return m5645i(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m5645i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: j */
    public static Type[] m5646j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type m5648l = m5648l(type, cls, Map.class);
        return m5648l instanceof ParameterizedType ? ((ParameterizedType) m5648l).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* renamed from: k */
    public static Class<?> m5647k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C1309a.m5635a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m5647k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m5647k(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* renamed from: l */
    public static Type m5648l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C1309a.m5635a(cls2.isAssignableFrom(cls));
        return m5652p(type, cls, m5645i(type, cls, cls2));
    }

    /* renamed from: m */
    public static int m5649m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: n */
    public static int m5650n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: o */
    public static ParameterizedType m5651o(Type type, Type type2, Type... typeArr) {
        return new b(type, type2, typeArr);
    }

    /* renamed from: p */
    public static Type m5652p(Type type, Class<?> cls, Type type2) {
        return m5653q(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d7, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d9, code lost:
    
        r12.put(r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00dc, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (m5641e(r1, r9) != false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>, java.util.Map] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type m5653q(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            r0 = 0
        L1:
            boolean r1 = r11 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L27
            r1 = r11
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r2 = r12.get(r1)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r2 == 0) goto L17
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r2 != r9) goto L15
            goto L16
        L15:
            r11 = r2
        L16:
            return r11
        L17:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r1, r11)
            if (r0 != 0) goto L1f
            r0 = r1
        L1f:
            java.lang.reflect.Type r11 = m5654r(r9, r10, r1)
            if (r11 != r1) goto L1
            goto Ld7
        L27:
            boolean r1 = r11 instanceof java.lang.Class
            if (r1 == 0) goto L4c
            r1 = r11
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L4c
            java.lang.Class r11 = r1.getComponentType()
            java.lang.reflect.Type r9 = m5653q(r9, r10, r11, r12)
            boolean r10 = m5641e(r11, r9)
            if (r10 == 0) goto L45
            r11 = r1
            goto Ld7
        L45:
            java.lang.reflect.GenericArrayType r9 = m5637a(r9)
        L49:
            r11 = r9
            goto Ld7
        L4c:
            boolean r1 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L62
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r1 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = m5653q(r9, r10, r1, r12)
            boolean r10 = m5641e(r1, r9)
            if (r10 == 0) goto L45
            goto Ld7
        L62:
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            r3 = 1
            if (r1 == 0) goto La6
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r1 = r11.getOwnerType()
            java.lang.reflect.Type r4 = m5653q(r9, r10, r1, r12)
            boolean r1 = m5641e(r4, r1)
            r1 = r1 ^ r3
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L7c:
            if (r2 >= r6) goto L9b
            r7 = r5[r2]
            java.lang.reflect.Type r7 = m5653q(r9, r10, r7, r12)
            r8 = r5[r2]
            boolean r8 = m5641e(r7, r8)
            if (r8 != 0) goto L98
            if (r1 != 0) goto L96
            java.lang.Object r1 = r5.clone()
            r5 = r1
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r1 = r3
        L96:
            r5[r2] = r7
        L98:
            int r2 = r2 + 1
            goto L7c
        L9b:
            if (r1 == 0) goto Ld7
            java.lang.reflect.Type r9 = r11.getRawType()
            java.lang.reflect.ParameterizedType r9 = m5651o(r4, r9, r5)
            goto L49
        La6:
            boolean r1 = r11 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto Ld7
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r1 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r1.length
            if (r5 != r3) goto Lc6
            r3 = r1[r2]
            java.lang.reflect.Type r9 = m5653q(r9, r10, r3, r12)
            r10 = r1[r2]
            if (r9 == r10) goto Ld7
            java.lang.reflect.WildcardType r11 = m5656t(r9)
            goto Ld7
        Lc6:
            int r1 = r4.length
            if (r1 != r3) goto Ld7
            r1 = r4[r2]
            java.lang.reflect.Type r9 = m5653q(r9, r10, r1, r12)
            r10 = r4[r2]
            if (r9 == r10) goto Ld7
            java.lang.reflect.WildcardType r11 = m5655s(r9)
        Ld7:
            if (r0 == 0) goto Ldc
            r12.put(r0, r11)
        Ldc:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C1310b.m5653q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    /* renamed from: r */
    public static Type m5654r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> m5640d = m5640d(typeVariable);
        if (m5640d == null) {
            return typeVariable;
        }
        Type m5645i = m5645i(type, cls, m5640d);
        if (!(m5645i instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) m5645i).getActualTypeArguments()[m5650n(m5640d.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static WildcardType m5655s(Type type) {
        return new c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f4994a);
    }

    /* renamed from: t */
    public static WildcardType m5656t(Type type) {
        return new c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    /* renamed from: u */
    public static String m5657u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
