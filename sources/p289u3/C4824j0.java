package p289u3;

import java.nio.ShortBuffer;
import java.util.Arrays;
import p222p5.C4014a;

/* renamed from: u3.j0 */
/* loaded from: classes.dex */
public final class C4824j0 {

    /* renamed from: a */
    public final int f18075a;

    /* renamed from: b */
    public final int f18076b;

    /* renamed from: c */
    public final float f18077c;

    /* renamed from: d */
    public final float f18078d;

    /* renamed from: e */
    public final float f18079e;

    /* renamed from: f */
    public final int f18080f;

    /* renamed from: g */
    public final int f18081g;

    /* renamed from: h */
    public final int f18082h;

    /* renamed from: i */
    public final short[] f18083i;

    /* renamed from: j */
    public short[] f18084j;

    /* renamed from: k */
    public int f18085k;

    /* renamed from: l */
    public short[] f18086l;

    /* renamed from: m */
    public int f18087m;

    /* renamed from: n */
    public short[] f18088n;

    /* renamed from: o */
    public int f18089o;

    /* renamed from: p */
    public int f18090p;

    /* renamed from: q */
    public int f18091q;

    /* renamed from: r */
    public int f18092r;

    /* renamed from: s */
    public int f18093s;

    /* renamed from: t */
    public int f18094t;

    /* renamed from: u */
    public int f18095u;

    /* renamed from: v */
    public int f18096v;

    public C4824j0(int i10, int i11, float f10, float f11, int i12) {
        this.f18075a = i10;
        this.f18076b = i11;
        this.f18077c = f10;
        this.f18078d = f11;
        this.f18079e = i10 / i12;
        this.f18080f = i10 / 400;
        int i13 = i10 / 65;
        this.f18081g = i13;
        int i14 = i13 * 2;
        this.f18082h = i14;
        this.f18083i = new short[i14];
        this.f18084j = new short[i14 * i11];
        this.f18086l = new short[i14 * i11];
        this.f18088n = new short[i14 * i11];
    }

    /* renamed from: p */
    public static void m19091p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    /* renamed from: a */
    public final void m19092a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f18087m == i10) {
            return;
        }
        int i13 = this.f18075a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        m19106o(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f18089o;
            if (i15 >= i16 - 1) {
                m19111u(i16 - 1);
                return;
            }
            while (true) {
                i11 = this.f18090p;
                int i17 = (i11 + 1) * i14;
                i12 = this.f18091q;
                if (i17 <= i12 * i13) {
                    break;
                }
                this.f18086l = m19097f(this.f18086l, this.f18087m, 1);
                int i18 = 0;
                while (true) {
                    int i19 = this.f18076b;
                    if (i18 < i19) {
                        this.f18086l[(this.f18087m * i19) + i18] = m19105n(this.f18088n, (i19 * i15) + i18, i13, i14);
                        i18++;
                    }
                }
                this.f18091q++;
                this.f18087m++;
            }
            int i20 = i11 + 1;
            this.f18090p = i20;
            if (i20 == i13) {
                this.f18090p = 0;
                C4014a.m15200f(i12 == i14);
                this.f18091q = 0;
            }
            i15++;
        }
    }

    /* renamed from: b */
    public final void m19093b(float f10) {
        int m19113w;
        int i10 = this.f18085k;
        if (i10 < this.f18082h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f18092r > 0) {
                m19113w = m19094c(i11);
            } else {
                int m19098g = m19098g(this.f18084j, i11);
                m19113w = ((double) f10) > 1.0d ? m19098g + m19113w(this.f18084j, i11, f10, m19098g) : m19104m(this.f18084j, i11, f10, m19098g);
            }
            i11 += m19113w;
        } while (this.f18082h + i11 <= i10);
        m19112v(i11);
    }

    /* renamed from: c */
    public final int m19094c(int i10) {
        int min = Math.min(this.f18082h, this.f18092r);
        m19095d(this.f18084j, i10, min);
        this.f18092r -= min;
        return min;
    }

    /* renamed from: d */
    public final void m19095d(short[] sArr, int i10, int i11) {
        short[] m19097f = m19097f(this.f18086l, this.f18087m, i11);
        this.f18086l = m19097f;
        int i12 = this.f18076b;
        System.arraycopy(sArr, i10 * i12, m19097f, this.f18087m * i12, i12 * i11);
        this.f18087m += i11;
    }

    /* renamed from: e */
    public final void m19096e(short[] sArr, int i10, int i11) {
        int i12 = this.f18082h / i11;
        int i13 = this.f18076b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f18083i[i16] = (short) (i17 / i14);
        }
    }

    /* renamed from: f */
    public final short[] m19097f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f18076b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    /* renamed from: g */
    public final int m19098g(short[] sArr, int i10) {
        int i11;
        int i12 = this.f18075a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f18076b == 1 && i13 == 1) {
            i11 = m19099h(sArr, i10, this.f18080f, this.f18081g);
        } else {
            m19096e(sArr, i10, i13);
            int m19099h = m19099h(this.f18083i, 0, this.f18080f / i13, this.f18081g / i13);
            if (i13 != 1) {
                int i14 = m19099h * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f18080f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f18081g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f18076b == 1) {
                    i11 = m19099h(sArr, i10, i16, i17);
                } else {
                    m19096e(sArr, i10, 1);
                    i11 = m19099h(this.f18083i, 0, i16, i17);
                }
            } else {
                i11 = m19099h;
            }
        }
        int i20 = m19107q(this.f18095u, this.f18096v) ? this.f18093s : i11;
        this.f18094t = this.f18095u;
        this.f18093s = i11;
        return i20;
    }

    /* renamed from: h */
    public final int m19099h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f18076b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i14 * i11) {
                i16 = i11;
                i14 = i18;
            }
            if (i18 * i15 > i17 * i11) {
                i15 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f18095u = i14 / i16;
        this.f18096v = i17 / i15;
        return i16;
    }

    /* renamed from: i */
    public void m19100i() {
        this.f18085k = 0;
        this.f18087m = 0;
        this.f18089o = 0;
        this.f18090p = 0;
        this.f18091q = 0;
        this.f18092r = 0;
        this.f18093s = 0;
        this.f18094t = 0;
        this.f18095u = 0;
        this.f18096v = 0;
    }

    /* renamed from: j */
    public void m19101j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f18076b, this.f18087m);
        shortBuffer.put(this.f18086l, 0, this.f18076b * min);
        int i10 = this.f18087m - min;
        this.f18087m = i10;
        short[] sArr = this.f18086l;
        int i11 = this.f18076b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    /* renamed from: k */
    public int m19102k() {
        return this.f18087m * this.f18076b * 2;
    }

    /* renamed from: l */
    public int m19103l() {
        return this.f18085k * this.f18076b * 2;
    }

    /* renamed from: m */
    public final int m19104m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f18092r = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] m19097f = m19097f(this.f18086l, this.f18087m, i13);
        this.f18086l = m19097f;
        int i14 = this.f18076b;
        System.arraycopy(sArr, i10 * i14, m19097f, this.f18087m * i14, i14 * i11);
        m19091p(i12, this.f18076b, this.f18086l, this.f18087m + i11, sArr, i10 + i11, sArr, i10);
        this.f18087m += i13;
        return i12;
    }

    /* renamed from: n */
    public final short m19105n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f18076b];
        int i13 = this.f18091q * i11;
        int i14 = this.f18090p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    /* renamed from: o */
    public final void m19106o(int i10) {
        int i11 = this.f18087m - i10;
        short[] m19097f = m19097f(this.f18088n, this.f18089o, i11);
        this.f18088n = m19097f;
        short[] sArr = this.f18086l;
        int i12 = this.f18076b;
        System.arraycopy(sArr, i10 * i12, m19097f, this.f18089o * i12, i12 * i11);
        this.f18087m = i10;
        this.f18089o += i11;
    }

    /* renamed from: q */
    public final boolean m19107q(int i10, int i11) {
        return i10 != 0 && this.f18093s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f18094t * 3;
    }

    /* renamed from: r */
    public final void m19108r() {
        int i10 = this.f18087m;
        float f10 = this.f18077c;
        float f11 = this.f18078d;
        float f12 = f10 / f11;
        float f13 = this.f18079e * f11;
        double d10 = f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            m19093b(f12);
        } else {
            m19095d(this.f18084j, 0, this.f18085k);
            this.f18085k = 0;
        }
        if (f13 != 1.0f) {
            m19092a(f13, i10);
        }
    }

    /* renamed from: s */
    public void m19109s() {
        int i10;
        int i11 = this.f18085k;
        float f10 = this.f18077c;
        float f11 = this.f18078d;
        int i12 = this.f18087m + ((int) ((((i11 / (f10 / f11)) + this.f18089o) / (this.f18079e * f11)) + 0.5f));
        this.f18084j = m19097f(this.f18084j, i11, (this.f18082h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f18082h;
            int i14 = this.f18076b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f18084j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f18085k += i10 * 2;
        m19108r();
        if (this.f18087m > i12) {
            this.f18087m = i12;
        }
        this.f18085k = 0;
        this.f18092r = 0;
        this.f18089o = 0;
    }

    /* renamed from: t */
    public void m19110t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f18076b;
        int i11 = remaining / i10;
        short[] m19097f = m19097f(this.f18084j, this.f18085k, i11);
        this.f18084j = m19097f;
        shortBuffer.get(m19097f, this.f18085k * this.f18076b, ((i10 * i11) * 2) / 2);
        this.f18085k += i11;
        m19108r();
    }

    /* renamed from: u */
    public final void m19111u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f18088n;
        int i11 = this.f18076b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f18089o - i10) * i11);
        this.f18089o -= i10;
    }

    /* renamed from: v */
    public final void m19112v(int i10) {
        int i11 = this.f18085k - i10;
        short[] sArr = this.f18084j;
        int i12 = this.f18076b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f18085k = i11;
    }

    /* renamed from: w */
    public final int m19113w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f18092r = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] m19097f = m19097f(this.f18086l, this.f18087m, i12);
        this.f18086l = m19097f;
        m19091p(i12, this.f18076b, m19097f, this.f18087m, sArr, i10, sArr, i10 + i11);
        this.f18087m += i12;
        return i12;
    }
}
