package p115hd;

import java.util.Collection;
import java.util.Iterator;
import td.C4753m;

/* renamed from: hd.s */
/* loaded from: classes2.dex */
public class C2507s extends C2506r {
    /* renamed from: m */
    public static final <T> boolean m9997m(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C4753m.m18653f(collection, "<this>");
        C4753m.m18653f(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }
}
