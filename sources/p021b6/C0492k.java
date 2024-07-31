package p021b6;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import p008a6.C0061c;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p079f6.InterfaceC1853m;

/* renamed from: b6.k */
/* loaded from: classes.dex */
public final class C0492k extends AbstractC0497p {

    /* renamed from: a */
    public final /* synthetic */ Context f2290a;

    /* renamed from: b */
    public final /* synthetic */ GoogleSignInOptions f2291b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0492k(AbstractC1846f abstractC1846f, Context context, GoogleSignInOptions googleSignInOptions) {
        super(abstractC1846f);
        this.f2290a = context;
        this.f2291b = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ InterfaceC1853m createFailedResult(Status status) {
        return new C0061c(null, status);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.AbstractC1164a
    public final /* bridge */ /* synthetic */ void doExecute(C1841a.b bVar) {
        ((C0504w) ((C0490i) bVar).getService()).m2453g(new BinderC0491j(this), this.f2291b);
    }
}
