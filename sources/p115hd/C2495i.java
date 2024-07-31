package p115hd;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import td.C4753m;

/* renamed from: hd.i */
/* loaded from: classes2.dex */
public class C2495i extends C2493h {
    /* renamed from: b */
    public static final <T> List<T> m9931b(T[] tArr) {
        C4753m.m18653f(tArr, "<this>");
        List<T> m9983a = C2499k.m9983a(tArr);
        C4753m.m18652e(m9983a, "asList(this)");
        return m9983a;
    }

    /* renamed from: c */
    public static final byte[] m9932c(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        C4753m.m18653f(bArr, "<this>");
        C4753m.m18653f(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    /* renamed from: d */
    public static final <T> T[] m9933d(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        C4753m.m18653f(tArr, "<this>");
        C4753m.m18653f(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    /* renamed from: e */
    public static /* synthetic */ Object[] m9934e(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return m9933d(objArr, objArr2, i10, i11, i12);
    }

    /* renamed from: f */
    public static final <T> void m9935f(T[] tArr, T t10, int i10, int i11) {
        C4753m.m18653f(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    /* renamed from: g */
    public static final <T> void m9936g(T[] tArr, Comparator<? super T> comparator) {
        C4753m.m18653f(tArr, "<this>");
        C4753m.m18653f(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
