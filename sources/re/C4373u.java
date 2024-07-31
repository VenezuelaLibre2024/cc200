package re;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import se.C4596e;

/* renamed from: re.u */
/* loaded from: classes2.dex */
public final class C4373u {

    /* renamed from: a */
    public final String[] f15967a;

    /* renamed from: re.u$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final List<String> f15968a = new ArrayList(20);

        /* renamed from: a */
        public a m16834a(String str, String str2) {
            C4373u.m16824a(str);
            C4373u.m16825b(str2, str);
            return m16836c(str, str2);
        }

        /* renamed from: b */
        public a m16835b(String str) {
            int indexOf = str.indexOf(":", 1);
            return indexOf != -1 ? m16836c(str.substring(0, indexOf), str.substring(indexOf + 1)) : str.startsWith(":") ? m16836c("", str.substring(1)) : m16836c("", str);
        }

        /* renamed from: c */
        public a m16836c(String str, String str2) {
            this.f15968a.add(str);
            this.f15968a.add(str2.trim());
            return this;
        }

        /* renamed from: d */
        public C4373u m16837d() {
            return new C4373u(this);
        }

        /* renamed from: e */
        public a m16838e(String str) {
            int i10 = 0;
            while (i10 < this.f15968a.size()) {
                if (str.equalsIgnoreCase(this.f15968a.get(i10))) {
                    this.f15968a.remove(i10);
                    this.f15968a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        /* renamed from: f */
        public a m16839f(String str, String str2) {
            C4373u.m16824a(str);
            C4373u.m16825b(str2, str);
            m16838e(str);
            m16836c(str, str2);
            return this;
        }
    }

    public C4373u(a aVar) {
        List<String> list = aVar.f15968a;
        this.f15967a = (String[]) list.toArray(new String[list.size()]);
    }

    public C4373u(String[] strArr) {
        this.f15967a = strArr;
    }

    /* renamed from: a */
    public static void m16824a(String str) {
        Objects.requireNonNull(str, "name == null");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= ' ' || charAt >= 127) {
                throw new IllegalArgumentException(C4596e.m18108p("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str));
            }
        }
    }

    /* renamed from: b */
    public static void m16825b(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("value for name " + str2 + " == null");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                throw new IllegalArgumentException(C4596e.m18108p("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str2, str));
            }
        }
    }

    /* renamed from: d */
    public static String m16826d(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: g */
    public static C4373u m16827g(String... strArr) {
        Objects.requireNonNull(strArr, "namesAndValues == null");
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i10 = 0; i10 < strArr2.length; i10++) {
            if (strArr2[i10] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i10] = strArr2[i10].trim();
        }
        for (int i11 = 0; i11 < strArr2.length; i11 += 2) {
            String str = strArr2[i11];
            String str2 = strArr2[i11 + 1];
            m16824a(str);
            m16825b(str2, str);
        }
        return new C4373u(strArr2);
    }

    /* renamed from: c */
    public String m16828c(String str) {
        return m16826d(this.f15967a, str);
    }

    /* renamed from: e */
    public String m16829e(int i10) {
        return this.f15967a[i10 * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4373u) && Arrays.equals(((C4373u) obj).f15967a, this.f15967a);
    }

    /* renamed from: f */
    public a m16830f() {
        a aVar = new a();
        Collections.addAll(aVar.f15968a, this.f15967a);
        return aVar;
    }

    /* renamed from: h */
    public int m16831h() {
        return this.f15967a.length / 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f15967a);
    }

    /* renamed from: i */
    public String m16832i(int i10) {
        return this.f15967a[(i10 * 2) + 1];
    }

    /* renamed from: j */
    public List<String> m16833j(String str) {
        int m16831h = m16831h();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < m16831h; i10++) {
            if (str.equalsIgnoreCase(m16829e(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m16832i(i10));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int m16831h = m16831h();
        for (int i10 = 0; i10 < m16831h; i10++) {
            sb2.append(m16829e(i10));
            sb2.append(": ");
            sb2.append(m16832i(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
