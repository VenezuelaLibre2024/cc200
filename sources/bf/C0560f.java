package bf;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: bf.f */
/* loaded from: classes2.dex */
public class C0560f implements Serializable, Comparable<C0560f> {

    /* renamed from: k */
    public static final char[] f2509k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: l */
    public static final C0560f f2510l = m2860p(new byte[0]);

    /* renamed from: h */
    public final byte[] f2511h;

    /* renamed from: i */
    public transient int f2512i;

    /* renamed from: j */
    public transient String f2513j;

    public C0560f(byte[] bArr) {
        this.f2511h = bArr;
    }

    /* renamed from: c */
    public static int m2856c(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            if (i12 == i10) {
                return i11;
            }
            int codePointAt = str.codePointAt(i11);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i12++;
            i11 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    /* renamed from: h */
    public static C0560f m2857h(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((m2858i(str.charAt(i11)) << 4) + m2858i(str.charAt(i11 + 1)));
        }
        return m2860p(bArr);
    }

    /* renamed from: i */
    public static int m2858i(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    /* renamed from: m */
    public static C0560f m2859m(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C0560f c0560f = new C0560f(str.getBytes(C0576v.f2555a));
        c0560f.f2513j = str;
        return c0560f;
    }

    /* renamed from: p */
    public static C0560f m2860p(byte... bArr) {
        if (bArr != null) {
            return new C0560f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: A */
    public void mo2861A(C0557c c0557c) {
        byte[] bArr = this.f2511h;
        c0557c.mo2822Y(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public String mo2862b() {
        return C0556b.m2802a(this.f2511h);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0560f) {
            C0560f c0560f = (C0560f) obj;
            int mo2871u = c0560f.mo2871u();
            byte[] bArr = this.f2511h;
            if (mo2871u == bArr.length && c0560f.mo2868r(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0560f c0560f) {
        int mo2871u = mo2871u();
        int mo2871u2 = c0560f.mo2871u();
        int min = Math.min(mo2871u, mo2871u2);
        for (int i10 = 0; i10 < min; i10++) {
            int mo2865n = mo2865n(i10) & 255;
            int mo2865n2 = c0560f.mo2865n(i10) & 255;
            if (mo2865n != mo2865n2) {
                return mo2865n < mo2865n2 ? -1 : 1;
            }
        }
        if (mo2871u == mo2871u2) {
            return 0;
        }
        return mo2871u < mo2871u2 ? -1 : 1;
    }

    public int hashCode() {
        int i10 = this.f2512i;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.f2511h);
        this.f2512i = hashCode;
        return hashCode;
    }

    /* renamed from: l */
    public final C0560f m2864l(String str) {
        try {
            return m2860p(MessageDigest.getInstance(str).digest(this.f2511h));
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: n */
    public byte mo2865n(int i10) {
        return this.f2511h[i10];
    }

    /* renamed from: o */
    public String mo2866o() {
        byte[] bArr = this.f2511h;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f2509k;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: q */
    public boolean mo2867q(int i10, C0560f c0560f, int i11, int i12) {
        return c0560f.mo2868r(i11, this.f2511h, i10, i12);
    }

    /* renamed from: r */
    public boolean mo2868r(int i10, byte[] bArr, int i11, int i12) {
        if (i10 >= 0) {
            byte[] bArr2 = this.f2511h;
            if (i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && C0576v.m2920a(bArr2, i10, bArr, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public C0560f mo2869s() {
        return m2864l("SHA-1");
    }

    /* renamed from: t */
    public C0560f mo2870t() {
        return m2864l("SHA-256");
    }

    public String toString() {
        StringBuilder sb2;
        StringBuilder sb3;
        if (this.f2511h.length == 0) {
            return "[size=0]";
        }
        String mo2876z = mo2876z();
        int m2856c = m2856c(mo2876z, 64);
        if (m2856c == -1) {
            if (this.f2511h.length <= 64) {
                sb3 = new StringBuilder();
                sb3.append("[hex=");
                sb3.append(mo2866o());
                sb3.append("]");
            } else {
                sb3 = new StringBuilder();
                sb3.append("[size=");
                sb3.append(this.f2511h.length);
                sb3.append(" hex=");
                sb3.append(mo2873w(0, 64).mo2866o());
                sb3.append("…]");
            }
            return sb3.toString();
        }
        String replace = mo2876z.substring(0, m2856c).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (m2856c < mo2876z.length()) {
            sb2 = new StringBuilder();
            sb2.append("[size=");
            sb2.append(this.f2511h.length);
            sb2.append(" text=");
            sb2.append(replace);
            sb2.append("…]");
        } else {
            sb2 = new StringBuilder();
            sb2.append("[text=");
            sb2.append(replace);
            sb2.append("]");
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public int mo2871u() {
        return this.f2511h.length;
    }

    /* renamed from: v */
    public final boolean m2872v(C0560f c0560f) {
        return mo2867q(0, c0560f, 0, c0560f.mo2871u());
    }

    /* renamed from: w */
    public C0560f mo2873w(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f2511h;
        if (i11 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f2511h.length + ")");
        }
        int i12 = i11 - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i10 == 0 && i11 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i10, bArr2, 0, i12);
        return new C0560f(bArr2);
    }

    /* renamed from: x */
    public C0560f mo2874x() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f2511h;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                    byte b11 = bArr2[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArr2[i11] = (byte) (b11 + 32);
                    }
                }
                return new C0560f(bArr2);
            }
            i10++;
        }
    }

    /* renamed from: y */
    public byte[] mo2875y() {
        return (byte[]) this.f2511h.clone();
    }

    /* renamed from: z */
    public String mo2876z() {
        String str = this.f2513j;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f2511h, C0576v.f2555a);
        this.f2513j = str2;
        return str2;
    }
}
