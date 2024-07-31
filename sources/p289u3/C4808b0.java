package p289u3;

import java.math.RoundingMode;
import p140j7.C3254b;
import p155k7.C3368e;
import p222p5.C4041n0;
import p289u3.C4806a0;

/* renamed from: u3.b0 */
/* loaded from: classes.dex */
public class C4808b0 implements C4806a0.e {

    /* renamed from: b */
    public final int f17975b;

    /* renamed from: c */
    public final int f17976c;

    /* renamed from: d */
    public final int f17977d;

    /* renamed from: e */
    public final int f17978e;

    /* renamed from: f */
    public final int f17979f;

    /* renamed from: g */
    public final int f17980g;

    /* renamed from: u3.b0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f17981a = 250000;

        /* renamed from: b */
        public int f17982b = 750000;

        /* renamed from: c */
        public int f17983c = 4;

        /* renamed from: d */
        public int f17984d = 250000;

        /* renamed from: e */
        public int f17985e = 50000000;

        /* renamed from: f */
        public int f17986f = 2;

        /* renamed from: g */
        public C4808b0 m18994g() {
            return new C4808b0(this);
        }
    }

    public C4808b0(a aVar) {
        this.f17975b = aVar.f17981a;
        this.f17976c = aVar.f17982b;
        this.f17977d = aVar.f17983c;
        this.f17978e = aVar.f17984d;
        this.f17979f = aVar.f17985e;
        this.f17980g = aVar.f17986f;
    }

    /* renamed from: b */
    public static int m18982b(int i10, int i11, int i12) {
        return C3368e.m12525d(((i10 * i11) * i12) / 1000000);
    }

    /* renamed from: d */
    public static int m18983d(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    @Override // p289u3.C4806a0.e
    /* renamed from: a */
    public int mo18935a(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (m18984c(i10, i11, i12, i13, i14, i15) * d10)) + i13) - 1) / i13) * i13;
    }

    /* renamed from: c */
    public int m18984c(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return m18987g(i10, i14, i13);
        }
        if (i12 == 1) {
            return m18985e(i11);
        }
        if (i12 == 2) {
            return m18986f(i11, i15);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    public int m18985e(int i10) {
        return C3368e.m12525d((this.f17979f * m18983d(i10)) / 1000000);
    }

    /* renamed from: f */
    public int m18986f(int i10, int i11) {
        int i12 = this.f17978e;
        if (i10 == 5) {
            i12 *= this.f17980g;
        }
        return C3368e.m12525d((i12 * (i11 != -1 ? C3254b.m11753a(i11, 8, RoundingMode.CEILING) : m18983d(i10))) / 1000000);
    }

    /* renamed from: g */
    public int m18987g(int i10, int i11, int i12) {
        return C4041n0.m15477q(i10 * this.f17977d, m18982b(this.f17975b, i11, i12), m18982b(this.f17976c, i11, i12));
    }
}
