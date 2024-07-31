package p290u4;

import java.util.Arrays;
import java.util.Random;

/* renamed from: u4.o0 */
/* loaded from: classes.dex */
public interface InterfaceC4873o0 {

    /* renamed from: u4.o0$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC4873o0 {

        /* renamed from: a */
        public final Random f18416a;

        /* renamed from: b */
        public final int[] f18417b;

        /* renamed from: c */
        public final int[] f18418c;

        public a(int i10) {
            this(i10, new Random());
        }

        public a(int i10, Random random) {
            this(m19417a(i10, random), random);
        }

        public a(int[] iArr, Random random) {
            this.f18417b = iArr;
            this.f18416a = random;
            this.f18418c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f18418c[iArr[i10]] = i10;
            }
        }

        /* renamed from: a */
        public static int[] m19417a(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int nextInt = random.nextInt(i12);
                iArr[i11] = iArr[nextInt];
                iArr[nextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // p290u4.InterfaceC4873o0
        /* renamed from: b */
        public int mo19409b() {
            return this.f18417b.length;
        }

        @Override // p290u4.InterfaceC4873o0
        /* renamed from: c */
        public InterfaceC4873o0 mo19410c(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f18417b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f18417b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f18416a.nextLong()));
                }
                if (iArr2[i13] < i10 || iArr2[i13] >= i11) {
                    iArr[i13 - i14] = iArr2[i13] >= i10 ? iArr2[i13] - i12 : iArr2[i13];
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // p290u4.InterfaceC4873o0
        /* renamed from: d */
        public int mo19411d() {
            int[] iArr = this.f18417b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // p290u4.InterfaceC4873o0
        /* renamed from: e */
        public int mo19412e(int i10) {
            int i11 = this.f18418c[i10] - 1;
            if (i11 >= 0) {
                return this.f18417b[i11];
            }
            return -1;
        }

        @Override // p290u4.InterfaceC4873o0
        /* renamed from: f */
        public int mo19413f(int i10) {
            int i11 = this.f18418c[i10] + 1;
            int[] iArr = this.f18417b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // p290u4.InterfaceC4873o0
        /* renamed from: g */
        public InterfaceC4873o0 mo19414g(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f18416a.nextInt(this.f18417b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f18416a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f18417b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f18417b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f18416a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    iArr3[i12] = iArr4[i16];
                    if (iArr3[i12] >= i10) {
                        iArr3[i12] = iArr3[i12] + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // p290u4.InterfaceC4873o0
        /* renamed from: h */
        public int mo19415h() {
            int[] iArr = this.f18417b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // p290u4.InterfaceC4873o0
        /* renamed from: i */
        public InterfaceC4873o0 mo19416i() {
            return new a(0, new Random(this.f18416a.nextLong()));
        }
    }

    /* renamed from: b */
    int mo19409b();

    /* renamed from: c */
    InterfaceC4873o0 mo19410c(int i10, int i11);

    /* renamed from: d */
    int mo19411d();

    /* renamed from: e */
    int mo19412e(int i10);

    /* renamed from: f */
    int mo19413f(int i10);

    /* renamed from: g */
    InterfaceC4873o0 mo19414g(int i10, int i11);

    /* renamed from: h */
    int mo19415h();

    /* renamed from: i */
    InterfaceC4873o0 mo19416i();
}
