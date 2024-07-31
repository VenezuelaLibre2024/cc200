package p084fb;

import p129ia.C2684p;

/* renamed from: fb.i */
/* loaded from: classes.dex */
public final class C1896i {

    /* renamed from: a */
    public final boolean f7170a;

    public C1896i(boolean z10) {
        this.f7170a = z10;
    }

    /* renamed from: a */
    public void m7750a(C2684p[] c2684pArr) {
        if (!this.f7170a || c2684pArr == null || c2684pArr.length < 3) {
            return;
        }
        C2684p c2684p = c2684pArr[0];
        c2684pArr[0] = c2684pArr[2];
        c2684pArr[2] = c2684p;
    }
}
