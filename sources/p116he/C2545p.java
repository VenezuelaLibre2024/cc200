package p116he;

import ae.C0108n;
import ae.C0109o;
import gd.C2227a;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import p115hd.C2503o;
import p115hd.C2507s;
import p115hd.C2510v;
import p243qd.C4236c;
import td.C4753m;

/* renamed from: he.p */
/* loaded from: classes2.dex */
public final class C2545p {

    /* renamed from: a */
    public static final C2545p f9993a = new C2545p();

    /* renamed from: a */
    public final <S> S m10141a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    public final <S> List<S> m10142b(Class<S> cls, ClassLoader classLoader) {
        try {
            return m10144d(cls, classLoader);
        } catch (Throwable unused) {
            return C2510v.m10008K(ServiceLoader.load(cls, classLoader));
        }
    }

    /* renamed from: c */
    public final List<InterfaceC2562z> m10143c() {
        InterfaceC2562z interfaceC2562z;
        if (!C2547q.m10153a()) {
            return m10142b(InterfaceC2562z.class, InterfaceC2562z.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            InterfaceC2562z interfaceC2562z2 = null;
            try {
                interfaceC2562z = (InterfaceC2562z) InterfaceC2562z.class.cast(Class.forName("de.a", true, InterfaceC2562z.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                interfaceC2562z = null;
            }
            if (interfaceC2562z != null) {
                arrayList.add(interfaceC2562z);
            }
            try {
                interfaceC2562z2 = (InterfaceC2562z) InterfaceC2562z.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, InterfaceC2562z.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (interfaceC2562z2 == null) {
                return arrayList;
            }
            arrayList.add(interfaceC2562z2);
            return arrayList;
        } catch (Throwable unused3) {
            return m10142b(InterfaceC2562z.class, InterfaceC2562z.class.getClassLoader());
        }
    }

    /* renamed from: d */
    public final <S> List<S> m10144d(Class<S> cls, ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        C4753m.m18652e(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2507s.m9997m(arrayList, f9993a.m10145e((URL) it.next()));
        }
        Set m10012O = C2510v.m10012O(arrayList);
        if (!(!m10012O.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        ArrayList arrayList2 = new ArrayList(C2503o.m9995k(m10012O, 10));
        Iterator it2 = m10012O.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f9993a.m10141a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }

    /* renamed from: e */
    public final List<String> m10145e(URL url) {
        BufferedReader bufferedReader;
        String url2 = url.toString();
        if (!C0108n.m433s(url2, "jar", false, 2, null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> m10146f = f9993a.m10146f(bufferedReader);
                C4236c.m16274a(bufferedReader, null);
                return m10146f;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        String m477r0 = C0109o.m477r0(C0109o.m472m0(url2, "jar:file:", null, 2, null), '!', null, 2, null);
        String m472m0 = C0109o.m472m0(url2, "!/", null, 2, null);
        JarFile jarFile = new JarFile(m477r0, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(m472m0)), "UTF-8"));
            try {
                List<String> m10146f2 = f9993a.m10146f(bufferedReader);
                C4236c.m16274a(bufferedReader, null);
                jarFile.close();
                return m10146f2;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    jarFile.close();
                    throw th3;
                } catch (Throwable th4) {
                    C2227a.m8956a(th2, th4);
                    throw th2;
                }
            }
        }
    }

    /* renamed from: f */
    public final List<String> m10146f(BufferedReader bufferedReader) {
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return C2510v.m10008K(linkedHashSet);
            }
            String obj = C0109o.m480t0(C0109o.m478s0(readLine, "#", null, 2, null)).toString();
            int i10 = 0;
            while (true) {
                if (i10 >= obj.length()) {
                    z10 = true;
                    break;
                }
                char charAt = obj.charAt(i10);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (!z10) {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
            if (obj.length() > 0) {
                linkedHashSet.add(obj);
            }
        }
    }
}
