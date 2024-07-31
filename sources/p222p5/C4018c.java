package p222p5;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;
import p126i7.AbstractC2651u;
import p264s3.InterfaceC4436h;

/* renamed from: p5.c */
/* loaded from: classes.dex */
public final class C4018c {
    /* renamed from: a */
    public static void m15266a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) C4041n0.m15463j(C4018c.class.getClassLoader()));
        }
    }

    /* renamed from: b */
    public static <T extends InterfaceC4436h> AbstractC2651u<T> m15267b(InterfaceC4436h.a<T> aVar, List<Bundle> list) {
        AbstractC2651u.a m10766n = AbstractC2651u.m10766n();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m10766n.mo10749a(aVar.mo6314a((Bundle) C4014a.m15199e(list.get(i10))));
        }
        return m10766n.m10784k();
    }

    /* renamed from: c */
    public static <T extends InterfaceC4436h> SparseArray<T> m15268c(InterfaceC4436h.a<T> aVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), aVar.mo6314a(sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }
}
