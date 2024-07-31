package p189n1;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: n1.j */
/* loaded from: classes.dex */
public class C3698j {

    /* renamed from: a */
    public static final byte[] f13159a = {112, 114, 111, 0};

    /* renamed from: b */
    public static final byte[] f13160b = {112, 114, 109, 0};

    /* renamed from: A */
    public static void m13915A(InputStream inputStream) {
        C3691c.m13902h(inputStream);
        int m13904j = C3691c.m13904j(inputStream);
        if (m13904j == 6 || m13904j == 7) {
            return;
        }
        while (m13904j > 0) {
            C3691c.m13904j(inputStream);
            for (int m13904j2 = C3691c.m13904j(inputStream); m13904j2 > 0; m13904j2--) {
                C3691c.m13902h(inputStream);
            }
            m13904j--;
        }
    }

    /* renamed from: B */
    public static boolean m13916B(OutputStream outputStream, byte[] bArr, C3690b[] c3690bArr) {
        if (Arrays.equals(bArr, C3699k.f13161a)) {
            m13928N(outputStream, c3690bArr);
            return true;
        }
        if (Arrays.equals(bArr, C3699k.f13162b)) {
            m13927M(outputStream, c3690bArr);
            return true;
        }
        if (Arrays.equals(bArr, C3699k.f13164d)) {
            m13925K(outputStream, c3690bArr);
            return true;
        }
        if (Arrays.equals(bArr, C3699k.f13163c)) {
            m13926L(outputStream, c3690bArr);
            return true;
        }
        if (!Arrays.equals(bArr, C3699k.f13165e)) {
            return false;
        }
        m13924J(outputStream, c3690bArr);
        return true;
    }

    /* renamed from: C */
    public static void m13917C(OutputStream outputStream, C3690b c3690b) {
        int i10 = 0;
        for (int i11 : c3690b.f13142h) {
            Integer valueOf = Integer.valueOf(i11);
            C3691c.m13910p(outputStream, valueOf.intValue() - i10);
            i10 = valueOf.intValue();
        }
    }

    /* renamed from: D */
    public static C3700l m13918D(C3690b[] c3690bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C3691c.m13910p(byteArrayOutputStream, c3690bArr.length);
            int i10 = 2;
            for (C3690b c3690b : c3690bArr) {
                C3691c.m13911q(byteArrayOutputStream, c3690b.f13137c);
                C3691c.m13911q(byteArrayOutputStream, c3690b.f13138d);
                C3691c.m13911q(byteArrayOutputStream, c3690b.f13141g);
                String m13939j = m13939j(c3690b.f13135a, c3690b.f13136b, C3699k.f13161a);
                int m13905k = C3691c.m13905k(m13939j);
                C3691c.m13910p(byteArrayOutputStream, m13905k);
                i10 = i10 + 4 + 4 + 4 + 2 + (m13905k * 1);
                C3691c.m13908n(byteArrayOutputStream, m13939j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                C3700l c3700l = new C3700l(EnumC3692d.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return c3700l;
            }
            throw C3691c.m13897c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: E */
    public static void m13919E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f13159a);
        outputStream.write(bArr);
    }

    /* renamed from: F */
    public static void m13920F(OutputStream outputStream, C3690b c3690b) {
        m13923I(outputStream, c3690b);
        m13917C(outputStream, c3690b);
        m13922H(outputStream, c3690b);
    }

    /* renamed from: G */
    public static void m13921G(OutputStream outputStream, C3690b c3690b, String str) {
        C3691c.m13910p(outputStream, C3691c.m13905k(str));
        C3691c.m13910p(outputStream, c3690b.f13139e);
        C3691c.m13911q(outputStream, c3690b.f13140f);
        C3691c.m13911q(outputStream, c3690b.f13137c);
        C3691c.m13911q(outputStream, c3690b.f13141g);
        C3691c.m13908n(outputStream, str);
    }

    /* renamed from: H */
    public static void m13922H(OutputStream outputStream, C3690b c3690b) {
        byte[] bArr = new byte[m13940k(c3690b.f13141g)];
        for (Map.Entry<Integer, Integer> entry : c3690b.f13143i.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                m13955z(bArr, 2, intValue, c3690b);
            }
            if ((intValue2 & 4) != 0) {
                m13955z(bArr, 4, intValue, c3690b);
            }
        }
        outputStream.write(bArr);
    }

    /* renamed from: I */
    public static void m13923I(OutputStream outputStream, C3690b c3690b) {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : c3690b.f13143i.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C3691c.m13910p(outputStream, intValue - i10);
                C3691c.m13910p(outputStream, 0);
                i10 = intValue;
            }
        }
    }

    /* renamed from: J */
    public static void m13924J(OutputStream outputStream, C3690b[] c3690bArr) {
        C3691c.m13910p(outputStream, c3690bArr.length);
        for (C3690b c3690b : c3690bArr) {
            String m13939j = m13939j(c3690b.f13135a, c3690b.f13136b, C3699k.f13165e);
            C3691c.m13910p(outputStream, C3691c.m13905k(m13939j));
            C3691c.m13910p(outputStream, c3690b.f13143i.size());
            C3691c.m13910p(outputStream, c3690b.f13142h.length);
            C3691c.m13911q(outputStream, c3690b.f13137c);
            C3691c.m13908n(outputStream, m13939j);
            Iterator<Integer> it = c3690b.f13143i.keySet().iterator();
            while (it.hasNext()) {
                C3691c.m13910p(outputStream, it.next().intValue());
            }
            for (int i10 : c3690b.f13142h) {
                C3691c.m13910p(outputStream, i10);
            }
        }
    }

    /* renamed from: K */
    public static void m13925K(OutputStream outputStream, C3690b[] c3690bArr) {
        C3691c.m13912r(outputStream, c3690bArr.length);
        for (C3690b c3690b : c3690bArr) {
            int size = c3690b.f13143i.size() * 4;
            String m13939j = m13939j(c3690b.f13135a, c3690b.f13136b, C3699k.f13164d);
            C3691c.m13910p(outputStream, C3691c.m13905k(m13939j));
            C3691c.m13910p(outputStream, c3690b.f13142h.length);
            C3691c.m13911q(outputStream, size);
            C3691c.m13911q(outputStream, c3690b.f13137c);
            C3691c.m13908n(outputStream, m13939j);
            Iterator<Integer> it = c3690b.f13143i.keySet().iterator();
            while (it.hasNext()) {
                C3691c.m13910p(outputStream, it.next().intValue());
                C3691c.m13910p(outputStream, 0);
            }
            for (int i10 : c3690b.f13142h) {
                C3691c.m13910p(outputStream, i10);
            }
        }
    }

    /* renamed from: L */
    public static void m13926L(OutputStream outputStream, C3690b[] c3690bArr) {
        byte[] m13931b = m13931b(c3690bArr, C3699k.f13163c);
        C3691c.m13912r(outputStream, c3690bArr.length);
        C3691c.m13907m(outputStream, m13931b);
    }

    /* renamed from: M */
    public static void m13927M(OutputStream outputStream, C3690b[] c3690bArr) {
        byte[] m13931b = m13931b(c3690bArr, C3699k.f13162b);
        C3691c.m13912r(outputStream, c3690bArr.length);
        C3691c.m13907m(outputStream, m13931b);
    }

    /* renamed from: N */
    public static void m13928N(OutputStream outputStream, C3690b[] c3690bArr) {
        m13929O(outputStream, c3690bArr);
    }

    /* renamed from: O */
    public static void m13929O(OutputStream outputStream, C3690b[] c3690bArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m13918D(c3690bArr));
        arrayList.add(m13932c(c3690bArr));
        arrayList.add(m13933d(c3690bArr));
        long length2 = C3699k.f13161a.length + f13159a.length + 4 + (arrayList.size() * 16);
        C3691c.m13911q(outputStream, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C3700l c3700l = (C3700l) arrayList.get(i10);
            C3691c.m13911q(outputStream, c3700l.f13168a.m13914c());
            C3691c.m13911q(outputStream, length2);
            if (c3700l.f13171d) {
                byte[] bArr = c3700l.f13170c;
                long length3 = bArr.length;
                byte[] m13896b = C3691c.m13896b(bArr);
                arrayList2.add(m13896b);
                C3691c.m13911q(outputStream, m13896b.length);
                C3691c.m13911q(outputStream, length3);
                length = m13896b.length;
            } else {
                arrayList2.add(c3700l.f13170c);
                C3691c.m13911q(outputStream, c3700l.f13170c.length);
                C3691c.m13911q(outputStream, 0L);
                length = c3700l.f13170c.length;
            }
            length2 += length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    /* renamed from: a */
    public static int m13930a(C3690b c3690b) {
        Iterator<Map.Entry<Integer, Integer>> it = c3690b.f13143i.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= it.next().getValue().intValue();
        }
        return i10;
    }

    /* renamed from: b */
    public static byte[] m13931b(C3690b[] c3690bArr, byte[] bArr) {
        int i10 = 0;
        int i11 = 0;
        for (C3690b c3690b : c3690bArr) {
            i11 += C3691c.m13905k(m13939j(c3690b.f13135a, c3690b.f13136b, bArr)) + 16 + (c3690b.f13139e * 2) + c3690b.f13140f + m13940k(c3690b.f13141g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, C3699k.f13163c)) {
            int length = c3690bArr.length;
            while (i10 < length) {
                C3690b c3690b2 = c3690bArr[i10];
                m13921G(byteArrayOutputStream, c3690b2, m13939j(c3690b2.f13135a, c3690b2.f13136b, bArr));
                m13920F(byteArrayOutputStream, c3690b2);
                i10++;
            }
        } else {
            for (C3690b c3690b3 : c3690bArr) {
                m13921G(byteArrayOutputStream, c3690b3, m13939j(c3690b3.f13135a, c3690b3.f13136b, bArr));
            }
            int length2 = c3690bArr.length;
            while (i10 < length2) {
                m13920F(byteArrayOutputStream, c3690bArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw C3691c.m13897c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    /* renamed from: c */
    public static C3700l m13932c(C3690b[] c3690bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < c3690bArr.length; i11++) {
            try {
                C3690b c3690b = c3690bArr[i11];
                C3691c.m13910p(byteArrayOutputStream, i11);
                C3691c.m13910p(byteArrayOutputStream, c3690b.f13139e);
                i10 = i10 + 2 + 2 + (c3690b.f13139e * 2);
                m13917C(byteArrayOutputStream, c3690b);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            C3700l c3700l = new C3700l(EnumC3692d.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return c3700l;
        }
        throw C3691c.m13897c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: d */
    public static C3700l m13933d(C3690b[] c3690bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < c3690bArr.length; i11++) {
            try {
                C3690b c3690b = c3690bArr[i11];
                int m13930a = m13930a(c3690b);
                byte[] m13934e = m13934e(c3690b);
                byte[] m13935f = m13935f(c3690b);
                C3691c.m13910p(byteArrayOutputStream, i11);
                int length = m13934e.length + 2 + m13935f.length;
                C3691c.m13911q(byteArrayOutputStream, length);
                C3691c.m13910p(byteArrayOutputStream, m13930a);
                byteArrayOutputStream.write(m13934e);
                byteArrayOutputStream.write(m13935f);
                i10 = i10 + 2 + 4 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            C3700l c3700l = new C3700l(EnumC3692d.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return c3700l;
        }
        throw C3691c.m13897c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    /* renamed from: e */
    public static byte[] m13934e(C3690b c3690b) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m13922H(byteArrayOutputStream, c3690b);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: f */
    public static byte[] m13935f(C3690b c3690b) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m13923I(byteArrayOutputStream, c3690b);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: g */
    public static String m13936g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    /* renamed from: h */
    public static String m13937h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    /* renamed from: i */
    public static C3690b m13938i(C3690b[] c3690bArr, String str) {
        if (c3690bArr.length <= 0) {
            return null;
        }
        String m13937h = m13937h(str);
        for (int i10 = 0; i10 < c3690bArr.length; i10++) {
            if (c3690bArr[i10].f13136b.equals(m13937h)) {
                return c3690bArr[i10];
            }
        }
        return null;
    }

    /* renamed from: j */
    public static String m13939j(String str, String str2, byte[] bArr) {
        String m13956a = C3699k.m13956a(bArr);
        if (str.length() <= 0) {
            return m13936g(str2, m13956a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return m13936g(str2, m13956a);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + C3699k.m13956a(bArr) + str2;
    }

    /* renamed from: k */
    public static int m13940k(int i10) {
        return m13954y(i10 * 2) / 8;
    }

    /* renamed from: l */
    public static int m13941l(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw C3691c.m13897c("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw C3691c.m13897c("Unexpected flag: " + i10);
    }

    /* renamed from: m */
    public static int[] m13942m(InputStream inputStream, int i10) {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += C3691c.m13902h(inputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    /* renamed from: n */
    public static int m13943n(BitSet bitSet, int i10, int i11) {
        int i12 = bitSet.get(m13941l(2, i10, i11)) ? 2 : 0;
        return bitSet.get(m13941l(4, i10, i11)) ? i12 | 4 : i12;
    }

    /* renamed from: o */
    public static byte[] m13944o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, C3691c.m13898d(inputStream, bArr.length))) {
            return C3691c.m13898d(inputStream, C3699k.f13162b.length);
        }
        throw C3691c.m13897c("Invalid magic");
    }

    /* renamed from: p */
    public static void m13945p(InputStream inputStream, C3690b c3690b) {
        int available = inputStream.available() - c3690b.f13140f;
        int i10 = 0;
        while (inputStream.available() > available) {
            i10 += C3691c.m13902h(inputStream);
            c3690b.f13143i.put(Integer.valueOf(i10), 1);
            for (int m13902h = C3691c.m13902h(inputStream); m13902h > 0; m13902h--) {
                m13915A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw C3691c.m13897c("Read too much data during profile line parse");
        }
    }

    /* renamed from: q */
    public static C3690b[] m13946q(InputStream inputStream, byte[] bArr, byte[] bArr2, C3690b[] c3690bArr) {
        if (Arrays.equals(bArr, C3699k.f13166f)) {
            if (Arrays.equals(C3699k.f13161a, bArr2)) {
                throw C3691c.m13897c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return m13947r(inputStream, bArr, c3690bArr);
        }
        if (Arrays.equals(bArr, C3699k.f13167g)) {
            return m13949t(inputStream, bArr2, c3690bArr);
        }
        throw C3691c.m13897c("Unsupported meta version");
    }

    /* renamed from: r */
    public static C3690b[] m13947r(InputStream inputStream, byte[] bArr, C3690b[] c3690bArr) {
        if (!Arrays.equals(bArr, C3699k.f13166f)) {
            throw C3691c.m13897c("Unsupported meta version");
        }
        int m13904j = C3691c.m13904j(inputStream);
        byte[] m13899e = C3691c.m13899e(inputStream, (int) C3691c.m13903i(inputStream), (int) C3691c.m13903i(inputStream));
        if (inputStream.read() > 0) {
            throw C3691c.m13897c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m13899e);
        try {
            C3690b[] m13948s = m13948s(byteArrayInputStream, m13904j, c3690bArr);
            byteArrayInputStream.close();
            return m13948s;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: s */
    public static C3690b[] m13948s(InputStream inputStream, int i10, C3690b[] c3690bArr) {
        if (inputStream.available() == 0) {
            return new C3690b[0];
        }
        if (i10 != c3690bArr.length) {
            throw C3691c.m13897c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int m13902h = C3691c.m13902h(inputStream);
            iArr[i11] = C3691c.m13902h(inputStream);
            strArr[i11] = C3691c.m13900f(inputStream, m13902h);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            C3690b c3690b = c3690bArr[i12];
            if (!c3690b.f13136b.equals(strArr[i12])) {
                throw C3691c.m13897c("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            c3690b.f13139e = i13;
            c3690b.f13142h = m13942m(inputStream, i13);
        }
        return c3690bArr;
    }

    /* renamed from: t */
    public static C3690b[] m13949t(InputStream inputStream, byte[] bArr, C3690b[] c3690bArr) {
        int m13902h = C3691c.m13902h(inputStream);
        byte[] m13899e = C3691c.m13899e(inputStream, (int) C3691c.m13903i(inputStream), (int) C3691c.m13903i(inputStream));
        if (inputStream.read() > 0) {
            throw C3691c.m13897c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m13899e);
        try {
            C3690b[] m13950u = m13950u(byteArrayInputStream, bArr, m13902h, c3690bArr);
            byteArrayInputStream.close();
            return m13950u;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: u */
    public static C3690b[] m13950u(InputStream inputStream, byte[] bArr, int i10, C3690b[] c3690bArr) {
        if (inputStream.available() == 0) {
            return new C3690b[0];
        }
        if (i10 != c3690bArr.length) {
            throw C3691c.m13897c("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            C3691c.m13902h(inputStream);
            String m13900f = C3691c.m13900f(inputStream, C3691c.m13902h(inputStream));
            long m13903i = C3691c.m13903i(inputStream);
            int m13902h = C3691c.m13902h(inputStream);
            C3690b m13938i = m13938i(c3690bArr, m13900f);
            if (m13938i == null) {
                throw C3691c.m13897c("Missing profile key: " + m13900f);
            }
            m13938i.f13138d = m13903i;
            int[] m13942m = m13942m(inputStream, m13902h);
            if (Arrays.equals(bArr, C3699k.f13165e)) {
                m13938i.f13139e = m13902h;
                m13938i.f13142h = m13942m;
            }
        }
        return c3690bArr;
    }

    /* renamed from: v */
    public static void m13951v(InputStream inputStream, C3690b c3690b) {
        BitSet valueOf = BitSet.valueOf(C3691c.m13898d(inputStream, C3691c.m13895a(c3690b.f13141g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = c3690b.f13141g;
            if (i10 >= i11) {
                return;
            }
            int m13943n = m13943n(valueOf, i10, i11);
            if (m13943n != 0) {
                Integer num = c3690b.f13143i.get(Integer.valueOf(i10));
                if (num == null) {
                    num = 0;
                }
                c3690b.f13143i.put(Integer.valueOf(i10), Integer.valueOf(m13943n | num.intValue()));
            }
            i10++;
        }
    }

    /* renamed from: w */
    public static C3690b[] m13952w(InputStream inputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, C3699k.f13162b)) {
            throw C3691c.m13897c("Unsupported version");
        }
        int m13904j = C3691c.m13904j(inputStream);
        byte[] m13899e = C3691c.m13899e(inputStream, (int) C3691c.m13903i(inputStream), (int) C3691c.m13903i(inputStream));
        if (inputStream.read() > 0) {
            throw C3691c.m13897c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m13899e);
        try {
            C3690b[] m13953x = m13953x(byteArrayInputStream, str, m13904j);
            byteArrayInputStream.close();
            return m13953x;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: x */
    public static C3690b[] m13953x(InputStream inputStream, String str, int i10) {
        if (inputStream.available() == 0) {
            return new C3690b[0];
        }
        C3690b[] c3690bArr = new C3690b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int m13902h = C3691c.m13902h(inputStream);
            int m13902h2 = C3691c.m13902h(inputStream);
            c3690bArr[i11] = new C3690b(str, C3691c.m13900f(inputStream, m13902h), C3691c.m13903i(inputStream), 0L, m13902h2, (int) C3691c.m13903i(inputStream), (int) C3691c.m13903i(inputStream), new int[m13902h2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            C3690b c3690b = c3690bArr[i12];
            m13945p(inputStream, c3690b);
            c3690b.f13142h = m13942m(inputStream, c3690b.f13139e);
            m13951v(inputStream, c3690b);
        }
        return c3690bArr;
    }

    /* renamed from: y */
    public static int m13954y(int i10) {
        return ((i10 + 8) - 1) & (-8);
    }

    /* renamed from: z */
    public static void m13955z(byte[] bArr, int i10, int i11, C3690b c3690b) {
        int m13941l = m13941l(i10, i11, c3690b.f13141g);
        int i12 = m13941l / 8;
        bArr[i12] = (byte) ((1 << (m13941l % 8)) | bArr[i12]);
    }
}
