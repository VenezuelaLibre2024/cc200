package p023b8;

import android.util.Log;

/* renamed from: b8.g */
/* loaded from: classes.dex */
public class C0515g {

    /* renamed from: c */
    public static final C0515g f2315c = new C0515g("FirebaseCrashlytics");

    /* renamed from: a */
    public final String f2316a;

    /* renamed from: b */
    public int f2317b = 4;

    public C0515g(String str) {
        this.f2316a = str;
    }

    /* renamed from: f */
    public static C0515g m2482f() {
        return f2315c;
    }

    /* renamed from: a */
    public final boolean m2483a(int i10) {
        return this.f2317b <= i10 || Log.isLoggable(this.f2316a, i10);
    }

    /* renamed from: b */
    public void m2484b(String str) {
        m2485c(str, null);
    }

    /* renamed from: c */
    public void m2485c(String str, Throwable th) {
        if (m2483a(3)) {
            Log.d(this.f2316a, str, th);
        }
    }

    /* renamed from: d */
    public void m2486d(String str) {
        m2487e(str, null);
    }

    /* renamed from: e */
    public void m2487e(String str, Throwable th) {
        if (m2483a(6)) {
            Log.e(this.f2316a, str, th);
        }
    }

    /* renamed from: g */
    public void m2488g(String str) {
        m2489h(str, null);
    }

    /* renamed from: h */
    public void m2489h(String str, Throwable th) {
        if (m2483a(4)) {
            Log.i(this.f2316a, str, th);
        }
    }

    /* renamed from: i */
    public void m2490i(String str) {
        m2491j(str, null);
    }

    /* renamed from: j */
    public void m2491j(String str, Throwable th) {
        if (m2483a(2)) {
            Log.v(this.f2316a, str, th);
        }
    }

    /* renamed from: k */
    public void m2492k(String str) {
        m2493l(str, null);
    }

    /* renamed from: l */
    public void m2493l(String str, Throwable th) {
        if (m2483a(5)) {
            Log.w(this.f2316a, str, th);
        }
    }
}
