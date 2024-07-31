package p021b6;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p108h6.C2394s;

/* renamed from: b6.c */
/* loaded from: classes.dex */
public class C0484c {

    /* renamed from: c */
    public static final Lock f2279c = new ReentrantLock();

    /* renamed from: d */
    public static C0484c f2280d;

    /* renamed from: a */
    public final Lock f2281a = new ReentrantLock();

    /* renamed from: b */
    public final SharedPreferences f2282b;

    @VisibleForTesting
    public C0484c(Context context) {
        this.f2282b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: b */
    public static C0484c m2419b(Context context) {
        C2394s.m9619l(context);
        Lock lock = f2279c;
        lock.lock();
        try {
            if (f2280d == null) {
                f2280d = new C0484c(context.getApplicationContext());
            }
            C0484c c0484c = f2280d;
            lock.unlock();
            return c0484c;
        } catch (Throwable th) {
            f2279c.unlock();
            throw th;
        }
    }

    /* renamed from: i */
    public static final String m2420i(String str, String str2) {
        return str + ":" + str2;
    }

    /* renamed from: a */
    public void m2421a() {
        this.f2281a.lock();
        try {
            this.f2282b.edit().clear().apply();
        } finally {
            this.f2281a.unlock();
        }
    }

    /* renamed from: c */
    public GoogleSignInAccount m2422c() {
        String m2426g;
        String m2426g2 = m2426g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m2426g2) || (m2426g = m2426g(m2420i("googleSignInAccount", m2426g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m4923R(m2426g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public GoogleSignInOptions m2423d() {
        String m2426g;
        String m2426g2 = m2426g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m2426g2) || (m2426g = m2426g(m2420i("googleSignInOptions", m2426g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m4939Q(m2426g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public String m2424e() {
        return m2426g("refreshToken");
    }

    /* renamed from: f */
    public void m2425f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C2394s.m9619l(googleSignInAccount);
        C2394s.m9619l(googleSignInOptions);
        m2427h("defaultGoogleSignInAccount", googleSignInAccount.m4933S());
        C2394s.m9619l(googleSignInAccount);
        C2394s.m9619l(googleSignInOptions);
        String m4933S = googleSignInAccount.m4933S();
        m2427h(m2420i("googleSignInAccount", m4933S), googleSignInAccount.m4934T());
        m2427h(m2420i("googleSignInOptions", m4933S), googleSignInOptions.m4957U());
    }

    /* renamed from: g */
    public final String m2426g(String str) {
        this.f2281a.lock();
        try {
            return this.f2282b.getString(str, null);
        } finally {
            this.f2281a.unlock();
        }
    }

    /* renamed from: h */
    public final void m2427h(String str, String str2) {
        this.f2281a.lock();
        try {
            this.f2282b.edit().putString(str, str2).apply();
        } finally {
            this.f2281a.unlock();
        }
    }
}
