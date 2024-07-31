package p116he;

import java.util.ArrayList;
import java.util.List;
import p038ce.C1101t0;
import td.C4747g;
import td.C4753m;

/* renamed from: he.r */
/* loaded from: classes2.dex */
public final class C2549r<E> {
    /* renamed from: a */
    public static <E> Object m10155a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static /* synthetic */ Object m10156b(Object obj, int i10, C4747g c4747g) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return m10155a(obj);
    }

    /* renamed from: c */
    public static final Object m10157c(Object obj, E e10) {
        if (C1101t0.m4573a() && !(!(e10 instanceof List))) {
            throw new AssertionError();
        }
        if (obj == null) {
            return m10155a(e10);
        }
        if (obj instanceof ArrayList) {
            C4753m.m18651d(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(e10);
            return m10155a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e10);
        return m10155a(arrayList);
    }
}
