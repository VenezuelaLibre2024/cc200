package p126i7;

import java.util.Arrays;
import java.util.Map;

/* renamed from: i7.q0 */
/* loaded from: classes.dex */
public final class C2644q0 {
    /* renamed from: a */
    public static <T> T[] m10730a(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    /* renamed from: b */
    public static <T> T[] m10731b(T[] tArr, int i10) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m10732c() {
        return C2631k.m10644r();
    }
}
