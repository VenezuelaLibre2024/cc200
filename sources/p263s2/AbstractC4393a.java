package p263s2;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: s2.a */
/* loaded from: classes.dex */
public abstract class AbstractC4393a {

    /* renamed from: f */
    public static InterfaceC4396d f16119f;

    /* renamed from: a */
    public static final Set<String> f16114a = Collections.synchronizedSet(new HashSet());

    /* renamed from: b */
    public static final Set<String> f16115b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public static final Set<String> f16116c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d */
    public static final Set<String> f16117d = Collections.synchronizedSet(new HashSet());

    /* renamed from: e */
    public static boolean f16118e = false;

    /* renamed from: g */
    public static boolean f16120g = false;

    /* renamed from: h */
    public static boolean f16121h = true;

    /* renamed from: i */
    public static boolean f16122i = true;

    /* renamed from: a */
    public static int m16988a(StringBuilder sb2, String str, int i10, StackTraceElement stackTraceElement, boolean z10, boolean z11, String str2) {
        String mo17009c;
        if (i10 > 0) {
            if (f16119f == null) {
                throw new IllegalArgumentException("Stack trace element serializer not initialized.");
            }
            sb2.append(str2);
            if (i10 == 1) {
                mo17009c = f16119f.mo17008b(stackTraceElement, z10, z11);
            } else {
                sb2.append(String.format("%s%s ... %d more", f16119f.mo17007a(stackTraceElement), str, Integer.valueOf(i10 - 1)));
                if (z11) {
                    mo17009c = f16119f.mo17009c(stackTraceElement);
                }
            }
            sb2.append(mo17009c);
        }
        return 0;
    }

    /* renamed from: b */
    public static boolean m16989b(String str, Set<String> set) {
        return m16990c(str, set) != null;
    }

    /* renamed from: c */
    public static String m16990c(String str, Set<String> set) {
        for (String str2 : set) {
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static StackTraceElement[] m16991d(C4398f c4398f, int i10) {
        ArrayList arrayList = new ArrayList();
        if (c4398f != null) {
            C4397e[] m17014d = c4398f.m17014d();
            for (int i11 = 0; i11 < m17014d.length && i11 < i10; i11++) {
                arrayList.add(m17014d[i11].m17010a());
            }
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    /* renamed from: e */
    public static StackTraceElement[] m16992e(C4398f c4398f, Set<String> set, Set<String> set2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (c4398f != null) {
            for (C4397e c4397e : c4398f.m17014d()) {
                String className = c4397e.m17010a().getClassName();
                if (!m16998k(className)) {
                    if (m16989b(className, set)) {
                        arrayList.addAll(arrayList2);
                        arrayList.add(c4397e.m17010a());
                    } else if (!m16989b(className, set2)) {
                        arrayList2.add(c4397e.m17010a());
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(arrayList2);
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    /* renamed from: f */
    public static String m16993f(C4398f c4398f) {
        return m16995h(c4398f, f16114a, f16115b, f16116c, 0, f16118e, f16120g);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b A[LOOP:1: B:42:0x0129->B:43:0x012b, LOOP_END] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m16994g(p263s2.C4398f r22, java.lang.String r23, boolean r24, boolean r25, java.util.Set<java.lang.String> r26, java.util.Set<java.lang.String> r27, java.util.Set<java.lang.String> r28, int r29, boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p263s2.AbstractC4393a.m16994g(s2.f, java.lang.String, boolean, boolean, java.util.Set, java.util.Set, java.util.Set, int, boolean, boolean, boolean, boolean):java.lang.String");
    }

    /* renamed from: h */
    public static String m16995h(C4398f c4398f, Set<String> set, Set<String> set2, Set<String> set3, int i10, boolean z10, boolean z11) {
        return m16996i(c4398f, set, set2, set3, i10, z10, z11, f16121h);
    }

    /* renamed from: i */
    public static String m16996i(C4398f c4398f, Set<String> set, Set<String> set2, Set<String> set3, int i10, boolean z10, boolean z11, boolean z12) {
        return m16997j(c4398f, false, false, set, set2, set3, i10, z10, z11, z12, f16122i);
    }

    /* renamed from: j */
    public static String m16997j(C4398f c4398f, boolean z10, boolean z11, Set<String> set, Set<String> set2, Set<String> set3, int i10, boolean z12, boolean z13, boolean z14, boolean z15) {
        return m16994g(c4398f, "", z10, z11, set, set2, set3, i10, z12, z13, z14, z15);
    }

    /* renamed from: k */
    public static boolean m16998k(String str) {
        return str == null || str.trim().length() == 0;
    }

    /* renamed from: l */
    public static String m16999l(Class<?> cls) {
        String url;
        int lastIndexOf;
        if (cls == null) {
            return null;
        }
        try {
            URL resource = cls.getClassLoader().getResource(cls.getName().replace('.', '/') + ".class");
            if (resource == null || (lastIndexOf = (url = resource.toString()).lastIndexOf(33)) <= 0) {
                return null;
            }
            String substring = url.substring(0, lastIndexOf);
            int lastIndexOf2 = substring.lastIndexOf(47);
            if (lastIndexOf2 > 0) {
                substring = substring.substring(lastIndexOf2 + 1);
            }
            int lastIndexOf3 = substring.lastIndexOf(92);
            return lastIndexOf3 > 0 ? substring.substring(lastIndexOf3 + 1) : substring;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static String m17000m(String str, String str2) {
        boolean z10 = str != null;
        boolean z11 = str2 != null;
        if (!z10 && !z11) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" [");
        if (z10) {
            sb2.append(str);
        }
        if (z11) {
            if (z10) {
                if (!str.contains(str2)) {
                    sb2.append(":");
                }
            }
            sb2.append(str2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: n */
    public static String m17001n(String str) {
        int lastIndexOf;
        return (str != null && (lastIndexOf = str.lastIndexOf(".")) >= 0) ? str.substring(0, lastIndexOf) : "";
    }

    /* renamed from: o */
    public static void m17002o(String str) {
        f16114a.add(str);
    }

    /* renamed from: p */
    public static void m17003p(InterfaceC4396d interfaceC4396d) {
        f16119f = interfaceC4396d;
    }

    /* renamed from: q */
    public static String m17004q(InterfaceC4395c interfaceC4395c, Class<?> cls, String str) {
        try {
            Package r02 = cls.getPackage();
            if (r02 != null) {
                return r02.getImplementationVersion();
            }
            Package mo17006a = interfaceC4395c.mo17006a(cls.getClassLoader(), str);
            if (mo17006a != null) {
                return mo17006a.getImplementationVersion();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
