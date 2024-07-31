package ae;

import p343xd.C5762f;

/* renamed from: ae.a */
/* loaded from: classes2.dex */
public class C0095a {
    /* renamed from: a */
    public static final int m400a(int i10) {
        if (new C5762f(2, 36).m22896h(i10)) {
            return i10;
        }
        throw new IllegalArgumentException("radix " + i10 + " was not in valid range " + new C5762f(2, 36));
    }

    /* renamed from: b */
    public static final int m401b(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    /* renamed from: c */
    public static final boolean m402c(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }
}
