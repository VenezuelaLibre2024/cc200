package p115hd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import td.C4753m;

/* renamed from: hd.n */
/* loaded from: classes2.dex */
public class C2502n extends C2501m {
    /* renamed from: d */
    public static final <T> Collection<T> m9988d(T[] tArr) {
        C4753m.m18653f(tArr, "<this>");
        return new C2487e(tArr, false);
    }

    /* renamed from: e */
    public static final <T> List<T> m9989e() {
        return C2512x.f9946h;
    }

    /* renamed from: f */
    public static final <T> int m9990f(List<? extends T> list) {
        C4753m.m18653f(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: g */
    public static final <T> List<T> m9991g(T... tArr) {
        C4753m.m18653f(tArr, "elements");
        return tArr.length > 0 ? C2495i.m9931b(tArr) : m9989e();
    }

    /* renamed from: h */
    public static final <T> List<T> m9992h(T... tArr) {
        C4753m.m18653f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C2487e(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static final <T> List<T> m9993i(List<? extends T> list) {
        C4753m.m18653f(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C2501m.m9986b(list.get(0)) : m9989e();
    }

    /* renamed from: j */
    public static final void m9994j() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
