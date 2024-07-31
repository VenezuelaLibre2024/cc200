package p126i7;

import p109h7.C2432o;

/* renamed from: i7.i */
/* loaded from: classes.dex */
public final class C2627i {
    /* renamed from: a */
    public static void m10618a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* renamed from: b */
    public static int m10619b(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    /* renamed from: c */
    public static void m10620c(boolean z10) {
        C2432o.m9710p(z10, "no calls to next() since the last call to remove()");
    }
}
