package p000;

import android.util.Log;
import io.flutter.plugins.firebase.crashlytics.Constants;
import td.C4753m;

/* renamed from: d */
/* loaded from: classes.dex */
public final class C1506d {

    /* renamed from: a */
    public static final C1506d f5490a = new C1506d();

    /* renamed from: b */
    public static EnumC0577c f5491b = EnumC0577c.ERROR;

    /* renamed from: d */
    public static /* synthetic */ void m6104d(C1506d c1506d, EnumC0577c enumC0577c, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th = null;
        }
        c1506d.m6107c(enumC0577c, str, th);
    }

    /* renamed from: a */
    public final void m6105a(String str, Throwable th) {
        C4753m.m18653f(str, Constants.MESSAGE);
        C4753m.m18653f(th, "throwable");
        m6107c(EnumC0577c.ERROR, str, th);
    }

    /* renamed from: b */
    public final void m6106b(String str) {
        C4753m.m18653f(str, Constants.MESSAGE);
        m6104d(this, EnumC0577c.INFO, str, null, 4, null);
    }

    /* renamed from: c */
    public final void m6107c(EnumC0577c enumC0577c, String str, Throwable th) {
        if (enumC0577c.m2927c() <= f5491b.m2927c()) {
            Log.d("AudioPlayers", str, th);
        }
    }

    /* renamed from: e */
    public final void m6108e(EnumC0577c enumC0577c) {
        C4753m.m18653f(enumC0577c, "<set-?>");
        f5491b = enumC0577c;
    }
}
