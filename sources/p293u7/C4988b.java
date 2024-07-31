package p293u7;

import android.util.Log;

/* renamed from: u7.b */
/* loaded from: classes.dex */
public class C4988b {

    /* renamed from: c */
    public static final C4988b f18673c = new C4988b("FirebaseAppCheck");

    /* renamed from: a */
    public final String f18674a;

    /* renamed from: b */
    public int f18675b = 4;

    public C4988b(String str) {
        this.f18674a = str;
    }

    /* renamed from: f */
    public static C4988b m19551f() {
        return f18673c;
    }

    /* renamed from: a */
    public final boolean m19552a(int i10) {
        return this.f18675b <= i10 || Log.isLoggable(this.f18674a, i10);
    }

    /* renamed from: b */
    public void m19553b(String str) {
        m19554c(str, null);
    }

    /* renamed from: c */
    public void m19554c(String str, Throwable th) {
        if (m19552a(3)) {
            Log.d(this.f18674a, str, th);
        }
    }

    /* renamed from: d */
    public void m19555d(String str) {
        m19556e(str, null);
    }

    /* renamed from: e */
    public void m19556e(String str, Throwable th) {
        if (m19552a(6)) {
            Log.e(this.f18674a, str, th);
        }
    }
}
