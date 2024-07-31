package p320w6;

import p108h6.C2394s;

/* renamed from: w6.o0 */
/* loaded from: classes.dex */
public final class C5317o0 {
    /* renamed from: a */
    public static int m21390a(int i10) {
        boolean z10;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                z10 = false;
                C2394s.m9610c(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
                return i10;
            }
            i10 = 2;
        }
        z10 = true;
        C2394s.m9610c(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
        return i10;
    }

    /* renamed from: b */
    public static String m21391b(int i10) {
        if (i10 == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i10 == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i10 == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }
}
