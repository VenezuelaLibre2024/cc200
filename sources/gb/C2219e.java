package gb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p129ia.C2684p;
import p129ia.EnumC2673e;
import p129ia.InterfaceC2685q;
import p211oa.C3965b;

/* renamed from: gb.e */
/* loaded from: classes.dex */
public class C2219e {

    /* renamed from: f */
    public static final b f8808f = new b();

    /* renamed from: a */
    public final C3965b f8809a;

    /* renamed from: c */
    public boolean f8811c;

    /* renamed from: e */
    public final InterfaceC2685q f8813e;

    /* renamed from: b */
    public final List<C2218d> f8810b = new ArrayList();

    /* renamed from: d */
    public final int[] f8812d = new int[5];

    /* renamed from: gb.e$b */
    /* loaded from: classes.dex */
    public static final class b implements Comparator<C2218d>, Serializable {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2218d c2218d, C2218d c2218d2) {
            return Float.compare(c2218d.m8912i(), c2218d2.m8912i());
        }
    }

    public C2219e(C3965b c3965b, InterfaceC2685q interfaceC2685q) {
        this.f8809a = c3965b;
        this.f8813e = interfaceC2685q;
    }

    /* renamed from: a */
    public static float m8913a(int[] iArr, int i10) {
        return ((i10 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    /* renamed from: e */
    public static void m8914e(int[] iArr) {
        Arrays.fill(iArr, 0);
    }

    /* renamed from: f */
    public static void m8915f(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    /* renamed from: i */
    public static boolean m8916i(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 2.0f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    /* renamed from: j */
    public static boolean m8917j(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 5; i11++) {
            int i12 = iArr[i11];
            if (i12 == 0) {
                return false;
            }
            i10 += i12;
        }
        if (i10 < 7) {
            return false;
        }
        float f10 = i10 / 7.0f;
        float f11 = f10 / 1.333f;
        return Math.abs(f10 - ((float) iArr[0])) < f11 && Math.abs(f10 - ((float) iArr[1])) < f11 && Math.abs((f10 * 3.0f) - ((float) iArr[2])) < 3.0f * f11 && Math.abs(f10 - ((float) iArr[3])) < f11 && Math.abs(f10 - ((float) iArr[4])) < f11;
    }

    /* renamed from: o */
    public static double m8918o(C2218d c2218d, C2218d c2218d2) {
        double m10908c = c2218d.m10908c() - c2218d2.m10908c();
        double m10909d = c2218d.m10909d() - c2218d2.m10909d();
        return (m10908c * m10908c) + (m10909d * m10909d);
    }

    /* renamed from: b */
    public final boolean m8919b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int[] m8924k = m8924k();
        int i15 = 0;
        while (i10 >= i15 && i11 >= i15 && this.f8809a.m15035g(i11 - i15, i10 - i15)) {
            m8924k[2] = m8924k[2] + 1;
            i15++;
        }
        if (m8924k[2] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && !this.f8809a.m15035g(i11 - i15, i10 - i15)) {
            m8924k[1] = m8924k[1] + 1;
            i15++;
        }
        if (m8924k[1] == 0) {
            return false;
        }
        while (i10 >= i15 && i11 >= i15 && this.f8809a.m15035g(i11 - i15, i10 - i15)) {
            m8924k[0] = m8924k[0] + 1;
            i15++;
        }
        if (m8924k[0] == 0) {
            return false;
        }
        int m15038k = this.f8809a.m15038k();
        int m15041n = this.f8809a.m15041n();
        int i16 = 1;
        while (true) {
            int i17 = i10 + i16;
            if (i17 >= m15038k || (i14 = i11 + i16) >= m15041n || !this.f8809a.m15035g(i14, i17)) {
                break;
            }
            m8924k[2] = m8924k[2] + 1;
            i16++;
        }
        while (true) {
            int i18 = i10 + i16;
            if (i18 >= m15038k || (i13 = i11 + i16) >= m15041n || this.f8809a.m15035g(i13, i18)) {
                break;
            }
            m8924k[3] = m8924k[3] + 1;
            i16++;
        }
        if (m8924k[3] == 0) {
            return false;
        }
        while (true) {
            int i19 = i10 + i16;
            if (i19 >= m15038k || (i12 = i11 + i16) >= m15041n || !this.f8809a.m15035g(i12, i19)) {
                break;
            }
            m8924k[4] = m8924k[4] + 1;
            i16++;
        }
        if (m8924k[4] == 0) {
            return false;
        }
        return m8917j(m8924k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r2[1] <= r13) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (r3 < 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r0.m15035g(r3, r12) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        if (r2[0] > r13) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        r2[0] = r2[0] + 1;
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r2[0] <= r13) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        if (r11 >= r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
    
        if (r0.m15035g(r11, r12) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        r2[2] = r2[2] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        if (r11 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006b, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
    
        if (r11 >= r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        if (r0.m15035g(r11, r12) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0077, code lost:
    
        if (r2[3] >= r13) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0079, code lost:
    
        r2[3] = r2[3] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0081, code lost:
    
        if (r11 == r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0085, code lost:
    
        if (r2[3] < r13) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0089, code lost:
    
        if (r11 >= r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008f, code lost:
    
        if (r0.m15035g(r11, r12) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0093, code lost:
    
        if (r2[4] >= r13) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0095, code lost:
    
        r2[4] = r2[4] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009f, code lost:
    
        if (r2[4] < r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a1, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b7, code lost:
    
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r2[4]) - r14) * 5) < r14) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b9, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00be, code lost:
    
        if (m8916i(r2) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c4, code lost:
    
        return m8913a(r2, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return Float.NaN;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m8920c(int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.C2219e.m8920c(int, int, int, int):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r2[1] <= r13) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (r3 < 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r0.m15035g(r12, r3) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        if (r2[0] > r13) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        r2[0] = r2[0] + 1;
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if (r2[0] <= r13) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        if (r11 >= r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
    
        if (r0.m15035g(r12, r11) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        r2[2] = r2[2] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        if (r11 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006b, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
    
        if (r11 >= r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
    
        if (r0.m15035g(r12, r11) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0077, code lost:
    
        if (r2[3] >= r13) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0079, code lost:
    
        r2[3] = r2[3] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0081, code lost:
    
        if (r11 == r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0085, code lost:
    
        if (r2[3] < r13) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0089, code lost:
    
        if (r11 >= r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008f, code lost:
    
        if (r0.m15035g(r12, r11) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0093, code lost:
    
        if (r2[4] >= r13) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0095, code lost:
    
        r2[4] = r2[4] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009f, code lost:
    
        if (r2[4] < r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a1, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b8, code lost:
    
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r2[4]) - r14) * 5) < (r14 * 2)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ba, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00bf, code lost:
    
        if (m8916i(r2) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c5, code lost:
    
        return m8913a(r2, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return Float.NaN;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m8921d(int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.C2219e.m8921d(int, int, int, int):float");
    }

    /* renamed from: g */
    public final C2220f m8922g(Map<EnumC2673e, ?> map) {
        boolean z10 = map != null && map.containsKey(EnumC2673e.TRY_HARDER);
        int m15038k = this.f8809a.m15038k();
        int m15041n = this.f8809a.m15041n();
        int i10 = (m15038k * 3) / 388;
        if (i10 < 3 || z10) {
            i10 = 3;
        }
        int[] iArr = new int[5];
        int i11 = i10 - 1;
        boolean z11 = false;
        while (i11 < m15038k && !z11) {
            m8914e(iArr);
            int i12 = 0;
            int i13 = 0;
            while (i12 < m15041n) {
                if (this.f8809a.m15035g(i12, i11)) {
                    if ((i13 & 1) == 1) {
                        i13++;
                    }
                    iArr[i13] = iArr[i13] + 1;
                } else if ((i13 & 1) != 0) {
                    iArr[i13] = iArr[i13] + 1;
                } else if (i13 != 4) {
                    i13++;
                    iArr[i13] = iArr[i13] + 1;
                } else if (m8916i(iArr) && m8925l(iArr, i11, i12)) {
                    if (this.f8811c) {
                        z11 = m8926m();
                    } else {
                        int m8923h = m8923h();
                        if (m8923h > iArr[2]) {
                            i11 += (m8923h - iArr[2]) - 2;
                            i12 = m15041n - 1;
                        }
                    }
                    m8914e(iArr);
                    i13 = 0;
                    i10 = 2;
                } else {
                    m8915f(iArr);
                    i13 = 3;
                }
                i12++;
            }
            if (m8916i(iArr) && m8925l(iArr, i11, m15041n)) {
                i10 = iArr[0];
                if (this.f8811c) {
                    z11 = m8926m();
                }
            }
            i11 += i10;
        }
        C2218d[] m8927n = m8927n();
        C2684p.m10907e(m8927n);
        return new C2220f(m8927n);
    }

    /* renamed from: h */
    public final int m8923h() {
        if (this.f8810b.size() <= 1) {
            return 0;
        }
        C2218d c2218d = null;
        for (C2218d c2218d2 : this.f8810b) {
            if (c2218d2.m8911h() >= 2) {
                if (c2218d != null) {
                    this.f8811c = true;
                    return ((int) (Math.abs(c2218d.m10908c() - c2218d2.m10908c()) - Math.abs(c2218d.m10909d() - c2218d2.m10909d()))) / 2;
                }
                c2218d = c2218d2;
            }
        }
        return 0;
    }

    /* renamed from: k */
    public final int[] m8924k() {
        m8914e(this.f8812d);
        return this.f8812d;
    }

    /* renamed from: l */
    public final boolean m8925l(int[] iArr, int i10, int i11) {
        boolean z10 = false;
        int i12 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int m8913a = (int) m8913a(iArr, i11);
        float m8921d = m8921d(i10, m8913a, iArr[2], i12);
        if (!Float.isNaN(m8921d)) {
            int i13 = (int) m8921d;
            float m8920c = m8920c(m8913a, i13, iArr[2], i12);
            if (!Float.isNaN(m8920c) && m8919b(i13, (int) m8920c)) {
                float f10 = i12 / 7.0f;
                int i14 = 0;
                while (true) {
                    if (i14 >= this.f8810b.size()) {
                        break;
                    }
                    C2218d c2218d = this.f8810b.get(i14);
                    if (c2218d.m8909f(f10, m8921d, m8920c)) {
                        this.f8810b.set(i14, c2218d.m8910g(m8921d, m8920c, f10));
                        z10 = true;
                        break;
                    }
                    i14++;
                }
                if (!z10) {
                    C2218d c2218d2 = new C2218d(m8920c, m8921d, f10);
                    this.f8810b.add(c2218d2);
                    InterfaceC2685q interfaceC2685q = this.f8813e;
                    if (interfaceC2685q != null) {
                        interfaceC2685q.mo9828a(c2218d2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m8926m() {
        int size = this.f8810b.size();
        float f10 = 0.0f;
        float f11 = 0.0f;
        int i10 = 0;
        for (C2218d c2218d : this.f8810b) {
            if (c2218d.m8911h() >= 2) {
                i10++;
                f11 += c2218d.m8912i();
            }
        }
        if (i10 < 3) {
            return false;
        }
        float f12 = f11 / size;
        Iterator<C2218d> it = this.f8810b.iterator();
        while (it.hasNext()) {
            f10 += Math.abs(it.next().m8912i() - f12);
        }
        return f10 <= f11 * 0.05f;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6 A[SYNTHETIC] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final gb.C2218d[] m8927n() {
        /*
            r26 = this;
            r0 = r26
            java.util.List<gb.d> r1 = r0.f8810b
            int r1 = r1.size()
            r2 = 3
            if (r1 < r2) goto Ld8
            java.util.List<gb.d> r1 = r0.f8810b
            gb.e$b r3 = gb.C2219e.f8808f
            r1.sort(r3)
            gb.d[] r1 = new gb.C2218d[r2]
            r2 = 0
            r5 = r2
            r6 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
        L1b:
            java.util.List<gb.d> r8 = r0.f8810b
            int r8 = r8.size()
            r9 = 2
            int r8 = r8 - r9
            if (r5 >= r8) goto Lc9
            java.util.List<gb.d> r8 = r0.f8810b
            java.lang.Object r8 = r8.get(r5)
            gb.d r8 = (gb.C2218d) r8
            float r10 = r8.m8912i()
            int r5 = r5 + 1
            r11 = r5
        L34:
            java.util.List<gb.d> r12 = r0.f8810b
            int r12 = r12.size()
            r13 = 1
            int r12 = r12 - r13
            if (r11 >= r12) goto L1b
            java.util.List<gb.d> r12 = r0.f8810b
            java.lang.Object r12 = r12.get(r11)
            gb.d r12 = (gb.C2218d) r12
            double r14 = m8918o(r8, r12)
            int r11 = r11 + 1
            r3 = r11
        L4d:
            java.util.List<gb.d> r4 = r0.f8810b
            int r4 = r4.size()
            if (r3 >= r4) goto L34
            java.util.List<gb.d> r4 = r0.f8810b
            java.lang.Object r4 = r4.get(r3)
            gb.d r4 = (gb.C2218d) r4
            float r16 = r4.m8912i()
            r17 = 1068708659(0x3fb33333, float:1.4)
            float r17 = r17 * r10
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 <= 0) goto L6b
            goto Lc6
        L6b:
            double r16 = m8918o(r12, r4)
            double r18 = m8918o(r8, r4)
            int r20 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r20 >= 0) goto L8e
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 <= 0) goto L85
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L82
            r20 = r14
            goto La6
        L82:
            r20 = r18
            goto L9a
        L85:
            r20 = r14
            r24 = r16
            r16 = r18
            r18 = r24
            goto La6
        L8e:
            int r20 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r20 >= 0) goto La0
            int r20 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r20 >= 0) goto L9d
            r20 = r16
            r16 = r18
        L9a:
            r18 = r14
            goto La6
        L9d:
            r20 = r16
            goto La4
        La0:
            r20 = r18
            r18 = r16
        La4:
            r16 = r14
        La6:
            r22 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r18 * r22
            double r18 = r16 - r18
            double r18 = java.lang.Math.abs(r18)
            double r20 = r20 * r22
            double r16 = r16 - r20
            double r16 = java.lang.Math.abs(r16)
            double r18 = r18 + r16
            int r16 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            if (r16 >= 0) goto Lc6
            r1[r2] = r8
            r1[r13] = r12
            r1[r9] = r4
            r6 = r18
        Lc6:
            int r3 = r3 + 1
            goto L4d
        Lc9:
            r3 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto Ld3
            return r1
        Ld3:
            ia.j r1 = p129ia.C2678j.m10895a()
            throw r1
        Ld8:
            ia.j r1 = p129ia.C2678j.m10895a()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.C2219e.m8927n():gb.d[]");
    }
}
