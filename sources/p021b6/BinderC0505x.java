package p021b6;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.C1162a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p008a6.C0060b;
import p207o6.C3947p;

/* renamed from: b6.x */
/* loaded from: classes.dex */
public final class BinderC0505x extends AbstractBinderC0500s {

    /* renamed from: a */
    public final Context f2299a;

    public BinderC0505x(Context context) {
        this.f2299a = context;
    }

    @Override // p021b6.InterfaceC0501t
    /* renamed from: D */
    public final void mo2449D() {
        m2454c();
        C0484c m2419b = C0484c.m2419b(this.f2299a);
        GoogleSignInAccount m2422c = m2419b.m2422c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f4426s;
        if (m2422c != null) {
            googleSignInOptions = m2419b.m2423d();
        }
        C0060b m4971a = C1162a.m4971a(this.f2299a, googleSignInOptions);
        if (m2422c != null) {
            m4971a.m296c();
        } else {
            m4971a.signOut();
        }
    }

    /* renamed from: c */
    public final void m2454c() {
        if (C3947p.m14967a(this.f2299a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // p021b6.InterfaceC0501t
    /* renamed from: n */
    public final void mo2450n() {
        m2454c();
        C0499r.m2443c(this.f2299a).m2447d();
    }
}
