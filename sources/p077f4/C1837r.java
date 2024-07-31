package p077f4;

import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: f4.r */
/* loaded from: classes.dex */
public final class C1837r {

    /* renamed from: a */
    public final C1834o f6962a;

    /* renamed from: b */
    public final int f6963b;

    /* renamed from: c */
    public final long[] f6964c;

    /* renamed from: d */
    public final int[] f6965d;

    /* renamed from: e */
    public final int f6966e;

    /* renamed from: f */
    public final long[] f6967f;

    /* renamed from: g */
    public final int[] f6968g;

    /* renamed from: h */
    public final long f6969h;

    public C1837r(C1834o c1834o, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        C4014a.m15195a(iArr.length == jArr2.length);
        C4014a.m15195a(jArr.length == jArr2.length);
        C4014a.m15195a(iArr2.length == jArr2.length);
        this.f6962a = c1834o;
        this.f6964c = jArr;
        this.f6965d = iArr;
        this.f6966e = i10;
        this.f6967f = jArr2;
        this.f6968g = iArr2;
        this.f6969h = j10;
        this.f6963b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int m7556a(long j10) {
        for (int m15461i = C4041n0.m15461i(this.f6967f, j10, true, false); m15461i >= 0; m15461i--) {
            if ((this.f6968g[m15461i] & 1) != 0) {
                return m15461i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m7557b(long j10) {
        for (int m15453e = C4041n0.m15453e(this.f6967f, j10, true, false); m15453e < this.f6967f.length; m15453e++) {
            if ((this.f6968g[m15453e] & 1) != 0) {
                return m15453e;
            }
        }
        return -1;
    }
}
