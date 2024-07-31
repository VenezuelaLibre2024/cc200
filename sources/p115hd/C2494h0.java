package p115hd;

import java.util.Set;
import td.C4753m;

/* renamed from: hd.h0 */
/* loaded from: classes2.dex */
public class C2494h0 extends C2492g0 {
    /* renamed from: b */
    public static final <T> Set<T> m9929b() {
        return C2514z.f9948h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <T> Set<T> m9930c(Set<? extends T> set) {
        C4753m.m18653f(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : C2492g0.m9928a(set.iterator().next()) : m9929b();
    }
}
