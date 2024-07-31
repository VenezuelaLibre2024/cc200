package p021b6;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: b6.r */
/* loaded from: classes.dex */
public final class C0499r {

    /* renamed from: d */
    public static C0499r f2295d;

    /* renamed from: a */
    public final C0484c f2296a;

    /* renamed from: b */
    public GoogleSignInAccount f2297b;

    /* renamed from: c */
    public GoogleSignInOptions f2298c;

    public C0499r(Context context) {
        C0484c m2419b = C0484c.m2419b(context);
        this.f2296a = m2419b;
        this.f2297b = m2419b.m2422c();
        this.f2298c = m2419b.m2423d();
    }

    /* renamed from: c */
    public static synchronized C0499r m2443c(Context context) {
        C0499r m2444f;
        synchronized (C0499r.class) {
            m2444f = m2444f(context.getApplicationContext());
        }
        return m2444f;
    }

    /* renamed from: f */
    public static synchronized C0499r m2444f(Context context) {
        synchronized (C0499r.class) {
            C0499r c0499r = f2295d;
            if (c0499r != null) {
                return c0499r;
            }
            C0499r c0499r2 = new C0499r(context);
            f2295d = c0499r2;
            return c0499r2;
        }
    }

    /* renamed from: a */
    public final synchronized GoogleSignInAccount m2445a() {
        return this.f2297b;
    }

    /* renamed from: b */
    public final synchronized GoogleSignInOptions m2446b() {
        return this.f2298c;
    }

    /* renamed from: d */
    public final synchronized void m2447d() {
        this.f2296a.m2421a();
        this.f2297b = null;
        this.f2298c = null;
    }

    /* renamed from: e */
    public final synchronized void m2448e(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f2296a.m2425f(googleSignInAccount, googleSignInOptions);
        this.f2297b = googleSignInAccount;
        this.f2298c = googleSignInOptions;
    }
}
