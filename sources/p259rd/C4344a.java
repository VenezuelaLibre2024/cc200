package p259rd;

import p359yd.InterfaceC5913c;
import td.C4753m;
import td.C4764x;
import td.InterfaceC4744d;

/* renamed from: rd.a */
/* loaded from: classes2.dex */
public final class C4344a {
    /* renamed from: a */
    public static final <T> Class<T> m16630a(InterfaceC5913c<T> interfaceC5913c) {
        C4753m.m18653f(interfaceC5913c, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC4744d) interfaceC5913c).mo18640b();
        C4753m.m18651d(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    /* renamed from: b */
    public static final <T> Class<T> m16631b(InterfaceC5913c<T> interfaceC5913c) {
        C4753m.m18653f(interfaceC5913c, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC4744d) interfaceC5913c).mo18640b();
        if (!cls.isPrimitive()) {
            C4753m.m18651d(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        C4753m.m18651d(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    /* renamed from: c */
    public static final <T> InterfaceC5913c<T> m16632c(Class<T> cls) {
        C4753m.m18653f(cls, "<this>");
        return C4764x.m18672b(cls);
    }
}
