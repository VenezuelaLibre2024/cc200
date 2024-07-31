package p021b6;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import p074f1.AbstractC1800a;
import p079f6.AbstractC1846f;
import p091g1.C1959b;

/* renamed from: b6.a0 */
/* loaded from: classes.dex */
public final class C0482a0 implements AbstractC1800a.a {

    /* renamed from: a */
    public final /* synthetic */ SignInHubActivity f2276a;

    public /* synthetic */ C0482a0(SignInHubActivity signInHubActivity, C0507z c0507z) {
        this.f2276a = signInHubActivity;
    }

    @Override // p074f1.AbstractC1800a.a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2413a(C1959b c1959b, Object obj) {
        SignInHubActivity signInHubActivity = this.f2276a;
        signInHubActivity.setResult(SignInHubActivity.m4978h(signInHubActivity), SignInHubActivity.m4979i(signInHubActivity));
        this.f2276a.finish();
    }

    @Override // p074f1.AbstractC1800a.a
    /* renamed from: b */
    public final C1959b mo2414b(int i10, Bundle bundle) {
        return new C0488g(this.f2276a, AbstractC1846f.m7587c());
    }

    @Override // p074f1.AbstractC1800a.a
    /* renamed from: c */
    public final void mo2415c(C1959b c1959b) {
    }
}
