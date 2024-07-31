package p365z4;

import android.util.SparseArray;
import p222p5.C4033j0;

/* renamed from: z4.t */
/* loaded from: classes.dex */
public final class C5989t {

    /* renamed from: a */
    public final SparseArray<C4033j0> f22354a = new SparseArray<>();

    /* renamed from: a */
    public C4033j0 m24062a(int i10) {
        C4033j0 c4033j0 = this.f22354a.get(i10);
        if (c4033j0 != null) {
            return c4033j0;
        }
        C4033j0 c4033j02 = new C4033j0(9223372036854775806L);
        this.f22354a.put(i10, c4033j02);
        return c4033j02;
    }

    /* renamed from: b */
    public void m24063b() {
        this.f22354a.clear();
    }
}
