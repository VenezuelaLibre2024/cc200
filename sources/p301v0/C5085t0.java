package p301v0;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import p301v0.AbstractC5096y;

/* renamed from: v0.t0 */
/* loaded from: classes.dex */
public final class C5085t0 {
    /* renamed from: a */
    public static final String m20570a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static boolean m20571b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            obj2 = "";
        } else {
            if (!(obj instanceof AbstractC5048h)) {
                return obj instanceof InterfaceC5079r0 ? obj == ((InterfaceC5079r0) obj).mo20526b() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
            }
            obj2 = AbstractC5048h.f18921i;
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    public static final void m20572c(StringBuilder sb2, int i10, String str, Object obj) {
        String m20349a;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m20572c(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m20572c(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            m20349a = C5062l1.m20351c((String) obj);
        } else {
            if (!(obj instanceof AbstractC5048h)) {
                if (obj instanceof AbstractC5096y) {
                    sb2.append(" {");
                    m20573d((AbstractC5096y) obj, sb2, i10 + 2);
                    sb2.append("\n");
                    while (i11 < i10) {
                        sb2.append(' ');
                        i11++;
                    }
                } else {
                    if (!(obj instanceof Map.Entry)) {
                        sb2.append(": ");
                        sb2.append(obj.toString());
                        return;
                    }
                    sb2.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i13 = i10 + 2;
                    m20572c(sb2, i13, Constants.KEY, entry.getKey());
                    m20572c(sb2, i13, "value", entry.getValue());
                    sb2.append("\n");
                    while (i11 < i10) {
                        sb2.append(' ');
                        i11++;
                    }
                }
                sb2.append("}");
                return;
            }
            sb2.append(": \"");
            m20349a = C5062l1.m20349a((AbstractC5048h) obj);
        }
        sb2.append(m20349a);
        sb2.append('\"');
    }

    /* renamed from: d */
    public static void m20573d(InterfaceC5079r0 interfaceC5079r0, StringBuilder sb2, int i10) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC5079r0.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String replaceFirst = str.replaceFirst("get", "");
            boolean z10 = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m20572c(sb2, i10, m20570a(str2), AbstractC5096y.m20691A(method2, interfaceC5079r0, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m20572c(sb2, i10, m20570a(str3), AbstractC5096y.m20691A(method3, interfaceC5079r0, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + replaceFirst)) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get" + replaceFirst);
                Method method5 = (Method) hashMap.get("has" + replaceFirst);
                if (method4 != null) {
                    Object m20691A = AbstractC5096y.m20691A(method4, interfaceC5079r0, new Object[0]);
                    if (method5 != null) {
                        z10 = ((Boolean) AbstractC5096y.m20691A(method5, interfaceC5079r0, new Object[0])).booleanValue();
                    } else if (m20571b(m20691A)) {
                        z10 = false;
                    }
                    if (z10) {
                        m20572c(sb2, i10, m20570a(str4), m20691A);
                    }
                }
            }
        }
        if (interfaceC5079r0 instanceof AbstractC5096y.c) {
            Iterator<Map.Entry<AbstractC5096y.d, Object>> m20601s = ((AbstractC5096y.c) interfaceC5079r0).extensions.m20601s();
            while (m20601s.hasNext()) {
                Map.Entry<AbstractC5096y.d, Object> next = m20601s.next();
                m20572c(sb2, i10, "[" + next.getKey().mo20607a() + "]", next.getValue());
            }
        }
        C5071o1 c5071o1 = ((AbstractC5096y) interfaceC5079r0).unknownFields;
        if (c5071o1 != null) {
            c5071o1.m20415m(sb2, i10);
        }
    }

    /* renamed from: e */
    public static String m20574e(InterfaceC5079r0 interfaceC5079r0, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m20573d(interfaceC5079r0, sb2, 0);
        return sb2.toString();
    }
}
