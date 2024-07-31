package p125i6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: i6.b */
/* loaded from: classes.dex */
public class C2602b {

    /* renamed from: i6.b$a */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    /* renamed from: A */
    public static Double m10409A(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        if (m10420L == 0) {
            return null;
        }
        m10423O(parcel, i10, m10420L, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: B */
    public static float m10410B(Parcel parcel, int i10) {
        m10424P(parcel, i10, 4);
        return parcel.readFloat();
    }

    /* renamed from: C */
    public static Float m10411C(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        if (m10420L == 0) {
            return null;
        }
        m10423O(parcel, i10, m10420L, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: D */
    public static int m10412D(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: E */
    public static IBinder m10413E(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m10420L);
        return readStrongBinder;
    }

    /* renamed from: F */
    public static int m10414F(Parcel parcel, int i10) {
        m10424P(parcel, i10, 4);
        return parcel.readInt();
    }

    /* renamed from: G */
    public static Integer m10415G(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        if (m10420L == 0) {
            return null;
        }
        m10423O(parcel, i10, m10420L, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: H */
    public static void m10416H(Parcel parcel, int i10, List list, ClassLoader classLoader) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(dataPosition + m10420L);
    }

    /* renamed from: I */
    public static long m10417I(Parcel parcel, int i10) {
        m10424P(parcel, i10, 8);
        return parcel.readLong();
    }

    /* renamed from: J */
    public static Long m10418J(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        if (m10420L == 0) {
            return null;
        }
        m10423O(parcel, i10, m10420L, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: K */
    public static short m10419K(Parcel parcel, int i10) {
        m10424P(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: L */
    public static int m10420L(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    /* renamed from: M */
    public static void m10421M(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + m10420L(parcel, i10));
    }

    /* renamed from: N */
    public static int m10422N(Parcel parcel) {
        int m10412D = m10412D(parcel);
        int m10420L = m10420L(parcel, m10412D);
        int m10446v = m10446v(m10412D);
        int dataPosition = parcel.dataPosition();
        if (m10446v != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(m10412D))), parcel);
        }
        int i10 = m10420L + dataPosition;
        if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new a("Size read is invalid start=" + dataPosition + " end=" + i10, parcel);
    }

    /* renamed from: O */
    public static void m10423O(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new a("Expected size " + i12 + " got " + i11 + " (0x" + Integer.toHexString(i11) + ")", parcel);
    }

    /* renamed from: P */
    public static void m10424P(Parcel parcel, int i10, int i11) {
        int m10420L = m10420L(parcel, i10);
        if (m10420L == i11) {
            return;
        }
        throw new a("Expected size " + i11 + " got " + m10420L + " (0x" + Integer.toHexString(m10420L) + ")", parcel);
    }

    /* renamed from: a */
    public static BigDecimal m10425a(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + m10420L);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: b */
    public static BigDecimal[] m10426b(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i11] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + m10420L);
        return bigDecimalArr;
    }

    /* renamed from: c */
    public static BigInteger m10427c(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m10420L);
        return new BigInteger(createByteArray);
    }

    /* renamed from: d */
    public static BigInteger[] m10428d(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bigIntegerArr[i11] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + m10420L);
        return bigIntegerArr;
    }

    /* renamed from: e */
    public static boolean[] m10429e(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + m10420L);
        return createBooleanArray;
    }

    /* renamed from: f */
    public static Bundle m10430f(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m10420L);
        return readBundle;
    }

    /* renamed from: g */
    public static byte[] m10431g(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m10420L);
        return createByteArray;
    }

    /* renamed from: h */
    public static byte[][] m10432h(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            bArr[i11] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + m10420L);
        return bArr;
    }

    /* renamed from: i */
    public static double[] m10433i(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + m10420L);
        return createDoubleArray;
    }

    /* renamed from: j */
    public static float[] m10434j(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + m10420L);
        return createFloatArray;
    }

    /* renamed from: k */
    public static int[] m10435k(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m10420L);
        return createIntArray;
    }

    /* renamed from: l */
    public static long[] m10436l(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + m10420L);
        return createLongArray;
    }

    /* renamed from: m */
    public static Parcel m10437m(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, m10420L);
        parcel.setDataPosition(dataPosition + m10420L);
        return obtain;
    }

    /* renamed from: n */
    public static Parcel[] m10438n(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i11] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i11] = null;
            }
        }
        parcel.setDataPosition(dataPosition + m10420L);
        return parcelArr;
    }

    /* renamed from: o */
    public static <T extends Parcelable> T m10439o(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m10420L);
        return createFromParcel;
    }

    /* renamed from: p */
    public static String m10440p(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m10420L);
        return readString;
    }

    /* renamed from: q */
    public static String[] m10441q(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m10420L);
        return createStringArray;
    }

    /* renamed from: r */
    public static ArrayList<String> m10442r(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m10420L);
        return createStringArrayList;
    }

    /* renamed from: s */
    public static <T> T[] m10443s(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m10420L);
        return tArr;
    }

    /* renamed from: t */
    public static <T> ArrayList<T> m10444t(Parcel parcel, int i10, Parcelable.Creator<T> creator) {
        int m10420L = m10420L(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (m10420L == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m10420L);
        return createTypedArrayList;
    }

    /* renamed from: u */
    public static void m10445u(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new a("Overread allowed size end=" + i10, parcel);
    }

    /* renamed from: v */
    public static int m10446v(int i10) {
        return (char) i10;
    }

    /* renamed from: w */
    public static boolean m10447w(Parcel parcel, int i10) {
        m10424P(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: x */
    public static Boolean m10448x(Parcel parcel, int i10) {
        int m10420L = m10420L(parcel, i10);
        if (m10420L == 0) {
            return null;
        }
        m10423O(parcel, i10, m10420L, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: y */
    public static byte m10449y(Parcel parcel, int i10) {
        m10424P(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: z */
    public static double m10450z(Parcel parcel, int i10) {
        m10424P(parcel, i10, 8);
        return parcel.readDouble();
    }
}
