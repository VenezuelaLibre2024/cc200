package gd;

import gd.C2237k;
import io.flutter.plugins.firebase.crashlytics.Constants;
import td.C4753m;

/* renamed from: gd.l */
/* loaded from: classes2.dex */
public final class C2238l {
    /* renamed from: a */
    public static final Object m8974a(Throwable th) {
        C4753m.m18653f(th, Constants.EXCEPTION);
        return new C2237k.b(th);
    }

    /* renamed from: b */
    public static final void m8975b(Object obj) {
        if (obj instanceof C2237k.b) {
            throw ((C2237k.b) obj).f8867h;
        }
    }
}
