package p063e5;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p047d5.AbstractC1558m;
import p047d5.C1547b;
import p047d5.C1557l;
import p047d5.InterfaceC1553h;
import p063e5.C1661c;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4022e;
import p222p5.C4046r;
import p222p5.C4054z;

/* renamed from: e5.c */
/* loaded from: classes.dex */
public final class C1661c extends AbstractC1663e {

    /* renamed from: g */
    public final C4015a0 f6164g = new C4015a0();

    /* renamed from: h */
    public final C4054z f6165h = new C4054z();

    /* renamed from: i */
    public int f6166i = -1;

    /* renamed from: j */
    public final boolean f6167j;

    /* renamed from: k */
    public final int f6168k;

    /* renamed from: l */
    public final b[] f6169l;

    /* renamed from: m */
    public b f6170m;

    /* renamed from: n */
    public List<C1547b> f6171n;

    /* renamed from: o */
    public List<C1547b> f6172o;

    /* renamed from: p */
    public c f6173p;

    /* renamed from: q */
    public int f6174q;

    /* renamed from: e5.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c */
        public static final Comparator<a> f6175c = new Comparator() { // from class: e5.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m6649c;
                m6649c = C1661c.a.m6649c((C1661c.a) obj, (C1661c.a) obj2);
                return m6649c;
            }
        };

        /* renamed from: a */
        public final C1547b f6176a;

        /* renamed from: b */
        public final int f6177b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            C1547b.b m6331n = new C1547b.b().m6332o(charSequence).m6333p(alignment).m6325h(f10, i10).m6326i(i11).m6328k(f11).m6329l(i12).m6331n(f12);
            if (z10) {
                m6331n.m6336s(i13);
            }
            this.f6176a = m6331n.m6318a();
            this.f6177b = i14;
        }

        /* renamed from: c */
        public static /* synthetic */ int m6649c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f6177b, aVar.f6177b);
        }
    }

    /* renamed from: e5.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: A */
        public static final int[] f6178A;

        /* renamed from: B */
        public static final int[] f6179B;

        /* renamed from: C */
        public static final boolean[] f6180C;

        /* renamed from: D */
        public static final int[] f6181D;

        /* renamed from: E */
        public static final int[] f6182E;

        /* renamed from: F */
        public static final int[] f6183F;

        /* renamed from: G */
        public static final int[] f6184G;

        /* renamed from: w */
        public static final int f6185w = m6651h(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f6186x;

        /* renamed from: y */
        public static final int f6187y;

        /* renamed from: z */
        public static final int[] f6188z;

        /* renamed from: a */
        public final List<SpannableString> f6189a = new ArrayList();

        /* renamed from: b */
        public final SpannableStringBuilder f6190b = new SpannableStringBuilder();

        /* renamed from: c */
        public boolean f6191c;

        /* renamed from: d */
        public boolean f6192d;

        /* renamed from: e */
        public int f6193e;

        /* renamed from: f */
        public boolean f6194f;

        /* renamed from: g */
        public int f6195g;

        /* renamed from: h */
        public int f6196h;

        /* renamed from: i */
        public int f6197i;

        /* renamed from: j */
        public int f6198j;

        /* renamed from: k */
        public boolean f6199k;

        /* renamed from: l */
        public int f6200l;

        /* renamed from: m */
        public int f6201m;

        /* renamed from: n */
        public int f6202n;

        /* renamed from: o */
        public int f6203o;

        /* renamed from: p */
        public int f6204p;

        /* renamed from: q */
        public int f6205q;

        /* renamed from: r */
        public int f6206r;

        /* renamed from: s */
        public int f6207s;

        /* renamed from: t */
        public int f6208t;

        /* renamed from: u */
        public int f6209u;

        /* renamed from: v */
        public int f6210v;

        static {
            int m6651h = m6651h(0, 0, 0, 0);
            f6186x = m6651h;
            int m6651h2 = m6651h(0, 0, 0, 3);
            f6187y = m6651h2;
            f6188z = new int[]{0, 0, 0, 0, 0, 2, 0};
            f6178A = new int[]{0, 0, 0, 0, 0, 0, 2};
            f6179B = new int[]{3, 3, 3, 3, 3, 3, 1};
            f6180C = new boolean[]{false, false, false, true, true, true, false};
            f6181D = new int[]{m6651h, m6651h2, m6651h, m6651h, m6651h2, m6651h, m6651h};
            f6182E = new int[]{0, 1, 2, 3, 4, 3, 4};
            f6183F = new int[]{0, 0, 0, 0, 0, 3, 3};
            f6184G = new int[]{m6651h, m6651h, m6651h, m6651h, m6651h, m6651h2, m6651h2};
        }

        public b() {
            m6661l();
        }

        /* renamed from: g */
        public static int m6650g(int i10, int i11, int i12) {
            return m6651h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m6651h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                p222p5.C4014a.m15197c(r4, r0, r1)
                p222p5.C4014a.m15197c(r5, r0, r1)
                p222p5.C4014a.m15197c(r6, r0, r1)
                p222p5.C4014a.m15197c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = r0
                goto L22
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L22
            L21:
                r7 = r2
            L22:
                if (r4 <= r1) goto L26
                r4 = r2
                goto L27
            L26:
                r4 = r0
            L27:
                if (r5 <= r1) goto L2b
                r5 = r2
                goto L2c
            L2b:
                r5 = r0
            L2c:
                if (r6 <= r1) goto L2f
                r0 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p063e5.C1661c.b.m6651h(int, int, int, int):int");
        }

        /* renamed from: a */
        public void m6652a(char c10) {
            if (c10 != '\n') {
                this.f6190b.append(c10);
                return;
            }
            this.f6189a.add(m6655d());
            this.f6190b.clear();
            if (this.f6204p != -1) {
                this.f6204p = 0;
            }
            if (this.f6205q != -1) {
                this.f6205q = 0;
            }
            if (this.f6206r != -1) {
                this.f6206r = 0;
            }
            if (this.f6208t != -1) {
                this.f6208t = 0;
            }
            while (true) {
                if ((!this.f6199k || this.f6189a.size() < this.f6198j) && this.f6189a.size() < 15) {
                    return;
                } else {
                    this.f6189a.remove(0);
                }
            }
        }

        /* renamed from: b */
        public void m6653b() {
            int length = this.f6190b.length();
            if (length > 0) {
                this.f6190b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p063e5.C1661c.a m6654c() {
            /*
                Method dump skipped, instructions count: 195
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p063e5.C1661c.b.m6654c():e5.c$a");
        }

        /* renamed from: d */
        public SpannableString m6655d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f6190b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f6204p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f6204p, length, 33);
                }
                if (this.f6205q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f6205q, length, 33);
                }
                if (this.f6206r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f6207s), this.f6206r, length, 33);
                }
                if (this.f6208t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f6209u), this.f6208t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public void m6656e() {
            this.f6189a.clear();
            this.f6190b.clear();
            this.f6204p = -1;
            this.f6205q = -1;
            this.f6206r = -1;
            this.f6208t = -1;
            this.f6210v = 0;
        }

        /* renamed from: f */
        public void m6657f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f6191c = true;
            this.f6192d = z10;
            this.f6199k = z11;
            this.f6193e = i10;
            this.f6194f = z13;
            this.f6195g = i11;
            this.f6196h = i12;
            this.f6197i = i15;
            int i18 = i13 + 1;
            if (this.f6198j != i18) {
                this.f6198j = i18;
                while (true) {
                    if ((!z11 || this.f6189a.size() < this.f6198j) && this.f6189a.size() < 15) {
                        break;
                    } else {
                        this.f6189a.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f6201m != i16) {
                this.f6201m = i16;
                int i19 = i16 - 1;
                m6666q(f6181D[i19], f6187y, f6180C[i19], 0, f6178A[i19], f6179B[i19], f6188z[i19]);
            }
            if (i17 == 0 || this.f6202n == i17) {
                return;
            }
            this.f6202n = i17;
            int i20 = i17 - 1;
            m6662m(0, 1, 1, false, false, f6183F[i20], f6182E[i20]);
            m6663n(f6185w, f6184G[i20], f6186x);
        }

        /* renamed from: i */
        public boolean m6658i() {
            return this.f6191c;
        }

        /* renamed from: j */
        public boolean m6659j() {
            return !m6658i() || (this.f6189a.isEmpty() && this.f6190b.length() == 0);
        }

        /* renamed from: k */
        public boolean m6660k() {
            return this.f6192d;
        }

        /* renamed from: l */
        public void m6661l() {
            m6656e();
            this.f6191c = false;
            this.f6192d = false;
            this.f6193e = 4;
            this.f6194f = false;
            this.f6195g = 0;
            this.f6196h = 0;
            this.f6197i = 0;
            this.f6198j = 15;
            this.f6199k = true;
            this.f6200l = 0;
            this.f6201m = 0;
            this.f6202n = 0;
            int i10 = f6186x;
            this.f6203o = i10;
            this.f6207s = f6185w;
            this.f6209u = i10;
        }

        /* renamed from: m */
        public void m6662m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f6204p != -1) {
                if (!z10) {
                    this.f6190b.setSpan(new StyleSpan(2), this.f6204p, this.f6190b.length(), 33);
                    this.f6204p = -1;
                }
            } else if (z10) {
                this.f6204p = this.f6190b.length();
            }
            if (this.f6205q == -1) {
                if (z11) {
                    this.f6205q = this.f6190b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f6190b.setSpan(new UnderlineSpan(), this.f6205q, this.f6190b.length(), 33);
                this.f6205q = -1;
            }
        }

        /* renamed from: n */
        public void m6663n(int i10, int i11, int i12) {
            if (this.f6206r != -1 && this.f6207s != i10) {
                this.f6190b.setSpan(new ForegroundColorSpan(this.f6207s), this.f6206r, this.f6190b.length(), 33);
            }
            if (i10 != f6185w) {
                this.f6206r = this.f6190b.length();
                this.f6207s = i10;
            }
            if (this.f6208t != -1 && this.f6209u != i11) {
                this.f6190b.setSpan(new BackgroundColorSpan(this.f6209u), this.f6208t, this.f6190b.length(), 33);
            }
            if (i11 != f6186x) {
                this.f6208t = this.f6190b.length();
                this.f6209u = i11;
            }
        }

        /* renamed from: o */
        public void m6664o(int i10, int i11) {
            if (this.f6210v != i10) {
                m6652a('\n');
            }
            this.f6210v = i10;
        }

        /* renamed from: p */
        public void m6665p(boolean z10) {
            this.f6192d = z10;
        }

        /* renamed from: q */
        public void m6666q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f6203o = i10;
            this.f6200l = i15;
        }
    }

    /* renamed from: e5.c$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final int f6211a;

        /* renamed from: b */
        public final int f6212b;

        /* renamed from: c */
        public final byte[] f6213c;

        /* renamed from: d */
        public int f6214d = 0;

        public c(int i10, int i11) {
            this.f6211a = i10;
            this.f6212b = i11;
            this.f6213c = new byte[(i11 * 2) - 1];
        }
    }

    public C1661c(int i10, List<byte[]> list) {
        this.f6168k = i10 == -1 ? 1 : i10;
        this.f6167j = list != null && C4022e.m15284h(list);
        this.f6169l = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f6169l[i11] = new b();
        }
        this.f6170m = this.f6169l[0];
    }

    /* renamed from: A */
    public final void m6630A() {
        int m6651h = b.m6651h(this.f6165h.m15601h(2), this.f6165h.m15601h(2), this.f6165h.m15601h(2), this.f6165h.m15601h(2));
        int m6651h2 = b.m6651h(this.f6165h.m15601h(2), this.f6165h.m15601h(2), this.f6165h.m15601h(2), this.f6165h.m15601h(2));
        this.f6165h.m15611r(2);
        this.f6170m.m6663n(m6651h, m6651h2, b.m6650g(this.f6165h.m15601h(2), this.f6165h.m15601h(2), this.f6165h.m15601h(2)));
    }

    /* renamed from: B */
    public final void m6631B() {
        this.f6165h.m15611r(4);
        int m15601h = this.f6165h.m15601h(4);
        this.f6165h.m15611r(2);
        this.f6170m.m6664o(m15601h, this.f6165h.m15601h(6));
    }

    /* renamed from: C */
    public final void m6632C() {
        int m6651h = b.m6651h(this.f6165h.m15601h(2), this.f6165h.m15601h(2), this.f6165h.m15601h(2), this.f6165h.m15601h(2));
        int m15601h = this.f6165h.m15601h(2);
        int m6650g = b.m6650g(this.f6165h.m15601h(2), this.f6165h.m15601h(2), this.f6165h.m15601h(2));
        if (this.f6165h.m15600g()) {
            m15601h |= 4;
        }
        boolean m15600g = this.f6165h.m15600g();
        int m15601h2 = this.f6165h.m15601h(2);
        int m15601h3 = this.f6165h.m15601h(2);
        int m15601h4 = this.f6165h.m15601h(2);
        this.f6165h.m15611r(8);
        this.f6170m.m6666q(m6651h, m6650g, m15600g, m15601h, m15601h2, m15601h3, m15601h4);
    }

    /* renamed from: D */
    public final void m6633D() {
        StringBuilder sb2;
        String str;
        c cVar = this.f6173p;
        if (cVar.f6214d != (cVar.f6212b * 2) - 1) {
            C4046r.m15522b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f6173p.f6212b * 2) - 1) + ", but current index is " + this.f6173p.f6214d + " (sequence number " + this.f6173p.f6211a + ");");
        }
        boolean z10 = false;
        C4054z c4054z = this.f6165h;
        c cVar2 = this.f6173p;
        c4054z.m15608o(cVar2.f6213c, cVar2.f6214d);
        while (true) {
            if (this.f6165h.m15595b() <= 0) {
                break;
            }
            int m15601h = this.f6165h.m15601h(3);
            int m15601h2 = this.f6165h.m15601h(5);
            if (m15601h == 7) {
                this.f6165h.m15611r(2);
                m15601h = this.f6165h.m15601h(6);
                if (m15601h < 7) {
                    C4046r.m15529i("Cea708Decoder", "Invalid extended service number: " + m15601h);
                }
            }
            if (m15601h2 == 0) {
                if (m15601h != 0) {
                    C4046r.m15529i("Cea708Decoder", "serviceNumber is non-zero (" + m15601h + ") when blockSize is 0");
                }
            } else if (m15601h != this.f6168k) {
                this.f6165h.m15612s(m15601h2);
            } else {
                int m15598e = this.f6165h.m15598e() + (m15601h2 * 8);
                while (this.f6165h.m15598e() < m15598e) {
                    int m15601h3 = this.f6165h.m15601h(8);
                    if (m15601h3 == 16) {
                        m15601h3 = this.f6165h.m15601h(8);
                        if (m15601h3 <= 31) {
                            m6639s(m15601h3);
                        } else {
                            if (m15601h3 <= 127) {
                                m6644x(m15601h3);
                            } else if (m15601h3 <= 159) {
                                m6640t(m15601h3);
                            } else if (m15601h3 <= 255) {
                                m6645y(m15601h3);
                            } else {
                                sb2 = new StringBuilder();
                                str = "Invalid extended command: ";
                                sb2.append(str);
                                sb2.append(m15601h3);
                                C4046r.m15529i("Cea708Decoder", sb2.toString());
                            }
                            z10 = true;
                        }
                    } else if (m15601h3 <= 31) {
                        m6637q(m15601h3);
                    } else {
                        if (m15601h3 <= 127) {
                            m6642v(m15601h3);
                        } else if (m15601h3 <= 159) {
                            m6638r(m15601h3);
                        } else if (m15601h3 <= 255) {
                            m6643w(m15601h3);
                        } else {
                            sb2 = new StringBuilder();
                            str = "Invalid base command: ";
                            sb2.append(str);
                            sb2.append(m15601h3);
                            C4046r.m15529i("Cea708Decoder", sb2.toString());
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f6171n = m6636p();
        }
    }

    /* renamed from: E */
    public final void m6634E() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f6169l[i10].m6661l();
        }
    }

    @Override // p063e5.AbstractC1663e, p047d5.InterfaceC1554i
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo6341a(long j10) {
        super.mo6341a(j10);
    }

    @Override // p063e5.AbstractC1663e
    /* renamed from: e */
    public InterfaceC1553h mo6603e() {
        List<C1547b> list = this.f6171n;
        this.f6172o = list;
        return new C1664f((List) C4014a.m15199e(list));
    }

    @Override // p063e5.AbstractC1663e
    /* renamed from: f */
    public void mo6604f(C1557l c1557l) {
        ByteBuffer byteBuffer = (ByteBuffer) C4014a.m15199e(c1557l.f19284j);
        this.f6164g.m15221R(byteBuffer.array(), byteBuffer.limit());
        while (this.f6164g.m15226a() >= 3) {
            int m15210G = this.f6164g.m15210G() & 7;
            int i10 = m15210G & 3;
            boolean z10 = (m15210G & 4) == 4;
            byte m15210G2 = (byte) this.f6164g.m15210G();
            byte m15210G3 = (byte) this.f6164g.m15210G();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        m6635o();
                        int i11 = (m15210G2 & 192) >> 6;
                        int i12 = this.f6166i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            m6634E();
                            C4046r.m15529i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f6166i + " current=" + i11);
                        }
                        this.f6166i = i11;
                        int i13 = m15210G2 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        c cVar = new c(i11, i13);
                        this.f6173p = cVar;
                        byte[] bArr = cVar.f6213c;
                        int i14 = cVar.f6214d;
                        cVar.f6214d = i14 + 1;
                        bArr[i14] = m15210G3;
                    } else {
                        C4014a.m15195a(i10 == 2);
                        c cVar2 = this.f6173p;
                        if (cVar2 == null) {
                            C4046r.m15523c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f6213c;
                            int i15 = cVar2.f6214d;
                            int i16 = i15 + 1;
                            cVar2.f6214d = i16;
                            bArr2[i15] = m15210G2;
                            cVar2.f6214d = i16 + 1;
                            bArr2[i16] = m15210G3;
                        }
                    }
                    c cVar3 = this.f6173p;
                    if (cVar3.f6214d == (cVar3.f6212b * 2) - 1) {
                        m6635o();
                    }
                }
            }
        }
    }

    @Override // p063e5.AbstractC1663e, p304v3.InterfaceC5107d
    public void flush() {
        super.flush();
        this.f6171n = null;
        this.f6172o = null;
        this.f6174q = 0;
        this.f6170m = this.f6169l[0];
        m6634E();
        this.f6173p = null;
    }

    @Override // p063e5.AbstractC1663e
    /* renamed from: g */
    public /* bridge */ /* synthetic */ C1557l mo6343c() {
        return super.mo6343c();
    }

    @Override // p063e5.AbstractC1663e
    /* renamed from: h */
    public /* bridge */ /* synthetic */ AbstractC1558m mo6342b() {
        return super.mo6342b();
    }

    @Override // p063e5.AbstractC1663e
    /* renamed from: k */
    public boolean mo6607k() {
        return this.f6171n != this.f6172o;
    }

    @Override // p063e5.AbstractC1663e
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo6344d(C1557l c1557l) {
        super.mo6344d(c1557l);
    }

    /* renamed from: o */
    public final void m6635o() {
        if (this.f6173p == null) {
            return;
        }
        m6633D();
        this.f6173p = null;
    }

    /* renamed from: p */
    public final List<C1547b> m6636p() {
        a m6654c;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f6169l[i10].m6659j() && this.f6169l[i10].m6660k() && (m6654c = this.f6169l[i10].m6654c()) != null) {
                arrayList.add(m6654c);
            }
        }
        Collections.sort(arrayList, a.f6175c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f6176a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: q */
    public final void m6637q(int i10) {
        C4054z c4054z;
        if (i10 != 0) {
            if (i10 == 3) {
                this.f6171n = m6636p();
                return;
            }
            int i11 = 8;
            if (i10 == 8) {
                this.f6170m.m6653b();
                return;
            }
            switch (i10) {
                case 12:
                    m6634E();
                    return;
                case 13:
                    this.f6170m.m6652a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        C4046r.m15529i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        c4054z = this.f6165h;
                    } else {
                        if (i10 < 24 || i10 > 31) {
                            C4046r.m15529i("Cea708Decoder", "Invalid C0 command: " + i10);
                            return;
                        }
                        C4046r.m15529i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        c4054z = this.f6165h;
                        i11 = 16;
                    }
                    c4054z.m15611r(i11);
                    return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /* renamed from: r */
    public final void m6638r(int i10) {
        b bVar;
        C4054z c4054z;
        int i11 = 16;
        int i12 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i13 = i10 - 128;
                if (this.f6174q != i13) {
                    this.f6174q = i13;
                    bVar = this.f6169l[i13];
                    this.f6170m = bVar;
                    return;
                }
                return;
            case 136:
                while (i12 <= 8) {
                    if (this.f6165h.m15600g()) {
                        this.f6169l[8 - i12].m6656e();
                    }
                    i12++;
                }
                return;
            case 137:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f6165h.m15600g()) {
                        this.f6169l[8 - i14].m6665p(true);
                    }
                }
                return;
            case 138:
                while (i12 <= 8) {
                    if (this.f6165h.m15600g()) {
                        this.f6169l[8 - i12].m6665p(false);
                    }
                    i12++;
                }
                return;
            case 139:
                for (int i15 = 1; i15 <= 8; i15++) {
                    if (this.f6165h.m15600g()) {
                        this.f6169l[8 - i15].m6665p(!r0.m6660k());
                    }
                }
                return;
            case 140:
                while (i12 <= 8) {
                    if (this.f6165h.m15600g()) {
                        this.f6169l[8 - i12].m6661l();
                    }
                    i12++;
                }
                return;
            case 141:
                this.f6165h.m15611r(8);
                return;
            case 142:
                return;
            case 143:
                m6634E();
                return;
            case 144:
                if (this.f6170m.m6658i()) {
                    m6646z();
                    return;
                }
                c4054z = this.f6165h;
                c4054z.m15611r(i11);
                return;
            case 145:
                if (this.f6170m.m6658i()) {
                    m6630A();
                    return;
                }
                c4054z = this.f6165h;
                i11 = 24;
                c4054z.m15611r(i11);
                return;
            case 146:
                if (this.f6170m.m6658i()) {
                    m6631B();
                    return;
                }
                c4054z = this.f6165h;
                c4054z.m15611r(i11);
                return;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                C4046r.m15529i("Cea708Decoder", "Invalid C1 command: " + i10);
                return;
            case 151:
                if (this.f6170m.m6658i()) {
                    m6632C();
                    return;
                }
                c4054z = this.f6165h;
                i11 = 32;
                c4054z.m15611r(i11);
                return;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i16 = i10 - 152;
                m6641u(i16);
                if (this.f6174q != i16) {
                    this.f6174q = i16;
                    bVar = this.f6169l[i16];
                    this.f6170m = bVar;
                    return;
                }
                return;
        }
    }

    @Override // p063e5.AbstractC1663e, p304v3.InterfaceC5107d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    /* renamed from: s */
    public final void m6639s(int i10) {
        C4054z c4054z;
        int i11;
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            c4054z = this.f6165h;
            i11 = 8;
        } else if (i10 <= 23) {
            c4054z = this.f6165h;
            i11 = 16;
        } else {
            if (i10 > 31) {
                return;
            }
            c4054z = this.f6165h;
            i11 = 24;
        }
        c4054z.m15611r(i11);
    }

    /* renamed from: t */
    public final void m6640t(int i10) {
        C4054z c4054z;
        int i11;
        if (i10 <= 135) {
            c4054z = this.f6165h;
            i11 = 32;
        } else {
            if (i10 > 143) {
                if (i10 <= 159) {
                    this.f6165h.m15611r(2);
                    this.f6165h.m15611r(this.f6165h.m15601h(6) * 8);
                    return;
                }
                return;
            }
            c4054z = this.f6165h;
            i11 = 40;
        }
        c4054z.m15611r(i11);
    }

    /* renamed from: u */
    public final void m6641u(int i10) {
        b bVar = this.f6169l[i10];
        this.f6165h.m15611r(2);
        boolean m15600g = this.f6165h.m15600g();
        boolean m15600g2 = this.f6165h.m15600g();
        boolean m15600g3 = this.f6165h.m15600g();
        int m15601h = this.f6165h.m15601h(3);
        boolean m15600g4 = this.f6165h.m15600g();
        int m15601h2 = this.f6165h.m15601h(7);
        int m15601h3 = this.f6165h.m15601h(8);
        int m15601h4 = this.f6165h.m15601h(4);
        int m15601h5 = this.f6165h.m15601h(4);
        this.f6165h.m15611r(2);
        int m15601h6 = this.f6165h.m15601h(6);
        this.f6165h.m15611r(2);
        bVar.m6657f(m15600g, m15600g2, m15600g3, m15601h, m15600g4, m15601h2, m15601h3, m15601h5, m15601h6, m15601h4, this.f6165h.m15601h(3), this.f6165h.m15601h(3));
    }

    /* renamed from: v */
    public final void m6642v(int i10) {
        if (i10 == 127) {
            this.f6170m.m6652a((char) 9835);
        } else {
            this.f6170m.m6652a((char) (i10 & 255));
        }
    }

    /* renamed from: w */
    public final void m6643w(int i10) {
        this.f6170m.m6652a((char) (i10 & 255));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0028. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x002b. Please report as an issue. */
    /* renamed from: x */
    public final void m6644x(int i10) {
        b bVar;
        char c10 = ' ';
        if (i10 == 32) {
            bVar = this.f6170m;
        } else if (i10 == 33) {
            bVar = this.f6170m;
            c10 = 160;
        } else if (i10 == 37) {
            bVar = this.f6170m;
            c10 = 8230;
        } else if (i10 == 42) {
            bVar = this.f6170m;
            c10 = 352;
        } else if (i10 == 44) {
            bVar = this.f6170m;
            c10 = 338;
        } else if (i10 == 63) {
            bVar = this.f6170m;
            c10 = 376;
        } else if (i10 == 57) {
            bVar = this.f6170m;
            c10 = 8482;
        } else if (i10 == 58) {
            bVar = this.f6170m;
            c10 = 353;
        } else if (i10 == 60) {
            bVar = this.f6170m;
            c10 = 339;
        } else if (i10 != 61) {
            switch (i10) {
                case 48:
                    bVar = this.f6170m;
                    c10 = 9608;
                    break;
                case C1417R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    bVar = this.f6170m;
                    c10 = 8216;
                    break;
                case C1417R.styleable.AppCompatTheme_colorAccent /* 50 */:
                    bVar = this.f6170m;
                    c10 = 8217;
                    break;
                case C1417R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    bVar = this.f6170m;
                    c10 = 8220;
                    break;
                case C1417R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    bVar = this.f6170m;
                    c10 = 8221;
                    break;
                case C1417R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    bVar = this.f6170m;
                    c10 = 8226;
                    break;
                default:
                    switch (i10) {
                        case 118:
                            bVar = this.f6170m;
                            c10 = 8539;
                            break;
                        case 119:
                            bVar = this.f6170m;
                            c10 = 8540;
                            break;
                        case 120:
                            bVar = this.f6170m;
                            c10 = 8541;
                            break;
                        case 121:
                            bVar = this.f6170m;
                            c10 = 8542;
                            break;
                        case 122:
                            bVar = this.f6170m;
                            c10 = 9474;
                            break;
                        case 123:
                            bVar = this.f6170m;
                            c10 = 9488;
                            break;
                        case 124:
                            bVar = this.f6170m;
                            c10 = 9492;
                            break;
                        case 125:
                            bVar = this.f6170m;
                            c10 = 9472;
                            break;
                        case 126:
                            bVar = this.f6170m;
                            c10 = 9496;
                            break;
                        case 127:
                            bVar = this.f6170m;
                            c10 = 9484;
                            break;
                        default:
                            C4046r.m15529i("Cea708Decoder", "Invalid G2 character: " + i10);
                            return;
                    }
            }
        } else {
            bVar = this.f6170m;
            c10 = 8480;
        }
        bVar.m6652a(c10);
    }

    /* renamed from: y */
    public final void m6645y(int i10) {
        b bVar;
        char c10;
        if (i10 == 160) {
            bVar = this.f6170m;
            c10 = 13252;
        } else {
            C4046r.m15529i("Cea708Decoder", "Invalid G3 character: " + i10);
            bVar = this.f6170m;
            c10 = '_';
        }
        bVar.m6652a(c10);
    }

    /* renamed from: z */
    public final void m6646z() {
        this.f6170m.m6662m(this.f6165h.m15601h(4), this.f6165h.m15601h(2), this.f6165h.m15601h(2), this.f6165h.m15600g(), this.f6165h.m15600g(), this.f6165h.m15601h(3), this.f6165h.m15601h(3));
    }
}
