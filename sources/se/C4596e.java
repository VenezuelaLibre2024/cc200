package se;

import bf.C0557c;
import bf.C0560f;
import bf.C0567m;
import bf.C0575u;
import bf.InterfaceC0574t;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import p344xe.C5770c;
import re.AbstractC4351c0;
import re.AbstractC4355e0;
import re.C4373u;
import re.C4374v;

/* renamed from: se.e */
/* loaded from: classes2.dex */
public final class C4596e {

    /* renamed from: a */
    public static final byte[] f17230a;

    /* renamed from: d */
    public static final AbstractC4355e0 f17233d;

    /* renamed from: e */
    public static final AbstractC4351c0 f17234e;

    /* renamed from: k */
    public static final Method f17240k;

    /* renamed from: l */
    public static final Pattern f17241l;

    /* renamed from: b */
    public static final String[] f17231b = new String[0];

    /* renamed from: c */
    public static final C4373u f17232c = C4373u.m16827g(new String[0]);

    /* renamed from: f */
    public static final C0567m f17235f = C0567m.m2905d(C0560f.m2857h("efbbbf"), C0560f.m2857h("feff"), C0560f.m2857h("fffe"), C0560f.m2857h("0000ffff"), C0560f.m2857h("ffff0000"));

    /* renamed from: g */
    public static final Charset f17236g = Charset.forName("UTF-32BE");

    /* renamed from: h */
    public static final Charset f17237h = Charset.forName("UTF-32LE");

    /* renamed from: i */
    public static final TimeZone f17238i = TimeZone.getTimeZone("GMT");

    /* renamed from: j */
    public static final Comparator<String> f17239j = C4594c.f17227h;

    static {
        byte[] bArr = new byte[0];
        f17230a = bArr;
        Method method = null;
        f17233d = AbstractC4355e0.m16731l(null, bArr);
        f17234e = AbstractC4351c0.m16677c(null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f17240k = method;
        f17241l = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* renamed from: A */
    public static /* synthetic */ Thread m18081A(String str, boolean z10, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    /* renamed from: B */
    public static boolean m18082B(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    public static X509TrustManager m18083C() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS", e10);
        }
    }

    /* renamed from: D */
    public static boolean m18084D(C4374v c4374v, C4374v c4374v2) {
        return c4374v.m16861l().equals(c4374v2.m16861l()) && c4374v.m16866w() == c4374v2.m16866w() && c4374v.m16853B().equals(c4374v2.m16853B());
    }

    /* renamed from: E */
    public static boolean m18085E(InterfaceC0574t interfaceC0574t, int i10, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long mo2880c = interfaceC0574t.mo2801c().mo2882e() ? interfaceC0574t.mo2801c().mo2880c() - nanoTime : Long.MAX_VALUE;
        interfaceC0574t.mo2801c().mo2881d(Math.min(mo2880c, timeUnit.toNanos(i10)) + nanoTime);
        try {
            C0557c c0557c = new C0557c();
            while (interfaceC0574t.mo2800T(c0557c, 8192L) != -1) {
                c0557c.m2829f();
            }
            C0575u mo2801c = interfaceC0574t.mo2801c();
            if (mo2880c == Long.MAX_VALUE) {
                mo2801c.mo2878a();
            } else {
                mo2801c.mo2881d(nanoTime + mo2880c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            C0575u mo2801c2 = interfaceC0574t.mo2801c();
            if (mo2880c == Long.MAX_VALUE) {
                mo2801c2.mo2878a();
            } else {
                mo2801c2.mo2881d(nanoTime + mo2880c);
            }
            return false;
        } catch (Throwable th) {
            C0575u mo2801c3 = interfaceC0574t.mo2801c();
            if (mo2880c == Long.MAX_VALUE) {
                mo2801c3.mo2878a();
            } else {
                mo2801c3.mo2881d(nanoTime + mo2880c);
            }
            throw th;
        }
    }

    /* renamed from: F */
    public static int m18086F(String str, int i10, int i11) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: G */
    public static int m18087G(String str, int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char charAt = str.charAt(i12);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }

    /* renamed from: H */
    public static ThreadFactory m18088H(String str, boolean z10) {
        return new ThreadFactory() { // from class: se.d

            /* renamed from: a */
            public final /* synthetic */ String f17228a;

            /* renamed from: b */
            public final /* synthetic */ boolean f17229b;

            public /* synthetic */ ThreadFactoryC4595d(String str2, boolean z102) {
                r1 = str2;
                r2 = z102;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m18081A;
                m18081A = C4596e.m18081A(r1, r2, runnable);
                return m18081A;
            }
        };
    }

    /* renamed from: I */
    public static List<C5770c> m18089I(C4373u c4373u) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c4373u.m16831h(); i10++) {
            arrayList.add(new C5770c(c4373u.m16829e(i10), c4373u.m16832i(i10)));
        }
        return arrayList;
    }

    /* renamed from: J */
    public static C4373u m18090J(List<C5770c> list) {
        C4373u.a aVar = new C4373u.a();
        for (C5770c c5770c : list) {
            AbstractC4592a.f17225a.mo16924b(aVar, c5770c.f21372a.mo2876z(), c5770c.f21373b.mo2876z());
        }
        return aVar.m16837d();
    }

    /* renamed from: K */
    public static String m18091K(String str, int i10, int i11) {
        int m18086F = m18086F(str, i10, i11);
        return str.substring(m18086F, m18087G(str, m18086F, i11));
    }

    /* renamed from: L */
    public static boolean m18092L(String str) {
        return f17241l.matcher(str).matches();
    }

    /* renamed from: b */
    public static void m18094b(Throwable th, Throwable th2) {
        Method method = f17240k;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: c */
    public static String m18095c(String str) {
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (m18101i(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress m18104l = (str.startsWith("[") && str.endsWith("]")) ? m18104l(str, 1, str.length() - 1) : m18104l(str, 0, str.length());
        if (m18104l == null) {
            return null;
        }
        byte[] address = m18104l.getAddress();
        if (address.length == 16) {
            return m18116x(address);
        }
        if (address.length == 4) {
            return m18104l.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + "'");
    }

    /* renamed from: d */
    public static int m18096d(String str, long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException(str + " < 0");
        }
        Objects.requireNonNull(timeUnit, "unit == null");
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(str + " too large.");
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(str + " too small.");
    }

    /* renamed from: e */
    public static void m18097e(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: f */
    public static void m18098f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public static void m18099g(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e10) {
                if (!m18118z(e10)) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public static String[] m18100h(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    /* renamed from: i */
    public static boolean m18101i(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static int m18102j(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    /* renamed from: k */
    public static boolean m18103k(String str, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i12;
        while (i10 < i11) {
            if (i13 == bArr.length) {
                return false;
            }
            if (i13 != i12) {
                if (str.charAt(i10) != '.') {
                    return false;
                }
                i10++;
            }
            int i14 = i10;
            int i15 = 0;
            while (i14 < i11) {
                char charAt = str.charAt(i14);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i14++;
            }
            if (i14 - i10 == 0) {
                return false;
            }
            bArr[i13] = (byte) i15;
            i13++;
            i10 = i14;
        }
        return i13 == i12 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.InetAddress m18104l(java.lang.String r11, int r12, int r13) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = -1
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L9:
            r7 = 0
            if (r12 >= r13) goto L7a
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r12 + 2
            if (r8 > r13) goto L27
            java.lang.String r9 = "::"
            r10 = 2
            boolean r9 = r11.regionMatches(r12, r9, r3, r10)
            if (r9 == 0) goto L27
            if (r5 == r2) goto L1f
            return r7
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r13) goto L25
            goto L7a
        L25:
            r6 = r8
            goto L4b
        L27:
            if (r4 == 0) goto L4a
            java.lang.String r8 = ":"
            r9 = 1
            boolean r8 = r11.regionMatches(r12, r8, r3, r9)
            if (r8 == 0) goto L35
            int r12 = r12 + 1
            goto L4a
        L35:
            java.lang.String r8 = "."
            boolean r12 = r11.regionMatches(r12, r8, r3, r9)
            if (r12 == 0) goto L49
            int r12 = r4 + (-2)
            boolean r11 = m18103k(r11, r6, r13, r1, r12)
            if (r11 != 0) goto L46
            return r7
        L46:
            int r4 = r4 + 2
            goto L7a
        L49:
            return r7
        L4a:
            r6 = r12
        L4b:
            r8 = r3
            r12 = r6
        L4d:
            if (r12 >= r13) goto L60
            char r9 = r11.charAt(r12)
            int r9 = m18102j(r9)
            if (r9 != r2) goto L5a
            goto L60
        L5a:
            int r8 = r8 << 4
            int r8 = r8 + r9
            int r12 = r12 + 1
            goto L4d
        L60:
            int r9 = r12 - r6
            if (r9 == 0) goto L79
            r10 = 4
            if (r9 <= r10) goto L68
            goto L79
        L68:
            int r7 = r4 + 1
            int r9 = r8 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r7 + 1
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L79:
            return r7
        L7a:
            if (r4 == r0) goto L8b
            if (r5 != r2) goto L7f
            return r7
        L7f:
            int r11 = r4 - r5
            int r12 = 16 - r11
            java.lang.System.arraycopy(r1, r5, r1, r12, r11)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r3)
        L8b:
            java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L90
            return r11
        L90:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: se.C4596e.m18104l(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: m */
    public static int m18105m(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: n */
    public static int m18106n(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: o */
    public static boolean m18107o(InterfaceC0574t interfaceC0574t, int i10, TimeUnit timeUnit) {
        try {
            return m18085E(interfaceC0574t, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: p */
    public static String m18108p(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: q */
    public static String m18109q(String str, String str2) {
        try {
            String property = System.getProperty(str);
            return property != null ? property : str2;
        } catch (AccessControlException unused) {
            return str2;
        }
    }

    /* renamed from: r */
    public static String m18110r(C4374v c4374v, boolean z10) {
        String m16861l;
        if (c4374v.m16861l().contains(":")) {
            m16861l = "[" + c4374v.m16861l() + "]";
        } else {
            m16861l = c4374v.m16861l();
        }
        if (!z10 && c4374v.m16866w() == C4374v.m16843d(c4374v.m16853B())) {
            return m16861l;
        }
        return m16861l + ":" + c4374v.m16866w();
    }

    /* renamed from: s */
    public static <T> List<T> m18111s(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    @SafeVarargs
    /* renamed from: t */
    public static <T> List<T> m18112t(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: u */
    public static <K, V> Map<K, V> m18113u(Map<K, V> map) {
        return map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: v */
    public static int m18114v(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: w */
    public static int m18115w(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt >= 127) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: x */
    public static String m18116x(byte[] bArr) {
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length) {
            int i14 = i12;
            while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                i14 += 2;
            }
            int i15 = i14 - i12;
            if (i15 > i13 && i15 >= 4) {
                i11 = i12;
                i13 = i15;
            }
            i12 = i14 + 2;
        }
        C0557c c0557c = new C0557c();
        while (i10 < bArr.length) {
            if (i10 == i11) {
                c0557c.mo2807C(58);
                i10 += i13;
                if (i10 == 16) {
                    c0557c.mo2807C(58);
                }
            } else {
                if (i10 > 0) {
                    c0557c.mo2807C(58);
                }
                c0557c.mo2826d0(((bArr[i10] & 255) << 8) | (bArr[i10 + 1] & 255));
                i10 += 2;
            }
        }
        return c0557c.m2825c0();
    }

    /* renamed from: y */
    public static String[] m18117y(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: z */
    public static boolean m18118z(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
