package p115hd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import td.C4753m;

/* renamed from: hd.m */
/* loaded from: classes2.dex */
public class C2501m {
    /* renamed from: a */
    public static final <T> Object[] m9985a(T[] tArr, boolean z10) {
        C4753m.m18653f(tArr, "<this>");
        if (z10 && C4753m.m18648a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C4753m.m18652e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    /* renamed from: b */
    public static final <T> List<T> m9986b(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        C4753m.m18652e(singletonList, "singletonList(element)");
        return singletonList;
    }

    /* renamed from: c */
    public static final <T> List<T> m9987c(Iterable<? extends T> iterable) {
        C4753m.m18653f(iterable, "<this>");
        List<T> m10010M = C2510v.m10010M(iterable);
        Collections.shuffle(m10010M);
        return m10010M;
    }
}
