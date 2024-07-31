package p195n7;

import p108h6.C2394s;

/* renamed from: n7.m */
/* loaded from: classes.dex */
public class C3773m extends Exception {
    @Deprecated
    public C3773m() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3773m(String str) {
        super(str);
        C2394s.m9614g(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3773m(String str, Throwable th) {
        super(str, th);
        C2394s.m9614g(str, "Detail message must not be empty");
    }
}
