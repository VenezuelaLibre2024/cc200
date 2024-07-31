package td;

import ae.C0109o;
import gd.C2236j;
import gd.C2240n;
import gd.InterfaceC2228b;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p115hd.C2486d0;
import p115hd.C2488e0;
import p115hd.C2502n;
import p115hd.C2503o;
import p259rd.C4344a;
import p359yd.InterfaceC5913c;
import sd.InterfaceC4569a;
import sd.InterfaceC4570b;
import sd.InterfaceC4571c;
import sd.InterfaceC4572d;
import sd.InterfaceC4573e;
import sd.InterfaceC4574f;
import sd.InterfaceC4575g;
import sd.InterfaceC4576h;
import sd.InterfaceC4577i;
import sd.InterfaceC4578j;
import sd.InterfaceC4579k;
import sd.InterfaceC4580l;
import sd.InterfaceC4581m;
import sd.InterfaceC4582n;
import sd.InterfaceC4583o;
import sd.InterfaceC4584p;
import sd.InterfaceC4585q;
import sd.InterfaceC4586r;
import sd.InterfaceC4587s;
import sd.InterfaceC4588t;
import sd.InterfaceC4589u;
import sd.InterfaceC4590v;
import sd.InterfaceC4591w;

/* renamed from: td.e */
/* loaded from: classes2.dex */
public final class C4745e implements InterfaceC5913c<Object>, InterfaceC4744d {

    /* renamed from: i */
    public static final a f17717i = new a(null);

    /* renamed from: j */
    public static final Map<Class<? extends InterfaceC2228b<?>>, Integer> f17718j;

    /* renamed from: k */
    public static final HashMap<String, String> f17719k;

    /* renamed from: l */
    public static final HashMap<String, String> f17720l;

    /* renamed from: m */
    public static final HashMap<String, String> f17721m;

    /* renamed from: n */
    public static final Map<String, String> f17722n;

    /* renamed from: h */
    public final Class<?> f17723h;

    /* renamed from: td.e$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final String m18643a(Class<?> cls) {
            String str;
            C4753m.m18653f(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        C4753m.m18652e(simpleName, "name");
                        String m472m0 = C0109o.m472m0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                        if (m472m0 != null) {
                            return m472m0;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    C4753m.m18652e(simpleName, "name");
                    if (enclosingConstructor == null) {
                        return C0109o.m471l0(simpleName, '$', null, 2, null);
                    }
                    return C0109o.m472m0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                }
                if (!cls.isArray()) {
                    String str3 = (String) C4745e.f17722n.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C4745e.f17722n.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "Array";
                }
            }
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 0;
        List m9991g = C2502n.m9991g(InterfaceC4569a.class, InterfaceC4580l.class, InterfaceC4584p.class, InterfaceC4585q.class, InterfaceC4586r.class, InterfaceC4587s.class, InterfaceC4588t.class, InterfaceC4589u.class, InterfaceC4590v.class, InterfaceC4591w.class, InterfaceC4570b.class, InterfaceC4571c.class, InterfaceC4572d.class, InterfaceC4573e.class, InterfaceC4574f.class, InterfaceC4575g.class, InterfaceC4576h.class, InterfaceC4577i.class, InterfaceC4578j.class, InterfaceC4579k.class, InterfaceC4581m.class, InterfaceC4582n.class, InterfaceC4583o.class);
        ArrayList arrayList = new ArrayList(C2503o.m9995k(m9991g, 10));
        for (Object obj : m9991g) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C2502n.m9994j();
            }
            arrayList.add(C2240n.m8977a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f17718j = C2488e0.m9902j(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f17719k = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f17720l = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C4753m.m18652e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            C4753m.m18652e(str, "kotlinName");
            sb2.append(C0109o.m474o0(str, '.', null, 2, null));
            sb2.append("CompanionObject");
            C2236j m8977a = C2240n.m8977a(sb2.toString(), str + ".Companion");
            hashMap3.put(m8977a.m8963c(), m8977a.m8964d());
        }
        for (Map.Entry<Class<? extends InterfaceC2228b<?>>, Integer> entry : f17718j.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f17721m = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2486d0.m9892a(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), C0109o.m474o0((String) entry2.getValue(), '.', null, 2, null));
        }
        f17722n = linkedHashMap;
    }

    public C4745e(Class<?> cls) {
        C4753m.m18653f(cls, "jClass");
        this.f17723h = cls;
    }

    @Override // p359yd.InterfaceC5913c
    /* renamed from: a */
    public String mo18642a() {
        return f17717i.m18643a(mo18640b());
    }

    @Override // td.InterfaceC4744d
    /* renamed from: b */
    public Class<?> mo18640b() {
        return this.f17723h;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4745e) && C4753m.m18648a(C4344a.m16631b(this), C4344a.m16631b((InterfaceC5913c) obj));
    }

    public int hashCode() {
        return C4344a.m16631b(this).hashCode();
    }

    public String toString() {
        return mo18640b().toString() + " (Kotlin reflection is not available)";
    }
}
