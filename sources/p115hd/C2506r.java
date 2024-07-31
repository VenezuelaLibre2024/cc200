package p115hd;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import td.C4753m;

/* renamed from: hd.r */
/* loaded from: classes2.dex */
public class C2506r extends C2505q {
    /* renamed from: l */
    public static final <T> void m9996l(List<T> list, Comparator<? super T> comparator) {
        C4753m.m18653f(list, "<this>");
        C4753m.m18653f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
