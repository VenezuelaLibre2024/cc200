package p064e6;

import android.util.Log;

/* renamed from: e6.l0 */
/* loaded from: classes.dex */
public class C1688l0 {

    /* renamed from: e */
    public static final C1688l0 f6279e = new C1688l0(true, 3, 1, null, null);

    /* renamed from: a */
    public final boolean f6280a;

    /* renamed from: b */
    public final String f6281b;

    /* renamed from: c */
    public final Throwable f6282c;

    /* renamed from: d */
    public final int f6283d;

    public C1688l0(boolean z10, int i10, int i11, String str, Throwable th) {
        this.f6280a = z10;
        this.f6283d = i10;
        this.f6281b = str;
        this.f6282c = th;
    }

    @Deprecated
    /* renamed from: b */
    public static C1688l0 m6742b() {
        return f6279e;
    }

    /* renamed from: c */
    public static C1688l0 m6743c(String str) {
        return new C1688l0(false, 1, 5, str, null);
    }

    /* renamed from: d */
    public static C1688l0 m6744d(String str, Throwable th) {
        return new C1688l0(false, 1, 5, str, th);
    }

    /* renamed from: f */
    public static C1688l0 m6745f(int i10) {
        return new C1688l0(true, i10, 1, null, null);
    }

    /* renamed from: g */
    public static C1688l0 m6746g(int i10, int i11, String str, Throwable th) {
        return new C1688l0(false, i10, i11, str, th);
    }

    /* renamed from: a */
    public String mo6735a() {
        return this.f6281b;
    }

    /* renamed from: e */
    public final void m6747e() {
        if (this.f6280a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f6282c != null) {
            Log.d("GoogleCertificatesRslt", mo6735a(), this.f6282c);
        } else {
            Log.d("GoogleCertificatesRslt", mo6735a());
        }
    }
}
