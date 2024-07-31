package p320w6;

import p108h6.C2394s;

/* renamed from: w6.b0 */
/* loaded from: classes.dex */
public final class C5291b0 {
    /* renamed from: a */
    public static int m21362a(int i10) {
        boolean z10;
        if (i10 != 100 && i10 != 102 && i10 != 104) {
            if (i10 != 105) {
                z10 = false;
                C2394s.m9610c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i10));
                return i10;
            }
            i10 = 105;
        }
        z10 = true;
        C2394s.m9610c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i10));
        return i10;
    }

    /* renamed from: b */
    public static String m21363b(int i10) {
        if (i10 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i10 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i10 == 104) {
            return "LOW_POWER";
        }
        if (i10 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
