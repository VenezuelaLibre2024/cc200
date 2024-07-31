package p155k7;

import p109h7.C2432o;

/* renamed from: k7.b */
/* loaded from: classes.dex */
public final class C3365b {
    /* renamed from: a */
    public static char m12518a(long j10) {
        char c10 = (char) j10;
        C2432o.m9701g(((long) c10) == j10, "Out of range: %s", j10);
        return c10;
    }

    /* renamed from: b */
    public static boolean m12519b(char[] cArr, char c10) {
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static char m12520c(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & 255));
    }
}
