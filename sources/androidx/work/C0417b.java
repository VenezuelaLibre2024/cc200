package androidx.work;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p029c2.AbstractC0592j;

/* renamed from: androidx.work.b */
/* loaded from: classes.dex */
public final class C0417b {

    /* renamed from: b */
    public static final String f2002b = AbstractC0592j.m2972f("Data");

    /* renamed from: c */
    public static final C0417b f2003c = new a().m2118a();

    /* renamed from: a */
    public Map<String, Object> f2004a;

    /* renamed from: androidx.work.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public Map<String, Object> f2005a = new HashMap();

        /* renamed from: a */
        public C0417b m2118a() {
            C0417b c0417b = new C0417b((Map<String, ?>) this.f2005a);
            C0417b.m2111n(c0417b);
            return c0417b;
        }

        /* renamed from: b */
        public a m2119b(String str, Object obj) {
            if (obj == null) {
                this.f2005a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f2005a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f2005a.put(str, C0417b.m2104a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f2005a.put(str, C0417b.m2105b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f2005a.put(str, C0417b.m2108e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f2005a.put(str, C0417b.m2109f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f2005a.put(str, C0417b.m2107d((float[]) obj));
                } else {
                    if (cls != double[].class) {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                    }
                    this.f2005a.put(str, C0417b.m2106c((double[]) obj));
                }
            }
            return this;
        }

        /* renamed from: c */
        public a m2120c(C0417b c0417b) {
            m2121d(c0417b.f2004a);
            return this;
        }

        /* renamed from: d */
        public a m2121d(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                m2119b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* renamed from: e */
        public a m2122e(String str, boolean z10) {
            this.f2005a.put(str, Boolean.valueOf(z10));
            return this;
        }

        /* renamed from: f */
        public a m2123f(String str, int i10) {
            this.f2005a.put(str, Integer.valueOf(i10));
            return this;
        }

        /* renamed from: g */
        public a m2124g(String str, long j10) {
            this.f2005a.put(str, Long.valueOf(j10));
            return this;
        }

        /* renamed from: h */
        public a m2125h(String str, String str2) {
            this.f2005a.put(str, str2);
            return this;
        }
    }

    public C0417b() {
    }

    public C0417b(C0417b c0417b) {
        this.f2004a = new HashMap(c0417b.f2004a);
    }

    public C0417b(Map<String, ?> map) {
        this.f2004a = new HashMap(map);
    }

    /* renamed from: a */
    public static Boolean[] m2104a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i10 = 0; i10 < zArr.length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    /* renamed from: b */
    public static Byte[] m2105b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    /* renamed from: c */
    public static Double[] m2106c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i10 = 0; i10 < dArr.length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    /* renamed from: d */
    public static Float[] m2107d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    /* renamed from: e */
    public static Integer[] m2108e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    /* renamed from: f */
    public static Long[] m2109f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x005d -> B:16:0x0062). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.C0417b m2110g(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L80
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3d java.lang.ClassNotFoundException -> L41 java.io.IOException -> L43
            int r7 = r3.readInt()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
        L1b:
            if (r7 <= 0) goto L2b
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            r1.put(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L39 java.io.IOException -> L3b java.lang.Throwable -> L68
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r7 = move-exception
            java.lang.String r3 = androidx.work.C0417b.f2002b
            android.util.Log.e(r3, r0, r7)
        L35:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L39:
            r7 = move-exception
            goto L47
        L3b:
            r7 = move-exception
            goto L47
        L3d:
            r1 = move-exception
            r3 = r7
            r7 = r1
            goto L69
        L41:
            r3 = move-exception
            goto L44
        L43:
            r3 = move-exception
        L44:
            r6 = r3
            r3 = r7
            r7 = r6
        L47:
            java.lang.String r4 = androidx.work.C0417b.f2002b     // Catch: java.lang.Throwable -> L68
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L58
            r3.close()     // Catch: java.io.IOException -> L52
            goto L58
        L52:
            r7 = move-exception
            java.lang.String r3 = androidx.work.C0417b.f2002b
            android.util.Log.e(r3, r0, r7)
        L58:
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L62
        L5c:
            r7 = move-exception
            java.lang.String r2 = androidx.work.C0417b.f2002b
            android.util.Log.e(r2, r0, r7)
        L62:
            androidx.work.b r7 = new androidx.work.b
            r7.<init>(r1)
            return r7
        L68:
            r7 = move-exception
        L69:
            if (r3 == 0) goto L75
            r3.close()     // Catch: java.io.IOException -> L6f
            goto L75
        L6f:
            r1 = move-exception
            java.lang.String r3 = androidx.work.C0417b.f2002b
            android.util.Log.e(r3, r0, r1)
        L75:
            r2.close()     // Catch: java.io.IOException -> L79
            goto L7f
        L79:
            r1 = move-exception
            java.lang.String r2 = androidx.work.C0417b.f2002b
            android.util.Log.e(r2, r0, r1)
        L7f:
            throw r7
        L80:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C0417b.m2110g(byte[]):androidx.work.b");
    }

    /* renamed from: n */
    public static byte[] m2111n(C0417b c0417b) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(c0417b.m2117m());
                    for (Map.Entry<String, Object> entry : c0417b.f2004a.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e10) {
                        Log.e(f2002b, "Error in Data#toByteArray: ", e10);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(f2002b, "Error in Data#toByteArray: ", e11);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e12) {
                    e = e12;
                    objectOutputStream = objectOutputStream2;
                    Log.e(f2002b, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e13) {
                            Log.e(f2002b, "Error in Data#toByteArray: ", e13);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e14) {
                        Log.e(f2002b, "Error in Data#toByteArray: ", e14);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e15) {
                            Log.e(f2002b, "Error in Data#toByteArray: ", e15);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e16) {
                        Log.e(f2002b, "Error in Data#toByteArray: ", e16);
                        throw th;
                    }
                }
            } catch (IOException e17) {
                e = e17;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0417b.class != obj.getClass()) {
            return false;
        }
        C0417b c0417b = (C0417b) obj;
        Set<String> keySet = this.f2004a.keySet();
        if (!keySet.equals(c0417b.f2004a.keySet())) {
            return false;
        }
        for (String str : keySet) {
            Object obj2 = this.f2004a.get(str);
            Object obj3 = c0417b.f2004a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public boolean m2112h(String str, boolean z10) {
        Object obj = this.f2004a.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z10;
    }

    public int hashCode() {
        return this.f2004a.hashCode() * 31;
    }

    /* renamed from: i */
    public int m2113i(String str, int i10) {
        Object obj = this.f2004a.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i10;
    }

    /* renamed from: j */
    public Map<String, Object> m2114j() {
        return Collections.unmodifiableMap(this.f2004a);
    }

    /* renamed from: k */
    public long m2115k(String str, long j10) {
        Object obj = this.f2004a.get(str);
        return obj instanceof Long ? ((Long) obj).longValue() : j10;
    }

    /* renamed from: l */
    public String m2116l(String str) {
        Object obj = this.f2004a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: m */
    public int m2117m() {
        return this.f2004a.size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Data {");
        if (!this.f2004a.isEmpty()) {
            for (String str : this.f2004a.keySet()) {
                sb2.append(str);
                sb2.append(" : ");
                Object obj = this.f2004a.get(str);
                if (obj instanceof Object[]) {
                    sb2.append(Arrays.toString((Object[]) obj));
                } else {
                    sb2.append(obj);
                }
                sb2.append(", ");
            }
        }
        sb2.append("}");
        return sb2.toString();
    }
}
