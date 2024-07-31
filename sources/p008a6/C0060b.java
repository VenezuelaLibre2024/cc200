package p008a6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import p021b6.C0498q;
import p064e6.C1673e;
import p064e6.C1683j;
import p079f6.AbstractC1845e;
import p096g6.C1998a;
import p096g6.InterfaceC2065t;
import p108h6.C2391r;
import p306v5.C5117a;

/* renamed from: a6.b */
/* loaded from: classes.dex */
public class C0060b extends AbstractC1845e<GoogleSignInOptions> {

    /* renamed from: a */
    public static final C0068j f252a = new C0068j(null);

    /* renamed from: b */
    public static int f253b = 1;

    public C0060b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, C5117a.f19346b, googleSignInOptions, (InterfaceC2065t) new C1998a());
    }

    public C0060b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C5117a.f19346b, googleSignInOptions, new AbstractC1845e.a.C6162a().m7586c(new C1998a()).m7584a());
    }

    /* renamed from: b */
    public Intent m295b() {
        Context applicationContext = getApplicationContext();
        int m298e = m298e();
        int i10 = m298e - 1;
        if (m298e != 0) {
            return i10 != 2 ? i10 != 3 ? C0498q.m2436b(applicationContext, getApiOptions()) : C0498q.m2437c(applicationContext, getApiOptions()) : C0498q.m2435a(applicationContext, getApiOptions());
        }
        throw null;
    }

    /* renamed from: c */
    public Task<Void> m296c() {
        return C2391r.m9607b(C0498q.m2440f(asGoogleApiClient(), getApplicationContext(), m298e() == 3));
    }

    /* renamed from: d */
    public Task<GoogleSignInAccount> m297d() {
        return C2391r.m9606a(C0498q.m2439e(asGoogleApiClient(), getApplicationContext(), getApiOptions(), m298e() == 3), f252a);
    }

    /* renamed from: e */
    public final synchronized int m298e() {
        int i10;
        i10 = f253b;
        if (i10 == 1) {
            Context applicationContext = getApplicationContext();
            C1673e m6693m = C1673e.m6693m();
            int mo6698h = m6693m.mo6698h(applicationContext, C1683j.f6269a);
            if (mo6698h == 0) {
                f253b = 4;
                i10 = 4;
            } else if (m6693m.mo6694b(applicationContext, mo6698h, null) != null || DynamiteModule.m4994a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                f253b = 2;
                i10 = 2;
            } else {
                f253b = 3;
                i10 = 3;
            }
        }
        return i10;
    }

    public Task<Void> signOut() {
        return C2391r.m9607b(C0498q.m2441g(asGoogleApiClient(), getApplicationContext(), m298e() == 3));
    }
}
