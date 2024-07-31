package p321w7;

import p108h6.C2394s;

/* renamed from: w7.k */
/* loaded from: classes.dex */
public class C5380k {
    /* renamed from: a */
    public static AbstractC5368h m21517a(String str, String str2) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        return new C5376j(str, str2);
    }

    /* renamed from: b */
    public static AbstractC5368h m21518b(String str, String str2) {
        if (C5376j.m21508M(str2)) {
            return new C5376j(str, null, str2, null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }
}
