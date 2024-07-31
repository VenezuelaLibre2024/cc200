package p090g0;

import android.os.Bundle;
import android.os.IBinder;
import io.flutter.plugins.firebase.crashlytics.Constants;
import td.C4753m;

/* renamed from: g0.b */
/* loaded from: classes.dex */
public final class C1942b {

    /* renamed from: a */
    public static final C1942b f7751a = new C1942b();

    /* renamed from: a */
    public static final void m7849a(Bundle bundle, String str, IBinder iBinder) {
        C4753m.m18653f(bundle, "bundle");
        C4753m.m18653f(str, Constants.KEY);
        bundle.putBinder(str, iBinder);
    }
}
