package p008a6;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p079f6.InterfaceC1853m;

/* renamed from: a6.c */
/* loaded from: classes.dex */
public class C0061c implements InterfaceC1853m {

    /* renamed from: h */
    public final Status f254h;

    /* renamed from: i */
    public final GoogleSignInAccount f255i;

    public C0061c(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f255i = googleSignInAccount;
        this.f254h = status;
    }

    /* renamed from: a */
    public GoogleSignInAccount m299a() {
        return this.f255i;
    }

    @Override // p079f6.InterfaceC1853m
    public Status getStatus() {
        return this.f254h;
    }
}
