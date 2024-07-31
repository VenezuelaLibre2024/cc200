package p021b6;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p008a6.C0061c;

/* renamed from: b6.j */
/* loaded from: classes.dex */
public final class BinderC0491j extends BinderC0486e {

    /* renamed from: a */
    public final /* synthetic */ C0492k f2289a;

    public BinderC0491j(C0492k c0492k) {
        this.f2289a = c0492k;
    }

    @Override // p021b6.BinderC0486e, p021b6.InterfaceC0503v
    /* renamed from: w0 */
    public final void mo2430w0(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            C0492k c0492k = this.f2289a;
            C0499r.m2443c(c0492k.f2290a).m2448e(c0492k.f2291b, googleSignInAccount);
        }
        this.f2289a.setResult((C0492k) new C0061c(googleSignInAccount, status));
    }
}
