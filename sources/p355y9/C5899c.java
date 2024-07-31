package p355y9;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: y9.c */
/* loaded from: classes.dex */
public class C5899c implements Closeable, Flushable {

    /* renamed from: q */
    public static final String[] f21961q = new String[128];

    /* renamed from: r */
    public static final String[] f21962r;

    /* renamed from: h */
    public final Writer f21963h;

    /* renamed from: i */
    public int[] f21964i = new int[32];

    /* renamed from: j */
    public int f21965j = 0;

    /* renamed from: k */
    public String f21966k;

    /* renamed from: l */
    public String f21967l;

    /* renamed from: m */
    public boolean f21968m;

    /* renamed from: n */
    public boolean f21969n;

    /* renamed from: o */
    public String f21970o;

    /* renamed from: p */
    public boolean f21971p;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f21961q[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f21961q;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f21962r = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C5899c(Writer writer) {
        m23596e0(6);
        this.f21967l = ":";
        this.f21971p = true;
        Objects.requireNonNull(writer, "out == null");
        this.f21963h = writer;
    }

    /* renamed from: E */
    public final boolean m23589E() {
        return this.f21969n;
    }

    /* renamed from: I */
    public boolean m23590I() {
        return this.f21968m;
    }

    /* renamed from: K */
    public C5899c mo5778K(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f21970o != null) {
            throw new IllegalStateException();
        }
        if (this.f21965j == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f21970o = str;
        return this;
    }

    /* renamed from: P */
    public final void m23591P() {
        if (this.f21966k == null) {
            return;
        }
        this.f21963h.write(10);
        int i10 = this.f21965j;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f21963h.write(this.f21966k);
        }
    }

    /* renamed from: W */
    public C5899c mo5779W() {
        if (this.f21970o != null) {
            if (!this.f21971p) {
                this.f21970o = null;
                return this;
            }
            m23605y0();
        }
        m23595d();
        this.f21963h.write("null");
        return this;
    }

    /* renamed from: a */
    public final void m23592a() {
        int m23594c0 = m23594c0();
        if (m23594c0 == 5) {
            this.f21963h.write(44);
        } else if (m23594c0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m23591P();
        m23597f0(4);
    }

    /* renamed from: b0 */
    public final C5899c m23593b0(int i10, char c10) {
        m23595d();
        m23596e0(i10);
        this.f21963h.write(c10);
        return this;
    }

    /* renamed from: c0 */
    public final int m23594c0() {
        int i10 = this.f21965j;
        if (i10 != 0) {
            return this.f21964i[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21963h.close();
        int i10 = this.f21965j;
        if (i10 > 1 || (i10 == 1 && this.f21964i[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f21965j = 0;
    }

    /* renamed from: d */
    public final void m23595d() {
        int m23594c0 = m23594c0();
        if (m23594c0 == 1) {
            m23597f0(2);
        } else {
            if (m23594c0 != 2) {
                if (m23594c0 == 4) {
                    this.f21963h.append((CharSequence) this.f21967l);
                    m23597f0(5);
                    return;
                }
                if (m23594c0 != 6) {
                    if (m23594c0 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f21968m) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                m23597f0(7);
                return;
            }
            this.f21963h.append(',');
        }
        m23591P();
    }

    /* renamed from: e0 */
    public final void m23596e0(int i10) {
        int i11 = this.f21965j;
        int[] iArr = this.f21964i;
        if (i11 == iArr.length) {
            this.f21964i = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.f21964i;
        int i12 = this.f21965j;
        this.f21965j = i12 + 1;
        iArr2[i12] = i10;
    }

    /* renamed from: f */
    public C5899c mo5780f() {
        m23605y0();
        return m23593b0(1, '[');
    }

    /* renamed from: f0 */
    public final void m23597f0(int i10) {
        this.f21964i[this.f21965j - 1] = i10;
    }

    public void flush() {
        if (this.f21965j == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f21963h.flush();
    }

    /* renamed from: g0 */
    public final void m23598g0(boolean z10) {
        this.f21969n = z10;
    }

    /* renamed from: h0 */
    public final void m23599h0(String str) {
        String str2;
        if (str.length() == 0) {
            this.f21966k = null;
            str2 = ":";
        } else {
            this.f21966k = str;
            str2 = ": ";
        }
        this.f21967l = str2;
    }

    /* renamed from: i0 */
    public final void m23600i0(boolean z10) {
        this.f21968m = z10;
    }

    /* renamed from: j */
    public C5899c mo5781j() {
        m23605y0();
        return m23593b0(3, '{');
    }

    /* renamed from: l */
    public final C5899c m23601l(int i10, int i11, char c10) {
        int m23594c0 = m23594c0();
        if (m23594c0 != i11 && m23594c0 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f21970o != null) {
            throw new IllegalStateException("Dangling name: " + this.f21970o);
        }
        this.f21965j--;
        if (m23594c0 == i11) {
            m23591P();
        }
        this.f21963h.write(c10);
        return this;
    }

    /* renamed from: l0 */
    public final void m23602l0(boolean z10) {
        this.f21971p = z10;
    }

    /* renamed from: n */
    public C5899c mo5782n() {
        return m23601l(1, 2, ']');
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m23603n0(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f21969n
            if (r0 == 0) goto L7
            java.lang.String[] r0 = p355y9.C5899c.f21962r
            goto L9
        L7:
            java.lang.String[] r0 = p355y9.C5899c.f21961q
        L9:
            java.io.Writer r1 = r8.f21963h
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f21963h
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f21963h
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f21963h
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f21963h
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p355y9.C5899c.m23603n0(java.lang.String):void");
    }

    /* renamed from: r0 */
    public C5899c mo5783r0(long j10) {
        m23605y0();
        m23595d();
        this.f21963h.write(Long.toString(j10));
        return this;
    }

    /* renamed from: s0 */
    public C5899c mo5784s0(Boolean bool) {
        if (bool == null) {
            return mo5779W();
        }
        m23605y0();
        m23595d();
        this.f21963h.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: u0 */
    public C5899c mo5785u0(Number number) {
        if (number == null) {
            return mo5779W();
        }
        m23605y0();
        String obj = number.toString();
        if (this.f21968m || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            m23595d();
            this.f21963h.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* renamed from: v0 */
    public C5899c mo5786v0(String str) {
        if (str == null) {
            return mo5779W();
        }
        m23605y0();
        m23595d();
        m23603n0(str);
        return this;
    }

    /* renamed from: w */
    public C5899c mo5787w() {
        return m23601l(3, 5, '}');
    }

    /* renamed from: x */
    public final boolean m23604x() {
        return this.f21971p;
    }

    /* renamed from: x0 */
    public C5899c mo5788x0(boolean z10) {
        m23605y0();
        m23595d();
        this.f21963h.write(z10 ? "true" : "false");
        return this;
    }

    /* renamed from: y0 */
    public final void m23605y0() {
        if (this.f21970o != null) {
            m23592a();
            m23603n0(this.f21970o);
            this.f21970o = null;
        }
    }
}
