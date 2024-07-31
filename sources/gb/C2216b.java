package gb;

import java.util.ArrayList;
import java.util.List;
import p129ia.C2678j;
import p129ia.InterfaceC2685q;
import p211oa.C3965b;

/* renamed from: gb.b */
/* loaded from: classes.dex */
public final class C2216b {

    /* renamed from: a */
    public final C3965b f8795a;

    /* renamed from: c */
    public final int f8797c;

    /* renamed from: d */
    public final int f8798d;

    /* renamed from: e */
    public final int f8799e;

    /* renamed from: f */
    public final int f8800f;

    /* renamed from: g */
    public final float f8801g;

    /* renamed from: i */
    public final InterfaceC2685q f8803i;

    /* renamed from: b */
    public final List<C2215a> f8796b = new ArrayList(5);

    /* renamed from: h */
    public final int[] f8802h = new int[3];

    public C2216b(C3965b c3965b, int i10, int i11, int i12, int i13, float f10, InterfaceC2685q interfaceC2685q) {
        this.f8795a = c3965b;
        this.f8797c = i10;
        this.f8798d = i11;
        this.f8799e = i12;
        this.f8800f = i13;
        this.f8801g = f10;
        this.f8803i = interfaceC2685q;
    }

    /* renamed from: a */
    public static float m8894a(int[] iArr, int i10) {
        return (i10 - iArr[2]) - (iArr[1] / 2.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if (r2[1] <= r12) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r10 >= r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
    
        if (r0.m15035g(r11, r10) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (r2[2] > r12) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        r2[2] = r2[2] + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (r2[2] <= r12) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008e, code lost:
    
        if ((java.lang.Math.abs(((r2[0] + r2[1]) + r2[2]) - r13) * 5) < (r13 * 2)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0090, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0095, code lost:
    
        if (m8897d(r2) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009b, code lost:
    
        return m8894a(r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return Float.NaN;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m8895b(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            oa.b r0 = r9.f8795a
            int r1 = r0.m15038k()
            int[] r2 = r9.f8802h
            r3 = 0
            r2[r3] = r3
            r4 = 1
            r2[r4] = r3
            r5 = 2
            r2[r5] = r3
            r6 = r10
        L12:
            if (r6 < 0) goto L26
            boolean r7 = r0.m15035g(r11, r6)
            if (r7 == 0) goto L26
            r7 = r2[r4]
            if (r7 > r12) goto L26
            r7 = r2[r4]
            int r7 = r7 + r4
            r2[r4] = r7
            int r6 = r6 + (-1)
            goto L12
        L26:
            r7 = 2143289344(0x7fc00000, float:NaN)
            if (r6 < 0) goto L9b
            r8 = r2[r4]
            if (r8 <= r12) goto L30
            goto L9b
        L30:
            if (r6 < 0) goto L44
            boolean r8 = r0.m15035g(r11, r6)
            if (r8 != 0) goto L44
            r8 = r2[r3]
            if (r8 > r12) goto L44
            r8 = r2[r3]
            int r8 = r8 + r4
            r2[r3] = r8
            int r6 = r6 + (-1)
            goto L30
        L44:
            r6 = r2[r3]
            if (r6 <= r12) goto L49
            return r7
        L49:
            int r10 = r10 + r4
        L4a:
            if (r10 >= r1) goto L5e
            boolean r6 = r0.m15035g(r11, r10)
            if (r6 == 0) goto L5e
            r6 = r2[r4]
            if (r6 > r12) goto L5e
            r6 = r2[r4]
            int r6 = r6 + r4
            r2[r4] = r6
            int r10 = r10 + 1
            goto L4a
        L5e:
            if (r10 == r1) goto L9b
            r6 = r2[r4]
            if (r6 <= r12) goto L65
            goto L9b
        L65:
            if (r10 >= r1) goto L79
            boolean r6 = r0.m15035g(r11, r10)
            if (r6 != 0) goto L79
            r6 = r2[r5]
            if (r6 > r12) goto L79
            r6 = r2[r5]
            int r6 = r6 + r4
            r2[r5] = r6
            int r10 = r10 + 1
            goto L65
        L79:
            r11 = r2[r5]
            if (r11 <= r12) goto L7e
            return r7
        L7e:
            r11 = r2[r3]
            r12 = r2[r4]
            int r11 = r11 + r12
            r12 = r2[r5]
            int r11 = r11 + r12
            int r11 = r11 - r13
            int r11 = java.lang.Math.abs(r11)
            int r11 = r11 * 5
            int r13 = r13 * r5
            if (r11 < r13) goto L91
            return r7
        L91:
            boolean r11 = r9.m8897d(r2)
            if (r11 == 0) goto L9b
            float r7 = m8894a(r2, r10)
        L9b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.C2216b.m8895b(int, int, int, int):float");
    }

    /* renamed from: c */
    public C2215a m8896c() {
        C2215a m8898e;
        C2215a m8898e2;
        int i10 = this.f8797c;
        int i11 = this.f8800f;
        int i12 = this.f8799e + i10;
        int i13 = this.f8798d + (i11 / 2);
        int[] iArr = new int[3];
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = ((i14 & 1) == 0 ? (i14 + 1) / 2 : -((i14 + 1) / 2)) + i13;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i16 = i10;
            while (i16 < i12 && !this.f8795a.m15035g(i16, i15)) {
                i16++;
            }
            int i17 = 0;
            while (i16 < i12) {
                if (!this.f8795a.m15035g(i16, i15)) {
                    if (i17 == 1) {
                        i17++;
                    }
                    iArr[i17] = iArr[i17] + 1;
                } else if (i17 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i17 != 2) {
                    i17++;
                    iArr[i17] = iArr[i17] + 1;
                } else {
                    if (m8897d(iArr) && (m8898e2 = m8898e(iArr, i15, i16)) != null) {
                        return m8898e2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i17 = 1;
                }
                i16++;
            }
            if (m8897d(iArr) && (m8898e = m8898e(iArr, i15, i12)) != null) {
                return m8898e;
            }
        }
        if (this.f8796b.isEmpty()) {
            throw C2678j.m10895a();
        }
        return this.f8796b.get(0);
    }

    /* renamed from: d */
    public final boolean m8897d(int[] iArr) {
        float f10 = this.f8801g;
        float f11 = f10 / 2.0f;
        for (int i10 = 0; i10 < 3; i10++) {
            if (Math.abs(f10 - iArr[i10]) >= f11) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final C2215a m8898e(int[] iArr, int i10, int i11) {
        int i12 = iArr[0] + iArr[1] + iArr[2];
        float m8894a = m8894a(iArr, i11);
        float m8895b = m8895b(i10, (int) m8894a, iArr[1] * 2, i12);
        if (Float.isNaN(m8895b)) {
            return null;
        }
        float f10 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (C2215a c2215a : this.f8796b) {
            if (c2215a.m8892f(f10, m8895b, m8894a)) {
                return c2215a.m8893g(m8895b, m8894a, f10);
            }
        }
        C2215a c2215a2 = new C2215a(m8894a, m8895b, f10);
        this.f8796b.add(c2215a2);
        InterfaceC2685q interfaceC2685q = this.f8803i;
        if (interfaceC2685q == null) {
            return null;
        }
        interfaceC2685q.mo9828a(c2215a2);
        return null;
    }
}
