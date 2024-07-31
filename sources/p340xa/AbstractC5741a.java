package p340xa;

import p079f6.C1841a;
import p129ia.C2678j;
import p324wa.AbstractC5461k;

/* renamed from: xa.a */
/* loaded from: classes.dex */
public abstract class AbstractC5741a extends AbstractC5461k {

    /* renamed from: b */
    public final int[] f21285b;

    /* renamed from: e */
    public final int[] f21288e;

    /* renamed from: f */
    public final int[] f21289f;

    /* renamed from: a */
    public final int[] f21284a = new int[4];

    /* renamed from: c */
    public final float[] f21286c = new float[4];

    /* renamed from: d */
    public final float[] f21287d = new float[4];

    public AbstractC5741a() {
        int[] iArr = new int[8];
        this.f21285b = iArr;
        this.f21288e = new int[iArr.length / 2];
        this.f21289f = new int[iArr.length / 2];
    }

    /* renamed from: h */
    public static void m22841h(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            if (fArr[i11] < f10) {
                f10 = fArr[i11];
                i10 = i11;
            }
        }
        iArr[i10] = iArr[i10] - 1;
    }

    /* renamed from: o */
    public static void m22842o(int[] iArr, float[] fArr) {
        int i10 = 0;
        float f10 = fArr[0];
        for (int i11 = 1; i11 < iArr.length; i11++) {
            if (fArr[i11] > f10) {
                f10 = fArr[i11];
                i10 = i11;
            }
        }
        iArr[i10] = iArr[i10] + 1;
    }

    /* renamed from: p */
    public static boolean m22843p(int[] iArr) {
        float f10 = (iArr[0] + iArr[1]) / ((iArr[2] + r1) + iArr[3]);
        if (f10 < 0.7916667f || f10 > 0.89285713f) {
            return false;
        }
        int i10 = C1841a.e.API_PRIORITY_OTHER;
        int i11 = Integer.MIN_VALUE;
        for (int i12 : iArr) {
            if (i12 > i11) {
                i11 = i12;
            }
            if (i12 < i10) {
                i10 = i12;
            }
        }
        return i11 < i10 * 10;
    }

    /* renamed from: q */
    public static int m22844q(int[] iArr, int[][] iArr2) {
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            if (AbstractC5461k.m21647e(iArr, iArr2[i10], 0.45f) < 0.2f) {
                return i10;
            }
        }
        throw C2678j.m10895a();
    }

    /* renamed from: i */
    public final int[] m22845i() {
        return this.f21285b;
    }

    /* renamed from: j */
    public final int[] m22846j() {
        return this.f21284a;
    }

    /* renamed from: k */
    public final int[] m22847k() {
        return this.f21289f;
    }

    /* renamed from: l */
    public final float[] m22848l() {
        return this.f21287d;
    }

    /* renamed from: m */
    public final int[] m22849m() {
        return this.f21288e;
    }

    /* renamed from: n */
    public final float[] m22850n() {
        return this.f21286c;
    }
}
