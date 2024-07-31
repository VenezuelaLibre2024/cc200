package p125i6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

/* renamed from: i6.c */
/* loaded from: classes.dex */
public class C2603c {
    /* renamed from: A */
    public static void m10451A(Parcel parcel, int i10, Long l10, boolean z10) {
        if (l10 != null) {
            m10463M(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        } else if (z10) {
            m10463M(parcel, i10, 0);
        }
    }

    /* renamed from: B */
    public static void m10452B(Parcel parcel, int i10, Parcel parcel2, boolean z10) {
        if (parcel2 == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: C */
    public static void m10453C(Parcel parcel, int i10, List<Parcel> list, boolean z10) {
        if (list == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
                return;
            }
            return;
        }
        int m10461K = m10461K(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcel parcel2 = list.get(i11);
            if (parcel2 != null) {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            } else {
                parcel.writeInt(0);
            }
        }
        m10462L(parcel, m10461K);
    }

    /* renamed from: D */
    public static void m10454D(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: E */
    public static void m10455E(Parcel parcel, int i10, short s10) {
        m10463M(parcel, i10, 4);
        parcel.writeInt(s10);
    }

    /* renamed from: F */
    public static void m10456F(Parcel parcel, int i10, String str, boolean z10) {
        if (str == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.writeString(str);
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: G */
    public static void m10457G(Parcel parcel, int i10, String[] strArr, boolean z10) {
        if (strArr == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.writeStringArray(strArr);
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: H */
    public static void m10458H(Parcel parcel, int i10, List<String> list, boolean z10) {
        if (list == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.writeStringList(list);
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: I */
    public static <T extends Parcelable> void m10459I(Parcel parcel, int i10, T[] tArr, int i11, boolean z10) {
        if (tArr == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
                return;
            }
            return;
        }
        int m10461K = m10461K(parcel, i10);
        parcel.writeInt(tArr.length);
        for (T t10 : tArr) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                m10464N(parcel, t10, i11);
            }
        }
        m10462L(parcel, m10461K);
    }

    /* renamed from: J */
    public static <T extends Parcelable> void m10460J(Parcel parcel, int i10, List<T> list, boolean z10) {
        if (list == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
                return;
            }
            return;
        }
        int m10461K = m10461K(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            T t10 = list.get(i11);
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                m10464N(parcel, t10, 0);
            }
        }
        m10462L(parcel, m10461K);
    }

    /* renamed from: K */
    public static int m10461K(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: L */
    public static void m10462L(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: M */
    public static void m10463M(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    /* renamed from: N */
    public static void m10464N(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static int m10465a(Parcel parcel) {
        return m10461K(parcel, 20293);
    }

    /* renamed from: b */
    public static void m10466b(Parcel parcel, int i10) {
        m10462L(parcel, i10);
    }

    /* renamed from: c */
    public static void m10467c(Parcel parcel, int i10, BigDecimal bigDecimal, boolean z10) {
        if (bigDecimal == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: d */
    public static void m10468d(Parcel parcel, int i10, BigDecimal[] bigDecimalArr, boolean z10) {
        if (bigDecimalArr == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
                return;
            }
            return;
        }
        int m10461K = m10461K(parcel, i10);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int i11 = 0; i11 < length; i11++) {
            parcel.writeByteArray(bigDecimalArr[i11].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[i11].scale());
        }
        m10462L(parcel, m10461K);
    }

    /* renamed from: e */
    public static void m10469e(Parcel parcel, int i10, BigInteger bigInteger, boolean z10) {
        if (bigInteger == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.writeByteArray(bigInteger.toByteArray());
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: f */
    public static void m10470f(Parcel parcel, int i10, BigInteger[] bigIntegerArr, boolean z10) {
        if (bigIntegerArr == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
                return;
            }
            return;
        }
        int m10461K = m10461K(parcel, i10);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        m10462L(parcel, m10461K);
    }

    /* renamed from: g */
    public static void m10471g(Parcel parcel, int i10, boolean z10) {
        m10463M(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* renamed from: h */
    public static void m10472h(Parcel parcel, int i10, boolean[] zArr, boolean z10) {
        if (zArr == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.writeBooleanArray(zArr);
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: i */
    public static void m10473i(Parcel parcel, int i10, Boolean bool, boolean z10) {
        if (bool != null) {
            m10463M(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z10) {
            m10463M(parcel, i10, 0);
        }
    }

    /* renamed from: j */
    public static void m10474j(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.writeBundle(bundle);
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: k */
    public static void m10475k(Parcel parcel, int i10, byte b10) {
        m10463M(parcel, i10, 4);
        parcel.writeInt(b10);
    }

    /* renamed from: l */
    public static void m10476l(Parcel parcel, int i10, byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.writeByteArray(bArr);
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: m */
    public static void m10477m(Parcel parcel, int i10, byte[][] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
                return;
            }
            return;
        }
        int m10461K = m10461K(parcel, i10);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        m10462L(parcel, m10461K);
    }

    /* renamed from: n */
    public static void m10478n(Parcel parcel, int i10, double d10) {
        m10463M(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    /* renamed from: o */
    public static void m10479o(Parcel parcel, int i10, double[] dArr, boolean z10) {
        if (dArr == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.writeDoubleArray(dArr);
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: p */
    public static void m10480p(Parcel parcel, int i10, Double d10, boolean z10) {
        if (d10 != null) {
            m10463M(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z10) {
            m10463M(parcel, i10, 0);
        }
    }

    /* renamed from: q */
    public static void m10481q(Parcel parcel, int i10, float f10) {
        m10463M(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    /* renamed from: r */
    public static void m10482r(Parcel parcel, int i10, float[] fArr, boolean z10) {
        if (fArr == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.writeFloatArray(fArr);
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: s */
    public static void m10483s(Parcel parcel, int i10, Float f10, boolean z10) {
        if (f10 != null) {
            m10463M(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            m10463M(parcel, i10, 0);
        }
    }

    /* renamed from: t */
    public static void m10484t(Parcel parcel, int i10, IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: u */
    public static void m10485u(Parcel parcel, int i10, int i11) {
        m10463M(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    /* renamed from: v */
    public static void m10486v(Parcel parcel, int i10, int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.writeIntArray(iArr);
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: w */
    public static void m10487w(Parcel parcel, int i10, Integer num, boolean z10) {
        if (num != null) {
            m10463M(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            m10463M(parcel, i10, 0);
        }
    }

    /* renamed from: x */
    public static void m10488x(Parcel parcel, int i10, List list, boolean z10) {
        if (list == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.writeList(list);
            m10462L(parcel, m10461K);
        }
    }

    /* renamed from: y */
    public static void m10489y(Parcel parcel, int i10, long j10) {
        m10463M(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    /* renamed from: z */
    public static void m10490z(Parcel parcel, int i10, long[] jArr, boolean z10) {
        if (jArr == null) {
            if (z10) {
                m10463M(parcel, i10, 0);
            }
        } else {
            int m10461K = m10461K(parcel, i10);
            parcel.writeLongArray(jArr);
            m10462L(parcel, m10461K);
        }
    }
}
