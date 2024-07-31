package p355y9;

import com.google.gson.internal.AbstractC1362e;
import com.google.gson.internal.bind.C1358a;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: y9.a */
/* loaded from: classes.dex */
public class C5897a implements Closeable {

    /* renamed from: h */
    public final Reader f21935h;

    /* renamed from: i */
    public boolean f21936i = false;

    /* renamed from: j */
    public final char[] f21937j = new char[1024];

    /* renamed from: k */
    public int f21938k = 0;

    /* renamed from: l */
    public int f21939l = 0;

    /* renamed from: m */
    public int f21940m = 0;

    /* renamed from: n */
    public int f21941n = 0;

    /* renamed from: o */
    public int f21942o = 0;

    /* renamed from: p */
    public long f21943p;

    /* renamed from: q */
    public int f21944q;

    /* renamed from: r */
    public String f21945r;

    /* renamed from: s */
    public int[] f21946s;

    /* renamed from: t */
    public int f21947t;

    /* renamed from: u */
    public String[] f21948u;

    /* renamed from: v */
    public int[] f21949v;

    /* renamed from: y9.a$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC1362e {
        @Override // com.google.gson.internal.AbstractC1362e
        /* renamed from: a */
        public void mo5801a(C5897a c5897a) {
            int i10;
            if (c5897a instanceof C1358a) {
                ((C1358a) c5897a).m5761P0();
                return;
            }
            int i11 = c5897a.f21942o;
            if (i11 == 0) {
                i11 = c5897a.m23580l();
            }
            if (i11 == 13) {
                i10 = 9;
            } else if (i11 == 12) {
                i10 = 8;
            } else {
                if (i11 != 14) {
                    throw new IllegalStateException("Expected a name but was " + c5897a.mo5774r0() + c5897a.m23575P());
                }
                i10 = 10;
            }
            c5897a.f21942o = i10;
        }
    }

    static {
        AbstractC1362e.f5167a = new a();
    }

    public C5897a(Reader reader) {
        int[] iArr = new int[32];
        this.f21946s = iArr;
        this.f21947t = 0;
        this.f21947t = 0 + 1;
        iArr[0] = 6;
        this.f21948u = new String[32];
        this.f21949v = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f21935h = reader;
    }

    /* renamed from: E */
    public boolean mo5755E() {
        int i10 = this.f21942o;
        if (i10 == 0) {
            i10 = m23580l();
        }
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    /* renamed from: G0 */
    public final boolean m23569G0(String str) {
        int length = str.length();
        while (true) {
            if (this.f21938k + length > this.f21939l && !m23585x(length)) {
                return false;
            }
            char[] cArr = this.f21937j;
            int i10 = this.f21938k;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f21937j[this.f21938k + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f21940m++;
            this.f21941n = i10 + 1;
            this.f21938k++;
        }
    }

    /* renamed from: H0 */
    public final void m23570H0() {
        char c10;
        do {
            if (this.f21938k >= this.f21939l && !m23585x(1)) {
                return;
            }
            char[] cArr = this.f21937j;
            int i10 = this.f21938k;
            int i11 = i10 + 1;
            this.f21938k = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f21940m++;
                this.f21941n = i11;
                return;
            }
        } while (c10 != '\r');
    }

    /* renamed from: I */
    public final boolean m23571I() {
        return this.f21936i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:242)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* renamed from: I0 */
    public final void m23572I0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f21938k
            int r2 = r1 + r0
            int r3 = r4.f21939l
            if (r2 >= r3) goto L51
            char[] r2 = r4.f21937j
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m23576f()
        L4b:
            int r1 = r4.f21938k
            int r1 = r1 + r0
            r4.f21938k = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f21938k = r1
            r0 = 1
            boolean r0 = r4.m23585x(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p355y9.C5897a.m23572I0():void");
    }

    /* renamed from: J0 */
    public void mo5756J0() {
        char c10;
        int i10 = 0;
        do {
            int i11 = this.f21942o;
            if (i11 == 0) {
                i11 = m23580l();
            }
            if (i11 == 3) {
                m23584v0(1);
            } else if (i11 == 1) {
                m23584v0(3);
            } else {
                if (i11 == 4 || i11 == 2) {
                    this.f21947t--;
                    i10--;
                } else if (i11 == 14 || i11 == 10) {
                    m23572I0();
                } else {
                    if (i11 == 8 || i11 == 12) {
                        c10 = '\'';
                    } else if (i11 == 9 || i11 == 13) {
                        c10 = '\"';
                    } else if (i11 == 16) {
                        this.f21938k += this.f21944q;
                    }
                    m23588z0(c10);
                }
                this.f21942o = 0;
            }
            i10++;
            this.f21942o = 0;
        } while (i10 != 0);
        int[] iArr = this.f21949v;
        int i12 = this.f21947t;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f21948u[i12 - 1] = "null";
    }

    /* renamed from: K */
    public final boolean m23573K(char c10) {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case C1417R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                        case C1417R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                            return false;
                        case C1417R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m23576f();
        return false;
    }

    /* renamed from: K0 */
    public final IOException m23574K0(String str) {
        throw new C5900d(str + m23575P());
    }

    /* renamed from: P */
    public String m23575P() {
        return " at line " + (this.f21940m + 1) + " column " + ((this.f21938k - this.f21941n) + 1) + " path " + mo5773o0();
    }

    /* renamed from: W */
    public boolean mo5763W() {
        int i10 = this.f21942o;
        if (i10 == 0) {
            i10 = m23580l();
        }
        if (i10 == 5) {
            this.f21942o = 0;
            int[] iArr = this.f21949v;
            int i11 = this.f21947t - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        }
        if (i10 == 6) {
            this.f21942o = 0;
            int[] iArr2 = this.f21949v;
            int i12 = this.f21947t - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + mo5774r0() + m23575P());
    }

    /* renamed from: a */
    public void mo5764a() {
        int i10 = this.f21942o;
        if (i10 == 0) {
            i10 = m23580l();
        }
        if (i10 == 3) {
            m23584v0(1);
            this.f21949v[this.f21947t - 1] = 0;
            this.f21942o = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo5774r0() + m23575P());
        }
    }

    /* renamed from: b0 */
    public double mo5765b0() {
        String m23578i0;
        int i10 = this.f21942o;
        if (i10 == 0) {
            i10 = m23580l();
        }
        if (i10 == 15) {
            this.f21942o = 0;
            int[] iArr = this.f21949v;
            int i11 = this.f21947t - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f21943p;
        }
        if (i10 == 16) {
            this.f21945r = new String(this.f21937j, this.f21938k, this.f21944q);
            this.f21938k += this.f21944q;
        } else {
            if (i10 == 8 || i10 == 9) {
                m23578i0 = m23578i0(i10 == 8 ? '\'' : '\"');
            } else if (i10 == 10) {
                m23578i0 = m23581n0();
            } else if (i10 != 11) {
                throw new IllegalStateException("Expected a double but was " + mo5774r0() + m23575P());
            }
            this.f21945r = m23578i0;
        }
        this.f21942o = 11;
        double parseDouble = Double.parseDouble(this.f21945r);
        if (!this.f21936i && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new C5900d("JSON forbids NaN and infinities: " + parseDouble + m23575P());
        }
        this.f21945r = null;
        this.f21942o = 0;
        int[] iArr2 = this.f21949v;
        int i12 = this.f21947t - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    /* renamed from: c0 */
    public int mo5766c0() {
        String m23578i0;
        int i10 = this.f21942o;
        if (i10 == 0) {
            i10 = m23580l();
        }
        if (i10 == 15) {
            long j10 = this.f21943p;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f21942o = 0;
                int[] iArr = this.f21949v;
                int i12 = this.f21947t - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f21943p + m23575P());
        }
        if (i10 == 16) {
            this.f21945r = new String(this.f21937j, this.f21938k, this.f21944q);
            this.f21938k += this.f21944q;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw new IllegalStateException("Expected an int but was " + mo5774r0() + m23575P());
            }
            if (i10 == 10) {
                m23578i0 = m23581n0();
            } else {
                m23578i0 = m23578i0(i10 == 8 ? '\'' : '\"');
            }
            this.f21945r = m23578i0;
            try {
                int parseInt = Integer.parseInt(this.f21945r);
                this.f21942o = 0;
                int[] iArr2 = this.f21949v;
                int i13 = this.f21947t - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f21942o = 11;
        double parseDouble = Double.parseDouble(this.f21945r);
        int i14 = (int) parseDouble;
        if (i14 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f21945r + m23575P());
        }
        this.f21945r = null;
        this.f21942o = 0;
        int[] iArr3 = this.f21949v;
        int i15 = this.f21947t - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21942o = 0;
        this.f21946s[0] = 8;
        this.f21947t = 1;
        this.f21935h.close();
    }

    /* renamed from: d */
    public void mo5767d() {
        int i10 = this.f21942o;
        if (i10 == 0) {
            i10 = m23580l();
        }
        if (i10 == 1) {
            m23584v0(3);
            this.f21942o = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo5774r0() + m23575P());
        }
    }

    /* renamed from: e0 */
    public long mo5768e0() {
        String m23578i0;
        int i10 = this.f21942o;
        if (i10 == 0) {
            i10 = m23580l();
        }
        if (i10 == 15) {
            this.f21942o = 0;
            int[] iArr = this.f21949v;
            int i11 = this.f21947t - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f21943p;
        }
        if (i10 == 16) {
            this.f21945r = new String(this.f21937j, this.f21938k, this.f21944q);
            this.f21938k += this.f21944q;
        } else {
            if (i10 != 8 && i10 != 9 && i10 != 10) {
                throw new IllegalStateException("Expected a long but was " + mo5774r0() + m23575P());
            }
            if (i10 == 10) {
                m23578i0 = m23581n0();
            } else {
                m23578i0 = m23578i0(i10 == 8 ? '\'' : '\"');
            }
            this.f21945r = m23578i0;
            try {
                long parseLong = Long.parseLong(this.f21945r);
                this.f21942o = 0;
                int[] iArr2 = this.f21949v;
                int i12 = this.f21947t - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f21942o = 11;
        double parseDouble = Double.parseDouble(this.f21945r);
        long j10 = (long) parseDouble;
        if (j10 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f21945r + m23575P());
        }
        this.f21945r = null;
        this.f21942o = 0;
        int[] iArr3 = this.f21949v;
        int i13 = this.f21947t - 1;
        iArr3[i13] = iArr3[i13] + 1;
        return j10;
    }

    /* renamed from: f */
    public final void m23576f() {
        if (!this.f21936i) {
            throw m23574K0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: f0 */
    public String mo5769f0() {
        char c10;
        String m23578i0;
        int i10 = this.f21942o;
        if (i10 == 0) {
            i10 = m23580l();
        }
        if (i10 == 14) {
            m23578i0 = m23581n0();
        } else {
            if (i10 == 12) {
                c10 = '\'';
            } else {
                if (i10 != 13) {
                    throw new IllegalStateException("Expected a name but was " + mo5774r0() + m23575P());
                }
                c10 = '\"';
            }
            m23578i0 = m23578i0(c10);
        }
        this.f21942o = 0;
        this.f21948u[this.f21947t - 1] = m23578i0;
        return m23578i0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r1 != '/') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        r7.f21938k = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if (r4 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r7.f21938k = r4 - 1;
        r2 = m23585x(2);
        r7.f21938k++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        m23576f();
        r2 = r7.f21938k;
        r3 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        if (r3 == '*') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        r7.f21938k = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        if (m23569G0("*\/") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        throw m23574K0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:
    
        if (r3 == '/') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0078, code lost:
    
        r7.f21938k = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
    
        r7.f21938k = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        if (r1 != '#') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009e, code lost:
    
        m23576f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a2, code lost:
    
        return r1;
     */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m23577g0(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f21937j
        L2:
            int r1 = r7.f21938k
        L4:
            int r2 = r7.f21939l
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r7.f21938k = r1
            boolean r1 = r7.m23585x(r3)
            if (r1 != 0) goto L30
            if (r8 != 0) goto L15
            r8 = -1
            return r8
        L15:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.m23575P()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L30:
            int r1 = r7.f21938k
            int r2 = r7.f21939l
        L34:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L44
            int r1 = r7.f21940m
            int r1 = r1 + r3
            r7.f21940m = r1
            r7.f21941n = r4
            goto La3
        L44:
            r5 = 32
            if (r1 == r5) goto La3
            r5 = 13
            if (r1 == r5) goto La3
            r5 = 9
            if (r1 != r5) goto L51
            goto La3
        L51:
            r5 = 47
            if (r1 != r5) goto L98
            r7.f21938k = r4
            r6 = 2
            if (r4 != r2) goto L6a
            int r4 = r4 + (-1)
            r7.f21938k = r4
            boolean r2 = r7.m23585x(r6)
            int r4 = r7.f21938k
            int r4 = r4 + r3
            r7.f21938k = r4
            if (r2 != 0) goto L6a
            return r1
        L6a:
            r7.m23576f()
            int r2 = r7.f21938k
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L80
            if (r3 == r5) goto L78
            return r1
        L78:
            int r2 = r2 + 1
            r7.f21938k = r2
        L7c:
            r7.m23570H0()
            goto L2
        L80:
            int r2 = r2 + 1
            r7.f21938k = r2
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r7.m23569G0(r1)
            if (r1 == 0) goto L91
            int r1 = r7.f21938k
            int r1 = r1 + r6
            goto L4
        L91:
            java.lang.String r8 = "Unterminated comment"
            java.io.IOException r8 = r7.m23574K0(r8)
            throw r8
        L98:
            r2 = 35
            r7.f21938k = r4
            if (r1 != r2) goto La2
            r7.m23576f()
            goto L7c
        La2:
            return r1
        La3:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: p355y9.C5897a.m23577g0(boolean):int");
    }

    /* renamed from: h0 */
    public void mo5770h0() {
        int i10 = this.f21942o;
        if (i10 == 0) {
            i10 = m23580l();
        }
        if (i10 == 7) {
            this.f21942o = 0;
            int[] iArr = this.f21949v;
            int i11 = this.f21947t - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo5774r0() + m23575P());
    }

    /* renamed from: i0 */
    public final String m23578i0(char c10) {
        char[] cArr = this.f21937j;
        StringBuilder sb2 = null;
        while (true) {
            int i10 = this.f21938k;
            int i11 = this.f21939l;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f21938k = i12;
                        int i13 = (i12 - i10) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i10, i13);
                        }
                        sb2.append(cArr, i10, i13);
                        return sb2.toString();
                    }
                    if (c11 == '\\') {
                        this.f21938k = i12;
                        int i14 = (i12 - i10) - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max((i14 + 1) * 2, 16));
                        }
                        sb2.append(cArr, i10, i14);
                        sb2.append(m23586x0());
                    } else {
                        if (c11 == '\n') {
                            this.f21940m++;
                            this.f21941n = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max((i10 - i10) * 2, 16));
                    }
                    sb2.append(cArr, i10, i10 - i10);
                    this.f21938k = i10;
                    if (!m23585x(1)) {
                        throw m23574K0("Unterminated string");
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public final void m23579j() {
        m23577g0(true);
        int i10 = this.f21938k - 1;
        this.f21938k = i10;
        if (i10 + 5 <= this.f21939l || m23585x(5)) {
            char[] cArr = this.f21937j;
            if (cArr[i10] == ')' && cArr[i10 + 1] == ']' && cArr[i10 + 2] == '}' && cArr[i10 + 3] == '\'' && cArr[i10 + 4] == '\n') {
                this.f21938k += 5;
            }
        }
    }

    /* renamed from: l */
    public int m23580l() {
        int i10;
        int m23577g0;
        int[] iArr = this.f21946s;
        int i11 = this.f21947t;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else {
            if (i12 != 2) {
                if (i12 == 3 || i12 == 5) {
                    iArr[i11 - 1] = 4;
                    if (i12 == 5 && (m23577g0 = m23577g0(true)) != 44) {
                        if (m23577g0 != 59) {
                            if (m23577g0 != 125) {
                                throw m23574K0("Unterminated object");
                            }
                            this.f21942o = 2;
                            return 2;
                        }
                        m23576f();
                    }
                    int m23577g02 = m23577g0(true);
                    if (m23577g02 == 34) {
                        i10 = 13;
                    } else if (m23577g02 == 39) {
                        m23576f();
                        i10 = 12;
                    } else {
                        if (m23577g02 == 125) {
                            if (i12 == 5) {
                                throw m23574K0("Expected name");
                            }
                            this.f21942o = 2;
                            return 2;
                        }
                        m23576f();
                        this.f21938k--;
                        if (!m23573K((char) m23577g02)) {
                            throw m23574K0("Expected name");
                        }
                        i10 = 14;
                    }
                } else if (i12 == 4) {
                    iArr[i11 - 1] = 5;
                    int m23577g03 = m23577g0(true);
                    if (m23577g03 != 58) {
                        if (m23577g03 != 61) {
                            throw m23574K0("Expected ':'");
                        }
                        m23576f();
                        if (this.f21938k < this.f21939l || m23585x(1)) {
                            char[] cArr = this.f21937j;
                            int i13 = this.f21938k;
                            if (cArr[i13] == '>') {
                                this.f21938k = i13 + 1;
                            }
                        }
                    }
                } else if (i12 == 6) {
                    if (this.f21936i) {
                        m23579j();
                    }
                    this.f21946s[this.f21947t - 1] = 7;
                } else if (i12 == 7) {
                    if (m23577g0(false) == -1) {
                        i10 = 17;
                    } else {
                        m23576f();
                        this.f21938k--;
                    }
                } else if (i12 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.f21942o = i10;
                return i10;
            }
            int m23577g04 = m23577g0(true);
            if (m23577g04 != 44) {
                if (m23577g04 != 59) {
                    if (m23577g04 != 93) {
                        throw m23574K0("Unterminated array");
                    }
                    this.f21942o = 4;
                    return 4;
                }
                m23576f();
            }
        }
        int m23577g05 = m23577g0(true);
        if (m23577g05 != 34) {
            if (m23577g05 == 39) {
                m23576f();
                this.f21942o = 8;
                return 8;
            }
            if (m23577g05 != 44 && m23577g05 != 59) {
                if (m23577g05 == 91) {
                    this.f21942o = 3;
                    return 3;
                }
                if (m23577g05 != 93) {
                    if (m23577g05 == 123) {
                        this.f21942o = 1;
                        return 1;
                    }
                    this.f21938k--;
                    int m23582s0 = m23582s0();
                    if (m23582s0 != 0) {
                        return m23582s0;
                    }
                    int m23583u0 = m23583u0();
                    if (m23583u0 != 0) {
                        return m23583u0;
                    }
                    if (!m23573K(this.f21937j[this.f21938k])) {
                        throw m23574K0("Expected value");
                    }
                    m23576f();
                    i10 = 10;
                } else if (i12 == 1) {
                    this.f21942o = 4;
                    return 4;
                }
            }
            if (i12 != 1 && i12 != 2) {
                throw m23574K0("Unexpected value");
            }
            m23576f();
            this.f21938k--;
            this.f21942o = 7;
            return 7;
        }
        i10 = 9;
        this.f21942o = i10;
        return i10;
    }

    /* renamed from: l0 */
    public String mo5771l0() {
        String str;
        char c10;
        int i10 = this.f21942o;
        if (i10 == 0) {
            i10 = m23580l();
        }
        if (i10 == 10) {
            str = m23581n0();
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else if (i10 == 9) {
                c10 = '\"';
            } else if (i10 == 11) {
                str = this.f21945r;
                this.f21945r = null;
            } else if (i10 == 15) {
                str = Long.toString(this.f21943p);
            } else {
                if (i10 != 16) {
                    throw new IllegalStateException("Expected a string but was " + mo5774r0() + m23575P());
                }
                str = new String(this.f21937j, this.f21938k, this.f21944q);
                this.f21938k += this.f21944q;
            }
            str = m23578i0(c10);
        }
        this.f21942o = 0;
        int[] iArr = this.f21949v;
        int i11 = this.f21947t - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    /* renamed from: n */
    public void mo5772n() {
        int i10 = this.f21942o;
        if (i10 == 0) {
            i10 = m23580l();
        }
        if (i10 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + mo5774r0() + m23575P());
        }
        int i11 = this.f21947t - 1;
        this.f21947t = i11;
        int[] iArr = this.f21949v;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f21942o = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        m23576f();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m23581n0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r6.f21938k
            int r4 = r3 + r2
            int r5 = r6.f21939l
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f21937j
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m23576f()
            goto L5c
        L4e:
            char[] r3 = r6.f21937j
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.m23585x(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f21937j
            int r4 = r6.f21938k
            r1.append(r3, r4, r2)
            int r3 = r6.f21938k
            int r3 = r3 + r2
            r6.f21938k = r3
            r2 = 1
            boolean r2 = r6.m23585x(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f21937j
            int r3 = r6.f21938k
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f21937j
            int r3 = r6.f21938k
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f21938k
            int r2 = r2 + r0
            r6.f21938k = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p355y9.C5897a.m23581n0():java.lang.String");
    }

    /* renamed from: o0 */
    public String mo5773o0() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = this.f21947t;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f21946s[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(this.f21949v[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String[] strArr = this.f21948u;
                if (strArr[i11] != null) {
                    sb2.append(strArr[i11]);
                }
            }
        }
        return sb2.toString();
    }

    /* renamed from: r0 */
    public EnumC5898b mo5774r0() {
        int i10 = this.f21942o;
        if (i10 == 0) {
            i10 = m23580l();
        }
        switch (i10) {
            case 1:
                return EnumC5898b.BEGIN_OBJECT;
            case 2:
                return EnumC5898b.END_OBJECT;
            case 3:
                return EnumC5898b.BEGIN_ARRAY;
            case 4:
                return EnumC5898b.END_ARRAY;
            case 5:
            case 6:
                return EnumC5898b.BOOLEAN;
            case 7:
                return EnumC5898b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC5898b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC5898b.NAME;
            case 15:
            case 16:
                return EnumC5898b.NUMBER;
            case 17:
                return EnumC5898b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: s0 */
    public final int m23582s0() {
        int i10;
        String str;
        String str2;
        char c10 = this.f21937j[this.f21938k];
        if (c10 == 't' || c10 == 'T') {
            i10 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c10 == 'f' || c10 == 'F') {
            i10 = 6;
            str = "false";
            str2 = "FALSE";
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            i10 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f21938k + i11 >= this.f21939l && !m23585x(i11 + 1)) {
                return 0;
            }
            char c11 = this.f21937j[this.f21938k + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f21938k + length < this.f21939l || m23585x(length + 1)) && m23573K(this.f21937j[this.f21938k + length])) {
            return 0;
        }
        this.f21938k += length;
        this.f21942o = i10;
        return i10;
    }

    public String toString() {
        return getClass().getSimpleName() + m23575P();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0093, code lost:
    
        if (r9 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0095, code lost:
    
        if (r10 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009d, code lost:
    
        if (r13 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (r11 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        if (r13 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00aa, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        r18.f21943p = r11;
        r18.f21938k += r8;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
    
        r18.f21942o = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r9 == 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        if (r9 == 4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r9 != 7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        r18.f21944q = r8;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0091, code lost:
    
        if (m23573K(r14) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c7, code lost:
    
        return 0;
     */
    /* renamed from: u0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m23583u0() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p355y9.C5897a.m23583u0():int");
    }

    /* renamed from: v0 */
    public final void m23584v0(int i10) {
        int i11 = this.f21947t;
        int[] iArr = this.f21946s;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f21946s = Arrays.copyOf(iArr, i12);
            this.f21949v = Arrays.copyOf(this.f21949v, i12);
            this.f21948u = (String[]) Arrays.copyOf(this.f21948u, i12);
        }
        int[] iArr2 = this.f21946s;
        int i13 = this.f21947t;
        this.f21947t = i13 + 1;
        iArr2[i13] = i10;
    }

    /* renamed from: w */
    public void mo5775w() {
        int i10 = this.f21942o;
        if (i10 == 0) {
            i10 = m23580l();
        }
        if (i10 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + mo5774r0() + m23575P());
        }
        int i11 = this.f21947t - 1;
        this.f21947t = i11;
        this.f21948u[i11] = null;
        int[] iArr = this.f21949v;
        int i12 = i11 - 1;
        iArr[i12] = iArr[i12] + 1;
        this.f21942o = 0;
    }

    /* renamed from: x */
    public final boolean m23585x(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f21937j;
        int i13 = this.f21941n;
        int i14 = this.f21938k;
        this.f21941n = i13 - i14;
        int i15 = this.f21939l;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f21939l = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f21939l = 0;
        }
        this.f21938k = 0;
        do {
            Reader reader = this.f21935h;
            int i17 = this.f21939l;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f21939l + read;
            this.f21939l = i11;
            if (this.f21940m == 0 && (i12 = this.f21941n) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f21938k++;
                this.f21941n = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    /* renamed from: x0 */
    public final char m23586x0() {
        int i10;
        int i11;
        if (this.f21938k == this.f21939l && !m23585x(1)) {
            throw m23574K0("Unterminated escape sequence");
        }
        char[] cArr = this.f21937j;
        int i12 = this.f21938k;
        int i13 = i12 + 1;
        this.f21938k = i13;
        char c10 = cArr[i12];
        if (c10 == '\n') {
            this.f21940m++;
            this.f21941n = i13;
        } else if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
            if (c10 == 'b') {
                return '\b';
            }
            if (c10 == 'f') {
                return '\f';
            }
            if (c10 == 'n') {
                return '\n';
            }
            if (c10 == 'r') {
                return '\r';
            }
            if (c10 == 't') {
                return '\t';
            }
            if (c10 != 'u') {
                throw m23574K0("Invalid escape sequence");
            }
            if (i13 + 4 > this.f21939l && !m23585x(4)) {
                throw m23574K0("Unterminated escape sequence");
            }
            char c11 = 0;
            int i14 = this.f21938k;
            int i15 = i14 + 4;
            while (i14 < i15) {
                char c12 = this.f21937j[i14];
                char c13 = (char) (c11 << 4);
                if (c12 < '0' || c12 > '9') {
                    if (c12 >= 'a' && c12 <= 'f') {
                        i10 = c12 - 'a';
                    } else {
                        if (c12 < 'A' || c12 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f21937j, this.f21938k, 4));
                        }
                        i10 = c12 - 'A';
                    }
                    i11 = i10 + 10;
                } else {
                    i11 = c12 - '0';
                }
                c11 = (char) (c13 + i11);
                i14++;
            }
            this.f21938k += 4;
            return c11;
        }
        return c10;
    }

    /* renamed from: y0 */
    public final void m23587y0(boolean z10) {
        this.f21936i = z10;
    }

    /* renamed from: z0 */
    public final void m23588z0(char c10) {
        char[] cArr = this.f21937j;
        while (true) {
            int i10 = this.f21938k;
            int i11 = this.f21939l;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f21938k = i12;
                        return;
                    }
                    if (c11 == '\\') {
                        this.f21938k = i12;
                        m23586x0();
                        break;
                    } else {
                        if (c11 == '\n') {
                            this.f21940m++;
                            this.f21941n = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.f21938k = i10;
                    if (!m23585x(1)) {
                        throw m23574K0("Unterminated string");
                    }
                }
            }
        }
    }
}
