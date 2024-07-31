package p126i7;

/* renamed from: i7.o0 */
/* loaded from: classes.dex */
public final class C2640o0 {
    /* renamed from: a */
    public static Object m10716a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    /* renamed from: b */
    public static Object[] m10717b(Object... objArr) {
        m10718c(objArr, objArr.length);
        return objArr;
    }

    /* renamed from: c */
    public static Object[] m10718c(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            m10716a(objArr[i11], i11);
        }
        return objArr;
    }

    /* renamed from: d */
    public static <T> T[] m10719d(T[] tArr, int i10) {
        return (T[]) C2644q0.m10731b(tArr, i10);
    }
}
