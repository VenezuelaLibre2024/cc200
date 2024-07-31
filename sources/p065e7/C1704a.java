package p065e7;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import p021b6.C0484c;
import p049d7.InterfaceC1599f;
import p064e6.C1667b;
import p064e6.C1683j;
import p079f6.AbstractC1846f;
import p108h6.AbstractC2346c;
import p108h6.AbstractC2361h;
import p108h6.C2352e;
import p108h6.C2392r0;
import p108h6.C2394s;

/* renamed from: e7.a */
/* loaded from: classes.dex */
public class C1704a extends AbstractC2361h<C1710g> implements InterfaceC1599f {

    /* renamed from: l */
    public static final /* synthetic */ int f6297l = 0;

    /* renamed from: h */
    public final boolean f6298h;

    /* renamed from: i */
    public final C2352e f6299i;

    /* renamed from: j */
    public final Bundle f6300j;

    /* renamed from: k */
    public final Integer f6301k;

    public C1704a(Context context, Looper looper, boolean z10, C2352e c2352e, Bundle bundle, AbstractC1846f.a aVar, AbstractC1846f.b bVar) {
        super(context, looper, 44, c2352e, aVar, bVar);
        this.f6298h = true;
        this.f6299i = c2352e;
        this.f6300j = bundle;
        this.f6301k = c2352e.m9527i();
    }

    /* renamed from: c */
    public static Bundle m6755c(C2352e c2352e) {
        c2352e.m9526h();
        Integer m9527i = c2352e.m9527i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c2352e.m9519a());
        if (m9527i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", m9527i.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p049d7.InterfaceC1599f
    /* renamed from: a */
    public final void mo6432a(InterfaceC1709f interfaceC1709f) {
        C2394s.m9620m(interfaceC1709f, "Expecting a valid ISignInCallbacks");
        try {
            Account m9521c = this.f6299i.m9521c();
            ((C1710g) getService()).m6757c(new C1713j(1, new C2392r0(m9521c, ((Integer) C2394s.m9619l(this.f6301k)).intValue(), AbstractC2346c.DEFAULT_ACCOUNT.equals(m9521c.name) ? C0484c.m2419b(getContext()).m2422c() : null)), interfaceC1709f);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC1709f.mo6756w(new C1715l(1, new C1667b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // p049d7.InterfaceC1599f
    /* renamed from: b */
    public final void mo6433b() {
        connect(new AbstractC2346c.d());
    }

    @Override // p108h6.AbstractC2346c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C1710g ? (C1710g) queryLocalInterface : new C1710g(iBinder);
    }

    @Override // p108h6.AbstractC2346c
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f6299i.m9524f())) {
            this.f6300j.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f6299i.m9524f());
        }
        return this.f6300j;
    }

    @Override // p108h6.AbstractC2346c, p079f6.C1841a.f
    public final int getMinApkVersion() {
        return C1683j.f6269a;
    }

    @Override // p108h6.AbstractC2346c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p108h6.AbstractC2346c
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p108h6.AbstractC2346c, p079f6.C1841a.f
    public final boolean requiresSignIn() {
        return this.f6298h;
    }
}
