package p115hd;

import java.lang.reflect.Array;
import td.C4753m;

/* renamed from: hd.g */
/* loaded from: classes2.dex */
public class C2491g {
    /* renamed from: a */
    public static final <T> T[] m9927a(T[] tArr, int i10) {
        C4753m.m18653f(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i10);
        C4753m.m18651d(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }
}
