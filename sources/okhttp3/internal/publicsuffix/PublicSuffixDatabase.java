package okhttp3.internal.publicsuffix;

import bf.C0564j;
import bf.C0566l;
import bf.InterfaceC0559e;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import ye.C5926f;

/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f14371e = {42};

    /* renamed from: f */
    public static final String[] f14372f = new String[0];

    /* renamed from: g */
    public static final String[] f14373g = {"*"};

    /* renamed from: h */
    public static final PublicSuffixDatabase f14374h = new PublicSuffixDatabase();

    /* renamed from: a */
    public final AtomicBoolean f14375a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f14376b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f14377c;

    /* renamed from: d */
    public byte[] f14378d;

    /* renamed from: a */
    public static String m15117a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > -1 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    z10 = z11;
                    i12 = bArr2[i19][i20] & 255;
                }
                i13 = i12 - (bArr[i16 + i21] & 255);
                if (i13 == 0) {
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    }
                    if (bArr2[i19].length != i20) {
                        z11 = z10;
                    } else {
                        if (i19 == bArr2.length - 1) {
                            break;
                        }
                        i19++;
                        i20 = -1;
                        z11 = true;
                    }
                } else {
                    break;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i22 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    while (true) {
                        i19++;
                        if (i19 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i19].length;
                    }
                    if (length2 >= i22) {
                        if (length2 <= i22) {
                            return new String(bArr, i16, i18, StandardCharsets.UTF_8);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i16 - 1;
        }
        return null;
    }

    /* renamed from: c */
    public static PublicSuffixDatabase m15118c() {
        return f14374h;
    }

    /* renamed from: b */
    public final String[] m15119b(String[] strArr) {
        String str;
        String str2;
        String str3;
        int i10 = 0;
        if (this.f14375a.get() || !this.f14375a.compareAndSet(false, true)) {
            try {
                this.f14376b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m15122f();
        }
        synchronized (this) {
            if (this.f14377c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            bArr[i11] = strArr[i11].getBytes(StandardCharsets.UTF_8);
        }
        int i12 = 0;
        while (true) {
            str = null;
            if (i12 >= length) {
                str2 = null;
                break;
            }
            str2 = m15117a(this.f14377c, bArr, i12);
            if (str2 != null) {
                break;
            }
            i12++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i13 = 0; i13 < bArr2.length - 1; i13++) {
                bArr2[i13] = f14371e;
                str3 = m15117a(this.f14377c, bArr2, i13);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i10 >= length - 1) {
                    break;
                }
                String m15117a = m15117a(this.f14378d, bArr, i10);
                if (m15117a != null) {
                    str = m15117a;
                    break;
                }
                i10++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        }
        if (str2 == null && str3 == null) {
            return f14373g;
        }
        String[] split = str2 != null ? str2.split("\\.") : f14372f;
        String[] split2 = str3 != null ? str3.split("\\.") : f14372f;
        return split.length > split2.length ? split : split2;
    }

    /* renamed from: d */
    public String m15120d(String str) {
        Objects.requireNonNull(str, "domain == null");
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] m15119b = m15119b(split);
        if (split.length == m15119b.length && m15119b[0].charAt(0) != '!') {
            return null;
        }
        char charAt = m15119b[0].charAt(0);
        int length = split.length;
        int length2 = m15119b.length;
        if (charAt != '!') {
            length2++;
        }
        StringBuilder sb2 = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (int i10 = length - length2; i10 < split2.length; i10++) {
            sb2.append(split2[i10]);
            sb2.append('.');
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    /* renamed from: e */
    public final void m15121e() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        InterfaceC0559e m2894b = C0566l.m2894b(new C0564j(C0566l.m2899g(resourceAsStream)));
        try {
            byte[] bArr = new byte[m2894b.readInt()];
            m2894b.readFully(bArr);
            byte[] bArr2 = new byte[m2894b.readInt()];
            m2894b.readFully(bArr2);
            m2894b.close();
            synchronized (this) {
                this.f14377c = bArr;
                this.f14378d = bArr2;
            }
            this.f14376b.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (m2894b != null) {
                    try {
                        m2894b.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public final void m15122f() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    m15121e();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    C5926f.m23671l().mo23653s(5, "Failed to read public suffix list", e10);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }
}
