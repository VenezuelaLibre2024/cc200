package p079f6;

import p064e6.C1671d;

/* renamed from: f6.r */
/* loaded from: classes.dex */
public final class C1858r extends UnsupportedOperationException {

    /* renamed from: h */
    public final C1671d f7040h;

    public C1858r(C1671d c1671d) {
        this.f7040h = c1671d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f7040h));
    }
}
